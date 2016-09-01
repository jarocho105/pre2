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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoConceptoFlujoCajaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoConceptoFlujoCajaDetalleFormJInternalFrame extends TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoConceptoFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleTipoConceptoFlujoCaja;
	
	protected JMenu jmenuDetalleTipoConceptoFlujoCaja;
	protected JMenu jmenuDetalleArchivoTipoConceptoFlujoCaja;
	protected JMenu jmenuDetalleAccionesTipoConceptoFlujoCaja;
	protected JMenu jmenuDetalleDatosTipoConceptoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConceptoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoConceptoFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoConceptoFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoConceptoFlujoCajaSessionBean tipoconceptoflujocajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoConceptoFlujoCajaLogic tipoconceptoflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosTipoConceptoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoConceptoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoConceptoFlujoCaja;
	
	protected JPanel jPanelCamposTipoConceptoFlujoCaja;    
	protected JPanel jPanelCamposOcultosTipoConceptoFlujoCaja;    	
	protected JPanel jPanelAccionesTipoConceptoFlujoCaja;
	protected JPanel jPanelAccionesFormularioTipoConceptoFlujoCaja;
    
	
	
	protected Integer iXPanelCamposTipoConceptoFlujoCaja=0;
	protected Integer iYPanelCamposTipoConceptoFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosTipoConceptoFlujoCaja=0;
	protected Integer iYPanelCamposOcultosTipoConceptoFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoConceptoFlujoCaja;
	public JButton jButtonModificarTipoConceptoFlujoCaja;
	public JButton jButtonActualizarTipoConceptoFlujoCaja;
    public JButton jButtonEliminarTipoConceptoFlujoCaja;
	public JButton jButtonCancelarTipoConceptoFlujoCaja;
    public JButton jButtonGuardarCambiosTipoConceptoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaTipoConceptoFlujoCaja;
	protected JButton jButtonCerrarTipoConceptoFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionTipoConceptoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonModificarToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonActualizarToolBarTipoConceptoFlujoCaja;
    protected JButton jButtonEliminarToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonCancelarToolBarTipoConceptoFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoConceptoFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarTipoConceptoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemModificarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemActualizarTipoConceptoFlujoCaja;
    protected JMenuItem jMenuItemEliminarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemCancelarTipoConceptoFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoConceptoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConceptoFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoConceptoFlujoCaja;
	public JLabel jLabelIdTipoConceptoFlujoCaja;
	public JLabel jLabelidTipoConceptoFlujoCaja;
	public JButton jButtonidTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoConceptoFlujoCaja;
	public JLabel jLabelcodigoTipoConceptoFlujoCaja;
	public JTextField jTextFieldcodigoTipoConceptoFlujoCaja;
	public JButton jButtoncodigoTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoConceptoFlujoCaja;
	public JLabel jLabelnombreTipoConceptoFlujoCaja;
	public JTextArea jTextAreanombreTipoConceptoFlujoCaja;
	public JScrollPane jscrollPanenombreTipoConceptoFlujoCaja;
	public JButton jButtonnombreTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoConceptoFlujoCaja;
	public JLabel jLabelid_empresaTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoConceptoFlujoCaja;
	public JButton jButtonid_empresaTipoConceptoFlujoCaja= new JButtonMe();
	public JButton jButtonid_empresaTipoConceptoFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoConceptoFlujoCaja;
	
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
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoConceptoFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioTipoConceptoFlujoCaja=new JPanel();
				this.jmenuBarDetalleTipoConceptoFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleTipoConceptoFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoConceptoFlujoCaja() {
		return this.jButtonActualizarToolBarTipoConceptoFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarTipoConceptoFlujoCaja() {
		return this.jButtonEliminarToolBarTipoConceptoFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarTipoConceptoFlujoCaja() {
		return this.jButtonCancelarToolBarTipoConceptoFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionTipoConceptoFlujoCaja() {
		return this.jButtonProcesarInformacionTipoConceptoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConceptoFlujoCaja)	{
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja = jButtonProcesarInformacionTipoConceptoFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja = jComboBoxTiposRelacionesTipoConceptoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja = jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja = jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		
		this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconceptoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConceptoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Concepto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoConceptoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoConceptoFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoConceptoFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarTipoConceptoFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoConceptoFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoConceptoFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoConceptoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoConceptoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoConceptoFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConceptoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConceptoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConceptoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoConceptoFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoConceptoFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoConceptoFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoConceptoFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoConceptoFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoConceptoFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoConceptoFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoConceptoFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoConceptoFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoConceptoFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoConceptoFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoConceptoFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConceptoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConceptoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConceptoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoConceptoFlujoCaja.add(this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja);
		
		this.jmenuDetalleAccionesTipoConceptoFlujoCaja.add(this.jMenuItemActualizarTipoConceptoFlujoCaja);
		this.jmenuDetalleAccionesTipoConceptoFlujoCaja.add(this.jMenuItemEliminarTipoConceptoFlujoCaja);
		this.jmenuDetalleAccionesTipoConceptoFlujoCaja.add(this.jMenuItemCancelarTipoConceptoFlujoCaja);		
		
		//this.jmenuDetalleDatosTipoConceptoFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja);				
		this.jmenuDetalleDatosTipoConceptoFlujoCaja.add(this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja);				
				
		//this.jmenuDetalleAccionesTipoConceptoFlujoCaja.add(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoConceptoFlujoCaja.add(this.jmenuDetalleArchivoTipoConceptoFlujoCaja);		
		this.jmenuBarDetalleTipoConceptoFlujoCaja.add(this.jmenuDetalleAccionesTipoConceptoFlujoCaja);		
		this.jmenuBarDetalleTipoConceptoFlujoCaja.add(this.jmenuDetalleDatosTipoConceptoFlujoCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoConceptoFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposTipoConceptoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoConceptoFlujoCaja = new JLabelMe();
		jLabelIdTipoConceptoFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoConceptoFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoConceptoFlujoCaja.setToolTipText(TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoConceptoFlujoCaja= new GridBagLayout();

		this.jPanelidTipoConceptoFlujoCaja.setLayout(this.gridaBagLayoutTipoConceptoFlujoCaja);

		jLabelidTipoConceptoFlujoCaja = new JLabel();
		jLabelidTipoConceptoFlujoCaja.setText("Id");

		jLabelidTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoConceptoFlujoCaja = new JLabelMe();
		this.jLabelcodigoTipoConceptoFlujoCaja.setText(""+TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoConceptoFlujoCaja.setToolTipText("Codigo");
		this.jLabelcodigoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoConceptoFlujoCaja.setToolTipText(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoConceptoFlujoCaja = new GridBagLayout();
		this.jPanelcodigoTipoConceptoFlujoCaja.setLayout(this.gridaBagLayoutTipoConceptoFlujoCaja);


		jTextFieldcodigoTipoConceptoFlujoCaja= new JTextFieldMe();

		jTextFieldcodigoTipoConceptoFlujoCaja.setEnabled(false);
		jTextFieldcodigoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setText("U");
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoConceptoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoConceptoFlujoCajaBusqueda"));

		if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoConceptoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoConceptoFlujoCaja = new JLabelMe();
		this.jLabelnombreTipoConceptoFlujoCaja.setText(""+TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoConceptoFlujoCaja.setToolTipText("Nombre");
		this.jLabelnombreTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoConceptoFlujoCaja.setToolTipText(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoConceptoFlujoCaja = new GridBagLayout();
		this.jPanelnombreTipoConceptoFlujoCaja.setLayout(this.gridaBagLayoutTipoConceptoFlujoCaja);


		jTextAreanombreTipoConceptoFlujoCaja= new JTextAreaMe();
		jTextAreanombreTipoConceptoFlujoCaja.setEnabled(false);
		jTextAreanombreTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConceptoFlujoCaja.setLineWrap(true);
		jTextAreanombreTipoConceptoFlujoCaja.setWrapStyleWord(true);
		jTextAreanombreTipoConceptoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoConceptoFlujoCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoConceptoFlujoCaja = new JScrollPane(jTextAreanombreTipoConceptoFlujoCaja);
		jscrollPanenombreTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoConceptoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setText("U");
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoConceptoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoConceptoFlujoCajaBusqueda"));

		if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoConceptoFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoConceptoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoConceptoFlujoCaja = new JLabelMe();
		this.jLabelid_empresaTipoConceptoFlujoCaja.setText(""+TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoConceptoFlujoCaja.setToolTipText("Empresa");
		this.jLabelid_empresaTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoConceptoFlujoCaja.setToolTipText(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoConceptoFlujoCaja = new GridBagLayout();
		this.jPanelid_empresaTipoConceptoFlujoCaja.setLayout(this.gridaBagLayoutTipoConceptoFlujoCaja);


		jComboBoxid_empresaTipoConceptoFlujoCaja= new JComboBoxMe();
		jComboBoxid_empresaTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoConceptoFlujoCaja.setEnabled(false);

		this.jButtonid_empresaTipoConceptoFlujoCaja= new JButtonMe();
		this.jButtonid_empresaTipoConceptoFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConceptoFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConceptoFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConceptoFlujoCaja.setText("Buscar");
		this.jButtonid_empresaTipoConceptoFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoConceptoFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConceptoFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConceptoFlujoCaja"));

		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setText("U");
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConceptoFlujoCajaBusqueda"));

		if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setText("U");
		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoConceptoFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConceptoFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConceptoFlujoCajaUpdate"));



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
		//this.jInternalFrameDetalleTipoConceptoFlujoCaja = new TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Concepto Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConceptoFlujoCaja= new GridBagLayout();
		

		
		String sToolTipTipoConceptoFlujoCaja="";
		sToolTipTipoConceptoFlujoCaja=TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConceptoFlujoCaja+="(Tesoreria.TipoConceptoFlujoCaja)";
		}
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConceptoFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonModificarTipoConceptoFlujoCaja = new JButtonMe();
        this.jButtonActualizarTipoConceptoFlujoCaja = new JButtonMe();
        this.jButtonEliminarTipoConceptoFlujoCaja = new JButtonMe();
        this.jButtonCancelarTipoConceptoFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoConceptoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoConceptoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Concepto Flujo Caja";
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConceptoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoConceptoFlujoCaja.setName("jPanelCamposTipoConceptoFlujoCaja"); 

		this.jPanelCamposOcultosTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoConceptoFlujoCaja.setName("jPanelCamposOcultosTipoConceptoFlujoCaja"); 

        this.jPanelAccionesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConceptoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoConceptoFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoConceptoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoConceptoFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoConceptoFlujoCaja.setText("Nuevo");
		this.jButtonModificarTipoConceptoFlujoCaja.setText("Editar");
        this.jButtonActualizarTipoConceptoFlujoCaja.setText("Actualizar");
        this.jButtonEliminarTipoConceptoFlujoCaja.setText("Eliminar");
        this.jButtonCancelarTipoConceptoFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosTipoConceptoFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoConceptoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConceptoFlujoCaja,"nuevo_button","Nuevo",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoConceptoFlujoCaja,"modificar_button","Editar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoConceptoFlujoCaja,"actualizar_button","Actualizar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoConceptoFlujoCaja,"eliminar_button","Eliminar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoConceptoFlujoCaja,"cancelar_button","Cancelar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoConceptoFlujoCaja,"guardarcambios_button","Guardar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConceptoFlujoCaja,"cerrar_button","Salir",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoConceptoFlujoCaja.setToolTipText("Nuevo"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoConceptoFlujoCaja.setToolTipText("Editar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoConceptoFlujoCaja.setToolTipText("Actualizar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoConceptoFlujoCaja.setToolTipText("Eliminar)"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoConceptoFlujoCaja.setToolTipText("Cancelar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoConceptoFlujoCaja.setToolTipText("Guardar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setToolTipText("Guardar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConceptoFlujoCaja.setToolTipText("Salir"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConceptoFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoConceptoFlujoCaja";
		inputMap = this.jButtonActualizarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoConceptoFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoConceptoFlujoCaja";
		inputMap = this.jButtonEliminarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoConceptoFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCancelarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoConceptoFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCerrarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConceptoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConceptoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConceptoFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja.setToolTipText("Nuevo TipoConceptoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja.setToolTipText("Sin Cerrar Ventana TipoConceptoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoConceptoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoConceptoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoConceptoFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoConceptoFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoConceptoFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoConceptoFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoConceptoFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposTipoConceptoFlujoCaja.setLayout(gridaBagLayoutCamposTipoConceptoFlujoCaja);
		this.jPanelCamposOcultosTipoConceptoFlujoCaja.setLayout(gridaBagLayoutCamposOcultosTipoConceptoFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoConceptoFlujoCaja.add(jLabelIdTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoConceptoFlujoCaja.add(jLabelidTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);


	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoConceptoFlujoCaja.add(jLabelid_empresaTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoConceptoFlujoCaja.add(jButtonid_empresaTipoConceptoFlujoCajaBusqueda, this.gridBagConstraintsTipoConceptoFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 3;
		this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoConceptoFlujoCaja.add(jButtonid_empresaTipoConceptoFlujoCajaUpdate, this.gridBagConstraintsTipoConceptoFlujoCaja);
	}

	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoConceptoFlujoCaja.add(jComboBoxid_empresaTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);


	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoConceptoFlujoCaja.add(jLabelcodigoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoConceptoFlujoCaja.add(jButtoncodigoTipoConceptoFlujoCajaBusqueda, this.gridBagConstraintsTipoConceptoFlujoCaja);
	}

	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoConceptoFlujoCaja.add(jTextFieldcodigoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);


	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoConceptoFlujoCaja.add(jLabelnombreTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoConceptoFlujoCaja.add(jButtonnombreTipoConceptoFlujoCajaBusqueda, this.gridBagConstraintsTipoConceptoFlujoCaja);
	}

	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoConceptoFlujoCaja.add(jscrollPanenombreTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iYPanelCamposTipoConceptoFlujoCaja;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iXPanelCamposTipoConceptoFlujoCaja++;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConceptoFlujoCaja.add(this.jPanelidTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(iXPanelCamposTipoConceptoFlujoCaja % 1==0) {
		iXPanelCamposTipoConceptoFlujoCaja=0;
		iYPanelCamposTipoConceptoFlujoCaja++;
	}
	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iYPanelCamposTipoConceptoFlujoCaja;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iXPanelCamposTipoConceptoFlujoCaja++;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConceptoFlujoCaja.add(this.jPanelcodigoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(iXPanelCamposTipoConceptoFlujoCaja % 1==0) {
		iXPanelCamposTipoConceptoFlujoCaja=0;
		iYPanelCamposTipoConceptoFlujoCaja++;
	}
	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iYPanelCamposTipoConceptoFlujoCaja;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iXPanelCamposTipoConceptoFlujoCaja++;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConceptoFlujoCaja.add(this.jPanelnombreTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(iXPanelCamposTipoConceptoFlujoCaja % 1==0) {
		iXPanelCamposTipoConceptoFlujoCaja=0;
		iYPanelCamposTipoConceptoFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iYPanelCamposOcultosTipoConceptoFlujoCaja;
	this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iXPanelCamposOcultosTipoConceptoFlujoCaja++;
	this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConceptoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoConceptoFlujoCaja.add(this.jPanelid_empresaTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);



	if(iXPanelCamposOcultosTipoConceptoFlujoCaja % 1==0) {
		iXPanelCamposOcultosTipoConceptoFlujoCaja=0;
		iYPanelCamposOcultosTipoConceptoFlujoCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoConceptoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoConceptoFlujoCaja.setLayout(gridaBagLayoutAccionesTipoConceptoFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoConceptoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioTipoConceptoFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioTipoConceptoFlujoCaja);
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConceptoFlujoCaja.add(this.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConceptoFlujoCaja.add(this.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConceptoFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConceptoFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonModificarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);							

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonEliminarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonActualizarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);


		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonGuardarCambiosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);	
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonCancelarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConceptoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConceptoFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoConceptoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConceptoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoConceptoFlujoCaja = new TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Concepto Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Concepto Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Concepto Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoConceptoFlujoCajaModel tipoconceptoflujocajaModel=new TipoConceptoFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoConceptoFlujoCajaModel.TipoConceptoFlujoCajaFocusTraversalPolicy tipoconceptoflujocajaFocusTraversalPolicy = tipoconceptoflujocajaModel.new TipoConceptoFlujoCajaFocusTraversalPolicy(this);
			
			//tipoconceptoflujocajaFocusTraversalPolicy.settipoconceptoflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoconceptoflujocajaModel);
			
			
			this.jContentPaneDetalleTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoConceptoFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleTipoConceptoFlujoCaja.setLayout(gridaBagLayoutDetalleTipoConceptoFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConceptoFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleTipoConceptoFlujoCaja.add(jTtoolBarDetalleTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja=   new JScrollPane(jContentPaneDetalleTipoConceptoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleTipoConceptoFlujoCaja.add(jPanelCamposTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);
			
			
			
			
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
						&& tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoConceptoFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
						this.jContentPaneDetalleTipoConceptoFlujoCaja.add(this.jTabbedPaneRelacionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoConceptoFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsTipoConceptoFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleTipoConceptoFlujoCaja.add(jPanelCamposOcultosTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);
				
					this.jPanelCamposOcultosTipoConceptoFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	        this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoConceptoFlujoCaja.add(this.jPanelAccionesFormularioTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);							
			
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoConceptoFlujoCaja.add(this.jPanelAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoConceptoFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja=   new JScrollPane(this.jPanelCamposTipoConceptoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoConceptoFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoConceptoFlujoCaja;
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
