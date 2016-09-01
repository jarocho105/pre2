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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.TipoActivoFijoEmpresaConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoActivoFijoEmpresaParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoActivoFijoEmpresaParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoActivoFijoEmpresaBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoActivoFijoEmpresaBeanSwingJInternalFrame extends TipoActivoFijoEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoActivoFijoEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoActivoFijoEmpresa> tipoactivofijoempresaValidator = new ClassValidator<TipoActivoFijoEmpresa>(TipoActivoFijoEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoActivoFijoEmpresa tipoactivofijoempresa;	
	public TipoActivoFijoEmpresa tipoactivofijoempresaAux;
	public TipoActivoFijoEmpresa tipoactivofijoempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoActivoFijoEmpresa tipoactivofijoempresaTotales;
	public Long idTipoActivoFijoEmpresaActual;
	public Long iIdNuevoTipoActivoFijoEmpresa=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoActivoFijoEmpresa;
	public Boolean isPermisoNuevoTipoActivoFijoEmpresa;
	public Boolean isPermisoActualizarTipoActivoFijoEmpresa;
	public Boolean isPermisoActualizarOriginalTipoActivoFijoEmpresa;
	public Boolean isPermisoEliminarTipoActivoFijoEmpresa;
	public Boolean isPermisoGuardarCambiosTipoActivoFijoEmpresa;
	public Boolean isPermisoConsultaTipoActivoFijoEmpresa;
	public Boolean isPermisoBusquedaTipoActivoFijoEmpresa;
	public Boolean isPermisoReporteTipoActivoFijoEmpresa;
	public Boolean isPermisoPaginacionMedioTipoActivoFijoEmpresa;
	public Boolean isPermisoPaginacionAltoTipoActivoFijoEmpresa;
	public Boolean isPermisoPaginacionTodoTipoActivoFijoEmpresa;
	public Boolean isPermisoCopiarTipoActivoFijoEmpresa;
	public Boolean isPermisoVerFormTipoActivoFijoEmpresa;
	public Boolean isPermisoDuplicarTipoActivoFijoEmpresa;
	public Boolean isPermisoOrdenTipoActivoFijoEmpresa;
	
	
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
	
	public TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaReturnGeneral;
	public TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoActivoFijoEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoActivoFijoEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoActivoFijoEmpresaSessionBeanAdditional tipoactivofijoempresaSessionBeanAdditional=null;
	
	public TipoActivoFijoEmpresaSessionBeanAdditional getTipoActivoFijoEmpresaSessionBeanAdditional() {
		return this.tipoactivofijoempresaSessionBeanAdditional;
	}
	
	public void setTipoActivoFijoEmpresaSessionBeanAdditional(TipoActivoFijoEmpresaSessionBeanAdditional tipoactivofijoempresaSessionBeanAdditional) {
		try {
			this.tipoactivofijoempresaSessionBeanAdditional=tipoactivofijoempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional tipoactivofijoempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoActivoFijoEmpresaBeanSwingJInternalFrame
	
	public TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional getTipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipoactivofijoempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional(TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional tipoactivofijoempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoactivofijoempresaBeanSwingJInternalFrameAdditional=tipoactivofijoempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoActivoFijoEmpresaLogic tipoactivofijoempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoActivoFijoEmpresa tipoactivofijoempresaBean;
	public TipoActivoFijoEmpresaConstantesFunciones tipoactivofijoempresaConstantesFunciones;
	//public TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoActivoFijoEmpresa> tipoactivofijoempresas;	
	//public List<TipoActivoFijoEmpresa> tipoactivofijoempresasEliminados;
	//public List<TipoActivoFijoEmpresa> tipoactivofijoempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoActivoFijoEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoActivoFijoEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoActivoFijoEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoActivoFijoEmpresa() {
		return this.iIdNuevoTipoActivoFijoEmpresa;
	}

	public void setiIdNuevoTipoActivoFijoEmpresa(Long iIdNuevoTipoActivoFijoEmpresa) {
		this.iIdNuevoTipoActivoFijoEmpresa = iIdNuevoTipoActivoFijoEmpresa;
	}
	
	public Long getidTipoActivoFijoEmpresaActual() {
		return this.idTipoActivoFijoEmpresaActual;
	}

	public void setidTipoActivoFijoEmpresaActual(Long idTipoActivoFijoEmpresaActual) {
		this.idTipoActivoFijoEmpresaActual = idTipoActivoFijoEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoActivoFijoEmpresa gettipoactivofijoempresa() {
		return this.tipoactivofijoempresa;
	}

	public void settipoactivofijoempresa(TipoActivoFijoEmpresa tipoactivofijoempresa) {
		this.tipoactivofijoempresa = tipoactivofijoempresa;
	}
	
	public TipoActivoFijoEmpresa gettipoactivofijoempresaAux() {
		return this.tipoactivofijoempresaAux;
	}

	public void settipoactivofijoempresaAux(TipoActivoFijoEmpresa tipoactivofijoempresaAux) {
		this.tipoactivofijoempresaAux = tipoactivofijoempresaAux;
	}				
	
	public TipoActivoFijoEmpresa gettipoactivofijoempresaAnterior() {
		return this.tipoactivofijoempresaAnterior;
	}

	public void settipoactivofijoempresaAnterior(TipoActivoFijoEmpresa tipoactivofijoempresaAnterior) {
		this.tipoactivofijoempresaAnterior = tipoactivofijoempresaAnterior;
	}	
	
	public TipoActivoFijoEmpresa gettipoactivofijoempresaTotales() {
		return this.tipoactivofijoempresaTotales;
	}

	public void settipoactivofijoempresaTotales(TipoActivoFijoEmpresa tipoactivofijoempresaTotales) {
		this.tipoactivofijoempresaTotales = tipoactivofijoempresaTotales;
	}	
	
	public TipoActivoFijoEmpresa gettipoactivofijoempresaBean() {
		return this.tipoactivofijoempresaBean;
	}

	public void settipoactivofijoempresaBean(TipoActivoFijoEmpresa tipoactivofijoempresaBean) {
		this.tipoactivofijoempresaBean = tipoactivofijoempresaBean;
	}	
	
	public TipoActivoFijoEmpresaParameterReturnGeneral gettipoactivofijoempresaReturnGeneral() {
		return this.tipoactivofijoempresaReturnGeneral;
	}

	public void settipoactivofijoempresaReturnGeneral(TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaReturnGeneral) {
		this.tipoactivofijoempresaReturnGeneral = tipoactivofijoempresaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoActivoFijoEmpresaLogic getTipoActivoFijoEmpresaLogic()	{		
		return tipoactivofijoempresaLogic;
	}

	public void setTipoActivoFijoEmpresaLogic(TipoActivoFijoEmpresaLogic tipoactivofijoempresaLogic) {
		this.tipoactivofijoempresaLogic = tipoactivofijoempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoActivoFijoEmpresa() {
		return isEsNuevoTipoActivoFijoEmpresa;
	}

	public void setIsEsNuevoTipoActivoFijoEmpresa(Boolean isEsNuevoTipoActivoFijoEmpresa) {
		this.isEsNuevoTipoActivoFijoEmpresa = isEsNuevoTipoActivoFijoEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoActivoFijoEmpresa() {
		return esParaAccionDesdeFormularioTipoActivoFijoEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoActivoFijoEmpresa(Boolean esParaAccionDesdeFormularioTipoActivoFijoEmpresa) {
		this.esParaAccionDesdeFormularioTipoActivoFijoEmpresa = esParaAccionDesdeFormularioTipoActivoFijoEmpresa;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.tipoactivofijoempresaSessionBean==null) {
				this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
			}

			if(!this.tipoactivofijoempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(tipoactivofijoempresaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.tipoactivofijoempresa!=null) {
						this.tipoactivofijoempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoActivoFijoEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTipoActivoFijoEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoActivoFijoEmpresaGenerico!=null && jComboBoxid_empresaTipoActivoFijoEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoActivoFijoEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoActivoFijoEmpresa tipoactivofijoempresa,JComboBox jComboBoxid_empresaTipoActivoFijoEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoActivoFijoEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoActivoFijoEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoactivofijoempresa.setid_empresa(empresaAux.getId());
				tipoactivofijoempresa.setempresa_descripcion(TipoActivoFijoEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoactivofijoempresa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { 
					}

					if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoActivoFijoEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoActivoFijoEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa(this.tipoactivofijoempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(this.tipoactivofijoempresas);
			tipoactivofijoempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoActivoFijoEmpresaParameterReturnGeneral getTipoActivoFijoEmpresaParameterGeneral() {
		return this.tipoactivofijoempresaParameterGeneral;
	}
	
	public void setTipoActivoFijoEmpresaParameterGeneral(TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaParameterGeneral) {
		this.tipoactivofijoempresaParameterGeneral = tipoactivofijoempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoActivoFijoEmpresa() {
		return isPermisoTodoTipoActivoFijoEmpresa;
	}

	public void setIsPermisoTodoTipoActivoFijoEmpresa(Boolean isPermisoTodoTipoActivoFijoEmpresa) {
		this.isPermisoTodoTipoActivoFijoEmpresa = isPermisoTodoTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoActivoFijoEmpresa() {
		return isPermisoNuevoTipoActivoFijoEmpresa;
	}

	public void setIsPermisoNuevoTipoActivoFijoEmpresa(Boolean isPermisoNuevoTipoActivoFijoEmpresa) {
		this.isPermisoNuevoTipoActivoFijoEmpresa = isPermisoNuevoTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoActivoFijoEmpresa() {
		return isPermisoActualizarTipoActivoFijoEmpresa;
	}

	public void setIsPermisoActualizarTipoActivoFijoEmpresa(Boolean isPermisoActualizarTipoActivoFijoEmpresa) {
		this.isPermisoActualizarTipoActivoFijoEmpresa = isPermisoActualizarTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoActivoFijoEmpresa() {
		return isPermisoEliminarTipoActivoFijoEmpresa;
	}

	public void setIsPermisoEliminarTipoActivoFijoEmpresa(Boolean isPermisoEliminarTipoActivoFijoEmpresa) {
		this.isPermisoEliminarTipoActivoFijoEmpresa = isPermisoEliminarTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoActivoFijoEmpresa() {
		return isPermisoGuardarCambiosTipoActivoFijoEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoActivoFijoEmpresa(Boolean isPermisoGuardarCambiosTipoActivoFijoEmpresa) {
		this.isPermisoGuardarCambiosTipoActivoFijoEmpresa = isPermisoGuardarCambiosTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoActivoFijoEmpresa() {
		return isPermisoConsultaTipoActivoFijoEmpresa;
	}

	public void setIsPermisoConsultaTipoActivoFijoEmpresa(Boolean isPermisoConsultaTipoActivoFijoEmpresa) {
		this.isPermisoConsultaTipoActivoFijoEmpresa = isPermisoConsultaTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoActivoFijoEmpresa() {
		return isPermisoBusquedaTipoActivoFijoEmpresa;
	}

	public void setIsPermisoBusquedaTipoActivoFijoEmpresa(Boolean isPermisoBusquedaTipoActivoFijoEmpresa) {
		this.isPermisoBusquedaTipoActivoFijoEmpresa = isPermisoBusquedaTipoActivoFijoEmpresa;
	}

	public Boolean getIsPermisoReporteTipoActivoFijoEmpresa() {
		return isPermisoReporteTipoActivoFijoEmpresa;
	}

	public void setIsPermisoReporteTipoActivoFijoEmpresa(Boolean isPermisoReporteTipoActivoFijoEmpresa) {
		this.isPermisoReporteTipoActivoFijoEmpresa = isPermisoReporteTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoActivoFijoEmpresa() {
		return isPermisoPaginacionMedioTipoActivoFijoEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoActivoFijoEmpresa(Boolean isPermisoPaginacionMedioTipoActivoFijoEmpresa) {
		this.isPermisoPaginacionMedioTipoActivoFijoEmpresa = isPermisoPaginacionMedioTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoActivoFijoEmpresa() {
		return isPermisoPaginacionTodoTipoActivoFijoEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoActivoFijoEmpresa(Boolean isPermisoPaginacionTodoTipoActivoFijoEmpresa) {
		this.isPermisoPaginacionTodoTipoActivoFijoEmpresa = isPermisoPaginacionTodoTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoActivoFijoEmpresa() {
		return isPermisoPaginacionAltoTipoActivoFijoEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoActivoFijoEmpresa(Boolean isPermisoPaginacionAltoTipoActivoFijoEmpresa) {
		this.isPermisoPaginacionAltoTipoActivoFijoEmpresa = isPermisoPaginacionAltoTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoActivoFijoEmpresa() {
		return isPermisoCopiarTipoActivoFijoEmpresa;
	}

	public void setIsPermisoCopiarTipoActivoFijoEmpresa(Boolean isPermisoCopiarTipoActivoFijoEmpresa) {
		this.isPermisoCopiarTipoActivoFijoEmpresa = isPermisoCopiarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoActivoFijoEmpresa() {
		return isPermisoVerFormTipoActivoFijoEmpresa;
	}

	public void setIsPermisoVerFormTipoActivoFijoEmpresa(Boolean isPermisoVerFormTipoActivoFijoEmpresa) {
		this.isPermisoVerFormTipoActivoFijoEmpresa = isPermisoVerFormTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoActivoFijoEmpresa() {
		return isPermisoDuplicarTipoActivoFijoEmpresa;
	}

	public void setIsPermisoDuplicarTipoActivoFijoEmpresa(Boolean isPermisoDuplicarTipoActivoFijoEmpresa) {
		this.isPermisoDuplicarTipoActivoFijoEmpresa = isPermisoDuplicarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoActivoFijoEmpresa() {
		return isPermisoOrdenTipoActivoFijoEmpresa;
	}

	public void setIsPermisoOrdenTipoActivoFijoEmpresa(Boolean isPermisoOrdenTipoActivoFijoEmpresa) {
		this.isPermisoOrdenTipoActivoFijoEmpresa = isPermisoOrdenTipoActivoFijoEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaNuevoTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaNuevoTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa = isVisibilidadCeldaNuevoTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa = isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaCopiarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaCopiarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa = isVisibilidadCeldaCopiarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaVerFormTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaVerFormTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa = isVisibilidadCeldaVerFormTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaOrdenTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaOrdenTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa = isVisibilidadCeldaOrdenTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa = isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaModificarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaModificarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa = isVisibilidadCeldaModificarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaActualizarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaActualizarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa = isVisibilidadCeldaActualizarTipoActivoFijoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaEliminarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaEliminarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa = isVisibilidadCeldaEliminarTipoActivoFijoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaCancelarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaCancelarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa = isVisibilidadCeldaCancelarTipoActivoFijoEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaGuardarTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaGuardarTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa = isVisibilidadCeldaGuardarTipoActivoFijoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa = isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa;
	}
		
	public TipoActivoFijoEmpresaSessionBean gettipoactivofijoempresaSessionBean() {
		return this.tipoactivofijoempresaSessionBean;
	}
	
	public void settipoactivofijoempresaSessionBean(TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean) {
		this.tipoactivofijoempresaSessionBean=tipoactivofijoempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoactivofijoempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoActivoFijoEmpresa tipoactivofijoempresa,TipoActivoFijoEmpresa tipoactivofijoempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoActivoFijoEmpresa(tipoactivofijoempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoactivofijoempresaAux.setId(tipoactivofijoempresa.getId());
		tipoactivofijoempresaAux.setVersionRow(tipoactivofijoempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoActivoFijoEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoactivofijoempresaValidator.getInvalidValues(this.tipoactivofijoempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoactivofijoempresaLogic.setDatosCliente(datosCliente);
			tipoactivofijoempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoactivofijoempresaAux=new  TipoActivoFijoEmpresa();
				
				tipoactivofijoempresaAux.setIsNew(true);
				tipoactivofijoempresaAux.setIsChanged(true);
				
				tipoactivofijoempresaAux.setTipoActivoFijoEmpresaOriginal(this.tipoactivofijoempresa);
				
				tipoactivofijoempresaAux.setId(this.tipoactivofijoempresa.getId());	
				tipoactivofijoempresaAux.setVersionRow(this.tipoactivofijoempresa.getVersionRow());	
				tipoactivofijoempresaAux.setid_empresa(this.tipoactivofijoempresa.getid_empresa());	
				tipoactivofijoempresaAux.setcodigo(this.tipoactivofijoempresa.getcodigo());	
				tipoactivofijoempresaAux.setnombre(this.tipoactivofijoempresa.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresas();//WithConnection
						//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresaRelaciones(tipoactivofijoempresaAux);//WithConnection
								//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoactivofijoempresaAux=new  TipoActivoFijoEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() && this.tipoactivofijoempresa.getId()>=0)) {
						
					tipoactivofijoempresaAux.setIsNew(false);
				}
				
				tipoactivofijoempresaAux.setIsDeleted(false);
			
				tipoactivofijoempresaAux.setId(this.tipoactivofijoempresa.getId());	
				tipoactivofijoempresaAux.setVersionRow(this.tipoactivofijoempresa.getVersionRow());	
				tipoactivofijoempresaAux.setid_empresa(this.tipoactivofijoempresa.getid_empresa());	
				tipoactivofijoempresaAux.setcodigo(this.tipoactivofijoempresa.getcodigo());	
				tipoactivofijoempresaAux.setnombre(this.tipoactivofijoempresa.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresas();//WithConnection
						//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresaRelaciones(tipoactivofijoempresaAux);//WithConnection
								//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoactivofijoempresa,tipoactivofijoempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoactivofijoempresaAux=new  TipoActivoFijoEmpresa();
				
				tipoactivofijoempresaAux.setIsNew(false);
				tipoactivofijoempresaAux.setIsChanged(false);
				
				tipoactivofijoempresaAux.setIsDeleted(true);
				
				tipoactivofijoempresaAux.setId(this.tipoactivofijoempresa.getId());	
				tipoactivofijoempresaAux.setVersionRow(this.tipoactivofijoempresa.getVersionRow());	
				tipoactivofijoempresaAux.setid_empresa(this.tipoactivofijoempresa.getid_empresa());	
				tipoactivofijoempresaAux.setcodigo(this.tipoactivofijoempresa.getcodigo());	
				tipoactivofijoempresaAux.setnombre(this.tipoactivofijoempresa.getnombre());	
				
				if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoactivofijoempresaAux.getId()>=0) {	
						this.tipoactivofijoempresasEliminados.add(tipoactivofijoempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresas();//WithConnection
						//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresaRelaciones(tipoactivofijoempresaAux);//WithConnection
								//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
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
							if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoactivofijoempresaAux,tipoactivofijoempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().addAll(this.tipoactivofijoempresasEliminados);
					
					tipoactivofijoempresaLogic.saveTipoActivoFijoEmpresas();//WithConnection
					//tipoactivofijoempresaLogic.getSetVersionRowTipoActivoFijoEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa();
				
				this.tipoactivofijoempresasEliminados= new ArrayList<TipoActivoFijoEmpresa>();		
			}
			
			if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Activo Fijo Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoactivofijoempresa=tipoactivofijoempresaAux;
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
      		//this.finishProcessTipoActivoFijoEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoActivoFijoEmpresa tipoactivofijoempresaLocal) throws Exception {
		
		if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoActivoFijoEmpresa tipoactivofijoempresaLocal) throws Exception {	
		if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoactivofijoempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoActivoFijoEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoactivofijoempresaValidator.getInvalidValues(this.tipoactivofijoempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoActivoFijoEmpresa tipoactivofijoempresa,List<TipoActivoFijoEmpresa> tipoactivofijoempresas) throws Exception {
		try	{		
			TipoActivoFijoEmpresaConstantesFunciones.actualizarLista(tipoactivofijoempresa,tipoactivofijoempresas,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoActivoFijoEmpresa tipoactivofijoempresa,List<TipoActivoFijoEmpresa> tipoactivofijoempresas) throws Exception {
		try	{			
			TipoActivoFijoEmpresaConstantesFunciones.actualizarSelectedLista(tipoactivofijoempresa,tipoactivofijoempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoActivoFijoEmpresa> tipoactivofijoempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoactivofijoempresasLocal=this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoactivofijoempresasLocal=this.tipoactivofijoempresas;
			}
			//ARCHITECTURE
		
			for(TipoActivoFijoEmpresa tipoactivofijoempresaLocal:tipoactivofijoempresasLocal) {
				if(this.permiteMantenimiento(tipoactivofijoempresaLocal) && tipoactivofijoempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoActivoFijoEmpresaConstantesFunciones.getTipoActivoFijoEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoActivoFijoEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelid_empresaTipoActivoFijoEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoActivoFijoEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelcodigoTipoActivoFijoEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoActivoFijoEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelnombreTipoActivoFijoEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelid_empresaTipoActivoFijoEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelcodigoTipoActivoFijoEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelnombreTipoActivoFijoEmpresa,"");
		
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
		this.iIdNuevoTipoActivoFijoEmpresa--;	
		
		
		this.tipoactivofijoempresaAux=new TipoActivoFijoEmpresa();
		
		this.tipoactivofijoempresaAux.setId(this.iIdNuevoTipoActivoFijoEmpresa);
		this.tipoactivofijoempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(this.tipoactivofijoempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoactivofijoempresas.add(this.tipoactivofijoempresaAux);
		}
		//ARCHITECTURE
		
		this.tipoactivofijoempresa=this.tipoactivofijoempresaAux;
		
		if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
		}
				
		//this.setDefaultControlesTipoActivoFijoEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoActivoFijoEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoActivoFijoEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijoEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresaBean,this.tipoactivofijoempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoActivoFijoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoActivoFijoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.procesarEventosTipoActivoFijoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this.tipoactivofijoempresa,this.tipoactivofijoempresaParameterGeneral,this.isEsNuevoTipoActivoFijoEmpresa,classes);//this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral,this.tipoactivofijoempresaBean,false);
		
		if(this.tipoactivofijoempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa());
		}
		
		if(this.tipoactivofijoempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa(),classes);//this.tipoactivofijoempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoActivoFijoEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoActivoFijoEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoActivoFijoEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
						
			if(tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoActivoFijoEmpresa();
			
			this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijoEmpresa(), this.getIndiceNuevoTipoActivoFijoEmpresa());
			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoActivoFijoEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setEnabled(isHabilitar && this.tipoactivofijoempresaConstantesFunciones.activarcodigoTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setEnabled(isHabilitar && this.tipoactivofijoempresaConstantesFunciones.activarnombreTipoActivoFijoEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setEnabled(isHabilitar && this.tipoactivofijoempresaConstantesFunciones.activarid_empresaTipoActivoFijoEmpresa);
	};
	
	public void setDefaultControlesTipoActivoFijoEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoActivoFijoEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipoactivofijoempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setVisible(true);
			
					
		} else {
			//this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipoactivofijoempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoActivoFijoEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				if(tipoactivofijoempresaAux.getId().equals(this.iIdNuevoTipoActivoFijoEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresas) {
				if(tipoactivofijoempresaAux.getId().equals(this.iIdNuevoTipoActivoFijoEmpresa)) {
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
	
	public int getIndiceActualTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				if(tipoactivofijoempresaAux.getId().equals(tipoactivofijoempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresas) {
				if(tipoactivofijoempresaAux.getId().equals(tipoactivofijoempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				if(tipoactivofijoempresaAux.getTipoActivoFijoEmpresaOriginal().getId().equals(tipoactivofijoempresaOriginal.getId())) {
					existe=true;
					tipoactivofijoempresaOriginal.setId(tipoactivofijoempresaAux.getId());
					tipoactivofijoempresaOriginal.setVersionRow(tipoactivofijoempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresas) {
				if(tipoactivofijoempresaAux.getTipoActivoFijoEmpresaOriginal().getId().equals(tipoactivofijoempresaOriginal.getId())) {
					existe=true;
					tipoactivofijoempresaOriginal.setId(tipoactivofijoempresaAux.getId());
					tipoactivofijoempresaOriginal.setVersionRow(tipoactivofijoempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoActivoFijoEmpresa(Boolean esParaCancelar) throws Exception {
		tipoactivofijoempresasAux=new ArrayList<TipoActivoFijoEmpresa>();
		tipoactivofijoempresaAux=new TipoActivoFijoEmpresa();
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
					if(tipoactivofijoempresaAux.getId()<0) {
						tipoactivofijoempresasAux.add(tipoactivofijoempresaAux);
					}		
				}
				this.iIdNuevoTipoActivoFijoEmpresa=0L;
				this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().removeAll(tipoactivofijoempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresas) {
					if(tipoactivofijoempresaAux.getId()<0) {
						tipoactivofijoempresasAux.add(tipoactivofijoempresaAux);
					}		
				}
				this.iIdNuevoTipoActivoFijoEmpresa=0L;
				this.tipoactivofijoempresas.removeAll(tipoactivofijoempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoActivoFijoEmpresa 
					&& this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()>0
					) {
					tipoactivofijoempresaAux=this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().get(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size() - 1);
				
					if(tipoactivofijoempresaAux.getId()<0) {
						this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().remove(tipoactivofijoempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoActivoFijoEmpresa && this.tipoactivofijoempresas.size()>0) {
					tipoactivofijoempresaAux=this.tipoactivofijoempresas.get(this.tipoactivofijoempresas.size() - 1);
				
					if(tipoactivofijoempresaAux.getId()<0) {
						this.tipoactivofijoempresas.remove(tipoactivofijoempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoActivoFijoEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoactivofijoempresa.getId()<0) {
				this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().remove(this.tipoactivofijoempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoactivofijoempresa.getId()<0) {
				this.tipoactivofijoempresas.remove(this.tipoactivofijoempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoActivoFijoEmpresa(List<TipoActivoFijoEmpresa> tipoactivofijoempresasAux) throws Exception {
		TipoActivoFijoEmpresaConstantesFunciones.setEstadosInicialesTipoActivoFijoEmpresa(tipoactivofijoempresasAux);
	}
	
	public void setEstadosInicialesTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresaAux) throws Exception {
		TipoActivoFijoEmpresaConstantesFunciones.setEstadosInicialesTipoActivoFijoEmpresa(tipoactivofijoempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoActivoFijoEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoActivoFijoEmpresaActual()) {
				if(!this.isEsNuevoTipoActivoFijoEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoActivoFijoEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoActivoFijoEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Activo Fijo Empresa ?", "MANTENIMIENTO DE Tipo Activo Fijo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoActivoFijoEmpresa tipoactivofijoempresa) throws Exception {
		TipoActivoFijoEmpresaConstantesFunciones.seleccionarAsignar(this.tipoactivofijoempresa,tipoactivofijoempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoActivoFijoEmpresa=this.isPermisoActualizarOriginalTipoActivoFijoEmpresa;
			
			
			this.seleccionarAsignar(tipoactivofijoempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoActivoFijoEmpresaConstantesFunciones.quitarEspaciosTipoActivoFijoEmpresa(this.tipoactivofijoempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoactivofijoempresaSessionBean.setsFuncionBusquedaRapida(this.tipoactivofijoempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoActivoFijoEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoActivoFijoEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoActivoFijoEmpresa(esParaCancelar);								
			}
			
			this.tipoactivofijoempresa=new TipoActivoFijoEmpresa();
			
			this.inicializarTipoActivoFijoEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoActivoFijoEmpresa() throws Exception {
		try {
			TipoActivoFijoEmpresaConstantesFunciones.inicializarTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoActivoFijoEmpresas(String sAccionBusqueda,List<TipoActivoFijoEmpresa> tipoactivofijoempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoActivoFijoEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoActivoFijoEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoActivoFijoEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoActivoFijoEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Activo Fijo Empresas");		
		parameters.put("busquedapor", TipoActivoFijoEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoActivoFijoEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoActivoFijoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoActivoFijoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoActivoFijoEmpresa=new JRBeanArrayDataSource(TipoActivoFijoEmpresaJInternalFrame.TraerTipoActivoFijoEmpresaBeans(tipoactivofijoempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoActivoFijoEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoActivoFijoEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoActivoFijoEmpresaBean.TraerTipoActivoFijoEmpresaBeans(tipoactivofijoempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoActivoFijoEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijoempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoActivoFijoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijoEmpresa> tipoactivofijoempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijoEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoActivoFijoEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoActivoFijoEmpresa tipoactivofijoempresa : tipoactivofijoempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoActivoFijoEmpresaConstantesFunciones.generarExcelReporteDataTipoActivoFijoEmpresa("NORMAL",row,workbook,tipoactivofijoempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoActivoFijoEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoActivoFijoEmpresaConstantesFunciones.generarExcelReporteHeaderTipoActivoFijoEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoActivoFijoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijoEmpresa> tipoactivofijoempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijoEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoActivoFijoEmpresa tipoactivofijoempresa : tipoactivofijoempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.getTipoActivoFijoEmpresaDescripcion(tipoactivofijoempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoactivofijoempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoactivofijoempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoactivofijoempresa.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoActivoFijoEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijoEmpresa> tipoactivofijoempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoActivoFijoEmpresa> tipoactivofijoempresasRespaldo=null;
		
		classes=TipoActivoFijoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoActivoFijoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoactivofijoempresaLogic.setDatosCliente(this.datosCliente);
		this.tipoactivofijoempresaLogic.setDatosDeep(this.datosDeep);
		this.tipoactivofijoempresaLogic.setIsConDeep(true);
		
		tipoactivofijoempresasRespaldo=this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas();
		
		this.tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(tipoactivofijoempresasParaReportes);	
		this.tipoactivofijoempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoactivofijoempresasParaReportes=this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas();
		this.tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(tipoactivofijoempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijoEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoActivoFijoEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoActivoFijoEmpresa tipoactivofijoempresa : tipoactivofijoempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoActivoFijoEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoActivoFijoEmpresaConstantesFunciones.generarExcelReporteDataTipoActivoFijoEmpresa("NORMAL",row,workbook,tipoactivofijoempresa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.getTipoActivoFijoEmpresaDescripcion(tipoactivofijoempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoActivoFijoEmpresa() throws Exception {		
		this.startProcessTipoActivoFijoEmpresa(true);
	}
	
	public void startProcessTipoActivoFijoEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoActivoFijoEmpresa ,this.jPanelParametrosReportesTipoActivoFijoEmpresa, this.jScrollPanelDatosTipoActivoFijoEmpresa,this.jPanelPaginacionTipoActivoFijoEmpresa, this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa, this.jPanelAccionesTipoActivoFijoEmpresa,this.jPanelAccionesFormularioTipoActivoFijoEmpresa,this.jmenuBarTipoActivoFijoEmpresa,this.jmenuBarDetalleTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoActivoFijoEmpresa=this.jTabbedPaneBusquedasTipoActivoFijoEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoActivoFijoEmpresa=this.jPanelParametrosReportesTipoActivoFijoEmpresa;
		//final JScrollPane jScrollPanelDatosTipoActivoFijoEmpresa=this.jScrollPanelDatosTipoActivoFijoEmpresa;
		final JTable jTableDatosTipoActivoFijoEmpresa=this.jTableDatosTipoActivoFijoEmpresa;		
		final JPanel jPanelPaginacionTipoActivoFijoEmpresa=this.jPanelPaginacionTipoActivoFijoEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoActivoFijoEmpresa=this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa;
		final JPanel jPanelAccionesTipoActivoFijoEmpresa=this.jPanelAccionesTipoActivoFijoEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoActivoFijoEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			jPanelCamposAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelCamposTipoActivoFijoEmpresa;
			jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelAccionesFormularioTipoActivoFijoEmpresa;
		}
		
		final JPanel jPanelCamposTipoActivoFijoEmpresa=jPanelCamposAuxiliarTipoActivoFijoEmpresa;
		final JPanel jPanelAccionesFormularioTipoActivoFijoEmpresa=jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa;
		
		
		final JMenuBar jmenuBarTipoActivoFijoEmpresa=this.jmenuBarTipoActivoFijoEmpresa;
		final JToolBar jTtoolBarTipoActivoFijoEmpresa=this.jTtoolBarTipoActivoFijoEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jmenuBarDetalleTipoActivoFijoEmpresa;
			jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTtoolBarDetalleTipoActivoFijoEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoActivoFijoEmpresa=jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa;
		final JToolBar jTtoolBarDetalleTipoActivoFijoEmpresa=jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoActivoFijoEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoActivoFijoEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoActivoFijoEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoActivoFijoEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoActivoFijoEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoActivoFijoEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoActivoFijoEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoActivoFijoEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoActivoFijoEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoActivoFijoEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoActivoFijoEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoActivoFijoEmpresa ,jPanelParametrosReportesTipoActivoFijoEmpresa,jTableDatosTipoActivoFijoEmpresa, /*jScrollPanelDatosTipoActivoFijoEmpresa,*/jPanelCamposTipoActivoFijoEmpresa,jPanelPaginacionTipoActivoFijoEmpresa, /*jScrollPanelDatosEdicionTipoActivoFijoEmpresa,*/ jPanelAccionesTipoActivoFijoEmpresa,jPanelAccionesFormularioTipoActivoFijoEmpresa,jmenuBarTipoActivoFijoEmpresa,jmenuBarDetalleTipoActivoFijoEmpresa,jTtoolBarTipoActivoFijoEmpresa,jTtoolBarDetalleTipoActivoFijoEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoActivoFijoEmpresa ,jPanelParametrosReportesTipoActivoFijoEmpresa, jScrollPanelDatosTipoActivoFijoEmpresa,jPanelPaginacionTipoActivoFijoEmpresa, jScrollPanelDatosEdicionTipoActivoFijoEmpresa, jPanelAccionesTipoActivoFijoEmpresa,jPanelAccionesFormularioTipoActivoFijoEmpresa,jmenuBarTipoActivoFijoEmpresa,jmenuBarDetalleTipoActivoFijoEmpresa,jTtoolBarTipoActivoFijoEmpresa,jTtoolBarDetalleTipoActivoFijoEmpresa);
						
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
	
	public void finishProcessTipoActivoFijoEmpresa() {// throws Exception 
		this.finishProcessTipoActivoFijoEmpresa(true);
	}
	
	public void finishProcessTipoActivoFijoEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoActivoFijoEmpresa ,this.jPanelParametrosReportesTipoActivoFijoEmpresa, this.jScrollPanelDatosTipoActivoFijoEmpresa,this.jPanelPaginacionTipoActivoFijoEmpresa, this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa, this.jPanelAccionesTipoActivoFijoEmpresa,this.jPanelAccionesFormularioTipoActivoFijoEmpresa,this.jmenuBarTipoActivoFijoEmpresa,this.jmenuBarDetalleTipoActivoFijoEmpresa,this.jTtoolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoActivoFijoEmpresa=this.jTabbedPaneBusquedasTipoActivoFijoEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoActivoFijoEmpresa=this.jPanelParametrosReportesTipoActivoFijoEmpresa;
		//final JScrollPane jScrollPanelDatosTipoActivoFijoEmpresa=this.jScrollPanelDatosTipoActivoFijoEmpresa;
		final JTable jTableDatosTipoActivoFijoEmpresa=this.jTableDatosTipoActivoFijoEmpresa;		
		final JPanel jPanelPaginacionTipoActivoFijoEmpresa=this.jPanelPaginacionTipoActivoFijoEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoActivoFijoEmpresa=this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa;
		final JPanel jPanelAccionesTipoActivoFijoEmpresa=this.jPanelAccionesTipoActivoFijoEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoActivoFijoEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			jPanelCamposAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelCamposTipoActivoFijoEmpresa;
			jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelAccionesFormularioTipoActivoFijoEmpresa;
		}
		
		final JPanel jPanelCamposTipoActivoFijoEmpresa=jPanelCamposAuxiliarTipoActivoFijoEmpresa;
		final JPanel jPanelAccionesFormularioTipoActivoFijoEmpresa=jPanelAccionesFormularioAuxiliarTipoActivoFijoEmpresa;
		
		
		final JMenuBar jmenuBarTipoActivoFijoEmpresa=this.jmenuBarTipoActivoFijoEmpresa;		
		final JToolBar jTtoolBarTipoActivoFijoEmpresa=this.jTtoolBarTipoActivoFijoEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jmenuBarDetalleTipoActivoFijoEmpresa;
			jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTtoolBarDetalleTipoActivoFijoEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoActivoFijoEmpresa=jmenuBarDetalleAuxiliarTipoActivoFijoEmpresa;
		final JToolBar jTtoolBarDetalleTipoActivoFijoEmpresa=jTtoolBarDetalleAuxiliarTipoActivoFijoEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoActivoFijoEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoActivoFijoEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoActivoFijoEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoActivoFijoEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoActivoFijoEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoActivoFijoEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoActivoFijoEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoActivoFijoEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoActivoFijoEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoActivoFijoEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoActivoFijoEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoActivoFijoEmpresa ,jPanelParametrosReportesTipoActivoFijoEmpresa, jTableDatosTipoActivoFijoEmpresa,/*jScrollPanelDatosTipoActivoFijoEmpresa,*/jPanelCamposTipoActivoFijoEmpresa,jPanelPaginacionTipoActivoFijoEmpresa, /*jScrollPanelDatosEdicionTipoActivoFijoEmpresa,*/ jPanelAccionesTipoActivoFijoEmpresa,jPanelAccionesFormularioTipoActivoFijoEmpresa,jmenuBarTipoActivoFijoEmpresa,jmenuBarDetalleTipoActivoFijoEmpresa,jTtoolBarTipoActivoFijoEmpresa,jTtoolBarDetalleTipoActivoFijoEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoActivoFijoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoActivoFijoEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoActivoFijoEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoActivoFijoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoActivoFijoEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoActivoFijoEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoActivoFijoEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoActivoFijoEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoActivoFijoEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoactivofijoempresaConstantesFunciones.getsFinalQueryTipoActivoFijoEmpresa();
		String  finalQueryPaginacionTodos=this.tipoactivofijoempresaConstantesFunciones.getsFinalQueryTipoActivoFijoEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoActivoFijoEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoActivoFijoEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoActivoFijoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoActivoFijoEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoActivoFijoEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoactivofijoempresasEliminados= new ArrayList<TipoActivoFijoEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoActivoFijoEmpresa();
		
				///*TipoActivoFijoEmpresaSessionBean*/this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
			
			if(this.tipoactivofijoempresaSessionBean==null) {
				this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoActivoFijoEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoActivoFijoEmpresaConstantesFunciones.getClassesForeignKeysOfTipoActivoFijoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoactivofijoempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoactivofijoempresasAux= new ArrayList<TipoActivoFijoEmpresa>();
			
				
			tipoactivofijoempresaLogic.setDatosCliente(this.datosCliente);
			tipoactivofijoempresaLogic.setDatosDeep(this.datosDeep);
			tipoactivofijoempresaLogic.setIsConDeep(true);
			
			
			tipoactivofijoempresaLogic.getTipoActivoFijoEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoactivofijoempresaLogic.getTodosTipoActivoFijoEmpresas(finalQueryGlobal,pagination);
					
					//tipoactivofijoempresaLogic.getTodosTipoActivoFijoEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()==null|| tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijoempresasAux= new ArrayList<TipoActivoFijoEmpresa>();
							tipoactivofijoempresasAux.addAll(tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoempresasAux= new ArrayList<TipoActivoFijoEmpresa>();
							tipoactivofijoempresasAux.addAll(tipoactivofijoempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijoempresaLogic.getTodosTipoActivoFijoEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipoactivofijoempresaLogic.getTodosTipoActivoFijoEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(new ArrayList<TipoActivoFijoEmpresa>());					
							tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().addAll(tipoactivofijoempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoempresas=new ArrayList<TipoActivoFijoEmpresa>();
							tipoactivofijoempresas.addAll(tipoactivofijoempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoActivoFijoEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoActivoFijoEmpresa=this.idActual;
				
				} else if(this.idTipoActivoFijoEmpresaActual!=null && this.idTipoActivoFijoEmpresaActual!=0L) {
					idTipoActivoFijoEmpresa=idTipoActivoFijoEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoActivoFijoEmpresa);
				
				this.tipoactivofijoempresas=new ArrayList<TipoActivoFijoEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoactivofijoempresaLogic.getEntity(idTipoActivoFijoEmpresa);
					
					//tipoactivofijoempresaLogic.getEntityWithConnection(idTipoActivoFijoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(new ArrayList<TipoActivoFijoEmpresa>());
					tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(tipoactivofijoempresaLogic.getTipoActivoFijoEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijoempresas=new ArrayList<TipoActivoFijoEmpresa>();
					this.tipoactivofijoempresas.add(tipoactivofijoempresa);
				}
				
				if(tipoactivofijoempresaLogic.getTipoActivoFijoEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoactivofijoempresaLogic.getTipoActivoFijoEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()==null||tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoactivofijoempresas==null|| tipoactivofijoempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresasAux=new ArrayList<TipoActivoFijoEmpresa>();
						tipoactivofijoempresasAux.addAll(tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoempresasAux=new ArrayList<TipoActivoFijoEmpresa>();
							tipoactivofijoempresasAux.addAll(tipoactivofijoempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoactivofijoempresaLogic.getTipoActivoFijoEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoActivoFijoEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoActivoFijoEmpresas("FK_IdEmpresa",tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoActivoFijoEmpresas("FK_IdEmpresa",tipoactivofijoempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(new ArrayList<TipoActivoFijoEmpresa>());
						tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().addAll(tipoactivofijoempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoempresas=new ArrayList<TipoActivoFijoEmpresa>();
							tipoactivofijoempresas.addAll(tipoactivofijoempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoActivoFijoEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoActivoFijoEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijoempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijoempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoActivoFijoEmpresa tipoactivofijoempresa) {
		Boolean permite=true;
		
		if(this.tipoactivofijoempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoActivoFijoEmpresaConstantesFunciones.getOrderByListaTipoActivoFijoEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoActivoFijoEmpresaConstantesFunciones.getOrderByListaTipoActivoFijoEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				if(tipoactivofijoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoempresaTotales=tipoactivofijoempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresa:this.tipoactivofijoempresas) {
				if(tipoactivofijoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoempresaTotales=tipoactivofijoempresa;
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
			this.tipoactivofijoempresaAux=new TipoActivoFijoEmpresa();
			this.tipoactivofijoempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipoactivofijoempresaAux.setIsNew(false);
			this.tipoactivofijoempresaAux.setIsChanged(false);
			this.tipoactivofijoempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoActivoFijoEmpresaConstantesFunciones.TotalizarValoresFilaTipoActivoFijoEmpresa(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this.tipoactivofijoempresaAux);
				
				this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(this.tipoactivofijoempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoActivoFijoEmpresaConstantesFunciones.TotalizarValoresFilaTipoActivoFijoEmpresa(this.tipoactivofijoempresas,this.tipoactivofijoempresaAux);
				
				this.tipoactivofijoempresas.add(this.tipoactivofijoempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoactivofijoempresaTotales=new TipoActivoFijoEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().remove(tipoactivofijoempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoactivofijoempresas.remove(tipoactivofijoempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoactivofijoempresaTotales=new TipoActivoFijoEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				if(tipoactivofijoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoempresaTotales=tipoactivofijoempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoActivoFijoEmpresaConstantesFunciones.TotalizarValoresFilaTipoActivoFijoEmpresa(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),tipoactivofijoempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijoEmpresa tipoactivofijoempresa:this.tipoactivofijoempresas) {
				if(tipoactivofijoempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoempresaTotales=tipoactivofijoempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoActivoFijoEmpresaConstantesFunciones.TotalizarValoresFilaTipoActivoFijoEmpresa(this.tipoactivofijoempresas,tipoactivofijoempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoActivoFijoEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoActivoFijoEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoempresaLogic.getTipoActivoFijoEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosTipoActivoFijoEmpresa() {
		this.isPermisoTodoTipoActivoFijoEmpresa=false;
		this.isPermisoNuevoTipoActivoFijoEmpresa=false;
		this.isPermisoActualizarTipoActivoFijoEmpresa=false;
		this.isPermisoActualizarOriginalTipoActivoFijoEmpresa=false;
		this.isPermisoEliminarTipoActivoFijoEmpresa=false;
		this.isPermisoGuardarCambiosTipoActivoFijoEmpresa=false;
		this.isPermisoConsultaTipoActivoFijoEmpresa=false;
		this.isPermisoBusquedaTipoActivoFijoEmpresa=false;
		this.isPermisoReporteTipoActivoFijoEmpresa=false;		
		this.isPermisoOrdenTipoActivoFijoEmpresa=false;		
		this.isPermisoPaginacionMedioTipoActivoFijoEmpresa=false;		
		this.isPermisoPaginacionAltoTipoActivoFijoEmpresa=false;
		this.isPermisoPaginacionTodoTipoActivoFijoEmpresa=false;
		this.isPermisoCopiarTipoActivoFijoEmpresa=false;		
		this.isPermisoVerFormTipoActivoFijoEmpresa=false;		
		this.isPermisoDuplicarTipoActivoFijoEmpresa=false;		
		this.isPermisoOrdenTipoActivoFijoEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoActivoFijoEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoNuevoTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoActualizarTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoEliminarTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoConsultaTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoBusquedaTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoReporteTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoOrdenTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoCopiarTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoVerFormTipoActivoFijoEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoOrdenTipoActivoFijoEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoActivoFijoEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoNuevoTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoActualizarTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoEliminarTipoActivoFijoEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoActivoFijoEmpresa=isPermiso;
		//this.isPermisoConsultaTipoActivoFijoEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoActivoFijoEmpresa=isPermiso;
		//this.isPermisoReporteTipoActivoFijoEmpresa=isPermiso;
		//this.isPermisoOrdenTipoActivoFijoEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoActivoFijoEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoActivoFijoEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoActivoFijoEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoActivoFijoEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoActivoFijoEmpresa=isPermiso;
		//this.isPermisoOrdenTipoActivoFijoEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoActivoFijoEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoActivoFijoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoActivoFijoEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoActivoFijoEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoActivoFijoEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoActivoFijoEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoActivoFijoEmpresaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoActivoFijoEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoActivoFijoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoActivoFijoEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoActivoFijoEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoActivoFijoEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoActivoFijoEmpresa=this.isPermisoActualizarTipoActivoFijoEmpresa;
			this.isPermisoEliminarTipoActivoFijoEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoActivoFijoEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoActivoFijoEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoActivoFijoEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoActivoFijoEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoActivoFijoEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoActivoFijoEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoActivoFijoEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoActivoFijoEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoActivoFijoEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoActivoFijoEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoActivoFijoEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoActivoFijoEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoActivoFijoEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoActivoFijoEmpresa.setToolTipText(this.jTableDatosTipoActivoFijoEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoActivoFijoEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoActivoFijoEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoActivoFijoEmpresa() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoActivoFijoEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoActivoFijoEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoActivoFijoEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoActivoFijoEmpresaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoActivoFijoEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaReturnGeneral=new TipoActivoFijoEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoactivofijoempresaConstantesFunciones.cargarid_empresaTipoActivoFijoEmpresa)
					 || (this.esRecargarFks && this.tipoactivofijoempresaConstantesFunciones.cargarid_empresaTipoActivoFijoEmpresa)) {

					if(!this.tipoactivofijoempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoactivofijoempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.cargarCombosLoteForeignKeyTipoActivoFijoEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoactivofijoempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoActivoFijoEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoactivofijoempresaSessionBean==null) {
				this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
			}

			if(!this.tipoactivofijoempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoActivoFijoEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoActivoFijoEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoActivoFijoEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijoEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoActivoFijoEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijoEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoActivoFijoEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoActivoFijoEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoActivoFijoEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoActivoFijoEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoActivoFijoEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoActivoFijoEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa!=null && this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoActivoFijoEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoActivoFijoEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoActivoFijoEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean(); 
		this.tipoactivofijoempresaConstantesFunciones=new TipoActivoFijoEmpresaConstantesFunciones(); 
		this.tipoactivofijoempresaBean=new TipoActivoFijoEmpresa();//(this.tipoactivofijoempresaConstantesFunciones); 		
		this.tipoactivofijoempresaReturnGeneral=new TipoActivoFijoEmpresaParameterReturnGeneral(); 
		
		this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoActivoFijoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoActivoFijoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoActivoFijoEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoActivoFijoEmpresa(true);
			
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
			
			this.tipoactivofijoempresaConstantesFunciones=new TipoActivoFijoEmpresaConstantesFunciones(); 
			this.tipoactivofijoempresaBean=new TipoActivoFijoEmpresa();//this.tipoactivofijoempresaConstantesFunciones); 			
			this.tipoactivofijoempresaReturnGeneral=new TipoActivoFijoEmpresaParameterReturnGeneral(); 
		
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Activo Fijo Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoactivofijoempresa=new TipoActivoFijoEmpresa();
			this.tipoactivofijoempresas = new ArrayList<TipoActivoFijoEmpresa>();
			this.tipoactivofijoempresasAux = new ArrayList<TipoActivoFijoEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic=new TipoActivoFijoEmpresaLogic();
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoactivofijoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoActivoFijoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoActivoFijoEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoActivoFijoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoActivoFijoEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa);
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa);
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoActivoFijoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoActivoFijoEmpresa);
					this.jInternalFrameImportacionTipoActivoFijoEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoActivoFijoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoActivoFijoEmpresa);
					this.jInternalFrameOrderByTipoActivoFijoEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoActivoFijoEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoActivoFijoEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoActivoFijoEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoactivofijoempresaReturnGeneral=new TipoActivoFijoEmpresaParameterReturnGeneral();
			
			this.tipoactivofijoempresaParameterGeneral=new TipoActivoFijoEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoactivofijoempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoActivoFijoEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado(),this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoActivoFijoEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado(),this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoActivoFijoEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoActivoFijoEmpresa(false);
			
			this.setPermisosUsuarioTipoActivoFijoEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() && this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoActivoFijoEmpresaClasesRelacionadas();
			}
			
			if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoActivoFijoEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoActivoFijoEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoActivoFijoEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoActivoFijoEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoActivoFijoEmpresa,this.isPermisoPaginacionMedioTipoActivoFijoEmpresa,this.isPermisoPaginacionTodoTipoActivoFijoEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoActivoFijoEmpresaConstantesFunciones.getTiposSeleccionarTipoActivoFijoEmpresa());
				
				this.tiposColumnasSelect=TipoActivoFijoEmpresaConstantesFunciones.getTiposSeleccionarTipoActivoFijoEmpresa(true);
				
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
			//if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoActivoFijoEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoActivoFijoEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoActivoFijoEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijoEmpresa() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoactivofijoempresaImplementable= (TipoActivoFijoEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoActivoFijoEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoactivofijoempresaImplementableHome= (TipoActivoFijoEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoActivoFijoEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoactivofijoempresas= new ArrayList<TipoActivoFijoEmpresa>();
			this.tipoactivofijoempresasEliminados= new ArrayList<TipoActivoFijoEmpresa>();
						
			this.isEsNuevoTipoActivoFijoEmpresa=false;
			this.esParaAccionDesdeFormularioTipoActivoFijoEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoActivoFijoEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoActivoFijoEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoActivoFijoEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoActivoFijoEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoActivoFijoEmpresa();
			}
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoActivoFijoEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoActivoFijoEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoActivoFijoEmpresa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoActivoFijoEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoActivoFijoEmpresa();	
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
	
	public void cargarCombosForeignKeyTipoActivoFijoEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoActivoFijoEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoActivoFijoEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoActivoFijoEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoActivoFijoEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoActivoFijoEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoActivoFijoEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoActivoFijoEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoActivoFijoEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			
			if(jTableDatosTipoActivoFijoEmpresa.getRowCount()>=1) {
				jTableDatosTipoActivoFijoEmpresa.removeRowSelectionInterval(0, jTableDatosTipoActivoFijoEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoActivoFijoEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoActivoFijoEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(true);			
			//this.tipoactivofijoempresa=new TipoActivoFijoEmpresa();
			//this.tipoactivofijoempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa() ;
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijoEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoactivofijoempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);				
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoActivoFijoEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRows().length;			
			}
			
			tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoActivoFijoEmpresa--;			
				//TipoActivoFijoEmpresa tipoactivofijoempresaAux= new TipoActivoFijoEmpresa();			
				//tipoactivofijoempresaAux.setId(this.iIdNuevoTipoActivoFijoEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoActivoFijoEmpresa tipoactivofijoempresaOrigen=new TipoActivoFijoEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoActivoFijoEmpresa tipoactivofijoempresaOrigen : tipoactivofijoempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoactivofijoempresaOrigen =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoempresaOrigen =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoActivoFijoEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoactivofijoempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoActivoFijoEmpresa(tipoactivofijoempresaOrigen,this.tipoactivofijoempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(this.tipoactivofijoempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresas.add(this.tipoactivofijoempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
				
				this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijoEmpresa(), this.getIndiceNuevoTipoActivoFijoEmpresa());
				
				int iLastRow =  this.jTableDatosTipoActivoFijoEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoActivoFijoEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoActivoFijoEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();									
		
			TipoActivoFijoEmpresa tipoactivofijoempresaOrigen=new TipoActivoFijoEmpresa();
			TipoActivoFijoEmpresa tipoactivofijoempresaDestino=new TipoActivoFijoEmpresa();
				
			tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoactivofijoempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoActivoFijoEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaOrigen =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoactivofijoempresaOrigen =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoempresaDestino =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoactivofijoempresaDestino =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoactivofijoempresaOrigen =tipoactivofijoempresasSeleccionados.get(0);
				tipoactivofijoempresaDestino =tipoactivofijoempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoActivoFijoEmpresa(tipoactivofijoempresaOrigen,tipoactivofijoempresaDestino,true,false);
				
				tipoactivofijoempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoactivofijoempresaDestino,tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoempresaDestino,tipoactivofijoempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
				
				//this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijoEmpresa(), this.getIndiceNuevoTipoActivoFijoEmpresa());
				
				int iLastRow =  this.jTableDatosTipoActivoFijoEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoActivoFijoEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoActivoFijoEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoActivoFijoEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoActivoFijoEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoActivoFijoEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoActivoFijoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoActivoFijoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoActivoFijoEmpresa();
			
			this.abrirFrameOrderByTipoActivoFijoEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoActivoFijoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoActivoFijoEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoActivoFijoEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSize(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jContentPaneDetalleTipoActivoFijoEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jContentPaneDetalleTipoActivoFijoEmpresa.getWidth(),TipoActivoFijoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jContentPaneDetalleTipoActivoFijoEmpresa.getWidth(),TipoActivoFijoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jContentPaneDetalleTipoActivoFijoEmpresa.getWidth(),TipoActivoFijoEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoActivoFijoEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoActivoFijoEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoActivoFijoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijoEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoActivoFijoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijoEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoActivoFijoEmpresa);
				this.jInternalFrameOrderByTipoActivoFijoEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoActivoFijoEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoActivoFijoEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoActivoFijoEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoActivoFijoEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoActivoFijoEmpresa==null) {
				
				this.jInternalFrameImportacionTipoActivoFijoEmpresa=new ImportacionJInternalFrame(TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoActivoFijoEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoActivoFijoEmpresa);
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoActivoFijoEmpresa"));
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoActivoFijoEmpresa"));
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoActivoFijoEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoActivoFijoEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa=new ReporteDinamicoJInternalFrame(TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa);
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijoEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijoEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoActivoFijoEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoActivoFijoEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoActivoFijoEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoActivoFijoEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoActivoFijoEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoActivoFijoEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoActivoFijoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoActivoFijoEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoActivoFijoEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoActivoFijoEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoActivoFijoEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoActivoFijoEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoActivoFijoEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoActivoFijoEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoActivoFijoEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoActivoFijoEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(true);
			//this.isEsNuevoTipoActivoFijoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false) ;
			
			if(tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijoEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoActivoFijoEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoActivoFijoEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(true);
			//this.isEsNuevoTipoActivoFijoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoactivofijoempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false) ;
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijoEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoActivoFijoEmpresa(false);
			
			//if(!this.isEsNuevoTipoActivoFijoEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipoactivofijoempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoActivoFijoEmpresa=true;
					this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
					this.isEsNuevoTipoActivoFijoEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoActivoFijoEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoActivoFijoEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(false);
			
												
				
				if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoActivoFijoEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,tipoactivofijoempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoactivofijoempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoactivofijoempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipoactivofijoempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipoactivofijoempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoactivofijoempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoActivoFijoEmpresaModel) this.jTableDatosTipoActivoFijoEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoActivoFijoEmpresa=true;
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
				this.isEsNuevoTipoActivoFijoEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(false);
				
				
				
				if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoActivoFijoEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoActivoFijoEmpresa.getRowCount()>=1) {
				jTableDatosTipoActivoFijoEmpresa.removeRowSelectionInterval(0, jTableDatosTipoActivoFijoEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoActivoFijoEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(false) ;
			
			this.isEsNuevoTipoActivoFijoEmpresa=false;
			
			if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoActivoFijoEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
				
				//SI ES MANUAL
				if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoActivoFijoEmpresa--;			
			//TipoActivoFijoEmpresa tipoactivofijoempresaAux= new TipoActivoFijoEmpresa();			
			//tipoactivofijoempresaAux.setId(this.iIdNuevoTipoActivoFijoEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoActivoFijoEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
			
			this.tipoactivofijoempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().add(this.tipoactivofijoempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoactivofijoempresas.add(this.tipoactivofijoempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			
			this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijoEmpresa(), this.getIndiceNuevoTipoActivoFijoEmpresa());
			
			int iLastRow =  this.jTableDatosTipoActivoFijoEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoActivoFijoEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoActivoFijoEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();
			}
			
			//this.abrirFrameTreeTipoActivoFijoEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Activo Fijo EmpresaS ?", "MANTENIMIENTO DE Tipo Activo Fijo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoActivoFijoEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoActivoFijoEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.procesarImportacionTipoActivoFijoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoactivofijoempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoActivoFijoEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoActivoFijoEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoActivoFijoEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoActivoFijoEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		

		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoActivoFijoEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoActivoFijoEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoActivoFijoEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoactivofijoempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoactivofijoempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoActivoFijoEmpresa tipoactivofijoempresa:tipoactivofijoempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoactivofijoempresa.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoActivoFijoEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoActivoFijoEmpresa(tipoactivofijoempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoActivoFijoEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoActivoFijoEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoActivoFijoEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoActivoFijoEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoActivoFijoEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoActivoFijoEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoActivoFijoEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoActivoFijoEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoActivoFijoEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoActivoFijoEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoActivoFijoEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoActivoFijoEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoActivoFijoEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijoEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoActivoFijoEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoActivoFijoEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoActivoFijoEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijoEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijoEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijoEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoActivoFijoEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoActivoFijoEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijoEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijoEmpresa() throws Exception {
		try	{
			if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoActivoFijoEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoActivoFijoEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoActivoFijoEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoActivoFijoEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijoEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijoEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoActivoFijoEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoActivoFijoEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoActivoFijoEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoActivoFijoEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoActivoFijoEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoActivoFijoEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoActivoFijoEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoactivofijoempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoActivoFijoEmpresa.setModel(new TipoActivoFijoEmpresaModel(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoActivoFijoEmpresa.setModel(new TipoActivoFijoEmpresaModel(this.tipoactivofijoempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoActivoFijoEmpresa!=null && this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoActivoFijoEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,tipoactivofijoempresaConstantesFunciones.resaltarSeleccionarTipoActivoFijoEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO,tipoactivofijoempresaConstantesFunciones.resaltarSeleccionarTipoActivoFijoEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipoactivofijoempresaConstantesFunciones.mostraridTipoActivoFijoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltaridTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activaridTipoActivoFijoEmpresa,this,true,"idTipoActivoFijoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltaridTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activaridTipoActivoFijoEmpresa,this,true,"idTipoActivoFijoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoactivofijoempresaConstantesFunciones.mostrarid_empresaTipoActivoFijoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoactivofijoempresaConstantesFunciones.resaltarid_empresaTipoActivoFijoEmpresa,this,this.tipoactivofijoempresaConstantesFunciones.activarid_empresaTipoActivoFijoEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoactivofijoempresaConstantesFunciones.resaltarid_empresaTipoActivoFijoEmpresa,this,this.tipoactivofijoempresaConstantesFunciones.activarid_empresaTipoActivoFijoEmpresa,false,"id_empresaTipoActivoFijoEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoactivofijoempresaConstantesFunciones.mostrarcodigoTipoActivoFijoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltarcodigoTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activarcodigoTipoActivoFijoEmpresa,this,true,"codigoTipoActivoFijoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltarcodigoTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activarcodigoTipoActivoFijoEmpresa,this,true,"codigoTipoActivoFijoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoactivofijoempresaConstantesFunciones.mostrarnombreTipoActivoFijoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltarnombreTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activarnombreTipoActivoFijoEmpresa,this,true,"nombreTipoActivoFijoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoactivofijoempresaConstantesFunciones.resaltarnombreTipoActivoFijoEmpresa,this.tipoactivofijoempresaConstantesFunciones.activarnombreTipoActivoFijoEmpresa,this,true,"nombreTipoActivoFijoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoActivoFijoEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoActivoFijoEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoActivoFijoEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoActivoFijoEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoActivoFijoEmpresa.moveColumn(this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoActivoFijoEmpresa.moveColumn(this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoActivoFijoEmpresa.moveColumn(this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoActivoFijoEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoActivoFijoEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoActivoFijoEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoActivoFijoEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoActivoFijoEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoActivoFijoEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoactivofijoempresas.size()-1;
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
		//this.jTableDatosTipoActivoFijoEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoActivoFijoEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoActivoFijoEmpresa();
			
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
				
				//this.isEsNuevoTipoActivoFijoEmpresa=false;
					
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
				if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoActivoFijoEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoactivofijoempresa.getsType().equals("DUPLICADO")
				   || this.tipoactivofijoempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoActivoFijoEmpresa=true;
				
				} else {
					this.isEsNuevoTipoActivoFijoEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoactivofijoempresa.getId()>=0 && !this.tipoactivofijoempresa.getIsNew()) {						
						this.isEsNuevoTipoActivoFijoEmpresa=false;
						
					} else {
						this.isEsNuevoTipoActivoFijoEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoActivoFijoEmpresa(esRelaciones);						
				
				this.seleccionarTipoActivoFijoEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoactivofijoempresa.getId()<0) {
					this.isEsNuevoTipoActivoFijoEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoActivoFijoEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoActivoFijoEmpresa(evt,rowIndex);
				}	
				
				if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoActivoFijoEmpresa: " + this.dDif); 
					}
				}								
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoActivoFijoEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoactivofijoempresa)) {
					if(this.tipoactivofijoempresa.getId()>0) {
						this.tipoactivofijoempresa.setIsDeleted(true);
						
						this.tipoactivofijoempresasEliminados.add(this.tipoactivofijoempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().remove(this.tipoactivofijoempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresas.remove(this.tipoactivofijoempresa);				
					}
					
					
					((TipoActivoFijoEmpresaModel) this.jTableDatosTipoActivoFijoEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoActivoFijoEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoActivoFijoEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoActivoFijoEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoactivofijoempresaConstantesFunciones.cargarid_empresaTipoActivoFijoEmpresa || this.tipoactivofijoempresaConstantesFunciones.event_dependid_empresaTipoActivoFijoEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoactivofijoempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoactivofijoempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoactivofijoempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoactivofijoempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoActivoFijoEmpresa(tipoactivofijoempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(tipoactivofijoempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoActivoFijoEmpresa(tipoactivofijoempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijoEmpresa(tipoactivofijoempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoActivoFijoEmpresa tipoactivofijoempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoactivofijoempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoActivoFijoEmpresa tipoactivofijoempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoactivofijoempresaLocal=this.tipoactivofijoempresa;
			} else {
				tipoactivofijoempresaLocal=this.tipoactivofijoempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoactivofijoempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoActivoFijoEmpresa(tipoactivofijoempresaLocal,true);
					
					if(tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoactivofijoempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoactivofijoempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(tipoactivofijoempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(tipoactivofijoempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(tipoactivofijoempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setText("0");
			}

			if(conColumnasBase) {tipoactivofijoempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelIdTipoActivoFijoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoactivofijoempresa.setcodigo(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelcodigoTipoActivoFijoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoactivofijoempresa.setnombre(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelnombreTipoActivoFijoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresaBean,TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresaOrigen,TipoActivoFijoEmpresa tipoactivofijoempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoactivofijoempresaOrigen.getId()!=null && !tipoactivofijoempresaOrigen.getId().equals(0L))) {tipoactivofijoempresa.setId(tipoactivofijoempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoactivofijoempresaOrigen.getcodigo()!=null && !tipoactivofijoempresaOrigen.getcodigo().equals(""))) {tipoactivofijoempresa.setcodigo(tipoactivofijoempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoactivofijoempresaOrigen.getnombre()!=null && !tipoactivofijoempresaOrigen.getnombre().equals(""))) {tipoactivofijoempresa.setnombre(tipoactivofijoempresaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setText(tipoactivofijoempresa.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoActivoFijoEmpresa(TipoActivoFijoEmpresaBean tipoactivofijoempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setText(tipoactivofijoempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setText(tipoactivofijoempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setText(tipoactivofijoempresaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoActivoFijoEmpresa(TipoActivoFijoEmpresaParameterReturnGeneral tipoactivofijoempresaReturnGeneral,TipoActivoFijoEmpresaBean tipoactivofijoempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoActivoFijoEmpresa tipoactivofijoempresaLocal=new TipoActivoFijoEmpresa();
			
			tipoactivofijoempresaLocal=tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoactivofijoempresaLocal.getId()!=null && !tipoactivofijoempresaLocal.getId().equals(0L))) {tipoactivofijoempresaBean.setId(tipoactivofijoempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipoactivofijoempresaLocal.getcodigo()!=null && !tipoactivofijoempresaLocal.getcodigo().equals(""))) {tipoactivofijoempresaBean.setcodigo(tipoactivofijoempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoactivofijoempresaLocal.getnombre()!=null && !tipoactivofijoempresaLocal.getnombre().equals(""))) {tipoactivofijoempresaBean.setnombre(tipoactivofijoempresaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoActivoFijoEmpresaGenerico(Long idTipoActivoFijoEmpresaSeleccionado,JComboBox jComboBoxTipoActivoFijoEmpresa,List<TipoActivoFijoEmpresa> tipoactivofijoempresasLocal)throws Exception {
		try {
			TipoActivoFijoEmpresa  tipoactivofijoempresaTemp=null;

			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasLocal) {
				if(tipoactivofijoempresaAux.getId()!=null && tipoactivofijoempresaAux.getId().equals(idTipoActivoFijoEmpresaSeleccionado)) {
					tipoactivofijoempresaTemp=tipoactivofijoempresaAux;
					break;
				}
			}

			jComboBoxTipoActivoFijoEmpresa.setSelectedItem(tipoactivofijoempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoActivoFijoEmpresaGenerico(JComboBox jComboBoxTipoActivoFijoEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoActivoFijoEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoActivoFijoEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoActivoFijoEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoActivoFijoEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijoempresa=(TipoActivoFijoEmpresa) tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoactivofijoempresa =(TipoActivoFijoEmpresa) tipoactivofijoempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoactivofijoempresa.getIsNew() && !tipoactivofijoempresa.getIsChanged() && !tipoactivofijoempresa.getIsDeleted()) {
				sDescripcion=tipoactivofijoempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoactivofijoempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoActivoFijoEmpresa tipoactivofijoempresaRow=new TipoActivoFijoEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijoempresaRow=(TipoActivoFijoEmpresa) tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoactivofijoempresaRow=(TipoActivoFijoEmpresa) tipoactivofijoempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));			
			this.jButtonDuplicarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa && this.isPermisoDuplicarTipoActivoFijoEmpresa));			
			this.jButtonCopiarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa && this.isPermisoCopiarTipoActivoFijoEmpresa));
			this.jButtonVerFormTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa && this.isPermisoVerFormTipoActivoFijoEmpresa));
			
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));			
			
			this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa && this.isPermisoEliminarTipoActivoFijoEmpresa));
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa);							
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));						
			this.jButtonDuplicarToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa && this.isPermisoDuplicarTipoActivoFijoEmpresa));						
			this.jButtonCopiarToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa && this.isPermisoCopiarTipoActivoFijoEmpresa));			
			this.jButtonVerFormToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa && this.isPermisoVerFormTipoActivoFijoEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa  && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa && this.isPermisoEliminarTipoActivoFijoEmpresa));
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarToolBarTipoActivoFijoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa);				
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));			
			this.jMenuItemDuplicarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa && this.isPermisoDuplicarTipoActivoFijoEmpresa));			
			this.jMenuItemCopiarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa && this.isPermisoCopiarTipoActivoFijoEmpresa));			
			this.jMenuItemVerFormTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa && this.isPermisoVerFormTipoActivoFijoEmpresa));			
			this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));			
			//this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa && this.isPermisoOrdenTipoActivoFijoEmpresa));			
			this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa && this.isPermisoNuevoTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemModificarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemActualizarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa && this.isPermisoActualizarTipoActivoFijoEmpresa));	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemEliminarTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa && this.isPermisoEliminarTipoActivoFijoEmpresa));
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemCancelarTipoActivoFijoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=this.jButtonNuevoTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa=this.jButtonDuplicarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa=this.jButtonCopiarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa=this.jButtonVerFormTipoActivoFijoEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoActivoFijoEmpresa=this.jButtonAbrirOrderByTipoActivoFijoEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=this.jButtonModificarTipoActivoFijoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=this.jButtonNuevoToolBarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarToolBarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarToolBarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarToolBarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarToolBarTipoActivoFijoEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=this.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=this.jMenuItemNuevoTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemModificarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemActualizarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemEliminarTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemCancelarTipoActivoFijoEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoActivoFijoEmpresa(Boolean esInicializar) {
		if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoActivoFijoEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoActivoFijoEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoActivoFijoEmpresa() {
		this.jButtonNuevoTipoActivoFijoEmpresa.setVisible(this.isPermisoNuevoTipoActivoFijoEmpresa);			
		this.jButtonDuplicarTipoActivoFijoEmpresa.setVisible(this.isPermisoDuplicarTipoActivoFijoEmpresa);			
		this.jButtonCopiarTipoActivoFijoEmpresa.setVisible(this.isPermisoCopiarTipoActivoFijoEmpresa);			
		this.jButtonVerFormTipoActivoFijoEmpresa.setVisible(this.isPermisoVerFormTipoActivoFijoEmpresa);			
		
		this.jButtonAbrirOrderByTipoActivoFijoEmpresa.setVisible(this.isPermisoOrdenTipoActivoFijoEmpresa);					
		
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.setVisible(this.isPermisoNuevoTipoActivoFijoEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarTipoActivoFijoEmpresa.setVisible(this.isPermisoActualizarTipoActivoFijoEmpresa);	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.setVisible(this.isPermisoActualizarTipoActivoFijoEmpresa);	
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.setVisible(this.isPermisoEliminarTipoActivoFijoEmpresa);
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa);						
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.setVisible(this.isPermisoGuardarCambiosTipoActivoFijoEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setVisible(this.isPermisoActualizarTipoActivoFijoEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoActivoFijoEmpresa() {
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarTipoActivoFijoEmpresa.setVisible(this.isPermisoActualizarTipoActivoFijoEmpresa);	
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.setVisible(this.isPermisoActualizarTipoActivoFijoEmpresa);	
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.setVisible(this.isPermisoEliminarTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa);							
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa && this.isPermisoGuardarCambiosTipoActivoFijoEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoActivoFijoEmpresa() {
		if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoActivoFijoEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoActivoFijoEmpresa() {
	}
	
	public void jTableDatosTipoActivoFijoEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoActivoFijoEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoActivoFijoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.gettipoactivofijoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijoempresa==null) {
						this.tipoactivofijoempresa = new TipoActivoFijoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				}

				if(this.tipoactivofijoempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoactivofijoempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoActivoFijoEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoActivoFijoEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoActivoFijoEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoActivoFijoEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.gettipoactivofijoempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoactivofijoempresaLogic.getConnexion());

				if(this.tipoactivofijoempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoactivofijoempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoActivoFijoEmpresa=(TitledBorder)this.jScrollPanelDatosTipoActivoFijoEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoActivoFijoEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoActivoFijoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.gettipoactivofijoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijoempresa==null) {
						this.tipoactivofijoempresa = new TipoActivoFijoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				}

				if(this.tipoactivofijoempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoactivofijoempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoActivoFijoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.gettipoactivofijoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijoempresa==null) {
						this.tipoactivofijoempresa = new TipoActivoFijoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				}

				if(this.tipoactivofijoempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoactivofijoempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoActivoFijoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.gettipoactivofijoempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijoempresa==null) {
						this.tipoactivofijoempresa = new TipoActivoFijoEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);
				}

				if(this.tipoactivofijoempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoactivofijoempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoActivoFijoEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);

			this.getTipoActivoFijoEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);

			//if(TipoActivoFijoEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoActivoFijoEmpresa() {
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoActivoFijoEmpresa!=null) {
			this.jInternalFrameImportacionTipoActivoFijoEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoActivoFijoEmpresa.dispose();
			this.jInternalFrameImportacionTipoActivoFijoEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoActivoFijoEmpresa();
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoActivoFijoEmpresa")) {
				jButtonDuplicarTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoActivoFijoEmpresa")) {
				jButtonCopiarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoActivoFijoEmpresa")) {
				jButtonVerFormTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoActivoFijoEmpresa")) {
				jButtonDuplicarTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoActivoFijoEmpresa")) {
				jButtonDuplicarTipoActivoFijoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoActivoFijoEmpresa")) {
				jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoActivoFijoEmpresa")) {
				jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoActivoFijoEmpresa")) {
				jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoActivoFijoEmpresa")) {
				jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoActivoFijoEmpresa")) {
				jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoActivoFijoEmpresa")) {
				jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoActivoFijoEmpresa")) {
				jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoActivoFijoEmpresa")) {
				jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoActivoFijoEmpresa")) {
				jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoActivoFijoEmpresa")) {
				jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoActivoFijoEmpresa")) {
				jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoActivoFijoEmpresa")) {
				jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoActivoFijoEmpresa")) {
				jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoActivoFijoEmpresa")) {
				jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoActivoFijoEmpresa")) {
				jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoActivoFijoEmpresa")) {
				jButtonMostrarOcultarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoActivoFijoEmpresa")) {
				jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoActivoFijoEmpresa")) {
				jButtonCopiarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoActivoFijoEmpresa")) {
				jButtonVerFormTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoActivoFijoEmpresa")) {
				jButtonCopiarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoActivoFijoEmpresa")) {
				jButtonVerFormTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoActivoFijoEmpresa")) {
				jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoActivoFijoEmpresa")) {
				jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoActivoFijoEmpresa")) {
				jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoActivoFijoEmpresa")) {
				jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoActivoFijoEmpresa")) {
				jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoActivoFijoEmpresa")) {
				jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoActivoFijoEmpresa")) {
				jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoActivoFijoEmpresa")) {
				jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoActivoFijoEmpresa")) {
				jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoActivoFijoEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa")) {
				jButtonAbrirOrderByTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoActivoFijoEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoActivoFijoEmpresa")) {
				jButtonMostrarOcultarTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoActivoFijoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoActivoFijoEmpresa")) {
				jButtonCerrarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoActivoFijoEmpresa")) {
				jButtonGenerarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoActivoFijoEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoActivoFijoEmpresa")) {
				jButtonCerrarImportacionTipoActivoFijoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoActivoFijoEmpresa")) {
				
				jButtonGenerarImportacionTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoActivoFijoEmpresa")) {
				
				jButtonAbrirImportacionTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoActivoFijoEmpresa")) {
				jComboBoxTiposAccionesTipoActivoFijoEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoActivoFijoEmpresa")) {
				jComboBoxTiposRelacionesTipoActivoFijoEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoActivoFijoEmpresa")) {
				jComboBoxTiposAccionesTipoActivoFijoEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoActivoFijoEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoActivoFijoEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoActivoFijoEmpresa")) {
				jTextFieldValorCampoGeneralTipoActivoFijoEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoActivoFijoEmpresa")) {
				jButtonAbrirOrderByTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoActivoFijoEmpresa")) {
				jButtonAbrirOrderByTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoActivoFijoEmpresa")) {
				jButtonCerrarOrderByTipoActivoFijoEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonidTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoActivoFijoEmpresaUpdate")) {
				this.jButtonid_empresaTipoActivoFijoEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonid_empresaTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoActivoFijoEmpresaBusqueda")) {
				this.jButtoncodigoTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonnombreTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoActivoFijoEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoActivoFijoEmpresa tipoactivofijoempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoactivofijoempresaLocal=this.tipoactivofijoempresa;
			} else {
				tipoactivofijoempresaLocal=this.tipoactivofijoempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
							
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
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
			
			


			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
								
						
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
								
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
							
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
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
			
			


			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
								
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoActivoFijoEmpresa")) {
					jCheckBoxSeleccionarTodosTipoActivoFijoEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoActivoFijoEmpresa")) {
					jCheckBoxSeleccionadosTipoActivoFijoEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoActivoFijoEmpresa")) {
					
				}
				
				


				
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
												
				
				


				
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
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
			
			


			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijoempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijoempresa);
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
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
				
				


				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijoEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijoEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoempresaAnterior =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoActivoFijoEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoActivoFijoEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoActivoFijoEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoactivofijoempresa =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoactivofijoempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoActivoFijoEmpresa")) {
				
				}
				
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoActivoFijoEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoActivoFijoEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoActivoFijoEmpresa")) {
			
			}
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoActivoFijoEmpresa();
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoActivoFijoEmpresa")) {
				jButtonDuplicarTipoActivoFijoEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoActivoFijoEmpresa")) {
				jButtonCopiarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoActivoFijoEmpresa")) {
				jButtonVerFormTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoActivoFijoEmpresa")) {
				jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoActivoFijoEmpresa")) {
				jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoActivoFijoEmpresa")) {
				jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoActivoFijoEmpresa")) {
				jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoActivoFijoEmpresa")) {
				jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoActivoFijoEmpresa")) {
				jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoActivoFijoEmpresa")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoActivoFijoEmpresa")) {
				jButtonAbrirOrderByTipoActivoFijoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoActivoFijoEmpresa")) {
				jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoActivoFijoEmpresa")) {
				jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoActivoFijoEmpresa")) {
				jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonidTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoActivoFijoEmpresaUpdate")) {
				this.jButtonid_empresaTipoActivoFijoEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonid_empresaTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoActivoFijoEmpresaBusqueda")) {
				this.jButtoncodigoTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoActivoFijoEmpresaBusqueda")) {
				this.jButtonnombreTipoActivoFijoEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoActivoFijoEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoActivoFijoEmpresa")) {
				closingInternalFrameTipoActivoFijoEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoActivoFijoEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoActivoFijoEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoActivoFijoEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoActivoFijoEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoActivoFijoEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoActivoFijoEmpresaActionPerformed(null);
			}
			
			TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoactivofijoempresa,new Object(),this.tipoactivofijoempresaParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoActivoFijoEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoActivoFijoEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoActivoFijoEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoactivofijoempresa)) {
			if(!esControlTabla) {
				if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);			
				}
				
				if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.procesarEventosTipoActivoFijoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this.tipoactivofijoempresa,this.tipoactivofijoempresaParameterGeneral,this.isEsNuevoTipoActivoFijoEmpresa,classes);//this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral,this.tipoactivofijoempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoActivoFijoEmpresa(classes,this.tipoactivofijoempresaReturnGeneral,this.tipoactivofijoempresaBean,false);
					}
						
					if(this.tipoactivofijoempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa());	
					}
						
					if(this.tipoactivofijoempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa(),classes);//this.tipoactivofijoempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijoEmpresa(this.tipoactivofijoempresa,classes);//this.tipoactivofijoempresaBean);									
				}
			
				if(TipoActivoFijoEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijoEmpresa(this.tipoactivofijoempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijoEmpresa(this.tipoactivofijoempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoactivofijoempresaAnterior!=null) {
						this.tipoactivofijoempresa=this.tipoactivofijoempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.procesarEventosTipoActivoFijoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this.tipoactivofijoempresa,this.tipoactivofijoempresaParameterGeneral,this.isEsNuevoTipoActivoFijoEmpresa,classes);//this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa(),tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa(),this.tipoactivofijoempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoActivoFijoEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoActivoFijoEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoActivoFijoEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoActivoFijoEmpresa() throws Exception {
		
		TipoActivoFijoEmpresaModel tipoactivofijoempresaModel=(TipoActivoFijoEmpresaModel)this.jTableDatosTipoActivoFijoEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijoempresaModel.tipoactivofijoempresas=this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoactivofijoempresaModel.tipoactivofijoempresas=this.tipoactivofijoempresas;
		}
		
		
		((TipoActivoFijoEmpresaModel) this.jTableDatosTipoActivoFijoEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoActivoFijoEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoactivofijoempresaAnterior(),this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoactivofijoempresaAnterior(),this.tipoactivofijoempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoActivoFijoEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoempresa,new Object(),generalEntityParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoActivoFijoEmpresaConstantesFunciones.getClassesRelationshipsOfTipoActivoFijoEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoActivoFijoEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoActivoFijoEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoActivoFijoEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoempresa,new Object(),generalEntityParameterGeneral,this.tipoactivofijoempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoActivoFijoEmpresa(TipoActivoFijoEmpresaBean tipoactivofijoempresaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoActivoFijoEmpresa(ArrayList<Classe> classes,TipoActivoFijoEmpresaReturnGeneral tipoactivofijoempresaReturnGeneral,TipoActivoFijoEmpresaBean tipoactivofijoempresaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoactivofijoempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa = new TipoActivoFijoEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones(),this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.tipoactivofijoempresaLogic=this.tipoactivofijoempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoActivoFijoEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoActivoFijoEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoActivoFijoEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoActivoFijoEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoActivoFijoEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoActivoFijoEmpresa"));
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoActivoFijoEmpresa"));

		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoActivoFijoEmpresa"));
					
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemModificarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoActivoFijoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoActivoFijoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoActivoFijoEmpresa"));
						
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemActualizarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoActivoFijoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoActivoFijoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoActivoFijoEmpresa"));
								
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemEliminarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoActivoFijoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoActivoFijoEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoActivoFijoEmpresa"));
					
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemCancelarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoActivoFijoEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemDetalleCerrarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoActivoFijoEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijoEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijoEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoActivoFijoEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonidTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtoncodigoTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonnombreTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoActivoFijoEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoActivoFijoEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoActivoFijoEmpresa"));
		}
		
		this.jTableDatosTipoActivoFijoEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoActivoFijoEmpresa"));
		
		this.jTableDatosTipoActivoFijoEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoActivoFijoEmpresa"));
		
		this.jButtonNuevoTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoActivoFijoEmpresa"));
		
		this.jButtonDuplicarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoActivoFijoEmpresa"));
		
		this.jButtonCopiarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoActivoFijoEmpresa"));
		
		this.jButtonVerFormTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoActivoFijoEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoActivoFijoEmpresa"));
			
		this.jButtonDuplicarToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemNuevoTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoActivoFijoEmpresa"));
			
		this.jMenuItemDuplicarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoActivoFijoEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoActivoFijoEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoActivoFijoEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoActivoFijoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonModificarToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoActivoFijoEmpresa"));
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemModificarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoActivoFijoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoActivoFijoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonActualizarToolBarTipoActivoFijoEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoActivoFijoEmpresa"));
				
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemActualizarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoActivoFijoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoActivoFijoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonEliminarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoActivoFijoEmpresa"));
						
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemEliminarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoActivoFijoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoActivoFijoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonCancelarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoActivoFijoEmpresa"));
			
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemCancelarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoActivoFijoEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoActivoFijoEmpresa"));		
		
		
		this.jButtonCerrarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoActivoFijoEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemCerrarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoActivoFijoEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jMenuItemDetalleCerrarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoActivoFijoEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoActivoFijoEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijoEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoActivoFijoEmpresa"));
			
		this.jButtonVerFormToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoActivoFijoEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoActivoFijoEmpresa"));
			
		this.jMenuItemCopiarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoActivoFijoEmpresa"));		
		
		this.jMenuItemVerFormTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoActivoFijoEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoActivoFijoEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoActivoFijoEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoActivoFijoEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoActivoFijoEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoActivoFijoEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoActivoFijoEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoActivoFijoEmpresa"));
		
		this.jMenuItemAnterioresTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoActivoFijoEmpresa"));		
		
		
		this.jButtonSiguientesTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoActivoFijoEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemSiguientesTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoActivoFijoEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoActivoFijoEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoActivoFijoEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoActivoFijoEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoActivoFijoEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoActivoFijoEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoActivoFijoEmpresa"));

		this.jCheckBoxSeleccionadosTipoActivoFijoEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoActivoFijoEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoActivoFijoEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoActivoFijoEmpresa"));
			
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoActivoFijoEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoActivoFijoEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoActivoFijoEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonidTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtoncodigoTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonnombreTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijoEmpresa"));
				this.jInternalFrameReporteDinamicoTipoActivoFijoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijoEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijoEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijoEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijoEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoActivoFijoEmpresa"));
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoActivoFijoEmpresa"));
				this.jInternalFrameImportacionTipoActivoFijoEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoActivoFijoEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoActivoFijoEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoActivoFijoEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoActivoFijoEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoActivoFijoEmpresa!=null) {
				this.jInternalFrameOrderByTipoActivoFijoEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoActivoFijoEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTabbedPaneRelacionesTipoActivoFijoEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoActivoFijoEmpresa"));
		
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
            		closingInternalFrameTipoActivoFijoEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoActivoFijoEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoActivoFijoEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoActivoFijoEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoActivoFijoEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoActivoFijoEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoActivoFijoEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoActivoFijoEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoActivoFijoEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoActivoFijoEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoActivoFijoEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoActivoFijoEmpresa";
		inputMap = this.jButtonModificarTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoActivoFijoEmpresa";
		inputMap = this.jButtonActualizarTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoActivoFijoEmpresa";
		inputMap = this.jButtonEliminarTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCancelarTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCerrarTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoActivoFijoEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonGuardarCambiosTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoActivoFijoEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoActivoFijoEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoActivoFijoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoActivoFijoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoActivoFijoEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonidTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtoncodigoTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoActivoFijoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jButtonnombreTipoActivoFijoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoActivoFijoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoActivoFijoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoActivoFijoEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoActivoFijoEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoActivoFijoEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
					tipoactivofijoempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresas) {
					tipoactivofijoempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoActivoFijoEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
						tipoactivofijoempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresas) {
						tipoactivofijoempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoActivoFijoEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoActivoFijoEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoActivoFijoEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoActivoFijoEmpresa.getSelectedRows();
			
			TipoActivoFijoEmpresa tipoactivofijoempresaLocal=new TipoActivoFijoEmpresa();
			
			//this.seleccionarTodosTipoActivoFijoEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoempresaLocal =(TipoActivoFijoEmpresa) this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas().toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoactivofijoempresaLocal =(TipoActivoFijoEmpresa) this.tipoactivofijoempresas.toArray()[this.jTableDatosTipoActivoFijoEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoactivofijoempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
						tipoactivofijoempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresas) {
						tipoactivofijoempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoActivoFijoEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoActivoFijoEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoActivoFijoEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoActivoFijoEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoActivoFijoEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoActivoFijoEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoactivofijoempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoactivofijoempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresas) {
					
						if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoactivofijoempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoactivofijoempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoActivoFijoEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoActivoFijoEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoActivoFijoEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoActivoFijoEmpresa(conSplash);
				
					this.generarReporteTipoActivoFijoEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoActivoFijoEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoActivoFijoEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoActivoFijoEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoActivoFijoEmpresa();
				
				this.exportarTipoActivoFijoEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoActivoFijoEmpresas();
				//this.importarTipoActivoFijoEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoActivoFijoEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoActivoFijoEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Activo Fijo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoActivoFijoEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoActivoFijoEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoActivoFijoEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoActivoFijoEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoActivoFijoEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoActivoFijoEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoActivoFijoEmpresa();
						
						this.generarReporteProcesoAccionTipoActivoFijoEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Activo Fijo EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Activo Fijo Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoActivoFijoEmpresa();
				
						this.actualizarParametrosGeneralTipoActivoFijoEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoactivofijoempresaReturnGeneral=tipoactivofijoempresaLogic.procesarAccionTipoActivoFijoEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas(),this.tipoactivofijoempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoActivoFijoEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoActivoFijoEmpresa();
					
					TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoActivoFijoEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoActivoFijoEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoActivoFijoEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoActivoFijoEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
			TipoActivoFijoEmpresa tipoactivofijoempresa=new TipoActivoFijoEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa.getSelectedItem();
			
			
			
			
			tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoactivofijoempresasSeleccionados.size()==1) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
					tipoactivofijoempresa=tipoactivofijoempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoActivoFijoEmpresa();
			
      		//this.finishProcessTipoActivoFijoEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoActivoFijoEmpresaReturnGeneral() throws Exception {
		if(this.tipoactivofijoempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoactivofijoempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoactivofijoempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoactivofijoempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoactivofijoempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoactivofijoempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
		}
		
		if(this.tipoactivofijoempresaReturnGeneral.getConRetornoLista() || this.tipoactivofijoempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoactivofijoempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoactivofijoempresaLogic.setTipoActivoFijoEmpresas(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoactivofijoempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoactivofijoempresaLogic.setTipoActivoFijoEmpresa(this.tipoactivofijoempresaReturnGeneral.getTipoActivoFijoEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoActivoFijoEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoActivoFijoEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoActivoFijoEmpresa> getTipoActivoFijoEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoActivoFijoEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas()) {
					if(tipoactivofijoempresaAux.getIsSelected()) {
						tipoactivofijoempresasSeleccionados.add(tipoactivofijoempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:this.tipoactivofijoempresas) {
					if(tipoactivofijoempresaAux.getIsSelected()) {
						tipoactivofijoempresasSeleccionados.add(tipoactivofijoempresaAux);				
					}
				}
			}
			
			if(tipoactivofijoempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoactivofijoempresasSeleccionados.addAll(this.tipoactivofijoempresaLogic.getTipoActivoFijoEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoactivofijoempresasSeleccionados.addAll(this.tipoactivofijoempresas);				
					}
				}
			}
		} else {
			tipoactivofijoempresasSeleccionados.add(this.tipoactivofijoempresa);
		}
		
		return tipoactivofijoempresasSeleccionados;
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
	
	public void generarReporteTipoActivoFijoEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoActivoFijoEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoActivoFijoEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoActivoFijoEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoActivoFijoEmpresasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Activo Fijo Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoActivoFijoEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoActivoFijoEmpresa();
		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoActivoFijoEmpresa();
		
		
		//this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados ,tipoactivofijoempresaImplementable,tipoactivofijoempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoActivoFijoEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoActivoFijoEmpresa();
		
		this.abrirFrameImportacionTipoActivoFijoEmpresa();		
		
			
		//this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados ,tipoactivofijoempresaImplementable,tipoactivofijoempresaImplementableHome);
	}
	
	public void importarTipoActivoFijoEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoActivoFijoEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoActivoFijoEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoActivoFijoEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoActivoFijoEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Activo Fijo Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoActivoFijoEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoActivoFijoEmpresa(tipoactivofijoempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoactivofijoempresaAux.setsDetalleGeneralEntityReporte(tipoactivofijoempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoActivoFijoEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoactivofijoempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijoempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijoempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijoempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijoempresa.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoActivoFijoEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoActivoFijoEmpresa(row);				
				iRow++;
			}				
			
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoActivoFijoEmpresa(tipoactivofijoempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoActivoFijoEmpresasSeleccionados() throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();		
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijoempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoactivofijoempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoactivofijoempresa");
			//elementRoot.appendChild(element);
		
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
				element = document.createElement("tipoactivofijoempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoActivoFijoEmpresa(tipoactivofijoempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoActivoFijoEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijoempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijoempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijoempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijoempresa.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoActivoFijoEmpresa(TipoActivoFijoEmpresa tipoactivofijoempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoActivoFijoEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoactivofijoempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoActivoFijoEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoactivofijoempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoActivoFijoEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoactivofijoempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoActivoFijoEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoactivofijoempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoActivoFijoEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoactivofijoempresa.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoActivoFijoEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados=new ArrayList<TipoActivoFijoEmpresa>();
		
		tipoactivofijoempresasSeleccionados=this.getTipoActivoFijoEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoActivoFijoEmpresa(tipoactivofijoempresasSeleccionados);
		
		this.generarReporteTipoActivoFijoEmpresas("Todos",tipoactivofijoempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoActivoFijoEmpresa(ArrayList<TipoActivoFijoEmpresa> tipoactivofijoempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoActivoFijoEmpresa tipoactivofijoempresaAux:tipoactivofijoempresasSeleccionados) {
				tipoactivofijoempresaAux.setsDetalleGeneralEntityReporte(tipoactivofijoempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoactivofijoempresaAux.setsDescripcionGeneralEntityReporte1(tipoactivofijoempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoactivofijoempresaAux.setsDescripcionGeneralEntityReporte1(tipoactivofijoempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoactivofijoempresaAux.setsDescripcionGeneralEntityReporte1(tipoactivofijoempresaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoActivoFijoEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaModificarTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijoEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijoEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoActivoFijoEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoActivoFijoEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoActivoFijoEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijoEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;												
			}
			
			this.jButtonCerrarTipoActivoFijoEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijoEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoactivofijoempresa)) {
			this.isVisibilidadCeldaActualizarTipoActivoFijoEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijoEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoActivoFijoEmpresa() {
	}
	
	public void actualizarEstadoPanelsTipoActivoFijoEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijoEmpresa!=null) {
				this.jScrollPanelDatosTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijoEmpresa!=null) {
				this.jPanelPaginacionTipoActivoFijoEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijoEmpresa!=null) {
				this.jPanelParametrosReportesTipoActivoFijoEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		
		if(this.tipoactivofijoempresaSessionBean==null) {
			this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		}
		
		this.tipoactivofijoempresaSessionBean.setsUltimaBusquedaTipoActivoFijoEmpresa(this.getsAccionBusqueda());
		this.tipoactivofijoempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoactivofijoempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoactivofijoempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		
		if(this.tipoactivofijoempresaSessionBean==null) {
			this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		}
		
		if(this.tipoactivofijoempresaSessionBean.getsUltimaBusquedaTipoActivoFijoEmpresa()!=null&&!this.tipoactivofijoempresaSessionBean.getsUltimaBusquedaTipoActivoFijoEmpresa().equals("")) {
			this.setsAccionBusqueda(tipoactivofijoempresaSessionBean.getsUltimaBusquedaTipoActivoFijoEmpresa());
			this.setiNumeroPaginacion(tipoactivofijoempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoactivofijoempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoactivofijoempresaSessionBean.getid_empresa());
				tipoactivofijoempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoactivofijoempresaSessionBean.setsUltimaBusquedaTipoActivoFijoEmpresa("");
		this.tipoactivofijoempresaSessionBean.setiNumeroPaginacion(TipoActivoFijoEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipoactivofijoempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoActivoFijoEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoActivoFijoEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoActivoFijoEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoActivoFijoEmpresa();
		this.updateHabilitarBusquedasFormularioTipoActivoFijoEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoActivoFijoEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoActivoFijoEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoActivoFijoEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoActivoFijoEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoActivoFijoEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoActivoFijoEmpresa.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioTipoActivoFijoEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoActivoFijoEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoActivoFijoEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoActivoFijoEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoActivoFijoEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoactivofijoempresaConstantesFunciones.resaltaridTipoActivoFijoEmpresa!=null && this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setBorder(this.tipoactivofijoempresaConstantesFunciones.resaltaridTipoActivoFijoEmpresa);}
		if(this.tipoactivofijoempresaConstantesFunciones.resaltarid_empresaTipoActivoFijoEmpresa!=null && this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setBorder(this.tipoactivofijoempresaConstantesFunciones.resaltarid_empresaTipoActivoFijoEmpresa);}
		if(this.tipoactivofijoempresaConstantesFunciones.resaltarcodigoTipoActivoFijoEmpresa!=null && this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setBorder(this.tipoactivofijoempresaConstantesFunciones.resaltarcodigoTipoActivoFijoEmpresa);}
		if(this.tipoactivofijoempresaConstantesFunciones.resaltarnombreTipoActivoFijoEmpresa!=null && this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setBorder(this.tipoactivofijoempresaConstantesFunciones.resaltarnombreTipoActivoFijoEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoActivoFijoEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostraridTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelidTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostraridTipoActivoFijoEmpresa);
		//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarid_empresaTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelid_empresaTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarid_empresaTipoActivoFijoEmpresa);
		//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarcodigoTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelcodigoTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarcodigoTipoActivoFijoEmpresa);
		//this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarnombreTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jPanelnombreTipoActivoFijoEmpresa.setVisible(this.tipoactivofijoempresaConstantesFunciones.mostrarnombreTipoActivoFijoEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoActivoFijoEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijoEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jLabelidTipoActivoFijoEmpresa.setEnabled(this.tipoactivofijoempresaConstantesFunciones.activaridTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jComboBoxid_empresaTipoActivoFijoEmpresa.setEnabled(this.tipoactivofijoempresaConstantesFunciones.activarid_empresaTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextFieldcodigoTipoActivoFijoEmpresa.setEnabled(this.tipoactivofijoempresaConstantesFunciones.activarcodigoTipoActivoFijoEmpresa);
		this.jInternalFrameDetalleFormTipoActivoFijoEmpresa.jTextAreanombreTipoActivoFijoEmpresa.setEnabled(this.tipoactivofijoempresaConstantesFunciones.activarnombreTipoActivoFijoEmpresa);
		}
	}
	
		
}