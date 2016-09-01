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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoFormaPagoInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoFormaPagoInvenDetalleFormJInternalFrame extends TipoFormaPagoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFormaPagoInven;
	
	protected JMenuBar jmenuBarDetalleTipoFormaPagoInven;
	
	protected JMenu jmenuDetalleTipoFormaPagoInven;
	protected JMenu jmenuDetalleArchivoTipoFormaPagoInven;
	protected JMenu jmenuDetalleAccionesTipoFormaPagoInven;
	protected JMenu jmenuDetalleDatosTipoFormaPagoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormaPagoInven;	
	protected GridBagConstraints gridBagConstraintsTipoFormaPagoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFormaPagoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFormaPagoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFormaPagoInvenSessionBean tipoformapagoinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoFormaPagoInvenLogic tipoformapagoinvenLogic;
	
	public JScrollPane jScrollPanelDatosTipoFormaPagoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoFormaPagoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoFormaPagoInven;
	
	protected JPanel jPanelCamposTipoFormaPagoInven;    
	protected JPanel jPanelCamposOcultosTipoFormaPagoInven;    	
	protected JPanel jPanelAccionesTipoFormaPagoInven;
	protected JPanel jPanelAccionesFormularioTipoFormaPagoInven;
    
	
	
	protected Integer iXPanelCamposTipoFormaPagoInven=0;
	protected Integer iYPanelCamposTipoFormaPagoInven=0;
	
	protected Integer iXPanelCamposOcultosTipoFormaPagoInven=0;
	protected Integer iYPanelCamposOcultosTipoFormaPagoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFormaPagoInven;
	public JButton jButtonModificarTipoFormaPagoInven;
	public JButton jButtonActualizarTipoFormaPagoInven;
    public JButton jButtonEliminarTipoFormaPagoInven;
	public JButton jButtonCancelarTipoFormaPagoInven;
    public JButton jButtonGuardarCambiosTipoFormaPagoInven;
	public JButton jButtonGuardarCambiosTablaTipoFormaPagoInven;
	protected JButton jButtonCerrarTipoFormaPagoInven;
	
	
	protected JButton jButtonProcesarInformacionTipoFormaPagoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFormaPagoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFormaPagoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFormaPagoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormaPagoInven;
	protected JButton jButtonModificarToolBarTipoFormaPagoInven;
	protected JButton jButtonActualizarToolBarTipoFormaPagoInven;
    protected JButton jButtonEliminarToolBarTipoFormaPagoInven;
	protected JButton jButtonCancelarToolBarTipoFormaPagoInven;
    protected JButton jButtonGuardarCambiosToolBarTipoFormaPagoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormaPagoInven;
	protected JButton jButtonCerrarToolBarTipoFormaPagoInven;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFormaPagoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormaPagoInven;
	protected JMenuItem jMenuItemModificarTipoFormaPagoInven;
	protected JMenuItem jMenuItemActualizarTipoFormaPagoInven;
    protected JMenuItem jMenuItemEliminarTipoFormaPagoInven;
	protected JMenuItem jMenuItemCancelarTipoFormaPagoInven;
    protected JMenuItem jMenuItemGuardarCambiosTipoFormaPagoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormaPagoInven;
	protected JMenuItem jMenuItemCerrarTipoFormaPagoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormaPagoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormaPagoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFormaPagoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormaPagoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormaPagoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormaPagoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormaPagoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFormaPagoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFormaPagoInven;
	public JLabel jLabelIdTipoFormaPagoInven;
	public JLabel jLabelidTipoFormaPagoInven;
	public JButton jButtonidTipoFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoFormaPagoInven;
	public JLabel jLabelcodigoTipoFormaPagoInven;
	public JTextField jTextFieldcodigoTipoFormaPagoInven;
	public JButton jButtoncodigoTipoFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFormaPagoInven;
	public JLabel jLabelnombreTipoFormaPagoInven;
	public JTextArea jTextAreanombreTipoFormaPagoInven;
	public JScrollPane jscrollPanenombreTipoFormaPagoInven;
	public JButton jButtonnombreTipoFormaPagoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoFormaPagoInven;
	public JLabel jLabelid_empresaTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoFormaPagoInven;
	public JButton jButtonid_empresaTipoFormaPagoInven= new JButtonMe();
	public JButton jButtonid_empresaTipoFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoFormaPagoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFormaPagoInven;
	
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
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFormaPagoInven=new JPanel();
				this.jPanelAccionesFormularioTipoFormaPagoInven=new JPanel();
				this.jmenuBarDetalleTipoFormaPagoInven=new JMenuBar();
				this.jTtoolBarDetalleTipoFormaPagoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFormaPagoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFormaPagoInven() {
		return this.jButtonActualizarToolBarTipoFormaPagoInven;
	}
	
	public JButton getjButtonEliminarToolBarTipoFormaPagoInven() {
		return this.jButtonEliminarToolBarTipoFormaPagoInven;
	}
	
	public JButton getjButtonCancelarToolBarTipoFormaPagoInven() {
		return this.jButtonCancelarToolBarTipoFormaPagoInven;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFormaPagoInven() {
		return this.jButtonProcesarInformacionTipoFormaPagoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormaPagoInven)	{
		this.jButtonProcesarInformacionTipoFormaPagoInven = jButtonProcesarInformacionTipoFormaPagoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormaPagoInven() {
		return this.jComboBoxTiposAccionesTipoFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormaPagoInven(
			JComboBox jComboBoxTiposRelacionesTipoFormaPagoInven) {
		this.jComboBoxTiposRelacionesTipoFormaPagoInven = jComboBoxTiposRelacionesTipoFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormaPagoInven(
			JComboBox jComboBoxTiposAccionesTipoFormaPagoInven) {
		this.jComboBoxTiposAccionesTipoFormaPagoInven = jComboBoxTiposAccionesTipoFormaPagoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFormaPagoInven() {
		return this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFormaPagoInven(
			JComboBox jComboBoxTiposAccionesFormularioTipoFormaPagoInven) {
		this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven = jComboBoxTiposAccionesFormularioTipoFormaPagoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		
		this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormaPagoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Forma Pago Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFormaPagoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFormaPagoInven=new JButtonMe();
				this.jButtonModificarToolBarTipoFormaPagoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven,
							"actualizar","actualizar","Actualizar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven,
							"eliminar","eliminar","Eliminar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven,
							"cancelar","cancelar","Cancelar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFormaPagoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFormaPagoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFormaPagoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFormaPagoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFormaPagoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormaPagoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormaPagoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormaPagoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFormaPagoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFormaPagoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFormaPagoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFormaPagoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFormaPagoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFormaPagoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFormaPagoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFormaPagoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFormaPagoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFormaPagoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFormaPagoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFormaPagoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFormaPagoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormaPagoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormaPagoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFormaPagoInven.add(this.jMenuItemDetalleCerrarTipoFormaPagoInven);
		
		this.jmenuDetalleAccionesTipoFormaPagoInven.add(this.jMenuItemActualizarTipoFormaPagoInven);
		this.jmenuDetalleAccionesTipoFormaPagoInven.add(this.jMenuItemEliminarTipoFormaPagoInven);
		this.jmenuDetalleAccionesTipoFormaPagoInven.add(this.jMenuItemCancelarTipoFormaPagoInven);		
		
		//this.jmenuDetalleDatosTipoFormaPagoInven.add(this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven);				
		this.jmenuDetalleDatosTipoFormaPagoInven.add(this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven);				
				
		//this.jmenuDetalleAccionesTipoFormaPagoInven.add(this.jMenuItemGuardarCambiosTipoFormaPagoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFormaPagoInven.add(this.jmenuDetalleArchivoTipoFormaPagoInven);		
		this.jmenuBarDetalleTipoFormaPagoInven.add(this.jmenuDetalleAccionesTipoFormaPagoInven);		
		this.jmenuBarDetalleTipoFormaPagoInven.add(this.jmenuDetalleDatosTipoFormaPagoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFormaPagoInven);				
	}
	
	
	public void inicializarElementosCamposTipoFormaPagoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFormaPagoInven = new JLabelMe();
		jLabelIdTipoFormaPagoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFormaPagoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFormaPagoInven.setToolTipText(TipoFormaPagoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFormaPagoInven= new GridBagLayout();

		this.jPanelidTipoFormaPagoInven.setLayout(this.gridaBagLayoutTipoFormaPagoInven);

		jLabelidTipoFormaPagoInven = new JLabel();
		jLabelidTipoFormaPagoInven.setText("Id");

		jLabelidTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoFormaPagoInven = new JLabelMe();
		this.jLabelcodigoTipoFormaPagoInven.setText(""+TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoFormaPagoInven.setToolTipText("Codigo");
		this.jLabelcodigoTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoFormaPagoInven.setToolTipText(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoFormaPagoInven = new GridBagLayout();
		this.jPanelcodigoTipoFormaPagoInven.setLayout(this.gridaBagLayoutTipoFormaPagoInven);


		jTextFieldcodigoTipoFormaPagoInven= new JTextFieldMe();

		jTextFieldcodigoTipoFormaPagoInven.setEnabled(false);
		jTextFieldcodigoTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoFormaPagoInvenBusqueda.setText("U");
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoFormaPagoInvenBusqueda"));

		if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoFormaPagoInven = new JLabelMe();
		this.jLabelnombreTipoFormaPagoInven.setText(""+TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFormaPagoInven.setToolTipText("Nombre");
		this.jLabelnombreTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFormaPagoInven.setToolTipText(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFormaPagoInven = new GridBagLayout();
		this.jPanelnombreTipoFormaPagoInven.setLayout(this.gridaBagLayoutTipoFormaPagoInven);


		jTextAreanombreTipoFormaPagoInven= new JTextAreaMe();
		jTextAreanombreTipoFormaPagoInven.setEnabled(false);
		jTextAreanombreTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPagoInven.setLineWrap(true);
		jTextAreanombreTipoFormaPagoInven.setWrapStyleWord(true);
		jTextAreanombreTipoFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFormaPagoInven.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFormaPagoInven = new JScrollPane(jTextAreanombreTipoFormaPagoInven);
		jscrollPanenombreTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFormaPagoInvenBusqueda.setText("U");
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFormaPagoInvenBusqueda"));

		if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFormaPagoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFormaPagoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoFormaPagoInven = new JLabelMe();
		this.jLabelid_empresaTipoFormaPagoInven.setText(""+TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoFormaPagoInven.setToolTipText("Empresa");
		this.jLabelid_empresaTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoFormaPagoInven.setToolTipText(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoFormaPagoInven = new GridBagLayout();
		this.jPanelid_empresaTipoFormaPagoInven.setLayout(this.gridaBagLayoutTipoFormaPagoInven);


		jComboBoxid_empresaTipoFormaPagoInven= new JComboBoxMe();
		jComboBoxid_empresaTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoFormaPagoInven.setEnabled(false);

		this.jButtonid_empresaTipoFormaPagoInven= new JButtonMe();
		this.jButtonid_empresaTipoFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPagoInven.setText("Buscar");
		this.jButtonid_empresaTipoFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPagoInven"));

		this.jButtonid_empresaTipoFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPagoInvenBusqueda"));

		if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaTipoFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormaPagoInvenUpdate.setText("U");
		this.jButtonid_empresaTipoFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPagoInvenUpdate"));



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
		//this.jInternalFrameDetalleTipoFormaPagoInven = new TipoFormaPagoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Forma Pago Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormaPagoInven= new GridBagLayout();
		

		
		String sToolTipTipoFormaPagoInven="";
		sToolTipTipoFormaPagoInven=TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormaPagoInven+="(Inventario.TipoFormaPagoInven)";
		}
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormaPagoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFormaPagoInven = new JButtonMe();
		this.jButtonModificarTipoFormaPagoInven = new JButtonMe();
        this.jButtonActualizarTipoFormaPagoInven = new JButtonMe();
        this.jButtonEliminarTipoFormaPagoInven = new JButtonMe();
        this.jButtonCancelarTipoFormaPagoInven = new JButtonMe();
        this.jButtonGuardarCambiosTipoFormaPagoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven = new JButtonMe();
		this.jButtonCerrarTipoFormaPagoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormaPagoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFormaPagoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFormaPagoInven = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Forma Pago Inven";
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFormaPagoInven.setName("jPanelCamposTipoFormaPagoInven"); 

		this.jPanelCamposOcultosTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFormaPagoInven.setName("jPanelCamposOcultosTipoFormaPagoInven"); 

        this.jPanelAccionesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormaPagoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFormaPagoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFormaPagoInven.setText("Nuevo");
		this.jButtonModificarTipoFormaPagoInven.setText("Editar");
        this.jButtonActualizarTipoFormaPagoInven.setText("Actualizar");
        this.jButtonEliminarTipoFormaPagoInven.setText("Eliminar");
        this.jButtonCancelarTipoFormaPagoInven.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFormaPagoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setText("Guardar");
		this.jButtonCerrarTipoFormaPagoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormaPagoInven,"nuevo_button","Nuevo",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFormaPagoInven,"modificar_button","Editar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFormaPagoInven,"actualizar_button","Actualizar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFormaPagoInven,"eliminar_button","Eliminar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFormaPagoInven,"cancelar_button","Cancelar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFormaPagoInven,"guardarcambios_button","Guardar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormaPagoInven,"guardarcambiostabla_button","Guardar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormaPagoInven,"cerrar_button","Salir",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFormaPagoInven.setToolTipText("Nuevo"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFormaPagoInven.setToolTipText("Editar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFormaPagoInven.setToolTipText("Actualizar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFormaPagoInven.setToolTipText("Eliminar)"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFormaPagoInven.setToolTipText("Cancelar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFormaPagoInven.setToolTipText("Guardar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setToolTipText("Guardar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormaPagoInven.setToolTipText("Salir"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormaPagoInven";
		inputMap = this.jButtonNuevoTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormaPagoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFormaPagoInven";
		inputMap = this.jButtonActualizarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFormaPagoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFormaPagoInven";
		inputMap = this.jButtonEliminarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFormaPagoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFormaPagoInven";
		inputMap = this.jButtonCancelarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFormaPagoInven"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFormaPagoInven";
		inputMap = this.jButtonCerrarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormaPagoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormaPagoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormaPagoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFormaPagoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFormaPagoInven.setToolTipText("Nuevo TipoFormaPagoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven.setToolTipText("Sin Cerrar Ventana TipoFormaPagoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormaPagoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFormaPagoInven = new JLabelMe();
		
		this.jLabelAccionesTipoFormaPagoInven.setText("Acciones");		
		this.jLabelAccionesTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFormaPagoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFormaPagoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFormaPagoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFormaPagoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFormaPagoInven = new GridBagLayout();
		
		this.jPanelCamposTipoFormaPagoInven.setLayout(gridaBagLayoutCamposTipoFormaPagoInven);
		this.jPanelCamposOcultosTipoFormaPagoInven.setLayout(gridaBagLayoutCamposOcultosTipoFormaPagoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFormaPagoInven.add(jLabelIdTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 1;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFormaPagoInven.add(jLabelidTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);


	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoFormaPagoInven.add(jLabelid_empresaTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 2;
		this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormaPagoInven.add(jButtonid_empresaTipoFormaPagoInvenBusqueda, this.gridBagConstraintsTipoFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 3;
		this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormaPagoInven.add(jButtonid_empresaTipoFormaPagoInvenUpdate, this.gridBagConstraintsTipoFormaPagoInven);
	}

	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 1;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoFormaPagoInven.add(jComboBoxid_empresaTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);


	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoFormaPagoInven.add(jLabelcodigoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 2;
		this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoFormaPagoInven.add(jButtoncodigoTipoFormaPagoInvenBusqueda, this.gridBagConstraintsTipoFormaPagoInven);
	}

	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 1;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoFormaPagoInven.add(jTextFieldcodigoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);


	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFormaPagoInven.add(jLabelnombreTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 2;
		this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFormaPagoInven.add(jButtonnombreTipoFormaPagoInvenBusqueda, this.gridBagConstraintsTipoFormaPagoInven);
	}

	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = 1;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFormaPagoInven.add(jscrollPanenombreTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = iYPanelCamposTipoFormaPagoInven;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = iXPanelCamposTipoFormaPagoInven++;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPagoInven.add(this.jPanelidTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(iXPanelCamposTipoFormaPagoInven % 1==0) {
		iXPanelCamposTipoFormaPagoInven=0;
		iYPanelCamposTipoFormaPagoInven++;
	}
	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = iYPanelCamposTipoFormaPagoInven;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = iXPanelCamposTipoFormaPagoInven++;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPagoInven.add(this.jPanelcodigoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(iXPanelCamposTipoFormaPagoInven % 1==0) {
		iXPanelCamposTipoFormaPagoInven=0;
		iYPanelCamposTipoFormaPagoInven++;
	}
	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = iYPanelCamposTipoFormaPagoInven;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = iXPanelCamposTipoFormaPagoInven++;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPagoInven.add(this.jPanelnombreTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(iXPanelCamposTipoFormaPagoInven % 1==0) {
		iXPanelCamposTipoFormaPagoInven=0;
		iYPanelCamposTipoFormaPagoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPagoInven.gridy = iYPanelCamposOcultosTipoFormaPagoInven;
	this.gridBagConstraintsTipoFormaPagoInven.gridx = iXPanelCamposOcultosTipoFormaPagoInven++;
	this.gridBagConstraintsTipoFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormaPagoInven.add(this.jPanelid_empresaTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);



	if(iXPanelCamposOcultosTipoFormaPagoInven % 1==0) {
		iXPanelCamposOcultosTipoFormaPagoInven=0;
		iYPanelCamposOcultosTipoFormaPagoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesTipoFormaPagoInven.setLayout(gridaBagLayoutAccionesTipoFormaPagoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFormaPagoInven.setLayout(gridaBagLayoutAccionesFormularioTipoFormaPagoInven);
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormaPagoInven.add(this.jComboBoxTiposAccionesFormularioTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormaPagoInven.add(this.jCheckBoxPostAccionNuevoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormaPagoInven.add(this.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormaPagoInven.add(this.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonModificarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);							

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonEliminarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonActualizarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);


		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonGuardarCambiosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);	
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonCancelarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormaPagoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormaPagoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;		
			//this.gridBagConstraintsTipoFormaPagoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormaPagoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPagoInven.gridx =0;
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormaPagoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFormaPagoInven = new TipoFormaPagoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Forma Pago Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Forma Pago Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Forma Pago Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFormaPagoInvenModel tipoformapagoinvenModel=new TipoFormaPagoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFormaPagoInvenModel.TipoFormaPagoInvenFocusTraversalPolicy tipoformapagoinvenFocusTraversalPolicy = tipoformapagoinvenModel.new TipoFormaPagoInvenFocusTraversalPolicy(this);
			
			//tipoformapagoinvenFocusTraversalPolicy.settipoformapagoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoformapagoinvenModel);
			
			
			this.jContentPaneDetalleTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFormaPagoInven = new GridBagLayout();	
			this.jContentPaneDetalleTipoFormaPagoInven.setLayout(gridaBagLayoutDetalleTipoFormaPagoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormaPagoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFormaPagoInven.add(jTtoolBarDetalleTipoFormaPagoInven, gridBagConstraintsTipoFormaPagoInven);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFormaPagoInven=   new JScrollPane(jContentPaneDetalleTipoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFormaPagoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	        
			this.jContentPaneDetalleTipoFormaPagoInven.add(jPanelCamposTipoFormaPagoInven, gridBagConstraintsTipoFormaPagoInven);
			
			
			
			
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
						&& tipoformapagoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFormaPagoInven= new GridBagConstraints();
						this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
						this.jContentPaneDetalleTipoFormaPagoInven.add(this.jTabbedPaneRelacionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFormaPagoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFormaPagoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
					this.gridBagConstraintsTipoFormaPagoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFormaPagoInven.add(jPanelCamposOcultosTipoFormaPagoInven, gridBagConstraintsTipoFormaPagoInven);
				
					this.jPanelCamposOcultosTipoFormaPagoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	        this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFormaPagoInven.add(this.jPanelAccionesFormularioTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);							
			
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
	        this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFormaPagoInven.add(this.jPanelAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFormaPagoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFormaPagoInven=   new JScrollPane(this.jPanelCamposTipoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFormaPagoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFormaPagoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFormaPagoInven;
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
