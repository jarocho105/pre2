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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoTotalizarSaldosConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoTotalizarSaldosDetalleFormJInternalFrame extends ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoTotalizarSaldos;
	
	protected JMenuBar jmenuBarDetalleProcesoTotalizarSaldos;
	
	protected JMenu jmenuDetalleProcesoTotalizarSaldos;
	protected JMenu jmenuDetalleArchivoProcesoTotalizarSaldos;
	protected JMenu jmenuDetalleAccionesProcesoTotalizarSaldos;
	protected JMenu jmenuDetalleDatosProcesoTotalizarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoTotalizarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoTotalizarSaldos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoTotalizarSaldos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public ProcesoTotalizarSaldosSessionBean procesototalizarsaldosSessionBean;
	
	
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public ProcesoTotalizarSaldosLogic procesototalizarsaldosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoTotalizarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoTotalizarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoTotalizarSaldos;
	
	protected JPanel jPanelCamposProcesoTotalizarSaldos;    
	protected JPanel jPanelCamposOcultosProcesoTotalizarSaldos;    	
	protected JPanel jPanelAccionesProcesoTotalizarSaldos;
	protected JPanel jPanelAccionesFormularioProcesoTotalizarSaldos;
    
	
	
	protected Integer iXPanelCamposProcesoTotalizarSaldos=0;
	protected Integer iYPanelCamposProcesoTotalizarSaldos=0;
	
	protected Integer iXPanelCamposOcultosProcesoTotalizarSaldos=0;
	protected Integer iYPanelCamposOcultosProcesoTotalizarSaldos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoTotalizarSaldos;
	public JButton jButtonModificarProcesoTotalizarSaldos;
	public JButton jButtonActualizarProcesoTotalizarSaldos;
    public JButton jButtonEliminarProcesoTotalizarSaldos;
	public JButton jButtonCancelarProcesoTotalizarSaldos;
    public JButton jButtonGuardarCambiosProcesoTotalizarSaldos;
	public JButton jButtonGuardarCambiosTablaProcesoTotalizarSaldos;
	protected JButton jButtonCerrarProcesoTotalizarSaldos;
	
	
	protected JButton jButtonProcesarInformacionProcesoTotalizarSaldos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoTotalizarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoTotalizarSaldos;
	protected JButton jButtonModificarToolBarProcesoTotalizarSaldos;
	protected JButton jButtonActualizarToolBarProcesoTotalizarSaldos;
    protected JButton jButtonEliminarToolBarProcesoTotalizarSaldos;
	protected JButton jButtonCancelarToolBarProcesoTotalizarSaldos;
    protected JButton jButtonGuardarCambiosToolBarProcesoTotalizarSaldos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoTotalizarSaldos;
	protected JButton jButtonCerrarToolBarProcesoTotalizarSaldos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoTotalizarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemModificarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemActualizarProcesoTotalizarSaldos;
    protected JMenuItem jMenuItemEliminarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemCancelarProcesoTotalizarSaldos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoTotalizarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoTotalizarSaldos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoTotalizarSaldos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoTotalizarSaldos;
	public JLabel jLabelIdProcesoTotalizarSaldos;
	public JLabel jLabelidProcesoTotalizarSaldos;
	public JButton jButtonidProcesoTotalizarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioProcesoTotalizarSaldos;
	public JLabel jLabelid_ejercicioProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoTotalizarSaldos;
	public JButton jButtonid_ejercicioProcesoTotalizarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoTotalizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoTotalizarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoProcesoTotalizarSaldos;
	public JLabel jLabelid_periodoProcesoTotalizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoProcesoTotalizarSaldos;
	public JButton jButtonid_periodoProcesoTotalizarSaldos= new JButtonMe();
	public JButton jButtonid_periodoProcesoTotalizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoProcesoTotalizarSaldosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoTotalizarSaldos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=154;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoTotalizarSaldos=new JPanel();
				this.jPanelAccionesFormularioProcesoTotalizarSaldos=new JPanel();
				this.jmenuBarDetalleProcesoTotalizarSaldos=new JMenuBar();
				this.jTtoolBarDetalleProcesoTotalizarSaldos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTotalizarSaldosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoTotalizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoTotalizarSaldos() {
		return this.jButtonActualizarToolBarProcesoTotalizarSaldos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoTotalizarSaldos() {
		return this.jButtonEliminarToolBarProcesoTotalizarSaldos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoTotalizarSaldos() {
		return this.jButtonCancelarToolBarProcesoTotalizarSaldos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoTotalizarSaldos() {
		return this.jButtonProcesarInformacionProcesoTotalizarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoTotalizarSaldos)	{
		this.jButtonProcesarInformacionProcesoTotalizarSaldos = jButtonProcesarInformacionProcesoTotalizarSaldos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoTotalizarSaldos() {
		return this.jComboBoxTiposAccionesProcesoTotalizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoTotalizarSaldos) {
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos = jComboBoxTiposRelacionesProcesoTotalizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoTotalizarSaldos) {
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos = jComboBoxTiposAccionesProcesoTotalizarSaldos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoTotalizarSaldos() {
		return this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoTotalizarSaldos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos) {
		this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos = jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
		
		this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesototalizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoTotalizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoTotalizarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Totalizar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoTotalizarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoTotalizarSaldos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoTotalizarSaldos=new JButtonMe();
				this.jButtonModificarToolBarProcesoTotalizarSaldos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoTotalizarSaldos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoTotalizarSaldos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoTotalizarSaldos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoTotalizarSaldos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoTotalizarSaldos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoTotalizarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoTotalizarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoTotalizarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoTotalizarSaldos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoTotalizarSaldos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoTotalizarSaldos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoTotalizarSaldos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoTotalizarSaldos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoTotalizarSaldos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoTotalizarSaldos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoTotalizarSaldos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoTotalizarSaldos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoTotalizarSaldos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoTotalizarSaldos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoTotalizarSaldos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoTotalizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoTotalizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoTotalizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoTotalizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoTotalizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoTotalizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoTotalizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoTotalizarSaldos.add(this.jMenuItemDetalleCerrarProcesoTotalizarSaldos);
		
		this.jmenuDetalleAccionesProcesoTotalizarSaldos.add(this.jMenuItemActualizarProcesoTotalizarSaldos);
		this.jmenuDetalleAccionesProcesoTotalizarSaldos.add(this.jMenuItemEliminarProcesoTotalizarSaldos);
		this.jmenuDetalleAccionesProcesoTotalizarSaldos.add(this.jMenuItemCancelarProcesoTotalizarSaldos);		
		
		//this.jmenuDetalleDatosProcesoTotalizarSaldos.add(this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos);				
		this.jmenuDetalleDatosProcesoTotalizarSaldos.add(this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos);				
				
		//this.jmenuDetalleAccionesProcesoTotalizarSaldos.add(this.jMenuItemGuardarCambiosProcesoTotalizarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoTotalizarSaldos.add(this.jmenuDetalleArchivoProcesoTotalizarSaldos);		
		this.jmenuBarDetalleProcesoTotalizarSaldos.add(this.jmenuDetalleAccionesProcesoTotalizarSaldos);		
		this.jmenuBarDetalleProcesoTotalizarSaldos.add(this.jmenuDetalleDatosProcesoTotalizarSaldos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoTotalizarSaldos);				
	}
	
	
	public void inicializarElementosCamposProcesoTotalizarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoTotalizarSaldos = new JLabelMe();
		jLabelIdProcesoTotalizarSaldos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoTotalizarSaldos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoTotalizarSaldos.setToolTipText(ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoTotalizarSaldos= new GridBagLayout();

		this.jPanelidProcesoTotalizarSaldos.setLayout(this.gridaBagLayoutProcesoTotalizarSaldos);

		jLabelidProcesoTotalizarSaldos = new JLabel();
		jLabelidProcesoTotalizarSaldos.setText("Id");

		jLabelidProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoTotalizarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_ejercicioProcesoTotalizarSaldos = new JLabelMe();
		this.jLabelid_ejercicioProcesoTotalizarSaldos.setText(""+ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoTotalizarSaldos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoTotalizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoTotalizarSaldos.setToolTipText(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoTotalizarSaldos = new GridBagLayout();
		this.jPanelid_ejercicioProcesoTotalizarSaldos.setLayout(this.gridaBagLayoutProcesoTotalizarSaldos);


		jComboBoxid_ejercicioProcesoTotalizarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoTotalizarSaldos.setEnabled(false);

		this.jButtonid_ejercicioProcesoTotalizarSaldos= new JButtonMe();
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setText("Buscar");
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoTotalizarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoTotalizarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoTotalizarSaldos"));

		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoTotalizarSaldosBusqueda"));

		if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setText("U");
		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoTotalizarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoTotalizarSaldosUpdate"));



					
		this.jLabelid_periodoProcesoTotalizarSaldos = new JLabelMe();
		this.jLabelid_periodoProcesoTotalizarSaldos.setText(""+ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoProcesoTotalizarSaldos.setToolTipText("Periodo");
		this.jLabelid_periodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoProcesoTotalizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoProcesoTotalizarSaldos.setToolTipText(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutProcesoTotalizarSaldos = new GridBagLayout();
		this.jPanelid_periodoProcesoTotalizarSaldos.setLayout(this.gridaBagLayoutProcesoTotalizarSaldos);


		jComboBoxid_periodoProcesoTotalizarSaldos= new JComboBoxMe();
		jComboBoxid_periodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoProcesoTotalizarSaldos.setEnabled(false);

		this.jButtonid_periodoProcesoTotalizarSaldos= new JButtonMe();
		this.jButtonid_periodoProcesoTotalizarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoTotalizarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoTotalizarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoTotalizarSaldos.setText("Buscar");
		this.jButtonid_periodoProcesoTotalizarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoProcesoTotalizarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoTotalizarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoTotalizarSaldos"));

		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda= new JButtonMe();
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setText("U");
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoTotalizarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoTotalizarSaldosBusqueda"));

		if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoProcesoTotalizarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_periodoProcesoTotalizarSaldosUpdate= new JButtonMe();
		this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setText("U");
		this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoProcesoTotalizarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoTotalizarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoTotalizarSaldosUpdate"));



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
		//this.jInternalFrameDetalleProcesoTotalizarSaldos = new ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Totalizar Saldos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoTotalizarSaldos= new GridBagLayout();
		

		
		String sToolTipProcesoTotalizarSaldos="";
		sToolTipProcesoTotalizarSaldos=ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoTotalizarSaldos+="(Contabilidad.ProcesoTotalizarSaldos)";
		}
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoTotalizarSaldos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonModificarProcesoTotalizarSaldos = new JButtonMe();
        this.jButtonActualizarProcesoTotalizarSaldos = new JButtonMe();
        this.jButtonEliminarProcesoTotalizarSaldos = new JButtonMe();
        this.jButtonCancelarProcesoTotalizarSaldos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoTotalizarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoTotalizarSaldos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoTotalizarSaldos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoTotalizarSaldos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Totalizar Saldos";
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Totalizar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoTotalizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoTotalizarSaldos.setName("jPanelCamposProcesoTotalizarSaldos"); 

		this.jPanelCamposOcultosProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoTotalizarSaldos.setName("jPanelCamposOcultosProcesoTotalizarSaldos"); 

        this.jPanelAccionesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoTotalizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoTotalizarSaldos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoTotalizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoTotalizarSaldos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoTotalizarSaldos.setText("Nuevo");
		this.jButtonModificarProcesoTotalizarSaldos.setText("Editar");
        this.jButtonActualizarProcesoTotalizarSaldos.setText("Actualizar");
        this.jButtonEliminarProcesoTotalizarSaldos.setText("Eliminar");
        this.jButtonCancelarProcesoTotalizarSaldos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoTotalizarSaldos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoTotalizarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoTotalizarSaldos,"nuevo_button","Nuevo",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoTotalizarSaldos,"modificar_button","Editar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoTotalizarSaldos,"actualizar_button","Actualizar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoTotalizarSaldos,"eliminar_button","Eliminar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoTotalizarSaldos,"cancelar_button","Cancelar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoTotalizarSaldos,"guardarcambios_button","Guardar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos,"guardarcambiostabla_button","Guardar",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoTotalizarSaldos,"cerrar_button","Salir",this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoTotalizarSaldos.setToolTipText("Nuevo"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoTotalizarSaldos.setToolTipText("Editar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoTotalizarSaldos.setToolTipText("Actualizar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoTotalizarSaldos.setToolTipText("Eliminar)"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoTotalizarSaldos.setToolTipText("Cancelar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoTotalizarSaldos.setToolTipText("Guardar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setToolTipText("Guardar"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoTotalizarSaldos.setToolTipText("Salir"+" "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoTotalizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoTotalizarSaldos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoTotalizarSaldos";
		inputMap = this.jButtonActualizarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoTotalizarSaldos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoTotalizarSaldos";
		inputMap = this.jButtonEliminarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoTotalizarSaldos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoTotalizarSaldos";
		inputMap = this.jButtonCancelarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoTotalizarSaldos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoTotalizarSaldos";
		inputMap = this.jButtonCerrarProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoTotalizarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoTotalizarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoTotalizarSaldos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos.setToolTipText("Nuevo ProcesoTotalizarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos.setToolTipText("Sin Cerrar Ventana ProcesoTotalizarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoTotalizarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoTotalizarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoTotalizarSaldos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoTotalizarSaldos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoTotalizarSaldos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoTotalizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoTotalizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoTotalizarSaldos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoTotalizarSaldos = new GridBagLayout();
		
		this.jPanelCamposProcesoTotalizarSaldos.setLayout(gridaBagLayoutCamposProcesoTotalizarSaldos);
		this.jPanelCamposOcultosProcesoTotalizarSaldos.setLayout(gridaBagLayoutCamposOcultosProcesoTotalizarSaldos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoTotalizarSaldos.add(jLabelIdProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoTotalizarSaldos.add(jLabelidProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);


	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoTotalizarSaldos.add(jLabelid_ejercicioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoTotalizarSaldos.add(jButtonid_ejercicioProcesoTotalizarSaldosBusqueda, this.gridBagConstraintsProcesoTotalizarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoTotalizarSaldos.add(jButtonid_ejercicioProcesoTotalizarSaldosUpdate, this.gridBagConstraintsProcesoTotalizarSaldos);
	}

	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoTotalizarSaldos.add(jComboBoxid_ejercicioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);


	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoProcesoTotalizarSaldos.add(jLabelid_periodoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoTotalizarSaldos.add(jButtonid_periodoProcesoTotalizarSaldosBusqueda, this.gridBagConstraintsProcesoTotalizarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoTotalizarSaldos.add(jButtonid_periodoProcesoTotalizarSaldosUpdate, this.gridBagConstraintsProcesoTotalizarSaldos);
	}

	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoProcesoTotalizarSaldos.add(jComboBoxid_periodoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iYPanelCamposProcesoTotalizarSaldos;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iXPanelCamposProcesoTotalizarSaldos++;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoTotalizarSaldos.add(this.jPanelidProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	if(iXPanelCamposProcesoTotalizarSaldos % 1==0) {
		iXPanelCamposProcesoTotalizarSaldos=0;
		iYPanelCamposProcesoTotalizarSaldos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iYPanelCamposOcultosProcesoTotalizarSaldos;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iXPanelCamposOcultosProcesoTotalizarSaldos++;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoTotalizarSaldos.add(this.jPanelid_ejercicioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	if(iXPanelCamposOcultosProcesoTotalizarSaldos % 1==0) {
		iXPanelCamposOcultosProcesoTotalizarSaldos=0;
		iYPanelCamposOcultosProcesoTotalizarSaldos++;
	}
	this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iYPanelCamposOcultosProcesoTotalizarSaldos;
	this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iXPanelCamposOcultosProcesoTotalizarSaldos++;
	this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTotalizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoTotalizarSaldos.add(this.jPanelid_periodoProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);



	if(iXPanelCamposOcultosProcesoTotalizarSaldos % 1==0) {
		iXPanelCamposOcultosProcesoTotalizarSaldos=0;
		iYPanelCamposOcultosProcesoTotalizarSaldos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoTotalizarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoTotalizarSaldos.setLayout(gridaBagLayoutAccionesProcesoTotalizarSaldos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoTotalizarSaldos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoTotalizarSaldos.setLayout(gridaBagLayoutAccionesFormularioProcesoTotalizarSaldos);
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoTotalizarSaldos.add(this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonModificarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);							

		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonEliminarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonActualizarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);


		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonGuardarCambiosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);	
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoTotalizarSaldos.add(this.jButtonCancelarProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoTotalizarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoTotalizarSaldos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoTotalizarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoTotalizarSaldos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =0;
		this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoTotalizarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoTotalizarSaldos = new ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Totalizar Saldos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Totalizar Saldos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Totalizar Saldos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoTotalizarSaldosModel procesototalizarsaldosModel=new ProcesoTotalizarSaldosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoTotalizarSaldosModel.ProcesoTotalizarSaldosFocusTraversalPolicy procesototalizarsaldosFocusTraversalPolicy = procesototalizarsaldosModel.new ProcesoTotalizarSaldosFocusTraversalPolicy(this);
			
			//procesototalizarsaldosFocusTraversalPolicy.setprocesototalizarsaldosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesototalizarsaldosModel);
			
			
			this.jContentPaneDetalleProcesoTotalizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoTotalizarSaldos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoTotalizarSaldos.setLayout(gridaBagLayoutDetalleProcesoTotalizarSaldos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoTotalizarSaldos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoTotalizarSaldos.add(jTtoolBarDetalleProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos=   new JScrollPane(jContentPaneDetalleProcesoTotalizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoTotalizarSaldos.add(jPanelCamposProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);
			
			
			
			
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
						//&& procesototalizarsaldosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoTotalizarSaldos= new GridBagConstraints();
						this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
						this.jContentPaneDetalleProcesoTotalizarSaldos.add(this.jTabbedPaneRelacionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoTotalizarSaldos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoTotalizarSaldos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
					this.gridBagConstraintsProcesoTotalizarSaldos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoTotalizarSaldos.add(jPanelCamposOcultosProcesoTotalizarSaldos, gridBagConstraintsProcesoTotalizarSaldos);
				
					this.jPanelCamposOcultosProcesoTotalizarSaldos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	        this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoTotalizarSaldos.add(this.jPanelAccionesFormularioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);							
			
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoTotalizarSaldos.add(this.jPanelAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoTotalizarSaldos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos=   new JScrollPane(this.jPanelCamposProcesoTotalizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
			this.gridBagConstraintsProcesoTotalizarSaldos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoTotalizarSaldos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoTotalizarSaldos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);			
			
			this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
			
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		
			
		this.gridBagConstraintsProcesoTotalizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoTotalizarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTotalizarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoTotalizarSaldos, this.gridBagConstraintsProcesoTotalizarSaldos);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoTotalizarSaldos.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoTotalizarSaldos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoTotalizarSaldos;
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
