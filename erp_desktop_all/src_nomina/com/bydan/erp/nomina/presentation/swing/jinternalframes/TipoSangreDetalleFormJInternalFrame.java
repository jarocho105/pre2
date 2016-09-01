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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoSangreConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoSangreDetalleFormJInternalFrame extends TipoSangreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoSangre;
	
	protected JMenuBar jmenuBarDetalleTipoSangre;
	
	protected JMenu jmenuDetalleTipoSangre;
	protected JMenu jmenuDetalleArchivoTipoSangre;
	protected JMenu jmenuDetalleAccionesTipoSangre;
	protected JMenu jmenuDetalleDatosTipoSangre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSangre;	
	protected GridBagConstraints gridBagConstraintsTipoSangre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoSangreBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoSangre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSangreSessionBean tiposangreSessionBean;
	
	

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoSangreLogic tiposangreLogic;
	
	public JScrollPane jScrollPanelDatosTipoSangre;
	public JScrollPane jScrollPanelDatosEdicionTipoSangre;
	public JScrollPane jScrollPanelDatosGeneralTipoSangre;
	
	protected JPanel jPanelCamposTipoSangre;    
	protected JPanel jPanelCamposOcultosTipoSangre;    	
	protected JPanel jPanelAccionesTipoSangre;
	protected JPanel jPanelAccionesFormularioTipoSangre;
    
	
	
	protected Integer iXPanelCamposTipoSangre=0;
	protected Integer iYPanelCamposTipoSangre=0;
	
	protected Integer iXPanelCamposOcultosTipoSangre=0;
	protected Integer iYPanelCamposOcultosTipoSangre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoSangre;
	public JButton jButtonModificarTipoSangre;
	public JButton jButtonActualizarTipoSangre;
    public JButton jButtonEliminarTipoSangre;
	public JButton jButtonCancelarTipoSangre;
    public JButton jButtonGuardarCambiosTipoSangre;
	public JButton jButtonGuardarCambiosTablaTipoSangre;
	protected JButton jButtonCerrarTipoSangre;
	
	
	protected JButton jButtonProcesarInformacionTipoSangre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoSangre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoSangre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoSangre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSangre;
	protected JButton jButtonModificarToolBarTipoSangre;
	protected JButton jButtonActualizarToolBarTipoSangre;
    protected JButton jButtonEliminarToolBarTipoSangre;
	protected JButton jButtonCancelarToolBarTipoSangre;
    protected JButton jButtonGuardarCambiosToolBarTipoSangre;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoSangre;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSangre;
	protected JButton jButtonCerrarToolBarTipoSangre;
	
	protected JButton jButtonProcesarInformacionToolBarTipoSangre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSangre;
	protected JMenuItem jMenuItemModificarTipoSangre;
	protected JMenuItem jMenuItemActualizarTipoSangre;
    protected JMenuItem jMenuItemEliminarTipoSangre;
	protected JMenuItem jMenuItemCancelarTipoSangre;
    protected JMenuItem jMenuItemGuardarCambiosTipoSangre;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSangre;
	protected JMenuItem jMenuItemCerrarTipoSangre;
	protected JMenuItem jMenuItemDetalleCerrarTipoSangre;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSangre;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoSangre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSangre;
	protected JMenuItem jMenuItemMostrarOcultarTipoSangre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSangre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSangre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSangre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoSangre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoSangre;
	public JLabel jLabelIdTipoSangre;
	public JLabel jLabelidTipoSangre;
	public JButton jButtonidTipoSangreBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoSangre;
	public JLabel jLabelcodigoTipoSangre;
	public JTextField jTextFieldcodigoTipoSangre;
	public JButton jButtoncodigoTipoSangreBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoSangre;
	public JLabel jLabelnombreTipoSangre;
	public JTextArea jTextAreanombreTipoSangre;
	public JScrollPane jscrollPanenombreTipoSangre;
	public JButton jButtonnombreTipoSangreBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoSangre;
	public JLabel jLabelid_empresaTipoSangre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoSangre;
	public JButton jButtonid_empresaTipoSangre= new JButtonMe();
	public JButton jButtonid_empresaTipoSangreUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoSangreBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoSangre;
	
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
	
	public TipoSangreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoSangre=new JPanel();
				this.jPanelAccionesFormularioTipoSangre=new JPanel();
				this.jmenuBarDetalleTipoSangre=new JMenuBar();
				this.jTtoolBarDetalleTipoSangre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoSangreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoSangre() {
		return this.jButtonActualizarToolBarTipoSangre;
	}
	
	public JButton getjButtonEliminarToolBarTipoSangre() {
		return this.jButtonEliminarToolBarTipoSangre;
	}
	
	public JButton getjButtonCancelarToolBarTipoSangre() {
		return this.jButtonCancelarToolBarTipoSangre;
	}		
	
	public JButton getjButtonProcesarInformacionTipoSangre() {
		return this.jButtonProcesarInformacionTipoSangre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSangre)	{
		this.jButtonProcesarInformacionTipoSangre = jButtonProcesarInformacionTipoSangre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSangre() {
		return this.jComboBoxTiposAccionesTipoSangre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSangre(
			JComboBox jComboBoxTiposRelacionesTipoSangre) {
		this.jComboBoxTiposRelacionesTipoSangre = jComboBoxTiposRelacionesTipoSangre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSangre(
			JComboBox jComboBoxTiposAccionesTipoSangre) {
		this.jComboBoxTiposAccionesTipoSangre = jComboBoxTiposAccionesTipoSangre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoSangre() {
		return this.jComboBoxTiposAccionesFormularioTipoSangre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoSangre(
			JComboBox jComboBoxTiposAccionesFormularioTipoSangre) {
		this.jComboBoxTiposAccionesFormularioTipoSangre = jComboBoxTiposAccionesFormularioTipoSangre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposangreSessionBean=new TipoSangreSessionBean();
		
		this.tiposangreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposangreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposangreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSangreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sangre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoSangreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoSangre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoSangre=new JButtonMe();
				this.jButtonModificarToolBarTipoSangre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoSangre,this.jTtoolBarDetalleTipoSangre,
							"actualizar","actualizar","Actualizar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoSangre,this.jTtoolBarDetalleTipoSangre,
							"eliminar","eliminar","Eliminar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoSangre,this.jTtoolBarDetalleTipoSangre,
							"cancelar","cancelar","Cancelar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoSangre,this.jTtoolBarDetalleTipoSangre,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoSangre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoSangre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoSangre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoSangre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoSangre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSangre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSangre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSangre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoSangre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoSangre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoSangre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoSangre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoSangre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoSangre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoSangre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoSangre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoSangre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoSangre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoSangre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoSangre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoSangre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSangre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSangre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSangre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSangre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSangre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoSangre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoSangre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoSangre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSangre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSangre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSangre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSangre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSangre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSangre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoSangre.add(this.jMenuItemDetalleCerrarTipoSangre);
		
		this.jmenuDetalleAccionesTipoSangre.add(this.jMenuItemActualizarTipoSangre);
		this.jmenuDetalleAccionesTipoSangre.add(this.jMenuItemEliminarTipoSangre);
		this.jmenuDetalleAccionesTipoSangre.add(this.jMenuItemCancelarTipoSangre);		
		
		//this.jmenuDetalleDatosTipoSangre.add(this.jMenuItemDetalleAbrirOrderByTipoSangre);				
		this.jmenuDetalleDatosTipoSangre.add(this.jMenuItemDetalleMostarOcultarTipoSangre);				
				
		//this.jmenuDetalleAccionesTipoSangre.add(this.jMenuItemGuardarCambiosTipoSangre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoSangre.add(this.jmenuDetalleArchivoTipoSangre);		
		this.jmenuBarDetalleTipoSangre.add(this.jmenuDetalleAccionesTipoSangre);		
		this.jmenuBarDetalleTipoSangre.add(this.jmenuDetalleDatosTipoSangre);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoSangre.add(this.jmenuDetalleTipoSangre);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoSangre);				
	}
	
	
	public void inicializarElementosCamposTipoSangre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoSangre = new JLabelMe();
		jLabelIdTipoSangre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoSangre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoSangre.setToolTipText(TipoSangreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoSangre= new GridBagLayout();

		this.jPanelidTipoSangre.setLayout(this.gridaBagLayoutTipoSangre);

		jLabelidTipoSangre = new JLabel();
		jLabelidTipoSangre.setText("Id");

		jLabelidTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoSangre = new JLabelMe();
		this.jLabelcodigoTipoSangre.setText(""+TipoSangreConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoSangre.setToolTipText("Codigo");
		this.jLabelcodigoTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoSangre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoSangre.setToolTipText(TipoSangreConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoSangre = new GridBagLayout();
		this.jPanelcodigoTipoSangre.setLayout(this.gridaBagLayoutTipoSangre);


		jTextFieldcodigoTipoSangre= new JTextFieldMe();

		jTextFieldcodigoTipoSangre.setEnabled(false);
		jTextFieldcodigoTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoSangreBusqueda= new JButtonMe();
		this.jButtoncodigoTipoSangreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSangreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSangreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoSangreBusqueda.setText("U");
		this.jButtoncodigoTipoSangreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoSangreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoSangreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoSangreBusqueda"));

		if(this.tiposangreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoSangreBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoSangre = new JLabelMe();
		this.jLabelnombreTipoSangre.setText(""+TipoSangreConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoSangre.setToolTipText("Nombre");
		this.jLabelnombreTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoSangre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoSangre.setToolTipText(TipoSangreConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoSangre = new GridBagLayout();
		this.jPanelnombreTipoSangre.setLayout(this.gridaBagLayoutTipoSangre);


		jTextAreanombreTipoSangre= new JTextAreaMe();
		jTextAreanombreTipoSangre.setEnabled(false);
		jTextAreanombreTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSangre.setLineWrap(true);
		jTextAreanombreTipoSangre.setWrapStyleWord(true);
		jTextAreanombreTipoSangre.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoSangre.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoSangre = new JScrollPane(jTextAreanombreTipoSangre);
		jscrollPanenombreTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoSangreBusqueda= new JButtonMe();
		this.jButtonnombreTipoSangreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSangreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSangreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoSangreBusqueda.setText("U");
		this.jButtonnombreTipoSangreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoSangreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoSangreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoSangreBusqueda"));

		if(this.tiposangreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoSangreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoSangre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoSangre = new JLabelMe();
		this.jLabelid_empresaTipoSangre.setText(""+TipoSangreConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoSangre.setToolTipText("Empresa");
		this.jLabelid_empresaTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoSangre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoSangre.setToolTipText(TipoSangreConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoSangre = new GridBagLayout();
		this.jPanelid_empresaTipoSangre.setLayout(this.gridaBagLayoutTipoSangre);


		jComboBoxid_empresaTipoSangre= new JComboBoxMe();
		jComboBoxid_empresaTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoSangre.setEnabled(false);

		this.jButtonid_empresaTipoSangre= new JButtonMe();
		this.jButtonid_empresaTipoSangre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSangre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSangre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSangre.setText("Buscar");
		this.jButtonid_empresaTipoSangre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoSangre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSangre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSangre"));

		this.jButtonid_empresaTipoSangreBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoSangreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSangreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSangreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSangreBusqueda.setText("U");
		this.jButtonid_empresaTipoSangreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoSangreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSangreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSangreBusqueda"));

		if(this.tiposangreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoSangreBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoSangreUpdate= new JButtonMe();
		this.jButtonid_empresaTipoSangreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSangreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSangreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSangreUpdate.setText("U");
		this.jButtonid_empresaTipoSangreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoSangreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSangreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSangreUpdate"));



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
		//this.jInternalFrameDetalleTipoSangre = new TipoSangreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Sangre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSangre= new GridBagLayout();
		

		
		String sToolTipTipoSangre="";
		sToolTipTipoSangre=TipoSangreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSangre+="(Nomina.TipoSangre)";
		}
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSangre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoSangre = new JButtonMe();
		this.jButtonModificarTipoSangre = new JButtonMe();
        this.jButtonActualizarTipoSangre = new JButtonMe();
        this.jButtonEliminarTipoSangre = new JButtonMe();
        this.jButtonCancelarTipoSangre = new JButtonMe();
        this.jButtonGuardarCambiosTipoSangre = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoSangre = new JButtonMe();
		this.jButtonCerrarTipoSangre = new JButtonMe();
		
		this.jScrollPanelDatosTipoSangre = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoSangre = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoSangre = new JScrollPane();
				
		
		
		this.jPanelCamposTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sangre";
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSangre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoSangre.setName("jPanelCamposTipoSangre"); 

		this.jPanelCamposOcultosTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoSangre.setName("jPanelCamposOcultosTipoSangre"); 

        this.jPanelAccionesTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSangre.setToolTipText("Acciones");
        this.jPanelAccionesTipoSangre.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoSangre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoSangre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoSangre.setText("Nuevo");
		this.jButtonModificarTipoSangre.setText("Editar");
        this.jButtonActualizarTipoSangre.setText("Actualizar");
        this.jButtonEliminarTipoSangre.setText("Eliminar");
        this.jButtonCancelarTipoSangre.setText("Cancelar");
        this.jButtonGuardarCambiosTipoSangre.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoSangre.setText("Guardar");
		this.jButtonCerrarTipoSangre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSangre,"nuevo_button","Nuevo",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoSangre,"modificar_button","Editar",this.tiposangreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoSangre,"actualizar_button","Actualizar",this.tiposangreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoSangre,"eliminar_button","Eliminar",this.tiposangreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoSangre,"cancelar_button","Cancelar",this.tiposangreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoSangre,"guardarcambios_button","Guardar",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSangre,"guardarcambiostabla_button","Guardar",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSangre,"cerrar_button","Salir",this.tiposangreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoSangre.setToolTipText("Nuevo"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoSangre.setToolTipText("Editar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoSangre.setToolTipText("Actualizar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoSangre.setToolTipText("Eliminar)"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoSangre.setToolTipText("Cancelar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoSangre.setToolTipText("Guardar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoSangre.setToolTipText("Guardar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSangre.setToolTipText("Salir"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSangre";
		inputMap = this.jButtonNuevoTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSangre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSangre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoSangre";
		inputMap = this.jButtonActualizarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoSangre"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoSangre";
		inputMap = this.jButtonEliminarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoSangre"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoSangre";
		inputMap = this.jButtonCancelarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoSangre"));
		
		//CERRAR		
		sMapKey = "CerrarTipoSangre";
		inputMap = this.jButtonCerrarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSangre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSangre";
		inputMap = this.jButtonGuardarCambiosTablaTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSangre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoSangre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoSangre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoSangre.setToolTipText("Nuevo TipoSangre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoSangre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoSangre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoSangre.setToolTipText("Sin Cerrar Ventana TipoSangre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoSangre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoSangre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoSangre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSangre.setText("Accion");
		this.jComboBoxTiposAccionesTipoSangre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoSangre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoSangre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoSangre = new JLabelMe();
		
		this.jLabelAccionesTipoSangre.setText("Acciones");		
		this.jLabelAccionesTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoSangre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoSangre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoSangre=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoSangre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoSangre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSangre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSangre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoSangre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSangre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSangre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoSangre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoSangre = new GridBagLayout();
		
		this.jPanelCamposTipoSangre.setLayout(gridaBagLayoutCamposTipoSangre);
		this.jPanelCamposOcultosTipoSangre.setLayout(gridaBagLayoutCamposOcultosTipoSangre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 0;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoSangre.add(jLabelIdTipoSangre, this.gridBagConstraintsTipoSangre);



	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 1;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoSangre.add(jLabelidTipoSangre, this.gridBagConstraintsTipoSangre);


	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 0;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoSangre.add(jLabelid_empresaTipoSangre, this.gridBagConstraintsTipoSangre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		//this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = 2;
		this.gridBagConstraintsTipoSangre.ipadx = 0;
		this.gridBagConstraintsTipoSangre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSangre.add(jButtonid_empresaTipoSangreBusqueda, this.gridBagConstraintsTipoSangre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		//this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = 3;
		this.gridBagConstraintsTipoSangre.ipadx = 0;
		this.gridBagConstraintsTipoSangre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSangre.add(jButtonid_empresaTipoSangreUpdate, this.gridBagConstraintsTipoSangre);
	}

	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 1;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoSangre.add(jComboBoxid_empresaTipoSangre, this.gridBagConstraintsTipoSangre);


	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 0;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoSangre.add(jLabelcodigoTipoSangre, this.gridBagConstraintsTipoSangre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		//this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = 2;
		this.gridBagConstraintsTipoSangre.ipadx = 0;
		this.gridBagConstraintsTipoSangre.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoSangre.add(jButtoncodigoTipoSangreBusqueda, this.gridBagConstraintsTipoSangre);
	}

	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 1;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoSangre.add(jTextFieldcodigoTipoSangre, this.gridBagConstraintsTipoSangre);


	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 0;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoSangre.add(jLabelnombreTipoSangre, this.gridBagConstraintsTipoSangre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		//this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = 2;
		this.gridBagConstraintsTipoSangre.ipadx = 0;
		this.gridBagConstraintsTipoSangre.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoSangre.add(jButtonnombreTipoSangreBusqueda, this.gridBagConstraintsTipoSangre);
	}

	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSangre.gridy = 0;
	this.gridBagConstraintsTipoSangre.gridx = 1;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoSangre.add(jscrollPanenombreTipoSangre, this.gridBagConstraintsTipoSangre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSangre.gridy = iYPanelCamposTipoSangre;
	this.gridBagConstraintsTipoSangre.gridx = iXPanelCamposTipoSangre++;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSangre.add(this.jPanelidTipoSangre, this.gridBagConstraintsTipoSangre);



	if(iXPanelCamposTipoSangre % 1==0) {
		iXPanelCamposTipoSangre=0;
		iYPanelCamposTipoSangre++;
	}
	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSangre.gridy = iYPanelCamposTipoSangre;
	this.gridBagConstraintsTipoSangre.gridx = iXPanelCamposTipoSangre++;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSangre.add(this.jPanelcodigoTipoSangre, this.gridBagConstraintsTipoSangre);



	if(iXPanelCamposTipoSangre % 1==0) {
		iXPanelCamposTipoSangre=0;
		iYPanelCamposTipoSangre++;
	}
	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSangre.gridy = iYPanelCamposTipoSangre;
	this.gridBagConstraintsTipoSangre.gridx = iXPanelCamposTipoSangre++;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSangre.add(this.jPanelnombreTipoSangre, this.gridBagConstraintsTipoSangre);



	if(iXPanelCamposTipoSangre % 1==0) {
		iXPanelCamposTipoSangre=0;
		iYPanelCamposTipoSangre++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSangre.gridy = iYPanelCamposOcultosTipoSangre;
	this.gridBagConstraintsTipoSangre.gridx = iXPanelCamposOcultosTipoSangre++;
	this.gridBagConstraintsTipoSangre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSangre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoSangre.add(this.jPanelid_empresaTipoSangre, this.gridBagConstraintsTipoSangre);



	if(iXPanelCamposOcultosTipoSangre % 1==0) {
		iXPanelCamposOcultosTipoSangre=0;
		iYPanelCamposOcultosTipoSangre++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoSangre= new GridBagLayout();
		this.jPanelAccionesTipoSangre.setLayout(gridaBagLayoutAccionesTipoSangre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoSangre= new GridBagLayout();
		this.jPanelAccionesFormularioTipoSangre.setLayout(gridaBagLayoutAccionesFormularioTipoSangre);
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSangre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSangre.add(this.jComboBoxTiposAccionesFormularioTipoSangre, this.gridBagConstraintsTipoSangre);

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSangre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSangre.add(this.jCheckBoxPostAccionNuevoTipoSangre, this.gridBagConstraintsTipoSangre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSangre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSangre.add(this.jCheckBoxPostAccionSinCerrarTipoSangre, this.gridBagConstraintsTipoSangre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSangre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSangre.add(this.jCheckBoxPostAccionSinMensajeTipoSangre, this.gridBagConstraintsTipoSangre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoSangre.add(this.jButtonModificarTipoSangre, this.gridBagConstraintsTipoSangre);							

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoSangre.add(this.jButtonEliminarTipoSangre, this.gridBagConstraintsTipoSangre);
		
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = 0;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSangre.add(this.jButtonActualizarTipoSangre, this.gridBagConstraintsTipoSangre);


		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = 0;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSangre.add(this.jButtonGuardarCambiosTipoSangre, this.gridBagConstraintsTipoSangre);	
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = 0;		
		this.gridBagConstraintsTipoSangre.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoSangre.add(this.jButtonCancelarTipoSangre, this.gridBagConstraintsTipoSangre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSangre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSangre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();						
			this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSangre.gridx = 0;		
			//this.gridBagConstraintsTipoSangre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSangre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSangre.gridx =0;
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSangre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSangre, this.gridBagConstraintsTipoSangre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoSangre = new TipoSangreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Sangre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Sangre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sangre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoSangreModel tiposangreModel=new TipoSangreModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoSangreModel.TipoSangreFocusTraversalPolicy tiposangreFocusTraversalPolicy = tiposangreModel.new TipoSangreFocusTraversalPolicy(this);
			
			//tiposangreFocusTraversalPolicy.settiposangreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposangreModel);
			
			
			this.jContentPaneDetalleTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoSangre = new GridBagLayout();	
			this.jContentPaneDetalleTipoSangre.setLayout(gridaBagLayoutDetalleTipoSangre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSangre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoSangre = new GridBagConstraints();
				this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoSangre.gridx = 0;
					
				
				this.jContentPaneDetalleTipoSangre.add(jTtoolBarDetalleTipoSangre, gridBagConstraintsTipoSangre);								
				
}
			
			this.jScrollPanelDatosEdicionTipoSangre=   new JScrollPane(jContentPaneDetalleTipoSangre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSangre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSangre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSangre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoSangre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSangre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSangre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSangre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoSangre.gridx = 0;
	        
			this.jContentPaneDetalleTipoSangre.add(jPanelCamposTipoSangre, gridBagConstraintsTipoSangre);
			
			
			
			
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
						&& tiposangreSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					
					if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoSangre= new GridBagConstraints();
						this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoSangre.gridx = 0;
						this.jContentPaneDetalleTipoSangre.add(this.jTabbedPaneRelacionesTipoSangre, this.gridBagConstraintsTipoSangre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoSangre.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoSangre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoSangre = new GridBagConstraints();
					this.gridBagConstraintsTipoSangre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoSangre.gridx = 0;
					
				
					this.jContentPaneDetalleTipoSangre.add(jPanelCamposOcultosTipoSangre, gridBagConstraintsTipoSangre);
				
					this.jPanelCamposOcultosTipoSangre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoSangre.gridx = 0;
	        this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoSangre.add(this.jPanelAccionesFormularioTipoSangre, this.gridBagConstraintsTipoSangre);							
			
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
	        this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoSangre.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoSangre.add(this.jPanelAccionesTipoSangre, this.gridBagConstraintsTipoSangre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoSangre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoSangre=   new JScrollPane(this.jPanelCamposTipoSangre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSangre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSangre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSangre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoSangre.gridx = 0;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoSangre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoSangre, this.gridBagConstraintsTipoSangre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSangre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoSangre, this.gridBagConstraintsTipoSangre);			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSangre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoSangre, this.gridBagConstraintsTipoSangre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSangre, this.gridBagConstraintsTipoSangre);
			
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSangre, this.gridBagConstraintsTipoSangre);
		
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSangre, this.gridBagConstraintsTipoSangre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoSangre;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoSangre;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoSangre = new GridBagConstraints();
				//this.gridBagConstraintsTipoSangre.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoSangre.gridx = 0;
				//this.jContentPaneDetalleTipoSangre.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoSangre);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoSangre.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoSangre.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoSangre.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoSangre> tiposangres,TipoSangre tiposangre,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tiposangreLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settiposangresForeignKey(tiposangres);
					datogeneralempleadoBeanSwingJInternalFrame.settiposangreForeignKey(tiposangre);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoSangre(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoSangreActual(tiposangre.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoSangre(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_sangreFK_IdTipoSangre(tiposangre.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoSangreForeignKey(tiposangre,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoSangre");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoSangre");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
