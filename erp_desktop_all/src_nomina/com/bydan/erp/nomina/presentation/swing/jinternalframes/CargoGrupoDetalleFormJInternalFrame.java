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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.CargoGrupoConstantesFunciones;

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
public class CargoGrupoDetalleFormJInternalFrame extends CargoGrupoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCargoGrupo;
	
	protected JMenuBar jmenuBarDetalleCargoGrupo;
	
	protected JMenu jmenuDetalleCargoGrupo;
	protected JMenu jmenuDetalleArchivoCargoGrupo;
	protected JMenu jmenuDetalleAccionesCargoGrupo;
	protected JMenu jmenuDetalleDatosCargoGrupo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargoGrupo;	
	protected GridBagConstraints gridBagConstraintsCargoGrupo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CargoGrupoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCargoGrupo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CargoGrupoSessionBean cargogrupoSessionBean;
	
	

	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;
	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargo=false;
	public CargoSessionBean cargoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CargoGrupoLogic cargogrupoLogic;
	
	public JScrollPane jScrollPanelDatosCargoGrupo;
	public JScrollPane jScrollPanelDatosEdicionCargoGrupo;
	public JScrollPane jScrollPanelDatosGeneralCargoGrupo;
	
	protected JPanel jPanelCamposCargoGrupo;    
	protected JPanel jPanelCamposOcultosCargoGrupo;    	
	protected JPanel jPanelAccionesCargoGrupo;
	protected JPanel jPanelAccionesFormularioCargoGrupo;
    
	
	
	protected Integer iXPanelCamposCargoGrupo=0;
	protected Integer iYPanelCamposCargoGrupo=0;
	
	protected Integer iXPanelCamposOcultosCargoGrupo=0;
	protected Integer iYPanelCamposOcultosCargoGrupo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCargoGrupo;
	public JButton jButtonModificarCargoGrupo;
	public JButton jButtonActualizarCargoGrupo;
    public JButton jButtonEliminarCargoGrupo;
	public JButton jButtonCancelarCargoGrupo;
    public JButton jButtonGuardarCambiosCargoGrupo;
	public JButton jButtonGuardarCambiosTablaCargoGrupo;
	protected JButton jButtonCerrarCargoGrupo;
	
	
	protected JButton jButtonProcesarInformacionCargoGrupo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCargoGrupo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCargoGrupo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCargoGrupo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargoGrupo;
	protected JButton jButtonModificarToolBarCargoGrupo;
	protected JButton jButtonActualizarToolBarCargoGrupo;
    protected JButton jButtonEliminarToolBarCargoGrupo;
	protected JButton jButtonCancelarToolBarCargoGrupo;
    protected JButton jButtonGuardarCambiosToolBarCargoGrupo;
	protected JButton jButtonGuardarCambiosTablaToolBarCargoGrupo;
	protected JButton jButtonMostrarOcultarTablaToolBarCargoGrupo;
	protected JButton jButtonCerrarToolBarCargoGrupo;
	
	protected JButton jButtonProcesarInformacionToolBarCargoGrupo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargoGrupo;
	protected JMenuItem jMenuItemModificarCargoGrupo;
	protected JMenuItem jMenuItemActualizarCargoGrupo;
    protected JMenuItem jMenuItemEliminarCargoGrupo;
	protected JMenuItem jMenuItemCancelarCargoGrupo;
    protected JMenuItem jMenuItemGuardarCambiosCargoGrupo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargoGrupo;
	protected JMenuItem jMenuItemCerrarCargoGrupo;
	protected JMenuItem jMenuItemDetalleCerrarCargoGrupo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargoGrupo;
	
	protected JMenuItem jMenuItemProcesarInformacionCargoGrupo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargoGrupo;
	protected JMenuItem jMenuItemMostrarOcultarCargoGrupo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargoGrupo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargoGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargoGrupo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCargoGrupo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCargoGrupo;
	public JLabel jLabelIdCargoGrupo;
	public JLabel jLabelidCargoGrupo;
	public JButton jButtonidCargoGrupoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCargoGrupo;
	public JLabel jLabelcodigoCargoGrupo;
	public JTextField jTextFieldcodigoCargoGrupo;
	public JButton jButtoncodigoCargoGrupoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCargoGrupo;
	public JLabel jLabelnombreCargoGrupo;
	public JTextArea jTextAreanombreCargoGrupo;
	public JScrollPane jscrollPanenombreCargoGrupo;
	public JButton jButtonnombreCargoGrupoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCargoGrupo;
	public JLabel jLabelid_empresaCargoGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCargoGrupo;
	public JButton jButtonid_empresaCargoGrupo= new JButtonMe();
	public JButton jButtonid_empresaCargoGrupoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCargoGrupoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCargoGrupo;
	
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
	
	public CargoGrupoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCargoGrupo=new JPanel();
				this.jPanelAccionesFormularioCargoGrupo=new JPanel();
				this.jmenuBarDetalleCargoGrupo=new JMenuBar();
				this.jTtoolBarDetalleCargoGrupo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CargoGrupoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCargoGrupo() {
		return this.jButtonActualizarToolBarCargoGrupo;
	}
	
	public JButton getjButtonEliminarToolBarCargoGrupo() {
		return this.jButtonEliminarToolBarCargoGrupo;
	}
	
	public JButton getjButtonCancelarToolBarCargoGrupo() {
		return this.jButtonCancelarToolBarCargoGrupo;
	}		
	
	public JButton getjButtonProcesarInformacionCargoGrupo() {
		return this.jButtonProcesarInformacionCargoGrupo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargoGrupo)	{
		this.jButtonProcesarInformacionCargoGrupo = jButtonProcesarInformacionCargoGrupo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargoGrupo() {
		return this.jComboBoxTiposAccionesCargoGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargoGrupo(
			JComboBox jComboBoxTiposRelacionesCargoGrupo) {
		this.jComboBoxTiposRelacionesCargoGrupo = jComboBoxTiposRelacionesCargoGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargoGrupo(
			JComboBox jComboBoxTiposAccionesCargoGrupo) {
		this.jComboBoxTiposAccionesCargoGrupo = jComboBoxTiposAccionesCargoGrupo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCargoGrupo() {
		return this.jComboBoxTiposAccionesFormularioCargoGrupo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCargoGrupo(
			JComboBox jComboBoxTiposAccionesFormularioCargoGrupo) {
		this.jComboBoxTiposAccionesFormularioCargoGrupo = jComboBoxTiposAccionesFormularioCargoGrupo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cargogrupoSessionBean=new CargoGrupoSessionBean();
		
		this.cargogrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargogrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargogrupoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cargoSessionBean=new CargoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoGrupoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo Grupo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
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
	
		CargoGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCargoGrupo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCargoGrupo=new JButtonMe();
				this.jButtonModificarToolBarCargoGrupo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo,
							"actualizar","actualizar","Actualizar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo,
							"eliminar","eliminar","Eliminar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo,
							"cancelar","cancelar","Cancelar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo,
							"guardarcambios","guardarcambios","Guardar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCargoGrupo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCargoGrupo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCargoGrupo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCargoGrupo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCargoGrupo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargoGrupo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargoGrupo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargoGrupo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCargoGrupo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCargoGrupo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCargoGrupo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCargoGrupo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCargoGrupo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCargoGrupo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCargoGrupo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCargoGrupo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCargoGrupo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCargoGrupo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCargoGrupo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCargoGrupo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCargoGrupo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargoGrupo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargoGrupo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargoGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargoGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargoGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCargoGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCargoGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCargoGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargoGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargoGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargoGrupo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargoGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargoGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargoGrupo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCargoGrupo.add(this.jMenuItemDetalleCerrarCargoGrupo);
		
		this.jmenuDetalleAccionesCargoGrupo.add(this.jMenuItemActualizarCargoGrupo);
		this.jmenuDetalleAccionesCargoGrupo.add(this.jMenuItemEliminarCargoGrupo);
		this.jmenuDetalleAccionesCargoGrupo.add(this.jMenuItemCancelarCargoGrupo);		
		
		//this.jmenuDetalleDatosCargoGrupo.add(this.jMenuItemDetalleAbrirOrderByCargoGrupo);				
		this.jmenuDetalleDatosCargoGrupo.add(this.jMenuItemDetalleMostarOcultarCargoGrupo);				
				
		//this.jmenuDetalleAccionesCargoGrupo.add(this.jMenuItemGuardarCambiosCargoGrupo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCargoGrupo.add(this.jmenuDetalleArchivoCargoGrupo);		
		this.jmenuBarDetalleCargoGrupo.add(this.jmenuDetalleAccionesCargoGrupo);		
		this.jmenuBarDetalleCargoGrupo.add(this.jmenuDetalleDatosCargoGrupo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCargoGrupo.add(this.jmenuDetalleCargoGrupo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCargoGrupo);				
	}
	
	
	public void inicializarElementosCamposCargoGrupo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCargoGrupo = new JLabelMe();
		jLabelIdCargoGrupo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCargoGrupo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCargoGrupo.setToolTipText(CargoGrupoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCargoGrupo= new GridBagLayout();

		this.jPanelidCargoGrupo.setLayout(this.gridaBagLayoutCargoGrupo);

		jLabelidCargoGrupo = new JLabel();
		jLabelidCargoGrupo.setText("Id");

		jLabelidCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCargoGrupo = new JLabelMe();
		this.jLabelcodigoCargoGrupo.setText(""+CargoGrupoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCargoGrupo.setToolTipText("Codigo");
		this.jLabelcodigoCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCargoGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCargoGrupo.setToolTipText(CargoGrupoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCargoGrupo = new GridBagLayout();
		this.jPanelcodigoCargoGrupo.setLayout(this.gridaBagLayoutCargoGrupo);


		jTextFieldcodigoCargoGrupo= new JTextFieldMe();

		jTextFieldcodigoCargoGrupo.setEnabled(false);
		jTextFieldcodigoCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCargoGrupoBusqueda= new JButtonMe();
		this.jButtoncodigoCargoGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCargoGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCargoGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCargoGrupoBusqueda.setText("U");
		this.jButtoncodigoCargoGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCargoGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCargoGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCargoGrupoBusqueda"));

		if(this.cargogrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCargoGrupoBusqueda.setVisible(false);		}


					
		this.jLabelnombreCargoGrupo = new JLabelMe();
		this.jLabelnombreCargoGrupo.setText(""+CargoGrupoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCargoGrupo.setToolTipText("Nombre");
		this.jLabelnombreCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCargoGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCargoGrupo.setToolTipText(CargoGrupoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCargoGrupo = new GridBagLayout();
		this.jPanelnombreCargoGrupo.setLayout(this.gridaBagLayoutCargoGrupo);


		jTextAreanombreCargoGrupo= new JTextAreaMe();
		jTextAreanombreCargoGrupo.setEnabled(false);
		jTextAreanombreCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargoGrupo.setLineWrap(true);
		jTextAreanombreCargoGrupo.setWrapStyleWord(true);
		jTextAreanombreCargoGrupo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCargoGrupo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCargoGrupo = new JScrollPane(jTextAreanombreCargoGrupo);
		jscrollPanenombreCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCargoGrupoBusqueda= new JButtonMe();
		this.jButtonnombreCargoGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargoGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargoGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCargoGrupoBusqueda.setText("U");
		this.jButtonnombreCargoGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCargoGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCargoGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCargoGrupoBusqueda"));

		if(this.cargogrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCargoGrupoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCargoGrupo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCargoGrupo = new JLabelMe();
		this.jLabelid_empresaCargoGrupo.setText(""+CargoGrupoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCargoGrupo.setToolTipText("Empresa");
		this.jLabelid_empresaCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCargoGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCargoGrupo.setToolTipText(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCargoGrupo = new GridBagLayout();
		this.jPanelid_empresaCargoGrupo.setLayout(this.gridaBagLayoutCargoGrupo);


		jComboBoxid_empresaCargoGrupo= new JComboBoxMe();
		jComboBoxid_empresaCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCargoGrupo.setEnabled(false);

		this.jButtonid_empresaCargoGrupo= new JButtonMe();
		this.jButtonid_empresaCargoGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoGrupo.setText("Buscar");
		this.jButtonid_empresaCargoGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCargoGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoGrupo"));

		this.jButtonid_empresaCargoGrupoBusqueda= new JButtonMe();
		this.jButtonid_empresaCargoGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoGrupoBusqueda.setText("U");
		this.jButtonid_empresaCargoGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCargoGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoGrupoBusqueda"));

		if(this.cargogrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCargoGrupoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCargoGrupoUpdate= new JButtonMe();
		this.jButtonid_empresaCargoGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoGrupoUpdate.setText("U");
		this.jButtonid_empresaCargoGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCargoGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoGrupoUpdate"));



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
		//this.jInternalFrameDetalleCargoGrupo = new CargoGrupoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cargo Grupo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargoGrupo= new GridBagLayout();
		

		
		String sToolTipCargoGrupo="";
		sToolTipCargoGrupo=CargoGrupoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargoGrupo+="(Nomina.CargoGrupo)";
		}
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargoGrupo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCargoGrupo = new JButtonMe();
		this.jButtonModificarCargoGrupo = new JButtonMe();
        this.jButtonActualizarCargoGrupo = new JButtonMe();
        this.jButtonEliminarCargoGrupo = new JButtonMe();
        this.jButtonCancelarCargoGrupo = new JButtonMe();
        this.jButtonGuardarCambiosCargoGrupo = new JButtonMe();
		this.jButtonGuardarCambiosTablaCargoGrupo = new JButtonMe();
		this.jButtonCerrarCargoGrupo = new JButtonMe();
		
		this.jScrollPanelDatosCargoGrupo = new JScrollPane();   
        this.jScrollPanelDatosEdicionCargoGrupo = new JScrollPane();
		this.jScrollPanelDatosGeneralCargoGrupo = new JScrollPane();
				
		
		
		this.jPanelCamposCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo Grupo";
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos" + this.sPath));
		} else {
			this.jScrollPanelDatosCargoGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCargoGrupo.setName("jPanelCamposCargoGrupo"); 

		this.jPanelCamposOcultosCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCargoGrupo.setName("jPanelCamposOcultosCargoGrupo"); 

        this.jPanelAccionesCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargoGrupo.setToolTipText("Acciones");
        this.jPanelAccionesCargoGrupo.setName("Acciones"); 

		this.jPanelAccionesFormularioCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCargoGrupo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCargoGrupo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCargoGrupo.setText("Nuevo");
		this.jButtonModificarCargoGrupo.setText("Editar");
        this.jButtonActualizarCargoGrupo.setText("Actualizar");
        this.jButtonEliminarCargoGrupo.setText("Eliminar");
        this.jButtonCancelarCargoGrupo.setText("Cancelar");
        this.jButtonGuardarCambiosCargoGrupo.setText("Guardar");
		this.jButtonGuardarCambiosTablaCargoGrupo.setText("Guardar");
		this.jButtonCerrarCargoGrupo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargoGrupo,"nuevo_button","Nuevo",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCargoGrupo,"modificar_button","Editar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCargoGrupo,"actualizar_button","Actualizar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCargoGrupo,"eliminar_button","Eliminar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCargoGrupo,"cancelar_button","Cancelar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCargoGrupo,"guardarcambios_button","Guardar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargoGrupo,"guardarcambiostabla_button","Guardar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargoGrupo,"cerrar_button","Salir",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCargoGrupo.setToolTipText("Nuevo"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCargoGrupo.setToolTipText("Editar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCargoGrupo.setToolTipText("Actualizar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCargoGrupo.setToolTipText("Eliminar)"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCargoGrupo.setToolTipText("Cancelar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCargoGrupo.setToolTipText("Guardar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCargoGrupo.setToolTipText("Guardar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargoGrupo.setToolTipText("Salir"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargoGrupo";
		inputMap = this.jButtonNuevoCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargoGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargoGrupo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCargoGrupo";
		inputMap = this.jButtonActualizarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCargoGrupo"));
		
		//ELIMINAR
		sMapKey = "EliminarCargoGrupo";
		inputMap = this.jButtonEliminarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCargoGrupo"));
		
		//CANCELAR	
		sMapKey = "CancelarCargoGrupo";
		inputMap = this.jButtonCancelarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCargoGrupo"));
		
		//CERRAR		
		sMapKey = "CerrarCargoGrupo";
		inputMap = this.jButtonCerrarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargoGrupo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargoGrupo";
		inputMap = this.jButtonGuardarCambiosTablaCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargoGrupo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCargoGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCargoGrupo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCargoGrupo.setToolTipText("Nuevo CargoGrupo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCargoGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCargoGrupo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCargoGrupo.setToolTipText("Sin Cerrar Ventana CargoGrupo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCargoGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCargoGrupo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCargoGrupo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargoGrupo.setText("Accion");
		this.jComboBoxTiposAccionesCargoGrupo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCargoGrupo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCargoGrupo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCargoGrupo = new JLabelMe();
		
		this.jLabelAccionesCargoGrupo.setText("Acciones");		
		this.jLabelAccionesCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCargoGrupo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCargoGrupo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCargoGrupo=new JTabbedPane();
		this.jTabbedPaneRelacionesCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCargoGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCargoGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCargoGrupo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargoGrupo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargoGrupo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCargoGrupo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCargoGrupo = new GridBagLayout();
		
		this.jPanelCamposCargoGrupo.setLayout(gridaBagLayoutCamposCargoGrupo);
		this.jPanelCamposOcultosCargoGrupo.setLayout(gridaBagLayoutCamposOcultosCargoGrupo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 0;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCargoGrupo.add(jLabelIdCargoGrupo, this.gridBagConstraintsCargoGrupo);



	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 1;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCargoGrupo.add(jLabelidCargoGrupo, this.gridBagConstraintsCargoGrupo);


	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 0;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCargoGrupo.add(jLabelid_empresaCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		//this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = 2;
		this.gridBagConstraintsCargoGrupo.ipadx = 0;
		this.gridBagConstraintsCargoGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargoGrupo.add(jButtonid_empresaCargoGrupoBusqueda, this.gridBagConstraintsCargoGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		//this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = 3;
		this.gridBagConstraintsCargoGrupo.ipadx = 0;
		this.gridBagConstraintsCargoGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargoGrupo.add(jButtonid_empresaCargoGrupoUpdate, this.gridBagConstraintsCargoGrupo);
	}

	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 1;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCargoGrupo.add(jComboBoxid_empresaCargoGrupo, this.gridBagConstraintsCargoGrupo);


	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 0;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCargoGrupo.add(jLabelcodigoCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		//this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = 2;
		this.gridBagConstraintsCargoGrupo.ipadx = 0;
		this.gridBagConstraintsCargoGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCargoGrupo.add(jButtoncodigoCargoGrupoBusqueda, this.gridBagConstraintsCargoGrupo);
	}

	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 1;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCargoGrupo.add(jTextFieldcodigoCargoGrupo, this.gridBagConstraintsCargoGrupo);


	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 0;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCargoGrupo.add(jLabelnombreCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		//this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = 2;
		this.gridBagConstraintsCargoGrupo.ipadx = 0;
		this.gridBagConstraintsCargoGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCargoGrupo.add(jButtonnombreCargoGrupoBusqueda, this.gridBagConstraintsCargoGrupo);
	}

	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoGrupo.gridy = 0;
	this.gridBagConstraintsCargoGrupo.gridx = 1;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCargoGrupo.add(jscrollPanenombreCargoGrupo, this.gridBagConstraintsCargoGrupo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoGrupo.gridy = iYPanelCamposCargoGrupo;
	this.gridBagConstraintsCargoGrupo.gridx = iXPanelCamposCargoGrupo++;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoGrupo.add(this.jPanelidCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(iXPanelCamposCargoGrupo % 1==0) {
		iXPanelCamposCargoGrupo=0;
		iYPanelCamposCargoGrupo++;
	}
	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoGrupo.gridy = iYPanelCamposCargoGrupo;
	this.gridBagConstraintsCargoGrupo.gridx = iXPanelCamposCargoGrupo++;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoGrupo.add(this.jPanelcodigoCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(iXPanelCamposCargoGrupo % 1==0) {
		iXPanelCamposCargoGrupo=0;
		iYPanelCamposCargoGrupo++;
	}
	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoGrupo.gridy = iYPanelCamposCargoGrupo;
	this.gridBagConstraintsCargoGrupo.gridx = iXPanelCamposCargoGrupo++;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoGrupo.add(this.jPanelnombreCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(iXPanelCamposCargoGrupo % 1==0) {
		iXPanelCamposCargoGrupo=0;
		iYPanelCamposCargoGrupo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoGrupo.gridy = iYPanelCamposOcultosCargoGrupo;
	this.gridBagConstraintsCargoGrupo.gridx = iXPanelCamposOcultosCargoGrupo++;
	this.gridBagConstraintsCargoGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCargoGrupo.add(this.jPanelid_empresaCargoGrupo, this.gridBagConstraintsCargoGrupo);



	if(iXPanelCamposOcultosCargoGrupo % 1==0) {
		iXPanelCamposOcultosCargoGrupo=0;
		iYPanelCamposOcultosCargoGrupo++;
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
			
		GridBagLayout gridaBagLayoutAccionesCargoGrupo= new GridBagLayout();
		this.jPanelAccionesCargoGrupo.setLayout(gridaBagLayoutAccionesCargoGrupo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCargoGrupo= new GridBagLayout();
		this.jPanelAccionesFormularioCargoGrupo.setLayout(gridaBagLayoutAccionesFormularioCargoGrupo);
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargoGrupo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargoGrupo.add(this.jComboBoxTiposAccionesFormularioCargoGrupo, this.gridBagConstraintsCargoGrupo);

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargoGrupo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargoGrupo.add(this.jCheckBoxPostAccionNuevoCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargoGrupo.add(this.jCheckBoxPostAccionSinCerrarCargoGrupo, this.gridBagConstraintsCargoGrupo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargoGrupo.add(this.jCheckBoxPostAccionSinMensajeCargoGrupo, this.gridBagConstraintsCargoGrupo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXAccion++;
			
		this.jPanelAccionesCargoGrupo.add(this.jButtonModificarCargoGrupo, this.gridBagConstraintsCargoGrupo);							

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx =iPosXAccion++;
			
		this.jPanelAccionesCargoGrupo.add(this.jButtonEliminarCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = 0;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargoGrupo.add(this.jButtonActualizarCargoGrupo, this.gridBagConstraintsCargoGrupo);


		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = 0;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargoGrupo.add(this.jButtonGuardarCambiosCargoGrupo, this.gridBagConstraintsCargoGrupo);	
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = 0;		
		this.gridBagConstraintsCargoGrupo.gridx =iPosXAccion++;
		
		this.jPanelAccionesCargoGrupo.add(this.jButtonCancelarCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargoGrupo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargoGrupo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();						
			this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargoGrupo.gridx = 0;		
			//this.gridBagConstraintsCargoGrupo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargoGrupo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargoGrupo.gridx =0;
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargoGrupo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargoGrupo, this.gridBagConstraintsCargoGrupo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCargoGrupo = new CargoGrupoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cargo Grupo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cargo Grupo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Grupo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CargoGrupoModel cargogrupoModel=new CargoGrupoModel(this);
			
			//SI USARA CLASE INTERNA
			//CargoGrupoModel.CargoGrupoFocusTraversalPolicy cargogrupoFocusTraversalPolicy = cargogrupoModel.new CargoGrupoFocusTraversalPolicy(this);
			
			//cargogrupoFocusTraversalPolicy.setcargogrupoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cargogrupoModel);
			
			
			this.jContentPaneDetalleCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCargoGrupo = new GridBagLayout();	
			this.jContentPaneDetalleCargoGrupo.setLayout(gridaBagLayoutDetalleCargoGrupo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargoGrupo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
				this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCargoGrupo.gridx = 0;
					
				
				this.jContentPaneDetalleCargoGrupo.add(jTtoolBarDetalleCargoGrupo, gridBagConstraintsCargoGrupo);								
				
}
			
			this.jScrollPanelDatosEdicionCargoGrupo=   new JScrollPane(jContentPaneDetalleCargoGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargoGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCargoGrupo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargoGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCargoGrupo.gridx = 0;
	        
			this.jContentPaneDetalleCargoGrupo.add(jPanelCamposCargoGrupo, gridBagConstraintsCargoGrupo);
			
			
			
			
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
						&& cargogrupoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargo(this.puedeCargarPorParteCargo,false,-1);
					
					if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCargoGrupo= new GridBagConstraints();
						this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCargoGrupo.gridx = 0;
						this.jContentPaneDetalleCargoGrupo.add(this.jTabbedPaneRelacionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCargoGrupo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCargoGrupo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
					this.gridBagConstraintsCargoGrupo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCargoGrupo.gridx = 0;
					
				
					this.jContentPaneDetalleCargoGrupo.add(jPanelCamposOcultosCargoGrupo, gridBagConstraintsCargoGrupo);
				
					this.jPanelCamposOcultosCargoGrupo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCargoGrupo.gridx = 0;
	        this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCargoGrupo.add(this.jPanelAccionesFormularioCargoGrupo, this.gridBagConstraintsCargoGrupo);							
			
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
	        this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCargoGrupo.gridx = 0;
	        
			
			this.jContentPaneDetalleCargoGrupo.add(this.jPanelAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCargoGrupo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCargoGrupo=   new JScrollPane(this.jPanelCamposCargoGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargoGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCargoGrupo.gridx = 0;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCargoGrupo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargoGrupo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCargoGrupo, this.gridBagConstraintsCargoGrupo);			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargoGrupo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCargoGrupo;//jContentPane;
		
		return jScrollPanelDatosEdicionCargoGrupo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargoSessionBean=new CargoSessionBean();
		this.cargoSessionBean.setConGuardarRelaciones(false);
		this.cargoSessionBean.setEsGuardarRelacionado(true);

		this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargoSessionBean.getEsGuardarRelacionado()) {

				CargoJInternalFrame.STIPO_TAMANIO_GENERAL=CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargoSessionBean.setEsGuardarRelacionado(true);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargoBeanSwingJInternalFrame.setcargoSessionBean(this.cargoSessionBean);

				//this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
				//this.gridBagConstraintsCargoGrupo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCargoGrupo.gridx = 0;
				//this.jContentPaneDetalleCargoGrupo.add(this.cargoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCargoGrupo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCargoGrupo.add("Cargos",this.cargoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCargoGrupo.setComponentAt(iIndexTab,this.cargoBeanSwingJInternalFrame.getContentPane());
				}

				//CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargoSessionBean.setEsGuardarRelacionado(false);
				this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargo) {
					this.jTabbedPaneRelacionesCargoGrupo.add("Cargos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCargoBeanSwingJInternalFrame(List<CargoGrupo> cargogrupos,CargoGrupo cargogrupo,CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.cargogrupoLogic.getConnexion());

					cargoBeanSwingJInternalFrame.setcargogruposForeignKey(cargogrupos);
					cargoBeanSwingJInternalFrame.setcargogrupoForeignKey(cargogrupo);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setisBusquedaDesdeForeignKeySesionCargoGrupo(true);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setlidCargoGrupoActual(cargogrupo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargoBeanSwingJInternalFrame.cargarCombosForeignKeyCargo(cargoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCargoGrupo(true);
					cargoBeanSwingJInternalFrame.setid_cargo_grupoFK_IdCargoGrupo(cargogrupo.getId());

					if(!this.conCargarFormDetalle) {
						cargoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargoBeanSwingJInternalFrame.setSelectedItemCombosFrameCargoGrupoForeignKey(cargogrupo,1,false,true,true);
					cargoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCargoGrupo");
					cargoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCargoGrupo");
					cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(true);
					cargoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargo("n",cargoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargoBeanSwingJInternalFrame.setAutoscrolls(true);
					cargoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("relacionado");
					} else {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");
					}

					cargoBeanSwingJInternalFrame.getjButtonRecargarInformacionCargo().setVisible(false);

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
