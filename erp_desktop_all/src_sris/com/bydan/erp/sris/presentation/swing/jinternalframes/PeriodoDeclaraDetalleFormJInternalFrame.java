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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.PeriodoDeclaraConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class PeriodoDeclaraDetalleFormJInternalFrame extends PeriodoDeclaraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePeriodoDeclara;
	
	protected JMenuBar jmenuBarDetallePeriodoDeclara;
	
	protected JMenu jmenuDetallePeriodoDeclara;
	protected JMenu jmenuDetalleArchivoPeriodoDeclara;
	protected JMenu jmenuDetalleAccionesPeriodoDeclara;
	protected JMenu jmenuDetalleDatosPeriodoDeclara;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoDeclara;	
	protected GridBagConstraints gridBagConstraintsPeriodoDeclara;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PeriodoDeclaraBeanSwingJInternalFrameAdditional jInternalFrameDetallePeriodoDeclara;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public RetencionVentaBeanSwingJInternalFrame retencionventaBeanSwingJInternalFrame=null;
	public RetencionVentaBeanSwingJInternalFrame retencionventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRetencionVenta=false;
	public RetencionVentaSessionBean retencionventaSessionBean;

	public FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=null;
	public FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaDiario=false;
	public FacturaDiarioSessionBean facturadiarioSessionBean;

	public DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame=null;
	public DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDocumentoAnulado=false;
	public DocumentoAnuladoSessionBean documentoanuladoSessionBean;
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PeriodoDeclaraLogic periododeclaraLogic;
	
	public JScrollPane jScrollPanelDatosPeriodoDeclara;
	public JScrollPane jScrollPanelDatosEdicionPeriodoDeclara;
	public JScrollPane jScrollPanelDatosGeneralPeriodoDeclara;
	
	protected JPanel jPanelCamposPeriodoDeclara;    
	protected JPanel jPanelCamposOcultosPeriodoDeclara;    	
	protected JPanel jPanelAccionesPeriodoDeclara;
	protected JPanel jPanelAccionesFormularioPeriodoDeclara;
    
	
	
	protected Integer iXPanelCamposPeriodoDeclara=0;
	protected Integer iYPanelCamposPeriodoDeclara=0;
	
	protected Integer iXPanelCamposOcultosPeriodoDeclara=0;
	protected Integer iYPanelCamposOcultosPeriodoDeclara=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPeriodoDeclara;
	public JButton jButtonModificarPeriodoDeclara;
	public JButton jButtonActualizarPeriodoDeclara;
    public JButton jButtonEliminarPeriodoDeclara;
	public JButton jButtonCancelarPeriodoDeclara;
    public JButton jButtonGuardarCambiosPeriodoDeclara;
	public JButton jButtonGuardarCambiosTablaPeriodoDeclara;
	protected JButton jButtonCerrarPeriodoDeclara;
	
	
	protected JButton jButtonProcesarInformacionPeriodoDeclara;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPeriodoDeclara;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPeriodoDeclara;
	protected JCheckBox jCheckBoxPostAccionSinMensajePeriodoDeclara;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoDeclara;
	protected JButton jButtonModificarToolBarPeriodoDeclara;
	protected JButton jButtonActualizarToolBarPeriodoDeclara;
    protected JButton jButtonEliminarToolBarPeriodoDeclara;
	protected JButton jButtonCancelarToolBarPeriodoDeclara;
    protected JButton jButtonGuardarCambiosToolBarPeriodoDeclara;
	protected JButton jButtonGuardarCambiosTablaToolBarPeriodoDeclara;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoDeclara;
	protected JButton jButtonCerrarToolBarPeriodoDeclara;
	
	protected JButton jButtonProcesarInformacionToolBarPeriodoDeclara;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoDeclara;
	protected JMenuItem jMenuItemModificarPeriodoDeclara;
	protected JMenuItem jMenuItemActualizarPeriodoDeclara;
    protected JMenuItem jMenuItemEliminarPeriodoDeclara;
	protected JMenuItem jMenuItemCancelarPeriodoDeclara;
    protected JMenuItem jMenuItemGuardarCambiosPeriodoDeclara;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoDeclara;
	protected JMenuItem jMenuItemCerrarPeriodoDeclara;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoDeclara;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoDeclara;
	
	protected JMenuItem jMenuItemProcesarInformacionPeriodoDeclara;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoDeclara;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoDeclara;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoDeclara;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoDeclara;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPeriodoDeclara;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPeriodoDeclara;
	public JLabel jLabelIdPeriodoDeclara;
	public JLabel jLabelidPeriodoDeclara;
	public JButton jButtonidPeriodoDeclaraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPeriodoDeclara;
	public JLabel jLabelcodigoPeriodoDeclara;
	public JTextField jTextFieldcodigoPeriodoDeclara;
	public JButton jButtoncodigoPeriodoDeclaraBusqueda= new JButtonMe();

	public JPanel jPanelfechaPeriodoDeclara;
	public JLabel jLabelfechaPeriodoDeclara;
	//public JFormattedTextField jDateChooserfechaPeriodoDeclara;

	public JDateChooser jDateChooserfechaPeriodoDeclara;
	public JButton jButtonfechaPeriodoDeclaraBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoPeriodoDeclara;
	public JLabel jLabelesta_activoPeriodoDeclara;
	public JCheckBox jCheckBoxesta_activoPeriodoDeclara;
	public JButton jButtonesta_activoPeriodoDeclaraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioPeriodoDeclara;
	public JLabel jLabelid_anioPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPeriodoDeclara;
	public JButton jButtonid_anioPeriodoDeclara= new JButtonMe();
	public JButton jButtonid_anioPeriodoDeclaraUpdate= new JButtonMe();
	public JButton jButtonid_anioPeriodoDeclaraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPeriodoDeclara;
	public JLabel jLabelid_mesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPeriodoDeclara;
	public JButton jButtonid_mesPeriodoDeclara= new JButtonMe();
	public JButton jButtonid_mesPeriodoDeclaraUpdate= new JButtonMe();
	public JButton jButtonid_mesPeriodoDeclaraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPeriodoDeclara;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PeriodoDeclaraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPeriodoDeclara=new JPanel();
				this.jPanelAccionesFormularioPeriodoDeclara=new JPanel();
				this.jmenuBarDetallePeriodoDeclara=new JMenuBar();
				this.jTtoolBarDetallePeriodoDeclara=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PeriodoDeclaraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPeriodoDeclara() {
		return this.jButtonActualizarToolBarPeriodoDeclara;
	}
	
	public JButton getjButtonEliminarToolBarPeriodoDeclara() {
		return this.jButtonEliminarToolBarPeriodoDeclara;
	}
	
	public JButton getjButtonCancelarToolBarPeriodoDeclara() {
		return this.jButtonCancelarToolBarPeriodoDeclara;
	}		
	
	public JButton getjButtonProcesarInformacionPeriodoDeclara() {
		return this.jButtonProcesarInformacionPeriodoDeclara;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoDeclara)	{
		this.jButtonProcesarInformacionPeriodoDeclara = jButtonProcesarInformacionPeriodoDeclara;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoDeclara() {
		return this.jComboBoxTiposAccionesPeriodoDeclara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoDeclara(
			JComboBox jComboBoxTiposRelacionesPeriodoDeclara) {
		this.jComboBoxTiposRelacionesPeriodoDeclara = jComboBoxTiposRelacionesPeriodoDeclara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoDeclara(
			JComboBox jComboBoxTiposAccionesPeriodoDeclara) {
		this.jComboBoxTiposAccionesPeriodoDeclara = jComboBoxTiposAccionesPeriodoDeclara;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPeriodoDeclara() {
		return this.jComboBoxTiposAccionesFormularioPeriodoDeclara;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPeriodoDeclara(
			JComboBox jComboBoxTiposAccionesFormularioPeriodoDeclara) {
		this.jComboBoxTiposAccionesFormularioPeriodoDeclara = jComboBoxTiposAccionesFormularioPeriodoDeclara;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		
		this.periododeclaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periododeclaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periododeclaraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.retencionventaSessionBean=new RetencionVentaSessionBean();
		//this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		//this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoDeclaraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Declara MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
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
	
		PeriodoDeclaraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePeriodoDeclara= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPeriodoDeclara=new JButtonMe();
				this.jButtonModificarToolBarPeriodoDeclara=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara,
							"actualizar","actualizar","Actualizar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara,
							"eliminar","eliminar","Eliminar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara,
							"cancelar","cancelar","Cancelar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara,
							"guardarcambios","guardarcambios","Guardar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePeriodoDeclara=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePeriodoDeclara=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPeriodoDeclara=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPeriodoDeclara=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPeriodoDeclara=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoDeclara= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoDeclara.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoDeclara,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPeriodoDeclara= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPeriodoDeclara.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPeriodoDeclara,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPeriodoDeclara= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPeriodoDeclara.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPeriodoDeclara,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPeriodoDeclara= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPeriodoDeclara.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPeriodoDeclara,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPeriodoDeclara= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPeriodoDeclara.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPeriodoDeclara,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPeriodoDeclara= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoDeclara.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoDeclara,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoDeclara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoDeclara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoDeclara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPeriodoDeclara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPeriodoDeclara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPeriodoDeclara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoDeclara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoDeclara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoDeclara,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoDeclara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoDeclara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoDeclara,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPeriodoDeclara.add(this.jMenuItemDetalleCerrarPeriodoDeclara);
		
		this.jmenuDetalleAccionesPeriodoDeclara.add(this.jMenuItemActualizarPeriodoDeclara);
		this.jmenuDetalleAccionesPeriodoDeclara.add(this.jMenuItemEliminarPeriodoDeclara);
		this.jmenuDetalleAccionesPeriodoDeclara.add(this.jMenuItemCancelarPeriodoDeclara);		
		
		//this.jmenuDetalleDatosPeriodoDeclara.add(this.jMenuItemDetalleAbrirOrderByPeriodoDeclara);				
		this.jmenuDetalleDatosPeriodoDeclara.add(this.jMenuItemDetalleMostarOcultarPeriodoDeclara);				
				
		//this.jmenuDetalleAccionesPeriodoDeclara.add(this.jMenuItemGuardarCambiosPeriodoDeclara);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePeriodoDeclara.add(this.jmenuDetalleArchivoPeriodoDeclara);		
		this.jmenuBarDetallePeriodoDeclara.add(this.jmenuDetalleAccionesPeriodoDeclara);		
		this.jmenuBarDetallePeriodoDeclara.add(this.jmenuDetalleDatosPeriodoDeclara);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePeriodoDeclara.add(this.jmenuDetallePeriodoDeclara);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePeriodoDeclara);				
	}
	
	
	public void inicializarElementosCamposPeriodoDeclara() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPeriodoDeclara = new JLabelMe();
		jLabelIdPeriodoDeclara.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPeriodoDeclara = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPeriodoDeclara= new GridBagLayout();

		this.jPanelidPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);

		jLabelidPeriodoDeclara = new JLabel();
		jLabelidPeriodoDeclara.setText("Id");

		jLabelidPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPeriodoDeclara = new JLabelMe();
		this.jLabelcodigoPeriodoDeclara.setText(""+PeriodoDeclaraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPeriodoDeclara.setToolTipText("Codigo");
		this.jLabelcodigoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		this.jPanelcodigoPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);


		jTextFieldcodigoPeriodoDeclara= new JTextFieldMe();

		jTextFieldcodigoPeriodoDeclara.setEnabled(false);
		jTextFieldcodigoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPeriodoDeclaraBusqueda= new JButtonMe();
		this.jButtoncodigoPeriodoDeclaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPeriodoDeclaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPeriodoDeclaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPeriodoDeclaraBusqueda.setText("U");
		this.jButtoncodigoPeriodoDeclaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPeriodoDeclaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPeriodoDeclaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPeriodoDeclaraBusqueda"));

		if(this.periododeclaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPeriodoDeclaraBusqueda.setVisible(false);		}


					
		this.jLabelfechaPeriodoDeclara = new JLabelMe();
		this.jLabelfechaPeriodoDeclara.setText(""+PeriodoDeclaraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPeriodoDeclara.setToolTipText("Fecha");
		this.jLabelfechaPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		this.jPanelfechaPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);


		//jFormattedTextFieldfechaPeriodoDeclara= new JFormattedTextFieldMe();

		jDateChooserfechaPeriodoDeclara= new JDateChooser();
		jDateChooserfechaPeriodoDeclara.setEnabled(false);
		jDateChooserfechaPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPeriodoDeclara.setDate(new Date());
		jDateChooserfechaPeriodoDeclara.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPeriodoDeclara.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPeriodoDeclaraBusqueda= new JButtonMe();
		this.jButtonfechaPeriodoDeclaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPeriodoDeclaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPeriodoDeclaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPeriodoDeclaraBusqueda.setText("U");
		this.jButtonfechaPeriodoDeclaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPeriodoDeclaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPeriodoDeclaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPeriodoDeclaraBusqueda"));

		if(this.periododeclaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPeriodoDeclaraBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoPeriodoDeclara = new JLabelMe();
		this.jLabelesta_activoPeriodoDeclara.setText(""+PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoPeriodoDeclara.setToolTipText("Esta Activo");
		this.jLabelesta_activoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		this.jPanelesta_activoPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);


		jCheckBoxesta_activoPeriodoDeclara= new JCheckBoxMe();
		jCheckBoxesta_activoPeriodoDeclara.setEnabled(false);

		jCheckBoxesta_activoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoPeriodoDeclaraBusqueda= new JButtonMe();
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoPeriodoDeclaraBusqueda.setText("U");
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoPeriodoDeclaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoPeriodoDeclaraBusqueda"));

		if(this.periododeclaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoPeriodoDeclaraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPeriodoDeclara() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioPeriodoDeclara = new JLabelMe();
		this.jLabelid_anioPeriodoDeclara.setText(""+PeriodoDeclaraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPeriodoDeclara.setToolTipText("Anio");
		this.jLabelid_anioPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		this.jPanelid_anioPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);


		jComboBoxid_anioPeriodoDeclara= new JComboBoxMe();
		jComboBoxid_anioPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioPeriodoDeclara= new JButtonMe();
		this.jButtonid_anioPeriodoDeclara.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoDeclara.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoDeclara.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoDeclara.setText("Buscar");
		this.jButtonid_anioPeriodoDeclara.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPeriodoDeclara.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoDeclara,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoDeclara"));

		this.jButtonid_anioPeriodoDeclaraBusqueda= new JButtonMe();
		this.jButtonid_anioPeriodoDeclaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoDeclaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoDeclaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoDeclaraBusqueda.setText("U");
		this.jButtonid_anioPeriodoDeclaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPeriodoDeclaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoDeclaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoDeclaraBusqueda"));

		if(this.periododeclaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPeriodoDeclaraBusqueda.setVisible(false);		}

		this.jButtonid_anioPeriodoDeclaraUpdate= new JButtonMe();
		this.jButtonid_anioPeriodoDeclaraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoDeclaraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoDeclaraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoDeclaraUpdate.setText("U");
		this.jButtonid_anioPeriodoDeclaraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPeriodoDeclaraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoDeclaraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoDeclaraUpdate"));



					
		this.jLabelid_mesPeriodoDeclara = new JLabelMe();
		this.jLabelid_mesPeriodoDeclara.setText(""+PeriodoDeclaraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPeriodoDeclara.setToolTipText("Mes");
		this.jLabelid_mesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPeriodoDeclara.setToolTipText(PeriodoDeclaraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		this.jPanelid_mesPeriodoDeclara.setLayout(this.gridaBagLayoutPeriodoDeclara);


		jComboBoxid_mesPeriodoDeclara= new JComboBoxMe();
		jComboBoxid_mesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesPeriodoDeclara= new JButtonMe();
		this.jButtonid_mesPeriodoDeclara.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoDeclara.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoDeclara.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoDeclara.setText("Buscar");
		this.jButtonid_mesPeriodoDeclara.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPeriodoDeclara.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoDeclara,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoDeclara"));

		this.jButtonid_mesPeriodoDeclaraBusqueda= new JButtonMe();
		this.jButtonid_mesPeriodoDeclaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoDeclaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoDeclaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoDeclaraBusqueda.setText("U");
		this.jButtonid_mesPeriodoDeclaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPeriodoDeclaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoDeclaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoDeclaraBusqueda"));

		if(this.periododeclaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPeriodoDeclaraBusqueda.setVisible(false);		}

		this.jButtonid_mesPeriodoDeclaraUpdate= new JButtonMe();
		this.jButtonid_mesPeriodoDeclaraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoDeclaraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoDeclaraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoDeclaraUpdate.setText("U");
		this.jButtonid_mesPeriodoDeclaraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPeriodoDeclaraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoDeclaraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoDeclaraUpdate"));



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
		//this.jInternalFrameDetallePeriodoDeclara = new PeriodoDeclaraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Periodo Declara DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoDeclara= new GridBagLayout();
		

		
		String sToolTipPeriodoDeclara="";
		sToolTipPeriodoDeclara=PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoDeclara+="(Sris.PeriodoDeclara)";
		}
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoDeclara+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPeriodoDeclara = new JButtonMe();
		this.jButtonModificarPeriodoDeclara = new JButtonMe();
        this.jButtonActualizarPeriodoDeclara = new JButtonMe();
        this.jButtonEliminarPeriodoDeclara = new JButtonMe();
        this.jButtonCancelarPeriodoDeclara = new JButtonMe();
        this.jButtonGuardarCambiosPeriodoDeclara = new JButtonMe();
		this.jButtonGuardarCambiosTablaPeriodoDeclara = new JButtonMe();
		this.jButtonCerrarPeriodoDeclara = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoDeclara = new JScrollPane();   
        this.jScrollPanelDatosEdicionPeriodoDeclara = new JScrollPane();
		this.jScrollPanelDatosGeneralPeriodoDeclara = new JScrollPane();
				
		
		
		this.jPanelCamposPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Declara";
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoDeclara.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPeriodoDeclara.setName("jPanelCamposPeriodoDeclara"); 

		this.jPanelCamposOcultosPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPeriodoDeclara.setName("jPanelCamposOcultosPeriodoDeclara"); 

        this.jPanelAccionesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoDeclara.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoDeclara.setName("Acciones"); 

		this.jPanelAccionesFormularioPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPeriodoDeclara.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPeriodoDeclara.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPeriodoDeclara.setText("Nuevo");
		this.jButtonModificarPeriodoDeclara.setText("Editar");
        this.jButtonActualizarPeriodoDeclara.setText("Actualizar");
        this.jButtonEliminarPeriodoDeclara.setText("Eliminar");
        this.jButtonCancelarPeriodoDeclara.setText("Cancelar");
        this.jButtonGuardarCambiosPeriodoDeclara.setText("Guardar");
		this.jButtonGuardarCambiosTablaPeriodoDeclara.setText("Guardar");
		this.jButtonCerrarPeriodoDeclara.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoDeclara,"nuevo_button","Nuevo",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPeriodoDeclara,"modificar_button","Editar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPeriodoDeclara,"actualizar_button","Actualizar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPeriodoDeclara,"eliminar_button","Eliminar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPeriodoDeclara,"cancelar_button","Cancelar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPeriodoDeclara,"guardarcambios_button","Guardar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoDeclara,"guardarcambiostabla_button","Guardar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoDeclara,"cerrar_button","Salir",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPeriodoDeclara.setToolTipText("Nuevo"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPeriodoDeclara.setToolTipText("Editar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPeriodoDeclara.setToolTipText("Actualizar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPeriodoDeclara.setToolTipText("Eliminar)"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPeriodoDeclara.setToolTipText("Cancelar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPeriodoDeclara.setToolTipText("Guardar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPeriodoDeclara.setToolTipText("Guardar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoDeclara.setToolTipText("Salir"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoDeclara";
		inputMap = this.jButtonNuevoPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoDeclara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoDeclara"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPeriodoDeclara";
		inputMap = this.jButtonActualizarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPeriodoDeclara"));
		
		//ELIMINAR
		sMapKey = "EliminarPeriodoDeclara";
		inputMap = this.jButtonEliminarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPeriodoDeclara"));
		
		//CANCELAR	
		sMapKey = "CancelarPeriodoDeclara";
		inputMap = this.jButtonCancelarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPeriodoDeclara"));
		
		//CERRAR		
		sMapKey = "CerrarPeriodoDeclara";
		inputMap = this.jButtonCerrarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoDeclara"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoDeclara";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoDeclara"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPeriodoDeclara = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPeriodoDeclara.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPeriodoDeclara.setToolTipText("Nuevo PeriodoDeclara");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPeriodoDeclara = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPeriodoDeclara.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPeriodoDeclara.setToolTipText("Sin Cerrar Ventana PeriodoDeclara");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePeriodoDeclara = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePeriodoDeclara.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePeriodoDeclara.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoDeclara.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoDeclara.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPeriodoDeclara.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPeriodoDeclara.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPeriodoDeclara = new JLabelMe();
		
		this.jLabelAccionesPeriodoDeclara.setText("Acciones");		
		this.jLabelAccionesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPeriodoDeclara();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPeriodoDeclara();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPeriodoDeclara=new JTabbedPane();
		this.jTabbedPaneRelacionesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPeriodoDeclara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoDeclara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoDeclara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPeriodoDeclara.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoDeclara.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoDeclara.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPeriodoDeclara = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPeriodoDeclara = new GridBagLayout();
		
		this.jPanelCamposPeriodoDeclara.setLayout(gridaBagLayoutCamposPeriodoDeclara);
		this.jPanelCamposOcultosPeriodoDeclara.setLayout(gridaBagLayoutCamposOcultosPeriodoDeclara);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPeriodoDeclara.add(jLabelIdPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPeriodoDeclara.add(jLabelidPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPeriodoDeclara.add(jLabelcodigoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 2;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPeriodoDeclara.add(jButtoncodigoPeriodoDeclaraBusqueda, this.gridBagConstraintsPeriodoDeclara);
	}

	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPeriodoDeclara.add(jTextFieldcodigoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPeriodoDeclara.add(jLabelid_anioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 2;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodoDeclara.add(jButtonid_anioPeriodoDeclaraBusqueda, this.gridBagConstraintsPeriodoDeclara);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 3;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodoDeclara.add(jButtonid_anioPeriodoDeclaraUpdate, this.gridBagConstraintsPeriodoDeclara);
	}

	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPeriodoDeclara.add(jComboBoxid_anioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPeriodoDeclara.add(jLabelid_mesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 2;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodoDeclara.add(jButtonid_mesPeriodoDeclaraBusqueda, this.gridBagConstraintsPeriodoDeclara);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 3;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodoDeclara.add(jButtonid_mesPeriodoDeclaraUpdate, this.gridBagConstraintsPeriodoDeclara);
	}

	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPeriodoDeclara.add(jComboBoxid_mesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPeriodoDeclara.add(jLabelfechaPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 2;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPeriodoDeclara.add(jButtonfechaPeriodoDeclaraBusqueda, this.gridBagConstraintsPeriodoDeclara);
	}

	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPeriodoDeclara.add(jDateChooserfechaPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoPeriodoDeclara.add(jLabelesta_activoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 2;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
		this.gridBagConstraintsPeriodoDeclara.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoPeriodoDeclara.add(jButtonesta_activoPeriodoDeclaraBusqueda, this.gridBagConstraintsPeriodoDeclara);
	}

	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoDeclara.gridy = 0;
	this.gridBagConstraintsPeriodoDeclara.gridx = 1;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoPeriodoDeclara.add(jCheckBoxesta_activoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelidPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelcodigoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelid_anioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelid_mesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelfechaPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
	this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoDeclara.gridy = iYPanelCamposPeriodoDeclara;
	this.gridBagConstraintsPeriodoDeclara.gridx = iXPanelCamposPeriodoDeclara++;
	this.gridBagConstraintsPeriodoDeclara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoDeclara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoDeclara.add(this.jPanelesta_activoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);



	if(iXPanelCamposPeriodoDeclara % 1==0) {
		iXPanelCamposPeriodoDeclara=0;
		iYPanelCamposPeriodoDeclara++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesPeriodoDeclara= new GridBagLayout();
		this.jPanelAccionesPeriodoDeclara.setLayout(gridaBagLayoutAccionesPeriodoDeclara);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPeriodoDeclara= new GridBagLayout();
		this.jPanelAccionesFormularioPeriodoDeclara.setLayout(gridaBagLayoutAccionesFormularioPeriodoDeclara);
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoDeclara.add(this.jComboBoxTiposAccionesFormularioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoDeclara.add(this.jCheckBoxPostAccionNuevoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoDeclara.add(this.jCheckBoxPostAccionSinCerrarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoDeclara.add(this.jCheckBoxPostAccionSinMensajePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccion++;
			
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonModificarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);							

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx =iPosXAccion++;
			
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonEliminarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonActualizarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);


		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonGuardarCambiosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);	
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;		
		this.gridBagConstraintsPeriodoDeclara.gridx =iPosXAccion++;
		
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonCancelarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoDeclara);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;		
			//this.gridBagConstraintsPeriodoDeclara.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoDeclara.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoDeclara.gridx =0;
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoDeclara.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePeriodoDeclara = new PeriodoDeclaraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Periodo Declara DATOS");
			
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
			
	        //this.setTitle("[FOR] - Periodo Declara DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Declara Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PeriodoDeclaraModel periododeclaraModel=new PeriodoDeclaraModel(this);
			
			//SI USARA CLASE INTERNA
			//PeriodoDeclaraModel.PeriodoDeclaraFocusTraversalPolicy periododeclaraFocusTraversalPolicy = periododeclaraModel.new PeriodoDeclaraFocusTraversalPolicy(this);
			
			//periododeclaraFocusTraversalPolicy.setperiododeclaraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(periododeclaraModel);
			
			
			this.jContentPaneDetallePeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePeriodoDeclara = new GridBagLayout();	
			this.jContentPaneDetallePeriodoDeclara.setLayout(gridaBagLayoutDetallePeriodoDeclara);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoDeclara = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPeriodoDeclara.gridx = 0;
					
				
				this.jContentPaneDetallePeriodoDeclara.add(jTtoolBarDetallePeriodoDeclara, gridBagConstraintsPeriodoDeclara);								
				
}
			
			this.jScrollPanelDatosEdicionPeriodoDeclara=   new JScrollPane(jContentPaneDetallePeriodoDeclara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoDeclara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoDeclara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoDeclara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPeriodoDeclara=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoDeclara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoDeclara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoDeclara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	        
			this.jContentPaneDetallePeriodoDeclara.add(jPanelCamposPeriodoDeclara, gridBagConstraintsPeriodoDeclara);
			
			
			
			
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
						&& periododeclaraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(this.puedeCargarPorParteDocumentoAnulado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaDiario(this.puedeCargarPorParteFacturaDiario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencionVenta(this.puedeCargarPorParteRetencionVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPeriodoDeclara= new GridBagConstraints();
						this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPeriodoDeclara.gridx = 0;
						this.jContentPaneDetallePeriodoDeclara.add(this.jTabbedPaneRelacionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPeriodoDeclara.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaDiario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencionVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPeriodoDeclara.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
					this.gridBagConstraintsPeriodoDeclara.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPeriodoDeclara.gridx = 0;
					
				
					this.jContentPaneDetallePeriodoDeclara.add(jPanelCamposOcultosPeriodoDeclara, gridBagConstraintsPeriodoDeclara);
				
					this.jPanelCamposOcultosPeriodoDeclara.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	        this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePeriodoDeclara.add(this.jPanelAccionesFormularioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);							
			
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
	        this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsPeriodoDeclara.gridx = 0;
	        
			
			this.jContentPaneDetallePeriodoDeclara.add(this.jPanelAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPeriodoDeclara);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPeriodoDeclara=   new JScrollPane(this.jPanelCamposPeriodoDeclara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoDeclara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoDeclara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoDeclara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPeriodoDeclara.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPeriodoDeclara;//jContentPane;
		
		return jScrollPanelDatosEdicionPeriodoDeclara;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		this.documentoanuladoSessionBean.setConGuardarRelaciones(false);
		this.documentoanuladoSessionBean.setEsGuardarRelacionado(true);

		this.documentoanuladoBeanSwingJInternalFrame=null;//new DocumentoAnuladoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.documentoanuladoBeanSwingJInternalFramePopup=new DocumentoAnuladoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.documentoanuladoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {

				DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.documentoanuladoSessionBean.setEsGuardarRelacionado(true);

				this.documentoanuladoBeanSwingJInternalFrame=new DocumentoAnuladoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.documentoanuladoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.documentoanuladoBeanSwingJInternalFrame.setdocumentoanuladoSessionBean(this.documentoanuladoSessionBean);

				//this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				//this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPeriodoDeclara.gridx = 0;
				//this.jContentPaneDetallePeriodoDeclara.add(this.documentoanuladoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPeriodoDeclara);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Documento Anulados",this.documentoanuladoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPeriodoDeclara.setComponentAt(iIndexTab,this.documentoanuladoBeanSwingJInternalFrame.getContentPane());
				}

				//DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
				this.documentoanuladoBeanSwingJInternalFrame=null;//new DocumentoAnuladoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDocumentoAnulado) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Documento Anulados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFacturaDiario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		this.facturadiarioSessionBean.setConGuardarRelaciones(false);
		this.facturadiarioSessionBean.setEsGuardarRelacionado(true);

		this.facturadiarioBeanSwingJInternalFrame=null;//new FacturaDiarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturadiarioBeanSwingJInternalFramePopup=new FacturaDiarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturadiarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {

				FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturadiarioSessionBean.setEsGuardarRelacionado(true);

				this.facturadiarioBeanSwingJInternalFrame=new FacturaDiarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.facturadiarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturadiarioBeanSwingJInternalFrame.setfacturadiarioSessionBean(this.facturadiarioSessionBean);

				//this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				//this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPeriodoDeclara.gridx = 0;
				//this.jContentPaneDetallePeriodoDeclara.add(this.facturadiarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPeriodoDeclara);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Factura Diarios",this.facturadiarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPeriodoDeclara.setComponentAt(iIndexTab,this.facturadiarioBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturadiarioSessionBean.setEsGuardarRelacionado(false);
				this.facturadiarioBeanSwingJInternalFrame=null;//new FacturaDiarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaDiario) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Factura Diarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRetencionVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.retencionventaSessionBean=new RetencionVentaSessionBean();
		this.retencionventaSessionBean.setConGuardarRelaciones(false);
		this.retencionventaSessionBean.setEsGuardarRelacionado(true);

		this.retencionventaBeanSwingJInternalFrame=null;//new RetencionVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.retencionventaBeanSwingJInternalFramePopup=new RetencionVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.retencionventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {

				RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;
				RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.retencionventaSessionBean.setEsGuardarRelacionado(true);

				this.retencionventaBeanSwingJInternalFrame=new RetencionVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.retencionventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.retencionventaBeanSwingJInternalFrame.setretencionventaSessionBean(this.retencionventaSessionBean);

				//this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				//this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPeriodoDeclara.gridx = 0;
				//this.jContentPaneDetallePeriodoDeclara.add(this.retencionventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPeriodoDeclara);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Retencion Ventas",this.retencionventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPeriodoDeclara.setComponentAt(iIndexTab,this.retencionventaBeanSwingJInternalFrame.getContentPane());
				}

				//RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.retencionventaSessionBean.setEsGuardarRelacionado(false);
				this.retencionventaBeanSwingJInternalFrame=null;//new RetencionVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRetencionVenta) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Retencion Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				//this.gridBagConstraintsPeriodoDeclara.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPeriodoDeclara.gridx = 0;
				//this.jContentPaneDetallePeriodoDeclara.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPeriodoDeclara);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPeriodoDeclara.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesPeriodoDeclara.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<PeriodoDeclara> periododeclaras,PeriodoDeclara periododeclara,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.periododeclaraLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.setperiododeclarasForeignKey(periododeclaras);
					transaccionlocalBeanSwingJInternalFrame.setperiododeclaraForeignKey(periododeclara);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidPeriodoDeclaraActual(periododeclara.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaPeriodoDeclara(true);
					transaccionlocalBeanSwingJInternalFrame.setid_periodo_declaraFK_IdPeriodoDeclara(periododeclara.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFramePeriodoDeclaraForeignKey(periododeclara,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdPeriodoDeclara");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPeriodoDeclara");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRetencionVentaBeanSwingJInternalFrame(List<PeriodoDeclara> periododeclaras,PeriodoDeclara periododeclara,RetencionVentaBeanSwingJInternalFrame retencionventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//retencionventaBeanSwingJInternalFrame=new RetencionVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					retencionventaBeanSwingJInternalFrame.getRetencionVentaLogic().setConnexion(this.periododeclaraLogic.getConnexion());

					retencionventaBeanSwingJInternalFrame.setperiododeclarasForeignKey(periododeclaras);
					retencionventaBeanSwingJInternalFrame.setperiododeclaraForeignKey(periododeclara);
					retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
					retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setlidPeriodoDeclaraActual(periododeclara.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					retencionventaBeanSwingJInternalFrame.cargarCombosForeignKeyRetencionVenta(retencionventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					retencionventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPeriodoDeclara(true);
					retencionventaBeanSwingJInternalFrame.setid_periodo_declaraFK_IdPeriodoDeclara(periododeclara.getId());

					if(!this.conCargarFormDetalle) {
						retencionventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					retencionventaBeanSwingJInternalFrame.setSelectedItemCombosFramePeriodoDeclaraForeignKey(periododeclara,1,false,true,true);
					retencionventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					retencionventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPeriodoDeclara");
					retencionventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPeriodoDeclara");
					retencionventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencionVenta(true);
					retencionventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRetencionVenta("n",retencionventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, retencionventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					retencionventaBeanSwingJInternalFrame.setAutoscrolls(true);
					retencionventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						retencionventaBeanSwingJInternalFrame.actualizarEstadoPanelsRetencionVenta("relacionado");
					} else {
						retencionventaBeanSwingJInternalFrame.actualizarEstadoPanelsRetencionVenta("no_relacionado");
					}

					retencionventaBeanSwingJInternalFrame.getjButtonRecargarInformacionRetencionVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaDiarioBeanSwingJInternalFrame(List<PeriodoDeclara> periododeclaras,PeriodoDeclara periododeclara,FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturadiarioBeanSwingJInternalFrame=new FacturaDiarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturadiarioBeanSwingJInternalFrame.getFacturaDiarioLogic().setConnexion(this.periododeclaraLogic.getConnexion());

					facturadiarioBeanSwingJInternalFrame.setperiododeclarasForeignKey(periododeclaras);
					facturadiarioBeanSwingJInternalFrame.setperiododeclaraForeignKey(periododeclara);
					facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
					facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setlidPeriodoDeclaraActual(periododeclara.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturadiarioBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaDiario(facturadiarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturadiarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaPeriodoDeclara(true);
					facturadiarioBeanSwingJInternalFrame.setid_periodo_declaraFK_IdPeriodoDeclara(periododeclara.getId());

					if(!this.conCargarFormDetalle) {
						facturadiarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturadiarioBeanSwingJInternalFrame.setSelectedItemCombosFramePeriodoDeclaraForeignKey(periododeclara,1,false,true,true);
					facturadiarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturadiarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdPeriodoDeclara");
					facturadiarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPeriodoDeclara");
					facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(true);
					facturadiarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaDiario("n",facturadiarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturadiarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturadiarioBeanSwingJInternalFrame.setAutoscrolls(true);
					facturadiarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("relacionado");
					} else {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("no_relacionado");
					}

					facturadiarioBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaDiario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDocumentoAnuladoBeanSwingJInternalFrame(List<PeriodoDeclara> periododeclaras,PeriodoDeclara periododeclara,DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//documentoanuladoBeanSwingJInternalFrame=new DocumentoAnuladoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					documentoanuladoBeanSwingJInternalFrame.getDocumentoAnuladoLogic().setConnexion(this.periododeclaraLogic.getConnexion());

					documentoanuladoBeanSwingJInternalFrame.setperiododeclarasForeignKey(periododeclaras);
					documentoanuladoBeanSwingJInternalFrame.setperiododeclaraForeignKey(periododeclara);
					documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
					documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setlidPeriodoDeclaraActual(periododeclara.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					documentoanuladoBeanSwingJInternalFrame.cargarCombosForeignKeyDocumentoAnulado(documentoanuladoBeanSwingJInternalFrame.isCargarCombosDependencia);
					documentoanuladoBeanSwingJInternalFrame.setVisibilidadBusquedasParaPeriodoDeclara(true);
					documentoanuladoBeanSwingJInternalFrame.setid_periodo_declaraFK_IdPeriodoDeclara(periododeclara.getId());

					if(!this.conCargarFormDetalle) {
						documentoanuladoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					documentoanuladoBeanSwingJInternalFrame.setSelectedItemCombosFramePeriodoDeclaraForeignKey(periododeclara,1,false,true,true);
					documentoanuladoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					documentoanuladoBeanSwingJInternalFrame.procesarBusqueda("FK_IdPeriodoDeclara");
					documentoanuladoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPeriodoDeclara");
					documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(true);
					documentoanuladoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDocumentoAnulado("n",documentoanuladoBeanSwingJInternalFrame.isGuardarCambiosEnLote, documentoanuladoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					documentoanuladoBeanSwingJInternalFrame.setAutoscrolls(true);
					documentoanuladoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("relacionado");
					} else {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("no_relacionado");
					}

					documentoanuladoBeanSwingJInternalFrame.getjButtonRecargarInformacionDocumentoAnulado().setVisible(false);

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
