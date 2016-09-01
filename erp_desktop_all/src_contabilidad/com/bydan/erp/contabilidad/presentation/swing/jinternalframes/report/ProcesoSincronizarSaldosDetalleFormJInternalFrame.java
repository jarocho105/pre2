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
import com.bydan.erp.contabilidad.util.report.ProcesoSincronizarSaldosConstantesFunciones;

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
public class ProcesoSincronizarSaldosDetalleFormJInternalFrame extends ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoSincronizarSaldos;
	
	protected JMenuBar jmenuBarDetalleProcesoSincronizarSaldos;
	
	protected JMenu jmenuDetalleProcesoSincronizarSaldos;
	protected JMenu jmenuDetalleArchivoProcesoSincronizarSaldos;
	protected JMenu jmenuDetalleAccionesProcesoSincronizarSaldos;
	protected JMenu jmenuDetalleDatosProcesoSincronizarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoSincronizarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoSincronizarSaldos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoSincronizarSaldos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public ProcesoSincronizarSaldosSessionBean procesosincronizarsaldosSessionBean;
	
	
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public ProcesoSincronizarSaldosLogic procesosincronizarsaldosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoSincronizarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoSincronizarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoSincronizarSaldos;
	
	protected JPanel jPanelCamposProcesoSincronizarSaldos;    
	protected JPanel jPanelCamposOcultosProcesoSincronizarSaldos;    	
	protected JPanel jPanelAccionesProcesoSincronizarSaldos;
	protected JPanel jPanelAccionesFormularioProcesoSincronizarSaldos;
    
	
	
	protected Integer iXPanelCamposProcesoSincronizarSaldos=0;
	protected Integer iYPanelCamposProcesoSincronizarSaldos=0;
	
	protected Integer iXPanelCamposOcultosProcesoSincronizarSaldos=0;
	protected Integer iYPanelCamposOcultosProcesoSincronizarSaldos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoSincronizarSaldos;
	public JButton jButtonModificarProcesoSincronizarSaldos;
	public JButton jButtonActualizarProcesoSincronizarSaldos;
    public JButton jButtonEliminarProcesoSincronizarSaldos;
	public JButton jButtonCancelarProcesoSincronizarSaldos;
    public JButton jButtonGuardarCambiosProcesoSincronizarSaldos;
	public JButton jButtonGuardarCambiosTablaProcesoSincronizarSaldos;
	protected JButton jButtonCerrarProcesoSincronizarSaldos;
	
	
	protected JButton jButtonProcesarInformacionProcesoSincronizarSaldos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoSincronizarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoSincronizarSaldos;
	protected JButton jButtonModificarToolBarProcesoSincronizarSaldos;
	protected JButton jButtonActualizarToolBarProcesoSincronizarSaldos;
    protected JButton jButtonEliminarToolBarProcesoSincronizarSaldos;
	protected JButton jButtonCancelarToolBarProcesoSincronizarSaldos;
    protected JButton jButtonGuardarCambiosToolBarProcesoSincronizarSaldos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoSincronizarSaldos;
	protected JButton jButtonCerrarToolBarProcesoSincronizarSaldos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoSincronizarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemModificarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemActualizarProcesoSincronizarSaldos;
    protected JMenuItem jMenuItemEliminarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemCancelarProcesoSincronizarSaldos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoSincronizarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoSincronizarSaldos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoSincronizarSaldos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoSincronizarSaldos;
	public JLabel jLabelIdProcesoSincronizarSaldos;
	public JLabel jLabelidProcesoSincronizarSaldos;
	public JButton jButtonidProcesoSincronizarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioProcesoSincronizarSaldos;
	public JLabel jLabelid_ejercicioProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoSincronizarSaldos;
	public JButton jButtonid_ejercicioProcesoSincronizarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoSincronizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoSincronizarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoProcesoSincronizarSaldos;
	public JLabel jLabelid_periodoProcesoSincronizarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoProcesoSincronizarSaldos;
	public JButton jButtonid_periodoProcesoSincronizarSaldos= new JButtonMe();
	public JButton jButtonid_periodoProcesoSincronizarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoProcesoSincronizarSaldosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoSincronizarSaldos;
	
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
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoSincronizarSaldos=new JPanel();
				this.jPanelAccionesFormularioProcesoSincronizarSaldos=new JPanel();
				this.jmenuBarDetalleProcesoSincronizarSaldos=new JMenuBar();
				this.jTtoolBarDetalleProcesoSincronizarSaldos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSincronizarSaldosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoSincronizarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoSincronizarSaldos() {
		return this.jButtonActualizarToolBarProcesoSincronizarSaldos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoSincronizarSaldos() {
		return this.jButtonEliminarToolBarProcesoSincronizarSaldos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoSincronizarSaldos() {
		return this.jButtonCancelarToolBarProcesoSincronizarSaldos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoSincronizarSaldos() {
		return this.jButtonProcesarInformacionProcesoSincronizarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoSincronizarSaldos)	{
		this.jButtonProcesarInformacionProcesoSincronizarSaldos = jButtonProcesarInformacionProcesoSincronizarSaldos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoSincronizarSaldos() {
		return this.jComboBoxTiposAccionesProcesoSincronizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoSincronizarSaldos) {
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos = jComboBoxTiposRelacionesProcesoSincronizarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoSincronizarSaldos) {
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos = jComboBoxTiposAccionesProcesoSincronizarSaldos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoSincronizarSaldos() {
		return this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoSincronizarSaldos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos) {
		this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos = jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
		
		this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosincronizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoSincronizarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoSincronizarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sincronizar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoSincronizarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoSincronizarSaldos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoSincronizarSaldos=new JButtonMe();
				this.jButtonModificarToolBarProcesoSincronizarSaldos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoSincronizarSaldos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoSincronizarSaldos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoSincronizarSaldos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoSincronizarSaldos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoSincronizarSaldos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoSincronizarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoSincronizarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoSincronizarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoSincronizarSaldos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoSincronizarSaldos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoSincronizarSaldos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoSincronizarSaldos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoSincronizarSaldos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoSincronizarSaldos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoSincronizarSaldos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoSincronizarSaldos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoSincronizarSaldos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoSincronizarSaldos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoSincronizarSaldos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoSincronizarSaldos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoSincronizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoSincronizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoSincronizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoSincronizarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoSincronizarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoSincronizarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoSincronizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoSincronizarSaldos.add(this.jMenuItemDetalleCerrarProcesoSincronizarSaldos);
		
		this.jmenuDetalleAccionesProcesoSincronizarSaldos.add(this.jMenuItemActualizarProcesoSincronizarSaldos);
		this.jmenuDetalleAccionesProcesoSincronizarSaldos.add(this.jMenuItemEliminarProcesoSincronizarSaldos);
		this.jmenuDetalleAccionesProcesoSincronizarSaldos.add(this.jMenuItemCancelarProcesoSincronizarSaldos);		
		
		//this.jmenuDetalleDatosProcesoSincronizarSaldos.add(this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos);				
		this.jmenuDetalleDatosProcesoSincronizarSaldos.add(this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos);				
				
		//this.jmenuDetalleAccionesProcesoSincronizarSaldos.add(this.jMenuItemGuardarCambiosProcesoSincronizarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoSincronizarSaldos.add(this.jmenuDetalleArchivoProcesoSincronizarSaldos);		
		this.jmenuBarDetalleProcesoSincronizarSaldos.add(this.jmenuDetalleAccionesProcesoSincronizarSaldos);		
		this.jmenuBarDetalleProcesoSincronizarSaldos.add(this.jmenuDetalleDatosProcesoSincronizarSaldos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoSincronizarSaldos);				
	}
	
	
	public void inicializarElementosCamposProcesoSincronizarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoSincronizarSaldos = new JLabelMe();
		jLabelIdProcesoSincronizarSaldos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoSincronizarSaldos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoSincronizarSaldos.setToolTipText(ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoSincronizarSaldos= new GridBagLayout();

		this.jPanelidProcesoSincronizarSaldos.setLayout(this.gridaBagLayoutProcesoSincronizarSaldos);

		jLabelidProcesoSincronizarSaldos = new JLabel();
		jLabelidProcesoSincronizarSaldos.setText("Id");

		jLabelidProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoSincronizarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_ejercicioProcesoSincronizarSaldos = new JLabelMe();
		this.jLabelid_ejercicioProcesoSincronizarSaldos.setText(""+ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoSincronizarSaldos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoSincronizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoSincronizarSaldos.setToolTipText(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoSincronizarSaldos = new GridBagLayout();
		this.jPanelid_ejercicioProcesoSincronizarSaldos.setLayout(this.gridaBagLayoutProcesoSincronizarSaldos);


		jComboBoxid_ejercicioProcesoSincronizarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoSincronizarSaldos.setEnabled(false);

		this.jButtonid_ejercicioProcesoSincronizarSaldos= new JButtonMe();
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setText("Buscar");
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoSincronizarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoSincronizarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoSincronizarSaldos"));

		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoSincronizarSaldosBusqueda"));

		if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setText("U");
		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoSincronizarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoSincronizarSaldosUpdate"));



					
		this.jLabelid_periodoProcesoSincronizarSaldos = new JLabelMe();
		this.jLabelid_periodoProcesoSincronizarSaldos.setText(""+ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoProcesoSincronizarSaldos.setToolTipText("Periodo");
		this.jLabelid_periodoProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoProcesoSincronizarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoProcesoSincronizarSaldos.setToolTipText(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutProcesoSincronizarSaldos = new GridBagLayout();
		this.jPanelid_periodoProcesoSincronizarSaldos.setLayout(this.gridaBagLayoutProcesoSincronizarSaldos);


		jComboBoxid_periodoProcesoSincronizarSaldos= new JComboBoxMe();
		jComboBoxid_periodoProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoProcesoSincronizarSaldos.setEnabled(false);

		this.jButtonid_periodoProcesoSincronizarSaldos= new JButtonMe();
		this.jButtonid_periodoProcesoSincronizarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoSincronizarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoSincronizarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoSincronizarSaldos.setText("Buscar");
		this.jButtonid_periodoProcesoSincronizarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoProcesoSincronizarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoSincronizarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoSincronizarSaldos"));

		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda= new JButtonMe();
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setText("U");
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoSincronizarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoSincronizarSaldosBusqueda"));

		if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoProcesoSincronizarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_periodoProcesoSincronizarSaldosUpdate= new JButtonMe();
		this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setText("U");
		this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoProcesoSincronizarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoSincronizarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoSincronizarSaldosUpdate"));



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
		//this.jInternalFrameDetalleProcesoSincronizarSaldos = new ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sincronizar Saldos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoSincronizarSaldos= new GridBagLayout();
		

		
		String sToolTipProcesoSincronizarSaldos="";
		sToolTipProcesoSincronizarSaldos=ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoSincronizarSaldos+="(Contabilidad.ProcesoSincronizarSaldos)";
		}
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoSincronizarSaldos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonModificarProcesoSincronizarSaldos = new JButtonMe();
        this.jButtonActualizarProcesoSincronizarSaldos = new JButtonMe();
        this.jButtonEliminarProcesoSincronizarSaldos = new JButtonMe();
        this.jButtonCancelarProcesoSincronizarSaldos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoSincronizarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoSincronizarSaldos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoSincronizarSaldos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoSincronizarSaldos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sincronizar Saldos";
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sincronizar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoSincronizarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoSincronizarSaldos.setName("jPanelCamposProcesoSincronizarSaldos"); 

		this.jPanelCamposOcultosProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoSincronizarSaldos.setName("jPanelCamposOcultosProcesoSincronizarSaldos"); 

        this.jPanelAccionesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoSincronizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoSincronizarSaldos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoSincronizarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoSincronizarSaldos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoSincronizarSaldos.setText("Nuevo");
		this.jButtonModificarProcesoSincronizarSaldos.setText("Editar");
        this.jButtonActualizarProcesoSincronizarSaldos.setText("Actualizar");
        this.jButtonEliminarProcesoSincronizarSaldos.setText("Eliminar");
        this.jButtonCancelarProcesoSincronizarSaldos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoSincronizarSaldos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoSincronizarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoSincronizarSaldos,"nuevo_button","Nuevo",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoSincronizarSaldos,"modificar_button","Editar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoSincronizarSaldos,"actualizar_button","Actualizar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoSincronizarSaldos,"eliminar_button","Eliminar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoSincronizarSaldos,"cancelar_button","Cancelar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoSincronizarSaldos,"guardarcambios_button","Guardar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos,"guardarcambiostabla_button","Guardar",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoSincronizarSaldos,"cerrar_button","Salir",this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoSincronizarSaldos.setToolTipText("Nuevo"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoSincronizarSaldos.setToolTipText("Editar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoSincronizarSaldos.setToolTipText("Actualizar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoSincronizarSaldos.setToolTipText("Eliminar)"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoSincronizarSaldos.setToolTipText("Cancelar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoSincronizarSaldos.setToolTipText("Guardar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setToolTipText("Guardar"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoSincronizarSaldos.setToolTipText("Salir"+" "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoSincronizarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoSincronizarSaldos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoSincronizarSaldos";
		inputMap = this.jButtonActualizarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoSincronizarSaldos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoSincronizarSaldos";
		inputMap = this.jButtonEliminarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoSincronizarSaldos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoSincronizarSaldos";
		inputMap = this.jButtonCancelarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoSincronizarSaldos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoSincronizarSaldos";
		inputMap = this.jButtonCerrarProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoSincronizarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoSincronizarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoSincronizarSaldos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos.setToolTipText("Nuevo ProcesoSincronizarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos.setToolTipText("Sin Cerrar Ventana ProcesoSincronizarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoSincronizarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoSincronizarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoSincronizarSaldos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoSincronizarSaldos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoSincronizarSaldos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoSincronizarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoSincronizarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoSincronizarSaldos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoSincronizarSaldos = new GridBagLayout();
		
		this.jPanelCamposProcesoSincronizarSaldos.setLayout(gridaBagLayoutCamposProcesoSincronizarSaldos);
		this.jPanelCamposOcultosProcesoSincronizarSaldos.setLayout(gridaBagLayoutCamposOcultosProcesoSincronizarSaldos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoSincronizarSaldos.add(jLabelIdProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoSincronizarSaldos.add(jLabelidProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);


	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoSincronizarSaldos.add(jLabelid_ejercicioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoSincronizarSaldos.add(jButtonid_ejercicioProcesoSincronizarSaldosBusqueda, this.gridBagConstraintsProcesoSincronizarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoSincronizarSaldos.add(jButtonid_ejercicioProcesoSincronizarSaldosUpdate, this.gridBagConstraintsProcesoSincronizarSaldos);
	}

	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoSincronizarSaldos.add(jComboBoxid_ejercicioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);


	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoProcesoSincronizarSaldos.add(jLabelid_periodoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoSincronizarSaldos.add(jButtonid_periodoProcesoSincronizarSaldosBusqueda, this.gridBagConstraintsProcesoSincronizarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoSincronizarSaldos.add(jButtonid_periodoProcesoSincronizarSaldosUpdate, this.gridBagConstraintsProcesoSincronizarSaldos);
	}

	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoProcesoSincronizarSaldos.add(jComboBoxid_periodoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iYPanelCamposProcesoSincronizarSaldos;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iXPanelCamposProcesoSincronizarSaldos++;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSincronizarSaldos.add(this.jPanelidProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	if(iXPanelCamposProcesoSincronizarSaldos % 1==0) {
		iXPanelCamposProcesoSincronizarSaldos=0;
		iYPanelCamposProcesoSincronizarSaldos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iYPanelCamposOcultosProcesoSincronizarSaldos;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iXPanelCamposOcultosProcesoSincronizarSaldos++;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoSincronizarSaldos.add(this.jPanelid_ejercicioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	if(iXPanelCamposOcultosProcesoSincronizarSaldos % 1==0) {
		iXPanelCamposOcultosProcesoSincronizarSaldos=0;
		iYPanelCamposOcultosProcesoSincronizarSaldos++;
	}
	this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iYPanelCamposOcultosProcesoSincronizarSaldos;
	this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iXPanelCamposOcultosProcesoSincronizarSaldos++;
	this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSincronizarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoSincronizarSaldos.add(this.jPanelid_periodoProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);



	if(iXPanelCamposOcultosProcesoSincronizarSaldos % 1==0) {
		iXPanelCamposOcultosProcesoSincronizarSaldos=0;
		iYPanelCamposOcultosProcesoSincronizarSaldos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoSincronizarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoSincronizarSaldos.setLayout(gridaBagLayoutAccionesProcesoSincronizarSaldos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoSincronizarSaldos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoSincronizarSaldos.setLayout(gridaBagLayoutAccionesFormularioProcesoSincronizarSaldos);
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoSincronizarSaldos.add(this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonModificarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);							

		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonEliminarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonActualizarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);


		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonGuardarCambiosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);	
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoSincronizarSaldos.add(this.jButtonCancelarProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoSincronizarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoSincronizarSaldos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoSincronizarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoSincronizarSaldos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =0;
		this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoSincronizarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoSincronizarSaldos = new ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sincronizar Saldos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sincronizar Saldos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sincronizar Saldos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoSincronizarSaldosModel procesosincronizarsaldosModel=new ProcesoSincronizarSaldosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoSincronizarSaldosModel.ProcesoSincronizarSaldosFocusTraversalPolicy procesosincronizarsaldosFocusTraversalPolicy = procesosincronizarsaldosModel.new ProcesoSincronizarSaldosFocusTraversalPolicy(this);
			
			//procesosincronizarsaldosFocusTraversalPolicy.setprocesosincronizarsaldosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesosincronizarsaldosModel);
			
			
			this.jContentPaneDetalleProcesoSincronizarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoSincronizarSaldos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoSincronizarSaldos.setLayout(gridaBagLayoutDetalleProcesoSincronizarSaldos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoSincronizarSaldos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoSincronizarSaldos.add(jTtoolBarDetalleProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos=   new JScrollPane(jContentPaneDetalleProcesoSincronizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoSincronizarSaldos.add(jPanelCamposProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);
			
			
			
			
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
						//&& procesosincronizarsaldosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoSincronizarSaldos= new GridBagConstraints();
						this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
						this.jContentPaneDetalleProcesoSincronizarSaldos.add(this.jTabbedPaneRelacionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoSincronizarSaldos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoSincronizarSaldos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
					this.gridBagConstraintsProcesoSincronizarSaldos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoSincronizarSaldos.add(jPanelCamposOcultosProcesoSincronizarSaldos, gridBagConstraintsProcesoSincronizarSaldos);
				
					this.jPanelCamposOcultosProcesoSincronizarSaldos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	        this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoSincronizarSaldos.add(this.jPanelAccionesFormularioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);							
			
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoSincronizarSaldos.add(this.jPanelAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoSincronizarSaldos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos=   new JScrollPane(this.jPanelCamposProcesoSincronizarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
			this.gridBagConstraintsProcesoSincronizarSaldos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoSincronizarSaldos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoSincronizarSaldos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);			
			
			this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
			
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		
			
		this.gridBagConstraintsProcesoSincronizarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoSincronizarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSincronizarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoSincronizarSaldos, this.gridBagConstraintsProcesoSincronizarSaldos);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoSincronizarSaldos.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoSincronizarSaldos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoSincronizarSaldos;
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
