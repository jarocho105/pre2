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
import com.bydan.erp.nomina.util.CursoConstantesFunciones;

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
public class CursoDetalleFormJInternalFrame extends CursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCurso;
	
	protected JMenuBar jmenuBarDetalleCurso;
	
	protected JMenu jmenuDetalleCurso;
	protected JMenu jmenuDetalleArchivoCurso;
	protected JMenu jmenuDetalleAccionesCurso;
	protected JMenu jmenuDetalleDatosCurso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCurso;	
	protected GridBagConstraints gridBagConstraintsCurso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CursoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCurso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoCursoBeanSwingJInternalFrame tipocursoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocurso="";

	protected TipoInstitucionBeanSwingJInternalFrame tipoinstitucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinstitucion="";
	
	public CursoSessionBean cursoSessionBean;
	
	

	public DetalleCursoBeanSwingJInternalFrame detallecursoBeanSwingJInternalFrame=null;
	public DetalleCursoBeanSwingJInternalFrame detallecursoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCurso=false;
	public DetalleCursoSessionBean detallecursoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoCursoSessionBean tipocursoSessionBean;
	public TipoInstitucionSessionBean tipoinstitucionSessionBean;	
	
	public CursoLogic cursoLogic;
	
	public JScrollPane jScrollPanelDatosCurso;
	public JScrollPane jScrollPanelDatosEdicionCurso;
	public JScrollPane jScrollPanelDatosGeneralCurso;
	
	protected JPanel jPanelCamposCurso;    
	protected JPanel jPanelCamposOcultosCurso;    	
	protected JPanel jPanelAccionesCurso;
	protected JPanel jPanelAccionesFormularioCurso;
    
	
	
	protected Integer iXPanelCamposCurso=0;
	protected Integer iYPanelCamposCurso=0;
	
	protected Integer iXPanelCamposOcultosCurso=0;
	protected Integer iYPanelCamposOcultosCurso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCurso;
	public JButton jButtonModificarCurso;
	public JButton jButtonActualizarCurso;
    public JButton jButtonEliminarCurso;
	public JButton jButtonCancelarCurso;
    public JButton jButtonGuardarCambiosCurso;
	public JButton jButtonGuardarCambiosTablaCurso;
	protected JButton jButtonCerrarCurso;
	
	
	protected JButton jButtonProcesarInformacionCurso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCurso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCurso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCurso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCurso;
	protected JButton jButtonModificarToolBarCurso;
	protected JButton jButtonActualizarToolBarCurso;
    protected JButton jButtonEliminarToolBarCurso;
	protected JButton jButtonCancelarToolBarCurso;
    protected JButton jButtonGuardarCambiosToolBarCurso;
	protected JButton jButtonGuardarCambiosTablaToolBarCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarCurso;
	protected JButton jButtonCerrarToolBarCurso;
	
	protected JButton jButtonProcesarInformacionToolBarCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCurso;
	protected JMenuItem jMenuItemModificarCurso;
	protected JMenuItem jMenuItemActualizarCurso;
    protected JMenuItem jMenuItemEliminarCurso;
	protected JMenuItem jMenuItemCancelarCurso;
    protected JMenuItem jMenuItemGuardarCambiosCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCurso;
	protected JMenuItem jMenuItemCerrarCurso;
	protected JMenuItem jMenuItemDetalleCerrarCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCurso;
	
	protected JMenuItem jMenuItemProcesarInformacionCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCurso;
	protected JMenuItem jMenuItemMostrarOcultarCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCurso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCurso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCurso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCurso;
	public JLabel jLabelIdCurso;
	public JLabel jLabelidCurso;
	public JButton jButtonidCursoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCurso;
	public JLabel jLabelnombreCurso;
	public JTextArea jTextAreanombreCurso;
	public JScrollPane jscrollPanenombreCurso;
	public JButton jButtonnombreCursoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_inscripcionCurso;
	public JLabel jLabelcodigo_inscripcionCurso;
	public JTextField jTextFieldcodigo_inscripcionCurso;
	public JButton jButtoncodigo_inscripcionCursoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioCurso;
	public JLabel jLabelfecha_inicioCurso;
	//public JFormattedTextField jDateChooserfecha_inicioCurso;

	public JDateChooser jDateChooserfecha_inicioCurso;
	public JButton jButtonfecha_inicioCursoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finCurso;
	public JLabel jLabelfecha_finCurso;
	//public JFormattedTextField jDateChooserfecha_finCurso;

	public JDateChooser jDateChooserfecha_finCurso;
	public JButton jButtonfecha_finCursoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horasCurso;
	public JLabel jLabelnumero_horasCurso;
	public JTextField jTextFieldnumero_horasCurso;
	public JButton jButtonnumero_horasCursoBusqueda= new JButtonMe();

	public JPanel jPaneles_aprobadoCurso;
	public JLabel jLabeles_aprobadoCurso;
	public JCheckBox jCheckBoxes_aprobadoCurso;
	public JButton jButtones_aprobadoCursoBusqueda= new JButtonMe();

	public JPanel jPaneles_auspicio_empresaCurso;
	public JLabel jLabeles_auspicio_empresaCurso;
	public JCheckBox jCheckBoxes_auspicio_empresaCurso;
	public JButton jButtones_auspicio_empresaCursoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCurso;
	public JLabel jLabeldescripcionCurso;
	public JTextArea jTextAreadescripcionCurso;
	public JScrollPane jscrollPanedescripcionCurso;
	public JButton jButtondescripcionCursoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCurso;
	public JLabel jLabelid_empresaCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCurso;
	public JButton jButtonid_empresaCurso= new JButtonMe();
	public JButton jButtonid_empresaCursoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCursoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCurso;
	public JLabel jLabelid_empleadoCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCurso;
	public JButton jButtonid_empleadoCurso= new JButtonMe();
	public JButton jButtonid_empleadoCursoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCursoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cursoCurso;
	public JLabel jLabelid_tipo_cursoCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cursoCurso;
	public JButton jButtonid_tipo_cursoCurso= new JButtonMe();
	public JButton jButtonid_tipo_cursoCursoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cursoCursoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_institucionCurso;
	public JLabel jLabelid_tipo_institucionCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_institucionCurso;
	public JButton jButtonid_tipo_institucionCurso= new JButtonMe();
	public JButton jButtonid_tipo_institucionCursoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_institucionCursoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCurso;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CursoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCurso=new JPanel();
				this.jPanelAccionesFormularioCurso=new JPanel();
				this.jmenuBarDetalleCurso=new JMenuBar();
				this.jTtoolBarDetalleCurso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CursoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CursoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Curso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCurso() {
		return this.jButtonActualizarToolBarCurso;
	}
	
	public JButton getjButtonEliminarToolBarCurso() {
		return this.jButtonEliminarToolBarCurso;
	}
	
	public JButton getjButtonCancelarToolBarCurso() {
		return this.jButtonCancelarToolBarCurso;
	}		
	
	public JButton getjButtonProcesarInformacionCurso() {
		return this.jButtonProcesarInformacionCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCurso)	{
		this.jButtonProcesarInformacionCurso = jButtonProcesarInformacionCurso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCurso() {
		return this.jComboBoxTiposAccionesCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCurso(
			JComboBox jComboBoxTiposRelacionesCurso) {
		this.jComboBoxTiposRelacionesCurso = jComboBoxTiposRelacionesCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCurso(
			JComboBox jComboBoxTiposAccionesCurso) {
		this.jComboBoxTiposAccionesCurso = jComboBoxTiposAccionesCurso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCurso() {
		return this.jComboBoxTiposAccionesFormularioCurso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCurso(
			JComboBox jComboBoxTiposAccionesFormularioCurso) {
		this.jComboBoxTiposAccionesFormularioCurso = jComboBoxTiposAccionesFormularioCurso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cursoSessionBean=new CursoSessionBean();
		
		this.cursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cursoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallecursoSessionBean=new DetalleCursoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Curso MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
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
	
		CursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCurso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCurso=new JButtonMe();
				this.jButtonModificarToolBarCurso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCurso,this.jTtoolBarDetalleCurso,
							"actualizar","actualizar","Actualizar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCurso,this.jTtoolBarDetalleCurso,
							"eliminar","eliminar","Eliminar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCurso,this.jTtoolBarDetalleCurso,
							"cancelar","cancelar","Cancelar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCurso,this.jTtoolBarDetalleCurso,
							"guardarcambios","guardarcambios","Guardar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCurso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCurso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCurso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCurso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCurso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCurso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCurso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCurso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCurso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCurso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCurso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCurso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCurso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCurso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCurso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCurso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCurso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCurso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCurso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCurso.add(this.jMenuItemDetalleCerrarCurso);
		
		this.jmenuDetalleAccionesCurso.add(this.jMenuItemActualizarCurso);
		this.jmenuDetalleAccionesCurso.add(this.jMenuItemEliminarCurso);
		this.jmenuDetalleAccionesCurso.add(this.jMenuItemCancelarCurso);		
		
		//this.jmenuDetalleDatosCurso.add(this.jMenuItemDetalleAbrirOrderByCurso);				
		this.jmenuDetalleDatosCurso.add(this.jMenuItemDetalleMostarOcultarCurso);				
				
		//this.jmenuDetalleAccionesCurso.add(this.jMenuItemGuardarCambiosCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCurso.add(this.jmenuDetalleArchivoCurso);		
		this.jmenuBarDetalleCurso.add(this.jmenuDetalleAccionesCurso);		
		this.jmenuBarDetalleCurso.add(this.jmenuDetalleDatosCurso);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCurso.add(this.jmenuDetalleCurso);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCurso);				
	}
	
	
	public void inicializarElementosCamposCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCurso = new JLabelMe();
		jLabelIdCurso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCurso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCurso.setToolTipText(CursoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCurso= new GridBagLayout();

		this.jPanelidCurso.setLayout(this.gridaBagLayoutCurso);

		jLabelidCurso = new JLabel();
		jLabelidCurso.setText("Id");

		jLabelidCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCurso = new JLabelMe();
		this.jLabelnombreCurso.setText(""+CursoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCurso.setToolTipText("Nombre");
		this.jLabelnombreCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCurso.setToolTipText(CursoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelnombreCurso.setLayout(this.gridaBagLayoutCurso);


		jTextAreanombreCurso= new JTextAreaMe();
		jTextAreanombreCurso.setEnabled(false);
		jTextAreanombreCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCurso.setLineWrap(true);
		jTextAreanombreCurso.setWrapStyleWord(true);
		jTextAreanombreCurso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCurso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCurso = new JScrollPane(jTextAreanombreCurso);
		jscrollPanenombreCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCursoBusqueda= new JButtonMe();
		this.jButtonnombreCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCursoBusqueda.setText("U");
		this.jButtonnombreCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCursoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_inscripcionCurso = new JLabelMe();
		this.jLabelcodigo_inscripcionCurso.setText(""+CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION+" : *");
		this.jLabelcodigo_inscripcionCurso.setToolTipText("Codigo Inscripcion");
		this.jLabelcodigo_inscripcionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_inscripcionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_inscripcionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_inscripcionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_inscripcionCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_inscripcionCurso.setToolTipText(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelcodigo_inscripcionCurso.setLayout(this.gridaBagLayoutCurso);


		jTextFieldcodigo_inscripcionCurso= new JTextFieldMe();

		jTextFieldcodigo_inscripcionCurso.setEnabled(false);
		jTextFieldcodigo_inscripcionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_inscripcionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_inscripcionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_inscripcionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_inscripcionCursoBusqueda= new JButtonMe();
		this.jButtoncodigo_inscripcionCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_inscripcionCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_inscripcionCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_inscripcionCursoBusqueda.setText("U");
		this.jButtoncodigo_inscripcionCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_inscripcionCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_inscripcionCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_inscripcionCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_inscripcionCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_inscripcionCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_inscripcionCursoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioCurso = new JLabelMe();
		this.jLabelfecha_inicioCurso.setText(""+CursoConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioCurso.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioCurso.setToolTipText(CursoConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelfecha_inicioCurso.setLayout(this.gridaBagLayoutCurso);


		//jFormattedTextFieldfecha_inicioCurso= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioCurso= new JDateChooser();
		jDateChooserfecha_inicioCurso.setEnabled(false);
		jDateChooserfecha_inicioCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioCurso.setDate(new Date());
		jDateChooserfecha_inicioCurso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioCurso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioCursoBusqueda= new JButtonMe();
		this.jButtonfecha_inicioCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioCursoBusqueda.setText("U");
		this.jButtonfecha_inicioCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioCursoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finCurso = new JLabelMe();
		this.jLabelfecha_finCurso.setText(""+CursoConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finCurso.setToolTipText("Fecha Fin");
		this.jLabelfecha_finCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finCurso.setToolTipText(CursoConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelfecha_finCurso.setLayout(this.gridaBagLayoutCurso);


		//jFormattedTextFieldfecha_finCurso= new JFormattedTextFieldMe();

		jDateChooserfecha_finCurso= new JDateChooser();
		jDateChooserfecha_finCurso.setEnabled(false);
		jDateChooserfecha_finCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finCurso.setDate(new Date());
		jDateChooserfecha_finCurso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finCurso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finCursoBusqueda= new JButtonMe();
		this.jButtonfecha_finCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finCursoBusqueda.setText("U");
		this.jButtonfecha_finCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finCursoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horasCurso = new JLabelMe();
		this.jLabelnumero_horasCurso.setText(""+CursoConstantesFunciones.LABEL_NUMEROHORAS+" : *");
		this.jLabelnumero_horasCurso.setToolTipText("Numero Horas");
		this.jLabelnumero_horasCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horasCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horasCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horasCurso.setToolTipText(CursoConstantesFunciones.LABEL_NUMEROHORAS);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelnumero_horasCurso.setLayout(this.gridaBagLayoutCurso);


		jTextFieldnumero_horasCurso= new JTextFieldMe();
		jTextFieldnumero_horasCurso.setEnabled(false);
		jTextFieldnumero_horasCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horasCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horasCurso.setText("0");

		this.jButtonnumero_horasCursoBusqueda= new JButtonMe();
		this.jButtonnumero_horasCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horasCursoBusqueda.setText("U");
		this.jButtonnumero_horasCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horasCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horasCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horasCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horasCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horasCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horasCursoBusqueda.setVisible(false);		}


					
		this.jLabeles_aprobadoCurso = new JLabelMe();
		this.jLabeles_aprobadoCurso.setText(""+CursoConstantesFunciones.LABEL_ESAPROBADO+" : *");
		this.jLabeles_aprobadoCurso.setToolTipText("Es Aprobado");
		this.jLabeles_aprobadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_aprobadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_aprobadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_aprobadoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_aprobadoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_aprobadoCurso.setToolTipText(CursoConstantesFunciones.LABEL_ESAPROBADO);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPaneles_aprobadoCurso.setLayout(this.gridaBagLayoutCurso);


		jCheckBoxes_aprobadoCurso= new JCheckBoxMe();
		jCheckBoxes_aprobadoCurso.setEnabled(false);

		jCheckBoxes_aprobadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_aprobadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_aprobadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_aprobadoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_aprobadoCursoBusqueda= new JButtonMe();
		this.jButtones_aprobadoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_aprobadoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_aprobadoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_aprobadoCursoBusqueda.setText("U");
		this.jButtones_aprobadoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_aprobadoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_aprobadoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_aprobadoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_aprobadoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_aprobadoCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_aprobadoCursoBusqueda.setVisible(false);		}


					
		this.jLabeles_auspicio_empresaCurso = new JLabelMe();
		this.jLabeles_auspicio_empresaCurso.setText(""+CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA+" : *");
		this.jLabeles_auspicio_empresaCurso.setToolTipText("Es Auspicio Empresa");
		this.jLabeles_auspicio_empresaCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_auspicio_empresaCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_auspicio_empresaCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_auspicio_empresaCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_auspicio_empresaCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_auspicio_empresaCurso.setToolTipText(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPaneles_auspicio_empresaCurso.setLayout(this.gridaBagLayoutCurso);


		jCheckBoxes_auspicio_empresaCurso= new JCheckBoxMe();
		jCheckBoxes_auspicio_empresaCurso.setEnabled(false);

		jCheckBoxes_auspicio_empresaCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_auspicio_empresaCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_auspicio_empresaCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_auspicio_empresaCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_auspicio_empresaCursoBusqueda= new JButtonMe();
		this.jButtones_auspicio_empresaCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_auspicio_empresaCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_auspicio_empresaCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_auspicio_empresaCursoBusqueda.setText("U");
		this.jButtones_auspicio_empresaCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_auspicio_empresaCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_auspicio_empresaCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_auspicio_empresaCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_auspicio_empresaCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_auspicio_empresaCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_auspicio_empresaCursoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCurso = new JLabelMe();
		this.jLabeldescripcionCurso.setText(""+CursoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCurso.setToolTipText("Descripcion");
		this.jLabeldescripcionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCurso.setToolTipText(CursoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPaneldescripcionCurso.setLayout(this.gridaBagLayoutCurso);


		jTextAreadescripcionCurso= new JTextAreaMe();
		jTextAreadescripcionCurso.setEnabled(false);
		jTextAreadescripcionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCurso.setLineWrap(true);
		jTextAreadescripcionCurso.setWrapStyleWord(true);
		jTextAreadescripcionCurso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCurso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCurso = new JScrollPane(jTextAreadescripcionCurso);
		jscrollPanedescripcionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCursoBusqueda= new JButtonMe();
		this.jButtondescripcionCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCursoBusqueda.setText("U");
		this.jButtondescripcionCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCursoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCurso = new JLabelMe();
		this.jLabelid_empresaCurso.setText(""+CursoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCurso.setToolTipText("Empresa");
		this.jLabelid_empresaCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCurso.setToolTipText(CursoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelid_empresaCurso.setLayout(this.gridaBagLayoutCurso);


		jComboBoxid_empresaCurso= new JComboBoxMe();
		jComboBoxid_empresaCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCurso.setEnabled(false);

		this.jButtonid_empresaCurso= new JButtonMe();
		this.jButtonid_empresaCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCurso.setText("Buscar");
		this.jButtonid_empresaCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCurso"));

		this.jButtonid_empresaCursoBusqueda= new JButtonMe();
		this.jButtonid_empresaCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCursoBusqueda.setText("U");
		this.jButtonid_empresaCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCursoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCursoUpdate= new JButtonMe();
		this.jButtonid_empresaCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCursoUpdate.setText("U");
		this.jButtonid_empresaCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCursoUpdate"));



					
		this.jLabelid_empleadoCurso = new JLabelMe();
		this.jLabelid_empleadoCurso.setText(""+CursoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCurso.setToolTipText("Empleado");
		this.jLabelid_empleadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCurso.setToolTipText(CursoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelid_empleadoCurso.setLayout(this.gridaBagLayoutCurso);


		jComboBoxid_empleadoCurso= new JComboBoxMe();
		jComboBoxid_empleadoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCurso= new JButtonMe();
		this.jButtonid_empleadoCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCurso.setText("Buscar");
		this.jButtonid_empleadoCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCurso"));

		this.jButtonid_empleadoCursoBusqueda= new JButtonMe();
		this.jButtonid_empleadoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCursoBusqueda.setText("U");
		this.jButtonid_empleadoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCursoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCursoUpdate= new JButtonMe();
		this.jButtonid_empleadoCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCursoUpdate.setText("U");
		this.jButtonid_empleadoCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCursoUpdate"));



					
		this.jLabelid_tipo_cursoCurso = new JLabelMe();
		this.jLabelid_tipo_cursoCurso.setText(""+CursoConstantesFunciones.LABEL_IDTIPOCURSO+" : *");
		this.jLabelid_tipo_cursoCurso.setToolTipText("Tipo Curso");
		this.jLabelid_tipo_cursoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cursoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cursoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cursoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cursoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cursoCurso.setToolTipText(CursoConstantesFunciones.LABEL_IDTIPOCURSO);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelid_tipo_cursoCurso.setLayout(this.gridaBagLayoutCurso);


		jComboBoxid_tipo_cursoCurso= new JComboBoxMe();
		jComboBoxid_tipo_cursoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cursoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cursoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cursoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cursoCurso= new JButtonMe();
		this.jButtonid_tipo_cursoCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cursoCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cursoCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cursoCurso.setText("Buscar");
		this.jButtonid_tipo_cursoCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cursoCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cursoCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cursoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cursoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cursoCurso"));

		this.jButtonid_tipo_cursoCursoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cursoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cursoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cursoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cursoCursoBusqueda.setText("U");
		this.jButtonid_tipo_cursoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cursoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cursoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cursoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cursoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cursoCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cursoCursoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cursoCursoUpdate= new JButtonMe();
		this.jButtonid_tipo_cursoCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cursoCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cursoCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cursoCursoUpdate.setText("U");
		this.jButtonid_tipo_cursoCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cursoCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cursoCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cursoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cursoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cursoCursoUpdate"));



					
		this.jLabelid_tipo_institucionCurso = new JLabelMe();
		this.jLabelid_tipo_institucionCurso.setText(""+CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION+" : *");
		this.jLabelid_tipo_institucionCurso.setToolTipText("Tipo Institucion");
		this.jLabelid_tipo_institucionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_institucionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_institucionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_institucionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_institucionCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_institucionCurso.setToolTipText(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION);
		this.gridaBagLayoutCurso = new GridBagLayout();
		this.jPanelid_tipo_institucionCurso.setLayout(this.gridaBagLayoutCurso);


		jComboBoxid_tipo_institucionCurso= new JComboBoxMe();
		jComboBoxid_tipo_institucionCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_institucionCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_institucionCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_institucionCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_institucionCurso= new JButtonMe();
		this.jButtonid_tipo_institucionCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_institucionCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_institucionCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_institucionCurso.setText("Buscar");
		this.jButtonid_tipo_institucionCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_institucionCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_institucionCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_institucionCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_institucionCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_institucionCurso"));

		this.jButtonid_tipo_institucionCursoBusqueda= new JButtonMe();
		this.jButtonid_tipo_institucionCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_institucionCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_institucionCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_institucionCursoBusqueda.setText("U");
		this.jButtonid_tipo_institucionCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_institucionCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_institucionCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_institucionCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_institucionCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_institucionCursoBusqueda"));

		if(this.cursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_institucionCursoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_institucionCursoUpdate= new JButtonMe();
		this.jButtonid_tipo_institucionCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_institucionCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_institucionCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_institucionCursoUpdate.setText("U");
		this.jButtonid_tipo_institucionCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_institucionCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_institucionCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_institucionCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_institucionCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_institucionCursoUpdate"));



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
		//this.jInternalFrameDetalleCurso = new CursoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Curso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCurso= new GridBagLayout();
		

		
		String sToolTipCurso="";
		sToolTipCurso=CursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCurso+="(Nomina.Curso)";
		}
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCurso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCurso = new JButtonMe();
		this.jButtonModificarCurso = new JButtonMe();
        this.jButtonActualizarCurso = new JButtonMe();
        this.jButtonEliminarCurso = new JButtonMe();
        this.jButtonCancelarCurso = new JButtonMe();
        this.jButtonGuardarCambiosCurso = new JButtonMe();
		this.jButtonGuardarCambiosTablaCurso = new JButtonMe();
		this.jButtonCerrarCurso = new JButtonMe();
		
		this.jScrollPanelDatosCurso = new JScrollPane();   
        this.jScrollPanelDatosEdicionCurso = new JScrollPane();
		this.jScrollPanelDatosGeneralCurso = new JScrollPane();
				
		
		
		this.jPanelCamposCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Curso";
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCurso.setName("jPanelCamposCurso"); 

		this.jPanelCamposOcultosCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCurso.setName("jPanelCamposOcultosCurso"); 

        this.jPanelAccionesCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCurso.setToolTipText("Acciones");
        this.jPanelAccionesCurso.setName("Acciones"); 

		this.jPanelAccionesFormularioCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCurso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCurso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCurso.setText("Nuevo");
		this.jButtonModificarCurso.setText("Editar");
        this.jButtonActualizarCurso.setText("Actualizar");
        this.jButtonEliminarCurso.setText("Eliminar");
        this.jButtonCancelarCurso.setText("Cancelar");
        this.jButtonGuardarCambiosCurso.setText("Guardar");
		this.jButtonGuardarCambiosTablaCurso.setText("Guardar");
		this.jButtonCerrarCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCurso,"nuevo_button","Nuevo",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCurso,"modificar_button","Editar",this.cursoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCurso,"actualizar_button","Actualizar",this.cursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCurso,"eliminar_button","Eliminar",this.cursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCurso,"cancelar_button","Cancelar",this.cursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCurso,"guardarcambios_button","Guardar",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCurso,"guardarcambiostabla_button","Guardar",this.cursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCurso,"cerrar_button","Salir",this.cursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCurso.setToolTipText("Nuevo"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCurso.setToolTipText("Editar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCurso.setToolTipText("Actualizar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCurso.setToolTipText("Eliminar)"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCurso.setToolTipText("Cancelar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCurso.setToolTipText("Guardar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCurso.setToolTipText("Guardar"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCurso.setToolTipText("Salir"+" "+CursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCurso";
		inputMap = this.jButtonNuevoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCurso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCurso";
		inputMap = this.jButtonActualizarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCurso"));
		
		//ELIMINAR
		sMapKey = "EliminarCurso";
		inputMap = this.jButtonEliminarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCurso"));
		
		//CANCELAR	
		sMapKey = "CancelarCurso";
		inputMap = this.jButtonCancelarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCurso"));
		
		//CERRAR		
		sMapKey = "CerrarCurso";
		inputMap = this.jButtonCerrarCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCurso";
		inputMap = this.jButtonGuardarCambiosTablaCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCurso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCurso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCurso.setToolTipText("Nuevo Curso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCurso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCurso.setToolTipText("Sin Cerrar Ventana Curso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCurso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCurso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCurso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCurso.setText("Accion");
		this.jComboBoxTiposAccionesCurso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCurso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCurso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCurso = new JLabelMe();
		
		this.jLabelAccionesCurso.setText("Acciones");		
		this.jLabelAccionesCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCurso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCurso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCurso=new JTabbedPane();
		this.jTabbedPaneRelacionesCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCurso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCurso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCurso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCurso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCurso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCurso = new GridBagLayout();
		
		this.jPanelCamposCurso.setLayout(gridaBagLayoutCamposCurso);
		this.jPanelCamposOcultosCurso.setLayout(gridaBagLayoutCamposOcultosCurso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCurso.add(jLabelIdCurso, this.gridBagConstraintsCurso);



	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCurso.add(jLabelidCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCurso.add(jLabelid_empresaCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCurso.add(jButtonid_empresaCursoBusqueda, this.gridBagConstraintsCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 3;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCurso.add(jButtonid_empresaCursoUpdate, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCurso.add(jComboBoxid_empresaCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCurso.add(jLabelid_empleadoCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCurso = new GridBagConstraints();
	//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 2;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoCurso.add(jButtonid_empleadoCurso, this.gridBagConstraintsCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 3;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCurso.add(jButtonid_empleadoCursoBusqueda, this.gridBagConstraintsCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 4;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCurso.add(jButtonid_empleadoCursoUpdate, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCurso.add(jComboBoxid_empleadoCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cursoCurso.add(jLabelid_tipo_cursoCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cursoCurso.add(jButtonid_tipo_cursoCursoBusqueda, this.gridBagConstraintsCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 3;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cursoCurso.add(jButtonid_tipo_cursoCursoUpdate, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cursoCurso.add(jComboBoxid_tipo_cursoCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_institucionCurso.add(jLabelid_tipo_institucionCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_institucionCurso.add(jButtonid_tipo_institucionCursoBusqueda, this.gridBagConstraintsCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 3;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_institucionCurso.add(jButtonid_tipo_institucionCursoUpdate, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_institucionCurso.add(jComboBoxid_tipo_institucionCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCurso.add(jLabelnombreCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCurso.add(jButtonnombreCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCurso.add(jscrollPanenombreCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_inscripcionCurso.add(jLabelcodigo_inscripcionCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_inscripcionCurso.add(jButtoncodigo_inscripcionCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_inscripcionCurso.add(jTextFieldcodigo_inscripcionCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioCurso.add(jLabelfecha_inicioCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioCurso.add(jButtonfecha_inicioCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioCurso.add(jDateChooserfecha_inicioCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finCurso.add(jLabelfecha_finCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finCurso.add(jButtonfecha_finCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finCurso.add(jDateChooserfecha_finCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horasCurso.add(jLabelnumero_horasCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horasCurso.add(jButtonnumero_horasCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horasCurso.add(jTextFieldnumero_horasCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_aprobadoCurso.add(jLabeles_aprobadoCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_aprobadoCurso.add(jButtones_aprobadoCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_aprobadoCurso.add(jCheckBoxes_aprobadoCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_auspicio_empresaCurso.add(jLabeles_auspicio_empresaCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_auspicio_empresaCurso.add(jButtones_auspicio_empresaCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_auspicio_empresaCurso.add(jCheckBoxes_auspicio_empresaCurso, this.gridBagConstraintsCurso);


	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 0;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCurso.add(jLabeldescripcionCurso, this.gridBagConstraintsCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCurso = new GridBagConstraints();
		//this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = 2;
		this.gridBagConstraintsCurso.ipadx = 0;
		this.gridBagConstraintsCurso.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCurso.add(jButtondescripcionCursoBusqueda, this.gridBagConstraintsCurso);
	}

	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCurso.gridy = 0;
	this.gridBagConstraintsCurso.gridx = 1;
	this.gridBagConstraintsCurso.ipadx = 0;
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCurso.add(jscrollPanedescripcionCurso, this.gridBagConstraintsCurso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelidCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelid_empleadoCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelid_tipo_cursoCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelid_tipo_institucionCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelnombreCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelcodigo_inscripcionCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelfecha_inicioCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelfecha_finCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPanelnumero_horasCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPaneles_aprobadoCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPaneles_auspicio_empresaCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCurso.add(this.jPaneldescripcionCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposCurso % 2==0) {
		iXPanelCamposCurso=0;
		iYPanelCamposCurso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCurso = new GridBagConstraints();
	this.gridBagConstraintsCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCurso.gridy = iYPanelCamposOcultosCurso;
	this.gridBagConstraintsCurso.gridx = iXPanelCamposOcultosCurso++;
	this.gridBagConstraintsCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCurso.add(this.jPanelid_empresaCurso, this.gridBagConstraintsCurso);



	if(iXPanelCamposOcultosCurso % 2==0) {
		iXPanelCamposOcultosCurso=0;
		iYPanelCamposOcultosCurso++;
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
			
		GridBagLayout gridaBagLayoutAccionesCurso= new GridBagLayout();
		this.jPanelAccionesCurso.setLayout(gridaBagLayoutAccionesCurso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCurso= new GridBagLayout();
		this.jPanelAccionesFormularioCurso.setLayout(gridaBagLayoutAccionesFormularioCurso);
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCurso.add(this.jComboBoxTiposAccionesFormularioCurso, this.gridBagConstraintsCurso);

		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCurso.add(this.jCheckBoxPostAccionNuevoCurso, this.gridBagConstraintsCurso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cursoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCurso.add(this.jCheckBoxPostAccionSinCerrarCurso, this.gridBagConstraintsCurso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cursoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCurso.add(this.jCheckBoxPostAccionSinMensajeCurso, this.gridBagConstraintsCurso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx = iPosXAccion++;
			
		this.jPanelAccionesCurso.add(this.jButtonModificarCurso, this.gridBagConstraintsCurso);							

		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCurso.gridy = 0;
		this.gridBagConstraintsCurso.gridx =iPosXAccion++;
			
		this.jPanelAccionesCurso.add(this.jButtonEliminarCurso, this.gridBagConstraintsCurso);
		
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = 0;		
		this.gridBagConstraintsCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCurso.add(this.jButtonActualizarCurso, this.gridBagConstraintsCurso);


		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = 0;		
		this.gridBagConstraintsCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCurso.add(this.jButtonGuardarCambiosCurso, this.gridBagConstraintsCurso);	
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = 0;		
		this.gridBagConstraintsCurso.gridx =iPosXAccion++;
		
		this.jPanelAccionesCurso.add(this.jButtonCancelarCurso, this.gridBagConstraintsCurso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCurso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCurso = new GridBagConstraints();						
			this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCurso.gridx = 0;		
			//this.gridBagConstraintsCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCurso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCurso.gridx =0;
		this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCurso, this.gridBagConstraintsCurso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CursoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCurso = new CursoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Curso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Curso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Curso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CursoModel cursoModel=new CursoModel(this);
			
			//SI USARA CLASE INTERNA
			//CursoModel.CursoFocusTraversalPolicy cursoFocusTraversalPolicy = cursoModel.new CursoFocusTraversalPolicy(this);
			
			//cursoFocusTraversalPolicy.setcursoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cursoModel);
			
			
			this.jContentPaneDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCurso = new GridBagLayout();	
			this.jContentPaneDetalleCurso.setLayout(gridaBagLayoutDetalleCurso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCurso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCurso = new GridBagConstraints();
				this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCurso.gridx = 0;
					
				
				this.jContentPaneDetalleCurso.add(jTtoolBarDetalleCurso, gridBagConstraintsCurso);								
				
}
			
			this.jScrollPanelDatosEdicionCurso=   new JScrollPane(jContentPaneDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCurso.gridx = 0;
	        
			this.jContentPaneDetalleCurso.add(jPanelCamposCurso, gridBagConstraintsCurso);
			
			
			
			
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
						&& cursoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleCurso(this.puedeCargarPorParteDetalleCurso,false,-1);
					
					if(this.cursoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCurso= new GridBagConstraints();
						this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCurso.gridx = 0;
						this.jContentPaneDetalleCurso.add(this.jTabbedPaneRelacionesCurso, this.gridBagConstraintsCurso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCurso.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleCurso(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCurso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCurso = new GridBagConstraints();
					this.gridBagConstraintsCurso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCurso.gridx = 0;
					
				
					this.jContentPaneDetalleCurso.add(jPanelCamposOcultosCurso, gridBagConstraintsCurso);
				
					this.jPanelCamposOcultosCurso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCurso.gridx = 0;
	        this.gridBagConstraintsCurso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCurso.add(this.jPanelAccionesFormularioCurso, this.gridBagConstraintsCurso);							
			
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
	        this.gridBagConstraintsCurso.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCurso.gridx = 0;
	        
			
			this.jContentPaneDetalleCurso.add(this.jPanelAccionesCurso, this.gridBagConstraintsCurso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCurso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCurso=   new JScrollPane(this.jPanelCamposCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCurso.gridx = 0;
			this.gridBagConstraintsCurso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCurso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCurso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCurso, this.gridBagConstraintsCurso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCurso, this.gridBagConstraintsCurso);			
			
			this.gridBagConstraintsCurso = new GridBagConstraints();
			this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCurso, this.gridBagConstraintsCurso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCurso, this.gridBagConstraintsCurso);
			
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCurso, this.gridBagConstraintsCurso);
		
			
		this.gridBagConstraintsCurso = new GridBagConstraints();
		this.gridBagConstraintsCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCurso, this.gridBagConstraintsCurso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCurso;//jContentPane;
		
		return jScrollPanelDatosEdicionCurso;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleCurso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallecursoSessionBean=new DetalleCursoSessionBean();
		this.detallecursoSessionBean.setConGuardarRelaciones(false);
		this.detallecursoSessionBean.setEsGuardarRelacionado(true);

		this.detallecursoBeanSwingJInternalFrame=null;//new DetalleCursoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallecursoBeanSwingJInternalFramePopup=new DetalleCursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallecursoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {

				DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL=CursoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CursoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallecursoSessionBean.setEsGuardarRelacionado(true);

				this.detallecursoBeanSwingJInternalFrame=new DetalleCursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallecursoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallecursoBeanSwingJInternalFrame.setdetallecursoSessionBean(this.detallecursoSessionBean);

				//this.gridBagConstraintsCurso = new GridBagConstraints();
				//this.gridBagConstraintsCurso.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCurso.gridx = 0;
				//this.jContentPaneDetalleCurso.add(this.detallecursoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCurso);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCurso.add("Detalle Cursos",this.detallecursoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCurso.setComponentAt(iIndexTab,this.detallecursoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallecursoSessionBean.setEsGuardarRelacionado(false);
				this.detallecursoBeanSwingJInternalFrame=null;//new DetalleCursoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCurso) {
					this.jTabbedPaneRelacionesCurso.add("Detalle Cursos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleCursoBeanSwingJInternalFrame(List<Curso> cursos,Curso curso,DetalleCursoBeanSwingJInternalFrame detallecursoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallecursoBeanSwingJInternalFrame=new DetalleCursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallecursoBeanSwingJInternalFrame.getDetalleCursoLogic().setConnexion(this.cursoLogic.getConnexion());

					detallecursoBeanSwingJInternalFrame.setcursosForeignKey(cursos);
					detallecursoBeanSwingJInternalFrame.setcursoForeignKey(curso);
					detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setisBusquedaDesdeForeignKeySesionCurso(true);
					detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setlidCursoActual(curso.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallecursoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCurso(detallecursoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallecursoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCurso(true);
					detallecursoBeanSwingJInternalFrame.setid_cursoFK_IdCurso(curso.getId());

					if(!this.conCargarFormDetalle) {
						detallecursoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallecursoBeanSwingJInternalFrame.setSelectedItemCombosFrameCursoForeignKey(curso,1,false,true,true);
					detallecursoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallecursoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCurso");
					detallecursoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCurso");
					detallecursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCurso(true);
					detallecursoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCurso("n",detallecursoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallecursoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallecursoBeanSwingJInternalFrame.setAutoscrolls(true);
					detallecursoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallecursoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCurso("relacionado");
					} else {
						detallecursoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCurso("no_relacionado");
					}

					detallecursoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCurso().setVisible(false);

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
