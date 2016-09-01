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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.CarteraConstantesFunciones;
import com.bydan.erp.cartera.util.CarteraParameterReturnGeneral;
//import com.bydan.erp.cartera.util.CarteraParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.CarteraBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;




@SuppressWarnings("unused")
public class CarteraBeanSwingJInternalFrame extends CarteraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CarteraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Cartera> carteraValidator = new ClassValidator<Cartera>(Cartera.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Cartera cartera;	
	public Cartera carteraAux;
	public Cartera carteraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Cartera carteraTotales;
	public Long idCarteraActual;
	public Long iIdNuevoCartera=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoCartera;
	public Boolean isPermisoNuevoCartera;
	public Boolean isPermisoActualizarCartera;
	public Boolean isPermisoActualizarOriginalCartera;
	public Boolean isPermisoEliminarCartera;
	public Boolean isPermisoGuardarCambiosCartera;
	public Boolean isPermisoConsultaCartera;
	public Boolean isPermisoBusquedaCartera;
	public Boolean isPermisoReporteCartera;
	public Boolean isPermisoPaginacionMedioCartera;
	public Boolean isPermisoPaginacionAltoCartera;
	public Boolean isPermisoPaginacionTodoCartera;
	public Boolean isPermisoCopiarCartera;
	public Boolean isPermisoVerFormCartera;
	public Boolean isPermisoDuplicarCartera;
	public Boolean isPermisoOrdenCartera;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public CarteraParameterReturnGeneral carteraReturnGeneral;
	public CarteraParameterReturnGeneral carteraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCartera=false;
	public Boolean esParaAccionDesdeFormularioCartera=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CarteraSessionBeanAdditional carteraSessionBeanAdditional=null;
	
	public CarteraSessionBeanAdditional getCarteraSessionBeanAdditional() {
		return this.carteraSessionBeanAdditional;
	}
	
	public void setCarteraSessionBeanAdditional(CarteraSessionBeanAdditional carteraSessionBeanAdditional) {
		try {
			this.carteraSessionBeanAdditional=carteraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CarteraBeanSwingJInternalFrameAdditional carteraBeanSwingJInternalFrameAdditional=null;
	//public class CarteraBeanSwingJInternalFrame
	
	public CarteraBeanSwingJInternalFrameAdditional getCarteraBeanSwingJInternalFrameAdditional() {
		return this.carteraBeanSwingJInternalFrameAdditional;
	}
	
	public void setCarteraBeanSwingJInternalFrameAdditional(CarteraBeanSwingJInternalFrameAdditional carteraBeanSwingJInternalFrameAdditional) {
		try {
			this.carteraBeanSwingJInternalFrameAdditional=carteraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CarteraLogic carteraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Cartera carteraBean;
	public CarteraConstantesFunciones carteraConstantesFunciones;
	//public CarteraParameterReturnGeneral carteraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Cartera> carteras;	
	//public List<Cartera> carterasEliminados;
	//public List<Cartera> carterasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCartera=false;
	public Boolean isVisibilidadCeldaDuplicarCartera=true;
	public Boolean isVisibilidadCeldaCopiarCartera=true;
	public Boolean isVisibilidadCeldaVerFormCartera=true;
	public Boolean isVisibilidadCeldaOrdenCartera=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCartera=false;
	public Boolean isVisibilidadCeldaModificarCartera=false;
	public Boolean isVisibilidadCeldaActualizarCartera=false;
	public Boolean isVisibilidadCeldaEliminarCartera=false;
	public Boolean isVisibilidadCeldaCancelarCartera=false;
	public Boolean isVisibilidadCeldaGuardarCartera=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCartera=false;	
	
	
	
	public Long getiIdNuevoCartera() {
		return this.iIdNuevoCartera;
	}

	public void setiIdNuevoCartera(Long iIdNuevoCartera) {
		this.iIdNuevoCartera = iIdNuevoCartera;
	}
	
	public Long getidCarteraActual() {
		return this.idCarteraActual;
	}

	public void setidCarteraActual(Long idCarteraActual) {
		this.idCarteraActual = idCarteraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Cartera getcartera() {
		return this.cartera;
	}

	public void setcartera(Cartera cartera) {
		this.cartera = cartera;
	}
	
	public Cartera getcarteraAux() {
		return this.carteraAux;
	}

	public void setcarteraAux(Cartera carteraAux) {
		this.carteraAux = carteraAux;
	}				
	
	public Cartera getcarteraAnterior() {
		return this.carteraAnterior;
	}

	public void setcarteraAnterior(Cartera carteraAnterior) {
		this.carteraAnterior = carteraAnterior;
	}	
	
	public Cartera getcarteraTotales() {
		return this.carteraTotales;
	}

	public void setcarteraTotales(Cartera carteraTotales) {
		this.carteraTotales = carteraTotales;
	}	
	
	public Cartera getcarteraBean() {
		return this.carteraBean;
	}

	public void setcarteraBean(Cartera carteraBean) {
		this.carteraBean = carteraBean;
	}	
	
	public CarteraParameterReturnGeneral getcarteraReturnGeneral() {
		return this.carteraReturnGeneral;
	}

	public void setcarteraReturnGeneral(CarteraParameterReturnGeneral carteraReturnGeneral) {
		this.carteraReturnGeneral = carteraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CarteraLogic getCarteraLogic()	{		
		return carteraLogic;
	}

	public void setCarteraLogic(CarteraLogic carteraLogic) {
		this.carteraLogic = carteraLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoCartera() {
		return isEsNuevoCartera;
	}

	public void setIsEsNuevoCartera(Boolean isEsNuevoCartera) {
		this.isEsNuevoCartera = isEsNuevoCartera;
	}

	public Boolean getEsParaAccionDesdeFormularioCartera() {
		return esParaAccionDesdeFormularioCartera;
	}
	
	public void setEsParaAccionDesdeFormularioCartera(Boolean esParaAccionDesdeFormularioCartera) {
		this.esParaAccionDesdeFormularioCartera = esParaAccionDesdeFormularioCartera;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesCartera() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CarteraConstantesFunciones.refrescarForeignKeysDescripcionesCartera(this.carteraLogic.getCarteras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CarteraConstantesFunciones.refrescarForeignKeysDescripcionesCartera(this.carteras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//carteraLogic.setCarteras(this.carteras);
			carteraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public CarteraParameterReturnGeneral getCarteraParameterGeneral() {
		return this.carteraParameterGeneral;
	}
	
	public void setCarteraParameterGeneral(CarteraParameterReturnGeneral carteraParameterGeneral) {
		this.carteraParameterGeneral = carteraParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoCartera() {
		return isPermisoTodoCartera;
	}

	public void setIsPermisoTodoCartera(Boolean isPermisoTodoCartera) {
		this.isPermisoTodoCartera = isPermisoTodoCartera;
	}

	public Boolean getIsPermisoNuevoCartera() {
		return isPermisoNuevoCartera;
	}

	public void setIsPermisoNuevoCartera(Boolean isPermisoNuevoCartera) {
		this.isPermisoNuevoCartera = isPermisoNuevoCartera;
	}

	public Boolean getIsPermisoActualizarCartera() {
		return isPermisoActualizarCartera;
	}

	public void setIsPermisoActualizarCartera(Boolean isPermisoActualizarCartera) {
		this.isPermisoActualizarCartera = isPermisoActualizarCartera;
	}

	public Boolean getIsPermisoEliminarCartera() {
		return isPermisoEliminarCartera;
	}

	public void setIsPermisoEliminarCartera(Boolean isPermisoEliminarCartera) {
		this.isPermisoEliminarCartera = isPermisoEliminarCartera;
	}

	public Boolean getIsPermisoGuardarCambiosCartera() {
		return isPermisoGuardarCambiosCartera;
	}

	public void setIsPermisoGuardarCambiosCartera(Boolean isPermisoGuardarCambiosCartera) {
		this.isPermisoGuardarCambiosCartera = isPermisoGuardarCambiosCartera;
	}
	
	public Boolean getIsPermisoConsultaCartera() {
		return isPermisoConsultaCartera;
	}

	public void setIsPermisoConsultaCartera(Boolean isPermisoConsultaCartera) {
		this.isPermisoConsultaCartera = isPermisoConsultaCartera;
	}

	public Boolean getIsPermisoBusquedaCartera() {
		return isPermisoBusquedaCartera;
	}

	public void setIsPermisoBusquedaCartera(Boolean isPermisoBusquedaCartera) {
		this.isPermisoBusquedaCartera = isPermisoBusquedaCartera;
	}

	public Boolean getIsPermisoReporteCartera() {
		return isPermisoReporteCartera;
	}

	public void setIsPermisoReporteCartera(Boolean isPermisoReporteCartera) {
		this.isPermisoReporteCartera = isPermisoReporteCartera;
	}
	
	public Boolean getIsPermisoPaginacionMedioCartera() {
		return isPermisoPaginacionMedioCartera;
	}

	public void setIsPermisoPaginacionMedioCartera(Boolean isPermisoPaginacionMedioCartera) {
		this.isPermisoPaginacionMedioCartera = isPermisoPaginacionMedioCartera;
	}
	
	public Boolean getIsPermisoPaginacionTodoCartera() {
		return isPermisoPaginacionTodoCartera;
	}

	public void setIsPermisoPaginacionTodoCartera(Boolean isPermisoPaginacionTodoCartera) {
		this.isPermisoPaginacionTodoCartera = isPermisoPaginacionTodoCartera;
	}
	
	public Boolean getIsPermisoPaginacionAltoCartera() {
		return isPermisoPaginacionAltoCartera;
	}

	public void setIsPermisoPaginacionAltoCartera(Boolean isPermisoPaginacionAltoCartera) {
		this.isPermisoPaginacionAltoCartera = isPermisoPaginacionAltoCartera;
	}
	
	public Boolean getIsPermisoCopiarCartera() {
		return isPermisoCopiarCartera;
	}

	public void setIsPermisoCopiarCartera(Boolean isPermisoCopiarCartera) {
		this.isPermisoCopiarCartera = isPermisoCopiarCartera;
	}
	
	public Boolean getIsPermisoVerFormCartera() {
		return isPermisoVerFormCartera;
	}

	public void setIsPermisoVerFormCartera(Boolean isPermisoVerFormCartera) {
		this.isPermisoVerFormCartera = isPermisoVerFormCartera;
	}
	
	public Boolean getIsPermisoDuplicarCartera() {
		return isPermisoDuplicarCartera;
	}

	public void setIsPermisoDuplicarCartera(Boolean isPermisoDuplicarCartera) {
		this.isPermisoDuplicarCartera = isPermisoDuplicarCartera;
	}
	
	public Boolean getIsPermisoOrdenCartera() {
		return isPermisoOrdenCartera;
	}

	public void setIsPermisoOrdenCartera(Boolean isPermisoOrdenCartera) {
		this.isPermisoOrdenCartera = isPermisoOrdenCartera;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoCartera() {
		return isVisibilidadCeldaNuevoCartera;
	}

	public void setIsVisibilidadCeldaNuevoCartera(Boolean isVisibilidadCeldaNuevoCartera) {
		this.isVisibilidadCeldaNuevoCartera = isVisibilidadCeldaNuevoCartera;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCartera() {
		return isVisibilidadCeldaDuplicarCartera;
	}

	public void setIsVisibilidadCeldaDuplicarCartera(Boolean isVisibilidadCeldaDuplicarCartera) {
		this.isVisibilidadCeldaDuplicarCartera = isVisibilidadCeldaDuplicarCartera;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCartera() {
		return isVisibilidadCeldaCopiarCartera;
	}

	public void setIsVisibilidadCeldaCopiarCartera(Boolean isVisibilidadCeldaCopiarCartera) {
		this.isVisibilidadCeldaCopiarCartera = isVisibilidadCeldaCopiarCartera;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCartera() {
		return isVisibilidadCeldaVerFormCartera;
	}

	public void setIsVisibilidadCeldaVerFormCartera(Boolean isVisibilidadCeldaVerFormCartera) {
		this.isVisibilidadCeldaVerFormCartera = isVisibilidadCeldaVerFormCartera;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCartera() {
		return isVisibilidadCeldaOrdenCartera;
	}

	public void setIsVisibilidadCeldaOrdenCartera(Boolean isVisibilidadCeldaOrdenCartera) {
		this.isVisibilidadCeldaOrdenCartera = isVisibilidadCeldaOrdenCartera;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCartera() {
		return isVisibilidadCeldaNuevoRelacionesCartera;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCartera(Boolean isVisibilidadCeldaNuevoRelacionesCartera) {
		this.isVisibilidadCeldaNuevoRelacionesCartera = isVisibilidadCeldaNuevoRelacionesCartera;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCartera() {
		return isVisibilidadCeldaModificarCartera;
	}

	public void setIsVisibilidadCeldaModificarCartera(Boolean isVisibilidadCeldaModificarCartera) {
		this.isVisibilidadCeldaModificarCartera = isVisibilidadCeldaModificarCartera;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCartera() {
		return isVisibilidadCeldaActualizarCartera;
	}

	public void setIsVisibilidadCeldaActualizarCartera(Boolean isVisibilidadCeldaActualizarCartera) {
		this.isVisibilidadCeldaActualizarCartera = isVisibilidadCeldaActualizarCartera;
	}

	public Boolean getIsVisibilidadCeldaEliminarCartera() {
		return isVisibilidadCeldaEliminarCartera;
	}

	public void setIsVisibilidadCeldaEliminarCartera(Boolean isVisibilidadCeldaEliminarCartera) {
		this.isVisibilidadCeldaEliminarCartera = isVisibilidadCeldaEliminarCartera;
	}

	public Boolean getIsVisibilidadCeldaCancelarCartera() {
		return isVisibilidadCeldaCancelarCartera;
	}

	public void setIsVisibilidadCeldaCancelarCartera(Boolean isVisibilidadCeldaCancelarCartera) {
		this.isVisibilidadCeldaCancelarCartera = isVisibilidadCeldaCancelarCartera;
	}

	public Boolean getIsVisibilidadCeldaGuardarCartera() {
		return isVisibilidadCeldaGuardarCartera;
	}

	public void setIsVisibilidadCeldaGuardarCartera(Boolean isVisibilidadCeldaGuardarCartera) {
		this.isVisibilidadCeldaGuardarCartera = isVisibilidadCeldaGuardarCartera;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCartera() {
		return isVisibilidadCeldaGuardarCambiosCartera;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCartera(Boolean isVisibilidadCeldaGuardarCambiosCartera) {
		this.isVisibilidadCeldaGuardarCambiosCartera = isVisibilidadCeldaGuardarCambiosCartera;
	}
		
	public CarteraSessionBean getcarteraSessionBean() {
		return this.carteraSessionBean;
	}
	
	public void setcarteraSessionBean(CarteraSessionBean carteraSessionBean) {
		this.carteraSessionBean=carteraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCartera(Cartera cartera)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Cartera cartera,Cartera carteraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCartera(cartera);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		carteraAux.setId(cartera.getId());
		carteraAux.setVersionRow(cartera.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCartera();
		
			int intSelectedRow = this.jTableDatosCartera.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCartera(this.cartera,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = carteraValidator.getInvalidValues(this.cartera);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			carteraLogic.setDatosCliente(datosCliente);
			carteraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				carteraAux=new  Cartera();
				
				carteraAux.setIsNew(true);
				carteraAux.setIsChanged(true);
				
				carteraAux.setCarteraOriginal(this.cartera);
				
				carteraAux.setId(this.cartera.getId());	
				carteraAux.setVersionRow(this.cartera.getVersionRow());	
				carteraAux.setcodigo(this.cartera.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.carteraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.carteraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(carteraAux,carteraLogic.getCarteras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(carteraAux,carteras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.carteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.carteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						carteraLogic.saveCarteras();//WithConnection
						//carteraLogic.getSetVersionRowCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cartera,carteraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.carteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								carteraLogic.saveCarteraRelaciones(carteraAux);//WithConnection
								//carteraLogic.getSetVersionRowCarteras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cartera,carteraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.carteraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.carteraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(carteraAux,carteraLogic.getCarteras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(carteraAux,carteras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cartera,carteraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				carteraAux=new  Cartera();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.carteraSessionBean.getEsGuardarRelacionado() 
					|| (this.carteraSessionBean.getEsGuardarRelacionado() && this.cartera.getId()>=0)) {
						
					carteraAux.setIsNew(false);
				}
				
				carteraAux.setIsDeleted(false);
			
				carteraAux.setId(this.cartera.getId());	
				carteraAux.setVersionRow(this.cartera.getVersionRow());	
				carteraAux.setcodigo(this.cartera.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(carteraAux,carteraLogic.getCarteras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(carteraAux,carteras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.carteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.carteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						carteraLogic.saveCarteras();//WithConnection
						//carteraLogic.getSetVersionRowCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cartera,carteraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.carteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								carteraLogic.saveCarteraRelaciones(carteraAux);//WithConnection
								//carteraLogic.getSetVersionRowCarteras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cartera,carteraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.carteraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.carteraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(carteraAux,carteraLogic.getCarteras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(carteraAux,carteras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cartera,carteraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				carteraAux=new  Cartera();
				
				carteraAux.setIsNew(false);
				carteraAux.setIsChanged(false);
				
				carteraAux.setIsDeleted(true);
				
				carteraAux.setId(this.cartera.getId());	
				carteraAux.setVersionRow(this.cartera.getVersionRow());	
				carteraAux.setcodigo(this.cartera.getcodigo());	
				
				if(this.carteraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.carteraAux.getId()>=0) {	
						this.carterasEliminados.add(carteraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(carteraAux,carteraLogic.getCarteras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(carteraAux,carteras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.carteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.carteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						carteraLogic.saveCarteras();//WithConnection
						//carteraLogic.getSetVersionRowCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.carteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								carteraLogic.saveCarteraRelaciones(carteraAux);//WithConnection
								//carteraLogic.getSetVersionRowCarteras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.carteraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.carteraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(carteraAux,carteraLogic.getCarteras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(carteraAux,carteras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.getCarteras().addAll(this.carterasEliminados);
					
					carteraLogic.saveCarteras();//WithConnection
					//carteraLogic.getSetVersionRowCarteras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.carterasEliminados= new ArrayList<Cartera>();		
			}
			
			if(this.carteraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cartera GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cartera=carteraAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessCartera();
      	}
		
	}	
	
	public void actualizarRelaciones(Cartera carteraLocal) throws Exception {
		
		if(this.carteraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Cartera carteraLocal) throws Exception {	
		if(this.carteraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarCarteraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCartera.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = carteraValidator.getInvalidValues(this.cartera);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Cartera cartera,List<Cartera> carteras) throws Exception {
		try	{		
			CarteraConstantesFunciones.actualizarLista(cartera,carteras,this.carteraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Cartera cartera,List<Cartera> carteras) throws Exception {
		try	{			
			CarteraConstantesFunciones.actualizarSelectedLista(cartera,carteras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Cartera> carterasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				carterasLocal=this.carteraLogic.getCarteras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				carterasLocal=this.carteras;
			}
			//ARCHITECTURE
		
			for(Cartera carteraLocal:carterasLocal) {
				if(this.permiteMantenimiento(carteraLocal) && carteraLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+CarteraConstantesFunciones.getCarteraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CarteraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCartera.jLabelcodigoCartera,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCartera.jLabelcodigoCartera,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCartera--;	
		
		
		this.carteraAux=new Cartera();
		
		this.carteraAux.setId(this.iIdNuevoCartera);
		this.carteraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.carteraLogic.getCarteras().add(this.carteraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.carteras.add(this.carteraAux);
		}
		//ARCHITECTURE
		
		this.cartera=this.carteraAux;
		
		if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCartera(this.cartera);
			this.setVariablesObjetoActualToFormularioForeignKeyCartera(this.cartera);
		}
				
		//this.setDefaultControlesCartera();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCartera();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCartera();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCartera();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCartera(this.carteraBean,this.cartera,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCartera(this.carteraReturnGeneral,this.carteraBean,false);
		
		if(this.carteraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCartera(this.carteraReturnGeneral.getCartera());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCartera(this.carteraReturnGeneral.getCartera());
		}
		
		if(this.carteraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCartera(this.carteraReturnGeneral.getCartera(),classes);//this.carteraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCartera(this.cartera,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCartera();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCartera();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CarteraBeanSwingJInternalFrameAdditional.RecargarFormCartera(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCartera(false);
						
			if(carteraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCartera();
			}
			
			this.actualizarVisualTableDatosCartera();
			
			this.jTableDatosCartera.setRowSelectionInterval(this.getIndiceNuevoCartera(), this.getIndiceNuevoCartera());
			
			this.seleccionarFilaTablaCarteraActual();
						
			this.actualizarEstadoCeldasBotonesCartera("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCartera(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setEnabled(isHabilitar && this.carteraConstantesFunciones.activarcodigoCartera);	
		
	};
	
	public void setDefaultControlesCartera() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCartera(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.carteraSessionBean.setConGuardarRelaciones(true);			
			this.carteraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.setVisible(true);
			
					
		} else {
			//this.carteraSessionBean.setConGuardarRelaciones(false);			
			this.carteraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCartera() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
				if(carteraAux.getId().equals(this.iIdNuevoCartera)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cartera carteraAux:this.carteras) {
				if(carteraAux.getId().equals(this.iIdNuevoCartera)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualCartera(Cartera cartera,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
				if(carteraAux.getId().equals(cartera.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cartera carteraAux:this.carteras) {
				if(carteraAux.getId().equals(cartera.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalCartera(Cartera carteraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
				if(carteraAux.getCarteraOriginal().getId().equals(carteraOriginal.getId())) {
					existe=true;
					carteraOriginal.setId(carteraAux.getId());
					carteraOriginal.setVersionRow(carteraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cartera carteraAux:this.carteras) {
				if(carteraAux.getCarteraOriginal().getId().equals(carteraOriginal.getId())) {
					existe=true;
					carteraOriginal.setId(carteraAux.getId());
					carteraOriginal.setVersionRow(carteraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCartera(Boolean esParaCancelar) throws Exception {
		carterasAux=new ArrayList<Cartera>();
		carteraAux=new Cartera();
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
					if(carteraAux.getId()<0) {
						carterasAux.add(carteraAux);
					}		
				}
				this.iIdNuevoCartera=0L;
				this.carteraLogic.getCarteras().removeAll(carterasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cartera carteraAux:this.carteras) {
					if(carteraAux.getId()<0) {
						carterasAux.add(carteraAux);
					}		
				}
				this.iIdNuevoCartera=0L;
				this.carteras.removeAll(carterasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCartera 
					&& this.carteraLogic.getCarteras().size()>0
					) {
					carteraAux=this.carteraLogic.getCarteras().get(this.carteraLogic.getCarteras().size() - 1);
				
					if(carteraAux.getId()<0) {
						this.carteraLogic.getCarteras().remove(carteraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCartera && this.carteras.size()>0) {
					carteraAux=this.carteras.get(this.carteras.size() - 1);
				
					if(carteraAux.getId()<0) {
						this.carteras.remove(carteraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCartera(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cartera.getId()<0) {
				this.carteraLogic.getCarteras().remove(this.cartera);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cartera.getId()<0) {
				this.carteras.remove(this.cartera);
			}
		}			
	}
	
	public void setEstadosInicialesCartera(List<Cartera> carterasAux) throws Exception {
		CarteraConstantesFunciones.setEstadosInicialesCartera(carterasAux);
	}
	
	public void setEstadosInicialesCartera(Cartera carteraAux) throws Exception {
		CarteraConstantesFunciones.setEstadosInicialesCartera(carteraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCarteraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCarteraActual()) {
				if(!this.isEsNuevoCartera) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCartera=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCarteraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cartera ?", "MANTENIMIENTO DE Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Cartera cartera) throws Exception {
		CarteraConstantesFunciones.seleccionarAsignar(this.cartera,cartera);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCartera=this.isPermisoActualizarOriginalCartera;
			
			
			this.seleccionarAsignar(cartera);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CarteraConstantesFunciones.quitarEspaciosCartera(this.cartera,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.carteraSessionBean.setsFuncionBusquedaRapida(this.carteraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCartera) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCartera(esParaCancelar);				
				this.cancelarNuevoCartera(esParaCancelar);								
			}
			
			this.cartera=new Cartera();
			
			this.inicializarCartera();
			
			this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCartera() throws Exception {
		try {
			CarteraConstantesFunciones.inicializarCartera(this.cartera);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.carteraLogic.getCarteras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCarteras(String sAccionBusqueda,List<Cartera> carterasParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Cartera"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CarteraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CarteraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Cartera"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Carteras");		
		parameters.put("busquedapor", CarteraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCartera=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CarteraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CarteraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCartera=new JRBeanArrayDataSource(CarteraJInternalFrame.TraerCarteraBeans(carterasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCartera);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CarteraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CarteraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CarteraBean.TraerCarteraBeans(carterasParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCarteraActionPerformed(null);
					//this.generarExcelReporteCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCarteras(sAccionBusqueda,sTipoArchivoReporte,carterasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<Cartera> carterasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Carteras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCartera("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Cartera cartera : carterasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CarteraConstantesFunciones.generarExcelReporteDataCartera("NORMAL",row,workbook,cartera,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCartera(String sTipo,Row row,Workbook workbook) {
		
		CarteraConstantesFunciones.generarExcelReporteHeaderCartera(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<Cartera> carterasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Carteras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Cartera cartera : carterasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CarteraConstantesFunciones.getCarteraDescripcion(cartera));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CarteraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CarteraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cartera.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<Cartera> carterasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Cartera> carterasRespaldo=null;
		
		classes=CarteraConstantesFunciones.getClassesRelationshipsOfCartera(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.carteraLogic.setDatosCliente(this.datosCliente);
		this.carteraLogic.setDatosDeep(this.datosDeep);
		this.carteraLogic.setIsConDeep(true);
		
		carterasRespaldo=this.carteraLogic.getCarteras();
		
		this.carteraLogic.setCarteras(carterasParaReportes);	
		this.carteraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		carterasParaReportes=this.carteraLogic.getCarteras();
		this.carteraLogic.setCarteras(carterasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Carteras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCartera("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Cartera cartera : carterasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCartera("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CarteraConstantesFunciones.generarExcelReporteDataCartera("NORMAL",row,workbook,cartera,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CarteraConstantesFunciones.getCarteraDescripcion(cartera));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCartera.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCartera.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCartera() throws Exception {		
		this.startProcessCartera(true);
	}
	
	public void startProcessCartera(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesCartera, this.jScrollPanelDatosCartera,this.jPanelPaginacionCartera, this.jScrollPanelDatosEdicionCartera, this.jPanelAccionesCartera,this.jPanelAccionesFormularioCartera,this.jmenuBarCartera,this.jmenuBarDetalleCartera,this.jTtoolBarCartera,this.jTtoolBarDetalleCartera);		
		
		final JTabbedPane jTabbedPaneBusquedasCartera=null; 
		
		final JPanel jPanelParametrosReportesCartera=this.jPanelParametrosReportesCartera;
		//final JScrollPane jScrollPanelDatosCartera=this.jScrollPanelDatosCartera;
		final JTable jTableDatosCartera=this.jTableDatosCartera;		
		final JPanel jPanelPaginacionCartera=this.jPanelPaginacionCartera;
		//final JScrollPane jScrollPanelDatosEdicionCartera=this.jScrollPanelDatosEdicionCartera;
		final JPanel jPanelAccionesCartera=this.jPanelAccionesCartera;
		
		JPanel jPanelCamposAuxiliarCartera=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCartera=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
			jPanelCamposAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jPanelCamposCartera;
			jPanelAccionesFormularioAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jPanelAccionesFormularioCartera;
		}
		
		final JPanel jPanelCamposCartera=jPanelCamposAuxiliarCartera;
		final JPanel jPanelAccionesFormularioCartera=jPanelAccionesFormularioAuxiliarCartera;
		
		
		final JMenuBar jmenuBarCartera=this.jmenuBarCartera;
		final JToolBar jTtoolBarCartera=this.jTtoolBarCartera;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCartera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCartera=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
			jmenuBarDetalleAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jmenuBarDetalleCartera;
			jTtoolBarDetalleAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jTtoolBarDetalleCartera;
		}
		
		final JMenuBar jmenuBarDetalleCartera=jmenuBarDetalleAuxiliarCartera;
		final JToolBar jTtoolBarDetalleCartera=jTtoolBarDetalleAuxiliarCartera;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCartera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCartera;
			processRunnable.jTableDatos=jTableDatosCartera;
			processRunnable.jPanelCampos=jPanelCamposCartera;
			processRunnable.jPanelPaginacion=jPanelPaginacionCartera;
			processRunnable.jPanelAcciones=jPanelAccionesCartera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCartera;
			
			
			processRunnable.jmenuBar=jmenuBarCartera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCartera;
			processRunnable.jTtoolBar=jTtoolBarCartera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCartera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCartera ,jPanelParametrosReportesCartera,jTableDatosCartera, /*jScrollPanelDatosCartera,*/jPanelCamposCartera,jPanelPaginacionCartera, /*jScrollPanelDatosEdicionCartera,*/ jPanelAccionesCartera,jPanelAccionesFormularioCartera,jmenuBarCartera,jmenuBarDetalleCartera,jTtoolBarCartera,jTtoolBarDetalleCartera);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesCartera, jScrollPanelDatosCartera,jPanelPaginacionCartera, jScrollPanelDatosEdicionCartera, jPanelAccionesCartera,jPanelAccionesFormularioCartera,jmenuBarCartera,jmenuBarDetalleCartera,jTtoolBarCartera,jTtoolBarDetalleCartera);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessCartera() {// throws Exception 
		this.finishProcessCartera(true);
	}
	
	public void finishProcessCartera(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesCartera, this.jScrollPanelDatosCartera,this.jPanelPaginacionCartera, this.jScrollPanelDatosEdicionCartera, this.jPanelAccionesCartera,this.jPanelAccionesFormularioCartera,this.jmenuBarCartera,this.jmenuBarDetalleCartera,this.jTtoolBarCartera,this.jTtoolBarDetalleCartera);		
		
		final JTabbedPane jTabbedPaneBusquedasCartera=null; 
		
		final JPanel jPanelParametrosReportesCartera=this.jPanelParametrosReportesCartera;
		//final JScrollPane jScrollPanelDatosCartera=this.jScrollPanelDatosCartera;
		final JTable jTableDatosCartera=this.jTableDatosCartera;		
		final JPanel jPanelPaginacionCartera=this.jPanelPaginacionCartera;
		//final JScrollPane jScrollPanelDatosEdicionCartera=this.jScrollPanelDatosEdicionCartera;
		final JPanel jPanelAccionesCartera=this.jPanelAccionesCartera;
		
		JPanel jPanelCamposAuxiliarCartera=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCartera=new JPanel();
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
			jPanelCamposAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jPanelCamposCartera;
			jPanelAccionesFormularioAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jPanelAccionesFormularioCartera;
		}
		
		final JPanel jPanelCamposCartera=jPanelCamposAuxiliarCartera;
		final JPanel jPanelAccionesFormularioCartera=jPanelAccionesFormularioAuxiliarCartera;
		
		
		final JMenuBar jmenuBarCartera=this.jmenuBarCartera;		
		final JToolBar jTtoolBarCartera=this.jTtoolBarCartera;
				
		JMenuBar jmenuBarDetalleAuxiliarCartera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCartera=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
			jmenuBarDetalleAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jmenuBarDetalleCartera;
			jTtoolBarDetalleAuxiliarCartera=this.jInternalFrameDetalleFormCartera.jTtoolBarDetalleCartera;		
		}
		
		final JMenuBar jmenuBarDetalleCartera=jmenuBarDetalleAuxiliarCartera;
		final JToolBar jTtoolBarDetalleCartera=jTtoolBarDetalleAuxiliarCartera;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCartera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCartera;
			processRunnable.jTableDatos=jTableDatosCartera;
			processRunnable.jPanelCampos=jPanelCamposCartera;
			processRunnable.jPanelPaginacion=jPanelPaginacionCartera;
			processRunnable.jPanelAcciones=jPanelAccionesCartera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCartera;
			
			
			processRunnable.jmenuBar=jmenuBarCartera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCartera;
			processRunnable.jTtoolBar=jTtoolBarCartera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCartera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCartera ,jPanelParametrosReportesCartera, jTableDatosCartera,/*jScrollPanelDatosCartera,*/jPanelCamposCartera,jPanelPaginacionCartera, /*jScrollPanelDatosEdicionCartera,*/ jPanelAccionesCartera,jPanelAccionesFormularioCartera,jmenuBarCartera,jmenuBarDetalleCartera,jTtoolBarCartera,jTtoolBarDetalleCartera));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCartera(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCartera(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCartera(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCartera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCartera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCartera,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCartera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCartera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCartera,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.carteraConstantesFunciones.getsFinalQueryCartera();
		String  finalQueryPaginacionTodos=this.carteraConstantesFunciones.getsFinalQueryCartera();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=CarteraConstantesFunciones.getArrayColumnasGlobalesNoCartera(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CarteraConstantesFunciones.getArrayColumnasGlobalesCartera(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CarteraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.carterasEliminados= new ArrayList<Cartera>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCartera();
		
				///*CarteraSessionBean*/this.carteraSessionBean=new CarteraSessionBean();
			
			if(this.carteraSessionBean==null) {
				this.carteraSessionBean=new CarteraSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=CarteraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CarteraConstantesFunciones.getClassesForeignKeysOfCartera(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cartera."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			carterasAux= new ArrayList<Cartera>();
			
				
			carteraLogic.setDatosCliente(this.datosCliente);
			carteraLogic.setDatosDeep(this.datosDeep);
			carteraLogic.setIsConDeep(true);
			
			
			carteraLogic.getCarteraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					carteraLogic.getTodosCarteras(finalQueryGlobal,pagination);
					
					//carteraLogic.getTodosCarterasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(carteraLogic.getCarteras()==null|| carteraLogic.getCarteras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							carterasAux= new ArrayList<Cartera>();
							carterasAux.addAll(carteraLogic.getCarteras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							carterasAux= new ArrayList<Cartera>();
							carterasAux.addAll(carteras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							carteraLogic.getTodosCarteras(finalQueryGlobal+"",this.pagination);												
							
							//carteraLogic.getTodosCarterasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCarteras("Todos",carteraLogic.getCarteras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							carteraLogic.setCarteras(new ArrayList<Cartera>());					
							carteraLogic.getCarteras().addAll(carterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							carteras=new ArrayList<Cartera>();
							carteras.addAll(carterasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCartera=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCartera=this.idActual;
				
				} else if(this.idCarteraActual!=null && this.idCarteraActual!=0L) {
					idCartera=idCarteraActual;
				}
				
					
				this.sDetalleReporte=CarteraConstantesFunciones.getDetalleIndicePorId(idCartera);
				
				this.carteras=new ArrayList<Cartera>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					carteraLogic.getEntity(idCartera);
					
					//carteraLogic.getEntityWithConnection(idCartera);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					carteraLogic.setCarteras(new ArrayList<Cartera>());
					carteraLogic.getCarteras().add(carteraLogic.getCartera());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.carteras=new ArrayList<Cartera>();
					this.carteras.add(cartera);
				}
				
				if(carteraLogic.getCartera()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCartera();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCartera();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=carteraLogic.getCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=carteras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=carteraLogic.getCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=carteras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Cartera cartera) {
		Boolean permite=true;
		
		if(this.cartera.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CarteraConstantesFunciones.getOrderByListaCartera();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CarteraConstantesFunciones.getOrderByListaCartera();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cartera cartera:carteraLogic.getCarteras()) {
				if(cartera.getsType().equals(Constantes2.S_TOTALES)) {
					carteraTotales=cartera;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cartera cartera:this.carteras) {
				if(cartera.getsType().equals(Constantes2.S_TOTALES)) {
					carteraTotales=cartera;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.carteraAux=new Cartera();
			this.carteraAux.setsType(Constantes2.S_TOTALES);
			this.carteraAux.setIsNew(false);
			this.carteraAux.setIsChanged(false);
			this.carteraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CarteraConstantesFunciones.TotalizarValoresFilaCartera(this.carteraLogic.getCarteras(),this.carteraAux);
				
				this.carteraLogic.getCarteras().add(this.carteraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CarteraConstantesFunciones.TotalizarValoresFilaCartera(this.carteras,this.carteraAux);
				
				this.carteras.add(this.carteraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		carteraTotales=new Cartera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.carteraLogic.getCarteras().remove(carteraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.carteras.remove(carteraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		carteraTotales=new Cartera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cartera cartera:carteraLogic.getCarteras()) {
				if(cartera.getsType().equals(Constantes2.S_TOTALES)) {
					carteraTotales=cartera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CarteraConstantesFunciones.TotalizarValoresFilaCartera(this.carteraLogic.getCarteras(),carteraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cartera cartera:this.carteras) {
				if(cartera.getsType().equals(Constantes2.S_TOTALES)) {
					carteraTotales=cartera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CarteraConstantesFunciones.TotalizarValoresFilaCartera(this.carteras,carteraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCartera() {
		this.isPermisoTodoCartera=false;
		this.isPermisoNuevoCartera=false;
		this.isPermisoActualizarCartera=false;
		this.isPermisoActualizarOriginalCartera=false;
		this.isPermisoEliminarCartera=false;
		this.isPermisoGuardarCambiosCartera=false;
		this.isPermisoConsultaCartera=false;
		this.isPermisoBusquedaCartera=false;
		this.isPermisoReporteCartera=false;		
		this.isPermisoOrdenCartera=false;		
		this.isPermisoPaginacionMedioCartera=false;		
		this.isPermisoPaginacionAltoCartera=false;
		this.isPermisoPaginacionTodoCartera=false;
		this.isPermisoCopiarCartera=false;		
		this.isPermisoVerFormCartera=false;		
		this.isPermisoDuplicarCartera=false;		
		this.isPermisoOrdenCartera=false;		
	}
	
	public void setPermisosUsuarioCartera(Boolean isPermiso) {
		this.isPermisoTodoCartera=isPermiso;
		this.isPermisoNuevoCartera=isPermiso;
		this.isPermisoActualizarCartera=isPermiso;
		this.isPermisoActualizarOriginalCartera=isPermiso;
		this.isPermisoEliminarCartera=isPermiso;
		this.isPermisoGuardarCambiosCartera=isPermiso;
		this.isPermisoConsultaCartera=isPermiso;
		this.isPermisoBusquedaCartera=isPermiso;
		this.isPermisoReporteCartera=isPermiso;
		this.isPermisoOrdenCartera=isPermiso;		
		this.isPermisoPaginacionMedioCartera=isPermiso;		
		this.isPermisoPaginacionAltoCartera=isPermiso;		
		this.isPermisoPaginacionTodoCartera=isPermiso;		
		this.isPermisoCopiarCartera=isPermiso;		
		this.isPermisoVerFormCartera=isPermiso;		
		this.isPermisoDuplicarCartera=isPermiso;
		this.isPermisoOrdenCartera=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCartera(Boolean isPermiso) {
		//this.isPermisoTodoCartera=isPermiso;
		this.isPermisoNuevoCartera=isPermiso;
		this.isPermisoActualizarCartera=isPermiso;
		this.isPermisoActualizarOriginalCartera=isPermiso;
		this.isPermisoEliminarCartera=isPermiso;
		this.isPermisoGuardarCambiosCartera=isPermiso;
		//this.isPermisoConsultaCartera=isPermiso;
		//this.isPermisoBusquedaCartera=isPermiso;
		//this.isPermisoReporteCartera=isPermiso;
		//this.isPermisoOrdenCartera=isPermiso;		
		//this.isPermisoPaginacionMedioCartera=isPermiso;		
		//this.isPermisoPaginacionAltoCartera=isPermiso;		
		//this.isPermisoPaginacionTodoCartera=isPermiso;		
		//this.isPermisoCopiarCartera=isPermiso;		
		//this.isPermisoDuplicarCartera=isPermiso;
		//this.isPermisoOrdenCartera=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCarteraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCartera(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCarteraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCarteraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCarteraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCarteraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCartera() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.carteraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CarteraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCartera=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCartera=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCartera=this.isPermisoActualizarCartera;
			this.isPermisoEliminarCartera=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCartera=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCartera=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCartera=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCartera=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCartera=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCartera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCartera=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCartera=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCartera=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCartera=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCartera=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCartera=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCartera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.carteraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCartera.setToolTipText(this.jTableDatosCartera.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCartera(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCartera(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(CarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioCartera() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyCarteraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCarteraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CarteraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCarteraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyCarteraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCartera()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyCartera()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCartera(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCartera()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCartera();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCartera(Cartera cartera)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCartera(Cartera cartera,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCartera()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCartera()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCartera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCartera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCartera()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCartera()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCartera(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCartera()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public CarteraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CarteraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CarteraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.carteraSessionBean=new CarteraSessionBean(); 
		this.carteraConstantesFunciones=new CarteraConstantesFunciones(); 
		this.carteraBean=new Cartera();//(this.carteraConstantesFunciones); 		
		this.carteraReturnGeneral=new CarteraParameterReturnGeneral(); 
		
		this.carteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.carteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCartera(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.carteraConstantesFunciones=new CarteraConstantesFunciones(); 
			this.carteraBean=new Cartera();//this.carteraConstantesFunciones); 			
			this.carteraReturnGeneral=new CarteraParameterReturnGeneral(); 
		
			CarteraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cartera Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cartera=new Cartera();
			this.carteras = new ArrayList<Cartera>();
			this.carterasAux = new ArrayList<Cartera>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic=new CarteraLogic();
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			//this.carteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.carteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCartera);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCartera);	
					}
					
					if(this.jInternalFrameImportacionCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCartera);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCartera);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCartera!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCartera);
				this.jInternalFrameDetalleFormCartera.setVisible(false);
				this.jInternalFrameDetalleFormCartera.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCartera);
					this.jInternalFrameReporteDinamicoCartera.setVisible(false);
					this.jInternalFrameReporteDinamicoCartera.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCartera);
					this.jInternalFrameImportacionCartera.setVisible(false);
					this.jInternalFrameImportacionCartera.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCartera);
					this.jInternalFrameOrderByCartera.setVisible(false);
					this.jInternalFrameOrderByCartera.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCarteraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CarteraConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.carteraReturnGeneral=new CarteraParameterReturnGeneral();
			
			this.carteraParameterGeneral=new CarteraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.carteraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(CarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.carteraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CarteraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.carteraSessionBean.getEsGuardarRelacionado(),this.carteraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CarteraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.carteraSessionBean.getEsGuardarRelacionado(),this.carteraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaDuplicarCartera=true;
			this.isVisibilidadCeldaCopiarCartera=true;
			this.isVisibilidadCeldaVerFormCartera=true;
			this.isVisibilidadCeldaOrdenCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=false;
			this.isVisibilidadCeldaGuardarCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCartera();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCartera(false);
			
			this.setPermisosUsuarioCartera();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.carteraSessionBean.getEsGuardarRelacionado() 
				|| (this.carteraSessionBean.getEsGuardarRelacionado() && this.carteraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCarteraClasesRelacionadas();
			}
			
			if(this.carteraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCarteraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CarteraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCartera();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCartera();
			}
			
			if(!this.isPermisoBusquedaCartera) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.carteraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCartera,this.isPermisoPaginacionMedioCartera,this.isPermisoPaginacionTodoCartera);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CarteraConstantesFunciones.getTiposSeleccionarCartera());
				
				this.tiposColumnasSelect=CarteraConstantesFunciones.getTiposSeleccionarCartera(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCartera();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioCartera(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioCartera(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCartera() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				carteraImplementable= (CarteraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CarteraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				carteraImplementableHome= (CarteraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CarteraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.carteras= new ArrayList<Cartera>();
			this.carterasEliminados= new ArrayList<Cartera>();
						
			this.isEsNuevoCartera=false;
			this.esParaAccionDesdeFormularioCartera=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCartera(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCartera();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CarteraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CarteraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCartera(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCartera!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCartera();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCartera();
			}
			
			CarteraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCartera(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Cartera: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCartera() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCartera")) {
				iIndex=this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCartera.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCartera();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyCartera(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCartera(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCartera(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCarteraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCartera();
		
		this.cargarCombosFrameForeignKeyCartera();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCartera();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCartera();
		}
	}
	
	
	
	public void jButtonNuevoCarteraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.carteraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			
			if(jTableDatosCartera.getRowCount()>=1) {
				jTableDatosCartera.removeRowSelectionInterval(0, jTableDatosCartera.getRowCount()-1);						
			}
			
			this.isEsNuevoCartera=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCartera(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCartera(true);			
			//this.cartera=new Cartera();
			//this.cartera.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCartera(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCartera() ;
			
			if(CarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCartera(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cartera);	
			this.actualizarInformacion("INFO_PADRE",false,this.cartera);				
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			if(this.carteraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Cartera: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCarteraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCartera.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCartera.getSelectedRows().length;			
			}
			
			carterasSeleccionados=this.getCarterasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCartera--;			
				//Cartera carteraAux= new Cartera();			
				//carteraAux.setId(this.iIdNuevoCartera);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Cartera carteraOrigen=new Cartera();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Cartera carteraOrigen : carterasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCartera.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							carteraOrigen =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							carteraOrigen =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCartera();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cartera.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCartera(carteraOrigen,this.cartera,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.carteraLogic.getCarteras().add(this.carteraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.carteras.add(this.carteraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCartera(false);
				
				this.jTableDatosCartera.setRowSelectionInterval(this.getIndiceNuevoCartera(), this.getIndiceNuevoCartera());
				
				int iLastRow =  this.jTableDatosCartera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCartera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCartera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCartera(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();									
		
			Cartera carteraOrigen=new Cartera();
			Cartera carteraDestino=new Cartera();
				
			carterasSeleccionados=this.getCarterasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCartera.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || carterasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCartera.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						carteraOrigen =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						carteraOrigen =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						carteraDestino =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						carteraDestino =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				carteraOrigen =carterasSeleccionados.get(0);
				carteraDestino =carterasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCartera(carteraOrigen,carteraDestino,true,false);
				
				carteraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(carteraDestino,carteraLogic.getCarteras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(carteraDestino,carteras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCartera(false);
				
				//this.jTableDatosCartera.setRowSelectionInterval(this.getIndiceNuevoCartera(), this.getIndiceNuevoCartera());
				
				int iLastRow =  this.jTableDatosCartera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCartera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCartera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCartera(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCartera.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCartera.isVisible();
			
			
			this.jPanelParametrosReportesCartera.setVisible(!isVisible);
			this.jPanelPaginacionCartera.setVisible(!isVisible);
			this.jPanelAccionesCartera.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCartera();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCartera();
			
			this.abrirFrameOrderByCartera();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCartera(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCartera);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCartera.isMaximum()) {
					this.jInternalFrameDetalleFormCartera.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCartera.setSize(this.jInternalFrameDetalleFormCartera.iWidthFormulario,this.jInternalFrameDetalleFormCartera.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCartera.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCartera.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCartera.isMaximum()) {
						this.jInternalFrameDetalleFormCartera.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCartera.jContentPaneDetalleCartera.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCartera.jContentPaneDetalleCartera.getWidth(),CarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCartera.jContentPaneDetalleCartera.getWidth(),CarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCartera.jContentPaneDetalleCartera.getWidth(),CarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCartera.setVisible(true);
	        this.jInternalFrameDetalleFormCartera.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCartera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCartera==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCartera,false,this);
				} else {
					this.jInternalFrameOrderByCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCartera,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCartera);
				this.jInternalFrameOrderByCartera.setVisible(false);
				this.jInternalFrameOrderByCartera.setSelected(false);
				
				this.jInternalFrameOrderByCartera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCartera"));
				
				this.inicializarActualizarBindingTablaOrderByCartera();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCartera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCartera==null) {
				
				this.jInternalFrameImportacionCartera=new ImportacionJInternalFrame(CarteraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCartera);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCartera);
				this.jInternalFrameImportacionCartera.setVisible(false);
				this.jInternalFrameImportacionCartera.setSelected(false);


				this.jInternalFrameImportacionCartera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCartera"));
				this.jInternalFrameImportacionCartera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCartera"));
				this.jInternalFrameImportacionCartera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCartera"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCartera() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCartera==null) {
				this.jInternalFrameReporteDinamicoCartera=new ReporteDinamicoJInternalFrame(CarteraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCartera);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCartera);
				this.jInternalFrameReporteDinamicoCartera.setVisible(false);
				this.jInternalFrameReporteDinamicoCartera.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCartera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCartera"));
				this.jInternalFrameReporteDinamicoCartera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCartera"));
				this.jInternalFrameReporteDinamicoCartera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCartera"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCartera();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCartera() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCartera);
			
	       	this.jInternalFrameDetalleFormCartera.setVisible(false);
	        this.jInternalFrameDetalleFormCartera.setSelected(false);
			
			//this.jInternalFrameDetalleFormCartera.dispose();
			//this.jInternalFrameDetalleFormCartera=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCartera() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCartera.setVisible(true);
	        this.jInternalFrameReporteDinamicoCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCartera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCartera.setVisible(true);
	        this.jInternalFrameImportacionCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCartera() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCartera.setVisible(true);
	        this.jInternalFrameOrderByCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCartera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCartera.setVisible(false);
	        this.jInternalFrameOrderByCartera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCartera() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCartera.setVisible(false);
	        this.jInternalFrameReporteDinamicoCartera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCartera() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCartera.setVisible(false);
	        this.jInternalFrameImportacionCartera.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCartera(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCartera(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCartera.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCartera(true);
			//this.isEsNuevoCartera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCartera(false) ;
			
			if(carteraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCartera(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCartera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCarteraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCartera(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCartera.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCartera(true);
			//this.isEsNuevoCartera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cartera.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCartera(false) ;
			
			if(CarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCartera(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCartera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCartera(false);
			
			//if(!this.isEsNuevoCartera) {								
				int intSelectedRow = this.jTableDatosCartera.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCartera(this.cartera,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
				
			}
			
			if(this.permiteMantenimiento(this.cartera)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.carteraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCartera=true;
					this.inicializarActualizarBindingTablaCartera(false);
					this.isEsNuevoCartera=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCartera=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCartera=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCartera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCartera(false);
				
				this.habilitarDeshabilitarControlesCartera(false);
			
												
				
				if(CarteraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCartera();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCarteraActionPerformed(evt,carteraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCartera(this.cartera,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCartera.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,carteraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cartera.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCartera.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				this.cartera.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				this.cartera.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cartera)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.carteraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CarteraModel) this.jTableDatosCartera.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCartera=true;
				this.inicializarActualizarBindingTablaCartera(false);
				this.isEsNuevoCartera=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCartera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCartera(false);
				
				this.habilitarDeshabilitarControlesCartera(false);
				
				
				
				if(CarteraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCartera();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCarteraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCartera.getRowCount()>=1) {
				jTableDatosCartera.removeRowSelectionInterval(0, jTableDatosCartera.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCartera(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCartera(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCartera(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCartera(false) ;
			
			this.isEsNuevoCartera=false;
			
			if(CarteraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCartera();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCartera(false);
				
				//SI ES MANUAL
				if(CarteraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCartera();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCartera--;			
			//Cartera carteraAux= new Cartera();			
			//carteraAux.setId(this.iIdNuevoCartera);
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCartera();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
			
			this.cartera.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.carteraLogic.getCarteras().add(this.carteraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.carteras.add(this.carteraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCartera(false);
			
			this.jTableDatosCartera.setRowSelectionInterval(this.getIndiceNuevoCartera(), this.getIndiceNuevoCartera());
			
			int iLastRow =  this.jTableDatosCartera.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCartera.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCartera.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCartera(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCartera(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCartera(false);
			
			//SI ES MANUAL
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCartera();
			}
			
			//this.abrirFrameTreeCartera();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCarteraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CarteraS ?", "MANTENIMIENTO DE Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCartera.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCartera();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.carteraReturnGeneral=carteraLogic.procesarImportacionCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.carteraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCarteraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCarteraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCartera.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCartera.setFileImportacion(this.jInternalFrameImportacionCartera.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCartera.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCartera.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCartera.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCartera.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		

		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CarteraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CarteraBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteCarteras("Todos",carterasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CarteraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoCartera.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CarteraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CarteraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCartera.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCartera.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CarteraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoCarteraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Carteras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CarteraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CarteraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Cartera cartera:carterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cartera.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelCartera(row);				
			//	iRow++;
			//}				
			
			//for(Cartera carteraAux:carterasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCartera(carteraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCartera(false);
			
			//SI ES MANUAL
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCartera();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCartera(false);
			
			//SI ES MANUAL
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCartera();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCartera(false);
			
			//SI ES MANUAL
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCartera();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.carteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCartera() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCartera.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCartera.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCartera.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCartera.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCartera.setMinimumSize(dimensionMinimum);
		this.jTableDatosCartera.setMaximumSize(dimensionMaximum);
		this.jTableDatosCartera.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCartera(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCartera(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCartera(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCartera(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCartera(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCartera(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCartera(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCartera(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CarteraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CarteraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCartera() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCartera();
		
		this.inicializarActualizarBindingBotonesManualCartera(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCartera();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCartera() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCartera(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCartera(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCartera.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCartera.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCartera.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCartera!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionNuevoCartera.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionSinCerrarCartera.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionSinMensajeCartera.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCartera.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCartera.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCartera.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCartera!=null) {
				this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionNuevoCartera.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionSinCerrarCartera.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCartera.jCheckBoxPostAccionSinMensajeCartera.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCartera.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCartera.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCartera.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCartera!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCartera.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCartera.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCartera.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCartera.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCartera!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCartera.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCartera.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCartera(Boolean esInicializar) throws Exception {
		try	{	
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCartera(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCartera() throws Exception {
		try	{
			if(CarteraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCartera();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCartera() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCartera() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCartera.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCartera.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCartera.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCartera.addItem(reporte);
			}
			
			
			if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCartera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCartera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCartera.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCartera.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCartera.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCartera.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCartera();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCartera() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCartera!=null) {
				this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCartera!=null) {
				this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCartera.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCartera!=null) {
				
				if(this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCartera.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCartera.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCartera.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCartera.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCartera()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCartera(Boolean esInicializar) throws Exception {				
		if(CarteraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCartera();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCartera() throws Exception {
		this.inicializarActualizarBindingTablaCartera(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCartera() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCartera.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCartera.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCarteraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCarteraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCartera.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCartera(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=carteraLogic.getCarteras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=carteras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCartera.setModel(new CarteraModel(this.carteraLogic.getCarteras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCartera.setModel(new CarteraModel(this.carteras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCartera!=null && this.jInternalFrameOrderByCartera.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCartera();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCartera,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CarteraConstantesFunciones.SCLASSWEBTITULO,carteraConstantesFunciones.resaltarSeleccionarCartera,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CarteraConstantesFunciones.SCLASSWEBTITULO,carteraConstantesFunciones.resaltarSeleccionarCartera,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCartera,CarteraConstantesFunciones.LABEL_ID));

		if(this.carteraConstantesFunciones.mostraridCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CarteraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.carteraConstantesFunciones.resaltaridCartera,this.carteraConstantesFunciones.activaridCartera,this,true,"idCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.carteraConstantesFunciones.resaltaridCartera,this.carteraConstantesFunciones.activaridCartera,this,true,"idCartera","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCartera,CarteraConstantesFunciones.LABEL_CODIGO));

		if(this.carteraConstantesFunciones.mostrarcodigoCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CarteraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.carteraConstantesFunciones.resaltarcodigoCartera,this.carteraConstantesFunciones.activarcodigoCartera,this,true,"codigoCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.carteraConstantesFunciones.resaltarcodigoCartera,this.carteraConstantesFunciones.activarcodigoCartera,this,true,"codigoCartera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.carteraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.carteraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.carteraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCartera.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.carteraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.carteraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCartera.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCartera && this.isPermisoGuardarCambiosCartera) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.carteraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.carteraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCartera.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosCartera.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCartera && this.isPermisoGuardarCambiosCartera) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCartera && this.isPermisoGuardarCambiosCartera) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCartera.moveColumn(this.jTableDatosCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCartera.moveColumn(this.jTableDatosCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCartera.moveColumn(this.jTableDatosCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCartera.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCartera.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCartera,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCartera.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCartera.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCartera.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCartera.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCartera.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=carteraLogic.getCarteras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=carteras.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosCartera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCartera();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoCartera=false;
					
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
				if(this.carteraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCartera==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCartera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCartera.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cartera.getsType().equals("DUPLICADO")
				   || this.cartera.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCartera=true;
				
				} else {
					this.isEsNuevoCartera=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
					if(this.cartera.getId()>=0 && !this.cartera.getIsNew()) {						
						this.isEsNuevoCartera=false;
						
					} else {
						this.isEsNuevoCartera=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCartera(esRelaciones);						
				
				this.seleccionarCartera(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cartera.getId()<0) {
					this.isEsNuevoCartera=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCartera(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCartera(evt,rowIndex);
				}	
				
				if(this.carteraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Cartera: " + this.dDif); 
					}
				}								
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCartera(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cartera)) {
					if(this.cartera.getId()>0) {
						this.cartera.setIsDeleted(true);
						
						this.carterasEliminados.add(this.cartera);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.carteraLogic.getCarteras().remove(this.cartera);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.carteras.remove(this.cartera);				
					}
					
					
					((CarteraModel) this.jTableDatosCartera.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCartera(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCartera(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCartera) {
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCartera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCartera.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCartera(this.cartera);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCartera("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCartera(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCartera() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCartera(Cartera cartera) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCartera(cartera,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCartera(Cartera cartera,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCartera(cartera);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCartera(cartera,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCartera(cartera);
	}
	
	public void setVariablesObjetoActualToFormularioCartera(Cartera cartera) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCartera.jLabelidCartera.setText(cartera.getId().toString());
			this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setText(cartera.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Cartera carteraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,carteraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Cartera carteraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				carteraLocal=this.cartera;
			} else {
				carteraLocal=this.carteraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(carteraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCartera(carteraLocal,true);
					
					if(carteraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(carteraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.carteraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(carteraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCartera(Cartera cartera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCartera(cartera,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCartera(cartera);
	}
	
	public void setVariablesFormularioToObjetoActualCartera(Cartera cartera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCartera(cartera,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCartera(Cartera cartera,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCartera.jLabelidCartera.getText()==null || this.jInternalFrameDetalleFormCartera.jLabelidCartera.getText()=="" || this.jInternalFrameDetalleFormCartera.jLabelidCartera.getText()=="Id") {
				this.jInternalFrameDetalleFormCartera.jLabelidCartera.setText("0");
			}

			if(conColumnasBase) {cartera.setId(Long.parseLong(this.jInternalFrameDetalleFormCartera.jLabelidCartera.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CarteraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCartera.jLabelIdCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cartera.setcodigo(this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CarteraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCartera.jLabelcodigoCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCartera(Cartera carteraBean,Cartera cartera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCartera(Cartera carteraOrigen,Cartera cartera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && carteraOrigen.getId()!=null && !carteraOrigen.getId().equals(0L))) {cartera.setId(carteraOrigen.getId());}}
			if(conDefault || (!conDefault && carteraOrigen.getcodigo()!=null && !carteraOrigen.getcodigo().equals(""))) {cartera.setcodigo(carteraOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCartera(Cartera cartera) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCartera.jLabelidCartera.setText(cartera.getId().toString());
			this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setText(cartera.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCartera(CarteraBean carteraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCartera.jLabelidCartera.setText(carteraBean.getId().toString());
			this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setText(carteraBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCartera(CarteraParameterReturnGeneral carteraReturnGeneral,CarteraBean carteraBean,Boolean conDefault) throws Exception { 
		try {
			Cartera carteraLocal=new Cartera();
			
			carteraLocal=carteraReturnGeneral.getCartera();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && carteraLocal.getId()!=null && !carteraLocal.getId().equals(0L))) {carteraBean.setId(carteraLocal.getId());}}
			if(conDefault || (!conDefault && carteraLocal.getcodigo()!=null && !carteraLocal.getcodigo().equals(""))) {carteraBean.setcodigo(carteraLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCarteraGenerico(Long idCarteraSeleccionado,JComboBox jComboBoxCartera,List<Cartera> carterasLocal)throws Exception {
		try {
			Cartera  carteraTemp=null;

			for(Cartera carteraAux:carterasLocal) {
				if(carteraAux.getId()!=null && carteraAux.getId().equals(idCarteraSeleccionado)) {
					carteraTemp=carteraAux;
					break;
				}
			}

			jComboBoxCartera.setSelectedItem(carteraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCarteraGenerico(JComboBox jComboBoxCartera,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCartera.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCartera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCartera.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCartera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cartera=(Cartera) carteraLogic.getCarteras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cartera =(Cartera) carteras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Cartera carteraRow=new Cartera();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			carteraRow=(Cartera) carteraLogic.getCarteras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			carteraRow=(Cartera) carteras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCartera(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera));			
			this.jButtonDuplicarCartera.setVisible((this.isVisibilidadCeldaDuplicarCartera && this.isPermisoDuplicarCartera));			
			this.jButtonCopiarCartera.setVisible((this.isVisibilidadCeldaCopiarCartera && this.isPermisoCopiarCartera));
			this.jButtonVerFormCartera.setVisible((this.isVisibilidadCeldaVerFormCartera && this.isPermisoVerFormCartera));
			
			this.jButtonAbrirOrderByCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));			
			
			this.jButtonNuevoRelacionesCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesCartera && this.isPermisoNuevoCartera));			
			this.jButtonNuevoGuardarCambiosCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera && this.isPermisoGuardarCambiosCartera));
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.jInternalFrameDetalleFormCartera.jButtonModificarCartera.setVisible((this.isVisibilidadCeldaModificarCartera && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.setVisible((this.isVisibilidadCeldaActualizarCartera && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.setVisible((this.isVisibilidadCeldaEliminarCartera && this.isPermisoEliminarCartera));
			this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.setVisible(this.isVisibilidadCeldaCancelarCartera);							
			this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.setVisible((this.isVisibilidadCeldaGuardarCartera && this.isPermisoGuardarCambiosCartera));			
			
			}
						
			this.jButtonGuardarCambiosTablaCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosCartera && this.isPermisoGuardarCambiosCartera));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera));						
			this.jButtonDuplicarToolBarCartera.setVisible((this.isVisibilidadCeldaDuplicarCartera && this.isPermisoDuplicarCartera));						
			this.jButtonCopiarToolBarCartera.setVisible((this.isVisibilidadCeldaCopiarCartera && this.isPermisoCopiarCartera));			
			this.jButtonVerFormToolBarCartera.setVisible((this.isVisibilidadCeldaVerFormCartera && this.isPermisoVerFormCartera));			
			this.jButtonAbrirOrderByToolBarCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));
			this.jButtonNuevoRelacionesToolBarCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesCartera && this.isPermisoNuevoCartera));			
			this.jButtonNuevoGuardarCambiosToolBarCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera && this.isPermisoGuardarCambiosCartera));			
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.jInternalFrameDetalleFormCartera.jButtonModificarToolBarCartera.setVisible((this.isVisibilidadCeldaModificarCartera && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jButtonActualizarToolBarCartera.setVisible((this.isVisibilidadCeldaActualizarCartera  && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jButtonEliminarToolBarCartera.setVisible((this.isVisibilidadCeldaEliminarCartera && this.isPermisoEliminarCartera));
			this.jInternalFrameDetalleFormCartera.jButtonCancelarToolBarCartera.setVisible(this.isVisibilidadCeldaCancelarCartera);				
			this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosToolBarCartera.setVisible((this.isVisibilidadCeldaGuardarCartera && this.isPermisoGuardarCambiosCartera));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosCartera && this.isPermisoGuardarCambiosCartera));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera));			
			this.jMenuItemDuplicarCartera.setVisible((this.isVisibilidadCeldaDuplicarCartera && this.isPermisoDuplicarCartera));			
			this.jMenuItemCopiarCartera.setVisible((this.isVisibilidadCeldaCopiarCartera && this.isPermisoCopiarCartera));			
			this.jMenuItemVerFormCartera.setVisible((this.isVisibilidadCeldaVerFormCartera && this.isPermisoVerFormCartera));			
			this.jMenuItemAbrirOrderByCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));			
			//this.jMenuItemMostrarOcultarCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));
			this.jMenuItemDetalleAbrirOrderByCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));			
			//this.jMenuItemDetalleMostrarOcultarCartera.setVisible((this.isVisibilidadCeldaOrdenCartera && this.isPermisoOrdenCartera));			
			this.jMenuItemNuevoRelacionesCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesCartera && this.isPermisoNuevoCartera));			
			this.jMenuItemNuevoGuardarCambiosCartera.setVisible((this.isVisibilidadCeldaNuevoCartera && this.isPermisoNuevoCartera && this.isPermisoGuardarCambiosCartera));									
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.jInternalFrameDetalleFormCartera.jMenuItemModificarCartera.setVisible((this.isVisibilidadCeldaModificarCartera && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jMenuItemActualizarCartera.setVisible((this.isVisibilidadCeldaActualizarCartera && this.isPermisoActualizarCartera));	
			this.jInternalFrameDetalleFormCartera.jMenuItemEliminarCartera.setVisible((this.isVisibilidadCeldaEliminarCartera && this.isPermisoEliminarCartera));
			this.jInternalFrameDetalleFormCartera.jMenuItemCancelarCartera.setVisible(this.isVisibilidadCeldaCancelarCartera);				
			}
			
			this.jMenuItemGuardarCambiosCartera.setVisible((this.isVisibilidadCeldaGuardarCartera && this.isPermisoGuardarCambiosCartera));						
			this.jMenuItemGuardarCambiosTablaCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosCartera && this.isPermisoGuardarCambiosCartera));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCartera=this.jButtonNuevoCartera.isVisible();
			this.isVisibilidadCeldaDuplicarCartera=this.jButtonDuplicarCartera.isVisible();
			this.isVisibilidadCeldaCopiarCartera=this.jButtonCopiarCartera.isVisible();
			this.isVisibilidadCeldaVerFormCartera=this.jButtonVerFormCartera.isVisible();
			
			this.isVisibilidadCeldaOrdenCartera=this.jButtonAbrirOrderByCartera.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCartera=this.jButtonNuevoRelacionesCartera.isVisible();
			this.isVisibilidadCeldaModificarCartera=this.jButtonModificarCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.isVisibilidadCeldaActualizarCartera=this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.isVisible();
			this.isVisibilidadCeldaEliminarCartera=this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.isVisible();
			this.isVisibilidadCeldaCancelarCartera=this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.isVisible();
			this.isVisibilidadCeldaGuardarCartera=this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCartera=this.jButtonGuardarCambiosTablaCartera.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCartera=this.jButtonNuevoToolBarCartera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCartera=this.jButtonNuevoRelacionesToolBarCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.isVisibilidadCeldaModificarCartera=this.jInternalFrameDetalleFormCartera.jButtonModificarToolBarCartera.isVisible();
			this.isVisibilidadCeldaActualizarCartera=this.jInternalFrameDetalleFormCartera.jButtonActualizarToolBarCartera.isVisible();
			this.isVisibilidadCeldaEliminarCartera=this.jInternalFrameDetalleFormCartera.jButtonEliminarToolBarCartera.isVisible();
			this.isVisibilidadCeldaCancelarCartera=this.jInternalFrameDetalleFormCartera.jButtonCancelarToolBarCartera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCartera=this.jButtonGuardarCambiosToolBarCartera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCartera=this.jButtonGuardarCambiosTablaToolBarCartera.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCartera=this.jMenuItemNuevoCartera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCartera=this.jMenuItemNuevoRelacionesCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormCartera!=null) {
			this.isVisibilidadCeldaModificarCartera=this.jInternalFrameDetalleFormCartera.jMenuItemModificarCartera.isVisible();
			this.isVisibilidadCeldaActualizarCartera=this.jInternalFrameDetalleFormCartera.jMenuItemActualizarCartera.isVisible();
			this.isVisibilidadCeldaEliminarCartera=this.jInternalFrameDetalleFormCartera.jMenuItemEliminarCartera.isVisible();
			this.isVisibilidadCeldaCancelarCartera=this.jInternalFrameDetalleFormCartera.jMenuItemCancelarCartera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCartera=this.jMenuItemGuardarCambiosCartera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCartera=this.jMenuItemGuardarCambiosTablaCartera.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCartera(Boolean esInicializar) {
		if(CarteraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.carteraSessionBean.getConGuardarRelaciones()) {
				//if(this.carteraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCartera();
			}
			
			this.inicializarActualizarBindingBotonesManualCartera(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCartera() {
		this.jButtonNuevoCartera.setVisible(this.isPermisoNuevoCartera);			
		this.jButtonDuplicarCartera.setVisible(this.isPermisoDuplicarCartera);			
		this.jButtonCopiarCartera.setVisible(this.isPermisoCopiarCartera);			
		this.jButtonVerFormCartera.setVisible(this.isPermisoVerFormCartera);			
		
		this.jButtonAbrirOrderByCartera.setVisible(this.isPermisoOrdenCartera);					
		
		this.jButtonNuevoRelacionesCartera.setVisible(this.isPermisoNuevoCartera);			
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonModificarCartera.setVisible(this.isPermisoActualizarCartera);	
			this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.setVisible(this.isPermisoActualizarCartera);	
			this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.setVisible(this.isPermisoEliminarCartera);
			this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.setVisible(this.isVisibilidadCeldaCancelarCartera);						
			this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.setVisible(this.isPermisoGuardarCambiosCartera);							
		}
		
		this.jButtonGuardarCambiosTablaCartera.setVisible(this.isPermisoActualizarCartera);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCartera() {
		this.jInternalFrameDetalleFormCartera.jButtonModificarCartera.setVisible(this.isPermisoActualizarCartera);	
		this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.setVisible(this.isPermisoActualizarCartera);	
		this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.setVisible(this.isPermisoEliminarCartera);
		this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.setVisible(this.isVisibilidadCeldaCancelarCartera);							
		this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.setVisible((this.isVisibilidadCeldaGuardarCartera && this.isPermisoGuardarCambiosCartera));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCartera() {
		if(CarteraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCartera();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCartera() {
	}
	
	public void jTableDatosCarteraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCartera(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCartera(this.getcartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cartera==null) {
						this.cartera = new Cartera();
					}

					this.setVariablesFormularioToObjetoActualCartera(this.cartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
				}

				if(this.cartera.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cartera.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCartera(this.getcartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cartera==null) {
						this.cartera = new Cartera();
					}

					this.setVariablesFormularioToObjetoActualCartera(this.cartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);
				}

				if(this.cartera.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cartera.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameCartera() {
		if(this.jInternalFrameDetalleFormCartera!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
			this.jInternalFrameDetalleFormCartera.setVisible(false);	    			
			this.jInternalFrameDetalleFormCartera.dispose();
			this.jInternalFrameDetalleFormCartera=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCartera!=null) {
			this.jInternalFrameReporteDinamicoCartera.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCartera.dispose();
			this.jInternalFrameReporteDinamicoCartera=null;
		}
		
		if(this.jInternalFrameImportacionCartera!=null) {
			this.jInternalFrameImportacionCartera.setVisible(false);	    			
			this.jInternalFrameImportacionCartera.dispose();
			this.jInternalFrameImportacionCartera=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCartera();
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			
			if(sTipo.equals("NuevoCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCartera")) {
				jButtonDuplicarCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCartera")) {
				jButtonCopiarCarteraActionPerformed(evt);
			} else if(sTipo.equals("VerFormCartera")) {
				jButtonVerFormCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCartera")) {
				jButtonDuplicarCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCartera")) {
				jButtonDuplicarCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCartera")) {
				jButtonModificarCarteraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCartera")) {
				jButtonModificarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCartera")) {
				jButtonModificarCarteraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCartera")) {
				jButtonActualizarCarteraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCartera")) {
				jButtonActualizarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCartera")) {
				jButtonActualizarCarteraActionPerformed(evt);
			} else if(sTipo.equals("EliminarCartera")) {
				jButtonEliminarCarteraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCartera")) {
				jButtonEliminarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCartera")) {
				jButtonEliminarCarteraActionPerformed(evt);
			} else if(sTipo.equals("CancelarCartera")) {
				jButtonCancelarCarteraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCartera")) {
				jButtonCancelarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCartera")) {
				jButtonCancelarCarteraActionPerformed(evt);
			} else if(sTipo.equals("CerrarCartera")) {
				jButtonCerrarCarteraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCartera")) {
				jButtonCerrarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCartera")) {
				jButtonCerrarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCartera")) {
				jButtonMostrarOcultarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCartera")) {
				jButtonCancelarCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCartera")) {
				jButtonCopiarCarteraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCartera")) {
				jButtonVerFormCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCartera")) {
				jButtonCopiarCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCartera")) {
				jButtonVerFormCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCartera")) {
				jButtonRecargarInformacionCarteraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCartera")) {
				jButtonRecargarInformacionCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCartera")) {
				jButtonRecargarInformacionCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCartera")) {
				jButtonAnterioresCarteraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCartera")) {
				jButtonAnterioresCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCartera")) {
				jButtonAnterioresCarteraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCartera")) {
				jButtonSiguientesCarteraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCartera")) {
				jButtonSiguientesCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCartera")) {
				jButtonSiguientesCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCartera") || sTipo.equals("MenuItemDetalleAbrirOrderByCartera")) {
				jButtonAbrirOrderByCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCartera") || sTipo.equals("MenuItemDetalleMostrarOcultarCartera")) {
				jButtonMostrarOcultarCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCartera")) {
				jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCartera")) {
				jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCartera")) {
				jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCartera")) {
				jButtonCerrarReporteDinamicoCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCartera")) {
				jButtonGenerarReporteDinamicoCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCartera")) {
				
				jButtonGenerarExcelReporteDinamicoCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCartera")) {
				jButtonCerrarImportacionCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCartera")) {
				
				jButtonGenerarImportacionCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCartera")) {
				
				jButtonAbrirImportacionCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCartera")) {
				jComboBoxTiposAccionesCarteraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCartera")) {
				jComboBoxTiposRelacionesCarteraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCartera")) {
				jComboBoxTiposAccionesCarteraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCartera")) {
				
				jComboBoxTiposSeleccionarCarteraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCartera")) {
				jTextFieldValorCampoGeneralCarteraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCartera")) {
				jButtonAbrirOrderByCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCartera")) {
				jButtonAbrirOrderByCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCartera")) {
				jButtonCerrarOrderByCarteraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCarteraBusqueda")) {
				this.jButtonidCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCarteraBusqueda")) {
				this.jButtoncodigoCarteraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCartera();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Cartera carteraLocal=null;
			
			if(!this.getEsControlTabla()) {
				carteraLocal=this.cartera;
			} else {
				carteraLocal=this.carteraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
							
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
								
						
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
								
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
							
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
								
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCartera")) {
					jCheckBoxSeleccionarTodosCarteraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCartera")) {
					jCheckBoxSeleccionadosCarteraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCartera")) {
					
				}
				
				


				
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
												
				
				


				
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCarteraActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cartera);
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cartera.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.carteraAnterior =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.carteraAnterior =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCartera")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCarteraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCartera.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cartera =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cartera =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cartera);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCartera")) {
				
				}
				
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCartera")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCartera.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCartera")) {
			
			}
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCartera();
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			if(sTipo.equals("NuevoCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCartera")) {
				jButtonDuplicarCarteraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCartera")) {
				jButtonCopiarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCartera")) {
				jButtonVerFormCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCartera")) {
				jButtonNuevoCarteraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCartera")) {
				jButtonModificarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCartera")) {
				jButtonActualizarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCartera")) {
				jButtonEliminarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCartera")) {
				jButtonCancelarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCartera")) {
				jButtonCerrarCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCartera")) {
				jButtonGuardarCambiosCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCartera")) {
				jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCartera")) {
				jButtonAbrirOrderByCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCartera")) {
				jButtonRecargarInformacionCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCartera")) {
				jButtonAnterioresCarteraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCartera")) {
				jButtonSiguientesCarteraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCarteraBusqueda")) {
				this.jButtonidCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCarteraBusqueda")) {
				this.jButtoncodigoCarteraBusquedaActionPerformed(evt);
			}
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCartera();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCartera")) {
				closingInternalFrameCartera();
				
			} else if(sTipo.equals("jButtonCancelarCartera")) {
				JInternalFrameBase jInternalFrameDetalleFormCartera = (JInternalFrameBase)evt.getSource();
	            	
	            CarteraBeanSwingJInternalFrame jInternalFrameParent=(CarteraBeanSwingJInternalFrame)jInternalFrameDetalleFormCartera.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCarteraActionPerformed(null);
			}
			
			CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cartera,new Object(),this.carteraParameterGeneral,this.carteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCartera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCartera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCartera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cartera)) {
			if(!esControlTabla) {
				if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCartera(this.cartera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);			
				}
				
				if(this.carteraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCartera(this.cartera,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCartera(this.carteraReturnGeneral,this.carteraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.carteraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCartera(classes,this.carteraReturnGeneral,this.carteraBean,false);
					}
						
					if(this.carteraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCartera(this.carteraReturnGeneral.getCartera());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCartera(this.carteraReturnGeneral.getCartera());	
					}
						
					if(this.carteraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCartera(this.carteraReturnGeneral.getCartera(),classes);//this.carteraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCartera(this.cartera,classes);//this.carteraBean);									
				}
			
				if(CarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCartera(this.cartera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCartera(this.cartera);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.carteraAnterior!=null) {
						this.cartera=this.carteraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.carteraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.carteraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.carteraReturnGeneral.getCartera(),carteraLogic.getCarteras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.carteraReturnGeneral.getCartera(),this.carteras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCartera.repaint();
				
				//((AbstractTableModel) this.jTableDatosCartera.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCartera();
			}
		}
	}
	
	public void actualizarVisualTableDatosCartera() throws Exception {
		
		CarteraModel carteraModel=(CarteraModel)this.jTableDatosCartera.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			carteraModel.carteras=this.carteraLogic.getCarteras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			carteraModel.carteras=this.carteras;
		}
		
		
		((CarteraModel) this.jTableDatosCartera.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCartera() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcarteraAnterior(),this.carteraLogic.getCarteras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcarteraAnterior(),this.carteras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCartera();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCartera(Cartera cartera,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cartera,new Object(),generalEntityParameterGeneral,this.carteraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.carteraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CarteraConstantesFunciones.getClassesRelationshipsOfCartera(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CarteraConstantesFunciones.getClassesRelationshipsFromStringsOfCartera(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCartera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cartera,new Object(),generalEntityParameterGeneral,this.carteraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCartera(CarteraBean carteraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCartera(ArrayList<Classe> classes,CarteraReturnGeneral carteraReturnGeneral,CarteraBean carteraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCartera(Cartera cartera,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cartera)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCartera = new CarteraDetalleFormJInternalFrame(jDesktopPane,this.carteraSessionBean.getConGuardarRelaciones(),this.carteraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCartera);
		this.jInternalFrameDetalleFormCartera.setVisible(false);
		this.jInternalFrameDetalleFormCartera.setSelected(false);						
		
		this.jInternalFrameDetalleFormCartera.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCartera.carteraLogic=this.carteraLogic;
		
		this.cargarCombosFrameForeignKeyCartera("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCartera();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCartera();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCartera("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCartera();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCartera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCartera"));
		
		this.jInternalFrameDetalleFormCartera.jButtonModificarCartera.addActionListener(new ButtonActionListener(this,"ModificarCartera"));

		
		this.jInternalFrameDetalleFormCartera.jButtonModificarToolBarCartera.addActionListener(new ButtonActionListener(this,"ModificarToolBarCartera"));
					
		this.jInternalFrameDetalleFormCartera.jMenuItemModificarCartera.addActionListener(new ButtonActionListener(this,"MenuItemModificarCartera"));		
		
		
		
		this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.addActionListener (new ButtonActionListener(this,"ActualizarCartera"));
		
		
		this.jInternalFrameDetalleFormCartera.jButtonActualizarToolBarCartera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCartera"));
						
		this.jInternalFrameDetalleFormCartera.jMenuItemActualizarCartera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCartera"));		
		
		
		
		this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.addActionListener (new ButtonActionListener(this,"EliminarCartera"));
		
		
		this.jInternalFrameDetalleFormCartera.jButtonEliminarToolBarCartera.addActionListener (new ButtonActionListener(this,"EliminarToolBarCartera"));
								
		this.jInternalFrameDetalleFormCartera.jMenuItemEliminarCartera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCartera"));		
		
		
		
		this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.addActionListener (new ButtonActionListener(this,"CancelarCartera"));
		
		
		this.jInternalFrameDetalleFormCartera.jButtonCancelarToolBarCartera.addActionListener (new ButtonActionListener(this,"CancelarToolBarCartera"));
					
		this.jInternalFrameDetalleFormCartera.jMenuItemCancelarCartera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCartera"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCartera.jMenuItemDetalleCerrarCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCartera"));		
		
		
		
		this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosToolBarCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCartera"));
		
		
		
		this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosToolBarCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCartera"));
		
		
		
		this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCartera"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtonidCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtoncodigoCarteraBusqueda.addActionListener(new ButtonActionListener(this,"codigoCarteraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCartera"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCartera"));
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCartera"));
		}
		
		this.jTableDatosCartera.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCartera"));
		
		this.jTableDatosCartera.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCartera"));
		
		this.jButtonNuevoCartera.addActionListener(new ButtonActionListener(this,"NuevoCartera"));
		
		this.jButtonDuplicarCartera.addActionListener(new ButtonActionListener(this,"DuplicarCartera"));
		
		this.jButtonCopiarCartera.addActionListener(new ButtonActionListener(this,"CopiarCartera"));
		
		this.jButtonVerFormCartera.addActionListener(new ButtonActionListener(this,"VerFormCartera"));
		
		
		this.jButtonNuevoToolBarCartera.addActionListener(new ButtonActionListener(this,"NuevoToolBarCartera"));
			
		this.jButtonDuplicarToolBarCartera.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCartera"));
			
		this.jMenuItemNuevoCartera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCartera"));
			
		this.jMenuItemDuplicarCartera.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCartera"));		
		
		
		this.jButtonNuevoRelacionesCartera.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCartera"));
		
		
		this.jButtonNuevoRelacionesToolBarCartera.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCartera"));
			
		this.jMenuItemNuevoRelacionesCartera.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCartera"));		
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonModificarCartera.addActionListener(new ButtonActionListener(this,"ModificarCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonModificarToolBarCartera.addActionListener(new ButtonActionListener(this,"ModificarToolBarCartera"));
			
			this.jInternalFrameDetalleFormCartera.jMenuItemModificarCartera.addActionListener(new ButtonActionListener(this,"MenuItemModificarCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCartera.jButtonActualizarCartera.addActionListener (new ButtonActionListener(this,"ActualizarCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonActualizarToolBarCartera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCartera"));
				
			this.jInternalFrameDetalleFormCartera.jMenuItemActualizarCartera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonEliminarCartera.addActionListener (new ButtonActionListener(this,"EliminarCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonEliminarToolBarCartera.addActionListener (new ButtonActionListener(this,"EliminarToolBarCartera"));
						
			this.jInternalFrameDetalleFormCartera.jMenuItemEliminarCartera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonCancelarCartera.addActionListener (new ButtonActionListener(this,"CancelarCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonCancelarToolBarCartera.addActionListener (new ButtonActionListener(this,"CancelarToolBarCartera"));
			
			this.jInternalFrameDetalleFormCartera.jMenuItemCancelarCartera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCartera"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCartera.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCartera"));		
		
		
		this.jButtonCerrarCartera.addActionListener (new ButtonActionListener(this,"CerrarCartera"));
		
		
		this.jButtonCerrarToolBarCartera.addActionListener (new ButtonActionListener(this,"CerrarToolBarCartera"));
			
		this.jMenuItemCerrarCartera.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCartera"));
			
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jMenuItemDetalleCerrarCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosToolBarCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCartera"));
		}
		
		this.jButtonCopiarToolBarCartera.addActionListener (new ButtonActionListener(this,"CopiarToolBarCartera"));
			
		this.jButtonVerFormToolBarCartera.addActionListener (new ButtonActionListener(this,"VerFormToolBarCartera"));
		
		this.jMenuItemGuardarCambiosCartera.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCartera"));
			
		this.jMenuItemCopiarCartera.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCartera"));		
		
		this.jMenuItemVerFormCartera.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCartera"));		
		
		
		this.jButtonGuardarCambiosTablaCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCartera"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCartera"));
			
		this.jMenuItemGuardarCambiosTablaCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCartera"));		
		
		
		
		this.jButtonRecargarInformacionCartera.addActionListener (new ButtonActionListener(this,"RecargarInformacionCartera"));
					
		this.jButtonRecargarInformacionToolBarCartera.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCartera"));
		
		this.jMenuItemRecargarInformacionCartera.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCartera"));		
		
		
		
		this.jButtonAnterioresCartera.addActionListener (new ButtonActionListener(this,"AnterioresCartera"));
		
		
		this.jButtonAnterioresToolBarCartera.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCartera"));
		
		this.jMenuItemAnterioresCartera.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCartera"));		
		
		
		this.jButtonSiguientesCartera.addActionListener (new ButtonActionListener(this,"SiguientesCartera"));
		
		
		this.jButtonSiguientesToolBarCartera.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCartera"));
			
		this.jMenuItemSiguientesCartera.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCartera"));
			
		this.jMenuItemAbrirOrderByCartera.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCartera"));
			
		this.jMenuItemMostrarOcultarCartera.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCartera"));
			
		this.jMenuItemDetalleAbrirOrderByCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCartera"));
			
		this.jMenuItemDetalleMostarOcultarCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCartera"));		
		
		
		this.jButtonNuevoGuardarCambiosCartera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCartera"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCartera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCartera"));
			
		this.jMenuItemNuevoGuardarCambiosCartera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCartera"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCartera.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCartera"));

		this.jCheckBoxSeleccionadosCartera.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCartera"));
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCartera"));
		}
		
		
		this.jComboBoxTiposRelacionesCartera.addActionListener (new ButtonActionListener(this,"TiposRelacionesCartera"));
			
		this.jComboBoxTiposAccionesCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesCartera"));
					
		this.jComboBoxTiposSeleccionarCartera.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCartera"));
			
		this.jTextFieldValorCampoGeneralCartera.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCartera"));		
		
		
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtonidCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtoncodigoCarteraBusqueda.addActionListener(new ButtonActionListener(this,"codigoCarteraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCartera!=null) {
				this.jInternalFrameReporteDinamicoCartera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCartera"));
				this.jInternalFrameReporteDinamicoCartera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCartera"));
				this.jInternalFrameReporteDinamicoCartera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCartera"));
			}
			
			//this.jButtonCerrarReporteDinamicoCartera.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCartera"));				
			//this.jButtonGenerarReporteDinamicoCartera.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCartera"));
			//this.jButtonGenerarExcelReporteDinamicoCartera.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCartera"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCartera!=null) {
				this.jInternalFrameImportacionCartera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCartera"));
				this.jInternalFrameImportacionCartera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCartera"));
				this.jInternalFrameImportacionCartera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCartera"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCartera.addActionListener (new ButtonActionListener(this,"AbrirOrderByCartera"));
			
			this.jButtonAbrirOrderByToolBarCartera.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCartera"));			
			
			if(this.jInternalFrameOrderByCartera!=null) {
				this.jInternalFrameOrderByCartera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCartera"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCartera.jTabbedPaneRelacionesCartera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCartera"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameCartera();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCartera.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCartera = (JInternalFrameBase)event.getSource();
	            	
	            CarteraBeanSwingJInternalFrame jInternalFrameParent=(CarteraBeanSwingJInternalFrame)jInternalFrameDetalleFormCartera.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCarteraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCartera.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCarteraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCartera.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCartera.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCartera";
		inputMap = this.jButtonNuevoCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCarteraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCartera";
		inputMap = this.jButtonNuevoRelacionesCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCarteraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCartera";
		inputMap = this.jButtonModificarCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCartera";
		inputMap = this.jButtonActualizarCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCartera";
		inputMap = this.jButtonEliminarCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCartera";
		inputMap = this.jButtonCancelarCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCartera";
		inputMap = this.jButtonCerrarCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCartera";
		inputMap = this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCartera.jButtonGuardarCambiosCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCartera.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCarteraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtonidCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCartera.jButtoncodigoCarteraBusqueda.addActionListener(new ButtonActionListener(this,"codigoCarteraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCarteraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCartera.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCartera(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
					carteraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cartera carteraAux:carteras) {
					carteraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCarteraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCartera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
						carteraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cartera carteraAux:carteras) {
						carteraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cartera carteraAux:carteras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCartera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCartera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCartera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCartera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCarteraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCartera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCartera.getSelectedRows();
			
			Cartera carteraLocal=new Cartera();
			
			//this.seleccionarTodosCartera(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					carteraLocal =(Cartera) this.carteraLogic.getCarteras().toArray()[this.jTableDatosCartera.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					carteraLocal =(Cartera) this.carteras.toArray()[this.jTableDatosCartera.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				carteraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
						carteraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cartera carteraAux:carteras) {
						carteraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCartera(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCartera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCartera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCartera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCarteraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCarteraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCarteraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCartera(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCartera.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cartera carteraAux:this.carteraLogic.getCarteras()) {
				
						if(sTipoSeleccionar.equals(CarteraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							carteraAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cartera carteraAux:carteras) {
					
						if(sTipoSeleccionar.equals(CarteraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							carteraAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCartera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCarteraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCartera(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCartera=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCartera.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCartera) {				
					conSplash=true;//false;										
					
					//this.startProcessCartera(conSplash);
				
					this.generarReporteCarterasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCarterasSeleccionados();
				//this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCarterasSeleccionados(false);
				//this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCarterasSeleccionados(true);
				//this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCartera();
				
				this.exportarCarterasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCarteras();
				//this.importarCarteras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCartera();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCarterasSeleccionados();
				//this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCartera();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCartera)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCartera(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
				}	
			} 			
			else if(CarteraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCartera) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCartera(conSplash);
					
						//this.actualizarParametrosGeneralCartera();
						
						this.generarReporteProcesoAccionCarterasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CarteraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CarteraS SELECCIONADOS?", "MANTENIMIENTO DE Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCartera();
				
						this.actualizarParametrosGeneralCartera();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.carteraReturnGeneral=carteraLogic.procesarAccionCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.carteraLogic.getCarteras(),this.carteraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCarteraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCartera();
					
					CarteraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCarteraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCartera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCartera.jComboBoxTiposAccionesFormularioCartera.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCartera(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCarteraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCartera();
			
			if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
			Cartera cartera=new Cartera();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCartera(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCartera.getSelectedItem();
			
			
			
			
			carterasSeleccionados=this.getCarterasSeleccionados(true);
			//this.sTipoAccion;
			
			if(carterasSeleccionados.size()==1) {
				for(Cartera carteraAux:carterasSeleccionados) {
					cartera=carteraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCartera();
			
      		//this.finishProcessCartera(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCarteraReturnGeneral() throws Exception {
		if(this.carteraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.carteraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.carteraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.carteraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.carteraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.carteraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCartera(false);
		}
		
		if(this.carteraReturnGeneral.getConRetornoLista() || this.carteraReturnGeneral.getConRetornoObjeto()) {
			if(this.carteraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.carteraLogic.setCarteras(this.carteraReturnGeneral.getCarteras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.carteraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.carteraLogic.setCartera(this.carteraReturnGeneral.getCartera());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCartera(false);
		}
	}
	
	public void actualizarParametrosGeneralCartera() throws Exception {
		
		
	}
	
	public ArrayList<Cartera> getCarterasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCartera) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Cartera carteraAux:carteraLogic.getCarteras()) {
					if(carteraAux.getIsSelected()) {
						carterasSeleccionados.add(carteraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cartera carteraAux:this.carteras) {
					if(carteraAux.getIsSelected()) {
						carterasSeleccionados.add(carteraAux);				
					}
				}
			}
			
			if(carterasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						carterasSeleccionados.addAll(this.carteraLogic.getCarteras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						carterasSeleccionados.addAll(this.carteras);				
					}
				}
			}
		} else {
			carterasSeleccionados.add(this.cartera);
		}
		
		return carterasSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteCarterasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCarterasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCarterasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCarterasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCarterasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cartera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCarteras("Todos",carterasSeleccionados);
		
	}	
	
	public void generarReporteNormalCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCarteras("Todos",carterasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCarterasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCarteras("Todos",carterasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCartera();
		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCartera();
		
		
		//this.generarReporteCarteras("Todos",carterasSeleccionados ,carteraImplementable,carteraImplementableHome);
	}
	
	public void mostrarImportacionCarteras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCartera();
		
		this.abrirFrameImportacionCartera();		
		
			
		//this.generarReporteCarteras("Todos",carterasSeleccionados ,carteraImplementable,carteraImplementableHome);
	}
	
	public void importarCarteras() throws Exception {		
	
	}
	
	public void exportarCarterasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCarterasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCarterasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCarterasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cartera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCartera(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Cartera carteraAux:carterasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCartera(carteraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//carteraAux.setsDetalleGeneralEntityReporte(carteraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCartera(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CarteraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CarteraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CarteraConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCartera(Cartera cartera,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cartera.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cartera.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cartera.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Carteras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCartera(row);				
				iRow++;
			}				
			
			for(Cartera carteraAux:carterasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCartera(carteraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCarterasSeleccionados() throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();		
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cartera.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("carteras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cartera");
			//elementRoot.appendChild(element);
		
			for(Cartera carteraAux:carterasSeleccionados) {
				element = document.createElement("cartera");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCartera(carteraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.carteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCartera(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CarteraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CarteraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CarteraConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCartera(Cartera cartera,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cartera.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cartera.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlCartera(Cartera cartera,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CarteraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cartera.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CarteraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cartera.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(CarteraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cartera.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoCarterasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Cartera> carterasSeleccionados=new ArrayList<Cartera>();
		
		carterasSeleccionados=this.getCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoCartera(carterasSeleccionados);
		
		this.generarReporteCarteras("Todos",carterasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCartera(ArrayList<Cartera> carterasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Cartera carteraAux:carterasSeleccionados) {
				carteraAux.setsDetalleGeneralEntityReporte(carteraAux.toString());
			
				if(sTipoSeleccionar.equals(CarteraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					carteraAux.setsDescripcionGeneralEntityReporte1(carteraAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCartera(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCartera=true;
				this.isVisibilidadCeldaNuevoRelacionesCartera=true;
				this.isVisibilidadCeldaGuardarCambiosCartera=true;
			}
			
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=true;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=true;
			this.isVisibilidadCeldaEliminarCartera=true;
			this.isVisibilidadCeldaCancelarCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=true;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesCartera=true;
			this.isVisibilidadCeldaGuardarCambiosCartera=true;
			this.isVisibilidadCeldaModificarCartera=false;
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
			this.isVisibilidadCeldaModificarCartera=true;
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
			this.isVisibilidadCeldaCancelarCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarCartera=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CarteraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesCartera=true;
			this.isVisibilidadCeldaGuardarCambiosCartera=true;
		} else {
			this.actualizarEstadoPanelsCartera(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCartera=false;
			//this.isVisibilidadCeldaVerFormCartera=false;
			this.isVisibilidadCeldaDuplicarCartera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!carteraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
		} else {
			this.isVisibilidadCeldaNuevoCartera=false;
			this.isVisibilidadCeldaGuardarCambiosCartera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(carteraSessionBean.getEsGuardarRelacionado()) {
			if(!carteraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCartera=false;												
			}
			
			this.jButtonCerrarCartera.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCartera=false;
		}
		
		if(!this.permiteMantenimiento(this.cartera)) {
			this.isVisibilidadCeldaActualizarCartera=false;
			this.isVisibilidadCeldaEliminarCartera=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCartera() {
	}
	
	public void actualizarEstadoPanelsCartera(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCartera!=null) {
				this.jScrollPanelDatosEdicionCartera.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosCartera!=null) {
				this.jScrollPanelDatosCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionCartera!=null) {
				this.jPanelPaginacionCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCartera!=null) {
				this.jPanelParametrosReportesCartera.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.carteraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.carteraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CarteraSessionBean carteraSessionBean=new CarteraSessionBean();
		
		if(this.carteraSessionBean==null) {
			this.carteraSessionBean=new CarteraSessionBean();
		}
		
		this.carteraSessionBean.setsUltimaBusquedaCartera(this.getsAccionBusqueda());
		this.carteraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.carteraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CarteraSessionBean carteraSessionBean=new CarteraSessionBean();
		
		if(this.carteraSessionBean==null) {
			this.carteraSessionBean=new CarteraSessionBean();
		}
		
		if(this.carteraSessionBean.getsUltimaBusquedaCartera()!=null&&!this.carteraSessionBean.getsUltimaBusquedaCartera().equals("")) {
			this.setsAccionBusqueda(carteraSessionBean.getsUltimaBusquedaCartera());
			this.setiNumeroPaginacion(carteraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(carteraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.carteraSessionBean.setsUltimaBusquedaCartera("");
		this.carteraSessionBean.setiNumeroPaginacion(CarteraConstantesFunciones.INUMEROPAGINACION);
		this.carteraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCartera(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCartera() {
		this.updateBorderResaltarBusquedasFormularioCartera();
		this.updateVisibilidadBusquedasFormularioCartera();
		this.updateHabilitarBusquedasFormularioCartera();
	}
	
	public void updateBorderResaltarBusquedasFormularioCartera() {					
	}
	
	public void updateVisibilidadBusquedasFormularioCartera() {
	}
	
	public void updateHabilitarBusquedasFormularioCartera() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioCartera() throws Exception {

		if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCartera();
		this.updateVisibilidadResaltarControlesFormularioCartera();
		this.updateHabilitarResaltarControlesFormularioCartera();
		
	}
	
	public void updateBorderResaltarControlesFormularioCartera() throws Exception {
		if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.carteraConstantesFunciones.resaltaridCartera!=null && this.jInternalFrameDetalleFormCartera!=null) {this.jInternalFrameDetalleFormCartera.jLabelidCartera.setBorder(this.carteraConstantesFunciones.resaltaridCartera);}
		if(this.carteraConstantesFunciones.resaltarcodigoCartera!=null && this.jInternalFrameDetalleFormCartera!=null) {this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setBorder(this.carteraConstantesFunciones.resaltarcodigoCartera);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCartera() throws Exception {		
		if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
	
		//this.jInternalFrameDetalleFormCartera.jLabelidCartera.setVisible(this.carteraConstantesFunciones.mostraridCartera);
		this.jInternalFrameDetalleFormCartera.jPanelidCartera.setVisible(this.carteraConstantesFunciones.mostraridCartera);
		//this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setVisible(this.carteraConstantesFunciones.mostrarcodigoCartera);
		this.jInternalFrameDetalleFormCartera.jPanelcodigoCartera.setVisible(this.carteraConstantesFunciones.mostrarcodigoCartera);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCartera() throws Exception {
		if(this.jInternalFrameDetalleFormCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCartera!=null) {
	
		this.jInternalFrameDetalleFormCartera.jLabelidCartera.setEnabled(this.carteraConstantesFunciones.activaridCartera);
		this.jInternalFrameDetalleFormCartera.jTextFieldcodigoCartera.setEnabled(this.carteraConstantesFunciones.activarcodigoCartera);
		}
	}
	
		
}