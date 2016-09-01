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
import com.bydan.erp.contabilidad.util.EjercicioConstantesFunciones;

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
public class EjercicioDetalleFormJInternalFrame extends EjercicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEjercicio;
	
	protected JMenuBar jmenuBarDetalleEjercicio;
	
	protected JMenu jmenuDetalleEjercicio;
	protected JMenu jmenuDetalleArchivoEjercicio;
	protected JMenu jmenuDetalleAccionesEjercicio;
	protected JMenu jmenuDetalleDatosEjercicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEjercicio;	
	protected GridBagConstraints gridBagConstraintsEjercicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EjercicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEjercicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public EjercicioSessionBean ejercicioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;	
	
	public EjercicioLogic ejercicioLogic;
	
	public JScrollPane jScrollPanelDatosEjercicio;
	public JScrollPane jScrollPanelDatosEdicionEjercicio;
	public JScrollPane jScrollPanelDatosGeneralEjercicio;
	
	protected JPanel jPanelCamposEjercicio;    
	protected JPanel jPanelCamposOcultosEjercicio;    	
	protected JPanel jPanelAccionesEjercicio;
	protected JPanel jPanelAccionesFormularioEjercicio;
    
	
	
	protected Integer iXPanelCamposEjercicio=0;
	protected Integer iYPanelCamposEjercicio=0;
	
	protected Integer iXPanelCamposOcultosEjercicio=0;
	protected Integer iYPanelCamposOcultosEjercicio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEjercicio;
	public JButton jButtonModificarEjercicio;
	public JButton jButtonActualizarEjercicio;
    public JButton jButtonEliminarEjercicio;
	public JButton jButtonCancelarEjercicio;
    public JButton jButtonGuardarCambiosEjercicio;
	public JButton jButtonGuardarCambiosTablaEjercicio;
	protected JButton jButtonCerrarEjercicio;
	
	
	protected JButton jButtonProcesarInformacionEjercicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEjercicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEjercicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEjercicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEjercicio;
	protected JButton jButtonModificarToolBarEjercicio;
	protected JButton jButtonActualizarToolBarEjercicio;
    protected JButton jButtonEliminarToolBarEjercicio;
	protected JButton jButtonCancelarToolBarEjercicio;
    protected JButton jButtonGuardarCambiosToolBarEjercicio;
	protected JButton jButtonGuardarCambiosTablaToolBarEjercicio;
	protected JButton jButtonMostrarOcultarTablaToolBarEjercicio;
	protected JButton jButtonCerrarToolBarEjercicio;
	
	protected JButton jButtonProcesarInformacionToolBarEjercicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEjercicio;
	protected JMenuItem jMenuItemModificarEjercicio;
	protected JMenuItem jMenuItemActualizarEjercicio;
    protected JMenuItem jMenuItemEliminarEjercicio;
	protected JMenuItem jMenuItemCancelarEjercicio;
    protected JMenuItem jMenuItemGuardarCambiosEjercicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEjercicio;
	protected JMenuItem jMenuItemCerrarEjercicio;
	protected JMenuItem jMenuItemDetalleCerrarEjercicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEjercicio;
	
	protected JMenuItem jMenuItemProcesarInformacionEjercicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEjercicio;
	protected JMenuItem jMenuItemMostrarOcultarEjercicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEjercicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEjercicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEjercicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEjercicio;
	public JLabel jLabelIdEjercicio;
	public JLabel jLabelidEjercicio;
	public JButton jButtonidEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioEjercicio;
	public JLabel jLabelfecha_inicioEjercicio;
	//public JFormattedTextField jDateChooserfecha_inicioEjercicio;

	public JDateChooser jDateChooserfecha_inicioEjercicio;
	public JButton jButtonfecha_inicioEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finEjercicio;
	public JLabel jLabelfecha_finEjercicio;
	//public JFormattedTextField jDateChooserfecha_finEjercicio;

	public JDateChooser jDateChooserfecha_finEjercicio;
	public JButton jButtonfecha_finEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoEjercicio;
	public JLabel jLabelesta_activoEjercicio;
	public JCheckBox jCheckBoxesta_activoEjercicio;
	public JButton jButtonesta_activoEjercicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEjercicio;
	public JLabel jLabelid_empresaEjercicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEjercicio;
	public JButton jButtonid_empresaEjercicio= new JButtonMe();
	public JButton jButtonid_empresaEjercicioUpdate= new JButtonMe();
	public JButton jButtonid_empresaEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelid_anioEjercicio;
	public JLabel jLabelid_anioEjercicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioEjercicio;
	public JButton jButtonid_anioEjercicio= new JButtonMe();
	public JButton jButtonid_anioEjercicioUpdate= new JButtonMe();
	public JButton jButtonid_anioEjercicioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEjercicio;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EjercicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEjercicio=new JPanel();
				this.jPanelAccionesFormularioEjercicio=new JPanel();
				this.jmenuBarDetalleEjercicio=new JMenuBar();
				this.jTtoolBarDetalleEjercicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EjercicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EjercicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ejercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEjercicio() {
		return this.jButtonActualizarToolBarEjercicio;
	}
	
	public JButton getjButtonEliminarToolBarEjercicio() {
		return this.jButtonEliminarToolBarEjercicio;
	}
	
	public JButton getjButtonCancelarToolBarEjercicio() {
		return this.jButtonCancelarToolBarEjercicio;
	}		
	
	public JButton getjButtonProcesarInformacionEjercicio() {
		return this.jButtonProcesarInformacionEjercicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEjercicio)	{
		this.jButtonProcesarInformacionEjercicio = jButtonProcesarInformacionEjercicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEjercicio() {
		return this.jComboBoxTiposAccionesEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEjercicio(
			JComboBox jComboBoxTiposRelacionesEjercicio) {
		this.jComboBoxTiposRelacionesEjercicio = jComboBoxTiposRelacionesEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEjercicio(
			JComboBox jComboBoxTiposAccionesEjercicio) {
		this.jComboBoxTiposAccionesEjercicio = jComboBoxTiposAccionesEjercicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEjercicio() {
		return this.jComboBoxTiposAccionesFormularioEjercicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEjercicio(
			JComboBox jComboBoxTiposAccionesFormularioEjercicio) {
		this.jComboBoxTiposAccionesFormularioEjercicio = jComboBoxTiposAccionesFormularioEjercicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ejercicioSessionBean=new EjercicioSessionBean();
		
		this.ejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ejercicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EjercicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ejercicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
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
	
		EjercicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEjercicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEjercicio=new JButtonMe();
				this.jButtonModificarToolBarEjercicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEjercicio,this.jTtoolBarDetalleEjercicio,
							"actualizar","actualizar","Actualizar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEjercicio,this.jTtoolBarDetalleEjercicio,
							"eliminar","eliminar","Eliminar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEjercicio,this.jTtoolBarDetalleEjercicio,
							"cancelar","cancelar","Cancelar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEjercicio,this.jTtoolBarDetalleEjercicio,
							"guardarcambios","guardarcambios","Guardar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEjercicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEjercicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEjercicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEjercicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEjercicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEjercicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEjercicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEjercicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEjercicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEjercicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEjercicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEjercicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEjercicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEjercicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEjercicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEjercicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEjercicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEjercicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEjercicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEjercicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEjercicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEjercicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEjercicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEjercicio.add(this.jMenuItemDetalleCerrarEjercicio);
		
		this.jmenuDetalleAccionesEjercicio.add(this.jMenuItemActualizarEjercicio);
		this.jmenuDetalleAccionesEjercicio.add(this.jMenuItemEliminarEjercicio);
		this.jmenuDetalleAccionesEjercicio.add(this.jMenuItemCancelarEjercicio);		
		
		//this.jmenuDetalleDatosEjercicio.add(this.jMenuItemDetalleAbrirOrderByEjercicio);				
		this.jmenuDetalleDatosEjercicio.add(this.jMenuItemDetalleMostarOcultarEjercicio);				
				
		//this.jmenuDetalleAccionesEjercicio.add(this.jMenuItemGuardarCambiosEjercicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEjercicio.add(this.jmenuDetalleArchivoEjercicio);		
		this.jmenuBarDetalleEjercicio.add(this.jmenuDetalleAccionesEjercicio);		
		this.jmenuBarDetalleEjercicio.add(this.jmenuDetalleDatosEjercicio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEjercicio);				
	}
	
	
	public void inicializarElementosCamposEjercicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEjercicio = new JLabelMe();
		jLabelIdEjercicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEjercicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEjercicio= new GridBagLayout();

		this.jPanelidEjercicio.setLayout(this.gridaBagLayoutEjercicio);

		jLabelidEjercicio = new JLabel();
		jLabelidEjercicio.setText("Id");

		jLabelidEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioEjercicio = new JLabelMe();
		this.jLabelfecha_inicioEjercicio.setText(""+EjercicioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioEjercicio.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutEjercicio = new GridBagLayout();
		this.jPanelfecha_inicioEjercicio.setLayout(this.gridaBagLayoutEjercicio);


		//jFormattedTextFieldfecha_inicioEjercicio= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioEjercicio= new JDateChooser();
		jDateChooserfecha_inicioEjercicio.setEnabled(false);
		jDateChooserfecha_inicioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioEjercicio.setDate(new Date());
		jDateChooserfecha_inicioEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioEjercicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioEjercicioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioEjercicioBusqueda.setText("U");
		this.jButtonfecha_inicioEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioEjercicioBusqueda"));

		if(this.ejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioEjercicioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finEjercicio = new JLabelMe();
		this.jLabelfecha_finEjercicio.setText(""+EjercicioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finEjercicio.setToolTipText("Fecha Fin");
		this.jLabelfecha_finEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutEjercicio = new GridBagLayout();
		this.jPanelfecha_finEjercicio.setLayout(this.gridaBagLayoutEjercicio);


		//jFormattedTextFieldfecha_finEjercicio= new JFormattedTextFieldMe();

		jDateChooserfecha_finEjercicio= new JDateChooser();
		jDateChooserfecha_finEjercicio.setEnabled(false);
		jDateChooserfecha_finEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finEjercicio.setDate(new Date());
		jDateChooserfecha_finEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finEjercicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finEjercicioBusqueda= new JButtonMe();
		this.jButtonfecha_finEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finEjercicioBusqueda.setText("U");
		this.jButtonfecha_finEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finEjercicioBusqueda"));

		if(this.ejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finEjercicioBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoEjercicio = new JLabelMe();
		this.jLabelesta_activoEjercicio.setText(""+EjercicioConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoEjercicio.setToolTipText("Esta Activo");
		this.jLabelesta_activoEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutEjercicio = new GridBagLayout();
		this.jPanelesta_activoEjercicio.setLayout(this.gridaBagLayoutEjercicio);


		jCheckBoxesta_activoEjercicio= new JCheckBoxMe();
		jCheckBoxesta_activoEjercicio.setEnabled(false);

		jCheckBoxesta_activoEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoEjercicioBusqueda= new JButtonMe();
		this.jButtonesta_activoEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoEjercicioBusqueda.setText("U");
		this.jButtonesta_activoEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoEjercicioBusqueda"));

		if(this.ejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoEjercicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEjercicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEjercicio = new JLabelMe();
		this.jLabelid_empresaEjercicio.setText(""+EjercicioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEjercicio.setToolTipText("Empresa");
		this.jLabelid_empresaEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEjercicio = new GridBagLayout();
		this.jPanelid_empresaEjercicio.setLayout(this.gridaBagLayoutEjercicio);


		jComboBoxid_empresaEjercicio= new JComboBoxMe();
		jComboBoxid_empresaEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEjercicio.setEnabled(false);

		this.jButtonid_empresaEjercicio= new JButtonMe();
		this.jButtonid_empresaEjercicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEjercicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEjercicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEjercicio.setText("Buscar");
		this.jButtonid_empresaEjercicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEjercicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEjercicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEjercicio"));

		this.jButtonid_empresaEjercicioBusqueda= new JButtonMe();
		this.jButtonid_empresaEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEjercicioBusqueda.setText("U");
		this.jButtonid_empresaEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEjercicioBusqueda"));

		if(this.ejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEjercicioBusqueda.setVisible(false);		}

		this.jButtonid_empresaEjercicioUpdate= new JButtonMe();
		this.jButtonid_empresaEjercicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEjercicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEjercicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEjercicioUpdate.setText("U");
		this.jButtonid_empresaEjercicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEjercicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEjercicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEjercicioUpdate"));



					
		this.jLabelid_anioEjercicio = new JLabelMe();
		this.jLabelid_anioEjercicio.setText(""+EjercicioConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioEjercicio.setToolTipText("Anio");
		this.jLabelid_anioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioEjercicio.setToolTipText(EjercicioConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutEjercicio = new GridBagLayout();
		this.jPanelid_anioEjercicio.setLayout(this.gridaBagLayoutEjercicio);


		jComboBoxid_anioEjercicio= new JComboBoxMe();
		jComboBoxid_anioEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioEjercicio= new JButtonMe();
		this.jButtonid_anioEjercicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEjercicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEjercicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEjercicio.setText("Buscar");
		this.jButtonid_anioEjercicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioEjercicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEjercicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEjercicio"));

		this.jButtonid_anioEjercicioBusqueda= new JButtonMe();
		this.jButtonid_anioEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEjercicioBusqueda.setText("U");
		this.jButtonid_anioEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEjercicioBusqueda"));

		if(this.ejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioEjercicioBusqueda.setVisible(false);		}

		this.jButtonid_anioEjercicioUpdate= new JButtonMe();
		this.jButtonid_anioEjercicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEjercicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEjercicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEjercicioUpdate.setText("U");
		this.jButtonid_anioEjercicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioEjercicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEjercicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEjercicioUpdate"));



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
		//this.jInternalFrameDetalleEjercicio = new EjercicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ejercicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEjercicio= new GridBagLayout();
		

		
		String sToolTipEjercicio="";
		sToolTipEjercicio=EjercicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEjercicio+="(Contabilidad.Ejercicio)";
		}
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEjercicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEjercicio = new JButtonMe();
		this.jButtonModificarEjercicio = new JButtonMe();
        this.jButtonActualizarEjercicio = new JButtonMe();
        this.jButtonEliminarEjercicio = new JButtonMe();
        this.jButtonCancelarEjercicio = new JButtonMe();
        this.jButtonGuardarCambiosEjercicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaEjercicio = new JButtonMe();
		this.jButtonCerrarEjercicio = new JButtonMe();
		
		this.jScrollPanelDatosEjercicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionEjercicio = new JScrollPane();
		this.jScrollPanelDatosGeneralEjercicio = new JScrollPane();
				
		
		
		this.jPanelCamposEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ejercicio";
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ejercicios" + this.sPath));
		} else {
			this.jScrollPanelDatosEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEjercicio.setName("jPanelCamposEjercicio"); 

		this.jPanelCamposOcultosEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEjercicio.setName("jPanelCamposOcultosEjercicio"); 

        this.jPanelAccionesEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesEjercicio.setName("Acciones"); 

		this.jPanelAccionesFormularioEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEjercicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEjercicio.setText("Nuevo");
		this.jButtonModificarEjercicio.setText("Editar");
        this.jButtonActualizarEjercicio.setText("Actualizar");
        this.jButtonEliminarEjercicio.setText("Eliminar");
        this.jButtonCancelarEjercicio.setText("Cancelar");
        this.jButtonGuardarCambiosEjercicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaEjercicio.setText("Guardar");
		this.jButtonCerrarEjercicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEjercicio,"nuevo_button","Nuevo",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEjercicio,"modificar_button","Editar",this.ejercicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEjercicio,"actualizar_button","Actualizar",this.ejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEjercicio,"eliminar_button","Eliminar",this.ejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEjercicio,"cancelar_button","Cancelar",this.ejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEjercicio,"guardarcambios_button","Guardar",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEjercicio,"guardarcambiostabla_button","Guardar",this.ejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEjercicio,"cerrar_button","Salir",this.ejercicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEjercicio.setToolTipText("Nuevo"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEjercicio.setToolTipText("Editar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEjercicio.setToolTipText("Actualizar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEjercicio.setToolTipText("Eliminar)"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEjercicio.setToolTipText("Cancelar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEjercicio.setToolTipText("Guardar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEjercicio.setToolTipText("Guardar"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEjercicio.setToolTipText("Salir"+" "+EjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEjercicio";
		inputMap = this.jButtonNuevoEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEjercicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEjercicio";
		inputMap = this.jButtonActualizarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEjercicio"));
		
		//ELIMINAR
		sMapKey = "EliminarEjercicio";
		inputMap = this.jButtonEliminarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEjercicio"));
		
		//CANCELAR	
		sMapKey = "CancelarEjercicio";
		inputMap = this.jButtonCancelarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEjercicio"));
		
		//CERRAR		
		sMapKey = "CerrarEjercicio";
		inputMap = this.jButtonCerrarEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEjercicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEjercicio";
		inputMap = this.jButtonGuardarCambiosTablaEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEjercicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEjercicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEjercicio.setToolTipText("Nuevo Ejercicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEjercicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEjercicio.setToolTipText("Sin Cerrar Ventana Ejercicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEjercicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEjercicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEjercicio.setText("Accion");
		this.jComboBoxTiposAccionesEjercicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEjercicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEjercicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEjercicio = new JLabelMe();
		
		this.jLabelAccionesEjercicio.setText("Acciones");		
		this.jLabelAccionesEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEjercicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEjercicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEjercicio=new JTabbedPane();
		this.jTabbedPaneRelacionesEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEjercicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEjercicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEjercicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEjercicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEjercicio = new GridBagLayout();
		
		this.jPanelCamposEjercicio.setLayout(gridaBagLayoutCamposEjercicio);
		this.jPanelCamposOcultosEjercicio.setLayout(gridaBagLayoutCamposOcultosEjercicio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEjercicio.add(jLabelIdEjercicio, this.gridBagConstraintsEjercicio);



	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEjercicio.add(jLabelidEjercicio, this.gridBagConstraintsEjercicio);


	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEjercicio.add(jLabelid_empresaEjercicio, this.gridBagConstraintsEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 2;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEjercicio.add(jButtonid_empresaEjercicioBusqueda, this.gridBagConstraintsEjercicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 3;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEjercicio.add(jButtonid_empresaEjercicioUpdate, this.gridBagConstraintsEjercicio);
	}

	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEjercicio.add(jComboBoxid_empresaEjercicio, this.gridBagConstraintsEjercicio);


	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioEjercicio.add(jLabelid_anioEjercicio, this.gridBagConstraintsEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 2;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEjercicio.add(jButtonid_anioEjercicioBusqueda, this.gridBagConstraintsEjercicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 3;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEjercicio.add(jButtonid_anioEjercicioUpdate, this.gridBagConstraintsEjercicio);
	}

	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioEjercicio.add(jComboBoxid_anioEjercicio, this.gridBagConstraintsEjercicio);


	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioEjercicio.add(jLabelfecha_inicioEjercicio, this.gridBagConstraintsEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 2;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioEjercicio.add(jButtonfecha_inicioEjercicioBusqueda, this.gridBagConstraintsEjercicio);
	}

	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioEjercicio.add(jDateChooserfecha_inicioEjercicio, this.gridBagConstraintsEjercicio);


	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finEjercicio.add(jLabelfecha_finEjercicio, this.gridBagConstraintsEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 2;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finEjercicio.add(jButtonfecha_finEjercicioBusqueda, this.gridBagConstraintsEjercicio);
	}

	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finEjercicio.add(jDateChooserfecha_finEjercicio, this.gridBagConstraintsEjercicio);


	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 0;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoEjercicio.add(jLabelesta_activoEjercicio, this.gridBagConstraintsEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = 2;
		this.gridBagConstraintsEjercicio.ipadx = 0;
		this.gridBagConstraintsEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoEjercicio.add(jButtonesta_activoEjercicioBusqueda, this.gridBagConstraintsEjercicio);
	}

	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEjercicio.gridy = 0;
	this.gridBagConstraintsEjercicio.gridx = 1;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoEjercicio.add(jCheckBoxesta_activoEjercicio, this.gridBagConstraintsEjercicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEjercicio.add(this.jPanelidEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposEjercicio % 1==0) {
		iXPanelCamposEjercicio=0;
		iYPanelCamposEjercicio++;
	}
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEjercicio.add(this.jPanelid_anioEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposEjercicio % 1==0) {
		iXPanelCamposEjercicio=0;
		iYPanelCamposEjercicio++;
	}
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEjercicio.add(this.jPanelfecha_inicioEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposEjercicio % 1==0) {
		iXPanelCamposEjercicio=0;
		iYPanelCamposEjercicio++;
	}
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEjercicio.add(this.jPanelfecha_finEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposEjercicio % 1==0) {
		iXPanelCamposEjercicio=0;
		iYPanelCamposEjercicio++;
	}
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEjercicio.add(this.jPanelesta_activoEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposEjercicio % 1==0) {
		iXPanelCamposEjercicio=0;
		iYPanelCamposEjercicio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEjercicio = new GridBagConstraints();
	this.gridBagConstraintsEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEjercicio.gridy = iYPanelCamposOcultosEjercicio;
	this.gridBagConstraintsEjercicio.gridx = iXPanelCamposOcultosEjercicio++;
	this.gridBagConstraintsEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEjercicio.add(this.jPanelid_empresaEjercicio, this.gridBagConstraintsEjercicio);



	if(iXPanelCamposOcultosEjercicio % 1==0) {
		iXPanelCamposOcultosEjercicio=0;
		iYPanelCamposOcultosEjercicio++;
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
			
		GridBagLayout gridaBagLayoutAccionesEjercicio= new GridBagLayout();
		this.jPanelAccionesEjercicio.setLayout(gridaBagLayoutAccionesEjercicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEjercicio= new GridBagLayout();
		this.jPanelAccionesFormularioEjercicio.setLayout(gridaBagLayoutAccionesFormularioEjercicio);
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEjercicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEjercicio.add(this.jComboBoxTiposAccionesFormularioEjercicio, this.gridBagConstraintsEjercicio);

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEjercicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEjercicio.add(this.jCheckBoxPostAccionNuevoEjercicio, this.gridBagConstraintsEjercicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ejercicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEjercicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEjercicio.add(this.jCheckBoxPostAccionSinCerrarEjercicio, this.gridBagConstraintsEjercicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ejercicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEjercicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEjercicio.add(this.jCheckBoxPostAccionSinMensajeEjercicio, this.gridBagConstraintsEjercicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesEjercicio.add(this.jButtonModificarEjercicio, this.gridBagConstraintsEjercicio);							

		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEjercicio.gridy = 0;
		this.gridBagConstraintsEjercicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesEjercicio.add(this.jButtonEliminarEjercicio, this.gridBagConstraintsEjercicio);
		
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = 0;		
		this.gridBagConstraintsEjercicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEjercicio.add(this.jButtonActualizarEjercicio, this.gridBagConstraintsEjercicio);


		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = 0;		
		this.gridBagConstraintsEjercicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEjercicio.add(this.jButtonGuardarCambiosEjercicio, this.gridBagConstraintsEjercicio);	
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = 0;		
		this.gridBagConstraintsEjercicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesEjercicio.add(this.jButtonCancelarEjercicio, this.gridBagConstraintsEjercicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEjercicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEjercicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEjercicio = new GridBagConstraints();						
			this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEjercicio.gridx = 0;		
			//this.gridBagConstraintsEjercicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEjercicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEjercicio.gridx =0;
		this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEjercicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEjercicio, this.gridBagConstraintsEjercicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EjercicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEjercicio = new EjercicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ejercicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ejercicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ejercicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EjercicioModel ejercicioModel=new EjercicioModel(this);
			
			//SI USARA CLASE INTERNA
			//EjercicioModel.EjercicioFocusTraversalPolicy ejercicioFocusTraversalPolicy = ejercicioModel.new EjercicioFocusTraversalPolicy(this);
			
			//ejercicioFocusTraversalPolicy.setejercicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ejercicioModel);
			
			
			this.jContentPaneDetalleEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEjercicio = new GridBagLayout();	
			this.jContentPaneDetalleEjercicio.setLayout(gridaBagLayoutDetalleEjercicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEjercicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEjercicio = new GridBagConstraints();
				this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEjercicio.gridx = 0;
					
				
				this.jContentPaneDetalleEjercicio.add(jTtoolBarDetalleEjercicio, gridBagConstraintsEjercicio);								
				
}
			
			this.jScrollPanelDatosEdicionEjercicio=   new JScrollPane(jContentPaneDetalleEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEjercicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEjercicio.gridx = 0;
	        
			this.jContentPaneDetalleEjercicio.add(jPanelCamposEjercicio, gridBagConstraintsEjercicio);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& ejercicioSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEjercicio= new GridBagConstraints();
						this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEjercicio.gridx = 0;
						this.jContentPaneDetalleEjercicio.add(this.jTabbedPaneRelacionesEjercicio, this.gridBagConstraintsEjercicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEjercicio.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEjercicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEjercicio = new GridBagConstraints();
					this.gridBagConstraintsEjercicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEjercicio.gridx = 0;
					
				
					this.jContentPaneDetalleEjercicio.add(jPanelCamposOcultosEjercicio, gridBagConstraintsEjercicio);
				
					this.jPanelCamposOcultosEjercicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEjercicio.gridx = 0;
	        this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEjercicio.add(this.jPanelAccionesFormularioEjercicio, this.gridBagConstraintsEjercicio);							
			
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
	        this.gridBagConstraintsEjercicio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEjercicio.gridx = 0;
	        
			
			this.jContentPaneDetalleEjercicio.add(this.jPanelAccionesEjercicio, this.gridBagConstraintsEjercicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEjercicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEjercicio=   new JScrollPane(this.jPanelCamposEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEjercicio.gridx = 0;
			this.gridBagConstraintsEjercicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEjercicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEjercicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEjercicio, this.gridBagConstraintsEjercicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEjercicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEjercicio, this.gridBagConstraintsEjercicio);			
			
			this.gridBagConstraintsEjercicio = new GridBagConstraints();
			this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEjercicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEjercicio, this.gridBagConstraintsEjercicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEjercicio, this.gridBagConstraintsEjercicio);
			
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEjercicio, this.gridBagConstraintsEjercicio);
		
			
		this.gridBagConstraintsEjercicio = new GridBagConstraints();
		this.gridBagConstraintsEjercicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEjercicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEjercicio, this.gridBagConstraintsEjercicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEjercicio;//jContentPane;
		
		return jScrollPanelDatosEdicionEjercicio;
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
