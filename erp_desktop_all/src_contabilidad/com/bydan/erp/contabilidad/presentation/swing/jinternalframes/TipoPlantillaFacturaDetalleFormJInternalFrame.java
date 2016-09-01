/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoPlantillaFacturaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class TipoPlantillaFacturaDetalleFormJInternalFrame extends TipoPlantillaFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPlantillaFactura;
	
	protected JMenuBar jmenuBarDetalleTipoPlantillaFactura;
	
	protected JMenu jmenuDetalleTipoPlantillaFactura;
	protected JMenu jmenuDetalleArchivoTipoPlantillaFactura;
	protected JMenu jmenuDetalleAccionesTipoPlantillaFactura;
	protected JMenu jmenuDetalleDatosTipoPlantillaFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPlantillaFactura;	
	protected GridBagConstraints gridBagConstraintsTipoPlantillaFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPlantillaFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPlantillaFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPlantillaFacturaSessionBean tipoplantillafacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoPlantillaFacturaLogic tipoplantillafacturaLogic;
	
	public JScrollPane jScrollPanelDatosTipoPlantillaFactura;
	public JScrollPane jScrollPanelDatosEdicionTipoPlantillaFactura;
	public JScrollPane jScrollPanelDatosGeneralTipoPlantillaFactura;
	
	protected JPanel jPanelCamposTipoPlantillaFactura;    
	protected JPanel jPanelCamposOcultosTipoPlantillaFactura;    	
	protected JPanel jPanelAccionesTipoPlantillaFactura;
	protected JPanel jPanelAccionesFormularioTipoPlantillaFactura;
    
	
	
	protected Integer iXPanelCamposTipoPlantillaFactura=0;
	protected Integer iYPanelCamposTipoPlantillaFactura=0;
	
	protected Integer iXPanelCamposOcultosTipoPlantillaFactura=0;
	protected Integer iYPanelCamposOcultosTipoPlantillaFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPlantillaFactura;
	public JButton jButtonModificarTipoPlantillaFactura;
	public JButton jButtonActualizarTipoPlantillaFactura;
    public JButton jButtonEliminarTipoPlantillaFactura;
	public JButton jButtonCancelarTipoPlantillaFactura;
    public JButton jButtonGuardarCambiosTipoPlantillaFactura;
	public JButton jButtonGuardarCambiosTablaTipoPlantillaFactura;
	protected JButton jButtonCerrarTipoPlantillaFactura;
	
	
	protected JButton jButtonProcesarInformacionTipoPlantillaFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPlantillaFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPlantillaFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPlantillaFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPlantillaFactura;
	protected JButton jButtonModificarToolBarTipoPlantillaFactura;
	protected JButton jButtonActualizarToolBarTipoPlantillaFactura;
    protected JButton jButtonEliminarToolBarTipoPlantillaFactura;
	protected JButton jButtonCancelarToolBarTipoPlantillaFactura;
    protected JButton jButtonGuardarCambiosToolBarTipoPlantillaFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPlantillaFactura;
	protected JButton jButtonCerrarToolBarTipoPlantillaFactura;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPlantillaFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPlantillaFactura;
	protected JMenuItem jMenuItemModificarTipoPlantillaFactura;
	protected JMenuItem jMenuItemActualizarTipoPlantillaFactura;
    protected JMenuItem jMenuItemEliminarTipoPlantillaFactura;
	protected JMenuItem jMenuItemCancelarTipoPlantillaFactura;
    protected JMenuItem jMenuItemGuardarCambiosTipoPlantillaFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPlantillaFactura;
	protected JMenuItem jMenuItemCerrarTipoPlantillaFactura;
	protected JMenuItem jMenuItemDetalleCerrarTipoPlantillaFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPlantillaFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPlantillaFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPlantillaFactura;
	protected JMenuItem jMenuItemMostrarOcultarTipoPlantillaFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPlantillaFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPlantillaFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPlantillaFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPlantillaFactura;
	public JLabel jLabelIdTipoPlantillaFactura;
	public JLabel jLabelidTipoPlantillaFactura;
	public JButton jButtonidTipoPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPlantillaFactura;
	public JLabel jLabelcodigoTipoPlantillaFactura;
	public JTextField jTextFieldcodigoTipoPlantillaFactura;
	public JButton jButtoncodigoTipoPlantillaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPlantillaFactura;
	public JLabel jLabelnombreTipoPlantillaFactura;
	public JTextArea jTextAreanombreTipoPlantillaFactura;
	public JScrollPane jscrollPanenombreTipoPlantillaFactura;
	public JButton jButtonnombreTipoPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPlantillaFactura;
	public JLabel jLabelid_empresaTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPlantillaFactura;
	public JButton jButtonid_empresaTipoPlantillaFactura= new JButtonMe();
	public JButton jButtonid_empresaTipoPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPlantillaFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPlantillaFactura;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPlantillaFactura=new JPanel();
				this.jPanelAccionesFormularioTipoPlantillaFactura=new JPanel();
				this.jmenuBarDetalleTipoPlantillaFactura=new JMenuBar();
				this.jTtoolBarDetalleTipoPlantillaFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPlantillaFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarTipoPlantillaFactura() {
		return this.jButtonActualizarToolBarTipoPlantillaFactura;
	}
	
	public JButton getjButtonEliminarToolBarTipoPlantillaFactura() {
		return this.jButtonEliminarToolBarTipoPlantillaFactura;
	}
	
	public JButton getjButtonCancelarToolBarTipoPlantillaFactura() {
		return this.jButtonCancelarToolBarTipoPlantillaFactura;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPlantillaFactura() {
		return this.jButtonProcesarInformacionTipoPlantillaFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPlantillaFactura)	{
		this.jButtonProcesarInformacionTipoPlantillaFactura = jButtonProcesarInformacionTipoPlantillaFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPlantillaFactura() {
		return this.jComboBoxTiposAccionesTipoPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPlantillaFactura(
			JComboBox jComboBoxTiposRelacionesTipoPlantillaFactura) {
		this.jComboBoxTiposRelacionesTipoPlantillaFactura = jComboBoxTiposRelacionesTipoPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPlantillaFactura(
			JComboBox jComboBoxTiposAccionesTipoPlantillaFactura) {
		this.jComboBoxTiposAccionesTipoPlantillaFactura = jComboBoxTiposAccionesTipoPlantillaFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPlantillaFactura() {
		return this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPlantillaFactura(
			JComboBox jComboBoxTiposAccionesFormularioTipoPlantillaFactura) {
		this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura = jComboBoxTiposAccionesFormularioTipoPlantillaFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		
		this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoplantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPlantillaFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Plantilla Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		TipoPlantillaFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPlantillaFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPlantillaFactura=new JButtonMe();
				this.jButtonModificarToolBarTipoPlantillaFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura,
							"actualizar","actualizar","Actualizar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura,
							"eliminar","eliminar","Eliminar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura,
							"cancelar","cancelar","Cancelar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPlantillaFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPlantillaFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPlantillaFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPlantillaFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPlantillaFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPlantillaFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPlantillaFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPlantillaFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPlantillaFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPlantillaFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPlantillaFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPlantillaFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPlantillaFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPlantillaFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPlantillaFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPlantillaFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPlantillaFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPlantillaFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPlantillaFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPlantillaFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPlantillaFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPlantillaFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPlantillaFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPlantillaFactura.add(this.jMenuItemDetalleCerrarTipoPlantillaFactura);
		
		this.jmenuDetalleAccionesTipoPlantillaFactura.add(this.jMenuItemActualizarTipoPlantillaFactura);
		this.jmenuDetalleAccionesTipoPlantillaFactura.add(this.jMenuItemEliminarTipoPlantillaFactura);
		this.jmenuDetalleAccionesTipoPlantillaFactura.add(this.jMenuItemCancelarTipoPlantillaFactura);		
		
		//this.jmenuDetalleDatosTipoPlantillaFactura.add(this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura);				
		this.jmenuDetalleDatosTipoPlantillaFactura.add(this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura);				
				
		//this.jmenuDetalleAccionesTipoPlantillaFactura.add(this.jMenuItemGuardarCambiosTipoPlantillaFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPlantillaFactura.add(this.jmenuDetalleArchivoTipoPlantillaFactura);		
		this.jmenuBarDetalleTipoPlantillaFactura.add(this.jmenuDetalleAccionesTipoPlantillaFactura);		
		this.jmenuBarDetalleTipoPlantillaFactura.add(this.jmenuDetalleDatosTipoPlantillaFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPlantillaFactura);				
	}
	
	
	public void inicializarElementosCamposTipoPlantillaFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPlantillaFactura = new JLabelMe();
		jLabelIdTipoPlantillaFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPlantillaFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPlantillaFactura.setToolTipText(TipoPlantillaFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPlantillaFactura= new GridBagLayout();

		this.jPanelidTipoPlantillaFactura.setLayout(this.gridaBagLayoutTipoPlantillaFactura);

		jLabelidTipoPlantillaFactura = new JLabel();
		jLabelidTipoPlantillaFactura.setText("Id");

		jLabelidTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPlantillaFactura = new JLabelMe();
		this.jLabelcodigoTipoPlantillaFactura.setText(""+TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPlantillaFactura.setToolTipText("Codigo");
		this.jLabelcodigoTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPlantillaFactura.setToolTipText(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPlantillaFactura = new GridBagLayout();
		this.jPanelcodigoTipoPlantillaFactura.setLayout(this.gridaBagLayoutTipoPlantillaFactura);


		jTextFieldcodigoTipoPlantillaFactura= new JTextFieldMe();

		jTextFieldcodigoTipoPlantillaFactura.setEnabled(false);
		jTextFieldcodigoTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPlantillaFacturaBusqueda.setText("U");
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPlantillaFacturaBusqueda"));

		if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPlantillaFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPlantillaFactura = new JLabelMe();
		this.jLabelnombreTipoPlantillaFactura.setText(""+TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPlantillaFactura.setToolTipText("Nombre");
		this.jLabelnombreTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPlantillaFactura.setToolTipText(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPlantillaFactura = new GridBagLayout();
		this.jPanelnombreTipoPlantillaFactura.setLayout(this.gridaBagLayoutTipoPlantillaFactura);


		jTextAreanombreTipoPlantillaFactura= new JTextAreaMe();
		jTextAreanombreTipoPlantillaFactura.setEnabled(false);
		jTextAreanombreTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPlantillaFactura.setLineWrap(true);
		jTextAreanombreTipoPlantillaFactura.setWrapStyleWord(true);
		jTextAreanombreTipoPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPlantillaFactura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPlantillaFactura = new JScrollPane(jTextAreanombreTipoPlantillaFactura);
		jscrollPanenombreTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPlantillaFacturaBusqueda.setText("U");
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPlantillaFacturaBusqueda"));

		if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPlantillaFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPlantillaFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPlantillaFactura = new JLabelMe();
		this.jLabelid_empresaTipoPlantillaFactura.setText(""+TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPlantillaFactura.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPlantillaFactura.setToolTipText(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPlantillaFactura = new GridBagLayout();
		this.jPanelid_empresaTipoPlantillaFactura.setLayout(this.gridaBagLayoutTipoPlantillaFactura);


		jComboBoxid_empresaTipoPlantillaFactura= new JComboBoxMe();
		jComboBoxid_empresaTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPlantillaFactura.setEnabled(false);

		this.jButtonid_empresaTipoPlantillaFactura= new JButtonMe();
		this.jButtonid_empresaTipoPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPlantillaFactura.setText("Buscar");
		this.jButtonid_empresaTipoPlantillaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPlantillaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPlantillaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPlantillaFactura"));

		this.jButtonid_empresaTipoPlantillaFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setText("U");
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPlantillaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPlantillaFacturaBusqueda"));

		if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPlantillaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPlantillaFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPlantillaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPlantillaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPlantillaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPlantillaFacturaUpdate.setText("U");
		this.jButtonid_empresaTipoPlantillaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPlantillaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPlantillaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPlantillaFacturaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTipoPlantillaFactura = new TipoPlantillaFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Plantilla Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPlantillaFactura= new GridBagLayout();
		

		
		String sToolTipTipoPlantillaFactura="";
		sToolTipTipoPlantillaFactura=TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPlantillaFactura+="(Contabilidad.TipoPlantillaFactura)";
		}
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPlantillaFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPlantillaFactura = new JButtonMe();
		this.jButtonModificarTipoPlantillaFactura = new JButtonMe();
        this.jButtonActualizarTipoPlantillaFactura = new JButtonMe();
        this.jButtonEliminarTipoPlantillaFactura = new JButtonMe();
        this.jButtonCancelarTipoPlantillaFactura = new JButtonMe();
        this.jButtonGuardarCambiosTipoPlantillaFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura = new JButtonMe();
		this.jButtonCerrarTipoPlantillaFactura = new JButtonMe();
		
		this.jScrollPanelDatosTipoPlantillaFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPlantillaFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPlantillaFactura = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Plantilla Factura";
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPlantillaFactura.setName("jPanelCamposTipoPlantillaFactura"); 

		this.jPanelCamposOcultosTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPlantillaFactura.setName("jPanelCamposOcultosTipoPlantillaFactura"); 

        this.jPanelAccionesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesTipoPlantillaFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPlantillaFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPlantillaFactura.setText("Nuevo");
		this.jButtonModificarTipoPlantillaFactura.setText("Editar");
        this.jButtonActualizarTipoPlantillaFactura.setText("Actualizar");
        this.jButtonEliminarTipoPlantillaFactura.setText("Eliminar");
        this.jButtonCancelarTipoPlantillaFactura.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPlantillaFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setText("Guardar");
		this.jButtonCerrarTipoPlantillaFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPlantillaFactura,"nuevo_button","Nuevo",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPlantillaFactura,"modificar_button","Editar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPlantillaFactura,"actualizar_button","Actualizar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPlantillaFactura,"eliminar_button","Eliminar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPlantillaFactura,"cancelar_button","Cancelar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPlantillaFactura,"guardarcambios_button","Guardar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPlantillaFactura,"guardarcambiostabla_button","Guardar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPlantillaFactura,"cerrar_button","Salir",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPlantillaFactura.setToolTipText("Nuevo"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPlantillaFactura.setToolTipText("Editar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPlantillaFactura.setToolTipText("Actualizar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPlantillaFactura.setToolTipText("Eliminar)"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPlantillaFactura.setToolTipText("Cancelar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPlantillaFactura.setToolTipText("Guardar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setToolTipText("Guardar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPlantillaFactura.setToolTipText("Salir"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoTipoPlantillaFactura";
		inputMap = this.jButtonNuevoTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPlantillaFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPlantillaFactura";
		inputMap = this.jButtonActualizarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPlantillaFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPlantillaFactura";
		inputMap = this.jButtonEliminarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPlantillaFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPlantillaFactura";
		inputMap = this.jButtonCancelarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPlantillaFactura"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPlantillaFactura";
		inputMap = this.jButtonCerrarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPlantillaFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPlantillaFactura";
		inputMap = this.jButtonGuardarCambiosTablaTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPlantillaFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPlantillaFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPlantillaFactura.setToolTipText("Nuevo TipoPlantillaFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura.setToolTipText("Sin Cerrar Ventana TipoPlantillaFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPlantillaFactura.setText("Accion");
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPlantillaFactura = new JLabelMe();
		
		this.jLabelAccionesTipoPlantillaFactura.setText("Acciones");		
		this.jLabelAccionesTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPlantillaFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPlantillaFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPlantillaFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPlantillaFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPlantillaFactura = new GridBagLayout();
		
		this.jPanelCamposTipoPlantillaFactura.setLayout(gridaBagLayoutCamposTipoPlantillaFactura);
		this.jPanelCamposOcultosTipoPlantillaFactura.setLayout(gridaBagLayoutCamposOcultosTipoPlantillaFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPlantillaFactura.add(jLabelIdTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 1;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPlantillaFactura.add(jLabelidTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);


	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPlantillaFactura.add(jLabelid_empresaTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 2;
		this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPlantillaFactura.add(jButtonid_empresaTipoPlantillaFacturaBusqueda, this.gridBagConstraintsTipoPlantillaFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 3;
		this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPlantillaFactura.add(jButtonid_empresaTipoPlantillaFacturaUpdate, this.gridBagConstraintsTipoPlantillaFactura);
	}

	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 1;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPlantillaFactura.add(jComboBoxid_empresaTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);


	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPlantillaFactura.add(jLabelcodigoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 2;
		this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPlantillaFactura.add(jButtoncodigoTipoPlantillaFacturaBusqueda, this.gridBagConstraintsTipoPlantillaFactura);
	}

	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 1;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPlantillaFactura.add(jTextFieldcodigoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);


	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPlantillaFactura.add(jLabelnombreTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 2;
		this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
		this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPlantillaFactura.add(jButtonnombreTipoPlantillaFacturaBusqueda, this.gridBagConstraintsTipoPlantillaFactura);
	}

	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = 1;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPlantillaFactura.add(jscrollPanenombreTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = iYPanelCamposTipoPlantillaFactura;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = iXPanelCamposTipoPlantillaFactura++;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPlantillaFactura.add(this.jPanelidTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(iXPanelCamposTipoPlantillaFactura % 1==0) {
		iXPanelCamposTipoPlantillaFactura=0;
		iYPanelCamposTipoPlantillaFactura++;
	}
	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = iYPanelCamposTipoPlantillaFactura;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = iXPanelCamposTipoPlantillaFactura++;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPlantillaFactura.add(this.jPanelcodigoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(iXPanelCamposTipoPlantillaFactura % 1==0) {
		iXPanelCamposTipoPlantillaFactura=0;
		iYPanelCamposTipoPlantillaFactura++;
	}
	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = iYPanelCamposTipoPlantillaFactura;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = iXPanelCamposTipoPlantillaFactura++;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPlantillaFactura.add(this.jPanelnombreTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(iXPanelCamposTipoPlantillaFactura % 1==0) {
		iXPanelCamposTipoPlantillaFactura=0;
		iYPanelCamposTipoPlantillaFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPlantillaFactura.gridy = iYPanelCamposOcultosTipoPlantillaFactura;
	this.gridBagConstraintsTipoPlantillaFactura.gridx = iXPanelCamposOcultosTipoPlantillaFactura++;
	this.gridBagConstraintsTipoPlantillaFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPlantillaFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPlantillaFactura.add(this.jPanelid_empresaTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);



	if(iXPanelCamposOcultosTipoPlantillaFactura % 1==0) {
		iXPanelCamposOcultosTipoPlantillaFactura=0;
		iYPanelCamposOcultosTipoPlantillaFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesTipoPlantillaFactura.setLayout(gridaBagLayoutAccionesTipoPlantillaFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPlantillaFactura.setLayout(gridaBagLayoutAccionesFormularioTipoPlantillaFactura);
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPlantillaFactura.add(this.jComboBoxTiposAccionesFormularioTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPlantillaFactura.add(this.jCheckBoxPostAccionNuevoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPlantillaFactura.add(this.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPlantillaFactura.add(this.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonModificarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);							

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonEliminarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonActualizarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);


		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonGuardarCambiosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);	
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonCancelarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPlantillaFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPlantillaFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();						
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;		
			//this.gridBagConstraintsTipoPlantillaFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPlantillaFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPlantillaFactura.gridx =0;
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPlantillaFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPlantillaFactura = new TipoPlantillaFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Plantilla Factura DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Tipo Plantilla Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Plantilla Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPlantillaFacturaModel tipoplantillafacturaModel=new TipoPlantillaFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPlantillaFacturaModel.TipoPlantillaFacturaFocusTraversalPolicy tipoplantillafacturaFocusTraversalPolicy = tipoplantillafacturaModel.new TipoPlantillaFacturaFocusTraversalPolicy(this);
			
			//tipoplantillafacturaFocusTraversalPolicy.settipoplantillafacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoplantillafacturaModel);
			
			
			this.jContentPaneDetalleTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPlantillaFactura = new GridBagLayout();	
			this.jContentPaneDetalleTipoPlantillaFactura.setLayout(gridaBagLayoutDetalleTipoPlantillaFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPlantillaFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPlantillaFactura.add(jTtoolBarDetalleTipoPlantillaFactura, gridBagConstraintsTipoPlantillaFactura);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPlantillaFactura=   new JScrollPane(jContentPaneDetalleTipoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPlantillaFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	        
			this.jContentPaneDetalleTipoPlantillaFactura.add(jPanelCamposTipoPlantillaFactura, gridBagConstraintsTipoPlantillaFactura);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoplantillafacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPlantillaFactura= new GridBagConstraints();
						this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
						this.jContentPaneDetalleTipoPlantillaFactura.add(this.jTabbedPaneRelacionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPlantillaFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPlantillaFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
					this.gridBagConstraintsTipoPlantillaFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPlantillaFactura.add(jPanelCamposOcultosTipoPlantillaFactura, gridBagConstraintsTipoPlantillaFactura);
				
					this.jPanelCamposOcultosTipoPlantillaFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	        this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPlantillaFactura.add(this.jPanelAccionesFormularioTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);							
			
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
	        this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPlantillaFactura.add(this.jPanelAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPlantillaFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPlantillaFactura=   new JScrollPane(this.jPanelCamposTipoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPlantillaFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPlantillaFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPlantillaFactura;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
