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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoEvaluacionEmpleadoConstantesFunciones;

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
public class TipoEvaluacionEmpleadoDetalleFormJInternalFrame extends TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEvaluacionEmpleado;
	
	protected JMenuBar jmenuBarDetalleTipoEvaluacionEmpleado;
	
	protected JMenu jmenuDetalleTipoEvaluacionEmpleado;
	protected JMenu jmenuDetalleArchivoTipoEvaluacionEmpleado;
	protected JMenu jmenuDetalleAccionesTipoEvaluacionEmpleado;
	protected JMenu jmenuDetalleDatosTipoEvaluacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEvaluacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoEvaluacionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEvaluacionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
	
	

	public EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame=null;
	public EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEvaluacionEmpleado=false;
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosTipoEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoEvaluacionEmpleado;
	
	protected JPanel jPanelCamposTipoEvaluacionEmpleado;    
	protected JPanel jPanelCamposOcultosTipoEvaluacionEmpleado;    	
	protected JPanel jPanelAccionesTipoEvaluacionEmpleado;
	protected JPanel jPanelAccionesFormularioTipoEvaluacionEmpleado;
    
	
	
	protected Integer iXPanelCamposTipoEvaluacionEmpleado=0;
	protected Integer iYPanelCamposTipoEvaluacionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosTipoEvaluacionEmpleado=0;
	protected Integer iYPanelCamposOcultosTipoEvaluacionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEvaluacionEmpleado;
	public JButton jButtonModificarTipoEvaluacionEmpleado;
	public JButton jButtonActualizarTipoEvaluacionEmpleado;
    public JButton jButtonEliminarTipoEvaluacionEmpleado;
	public JButton jButtonCancelarTipoEvaluacionEmpleado;
    public JButton jButtonGuardarCambiosTipoEvaluacionEmpleado;
	public JButton jButtonGuardarCambiosTablaTipoEvaluacionEmpleado;
	protected JButton jButtonCerrarTipoEvaluacionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionTipoEvaluacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonModificarToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonActualizarToolBarTipoEvaluacionEmpleado;
    protected JButton jButtonEliminarToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonCancelarToolBarTipoEvaluacionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonCerrarToolBarTipoEvaluacionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEvaluacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemModificarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemActualizarTipoEvaluacionEmpleado;
    protected JMenuItem jMenuItemEliminarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemCancelarTipoEvaluacionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoEvaluacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEvaluacionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEvaluacionEmpleado;
	public JLabel jLabelIdTipoEvaluacionEmpleado;
	public JLabel jLabelidTipoEvaluacionEmpleado;
	public JButton jButtonidTipoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoEvaluacionEmpleado;
	public JLabel jLabelcodigoTipoEvaluacionEmpleado;
	public JTextField jTextFieldcodigoTipoEvaluacionEmpleado;
	public JButton jButtoncodigoTipoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEvaluacionEmpleado;
	public JLabel jLabelnombreTipoEvaluacionEmpleado;
	public JTextArea jTextAreanombreTipoEvaluacionEmpleado;
	public JScrollPane jscrollPanenombreTipoEvaluacionEmpleado;
	public JButton jButtonnombreTipoEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoEvaluacionEmpleado;
	public JLabel jLabelid_empresaTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoEvaluacionEmpleado;
	public JButton jButtonid_empresaTipoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaTipoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEvaluacionEmpleado;
	
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
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEvaluacionEmpleado=new JPanel();
				this.jPanelAccionesFormularioTipoEvaluacionEmpleado=new JPanel();
				this.jmenuBarDetalleTipoEvaluacionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleTipoEvaluacionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEvaluacionEmpleado() {
		return this.jButtonActualizarToolBarTipoEvaluacionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarTipoEvaluacionEmpleado() {
		return this.jButtonEliminarToolBarTipoEvaluacionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarTipoEvaluacionEmpleado() {
		return this.jButtonCancelarToolBarTipoEvaluacionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEvaluacionEmpleado() {
		return this.jButtonProcesarInformacionTipoEvaluacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEvaluacionEmpleado)	{
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado = jButtonProcesarInformacionTipoEvaluacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado = jComboBoxTiposRelacionesTipoEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado = jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado = jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		
		this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoevaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEvaluacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Evaluacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEvaluacionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEvaluacionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarTipoEvaluacionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEvaluacionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEvaluacionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEvaluacionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEvaluacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEvaluacionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEvaluacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEvaluacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEvaluacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEvaluacionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEvaluacionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEvaluacionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEvaluacionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEvaluacionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEvaluacionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEvaluacionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEvaluacionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEvaluacionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEvaluacionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEvaluacionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEvaluacionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEvaluacionEmpleado.add(this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado);
		
		this.jmenuDetalleAccionesTipoEvaluacionEmpleado.add(this.jMenuItemActualizarTipoEvaluacionEmpleado);
		this.jmenuDetalleAccionesTipoEvaluacionEmpleado.add(this.jMenuItemEliminarTipoEvaluacionEmpleado);
		this.jmenuDetalleAccionesTipoEvaluacionEmpleado.add(this.jMenuItemCancelarTipoEvaluacionEmpleado);		
		
		//this.jmenuDetalleDatosTipoEvaluacionEmpleado.add(this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado);				
		this.jmenuDetalleDatosTipoEvaluacionEmpleado.add(this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado);				
				
		//this.jmenuDetalleAccionesTipoEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEvaluacionEmpleado.add(this.jmenuDetalleArchivoTipoEvaluacionEmpleado);		
		this.jmenuBarDetalleTipoEvaluacionEmpleado.add(this.jmenuDetalleAccionesTipoEvaluacionEmpleado);		
		this.jmenuBarDetalleTipoEvaluacionEmpleado.add(this.jmenuDetalleDatosTipoEvaluacionEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoEvaluacionEmpleado.add(this.jmenuDetalleTipoEvaluacionEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEvaluacionEmpleado);				
	}
	
	
	public void inicializarElementosCamposTipoEvaluacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEvaluacionEmpleado = new JLabelMe();
		jLabelIdTipoEvaluacionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEvaluacionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEvaluacionEmpleado.setToolTipText(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEvaluacionEmpleado= new GridBagLayout();

		this.jPanelidTipoEvaluacionEmpleado.setLayout(this.gridaBagLayoutTipoEvaluacionEmpleado);

		jLabelidTipoEvaluacionEmpleado = new JLabel();
		jLabelidTipoEvaluacionEmpleado.setText("Id");

		jLabelidTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoEvaluacionEmpleado = new JLabelMe();
		this.jLabelcodigoTipoEvaluacionEmpleado.setText(""+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoEvaluacionEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoEvaluacionEmpleado.setToolTipText(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoEvaluacionEmpleado = new GridBagLayout();
		this.jPanelcodigoTipoEvaluacionEmpleado.setLayout(this.gridaBagLayoutTipoEvaluacionEmpleado);


		jTextFieldcodigoTipoEvaluacionEmpleado= new JTextFieldMe();

		jTextFieldcodigoTipoEvaluacionEmpleado.setEnabled(false);
		jTextFieldcodigoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoEvaluacionEmpleadoBusqueda"));

		if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoEvaluacionEmpleado = new JLabelMe();
		this.jLabelnombreTipoEvaluacionEmpleado.setText(""+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEvaluacionEmpleado.setToolTipText("Nombre");
		this.jLabelnombreTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEvaluacionEmpleado.setToolTipText(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEvaluacionEmpleado = new GridBagLayout();
		this.jPanelnombreTipoEvaluacionEmpleado.setLayout(this.gridaBagLayoutTipoEvaluacionEmpleado);


		jTextAreanombreTipoEvaluacionEmpleado= new JTextAreaMe();
		jTextAreanombreTipoEvaluacionEmpleado.setEnabled(false);
		jTextAreanombreTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEvaluacionEmpleado.setLineWrap(true);
		jTextAreanombreTipoEvaluacionEmpleado.setWrapStyleWord(true);
		jTextAreanombreTipoEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEvaluacionEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEvaluacionEmpleado = new JScrollPane(jTextAreanombreTipoEvaluacionEmpleado);
		jscrollPanenombreTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEvaluacionEmpleadoBusqueda"));

		if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEvaluacionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEvaluacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_empresaTipoEvaluacionEmpleado.setText(""+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoEvaluacionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoEvaluacionEmpleado.setToolTipText(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_empresaTipoEvaluacionEmpleado.setLayout(this.gridaBagLayoutTipoEvaluacionEmpleado);


		jComboBoxid_empresaTipoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoEvaluacionEmpleado.setEnabled(false);

		this.jButtonid_empresaTipoEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_empresaTipoEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_empresaTipoEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEvaluacionEmpleado"));

		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEvaluacionEmpleadoBusqueda"));

		if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEvaluacionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleTipoEvaluacionEmpleado = new TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Evaluacion Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEvaluacionEmpleado= new GridBagLayout();
		

		
		String sToolTipTipoEvaluacionEmpleado="";
		sToolTipTipoEvaluacionEmpleado=TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEvaluacionEmpleado+="(Nomina.TipoEvaluacionEmpleado)";
		}
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEvaluacionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonModificarTipoEvaluacionEmpleado = new JButtonMe();
        this.jButtonActualizarTipoEvaluacionEmpleado = new JButtonMe();
        this.jButtonEliminarTipoEvaluacionEmpleado = new JButtonMe();
        this.jButtonCancelarTipoEvaluacionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoEvaluacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoEvaluacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Evaluacion Empleado";
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEvaluacionEmpleado.setName("jPanelCamposTipoEvaluacionEmpleado"); 

		this.jPanelCamposOcultosTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEvaluacionEmpleado.setName("jPanelCamposOcultosTipoEvaluacionEmpleado"); 

        this.jPanelAccionesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoEvaluacionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEvaluacionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEvaluacionEmpleado.setText("Nuevo");
		this.jButtonModificarTipoEvaluacionEmpleado.setText("Editar");
        this.jButtonActualizarTipoEvaluacionEmpleado.setText("Actualizar");
        this.jButtonEliminarTipoEvaluacionEmpleado.setText("Eliminar");
        this.jButtonCancelarTipoEvaluacionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEvaluacionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoEvaluacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEvaluacionEmpleado,"nuevo_button","Nuevo",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEvaluacionEmpleado,"modificar_button","Editar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEvaluacionEmpleado,"actualizar_button","Actualizar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEvaluacionEmpleado,"eliminar_button","Eliminar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEvaluacionEmpleado,"cancelar_button","Cancelar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEvaluacionEmpleado,"guardarcambios_button","Guardar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado,"guardarcambiostabla_button","Guardar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEvaluacionEmpleado,"cerrar_button","Salir",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEvaluacionEmpleado.setToolTipText("Nuevo"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEvaluacionEmpleado.setToolTipText("Editar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEvaluacionEmpleado.setToolTipText("Actualizar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEvaluacionEmpleado.setToolTipText("Eliminar)"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEvaluacionEmpleado.setToolTipText("Cancelar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEvaluacionEmpleado.setToolTipText("Guardar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setToolTipText("Guardar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEvaluacionEmpleado.setToolTipText("Salir"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEvaluacionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEvaluacionEmpleado";
		inputMap = this.jButtonActualizarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEvaluacionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEvaluacionEmpleado";
		inputMap = this.jButtonEliminarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEvaluacionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCancelarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEvaluacionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCerrarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEvaluacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEvaluacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEvaluacionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado.setToolTipText("Nuevo TipoEvaluacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado.setToolTipText("Sin Cerrar Ventana TipoEvaluacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEvaluacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoEvaluacionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEvaluacionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEvaluacionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEvaluacionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEvaluacionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEvaluacionEmpleado = new GridBagLayout();
		
		this.jPanelCamposTipoEvaluacionEmpleado.setLayout(gridaBagLayoutCamposTipoEvaluacionEmpleado);
		this.jPanelCamposOcultosTipoEvaluacionEmpleado.setLayout(gridaBagLayoutCamposOcultosTipoEvaluacionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEvaluacionEmpleado.add(jLabelIdTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEvaluacionEmpleado.add(jLabelidTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);


	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoEvaluacionEmpleado.add(jLabelid_empresaTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEvaluacionEmpleado.add(jButtonid_empresaTipoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsTipoEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEvaluacionEmpleado.add(jButtonid_empresaTipoEvaluacionEmpleadoUpdate, this.gridBagConstraintsTipoEvaluacionEmpleado);
	}

	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoEvaluacionEmpleado.add(jComboBoxid_empresaTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);


	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoEvaluacionEmpleado.add(jLabelcodigoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoEvaluacionEmpleado.add(jButtoncodigoTipoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsTipoEvaluacionEmpleado);
	}

	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoEvaluacionEmpleado.add(jTextFieldcodigoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);


	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEvaluacionEmpleado.add(jLabelnombreTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEvaluacionEmpleado.add(jButtonnombreTipoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsTipoEvaluacionEmpleado);
	}

	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEvaluacionEmpleado.add(jscrollPanenombreTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iYPanelCamposTipoEvaluacionEmpleado;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iXPanelCamposTipoEvaluacionEmpleado++;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEvaluacionEmpleado.add(this.jPanelidTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(iXPanelCamposTipoEvaluacionEmpleado % 1==0) {
		iXPanelCamposTipoEvaluacionEmpleado=0;
		iYPanelCamposTipoEvaluacionEmpleado++;
	}
	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iYPanelCamposTipoEvaluacionEmpleado;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iXPanelCamposTipoEvaluacionEmpleado++;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEvaluacionEmpleado.add(this.jPanelcodigoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(iXPanelCamposTipoEvaluacionEmpleado % 1==0) {
		iXPanelCamposTipoEvaluacionEmpleado=0;
		iYPanelCamposTipoEvaluacionEmpleado++;
	}
	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iYPanelCamposTipoEvaluacionEmpleado;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iXPanelCamposTipoEvaluacionEmpleado++;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEvaluacionEmpleado.add(this.jPanelnombreTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(iXPanelCamposTipoEvaluacionEmpleado % 1==0) {
		iXPanelCamposTipoEvaluacionEmpleado=0;
		iYPanelCamposTipoEvaluacionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iYPanelCamposOcultosTipoEvaluacionEmpleado;
	this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iXPanelCamposOcultosTipoEvaluacionEmpleado++;
	this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoEvaluacionEmpleado.add(this.jPanelid_empresaTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);



	if(iXPanelCamposOcultosTipoEvaluacionEmpleado % 1==0) {
		iXPanelCamposOcultosTipoEvaluacionEmpleado=0;
		iYPanelCamposOcultosTipoEvaluacionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesTipoEvaluacionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesFormularioTipoEvaluacionEmpleado);
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEvaluacionEmpleado.add(this.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEvaluacionEmpleado.add(this.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEvaluacionEmpleado.add(this.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEvaluacionEmpleado.add(this.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonModificarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);							

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonEliminarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonActualizarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);


		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonGuardarCambiosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);	
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonCancelarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEvaluacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEvaluacionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEvaluacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEvaluacionEmpleado = new TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Evaluacion Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Evaluacion Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Evaluacion Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEvaluacionEmpleadoModel tipoevaluacionempleadoModel=new TipoEvaluacionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEvaluacionEmpleadoModel.TipoEvaluacionEmpleadoFocusTraversalPolicy tipoevaluacionempleadoFocusTraversalPolicy = tipoevaluacionempleadoModel.new TipoEvaluacionEmpleadoFocusTraversalPolicy(this);
			
			//tipoevaluacionempleadoFocusTraversalPolicy.settipoevaluacionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoevaluacionempleadoModel);
			
			
			this.jContentPaneDetalleTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEvaluacionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleTipoEvaluacionEmpleado.setLayout(gridaBagLayoutDetalleTipoEvaluacionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEvaluacionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEvaluacionEmpleado.add(jTtoolBarDetalleTipoEvaluacionEmpleado, gridBagConstraintsTipoEvaluacionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado=   new JScrollPane(jContentPaneDetalleTipoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleTipoEvaluacionEmpleado.add(jPanelCamposTipoEvaluacionEmpleado, gridBagConstraintsTipoEvaluacionEmpleado);
			
			
			
			
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
						&& tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(this.puedeCargarPorParteEvaluacionEmpleado,false,-1);
					
					if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEvaluacionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
						this.jContentPaneDetalleTipoEvaluacionEmpleado.add(this.jTabbedPaneRelacionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEvaluacionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsTipoEvaluacionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEvaluacionEmpleado.add(jPanelCamposOcultosTipoEvaluacionEmpleado, gridBagConstraintsTipoEvaluacionEmpleado);
				
					this.jPanelCamposOcultosTipoEvaluacionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	        this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEvaluacionEmpleado.add(this.jPanelAccionesFormularioTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);							
			
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEvaluacionEmpleado.add(this.jPanelAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEvaluacionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado=   new JScrollPane(this.jPanelCamposTipoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEvaluacionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEvaluacionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		this.evaluacionempleadoSessionBean.setConGuardarRelaciones(false);
		this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.evaluacionempleadoBeanSwingJInternalFrame=null;//new EvaluacionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.evaluacionempleadoBeanSwingJInternalFramePopup=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.evaluacionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {

				EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.evaluacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.evaluacionempleadoBeanSwingJInternalFrame.setevaluacionempleadoSessionBean(this.evaluacionempleadoSessionBean);

				//this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
				//this.jContentPaneDetalleTipoEvaluacionEmpleado.add(this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoEvaluacionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.add("Evaluacion Empleados",this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setComponentAt(iIndexTab,this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.evaluacionempleadoBeanSwingJInternalFrame=null;//new EvaluacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEvaluacionEmpleado) {
					this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.add("Evaluacion Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEvaluacionEmpleadoBeanSwingJInternalFrame(List<TipoEvaluacionEmpleado> tipoevaluacionempleados,TipoEvaluacionEmpleado tipoevaluacionempleado,EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					evaluacionempleadoBeanSwingJInternalFrame.getEvaluacionEmpleadoLogic().setConnexion(this.tipoevaluacionempleadoLogic.getConnexion());

					evaluacionempleadoBeanSwingJInternalFrame.settipoevaluacionempleadosForeignKey(tipoevaluacionempleados);
					evaluacionempleadoBeanSwingJInternalFrame.settipoevaluacionempleadoForeignKey(tipoevaluacionempleado);
					evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado(true);
					evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setlidTipoEvaluacionEmpleadoActual(tipoevaluacionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					evaluacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEvaluacionEmpleado(evaluacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					evaluacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoEvaluacionEmpleado(true);
					evaluacionempleadoBeanSwingJInternalFrame.setid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado(tipoevaluacionempleado.getId());

					if(!this.conCargarFormDetalle) {
						evaluacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					evaluacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoEvaluacionEmpleadoForeignKey(tipoevaluacionempleado,1,false,true,true);
					evaluacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					evaluacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoEvaluacionEmpleado");
					evaluacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoEvaluacionEmpleado");
					evaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionEmpleado(true);
					evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEvaluacionEmpleado("n",evaluacionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, evaluacionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					evaluacionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					evaluacionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionEmpleado("relacionado");
					} else {
						evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionEmpleado("no_relacionado");
					}

					evaluacionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEvaluacionEmpleado().setVisible(false);

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
