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
import com.bydan.erp.nomina.util.TipoLibretaMiliConstantesFunciones;

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
public class TipoLibretaMiliDetalleFormJInternalFrame extends TipoLibretaMiliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoLibretaMili;
	
	protected JMenuBar jmenuBarDetalleTipoLibretaMili;
	
	protected JMenu jmenuDetalleTipoLibretaMili;
	protected JMenu jmenuDetalleArchivoTipoLibretaMili;
	protected JMenu jmenuDetalleAccionesTipoLibretaMili;
	protected JMenu jmenuDetalleDatosTipoLibretaMili;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLibretaMili;	
	protected GridBagConstraints gridBagConstraintsTipoLibretaMili;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoLibretaMiliBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoLibretaMili;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLibretaMiliSessionBean tipolibretamiliSessionBean;
	
	

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoLibretaMiliLogic tipolibretamiliLogic;
	
	public JScrollPane jScrollPanelDatosTipoLibretaMili;
	public JScrollPane jScrollPanelDatosEdicionTipoLibretaMili;
	public JScrollPane jScrollPanelDatosGeneralTipoLibretaMili;
	
	protected JPanel jPanelCamposTipoLibretaMili;    
	protected JPanel jPanelCamposOcultosTipoLibretaMili;    	
	protected JPanel jPanelAccionesTipoLibretaMili;
	protected JPanel jPanelAccionesFormularioTipoLibretaMili;
    
	
	
	protected Integer iXPanelCamposTipoLibretaMili=0;
	protected Integer iYPanelCamposTipoLibretaMili=0;
	
	protected Integer iXPanelCamposOcultosTipoLibretaMili=0;
	protected Integer iYPanelCamposOcultosTipoLibretaMili=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoLibretaMili;
	public JButton jButtonModificarTipoLibretaMili;
	public JButton jButtonActualizarTipoLibretaMili;
    public JButton jButtonEliminarTipoLibretaMili;
	public JButton jButtonCancelarTipoLibretaMili;
    public JButton jButtonGuardarCambiosTipoLibretaMili;
	public JButton jButtonGuardarCambiosTablaTipoLibretaMili;
	protected JButton jButtonCerrarTipoLibretaMili;
	
	
	protected JButton jButtonProcesarInformacionTipoLibretaMili;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoLibretaMili;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoLibretaMili;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoLibretaMili;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLibretaMili;
	protected JButton jButtonModificarToolBarTipoLibretaMili;
	protected JButton jButtonActualizarToolBarTipoLibretaMili;
    protected JButton jButtonEliminarToolBarTipoLibretaMili;
	protected JButton jButtonCancelarToolBarTipoLibretaMili;
    protected JButton jButtonGuardarCambiosToolBarTipoLibretaMili;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoLibretaMili;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLibretaMili;
	protected JButton jButtonCerrarToolBarTipoLibretaMili;
	
	protected JButton jButtonProcesarInformacionToolBarTipoLibretaMili;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLibretaMili;
	protected JMenuItem jMenuItemModificarTipoLibretaMili;
	protected JMenuItem jMenuItemActualizarTipoLibretaMili;
    protected JMenuItem jMenuItemEliminarTipoLibretaMili;
	protected JMenuItem jMenuItemCancelarTipoLibretaMili;
    protected JMenuItem jMenuItemGuardarCambiosTipoLibretaMili;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLibretaMili;
	protected JMenuItem jMenuItemCerrarTipoLibretaMili;
	protected JMenuItem jMenuItemDetalleCerrarTipoLibretaMili;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLibretaMili;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoLibretaMili;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLibretaMili;
	protected JMenuItem jMenuItemMostrarOcultarTipoLibretaMili;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLibretaMili;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLibretaMili;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoLibretaMili;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoLibretaMili;
	public JLabel jLabelIdTipoLibretaMili;
	public JLabel jLabelidTipoLibretaMili;
	public JButton jButtonidTipoLibretaMiliBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoLibretaMili;
	public JLabel jLabelcodigoTipoLibretaMili;
	public JTextField jTextFieldcodigoTipoLibretaMili;
	public JButton jButtoncodigoTipoLibretaMiliBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoLibretaMili;
	public JLabel jLabelnombreTipoLibretaMili;
	public JTextArea jTextAreanombreTipoLibretaMili;
	public JScrollPane jscrollPanenombreTipoLibretaMili;
	public JButton jButtonnombreTipoLibretaMiliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoLibretaMili;
	public JLabel jLabelid_empresaTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoLibretaMili;
	public JButton jButtonid_empresaTipoLibretaMili= new JButtonMe();
	public JButton jButtonid_empresaTipoLibretaMiliUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoLibretaMiliBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoLibretaMili;
	
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
	
	public TipoLibretaMiliDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoLibretaMili=new JPanel();
				this.jPanelAccionesFormularioTipoLibretaMili=new JPanel();
				this.jmenuBarDetalleTipoLibretaMili=new JMenuBar();
				this.jTtoolBarDetalleTipoLibretaMili=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoLibretaMiliDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoLibretaMili() {
		return this.jButtonActualizarToolBarTipoLibretaMili;
	}
	
	public JButton getjButtonEliminarToolBarTipoLibretaMili() {
		return this.jButtonEliminarToolBarTipoLibretaMili;
	}
	
	public JButton getjButtonCancelarToolBarTipoLibretaMili() {
		return this.jButtonCancelarToolBarTipoLibretaMili;
	}		
	
	public JButton getjButtonProcesarInformacionTipoLibretaMili() {
		return this.jButtonProcesarInformacionTipoLibretaMili;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLibretaMili)	{
		this.jButtonProcesarInformacionTipoLibretaMili = jButtonProcesarInformacionTipoLibretaMili;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLibretaMili() {
		return this.jComboBoxTiposAccionesTipoLibretaMili;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLibretaMili(
			JComboBox jComboBoxTiposRelacionesTipoLibretaMili) {
		this.jComboBoxTiposRelacionesTipoLibretaMili = jComboBoxTiposRelacionesTipoLibretaMili;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLibretaMili(
			JComboBox jComboBoxTiposAccionesTipoLibretaMili) {
		this.jComboBoxTiposAccionesTipoLibretaMili = jComboBoxTiposAccionesTipoLibretaMili;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoLibretaMili() {
		return this.jComboBoxTiposAccionesFormularioTipoLibretaMili;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoLibretaMili(
			JComboBox jComboBoxTiposAccionesFormularioTipoLibretaMili) {
		this.jComboBoxTiposAccionesFormularioTipoLibretaMili = jComboBoxTiposAccionesFormularioTipoLibretaMili;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		
		this.tipolibretamiliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolibretamiliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolibretamiliSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLibretaMiliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Libreta Mili MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoLibretaMiliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoLibretaMili= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoLibretaMili=new JButtonMe();
				this.jButtonModificarToolBarTipoLibretaMili=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili,
							"actualizar","actualizar","Actualizar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili,
							"eliminar","eliminar","Eliminar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili,
							"cancelar","cancelar","Cancelar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoLibretaMili=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoLibretaMili=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoLibretaMili=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoLibretaMili=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoLibretaMili=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLibretaMili= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLibretaMili.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLibretaMili,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoLibretaMili= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoLibretaMili.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoLibretaMili,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoLibretaMili= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoLibretaMili.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoLibretaMili,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoLibretaMili= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoLibretaMili.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoLibretaMili,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoLibretaMili= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoLibretaMili.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoLibretaMili,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoLibretaMili= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLibretaMili.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLibretaMili,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLibretaMili= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLibretaMili.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLibretaMili,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoLibretaMili= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoLibretaMili.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoLibretaMili,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLibretaMili= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLibretaMili.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLibretaMili,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLibretaMili= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLibretaMili.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLibretaMili,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoLibretaMili.add(this.jMenuItemDetalleCerrarTipoLibretaMili);
		
		this.jmenuDetalleAccionesTipoLibretaMili.add(this.jMenuItemActualizarTipoLibretaMili);
		this.jmenuDetalleAccionesTipoLibretaMili.add(this.jMenuItemEliminarTipoLibretaMili);
		this.jmenuDetalleAccionesTipoLibretaMili.add(this.jMenuItemCancelarTipoLibretaMili);		
		
		//this.jmenuDetalleDatosTipoLibretaMili.add(this.jMenuItemDetalleAbrirOrderByTipoLibretaMili);				
		this.jmenuDetalleDatosTipoLibretaMili.add(this.jMenuItemDetalleMostarOcultarTipoLibretaMili);				
				
		//this.jmenuDetalleAccionesTipoLibretaMili.add(this.jMenuItemGuardarCambiosTipoLibretaMili);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoLibretaMili.add(this.jmenuDetalleArchivoTipoLibretaMili);		
		this.jmenuBarDetalleTipoLibretaMili.add(this.jmenuDetalleAccionesTipoLibretaMili);		
		this.jmenuBarDetalleTipoLibretaMili.add(this.jmenuDetalleDatosTipoLibretaMili);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoLibretaMili.add(this.jmenuDetalleTipoLibretaMili);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoLibretaMili);				
	}
	
	
	public void inicializarElementosCamposTipoLibretaMili() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoLibretaMili = new JLabelMe();
		jLabelIdTipoLibretaMili.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoLibretaMili = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoLibretaMili.setToolTipText(TipoLibretaMiliConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoLibretaMili= new GridBagLayout();

		this.jPanelidTipoLibretaMili.setLayout(this.gridaBagLayoutTipoLibretaMili);

		jLabelidTipoLibretaMili = new JLabel();
		jLabelidTipoLibretaMili.setText("Id");

		jLabelidTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoLibretaMili = new JLabelMe();
		this.jLabelcodigoTipoLibretaMili.setText(""+TipoLibretaMiliConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoLibretaMili.setToolTipText("Codigo");
		this.jLabelcodigoTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoLibretaMili=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoLibretaMili.setToolTipText(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoLibretaMili = new GridBagLayout();
		this.jPanelcodigoTipoLibretaMili.setLayout(this.gridaBagLayoutTipoLibretaMili);


		jTextFieldcodigoTipoLibretaMili= new JTextFieldMe();

		jTextFieldcodigoTipoLibretaMili.setEnabled(false);
		jTextFieldcodigoTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoLibretaMiliBusqueda= new JButtonMe();
		this.jButtoncodigoTipoLibretaMiliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLibretaMiliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLibretaMiliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoLibretaMiliBusqueda.setText("U");
		this.jButtoncodigoTipoLibretaMiliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoLibretaMiliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoLibretaMiliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoLibretaMiliBusqueda"));

		if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoLibretaMiliBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoLibretaMili = new JLabelMe();
		this.jLabelnombreTipoLibretaMili.setText(""+TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoLibretaMili.setToolTipText("Nombre");
		this.jLabelnombreTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoLibretaMili=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoLibretaMili.setToolTipText(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoLibretaMili = new GridBagLayout();
		this.jPanelnombreTipoLibretaMili.setLayout(this.gridaBagLayoutTipoLibretaMili);


		jTextAreanombreTipoLibretaMili= new JTextAreaMe();
		jTextAreanombreTipoLibretaMili.setEnabled(false);
		jTextAreanombreTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLibretaMili.setLineWrap(true);
		jTextAreanombreTipoLibretaMili.setWrapStyleWord(true);
		jTextAreanombreTipoLibretaMili.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoLibretaMili.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoLibretaMili = new JScrollPane(jTextAreanombreTipoLibretaMili);
		jscrollPanenombreTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoLibretaMiliBusqueda= new JButtonMe();
		this.jButtonnombreTipoLibretaMiliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLibretaMiliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLibretaMiliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoLibretaMiliBusqueda.setText("U");
		this.jButtonnombreTipoLibretaMiliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoLibretaMiliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoLibretaMiliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoLibretaMiliBusqueda"));

		if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoLibretaMiliBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoLibretaMili() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoLibretaMili = new JLabelMe();
		this.jLabelid_empresaTipoLibretaMili.setText(""+TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoLibretaMili.setToolTipText("Empresa");
		this.jLabelid_empresaTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoLibretaMili=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoLibretaMili.setToolTipText(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoLibretaMili = new GridBagLayout();
		this.jPanelid_empresaTipoLibretaMili.setLayout(this.gridaBagLayoutTipoLibretaMili);


		jComboBoxid_empresaTipoLibretaMili= new JComboBoxMe();
		jComboBoxid_empresaTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoLibretaMili.setEnabled(false);

		this.jButtonid_empresaTipoLibretaMili= new JButtonMe();
		this.jButtonid_empresaTipoLibretaMili.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLibretaMili.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLibretaMili.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLibretaMili.setText("Buscar");
		this.jButtonid_empresaTipoLibretaMili.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoLibretaMili.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLibretaMili,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLibretaMili"));

		this.jButtonid_empresaTipoLibretaMiliBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLibretaMiliBusqueda.setText("U");
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLibretaMiliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLibretaMiliBusqueda"));

		if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoLibretaMiliBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoLibretaMiliUpdate= new JButtonMe();
		this.jButtonid_empresaTipoLibretaMiliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLibretaMiliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLibretaMiliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLibretaMiliUpdate.setText("U");
		this.jButtonid_empresaTipoLibretaMiliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoLibretaMiliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLibretaMiliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLibretaMiliUpdate"));



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
		//this.jInternalFrameDetalleTipoLibretaMili = new TipoLibretaMiliBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Libreta Mili DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLibretaMili= new GridBagLayout();
		

		
		String sToolTipTipoLibretaMili="";
		sToolTipTipoLibretaMili=TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLibretaMili+="(Nomina.TipoLibretaMili)";
		}
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLibretaMili+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoLibretaMili = new JButtonMe();
		this.jButtonModificarTipoLibretaMili = new JButtonMe();
        this.jButtonActualizarTipoLibretaMili = new JButtonMe();
        this.jButtonEliminarTipoLibretaMili = new JButtonMe();
        this.jButtonCancelarTipoLibretaMili = new JButtonMe();
        this.jButtonGuardarCambiosTipoLibretaMili = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoLibretaMili = new JButtonMe();
		this.jButtonCerrarTipoLibretaMili = new JButtonMe();
		
		this.jScrollPanelDatosTipoLibretaMili = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoLibretaMili = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoLibretaMili = new JScrollPane();
				
		
		
		this.jPanelCamposTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Libreta Mili";
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLibretaMili.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoLibretaMili.setName("jPanelCamposTipoLibretaMili"); 

		this.jPanelCamposOcultosTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoLibretaMili.setName("jPanelCamposOcultosTipoLibretaMili"); 

        this.jPanelAccionesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLibretaMili.setToolTipText("Acciones");
        this.jPanelAccionesTipoLibretaMili.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoLibretaMili.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoLibretaMili.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoLibretaMili.setText("Nuevo");
		this.jButtonModificarTipoLibretaMili.setText("Editar");
        this.jButtonActualizarTipoLibretaMili.setText("Actualizar");
        this.jButtonEliminarTipoLibretaMili.setText("Eliminar");
        this.jButtonCancelarTipoLibretaMili.setText("Cancelar");
        this.jButtonGuardarCambiosTipoLibretaMili.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoLibretaMili.setText("Guardar");
		this.jButtonCerrarTipoLibretaMili.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLibretaMili,"nuevo_button","Nuevo",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoLibretaMili,"modificar_button","Editar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoLibretaMili,"actualizar_button","Actualizar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoLibretaMili,"eliminar_button","Eliminar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoLibretaMili,"cancelar_button","Cancelar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoLibretaMili,"guardarcambios_button","Guardar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLibretaMili,"guardarcambiostabla_button","Guardar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLibretaMili,"cerrar_button","Salir",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoLibretaMili.setToolTipText("Nuevo"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoLibretaMili.setToolTipText("Editar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoLibretaMili.setToolTipText("Actualizar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoLibretaMili.setToolTipText("Eliminar)"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoLibretaMili.setToolTipText("Cancelar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoLibretaMili.setToolTipText("Guardar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoLibretaMili.setToolTipText("Guardar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLibretaMili.setToolTipText("Salir"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLibretaMili";
		inputMap = this.jButtonNuevoTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLibretaMili.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLibretaMili"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoLibretaMili";
		inputMap = this.jButtonActualizarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoLibretaMili"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoLibretaMili";
		inputMap = this.jButtonEliminarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoLibretaMili"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoLibretaMili";
		inputMap = this.jButtonCancelarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoLibretaMili"));
		
		//CERRAR		
		sMapKey = "CerrarTipoLibretaMili";
		inputMap = this.jButtonCerrarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLibretaMili"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLibretaMili";
		inputMap = this.jButtonGuardarCambiosTablaTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLibretaMili"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoLibretaMili = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoLibretaMili.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoLibretaMili.setToolTipText("Nuevo TipoLibretaMili");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoLibretaMili = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoLibretaMili.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoLibretaMili.setToolTipText("Sin Cerrar Ventana TipoLibretaMili");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoLibretaMili = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoLibretaMili.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoLibretaMili.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLibretaMili.setText("Accion");
		this.jComboBoxTiposAccionesTipoLibretaMili.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoLibretaMili.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoLibretaMili.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoLibretaMili = new JLabelMe();
		
		this.jLabelAccionesTipoLibretaMili.setText("Acciones");		
		this.jLabelAccionesTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoLibretaMili();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoLibretaMili();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoLibretaMili=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoLibretaMili.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLibretaMili.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLibretaMili.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoLibretaMili.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLibretaMili.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLibretaMili.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoLibretaMili = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoLibretaMili = new GridBagLayout();
		
		this.jPanelCamposTipoLibretaMili.setLayout(gridaBagLayoutCamposTipoLibretaMili);
		this.jPanelCamposOcultosTipoLibretaMili.setLayout(gridaBagLayoutCamposOcultosTipoLibretaMili);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoLibretaMili.add(jLabelIdTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 1;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoLibretaMili.add(jLabelidTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);


	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoLibretaMili.add(jLabelid_empresaTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		//this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = 2;
		this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
		this.gridBagConstraintsTipoLibretaMili.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLibretaMili.add(jButtonid_empresaTipoLibretaMiliBusqueda, this.gridBagConstraintsTipoLibretaMili);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		//this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = 3;
		this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
		this.gridBagConstraintsTipoLibretaMili.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLibretaMili.add(jButtonid_empresaTipoLibretaMiliUpdate, this.gridBagConstraintsTipoLibretaMili);
	}

	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 1;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoLibretaMili.add(jComboBoxid_empresaTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);


	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoLibretaMili.add(jLabelcodigoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		//this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = 2;
		this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
		this.gridBagConstraintsTipoLibretaMili.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoLibretaMili.add(jButtoncodigoTipoLibretaMiliBusqueda, this.gridBagConstraintsTipoLibretaMili);
	}

	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 1;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoLibretaMili.add(jTextFieldcodigoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);


	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoLibretaMili.add(jLabelnombreTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		//this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = 2;
		this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
		this.gridBagConstraintsTipoLibretaMili.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoLibretaMili.add(jButtonnombreTipoLibretaMiliBusqueda, this.gridBagConstraintsTipoLibretaMili);
	}

	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLibretaMili.gridy = 0;
	this.gridBagConstraintsTipoLibretaMili.gridx = 1;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoLibretaMili.add(jscrollPanenombreTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLibretaMili.gridy = iYPanelCamposTipoLibretaMili;
	this.gridBagConstraintsTipoLibretaMili.gridx = iXPanelCamposTipoLibretaMili++;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLibretaMili.add(this.jPanelidTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(iXPanelCamposTipoLibretaMili % 1==0) {
		iXPanelCamposTipoLibretaMili=0;
		iYPanelCamposTipoLibretaMili++;
	}
	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLibretaMili.gridy = iYPanelCamposTipoLibretaMili;
	this.gridBagConstraintsTipoLibretaMili.gridx = iXPanelCamposTipoLibretaMili++;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLibretaMili.add(this.jPanelcodigoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(iXPanelCamposTipoLibretaMili % 1==0) {
		iXPanelCamposTipoLibretaMili=0;
		iYPanelCamposTipoLibretaMili++;
	}
	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLibretaMili.gridy = iYPanelCamposTipoLibretaMili;
	this.gridBagConstraintsTipoLibretaMili.gridx = iXPanelCamposTipoLibretaMili++;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLibretaMili.add(this.jPanelnombreTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(iXPanelCamposTipoLibretaMili % 1==0) {
		iXPanelCamposTipoLibretaMili=0;
		iYPanelCamposTipoLibretaMili++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLibretaMili.gridy = iYPanelCamposOcultosTipoLibretaMili;
	this.gridBagConstraintsTipoLibretaMili.gridx = iXPanelCamposOcultosTipoLibretaMili++;
	this.gridBagConstraintsTipoLibretaMili.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLibretaMili.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoLibretaMili.add(this.jPanelid_empresaTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);



	if(iXPanelCamposOcultosTipoLibretaMili % 1==0) {
		iXPanelCamposOcultosTipoLibretaMili=0;
		iYPanelCamposOcultosTipoLibretaMili++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoLibretaMili= new GridBagLayout();
		this.jPanelAccionesTipoLibretaMili.setLayout(gridaBagLayoutAccionesTipoLibretaMili);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoLibretaMili= new GridBagLayout();
		this.jPanelAccionesFormularioTipoLibretaMili.setLayout(gridaBagLayoutAccionesFormularioTipoLibretaMili);
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLibretaMili.add(this.jComboBoxTiposAccionesFormularioTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLibretaMili.add(this.jCheckBoxPostAccionNuevoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLibretaMili.add(this.jCheckBoxPostAccionSinCerrarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLibretaMili.add(this.jCheckBoxPostAccionSinMensajeTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonModificarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);							

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonEliminarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonActualizarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);


		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonGuardarCambiosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);	
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;		
		this.gridBagConstraintsTipoLibretaMili.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonCancelarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLibretaMili = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLibretaMili);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();						
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;		
			//this.gridBagConstraintsTipoLibretaMili.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLibretaMili.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLibretaMili.gridx =0;
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLibretaMili.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoLibretaMili = new TipoLibretaMiliBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Libreta Mili DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Libreta Mili DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Libreta Mili Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoLibretaMiliModel tipolibretamiliModel=new TipoLibretaMiliModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoLibretaMiliModel.TipoLibretaMiliFocusTraversalPolicy tipolibretamiliFocusTraversalPolicy = tipolibretamiliModel.new TipoLibretaMiliFocusTraversalPolicy(this);
			
			//tipolibretamiliFocusTraversalPolicy.settipolibretamiliJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipolibretamiliModel);
			
			
			this.jContentPaneDetalleTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoLibretaMili = new GridBagLayout();	
			this.jContentPaneDetalleTipoLibretaMili.setLayout(gridaBagLayoutDetalleTipoLibretaMili);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLibretaMili = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
				this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoLibretaMili.gridx = 0;
					
				
				this.jContentPaneDetalleTipoLibretaMili.add(jTtoolBarDetalleTipoLibretaMili, gridBagConstraintsTipoLibretaMili);								
				
}
			
			this.jScrollPanelDatosEdicionTipoLibretaMili=   new JScrollPane(jContentPaneDetalleTipoLibretaMili,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLibretaMili.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLibretaMili.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLibretaMili.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoLibretaMili=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLibretaMili.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLibretaMili.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLibretaMili.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	        
			this.jContentPaneDetalleTipoLibretaMili.add(jPanelCamposTipoLibretaMili, gridBagConstraintsTipoLibretaMili);
			
			
			
			
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
						&& tipolibretamiliSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					
					if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoLibretaMili= new GridBagConstraints();
						this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoLibretaMili.gridx = 0;
						this.jContentPaneDetalleTipoLibretaMili.add(this.jTabbedPaneRelacionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoLibretaMili.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoLibretaMili.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
					this.gridBagConstraintsTipoLibretaMili.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoLibretaMili.gridx = 0;
					
				
					this.jContentPaneDetalleTipoLibretaMili.add(jPanelCamposOcultosTipoLibretaMili, gridBagConstraintsTipoLibretaMili);
				
					this.jPanelCamposOcultosTipoLibretaMili.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	        this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoLibretaMili.add(this.jPanelAccionesFormularioTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);							
			
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
	        this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoLibretaMili.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoLibretaMili.add(this.jPanelAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoLibretaMili);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoLibretaMili=   new JScrollPane(this.jPanelCamposTipoLibretaMili,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLibretaMili.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLibretaMili.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLibretaMili.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoLibretaMili.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoLibretaMili;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoLibretaMili;
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

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
				//this.gridBagConstraintsTipoLibretaMili.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoLibretaMili.gridx = 0;
				//this.jContentPaneDetalleTipoLibretaMili.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoLibretaMili);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoLibretaMili.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoLibretaMili.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoLibretaMili.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoLibretaMili> tipolibretamilis,TipoLibretaMili tipolibretamili,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tipolibretamiliLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settipolibretamilisForeignKey(tipolibretamilis);
					datogeneralempleadoBeanSwingJInternalFrame.settipolibretamiliForeignKey(tipolibretamili);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoLibretaMili(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoLibretaMiliActual(tipolibretamili.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoLibretaMili(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_libreta_miliFK_IdTipoLibretaMili(tipolibretamili.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoLibretaMiliForeignKey(tipolibretamili,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoLibretaMili");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoLibretaMili");
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
