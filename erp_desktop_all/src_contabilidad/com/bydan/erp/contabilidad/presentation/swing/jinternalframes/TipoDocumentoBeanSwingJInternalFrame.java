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

import com.bydan.erp.contabilidad.util.TipoDocumentoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoDocumentoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoDocumentoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoDocumentoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDocumentoBeanSwingJInternalFrame extends TipoDocumentoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDocumentoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDocumento> tipodocumentoValidator = new ClassValidator<TipoDocumento>(TipoDocumento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDocumento tipodocumento;	
	public TipoDocumento tipodocumentoAux;
	public TipoDocumento tipodocumentoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDocumento tipodocumentoTotales;
	public Long idTipoDocumentoActual;
	public Long iIdNuevoTipoDocumento=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
	}

	public String sFinalQueryComboTipoMovimientoModulo="";

	public List<TipoMovimientoModulo> tipomovimientomodulosForeignKey;

	public List<TipoMovimientoModulo> gettipomovimientomodulosForeignKey() {
		return tipomovimientomodulosForeignKey;
	}

	public void settipomovimientomodulosForeignKey(List<TipoMovimientoModulo> tipomovimientomodulosForeignKey) {
		this.tipomovimientomodulosForeignKey = tipomovimientomodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimientoModulo tipomovimientomoduloForeignKey;

	public TipoMovimientoModulo gettipomovimientomoduloForeignKey() {
		return tipomovimientomoduloForeignKey;
	}

	public void settipomovimientomoduloForeignKey(TipoMovimientoModulo tipomovimientomoduloForeignKey) {
		this.tipomovimientomoduloForeignKey = tipomovimientomoduloForeignKey;
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
	
	public Boolean isPermisoTodoTipoDocumento;
	public Boolean isPermisoNuevoTipoDocumento;
	public Boolean isPermisoActualizarTipoDocumento;
	public Boolean isPermisoActualizarOriginalTipoDocumento;
	public Boolean isPermisoEliminarTipoDocumento;
	public Boolean isPermisoGuardarCambiosTipoDocumento;
	public Boolean isPermisoConsultaTipoDocumento;
	public Boolean isPermisoBusquedaTipoDocumento;
	public Boolean isPermisoReporteTipoDocumento;
	public Boolean isPermisoPaginacionMedioTipoDocumento;
	public Boolean isPermisoPaginacionAltoTipoDocumento;
	public Boolean isPermisoPaginacionTodoTipoDocumento;
	public Boolean isPermisoCopiarTipoDocumento;
	public Boolean isPermisoVerFormTipoDocumento;
	public Boolean isPermisoDuplicarTipoDocumento;
	public Boolean isPermisoOrdenTipoDocumento;
	
	
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
	
	public TipoDocumentoParameterReturnGeneral tipodocumentoReturnGeneral;
	public TipoDocumentoParameterReturnGeneral tipodocumentoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDocumento=false;
	public Boolean esParaAccionDesdeFormularioTipoDocumento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDocumentoSessionBeanAdditional tipodocumentoSessionBeanAdditional=null;
	
	public TipoDocumentoSessionBeanAdditional getTipoDocumentoSessionBeanAdditional() {
		return this.tipodocumentoSessionBeanAdditional;
	}
	
	public void setTipoDocumentoSessionBeanAdditional(TipoDocumentoSessionBeanAdditional tipodocumentoSessionBeanAdditional) {
		try {
			this.tipodocumentoSessionBeanAdditional=tipodocumentoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDocumentoBeanSwingJInternalFrameAdditional tipodocumentoBeanSwingJInternalFrameAdditional=null;
	//public class TipoDocumentoBeanSwingJInternalFrame
	
	public TipoDocumentoBeanSwingJInternalFrameAdditional getTipoDocumentoBeanSwingJInternalFrameAdditional() {
		return this.tipodocumentoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDocumentoBeanSwingJInternalFrameAdditional(TipoDocumentoBeanSwingJInternalFrameAdditional tipodocumentoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodocumentoBeanSwingJInternalFrameAdditional=tipodocumentoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDocumentoLogic tipodocumentoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDocumento tipodocumentoBean;
	public TipoDocumentoConstantesFunciones tipodocumentoConstantesFunciones;
	//public TipoDocumentoParameterReturnGeneral tipodocumentoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	public TipoMovimientoModuloLogic tipomovimientomoduloLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDocumento> tipodocumentos;	
	//public List<TipoDocumento> tipodocumentosEliminados;
	//public List<TipoDocumento> tipodocumentosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDocumento=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDocumento=true;
	public Boolean isVisibilidadCeldaCopiarTipoDocumento=true;
	public Boolean isVisibilidadCeldaVerFormTipoDocumento=true;
	public Boolean isVisibilidadCeldaOrdenTipoDocumento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
	public Boolean isVisibilidadCeldaModificarTipoDocumento=false;
	public Boolean isVisibilidadCeldaActualizarTipoDocumento=false;
	public Boolean isVisibilidadCeldaEliminarTipoDocumento=false;
	public Boolean isVisibilidadCeldaCancelarTipoDocumento=false;
	public Boolean isVisibilidadCeldaGuardarTipoDocumento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDocumento=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	public Boolean isVisibilidadFK_IdTipoMovimientoModulo=false;
	
	public Long getiIdNuevoTipoDocumento() {
		return this.iIdNuevoTipoDocumento;
	}

	public void setiIdNuevoTipoDocumento(Long iIdNuevoTipoDocumento) {
		this.iIdNuevoTipoDocumento = iIdNuevoTipoDocumento;
	}
	
	public Long getidTipoDocumentoActual() {
		return this.idTipoDocumentoActual;
	}

	public void setidTipoDocumentoActual(Long idTipoDocumentoActual) {
		this.idTipoDocumentoActual = idTipoDocumentoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDocumento gettipodocumento() {
		return this.tipodocumento;
	}

	public void settipodocumento(TipoDocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	
	public TipoDocumento gettipodocumentoAux() {
		return this.tipodocumentoAux;
	}

	public void settipodocumentoAux(TipoDocumento tipodocumentoAux) {
		this.tipodocumentoAux = tipodocumentoAux;
	}				
	
	public TipoDocumento gettipodocumentoAnterior() {
		return this.tipodocumentoAnterior;
	}

	public void settipodocumentoAnterior(TipoDocumento tipodocumentoAnterior) {
		this.tipodocumentoAnterior = tipodocumentoAnterior;
	}	
	
	public TipoDocumento gettipodocumentoTotales() {
		return this.tipodocumentoTotales;
	}

	public void settipodocumentoTotales(TipoDocumento tipodocumentoTotales) {
		this.tipodocumentoTotales = tipodocumentoTotales;
	}	
	
	public TipoDocumento gettipodocumentoBean() {
		return this.tipodocumentoBean;
	}

	public void settipodocumentoBean(TipoDocumento tipodocumentoBean) {
		this.tipodocumentoBean = tipodocumentoBean;
	}	
	
	public TipoDocumentoParameterReturnGeneral gettipodocumentoReturnGeneral() {
		return this.tipodocumentoReturnGeneral;
	}

	public void settipodocumentoReturnGeneral(TipoDocumentoParameterReturnGeneral tipodocumentoReturnGeneral) {
		this.tipodocumentoReturnGeneral = tipodocumentoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo() {
		return this.id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

	public void setid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo(Long id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo) {
		this.id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo = id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

;
	public Long id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo=-1L;

	public Long getid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo() {
		return this.id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

	public void setid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo(Long id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo) {
		this.id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo = id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public Long id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo=-1L;

	public Long getid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo() {
		return this.id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo;
	}

	public void setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(Long id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo) {
		this.id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo = id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDocumentoLogic getTipoDocumentoLogic()	{		
		return tipodocumentoLogic;
	}

	public void setTipoDocumentoLogic(TipoDocumentoLogic tipodocumentoLogic) {
		this.tipodocumentoLogic = tipodocumentoLogic;
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
	
	public Boolean getIsEsNuevoTipoDocumento() {
		return isEsNuevoTipoDocumento;
	}

	public void setIsEsNuevoTipoDocumento(Boolean isEsNuevoTipoDocumento) {
		this.isEsNuevoTipoDocumento = isEsNuevoTipoDocumento;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDocumento() {
		return esParaAccionDesdeFormularioTipoDocumento;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDocumento(Boolean esParaAccionDesdeFormularioTipoDocumento) {
		this.esParaAccionDesdeFormularioTipoDocumento = esParaAccionDesdeFormularioTipoDocumento;
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

			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodocumentoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(tipodocumentoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(tipodocumentoSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

	public void cargarCombosTipoMovimientoModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoModuloLogic tipomovimientomoduloLogic=new TipoMovimientoModuloLogic();

			//tipomovimientomoduloLogic.getTipoMovimientoModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientomoduloLogic.getTipoMovimientoModuloDataAccess().setIsForForeingKeyData(true);

					tipomovimientomoduloLogic.getTodosTipoMovimientoModulosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientomodulosForeignKey=tipomovimientomoduloLogic.getTipoMovimientoModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getEntityWithConnection(tipodocumentoSessionBean.getlidTipoMovimientoModuloActual());
					this.tipomovimientomodulosForeignKey.add(tipomovimientomoduloLogic.getTipoMovimientoModulo());
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

					if(this.tipodocumento!=null) {
						this.tipodocumento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDocumento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDocumentoGenerico)throws Exception
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
				jComboBoxid_empresaTipoDocumentoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDocumentoGenerico!=null && jComboBoxid_empresaTipoDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.tipodocumento!=null) {
						this.tipodocumento.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTipoDocumento.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloTipoDocumento!=null) {
						jComboBoxid_moduloFK_IdModuloTipoDocumento.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloTipoDocumento!=null) {
							//jComboBoxid_moduloFK_IdModuloTipoDocumento.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloTipoDocumento.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloTipoDocumento.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTipoDocumentoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTipoDocumentoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTipoDocumentoGenerico!=null && jComboBoxid_moduloTipoDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_moduloTipoDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.tipodocumento!=null) {
						this.tipodocumento.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoTipoDocumento.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento!=null) {
						jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento!=null) {
							//jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.getItemCount()>0) {
								jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoTipoDocumentoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoTipoDocumentoGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoTipoDocumentoGenerico!=null && jComboBoxid_tipo_movimientoTipoDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoTipoDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoModuloForeignKey(Long idTipoMovimientoModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientomoduloTemp!=null) {

					if(this.tipodocumento!=null) {
						this.tipodocumento.setTipoMovimientoModulo(tipomovimientomoduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedItem(tipomovimientomoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedItem(tipomovimientomoduloTemp);
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientomoduloTemp!=null && jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento!=null) {
						jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(tipomovimientomoduloTemp);
					} else {
						if(jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento!=null) {
							//jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(tipomovimientomoduloTemp);
							if(jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getItemCount()>0) {
								jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoMovimientoModuloForeignKeyDescripcion(Long idTipoMovimientoModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoModuloForeignKeyGenerico(Long idTipoMovimientoModuloSeleccionado,JComboBox jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}

			if(tipomovimientomoduloTemp!=null) {
				jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico.setSelectedItem(tipomovimientomoduloTemp);
			} else {
				if(jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico!=null && jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDocumento tipodocumento,JComboBox jComboBoxid_empresaTipoDocumentoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDocumentoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDocumentoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodocumento.setid_empresa(empresaAux.getId());
				tipodocumento.setempresa_descripcion(TipoDocumentoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodocumento.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TipoDocumento tipodocumento,JComboBox jComboBoxid_moduloTipoDocumentoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTipoDocumentoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTipoDocumentoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				tipodocumento.setid_modulo(moduloAux.getId());
				tipodocumento.setmodulo_descripcion(TipoDocumentoConstantesFunciones.getModuloDescripcion(moduloAux));
				tipodocumento.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(TipoDocumento tipodocumento,JComboBox jComboBoxid_tipo_movimientoTipoDocumentoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoTipoDocumentoGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoTipoDocumentoGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				tipodocumento.setid_tipo_movimiento(tipomovimientoAux.getId());
				tipodocumento.settipomovimiento_descripcion(TipoDocumentoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				tipodocumento.setTipoMovimiento(tipomovimientoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoModuloForeignKey(TipoDocumento tipodocumento,JComboBox jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloAux=new TipoMovimientoModulo();

			if(jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico==null) {
				tipomovimientomoduloAux=(TipoMovimientoModulo)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.getSelectedItem();
			} else {
				tipomovimientomoduloAux=(TipoMovimientoModulo)jComboBoxid_tipo_movimiento_moduloTipoDocumentoGenerico.getSelectedItem();
			}

			if(tipomovimientomoduloAux!=null && tipomovimientomoduloAux.getId()!=null) {
				tipodocumento.setid_tipo_movimiento_modulo(tipomovimientomoduloAux.getId());
				tipodocumento.settipomovimientomodulo_descripcion(TipoDocumentoConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomoduloAux));
				tipodocumento.setTipoMovimientoModulo(tipomovimientomoduloAux);			}
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

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
					}

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
					}

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addItem(modulo);
							}
						}

						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloTipoDocumento.addItem(modulo);
							}
						}

						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
					}

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.addItem(tipomovimiento);
							}
						}

						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientoModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimientoModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.removeAllItems();

							for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulosForeignKey) {
								this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.addItem(tipomovimientomodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDocumento!=null) { 
					}

					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.removeAllItems();

							for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulosForeignKey) {
								this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addItem(tipomovimientomodulo);
							}
						}

						if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloTipoDocumento.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(TipoMovimientoModulo tipomovimientomodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedItem(tipomovimientomodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedItem(tipomovimientomodulo);
						} else {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoDocumento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumento(this.tipodocumentoLogic.getTipoDocumentos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumento(this.tipodocumentos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoMovimiento.class));
		classes.add(new Classe(TipoMovimientoModulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodocumentoLogic.setTipoDocumentos(this.tipodocumentos);
			tipodocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDocumentoParameterReturnGeneral getTipoDocumentoParameterGeneral() {
		return this.tipodocumentoParameterGeneral;
	}
	
	public void setTipoDocumentoParameterGeneral(TipoDocumentoParameterReturnGeneral tipodocumentoParameterGeneral) {
		this.tipodocumentoParameterGeneral = tipodocumentoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDocumento() {
		return isPermisoTodoTipoDocumento;
	}

	public void setIsPermisoTodoTipoDocumento(Boolean isPermisoTodoTipoDocumento) {
		this.isPermisoTodoTipoDocumento = isPermisoTodoTipoDocumento;
	}

	public Boolean getIsPermisoNuevoTipoDocumento() {
		return isPermisoNuevoTipoDocumento;
	}

	public void setIsPermisoNuevoTipoDocumento(Boolean isPermisoNuevoTipoDocumento) {
		this.isPermisoNuevoTipoDocumento = isPermisoNuevoTipoDocumento;
	}

	public Boolean getIsPermisoActualizarTipoDocumento() {
		return isPermisoActualizarTipoDocumento;
	}

	public void setIsPermisoActualizarTipoDocumento(Boolean isPermisoActualizarTipoDocumento) {
		this.isPermisoActualizarTipoDocumento = isPermisoActualizarTipoDocumento;
	}

	public Boolean getIsPermisoEliminarTipoDocumento() {
		return isPermisoEliminarTipoDocumento;
	}

	public void setIsPermisoEliminarTipoDocumento(Boolean isPermisoEliminarTipoDocumento) {
		this.isPermisoEliminarTipoDocumento = isPermisoEliminarTipoDocumento;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDocumento() {
		return isPermisoGuardarCambiosTipoDocumento;
	}

	public void setIsPermisoGuardarCambiosTipoDocumento(Boolean isPermisoGuardarCambiosTipoDocumento) {
		this.isPermisoGuardarCambiosTipoDocumento = isPermisoGuardarCambiosTipoDocumento;
	}
	
	public Boolean getIsPermisoConsultaTipoDocumento() {
		return isPermisoConsultaTipoDocumento;
	}

	public void setIsPermisoConsultaTipoDocumento(Boolean isPermisoConsultaTipoDocumento) {
		this.isPermisoConsultaTipoDocumento = isPermisoConsultaTipoDocumento;
	}

	public Boolean getIsPermisoBusquedaTipoDocumento() {
		return isPermisoBusquedaTipoDocumento;
	}

	public void setIsPermisoBusquedaTipoDocumento(Boolean isPermisoBusquedaTipoDocumento) {
		this.isPermisoBusquedaTipoDocumento = isPermisoBusquedaTipoDocumento;
	}

	public Boolean getIsPermisoReporteTipoDocumento() {
		return isPermisoReporteTipoDocumento;
	}

	public void setIsPermisoReporteTipoDocumento(Boolean isPermisoReporteTipoDocumento) {
		this.isPermisoReporteTipoDocumento = isPermisoReporteTipoDocumento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDocumento() {
		return isPermisoPaginacionMedioTipoDocumento;
	}

	public void setIsPermisoPaginacionMedioTipoDocumento(Boolean isPermisoPaginacionMedioTipoDocumento) {
		this.isPermisoPaginacionMedioTipoDocumento = isPermisoPaginacionMedioTipoDocumento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDocumento() {
		return isPermisoPaginacionTodoTipoDocumento;
	}

	public void setIsPermisoPaginacionTodoTipoDocumento(Boolean isPermisoPaginacionTodoTipoDocumento) {
		this.isPermisoPaginacionTodoTipoDocumento = isPermisoPaginacionTodoTipoDocumento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDocumento() {
		return isPermisoPaginacionAltoTipoDocumento;
	}

	public void setIsPermisoPaginacionAltoTipoDocumento(Boolean isPermisoPaginacionAltoTipoDocumento) {
		this.isPermisoPaginacionAltoTipoDocumento = isPermisoPaginacionAltoTipoDocumento;
	}
	
	public Boolean getIsPermisoCopiarTipoDocumento() {
		return isPermisoCopiarTipoDocumento;
	}

	public void setIsPermisoCopiarTipoDocumento(Boolean isPermisoCopiarTipoDocumento) {
		this.isPermisoCopiarTipoDocumento = isPermisoCopiarTipoDocumento;
	}
	
	public Boolean getIsPermisoVerFormTipoDocumento() {
		return isPermisoVerFormTipoDocumento;
	}

	public void setIsPermisoVerFormTipoDocumento(Boolean isPermisoVerFormTipoDocumento) {
		this.isPermisoVerFormTipoDocumento = isPermisoVerFormTipoDocumento;
	}
	
	public Boolean getIsPermisoDuplicarTipoDocumento() {
		return isPermisoDuplicarTipoDocumento;
	}

	public void setIsPermisoDuplicarTipoDocumento(Boolean isPermisoDuplicarTipoDocumento) {
		this.isPermisoDuplicarTipoDocumento = isPermisoDuplicarTipoDocumento;
	}
	
	public Boolean getIsPermisoOrdenTipoDocumento() {
		return isPermisoOrdenTipoDocumento;
	}

	public void setIsPermisoOrdenTipoDocumento(Boolean isPermisoOrdenTipoDocumento) {
		this.isPermisoOrdenTipoDocumento = isPermisoOrdenTipoDocumento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDocumento() {
		return isVisibilidadCeldaNuevoTipoDocumento;
	}

	public void setIsVisibilidadCeldaNuevoTipoDocumento(Boolean isVisibilidadCeldaNuevoTipoDocumento) {
		this.isVisibilidadCeldaNuevoTipoDocumento = isVisibilidadCeldaNuevoTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDocumento() {
		return isVisibilidadCeldaDuplicarTipoDocumento;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDocumento(Boolean isVisibilidadCeldaDuplicarTipoDocumento) {
		this.isVisibilidadCeldaDuplicarTipoDocumento = isVisibilidadCeldaDuplicarTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDocumento() {
		return isVisibilidadCeldaCopiarTipoDocumento;
	}

	public void setIsVisibilidadCeldaCopiarTipoDocumento(Boolean isVisibilidadCeldaCopiarTipoDocumento) {
		this.isVisibilidadCeldaCopiarTipoDocumento = isVisibilidadCeldaCopiarTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDocumento() {
		return isVisibilidadCeldaVerFormTipoDocumento;
	}

	public void setIsVisibilidadCeldaVerFormTipoDocumento(Boolean isVisibilidadCeldaVerFormTipoDocumento) {
		this.isVisibilidadCeldaVerFormTipoDocumento = isVisibilidadCeldaVerFormTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDocumento() {
		return isVisibilidadCeldaOrdenTipoDocumento;
	}

	public void setIsVisibilidadCeldaOrdenTipoDocumento(Boolean isVisibilidadCeldaOrdenTipoDocumento) {
		this.isVisibilidadCeldaOrdenTipoDocumento = isVisibilidadCeldaOrdenTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDocumento() {
		return isVisibilidadCeldaNuevoRelacionesTipoDocumento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDocumento(Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumento) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDocumento = isVisibilidadCeldaNuevoRelacionesTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDocumento() {
		return isVisibilidadCeldaModificarTipoDocumento;
	}

	public void setIsVisibilidadCeldaModificarTipoDocumento(Boolean isVisibilidadCeldaModificarTipoDocumento) {
		this.isVisibilidadCeldaModificarTipoDocumento = isVisibilidadCeldaModificarTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDocumento() {
		return isVisibilidadCeldaActualizarTipoDocumento;
	}

	public void setIsVisibilidadCeldaActualizarTipoDocumento(Boolean isVisibilidadCeldaActualizarTipoDocumento) {
		this.isVisibilidadCeldaActualizarTipoDocumento = isVisibilidadCeldaActualizarTipoDocumento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDocumento() {
		return isVisibilidadCeldaEliminarTipoDocumento;
	}

	public void setIsVisibilidadCeldaEliminarTipoDocumento(Boolean isVisibilidadCeldaEliminarTipoDocumento) {
		this.isVisibilidadCeldaEliminarTipoDocumento = isVisibilidadCeldaEliminarTipoDocumento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDocumento() {
		return isVisibilidadCeldaCancelarTipoDocumento;
	}

	public void setIsVisibilidadCeldaCancelarTipoDocumento(Boolean isVisibilidadCeldaCancelarTipoDocumento) {
		this.isVisibilidadCeldaCancelarTipoDocumento = isVisibilidadCeldaCancelarTipoDocumento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDocumento() {
		return isVisibilidadCeldaGuardarTipoDocumento;
	}

	public void setIsVisibilidadCeldaGuardarTipoDocumento(Boolean isVisibilidadCeldaGuardarTipoDocumento) {
		this.isVisibilidadCeldaGuardarTipoDocumento = isVisibilidadCeldaGuardarTipoDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDocumento() {
		return isVisibilidadCeldaGuardarCambiosTipoDocumento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDocumento(Boolean isVisibilidadCeldaGuardarCambiosTipoDocumento) {
		this.isVisibilidadCeldaGuardarCambiosTipoDocumento = isVisibilidadCeldaGuardarCambiosTipoDocumento;
	}
		
	public TipoDocumentoSessionBean gettipodocumentoSessionBean() {
		return this.tipodocumentoSessionBean;
	}
	
	public void settipodocumentoSessionBean(TipoDocumentoSessionBean tipodocumentoSessionBean) {
		this.tipodocumentoSessionBean=tipodocumentoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo() {
		return this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo(Boolean isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo) {
		this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimientoModulo() {
		return this.isVisibilidadFK_IdTipoMovimientoModulo;
	}

	public void setisVisibilidadFK_IdTipoMovimientoModulo(Boolean isVisibilidadFK_IdTipoMovimientoModulo) {
		this.isVisibilidadFK_IdTipoMovimientoModulo=isVisibilidadFK_IdTipoMovimientoModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(TipoDocumento tipodocumento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodocumento,null);
				this.setActualParaGuardarModuloForeignKey(tipodocumento,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(tipodocumento,null);
				this.setActualParaGuardarTipoMovimientoModuloForeignKey(tipodocumento,null);
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
	
	public void bugActualizarReferenciaActual(TipoDocumento tipodocumento,TipoDocumento tipodocumentoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDocumento(tipodocumento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodocumentoAux.setId(tipodocumento.getId());
		tipodocumentoAux.setVersionRow(tipodocumento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDocumento();
		
			int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodocumentoValidator.getInvalidValues(this.tipodocumento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodocumentoLogic.setDatosCliente(datosCliente);
			tipodocumentoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodocumentoAux=new  TipoDocumento();
				
				tipodocumentoAux.setIsNew(true);
				tipodocumentoAux.setIsChanged(true);
				
				tipodocumentoAux.setTipoDocumentoOriginal(this.tipodocumento);
				
				tipodocumentoAux.setId(this.tipodocumento.getId());	
				tipodocumentoAux.setVersionRow(this.tipodocumento.getVersionRow());	
				tipodocumentoAux.setid_empresa(this.tipodocumento.getid_empresa());	
				tipodocumentoAux.setid_modulo(this.tipodocumento.getid_modulo());	
				tipodocumentoAux.setid_tipo_movimiento(this.tipodocumento.getid_tipo_movimiento());	
				tipodocumentoAux.setcodigo(this.tipodocumento.getcodigo());	
				tipodocumentoAux.setnombre(this.tipodocumento.getnombre());	
				tipodocumentoAux.setid_tipo_movimiento_modulo(this.tipodocumento.getid_tipo_movimiento_modulo());	
				tipodocumentoAux.setes_defecto(this.tipodocumento.getes_defecto());	
				tipodocumentoAux.setes_mayor(this.tipodocumento.getes_mayor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodocumentoAux,tipodocumentoLogic.getTipoDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentoAux,tipodocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.saveTipoDocumentos();//WithConnection
						//tipodocumentoLogic.getSetVersionRowTipoDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumento,tipodocumentoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodocumentoAux=new  TipoDocumento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodocumentoSessionBean.getEsGuardarRelacionado() && this.tipodocumento.getId()>=0)) {
						
					tipodocumentoAux.setIsNew(false);
				}
				
				tipodocumentoAux.setIsDeleted(false);
			
				tipodocumentoAux.setId(this.tipodocumento.getId());	
				tipodocumentoAux.setVersionRow(this.tipodocumento.getVersionRow());	
				tipodocumentoAux.setid_empresa(this.tipodocumento.getid_empresa());	
				tipodocumentoAux.setid_modulo(this.tipodocumento.getid_modulo());	
				tipodocumentoAux.setid_tipo_movimiento(this.tipodocumento.getid_tipo_movimiento());	
				tipodocumentoAux.setcodigo(this.tipodocumento.getcodigo());	
				tipodocumentoAux.setnombre(this.tipodocumento.getnombre());	
				tipodocumentoAux.setid_tipo_movimiento_modulo(this.tipodocumento.getid_tipo_movimiento_modulo());	
				tipodocumentoAux.setes_defecto(this.tipodocumento.getes_defecto());	
				tipodocumentoAux.setes_mayor(this.tipodocumento.getes_mayor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentoAux,tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentoAux,tipodocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.saveTipoDocumentos();//WithConnection
						//tipodocumentoLogic.getSetVersionRowTipoDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumento,tipodocumentoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodocumentoAux=new  TipoDocumento();
				
				tipodocumentoAux.setIsNew(false);
				tipodocumentoAux.setIsChanged(false);
				
				tipodocumentoAux.setIsDeleted(true);
				
				tipodocumentoAux.setId(this.tipodocumento.getId());	
				tipodocumentoAux.setVersionRow(this.tipodocumento.getVersionRow());	
				tipodocumentoAux.setid_empresa(this.tipodocumento.getid_empresa());	
				tipodocumentoAux.setid_modulo(this.tipodocumento.getid_modulo());	
				tipodocumentoAux.setid_tipo_movimiento(this.tipodocumento.getid_tipo_movimiento());	
				tipodocumentoAux.setcodigo(this.tipodocumento.getcodigo());	
				tipodocumentoAux.setnombre(this.tipodocumento.getnombre());	
				tipodocumentoAux.setid_tipo_movimiento_modulo(this.tipodocumento.getid_tipo_movimiento_modulo());	
				tipodocumentoAux.setes_defecto(this.tipodocumento.getes_defecto());	
				tipodocumentoAux.setes_mayor(this.tipodocumento.getes_mayor());	
				
				if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodocumentoAux.getId()>=0) {	
						this.tipodocumentosEliminados.add(tipodocumentoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodocumentoAux,tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentoAux,tipodocumentos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.saveTipoDocumentos();//WithConnection
						//tipodocumentoLogic.getSetVersionRowTipoDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getTipoDocumentos().addAll(this.tipodocumentosEliminados);
					
					tipodocumentoLogic.saveTipoDocumentos();//WithConnection
					//tipodocumentoLogic.getSetVersionRowTipoDocumentos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDocumento();
				
				this.tipodocumentosEliminados= new ArrayList<TipoDocumento>();		
			}
			
			if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Documento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodocumento=tipodocumentoAux;
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
      		//this.finishProcessTipoDocumento();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDocumento tipodocumentoLocal) throws Exception {
		
		if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDocumento tipodocumentoLocal) throws Exception {	
		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodocumentoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				tipodocumentoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				tipodocumentoLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoModuloDetalleFormJInternalFrame.class)) {
				TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrameLocal=(TipoMovimientoModuloBeanSwingJInternalFrame) ((TipoMovimientoModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientomoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimientoModulo(tipomovimientomoduloBeanSwingJInternalFrameLocal.gettipomovimientomodulo(),true);
				tipomovimientomoduloBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo,this.tipomovimientomodulosForeignKey);

				tipomovimientomoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo);

				tipodocumentoLocal.setTipoMovimientoModulo(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo);

				this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
				this.cargarCombosFrameTipoMovimientoModulosForeignKey("Formulario");
				this.setActualTipoMovimientoModuloForeignKey(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDocumentoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodocumentoValidator.getInvalidValues(this.tipodocumento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDocumento tipodocumento,List<TipoDocumento> tipodocumentos) throws Exception {
		try	{		
			TipoDocumentoConstantesFunciones.actualizarLista(tipodocumento,tipodocumentos,this.tipodocumentoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDocumento tipodocumento,List<TipoDocumento> tipodocumentos) throws Exception {
		try	{			
			TipoDocumentoConstantesFunciones.actualizarSelectedLista(tipodocumento,tipodocumentos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDocumento> tipodocumentosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodocumentosLocal=this.tipodocumentoLogic.getTipoDocumentos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodocumentosLocal=this.tipodocumentos;
			}
			//ARCHITECTURE
		
			for(TipoDocumento tipodocumentoLocal:tipodocumentosLocal) {
				if(this.permiteMantenimiento(tipodocumentoLocal) && tipodocumentoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDocumentoConstantesFunciones.getTipoDocumentoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_empresaTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_moduloTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_tipo_movimientoTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelcodigoTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelnombreTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.IDTIPOMOVIMIENTOMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_tipo_movimiento_moduloTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_defectoTipoDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoConstantesFunciones.ESMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_mayorTipoDocumento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_empresaTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_moduloTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_tipo_movimientoTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelcodigoTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelnombreTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabelid_tipo_movimiento_moduloTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_defectoTipoDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_mayorTipoDocumento,"");
		
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
		this.iIdNuevoTipoDocumento--;	
		
		
		this.tipodocumentoAux=new TipoDocumento();
		
		this.tipodocumentoAux.setId(this.iIdNuevoTipoDocumento);
		this.tipodocumentoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumentoLogic.getTipoDocumentos().add(this.tipodocumentoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodocumentos.add(this.tipodocumentoAux);
		}
		//ARCHITECTURE
		
		this.tipodocumento=this.tipodocumentoAux;
		
		if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDocumento(this.tipodocumento);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumento(this.tipodocumento);
		}
				
		//this.setDefaultControlesTipoDocumento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDocumento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDocumento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumento(this.tipodocumentoBean,this.tipodocumento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDocumentoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
			classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodocumentoReturnGeneral=tipodocumentoLogic.procesarEventosTipoDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentoLogic.getTipoDocumentos(),this.tipodocumento,this.tipodocumentoParameterGeneral,this.isEsNuevoTipoDocumento,classes);//this.tipodocumentoLogic.getTipoDocumento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDocumento(this.tipodocumentoReturnGeneral,this.tipodocumentoBean,false);
		
		if(this.tipodocumentoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento());
		}
		
		if(this.tipodocumentoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento(),classes);//this.tipodocumentoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDocumento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDocumento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.RecargarFormTipoDocumento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDocumento(false);
						
			if(tipodocumentoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumento();
			}
			
			this.actualizarVisualTableDatosTipoDocumento();
			
			this.jTableDatosTipoDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDocumento(), this.getIndiceNuevoTipoDocumento());
			
			this.seleccionarFilaTablaTipoDocumentoActual();
						
			this.actualizarEstadoCeldasBotonesTipoDocumento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDocumento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarcodigoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarnombreTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activares_defectoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activares_mayorTipoDocumento);	
		//
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarid_empresaTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarid_moduloTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarid_tipo_movimientoTipoDocumento);//
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setEnabled(isHabilitar && this.tipodocumentoConstantesFunciones.activarid_tipo_movimiento_moduloTipoDocumento);
	};
	
	public void setDefaultControlesTipoDocumento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDocumento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodocumentoSessionBean.setConGuardarRelaciones(true);			
			this.tipodocumentoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.setVisible(true);
			
					
		} else {
			//this.tipodocumentoSessionBean.setConGuardarRelaciones(false);			
			this.tipodocumentoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDocumento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
				if(tipodocumentoAux.getId().equals(this.iIdNuevoTipoDocumento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentos) {
				if(tipodocumentoAux.getId().equals(this.iIdNuevoTipoDocumento)) {
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
	
	public int getIndiceActualTipoDocumento(TipoDocumento tipodocumento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
				if(tipodocumentoAux.getId().equals(tipodocumento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentos) {
				if(tipodocumentoAux.getId().equals(tipodocumento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDocumento(TipoDocumento tipodocumentoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
				if(tipodocumentoAux.getTipoDocumentoOriginal().getId().equals(tipodocumentoOriginal.getId())) {
					existe=true;
					tipodocumentoOriginal.setId(tipodocumentoAux.getId());
					tipodocumentoOriginal.setVersionRow(tipodocumentoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumento tipodocumentoAux:this.tipodocumentos) {
				if(tipodocumentoAux.getTipoDocumentoOriginal().getId().equals(tipodocumentoOriginal.getId())) {
					existe=true;
					tipodocumentoOriginal.setId(tipodocumentoAux.getId());
					tipodocumentoOriginal.setVersionRow(tipodocumentoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDocumento(Boolean esParaCancelar) throws Exception {
		tipodocumentosAux=new ArrayList<TipoDocumento>();
		tipodocumentoAux=new TipoDocumento();
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
					if(tipodocumentoAux.getId()<0) {
						tipodocumentosAux.add(tipodocumentoAux);
					}		
				}
				this.iIdNuevoTipoDocumento=0L;
				this.tipodocumentoLogic.getTipoDocumentos().removeAll(tipodocumentosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumento tipodocumentoAux:this.tipodocumentos) {
					if(tipodocumentoAux.getId()<0) {
						tipodocumentosAux.add(tipodocumentoAux);
					}		
				}
				this.iIdNuevoTipoDocumento=0L;
				this.tipodocumentos.removeAll(tipodocumentosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDocumento 
					&& this.tipodocumentoLogic.getTipoDocumentos().size()>0
					) {
					tipodocumentoAux=this.tipodocumentoLogic.getTipoDocumentos().get(this.tipodocumentoLogic.getTipoDocumentos().size() - 1);
				
					if(tipodocumentoAux.getId()<0) {
						this.tipodocumentoLogic.getTipoDocumentos().remove(tipodocumentoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDocumento && this.tipodocumentos.size()>0) {
					tipodocumentoAux=this.tipodocumentos.get(this.tipodocumentos.size() - 1);
				
					if(tipodocumentoAux.getId()<0) {
						this.tipodocumentos.remove(tipodocumentoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDocumento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodocumento.getId()<0) {
				this.tipodocumentoLogic.getTipoDocumentos().remove(this.tipodocumento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodocumento.getId()<0) {
				this.tipodocumentos.remove(this.tipodocumento);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDocumento(List<TipoDocumento> tipodocumentosAux) throws Exception {
		TipoDocumentoConstantesFunciones.setEstadosInicialesTipoDocumento(tipodocumentosAux);
	}
	
	public void setEstadosInicialesTipoDocumento(TipoDocumento tipodocumentoAux) throws Exception {
		TipoDocumentoConstantesFunciones.setEstadosInicialesTipoDocumento(tipodocumentoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDocumentoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDocumentoActual()) {
				if(!this.isEsNuevoTipoDocumento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDocumento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDocumentoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Documento ?", "MANTENIMIENTO DE Tipo Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDocumento tipodocumento) throws Exception {
		TipoDocumentoConstantesFunciones.seleccionarAsignar(this.tipodocumento,tipodocumento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDocumento=this.isPermisoActualizarOriginalTipoDocumento;
			
			
			this.seleccionarAsignar(tipodocumento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDocumentoConstantesFunciones.quitarEspaciosTipoDocumento(this.tipodocumento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodocumentoSessionBean.setsFuncionBusquedaRapida(this.tipodocumentoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDocumento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDocumento(esParaCancelar);				
				this.cancelarNuevoTipoDocumento(esParaCancelar);								
			}
			
			this.tipodocumento=new TipoDocumento();
			
			this.inicializarTipoDocumento();
			
			this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDocumento() throws Exception {
		try {
			TipoDocumentoConstantesFunciones.inicializarTipoDocumento(this.tipodocumento);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodocumentoLogic.getTipoDocumentos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDocumentos(String sAccionBusqueda,List<TipoDocumento> tipodocumentosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDocumento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDocumentoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDocumentoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDocumento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Documentos");		
		parameters.put("busquedapor", TipoDocumentoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDocumento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDocumento=new JRBeanArrayDataSource(TipoDocumentoJInternalFrame.TraerTipoDocumentoBeans(tipodocumentosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDocumento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDocumentoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDocumentoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDocumentoBean.TraerTipoDocumentoBeans(tipodocumentosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDocumentoActionPerformed(null);
					//this.generarExcelReporteTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodocumentosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumento> tipodocumentosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDocumento tipodocumento : tipodocumentosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDocumentoConstantesFunciones.generarExcelReporteDataTipoDocumento("NORMAL",row,workbook,tipodocumento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDocumento(String sTipo,Row row,Workbook workbook) {
		
		TipoDocumentoConstantesFunciones.generarExcelReporteHeaderTipoDocumento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumento> tipodocumentosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDocumento tipodocumento : tipodocumentosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumento.gettipomovimientomodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipodocumento.getes_defecto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipodocumento.getes_mayor()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumento> tipodocumentosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDocumento> tipodocumentosRespaldo=null;
		
		classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodocumentoLogic.setDatosCliente(this.datosCliente);
		this.tipodocumentoLogic.setDatosDeep(this.datosDeep);
		this.tipodocumentoLogic.setIsConDeep(true);
		
		tipodocumentosRespaldo=this.tipodocumentoLogic.getTipoDocumentos();
		
		this.tipodocumentoLogic.setTipoDocumentos(tipodocumentosParaReportes);	
		this.tipodocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodocumentosParaReportes=this.tipodocumentoLogic.getTipoDocumentos();
		this.tipodocumentoLogic.setTipoDocumentos(tipodocumentosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDocumento tipodocumento : tipodocumentosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDocumento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDocumentoConstantesFunciones.generarExcelReporteDataTipoDocumento("NORMAL",row,workbook,tipodocumento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDocumento() throws Exception {		
		this.startProcessTipoDocumento(true);
	}
	
	public void startProcessTipoDocumento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDocumento ,this.jPanelParametrosReportesTipoDocumento, this.jScrollPanelDatosTipoDocumento,this.jPanelPaginacionTipoDocumento, this.jScrollPanelDatosEdicionTipoDocumento, this.jPanelAccionesTipoDocumento,this.jPanelAccionesFormularioTipoDocumento,this.jmenuBarTipoDocumento,this.jmenuBarDetalleTipoDocumento,this.jTtoolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumento=this.jTabbedPaneBusquedasTipoDocumento; 
		
		final JPanel jPanelParametrosReportesTipoDocumento=this.jPanelParametrosReportesTipoDocumento;
		//final JScrollPane jScrollPanelDatosTipoDocumento=this.jScrollPanelDatosTipoDocumento;
		final JTable jTableDatosTipoDocumento=this.jTableDatosTipoDocumento;		
		final JPanel jPanelPaginacionTipoDocumento=this.jPanelPaginacionTipoDocumento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumento=this.jScrollPanelDatosEdicionTipoDocumento;
		final JPanel jPanelAccionesTipoDocumento=this.jPanelAccionesTipoDocumento;
		
		JPanel jPanelCamposAuxiliarTipoDocumento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			jPanelCamposAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jPanelCamposTipoDocumento;
			jPanelAccionesFormularioAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jPanelAccionesFormularioTipoDocumento;
		}
		
		final JPanel jPanelCamposTipoDocumento=jPanelCamposAuxiliarTipoDocumento;
		final JPanel jPanelAccionesFormularioTipoDocumento=jPanelAccionesFormularioAuxiliarTipoDocumento;
		
		
		final JMenuBar jmenuBarTipoDocumento=this.jmenuBarTipoDocumento;
		final JToolBar jTtoolBarTipoDocumento=this.jTtoolBarTipoDocumento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			jmenuBarDetalleAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jmenuBarDetalleTipoDocumento;
			jTtoolBarDetalleAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jTtoolBarDetalleTipoDocumento;
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumento=jmenuBarDetalleAuxiliarTipoDocumento;
		final JToolBar jTtoolBarDetalleTipoDocumento=jTtoolBarDetalleAuxiliarTipoDocumento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumento;
			processRunnable.jTableDatos=jTableDatosTipoDocumento;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumento;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumento ,jPanelParametrosReportesTipoDocumento,jTableDatosTipoDocumento, /*jScrollPanelDatosTipoDocumento,*/jPanelCamposTipoDocumento,jPanelPaginacionTipoDocumento, /*jScrollPanelDatosEdicionTipoDocumento,*/ jPanelAccionesTipoDocumento,jPanelAccionesFormularioTipoDocumento,jmenuBarTipoDocumento,jmenuBarDetalleTipoDocumento,jTtoolBarTipoDocumento,jTtoolBarDetalleTipoDocumento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumento ,jPanelParametrosReportesTipoDocumento, jScrollPanelDatosTipoDocumento,jPanelPaginacionTipoDocumento, jScrollPanelDatosEdicionTipoDocumento, jPanelAccionesTipoDocumento,jPanelAccionesFormularioTipoDocumento,jmenuBarTipoDocumento,jmenuBarDetalleTipoDocumento,jTtoolBarTipoDocumento,jTtoolBarDetalleTipoDocumento);
						
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
	
	public void finishProcessTipoDocumento() {// throws Exception 
		this.finishProcessTipoDocumento(true);
	}
	
	public void finishProcessTipoDocumento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDocumento ,this.jPanelParametrosReportesTipoDocumento, this.jScrollPanelDatosTipoDocumento,this.jPanelPaginacionTipoDocumento, this.jScrollPanelDatosEdicionTipoDocumento, this.jPanelAccionesTipoDocumento,this.jPanelAccionesFormularioTipoDocumento,this.jmenuBarTipoDocumento,this.jmenuBarDetalleTipoDocumento,this.jTtoolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumento=this.jTabbedPaneBusquedasTipoDocumento; 
		
		final JPanel jPanelParametrosReportesTipoDocumento=this.jPanelParametrosReportesTipoDocumento;
		//final JScrollPane jScrollPanelDatosTipoDocumento=this.jScrollPanelDatosTipoDocumento;
		final JTable jTableDatosTipoDocumento=this.jTableDatosTipoDocumento;		
		final JPanel jPanelPaginacionTipoDocumento=this.jPanelPaginacionTipoDocumento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumento=this.jScrollPanelDatosEdicionTipoDocumento;
		final JPanel jPanelAccionesTipoDocumento=this.jPanelAccionesTipoDocumento;
		
		JPanel jPanelCamposAuxiliarTipoDocumento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			jPanelCamposAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jPanelCamposTipoDocumento;
			jPanelAccionesFormularioAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jPanelAccionesFormularioTipoDocumento;
		}
		
		final JPanel jPanelCamposTipoDocumento=jPanelCamposAuxiliarTipoDocumento;
		final JPanel jPanelAccionesFormularioTipoDocumento=jPanelAccionesFormularioAuxiliarTipoDocumento;
		
		
		final JMenuBar jmenuBarTipoDocumento=this.jmenuBarTipoDocumento;		
		final JToolBar jTtoolBarTipoDocumento=this.jTtoolBarTipoDocumento;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			jmenuBarDetalleAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jmenuBarDetalleTipoDocumento;
			jTtoolBarDetalleAuxiliarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jTtoolBarDetalleTipoDocumento;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumento=jmenuBarDetalleAuxiliarTipoDocumento;
		final JToolBar jTtoolBarDetalleTipoDocumento=jTtoolBarDetalleAuxiliarTipoDocumento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumento;
			processRunnable.jTableDatos=jTableDatosTipoDocumento;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumento;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDocumento ,jPanelParametrosReportesTipoDocumento, jTableDatosTipoDocumento,/*jScrollPanelDatosTipoDocumento,*/jPanelCamposTipoDocumento,jPanelPaginacionTipoDocumento, /*jScrollPanelDatosEdicionTipoDocumento,*/ jPanelAccionesTipoDocumento,jPanelAccionesFormularioTipoDocumento,jmenuBarTipoDocumento,jmenuBarDetalleTipoDocumento,jTtoolBarTipoDocumento,jTtoolBarDetalleTipoDocumento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDocumento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDocumento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDocumento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDocumento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDocumento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodocumentoConstantesFunciones.getsFinalQueryTipoDocumento();
		String  finalQueryPaginacionTodos=this.tipodocumentoConstantesFunciones.getsFinalQueryTipoDocumento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesNoTipoDocumento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodocumentosEliminados= new ArrayList<TipoDocumento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDocumento();
		
				///*TipoDocumentoSessionBean*/this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			
			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
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
					this.iNumeroPaginacion=TipoDocumentoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDocumentoConstantesFunciones.getClassesForeignKeysOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodocumento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodocumentosAux= new ArrayList<TipoDocumento>();
			
				
			tipodocumentoLogic.setDatosCliente(this.datosCliente);
			tipodocumentoLogic.setDatosDeep(this.datosDeep);
			tipodocumentoLogic.setIsConDeep(true);
			
			
			tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodocumentoLogic.getTodosTipoDocumentos(finalQueryGlobal,pagination);
					
					//tipodocumentoLogic.getTodosTipoDocumentosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodocumentoLogic.getTipoDocumentos()==null|| tipodocumentoLogic.getTipoDocumentos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentosAux= new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux= new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentoLogic.getTodosTipoDocumentos(finalQueryGlobal+"",this.pagination);												
							
							//tipodocumentoLogic.getTodosTipoDocumentosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDocumentos("Todos",tipodocumentoLogic.getTipoDocumentos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());					
							tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDocumento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDocumento=this.idActual;
				
				} else if(this.idTipoDocumentoActual!=null && this.idTipoDocumentoActual!=0L) {
					idTipoDocumento=idTipoDocumentoActual;
				}
				
					
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndicePorId(idTipoDocumento);
				
				this.tipodocumentos=new ArrayList<TipoDocumento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodocumentoLogic.getEntity(idTipoDocumento);
					
					//tipodocumentoLogic.getEntityWithConnection(idTipoDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
					tipodocumentoLogic.getTipoDocumentos().add(tipodocumentoLogic.getTipoDocumento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentos=new ArrayList<TipoDocumento>();
					this.tipodocumentos.add(tipodocumento);
				}
				
				if(tipodocumentoLogic.getTipoDocumento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("BusquedaPorCodigo",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("BusquedaPorCodigo",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoMovimientoModulo(id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoMovimientoModulo(id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoMovimientoModulo(id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoMovimientoModulo(id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoMovimientoModulo(id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo,id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("BusquedaPorIdModuloPorIdTipoMovimientoModulo",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("BusquedaPorIdModuloPorIdTipoMovimientoModulo",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("BusquedaPorNombre",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("BusquedaPorNombre",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("FK_IdEmpresa",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("FK_IdEmpresa",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("FK_IdModulo",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("FK_IdModulo",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMovimiento")) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentoLogic.getTipoDocumentosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentoLogic.getTipoDocumentos()==null||tipodocumentoLogic.getTipoDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentos==null|| tipodocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentosAux=new ArrayList<TipoDocumento>();
						tipodocumentosAux.addAll(tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentosAux=new ArrayList<TipoDocumento>();
							tipodocumentosAux.addAll(tipodocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentoLogic.getTipoDocumentosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentos("FK_IdTipoMovimiento",tipodocumentoLogic.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentos("FK_IdTipoMovimiento",tipodocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
						tipodocumentoLogic.getTipoDocumentos().addAll(tipodocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentos=new ArrayList<TipoDocumento>();
							tipodocumentos.addAll(tipodocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDocumento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDocumento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentoLogic.getTipoDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentoLogic.getTipoDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDocumento tipodocumento) {
		Boolean permite=true;
		
		if(this.tipodocumento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDocumentoConstantesFunciones.getOrderByListaTipoDocumento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDocumentoConstantesFunciones.getOrderByListaTipoDocumento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumento tipodocumento:tipodocumentoLogic.getTipoDocumentos()) {
				if(tipodocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentoTotales=tipodocumento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumento tipodocumento:this.tipodocumentos) {
				if(tipodocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentoTotales=tipodocumento;
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
			this.tipodocumentoAux=new TipoDocumento();
			this.tipodocumentoAux.setsType(Constantes2.S_TOTALES);
			this.tipodocumentoAux.setIsNew(false);
			this.tipodocumentoAux.setIsChanged(false);
			this.tipodocumentoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDocumentoConstantesFunciones.TotalizarValoresFilaTipoDocumento(this.tipodocumentoLogic.getTipoDocumentos(),this.tipodocumentoAux);
				
				this.tipodocumentoLogic.getTipoDocumentos().add(this.tipodocumentoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDocumentoConstantesFunciones.TotalizarValoresFilaTipoDocumento(this.tipodocumentos,this.tipodocumentoAux);
				
				this.tipodocumentos.add(this.tipodocumentoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodocumentoTotales=new TipoDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentoLogic.getTipoDocumentos().remove(tipodocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentos.remove(tipodocumentoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodocumentoTotales=new TipoDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumento tipodocumento:tipodocumentoLogic.getTipoDocumentos()) {
				if(tipodocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentoTotales=tipodocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoConstantesFunciones.TotalizarValoresFilaTipoDocumento(this.tipodocumentoLogic.getTipoDocumentos(),tipodocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumento tipodocumento:this.tipodocumentos) {
				if(tipodocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentoTotales=tipodocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoConstantesFunciones.TotalizarValoresFilaTipoDocumento(this.tipodocumentos,tipodocumentoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDocumentosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorIdTipoMovimientoModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentosFK_IdTipoMovimientoModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimientoModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentoPorEmpresaPorModuloPorTipoMoviModu()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorModuloPorTipoMoviModu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoPorIdPorEmprePorModuPorTiMovPorTiMovModu()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmprePorModuPorTiMovPorTiMovModu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoPorIdPorEmpresaPorModuPorTiMoviModu()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmpresaPorModuPorTiMoviModu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoDocumentosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo(String sFinalQuery,Long id_modulo,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo(sFinalQuery,this.pagination,id_modulo,id_tipo_movimiento_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentosFK_IdTipoMovimientoModulo(String sFinalQuery,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentosFK_IdTipoMovimientoModulo(sFinalQuery,this.pagination,id_tipo_movimiento_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoPorEmpresaPorModuloPorTipoMoviModu(Long id_empresa,Long id_modulo,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoPorEmpresaPorModuloPorTipoMoviModu(id_empresa,id_modulo,id_tipo_movimiento_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoPorIdPorEmprePorModuPorTiMovPorTiMovModu(Long id,Long id_empresa,Long id_modulo,Long id_tipo_movimiento,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoPorIdPorEmprePorModuPorTiMovPorTiMovModu(id,id_empresa,id_modulo,id_tipo_movimiento,id_tipo_movimiento_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoPorIdPorEmpresaPorModuPorTiMoviModu(Long id,Long id_empresa,Long id_modulo,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoPorIdPorEmpresaPorModuPorTiMoviModu(id,id_empresa,id_modulo,id_tipo_movimiento_modulo);
				
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
	
	public void inicializarPermisosTipoDocumento() {
		this.isPermisoTodoTipoDocumento=false;
		this.isPermisoNuevoTipoDocumento=false;
		this.isPermisoActualizarTipoDocumento=false;
		this.isPermisoActualizarOriginalTipoDocumento=false;
		this.isPermisoEliminarTipoDocumento=false;
		this.isPermisoGuardarCambiosTipoDocumento=false;
		this.isPermisoConsultaTipoDocumento=false;
		this.isPermisoBusquedaTipoDocumento=false;
		this.isPermisoReporteTipoDocumento=false;		
		this.isPermisoOrdenTipoDocumento=false;		
		this.isPermisoPaginacionMedioTipoDocumento=false;		
		this.isPermisoPaginacionAltoTipoDocumento=false;
		this.isPermisoPaginacionTodoTipoDocumento=false;
		this.isPermisoCopiarTipoDocumento=false;		
		this.isPermisoVerFormTipoDocumento=false;		
		this.isPermisoDuplicarTipoDocumento=false;		
		this.isPermisoOrdenTipoDocumento=false;		
	}
	
	public void setPermisosUsuarioTipoDocumento(Boolean isPermiso) {
		this.isPermisoTodoTipoDocumento=isPermiso;
		this.isPermisoNuevoTipoDocumento=isPermiso;
		this.isPermisoActualizarTipoDocumento=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumento=isPermiso;
		this.isPermisoEliminarTipoDocumento=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumento=isPermiso;
		this.isPermisoConsultaTipoDocumento=isPermiso;
		this.isPermisoBusquedaTipoDocumento=isPermiso;
		this.isPermisoReporteTipoDocumento=isPermiso;
		this.isPermisoOrdenTipoDocumento=isPermiso;		
		this.isPermisoPaginacionMedioTipoDocumento=isPermiso;		
		this.isPermisoPaginacionAltoTipoDocumento=isPermiso;		
		this.isPermisoPaginacionTodoTipoDocumento=isPermiso;		
		this.isPermisoCopiarTipoDocumento=isPermiso;		
		this.isPermisoVerFormTipoDocumento=isPermiso;		
		this.isPermisoDuplicarTipoDocumento=isPermiso;
		this.isPermisoOrdenTipoDocumento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDocumento(Boolean isPermiso) {
		//this.isPermisoTodoTipoDocumento=isPermiso;
		this.isPermisoNuevoTipoDocumento=isPermiso;
		this.isPermisoActualizarTipoDocumento=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumento=isPermiso;
		this.isPermisoEliminarTipoDocumento=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumento=isPermiso;
		//this.isPermisoConsultaTipoDocumento=isPermiso;
		//this.isPermisoBusquedaTipoDocumento=isPermiso;
		//this.isPermisoReporteTipoDocumento=isPermiso;
		//this.isPermisoOrdenTipoDocumento=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDocumento=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDocumento=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDocumento=isPermiso;		
		//this.isPermisoCopiarTipoDocumento=isPermiso;		
		//this.isPermisoDuplicarTipoDocumento=isPermiso;
		//this.isPermisoOrdenTipoDocumento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDocumento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDocumentoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDocumentoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDocumentoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDocumento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDocumentoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDocumento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDocumento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDocumento=this.isPermisoActualizarTipoDocumento;
			this.isPermisoEliminarTipoDocumento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDocumento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDocumento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDocumento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDocumento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDocumento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDocumento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDocumento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDocumento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDocumento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDocumento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDocumento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDocumento.setToolTipText(this.jTableDatosTipoDocumento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDocumento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDocumento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDocumento() throws Exception {
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
	public void inicializarCombosForeignKeyTipoDocumentoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
				this.tipomovimientomodulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDocumentoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDocumentoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.tipomovimientomodulosForeignKey==null||this.tipomovimientomodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesTipoMovimientoModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientoModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDocumentoParameterReturnGeneral tipodocumentoReturnGeneral=new TipoDocumentoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodocumentoConstantesFunciones.cargarid_empresaTipoDocumento)
					 || (this.esRecargarFks && this.tipodocumentoConstantesFunciones.cargarid_empresaTipoDocumento)) {

					if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodocumentoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.tipodocumentoConstantesFunciones.cargarid_moduloTipoDocumento)
					 || (this.esRecargarFks && this.tipodocumentoConstantesFunciones.cargarid_moduloTipoDocumento)) {

					if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+tipodocumentoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.tipodocumentoConstantesFunciones.cargarid_tipo_movimientoTipoDocumento)
					 || (this.esRecargarFks && this.tipodocumentoConstantesFunciones.cargarid_tipo_movimientoTipoDocumento)) {

					if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+tipodocumentoSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}


				String finalQueryGlobalTipoMovimientoModulo="";

				if(cargarCombosDependencia && ((this.tipomovimientomodulosForeignKey==null||this.tipomovimientomodulosForeignKey.size()<=0) && this.tipodocumentoConstantesFunciones.cargarid_tipo_movimiento_moduloTipoDocumento)
					 || (this.esRecargarFks && this.tipodocumentoConstantesFunciones.cargarid_tipo_movimiento_moduloTipoDocumento)) {

					if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesTipoMovimientoModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimientoModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimientoModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimientoModulo, "");
						finalQueryGlobalTipoMovimientoModulo+=TipoMovimientoModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientoModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimientoModulo=" WHERE " + ConstantesSql.ID + "="+tipodocumentoSessionBean.getlidTipoMovimientoModuloActual();
					}
				} else {
					finalQueryGlobalTipoMovimientoModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodocumentoReturnGeneral=tipodocumentoLogic.cargarCombosLoteForeignKeyTipoDocumento(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTipoMovimiento,finalQueryGlobalTipoMovimientoModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodocumentoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=tipodocumentoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=tipodocumentoReturnGeneral.gettipomovimientosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimientoModulo.equals("NONE")) {
				this.tipomovimientomodulosForeignKey=tipodocumentoReturnGeneral.gettipomovimientomodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDocumento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
			this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodocumentoSessionBean==null) {
				this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimientoModulo()throws Exception {
		try {

			if(!this.tipodocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {
				TipoMovimientoModulo tipomovimientomodulo=new TipoMovimientoModulo();
				TipoMovimientoModuloConstantesFunciones.setTipoMovimientoModuloDescripcion(tipomovimientomodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimientomodulo.setId(null);

				if(!TipoMovimientoModuloConstantesFunciones.ExisteEnLista(this.tipomovimientomodulosForeignKey,tipomovimientomodulo,true)) {

					this.tipomovimientomodulosForeignKey.add(0,tipomovimientomodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoDocumento()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyModulo(JComboBox jComboBoxModuloGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Modulo moduloLocal=(Modulo)jComboBoxModuloGenerico.getSelectedItem();

			if(moduloLocal!=null  && moduloLocal.getId()!=null  && moduloLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_modulo="+moduloLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboTipoMovimientoModulo=sFinalQueryCombo;

			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();
			this.cargarCombosForeignKeyTipoMovimientoModulo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.addItemListener(new ComboBoxItemListener(this,"id_moduloTipoDocumento"));
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"id_moduloTipoDocumento"));
					}
				} else {
					if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.addActionListener(new ComboBoxActionListener(this,"id_moduloTipoDocumento"));
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"id_moduloTipoDocumento"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloFK_IdModuloTipoDocumento.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloFK_IdModuloTipoDocumento"));

						this.jComboBoxid_moduloFK_IdModuloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloFK_IdModuloTipoDocumento"));

					} else {
						this.jComboBoxid_moduloFK_IdModuloTipoDocumento.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloFK_IdModuloTipoDocumento"));

						this.jComboBoxid_moduloFK_IdModuloTipoDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloFK_IdModuloTipoDocumento"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyTipoDocumento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDocumento(TipoDocumento tipodocumento)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(tipodocumento.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(tipodocumento.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoMovimientoModuloForeignKey(tipodocumento.getid_tipo_movimiento_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDocumento(TipoDocumento tipodocumento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDocumento()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.tipodocumentoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(this.tipodocumentoConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoMovimientoModuloForeignKey(this.tipodocumentoConstantesFunciones.getid_tipo_movimiento_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDocumento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDocumento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientoModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormTipoDocumentoModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormTipoDocumentoid_tipo_movimiento_modulo(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}




	
	



	public void recargarFormTipoDocumentoid_tipo_movimiento_modulo(JComboBox<?> jComboBoxGenericoTipoMovimientoModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.tipodocumento,jComboBoxGenericoTipoMovimientoModulo);
			}

			if(this.tipodocumento.getid_modulo()!=null && this.tipodocumento.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.tipodocumento.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoMovimientoModuloForeignKey(this.tipodocumento.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoMovimientoModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public TipoDocumentoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDocumentoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDocumentoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodocumentoSessionBean=new TipoDocumentoSessionBean(); 
		this.tipodocumentoConstantesFunciones=new TipoDocumentoConstantesFunciones(); 
		this.tipodocumentoBean=new TipoDocumento();//(this.tipodocumentoConstantesFunciones); 		
		this.tipodocumentoReturnGeneral=new TipoDocumentoParameterReturnGeneral(); 
		
		this.tipodocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDocumento(true);
			
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
			
			this.tipodocumentoConstantesFunciones=new TipoDocumentoConstantesFunciones(); 
			this.tipodocumentoBean=new TipoDocumento();//this.tipodocumentoConstantesFunciones); 			
			this.tipodocumentoReturnGeneral=new TipoDocumentoParameterReturnGeneral(); 
		
			TipoDocumentoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodocumento=new TipoDocumento();
			this.tipodocumentos = new ArrayList<TipoDocumento>();
			this.tipodocumentosAux = new ArrayList<TipoDocumento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic=new TipoDocumentoLogic();
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDocumento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumento);	
					}
					
					if(this.jInternalFrameImportacionTipoDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDocumento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumento);
				this.jInternalFrameDetalleFormTipoDocumento.setVisible(false);
				this.jInternalFrameDetalleFormTipoDocumento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumento);
					this.jInternalFrameReporteDinamicoTipoDocumento.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDocumento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumento);
					this.jInternalFrameImportacionTipoDocumento.setVisible(false);
					this.jInternalFrameImportacionTipoDocumento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumento);
					this.jInternalFrameOrderByTipoDocumento.setVisible(false);
					this.jInternalFrameOrderByTipoDocumento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDocumentoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDocumentoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodocumentoReturnGeneral=new TipoDocumentoParameterReturnGeneral();
			
			this.tipodocumentoParameterGeneral=new TipoDocumentoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodocumentoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentoSessionBean.getEsGuardarRelacionado(),this.tipodocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentoSessionBean.getEsGuardarRelacionado(),this.tipodocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaDuplicarTipoDocumento=true;
			this.isVisibilidadCeldaCopiarTipoDocumento=true;
			this.isVisibilidadCeldaVerFormTipoDocumento=true;
			this.isVisibilidadCeldaOrdenTipoDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=false;
			this.isVisibilidadCeldaGuardarTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			this.isVisibilidadFK_IdTipoMovimientoModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDocumento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDocumento(false);
			
			this.setPermisosUsuarioTipoDocumento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodocumentoSessionBean.getEsGuardarRelacionado() && this.tipodocumentoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDocumentoClasesRelacionadas();
			}
			
			if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDocumentoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDocumento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDocumento();
			}
			
			if(!this.isPermisoBusquedaTipoDocumento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDocumento,this.isPermisoPaginacionMedioTipoDocumento,this.isPermisoPaginacionTodoTipoDocumento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDocumentoConstantesFunciones.getTiposSeleccionarTipoDocumento());
				
				this.tiposColumnasSelect=TipoDocumentoConstantesFunciones.getTiposSeleccionarTipoDocumento(true);
				
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
			//if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDocumento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDocumento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDocumento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumento() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			this.tipomovimientomoduloLogic=new TipoMovimientoModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodocumentoImplementable= (TipoDocumentoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodocumentoImplementableHome= (TipoDocumentoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodocumentos= new ArrayList<TipoDocumento>();
			this.tipodocumentosEliminados= new ArrayList<TipoDocumento>();
						
			this.isEsNuevoTipoDocumento=false;
			this.esParaAccionDesdeFormularioTipoDocumento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDocumento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDocumento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDocumentoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDocumentoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDocumento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDocumento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDocumento();
			}
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDocumento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDocumento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDocumento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDocumento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDocumento")) {
				iIndex=this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDocumento();	
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
	
	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDocumento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDocumentoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDocumento();
		
		this.cargarCombosFrameForeignKeyTipoDocumento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDocumento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDocumento();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
				this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoMovimientoModulo(this.tipomovimientomodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			
			if(jTableDatosTipoDocumento.getRowCount()>=1) {
				jTableDatosTipoDocumento.removeRowSelectionInterval(0, jTableDatosTipoDocumento.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDocumento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDocumento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDocumento(true);			
			//this.tipodocumento=new TipoDocumento();
			//this.tipodocumento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumento() ;
			
			if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodocumento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);				
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDocumento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDocumento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDocumento.getSelectedRows().length;			
			}
			
			tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDocumento--;			
				//TipoDocumento tipodocumentoAux= new TipoDocumento();			
				//tipodocumentoAux.setId(this.iIdNuevoTipoDocumento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDocumento tipodocumentoOrigen=new TipoDocumento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDocumento tipodocumentoOrigen : tipodocumentosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodocumentoOrigen =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentoOrigen =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDocumento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodocumento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDocumento(tipodocumentoOrigen,this.tipodocumento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentoLogic.getTipoDocumentos().add(this.tipodocumentoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentos.add(this.tipodocumentoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDocumento(false);
				
				this.jTableDatosTipoDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDocumento(), this.getIndiceNuevoTipoDocumento());
				
				int iLastRow =  this.jTableDatosTipoDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();									
		
			TipoDocumento tipodocumentoOrigen=new TipoDocumento();
			TipoDocumento tipodocumentoDestino=new TipoDocumento();
				
			tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDocumento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodocumentosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDocumento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoOrigen =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentoOrigen =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentoDestino =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentoDestino =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodocumentoOrigen =tipodocumentosSeleccionados.get(0);
				tipodocumentoDestino =tipodocumentosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDocumento(tipodocumentoOrigen,tipodocumentoDestino,true,false);
				
				tipodocumentoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentoDestino,tipodocumentoLogic.getTipoDocumentos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentoDestino,tipodocumentos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDocumento(false);
				
				//this.jTableDatosTipoDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDocumento(), this.getIndiceNuevoTipoDocumento());
				
				int iLastRow =  this.jTableDatosTipoDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDocumento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDocumento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDocumento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDocumento.setVisible(!isVisible);
			this.jPanelPaginacionTipoDocumento.setVisible(!isVisible);
			this.jPanelAccionesTipoDocumento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDocumento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDocumento();
			
			this.abrirFrameOrderByTipoDocumento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDocumento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDocumento.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDocumento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDocumento.setSize(this.jInternalFrameDetalleFormTipoDocumento.iWidthFormulario,this.jInternalFrameDetalleFormTipoDocumento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDocumento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDocumento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDocumento.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDocumento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumento.jContentPaneDetalleTipoDocumento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumento.jContentPaneDetalleTipoDocumento.getWidth(),TipoDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumento.jContentPaneDetalleTipoDocumento.getWidth(),TipoDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumento.jContentPaneDetalleTipoDocumento.getWidth(),TipoDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDocumento.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDocumento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDocumento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumento,false,this);
				} else {
					this.jInternalFrameOrderByTipoDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumento);
				this.jInternalFrameOrderByTipoDocumento.setVisible(false);
				this.jInternalFrameOrderByTipoDocumento.setSelected(false);
				
				this.jInternalFrameOrderByTipoDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumento"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDocumento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDocumento==null) {
				
				this.jInternalFrameImportacionTipoDocumento=new ImportacionJInternalFrame(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumento);
				this.jInternalFrameImportacionTipoDocumento.setVisible(false);
				this.jInternalFrameImportacionTipoDocumento.setSelected(false);


				this.jInternalFrameImportacionTipoDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumento"));
				this.jInternalFrameImportacionTipoDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumento"));
				this.jInternalFrameImportacionTipoDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDocumento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDocumento==null) {
				this.jInternalFrameReporteDinamicoTipoDocumento=new ReporteDinamicoJInternalFrame(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumento);
				this.jInternalFrameReporteDinamicoTipoDocumento.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDocumento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumento"));
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumento"));
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoDocumento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumento);
			
	       	this.jInternalFrameDetalleFormTipoDocumento.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDocumento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDocumento.dispose();
			//this.jInternalFrameDetalleFormTipoDocumento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDocumento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDocumento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDocumento.setVisible(true);
	        this.jInternalFrameImportacionTipoDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDocumento.setVisible(true);
	        this.jInternalFrameOrderByTipoDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDocumento.setVisible(false);
	        this.jInternalFrameOrderByTipoDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDocumento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDocumento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDocumento.setVisible(false);
	        this.jInternalFrameImportacionTipoDocumento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDocumento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDocumento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDocumento(true);
			//this.isEsNuevoTipoDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumento(false) ;
			
			if(tipodocumentoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDocumentoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDocumento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDocumento(true);
			//this.isEsNuevoTipoDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodocumento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDocumento(false) ;
			
			if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimientoModulo(List<TipoMovimientoModulo> tipomovimientomodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimientoModulo=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO));
		TableCellEditor tableCellEditorTipoMovimientoModulo =tableColumnTipoMovimientoModulo.getCellEditor();

		TipoMovimientoModuloTableCell tipomovimientomoduloTableCellFk=(TipoMovimientoModuloTableCell)tableCellEditorTipoMovimientoModulo;

		if(tipomovimientomoduloTableCellFk!=null) {
			tipomovimientomoduloTableCellFk.settipomovimientomodulosForeignKey(tipomovimientomodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientomoduloTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientomoduloTableCellFk.settipomovimientomodulosForeignKeyActual(tipomovimientomodulosForeignKey);
		//}


		if(tipomovimientomoduloTableCellFk!=null) {
			tipomovimientomoduloTableCellFk.RecargarTipoMovimientoModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumento(false);
			
			//if(!this.isEsNuevoTipoDocumento) {								
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				
			}
			
			if(this.permiteMantenimiento(this.tipodocumento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDocumento=true;
					this.inicializarActualizarBindingTablaTipoDocumento(false);
					this.isEsNuevoTipoDocumento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDocumento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDocumento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumento(false);
				
				this.habilitarDeshabilitarControlesTipoDocumento(false);
			
												
				
				if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDocumento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDocumentoActionPerformed(evt,tipodocumentoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDocumento(this.tipodocumento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDocumento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodocumentoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodocumento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodocumento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDocumentoModel) this.jTableDatosTipoDocumento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDocumento=true;
				this.inicializarActualizarBindingTablaTipoDocumento(false);
				this.isEsNuevoTipoDocumento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumento(false);
				
				this.habilitarDeshabilitarControlesTipoDocumento(false);
				
				
				
				if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDocumento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDocumento.getRowCount()>=1) {
				jTableDatosTipoDocumento.removeRowSelectionInterval(0, jTableDatosTipoDocumento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDocumento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDocumento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumento(false) ;
			
			this.isEsNuevoTipoDocumento=false;
			
			if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDocumento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDocumento(false);
				
				//SI ES MANUAL
				if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDocumento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDocumento--;			
			//TipoDocumento tipodocumentoAux= new TipoDocumento();			
			//tipodocumentoAux.setId(this.iIdNuevoTipoDocumento);
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDocumento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
			
			this.tipodocumento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodocumentoLogic.getTipoDocumentos().add(this.tipodocumentoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodocumentos.add(this.tipodocumentoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDocumento(false);
			
			this.jTableDatosTipoDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDocumento(), this.getIndiceNuevoTipoDocumento());
			
			int iLastRow =  this.jTableDatosTipoDocumento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDocumento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDocumento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDocumento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumento(false);
			
			//SI ES MANUAL
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumento();
			}
			
			//this.abrirFrameTreeTipoDocumento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DocumentoS ?", "MANTENIMIENTO DE Tipo Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDocumento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDocumento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodocumentoReturnGeneral=tipodocumentoLogic.procesarImportacionTipoDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodocumentoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDocumentoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDocumento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDocumento.setFileImportacion(this.jInternalFrameImportacionTipoDocumento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDocumento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDocumento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDocumento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDocumento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		

		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDocumentoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDocumentoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimientoModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimientoModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimientoModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimientoModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESMAYOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mayor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoDocumento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoria="id_tipo_movimiento_modulo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESMAYOR:
					sNombreCampoCategoria="es_mayor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoriaValor="id_tipo_movimiento_modulo";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESMAYOR:
					sNombreCampoCategoriaValor="es_mayor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento_modulo");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_mayor");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.gettipomovimientomodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getes_defecto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoConstantesFunciones.LABEL_ESMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR);
					iRow++;

					for(TipoDocumento tipodocumento:tipodocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumento.getes_mayor());
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
			//	this.getFilaCabeceraExportarExcelTipoDocumento(row);				
			//	iRow++;
			//}				
			
			//for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDocumento(tipodocumentoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumento(false);
			
			//SI ES MANUAL
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumento(false);
			
			//SI ES MANUAL
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumento(false);
			
			//SI ES MANUAL
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDocumento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDocumento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDocumento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDocumento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDocumento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDocumento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDocumento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDocumento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDocumento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDocumento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDocumento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDocumento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDocumento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDocumento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDocumento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDocumento();
		
		this.inicializarActualizarBindingBotonesManualTipoDocumento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDocumento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDocumento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDocumento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionNuevoTipoDocumento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionSinCerrarTipoDocumento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionSinMensajeTipoDocumento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDocumento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDocumento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDocumento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
				this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionNuevoTipoDocumento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionSinCerrarTipoDocumento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxPostAccionSinMensajeTipoDocumento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDocumento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDocumento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDocumento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDocumento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDocumento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDocumento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDocumento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDocumento(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumento() throws Exception {
		try	{
			if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDocumento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDocumento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDocumento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDocumento.addItem(reporte);
			}
			
			
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDocumento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDocumento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDocumento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDocumento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDocumento.getText();
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getSelectedItem()!=null){this.id_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo=((TipoMovimientoModulo)this.jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.getSelectedItem()).getId();}
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDocumento.getText();
		if(this.jComboBoxid_moduloFK_IdModuloTipoDocumento.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloTipoDocumento.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.getSelectedItem()!=null){this.id_tipo_movimientoFK_IdTipoMovimiento=((TipoMovimiento)this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDocumento(Boolean esInicializar) throws Exception {				
		if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDocumento() throws Exception {
		this.inicializarActualizarBindingTablaTipoDocumento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDocumento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDocumentoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDocumento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodocumentoLogic.getTipoDocumentos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodocumentos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDocumento.setModel(new TipoDocumentoModel(this.tipodocumentoLogic.getTipoDocumentos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDocumento.setModel(new TipoDocumentoModel(this.tipodocumentos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDocumento!=null && this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDocumento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,tipodocumentoConstantesFunciones.resaltarSeleccionarTipoDocumento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,tipodocumentoConstantesFunciones.resaltarSeleccionarTipoDocumento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_ID));

		if(this.tipodocumentoConstantesFunciones.mostraridTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodocumentoConstantesFunciones.resaltaridTipoDocumento,this.tipodocumentoConstantesFunciones.activaridTipoDocumento,this,true,"idTipoDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentoConstantesFunciones.resaltaridTipoDocumento,this.tipodocumentoConstantesFunciones.activaridTipoDocumento,this,true,"idTipoDocumento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodocumentoConstantesFunciones.mostrarid_empresaTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_empresaTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_empresaTipoDocumento));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_empresaTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_empresaTipoDocumento,false,"id_empresaTipoDocumento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDMODULO));

		if(this.tipodocumentoConstantesFunciones.mostrarid_moduloTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_moduloTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_moduloTipoDocumento));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_moduloTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_moduloTipoDocumento,true,"id_moduloTipoDocumento","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.tipodocumentoConstantesFunciones.mostrarid_tipo_movimientoTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimientoTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_tipo_movimientoTipoDocumento));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimientoTipoDocumento,this,this.tipodocumentoConstantesFunciones.activarid_tipo_movimientoTipoDocumento,true,"id_tipo_movimientoTipoDocumento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_CODIGO));

		if(this.tipodocumentoConstantesFunciones.mostrarcodigoTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentoConstantesFunciones.resaltarcodigoTipoDocumento,this.tipodocumentoConstantesFunciones.activarcodigoTipoDocumento,this,true,"codigoTipoDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentoConstantesFunciones.resaltarcodigoTipoDocumento,this.tipodocumentoConstantesFunciones.activarcodigoTipoDocumento,this,true,"codigoTipoDocumento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodocumentoConstantesFunciones.mostrarnombreTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentoConstantesFunciones.resaltarnombreTipoDocumento,this.tipodocumentoConstantesFunciones.activarnombreTipoDocumento,this,true,"nombreTipoDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentoConstantesFunciones.resaltarnombreTipoDocumento,this.tipodocumentoConstantesFunciones.activarnombreTipoDocumento,this,true,"nombreTipoDocumento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO));

		if(this.tipodocumentoConstantesFunciones.mostrares_defectoTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipodocumentoConstantesFunciones.resaltares_defectoTipoDocumento,this.tipodocumentoConstantesFunciones.activares_defectoTipoDocumento));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipodocumentoConstantesFunciones.resaltares_defectoTipoDocumento,this.tipodocumentoConstantesFunciones.activares_defectoTipoDocumento,this,true,"es_defectoTipoDocumento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,TipoDocumentoConstantesFunciones.LABEL_ESMAYOR));

		if(this.tipodocumentoConstantesFunciones.mostrares_mayorTipoDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoConstantesFunciones.LABEL_ESMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipodocumentoConstantesFunciones.resaltares_mayorTipoDocumento,this.tipodocumentoConstantesFunciones.activares_mayorTipoDocumento));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipodocumentoConstantesFunciones.resaltares_mayorTipoDocumento,this.tipodocumentoConstantesFunciones.activares_mayorTipoDocumento,this,true,"es_mayorTipoDocumento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodocumentoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDocumento.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDocumento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDocumento.moveColumn(this.jTableDatosTipoDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDocumento.moveColumn(this.jTableDatosTipoDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDocumento.moveColumn(this.jTableDatosTipoDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDocumento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDocumento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDocumento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDocumento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDocumento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDocumento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDocumento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDocumento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodocumentoLogic.getTipoDocumentos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodocumentos.size()-1;
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
		//this.jTableDatosTipoDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDocumento();
			
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
				
				//this.isEsNuevoTipoDocumento=false;
					
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodocumento.getsType().equals("DUPLICADO")
				   || this.tipodocumento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDocumento=true;
				
				} else {
					this.isEsNuevoTipoDocumento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodocumento.getId()>=0 && !this.tipodocumento.getIsNew()) {						
						this.isEsNuevoTipoDocumento=false;
						
					} else {
						this.isEsNuevoTipoDocumento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDocumento(esRelaciones);						
				
				this.seleccionarTipoDocumento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodocumento.getId()<0) {
					this.isEsNuevoTipoDocumento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDocumento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDocumento(evt,rowIndex);
				}	
				
				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDocumento: " + this.dDif); 
					}
				}								
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDocumento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodocumento)) {
					if(this.tipodocumento.getId()>0) {
						this.tipodocumento.setIsDeleted(true);
						
						this.tipodocumentosEliminados.add(this.tipodocumento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentoLogic.getTipoDocumentos().remove(this.tipodocumento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentos.remove(this.tipodocumento);				
					}
					
					
					((TipoDocumentoModel) this.jTableDatosTipoDocumento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDocumento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDocumento) {
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDocumento(this.tipodocumento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodocumentoConstantesFunciones.cargarid_empresaTipoDocumento || this.tipodocumentoConstantesFunciones.event_dependid_empresaTipoDocumento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodocumento.getid_empresa());
									//this.inicializarActualizarBindingTipoDocumento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodocumento.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodocumento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodocumento.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.tipodocumentoConstantesFunciones.cargarid_moduloTipoDocumento || this.tipodocumentoConstantesFunciones.event_dependid_moduloTipoDocumento) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.tipodocumento.getid_modulo());
									//this.inicializarActualizarBindingTipoDocumento(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(tipodocumento.getModulo()!=null) {
							this.modulosForeignKey.add(tipodocumento.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.tipodocumento.getid_modulo(),false,"Formulario");

					//TipoMovimiento
					if(!this.tipodocumentoConstantesFunciones.cargarid_tipo_movimientoTipoDocumento || this.tipodocumentoConstantesFunciones.event_dependid_tipo_movimientoTipoDocumento) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.tipodocumento.getid_tipo_movimiento());
									//this.inicializarActualizarBindingTipoDocumento(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(tipodocumento.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(tipodocumento.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.tipodocumento.getid_tipo_movimiento(),false,"Formulario");

					//TipoMovimientoModulo
					if(!this.tipodocumentoConstantesFunciones.cargarid_tipo_movimiento_moduloTipoDocumento || this.tipodocumentoConstantesFunciones.event_dependid_tipo_movimiento_moduloTipoDocumento) {
						//this.cargarCombosTipoMovimientoModulosForeignKeyLista(" where id="+this.tipodocumento.getid_tipo_movimiento_modulo());
									//this.inicializarActualizarBindingTipoDocumento(false,false);
						this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();

						if(tipodocumento.getTipoMovimientoModulo()!=null) {
							this.tipomovimientomodulosForeignKey.add(tipodocumento.getTipoMovimientoModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
						this.cargarCombosFrameTipoMovimientoModulosForeignKey("Todos");
					}
					this.setActualTipoMovimientoModuloForeignKey(this.tipodocumento.getid_tipo_movimiento_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDocumento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDocumento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumento(TipoDocumento tipodocumento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDocumento(tipodocumento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumento(TipoDocumento tipodocumento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDocumento(tipodocumento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDocumento(tipodocumento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumento(tipodocumento);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDocumento(TipoDocumento tipodocumento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setText(tipodocumento.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setText(tipodocumento.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setText(tipodocumento.getnombre());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setSelected(tipodocumento.getes_defecto());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setSelected(tipodocumento.getes_mayor());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDocumento tipodocumentoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodocumentoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDocumento tipodocumentoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodocumentoLocal=this.tipodocumento;
			} else {
				tipodocumentoLocal=this.tipodocumentoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodocumentoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoLocal,true);
					
					if(tipodocumentoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodocumentoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodocumentoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDocumento(TipoDocumento tipodocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumento(tipodocumento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(tipodocumento);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumento(TipoDocumento tipodocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumento(tipodocumento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumento(TipoDocumento tipodocumento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.getText()==null || this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.getText()=="" || this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setText("0");
			}

			if(conColumnasBase) {tipodocumento.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelIdTipoDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumento.setcodigo(this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelcodigoTipoDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumento.setnombre(this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabelnombreTipoDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumento.setes_defecto(this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_defectoTipoDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumento.setes_mayor(this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoConstantesFunciones.LABEL_ESMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumento.jLabeles_mayorTipoDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumento(TipoDocumento tipodocumentoBean,TipoDocumento tipodocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipodocumentoBean.getid_modulo()!=null && !tipodocumentoBean.getid_modulo().equals(-1L))) {tipodocumento.setid_modulo(tipodocumentoBean.getid_modulo());}
			if(conDefault || (!conDefault && tipodocumentoBean.getid_tipo_movimiento()!=null && !tipodocumentoBean.getid_tipo_movimiento().equals(-1L))) {tipodocumento.setid_tipo_movimiento(tipodocumentoBean.getid_tipo_movimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDocumento(TipoDocumento tipodocumentoOrigen,TipoDocumento tipodocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentoOrigen.getId()!=null && !tipodocumentoOrigen.getId().equals(0L))) {tipodocumento.setId(tipodocumentoOrigen.getId());}}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getid_modulo()!=null && !tipodocumentoOrigen.getid_modulo().equals(-1L))) {tipodocumento.setid_modulo(tipodocumentoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getid_tipo_movimiento()!=null && !tipodocumentoOrigen.getid_tipo_movimiento().equals(-1L))) {tipodocumento.setid_tipo_movimiento(tipodocumentoOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getcodigo()!=null && !tipodocumentoOrigen.getcodigo().equals(""))) {tipodocumento.setcodigo(tipodocumentoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getnombre()!=null && !tipodocumentoOrigen.getnombre().equals(""))) {tipodocumento.setnombre(tipodocumentoOrigen.getnombre());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getid_tipo_movimiento_modulo()!=null && !tipodocumentoOrigen.getid_tipo_movimiento_modulo().equals(-1L))) {tipodocumento.setid_tipo_movimiento_modulo(tipodocumentoOrigen.getid_tipo_movimiento_modulo());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getes_defecto()!=null && !tipodocumentoOrigen.getes_defecto().equals(false))) {tipodocumento.setes_defecto(tipodocumentoOrigen.getes_defecto());}
			if(conDefault || (!conDefault && tipodocumentoOrigen.getes_mayor()!=null && !tipodocumentoOrigen.getes_mayor().equals(false))) {tipodocumento.setes_mayor(tipodocumentoOrigen.getes_mayor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumento(TipoDocumento tipodocumento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setText(tipodocumento.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setText(tipodocumento.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setText(tipodocumento.getnombre());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setSelected(tipodocumento.getes_defecto());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setSelected(tipodocumento.getes_mayor());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumento(TipoDocumentoBean tipodocumentoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setText(tipodocumentoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setText(tipodocumentoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setText(tipodocumentoBean.getnombre());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setSelected(tipodocumentoBean.getes_defecto());
			this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setSelected(tipodocumentoBean.getes_mayor());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDocumento(TipoDocumentoParameterReturnGeneral tipodocumentoReturnGeneral,TipoDocumentoBean tipodocumentoBean,Boolean conDefault) throws Exception { 
		try {
			TipoDocumento tipodocumentoLocal=new TipoDocumento();
			
			tipodocumentoLocal=tipodocumentoReturnGeneral.getTipoDocumento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentoLocal.getId()!=null && !tipodocumentoLocal.getId().equals(0L))) {tipodocumentoBean.setId(tipodocumentoLocal.getId());}}
			if(conDefault || (!conDefault && tipodocumentoLocal.getid_modulo()!=null && !tipodocumentoLocal.getid_modulo().equals(-1L))) {tipodocumentoBean.setid_modulo(tipodocumentoLocal.getid_modulo());}
			if(conDefault || (!conDefault && tipodocumentoLocal.getid_tipo_movimiento()!=null && !tipodocumentoLocal.getid_tipo_movimiento().equals(-1L))) {tipodocumentoBean.setid_tipo_movimiento(tipodocumentoLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && tipodocumentoLocal.getcodigo()!=null && !tipodocumentoLocal.getcodigo().equals(""))) {tipodocumentoBean.setcodigo(tipodocumentoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentoLocal.getnombre()!=null && !tipodocumentoLocal.getnombre().equals(""))) {tipodocumentoBean.setnombre(tipodocumentoLocal.getnombre());}
			if(conDefault || (!conDefault && tipodocumentoLocal.getes_defecto()!=null && !tipodocumentoLocal.getes_defecto().equals(false))) {tipodocumentoBean.setes_defecto(tipodocumentoLocal.getes_defecto());}
			if(conDefault || (!conDefault && tipodocumentoLocal.getes_mayor()!=null && !tipodocumentoLocal.getes_mayor().equals(false))) {tipodocumentoBean.setes_mayor(tipodocumentoLocal.getes_mayor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDocumentoGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxTipoDocumento,List<TipoDocumento> tipodocumentosLocal)throws Exception {
		try {
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosLocal) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			jComboBoxTipoDocumento.setSelectedItem(tipodocumentoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDocumentoGenerico(JComboBox jComboBoxTipoDocumento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumento=(TipoDocumento) tipodocumentoLogic.getTipoDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumento =(TipoDocumento) tipodocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodocumento.getIsNew() && !tipodocumento.getIsChanged() && !tipodocumento.getIsDeleted()) {
				sDescripcion=tipodocumento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodocumento.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!tipodocumento.getIsNew() && !tipodocumento.getIsChanged() && !tipodocumento.getIsDeleted()) {
				sDescripcion=tipodocumento.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=tipodocumento.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!tipodocumento.getIsNew() && !tipodocumento.getIsChanged() && !tipodocumento.getIsDeleted()) {
				sDescripcion=tipodocumento.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=tipodocumento.gettipomovimiento_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimientoModulo")) {
			//sDescripcion=this.getActualTipoMovimientoModuloForeignKeyDescripcion((Long)value);
			if(!tipodocumento.getIsNew() && !tipodocumento.getIsChanged() && !tipodocumento.getIsDeleted()) {
				sDescripcion=tipodocumento.gettipomovimientomodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=tipodocumento.gettipomovimientomodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDocumento tipodocumentoRow=new TipoDocumento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentoRow=(TipoDocumento) tipodocumentoLogic.getTipoDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumentoRow=(TipoDocumento) tipodocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDocumento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento));			
			this.jButtonDuplicarTipoDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumento && this.isPermisoDuplicarTipoDocumento));			
			this.jButtonCopiarTipoDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDocumento && this.isPermisoCopiarTipoDocumento));
			this.jButtonVerFormTipoDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDocumento && this.isPermisoVerFormTipoDocumento));
			
			this.jButtonAbrirOrderByTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));			
			
			this.jButtonNuevoRelacionesTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumento && this.isPermisoNuevoTipoDocumento));			
			this.jButtonNuevoGuardarCambiosTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarTipoDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDocumento && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDocumento && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDocumento && this.isPermisoEliminarTipoDocumento));
			this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDocumento);							
			this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento));						
			this.jButtonDuplicarToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumento && this.isPermisoDuplicarTipoDocumento));						
			this.jButtonCopiarToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDocumento && this.isPermisoCopiarTipoDocumento));			
			this.jButtonVerFormToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDocumento && this.isPermisoVerFormTipoDocumento));			
			this.jButtonAbrirOrderByToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));
			this.jButtonNuevoRelacionesToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumento && this.isPermisoNuevoTipoDocumento));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));			
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDocumento && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDocumento  && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDocumento && this.isPermisoEliminarTipoDocumento));
			this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarToolBarTipoDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDocumento);				
			this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento));			
			this.jMenuItemDuplicarTipoDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumento && this.isPermisoDuplicarTipoDocumento));			
			this.jMenuItemCopiarTipoDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDocumento && this.isPermisoCopiarTipoDocumento));			
			this.jMenuItemVerFormTipoDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDocumento && this.isPermisoVerFormTipoDocumento));			
			this.jMenuItemAbrirOrderByTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));			
			//this.jMenuItemMostrarOcultarTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));
			this.jMenuItemDetalleAbrirOrderByTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));			
			//this.jMenuItemDetalleMostrarOcultarTipoDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDocumento && this.isPermisoOrdenTipoDocumento));			
			this.jMenuItemNuevoRelacionesTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumento && this.isPermisoNuevoTipoDocumento));			
			this.jMenuItemNuevoGuardarCambiosTipoDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDocumento && this.isPermisoNuevoTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));									
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemModificarTipoDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDocumento && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemActualizarTipoDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDocumento && this.isPermisoActualizarTipoDocumento));	
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemEliminarTipoDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDocumento && this.isPermisoEliminarTipoDocumento));
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemCancelarTipoDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDocumento);				
			}
			
			this.jMenuItemGuardarCambiosTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));						
			this.jMenuItemGuardarCambiosTablaTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumento=this.jButtonNuevoTipoDocumento.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDocumento=this.jButtonDuplicarTipoDocumento.isVisible();
			this.isVisibilidadCeldaCopiarTipoDocumento=this.jButtonCopiarTipoDocumento.isVisible();
			this.isVisibilidadCeldaVerFormTipoDocumento=this.jButtonVerFormTipoDocumento.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDocumento=this.jButtonAbrirOrderByTipoDocumento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=this.jButtonNuevoRelacionesTipoDocumento.isVisible();
			this.isVisibilidadCeldaModificarTipoDocumento=this.jButtonModificarTipoDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.isVisibilidadCeldaActualizarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.isVisible();
			this.isVisibilidadCeldaGuardarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=this.jButtonGuardarCambiosTablaTipoDocumento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDocumento=this.jButtonNuevoToolBarTipoDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=this.jButtonNuevoRelacionesToolBarTipoDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.isVisibilidadCeldaModificarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarToolBarTipoDocumento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarToolBarTipoDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarToolBarTipoDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarToolBarTipoDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumento=this.jButtonGuardarCambiosToolBarTipoDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=this.jButtonGuardarCambiosTablaToolBarTipoDocumento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDocumento=this.jMenuItemNuevoTipoDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=this.jMenuItemNuevoRelacionesTipoDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.isVisibilidadCeldaModificarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jMenuItemModificarTipoDocumento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jMenuItemActualizarTipoDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jMenuItemEliminarTipoDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumento=this.jInternalFrameDetalleFormTipoDocumento.jMenuItemCancelarTipoDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumento=this.jMenuItemGuardarCambiosTipoDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=this.jMenuItemGuardarCambiosTablaTipoDocumento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDocumento(Boolean esInicializar) {
		if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumento();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDocumento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDocumento() {
		this.jButtonNuevoTipoDocumento.setVisible(this.isPermisoNuevoTipoDocumento);			
		this.jButtonDuplicarTipoDocumento.setVisible(this.isPermisoDuplicarTipoDocumento);			
		this.jButtonCopiarTipoDocumento.setVisible(this.isPermisoCopiarTipoDocumento);			
		this.jButtonVerFormTipoDocumento.setVisible(this.isPermisoVerFormTipoDocumento);			
		
		this.jButtonAbrirOrderByTipoDocumento.setVisible(this.isPermisoOrdenTipoDocumento);					
		
		this.jButtonNuevoRelacionesTipoDocumento.setVisible(this.isPermisoNuevoTipoDocumento);			
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarTipoDocumento.setVisible(this.isPermisoActualizarTipoDocumento);	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.setVisible(this.isPermisoActualizarTipoDocumento);	
			this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.setVisible(this.isPermisoEliminarTipoDocumento);
			this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDocumento);						
			this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.setVisible(this.isPermisoGuardarCambiosTipoDocumento);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDocumento.setVisible(this.isPermisoActualizarTipoDocumento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumento() {
		this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarTipoDocumento.setVisible(this.isPermisoActualizarTipoDocumento);	
		this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.setVisible(this.isPermisoActualizarTipoDocumento);	
		this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.setVisible(this.isPermisoEliminarTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDocumento);							
		this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDocumento && this.isPermisoGuardarCambiosTipoDocumento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDocumento() {
		if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDocumento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDocumento() {
	}
	
	public void jTableDatosTipoDocumentoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDocumento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodocumento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDocumento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodocumentoLogic.getConnexion());

				if(this.tipodocumento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodocumento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDocumento=(TitledBorder)this.jScrollPanelDatosTipoDocumento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDocumento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodocumento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTipoDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTipoDocumento(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.tipodocumentoLogic.getConnexion());

				if(this.tipodocumento.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.tipodocumento.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDocumento=(TitledBorder)this.jScrollPanelDatosTipoDocumento.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTipoDocumento.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.tipodocumento.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoTipoDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebTipoDocumento(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.tipodocumentoLogic.getConnexion());

				if(this.tipodocumento.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.tipodocumento.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDocumento=(TitledBorder)this.jScrollPanelDatosTipoDocumento.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderTipoDocumento.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.tipodocumento.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodocumento.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodocumento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimiento_moduloTipoDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimientomodulo=true;

			idTienePermisotipomovimientomodulo=this.tienePermisosUsuarioEnPaginaWebTipoDocumento(TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimientomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);

				this.tipomovimientomoduloBeanSwingJInternalFrame=new TipoMovimientoModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientomoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientomoduloBeanSwingJInternalFrame.getTipoMovimientoModuloLogic().setConnexion(this.tipodocumentoLogic.getConnexion());

				if(this.tipodocumento.getid_tipo_movimiento_modulo()!=null) {
					this.tipomovimientomoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientomoduloBeanSwingJInternalFrame.setIdActual(this.tipodocumento.getid_tipo_movimiento_modulo());
					this.tipomovimientomoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientomoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientomoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimientoModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientomoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDocumento=(TitledBorder)this.jScrollPanelDatosTipoDocumento.getBorder();
				TitledBorder titledBordertipomovimientomodulo=(TitledBorder)this.tipomovimientomoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimientoModulo.getBorder();

				titledBordertipomovimientomodulo.setTitle(titledBorderTipoDocumento.getTitle() + " -> Tipo Movimiento Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimiento_moduloTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getid_tipo_movimiento_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento_modulo = "+this.tipodocumento.getid_tipo_movimiento_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.tipodocumento.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_mayorTipoDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.gettipodocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumento==null) {
						this.tipodocumento = new TipoDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);
				}

				if(this.tipodocumento.getes_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_mayor = "+this.tipodocumento.getes_mayor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosBusquedaPorIdModuloPorIdTipoMovimientoModulo();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosFK_IdModulo();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosFK_IdTipoMovimiento();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoModuloTipoDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumento(false,false);

			this.getTipoDocumentosFK_IdTipoMovimientoModulo();

			this.inicializarActualizarBindingTipoDocumento(false);

			//if(TipoDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDocumento() {
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDocumento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDocumento.dispose();
			this.jInternalFrameDetalleFormTipoDocumento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
			this.jInternalFrameReporteDinamicoTipoDocumento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDocumento.dispose();
			this.jInternalFrameReporteDinamicoTipoDocumento=null;
		}
		
		if(this.jInternalFrameImportacionTipoDocumento!=null) {
			this.jInternalFrameImportacionTipoDocumento.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDocumento.dispose();
			this.jInternalFrameImportacionTipoDocumento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDocumento();
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDocumento")) {
				jButtonDuplicarTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDocumento")) {
				jButtonCopiarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDocumento")) {
				jButtonVerFormTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDocumento")) {
				jButtonDuplicarTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDocumento")) {
				jButtonDuplicarTipoDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDocumento")) {
				jButtonModificarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDocumento")) {
				jButtonModificarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDocumento")) {
				jButtonModificarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDocumento")) {
				jButtonActualizarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDocumento")) {
				jButtonActualizarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDocumento")) {
				jButtonActualizarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDocumento")) {
				jButtonEliminarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDocumento")) {
				jButtonEliminarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDocumento")) {
				jButtonEliminarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDocumento")) {
				jButtonCancelarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDocumento")) {
				jButtonCancelarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDocumento")) {
				jButtonCancelarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDocumento")) {
				jButtonCerrarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDocumento")) {
				jButtonCerrarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDocumento")) {
				jButtonCerrarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDocumento")) {
				jButtonMostrarOcultarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDocumento")) {
				jButtonCancelarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDocumento")) {
				jButtonCopiarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDocumento")) {
				jButtonVerFormTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDocumento")) {
				jButtonCopiarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDocumento")) {
				jButtonVerFormTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDocumento")) {
				jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDocumento")) {
				jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDocumento")) {
				jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDocumento")) {
				jButtonAnterioresTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDocumento")) {
				jButtonAnterioresTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDocumento")) {
				jButtonAnterioresTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDocumento")) {
				jButtonSiguientesTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDocumento")) {
				jButtonSiguientesTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDocumento")) {
				jButtonSiguientesTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDocumento") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDocumento")) {
				jButtonAbrirOrderByTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDocumento") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDocumento")) {
				jButtonMostrarOcultarTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumento")) {
				jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDocumento")) {
				jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDocumento")) {
				jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDocumento")) {
				jButtonCerrarReporteDinamicoTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDocumento")) {
				jButtonGenerarReporteDinamicoTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDocumento")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDocumento")) {
				jButtonCerrarImportacionTipoDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDocumento")) {
				
				jButtonGenerarImportacionTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDocumento")) {
				
				jButtonAbrirImportacionTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDocumento")) {
				jComboBoxTiposAccionesTipoDocumentoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDocumento")) {
				jComboBoxTiposRelacionesTipoDocumentoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDocumento")) {
				jComboBoxTiposAccionesTipoDocumentoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDocumento")) {
				
				jComboBoxTiposSeleccionarTipoDocumentoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDocumento")) {
				jTextFieldValorCampoGeneralTipoDocumentoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDocumento")) {
				jButtonAbrirOrderByTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDocumento")) {
				jButtonAbrirOrderByTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDocumento")) {
				jButtonCerrarOrderByTipoDocumentoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoBusqueda")) {
				this.jButtonidTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDocumentoUpdate")) {
				this.jButtonid_empresaTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDocumentoBusqueda")) {
				this.jButtonid_empresaTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoDocumentoUpdate")) {
				this.jButtonid_moduloTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoDocumentoBusqueda")) {
				this.jButtonid_moduloTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoTipoDocumentoUpdate")) {
				this.jButtonid_tipo_movimientoTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoTipoDocumentoBusqueda")) {
				this.jButtonid_tipo_movimientoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoBusqueda")) {
				this.jButtoncodigoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoBusqueda")) {
				this.jButtonnombreTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloTipoDocumentoUpdate")) {
				this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloTipoDocumentoBusqueda")) {
				this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoDocumentoBusqueda")) {
				this.jButtones_defectoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mayorTipoDocumentoBusqueda")) {
				this.jButtones_mayorTipoDocumentoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDocumento")) {
				this.jButtonBusquedaPorCodigoTipoDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento")) {
				this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDocumento")) {
				this.jButtonBusquedaPorNombreTipoDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloTipoDocumento")) {
				this.jButtonFK_IdModuloTipoDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMovimientoTipoDocumento")) {
				this.jButtonFK_IdTipoMovimientoTipoDocumentoActionPerformed(evt);
			}
			
			;
			
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDocumento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDocumento tipodocumentoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodocumentoLocal=this.tipodocumento;
			} else {
				tipodocumentoLocal=this.tipodocumentoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
							
				
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
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
			
			


			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
								
						
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
								
				
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
							
				
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
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
			
			


			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
								
				
				


				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDocumento")) {
					jCheckBoxSeleccionarTodosTipoDocumentoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDocumento")) {
					jCheckBoxSeleccionadosTipoDocumentoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDocumento")) {
					
				}
				
				


				
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
												
				
				


				
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
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
			
			


			if(sTipo.equals("id_moduloTipoDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento;
				}

				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTipoDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
			}
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_moduloTipoDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento;
				}

				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTipoDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
			}
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumento);
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
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
				
				


			if(sTipo.equals("id_moduloTipoDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento;
				}

				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTipoDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"BusquedaPorIdModuloPorIdTipoMovimientoModulo");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloTipoDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
				//recargarFormTipoDocumentoModulo(jComboBoxid_moduloFK_IdModuloTipoDocumento,"FK_IdModulo");
			}
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentoAnterior =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDocumento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDocumento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodocumento =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodocumento =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodocumento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDocumento")) {
				
				}
				
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDocumento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDocumento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDocumento")) {
			
			}
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDocumento();
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDocumento")) {
				jButtonDuplicarTipoDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDocumento")) {
				jButtonCopiarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDocumento")) {
				jButtonVerFormTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDocumento")) {
				jButtonNuevoTipoDocumentoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDocumento")) {
				jButtonModificarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDocumento")) {
				jButtonActualizarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDocumento")) {
				jButtonEliminarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDocumento")) {
				jButtonCancelarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDocumento")) {
				jButtonCerrarTipoDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDocumento")) {
				jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumento")) {
				jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDocumento")) {
				jButtonAbrirOrderByTipoDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDocumento")) {
				jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDocumento")) {
				jButtonAnterioresTipoDocumentoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDocumento")) {
				jButtonSiguientesTipoDocumentoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoBusqueda")) {
				this.jButtonidTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDocumentoUpdate")) {
				this.jButtonid_empresaTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDocumentoBusqueda")) {
				this.jButtonid_empresaTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoDocumentoUpdate")) {
				this.jButtonid_moduloTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoDocumentoBusqueda")) {
				this.jButtonid_moduloTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoTipoDocumentoUpdate")) {
				this.jButtonid_tipo_movimientoTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoTipoDocumentoBusqueda")) {
				this.jButtonid_tipo_movimientoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoBusqueda")) {
				this.jButtoncodigoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoBusqueda")) {
				this.jButtonnombreTipoDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloTipoDocumentoUpdate")) {
				this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloTipoDocumentoBusqueda")) {
				this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoDocumentoBusqueda")) {
				this.jButtones_defectoTipoDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mayorTipoDocumentoBusqueda")) {
				this.jButtones_mayorTipoDocumentoBusquedaActionPerformed(evt);
			}
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDocumento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDocumento")) {
				closingInternalFrameTipoDocumento();
				
			} else if(sTipo.equals("jButtonCancelarTipoDocumento")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDocumento = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDocumentoBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDocumentoActionPerformed(null);
			}
			
			TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumento,new Object(),this.tipodocumentoParameterGeneral,this.tipodocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodocumento)) {
			if(!esControlTabla) {
				if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);			
				}
				
				if(this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDocumento(this.tipodocumento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentoReturnGeneral=tipodocumentoLogic.procesarEventosTipoDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentoLogic.getTipoDocumentos(),this.tipodocumento,this.tipodocumentoParameterGeneral,this.isEsNuevoTipoDocumento,classes);//this.tipodocumentoLogic.getTipoDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDocumento(this.tipodocumentoReturnGeneral,this.tipodocumentoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumento(classes,this.tipodocumentoReturnGeneral,this.tipodocumentoBean,false);
					}
						
					if(this.tipodocumentoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento());	
					}
						
					if(this.tipodocumentoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento(),classes);//this.tipodocumentoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDocumento(this.tipodocumento,classes);//this.tipodocumentoBean);									
				}
			
				if(TipoDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDocumento(this.tipodocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumento(this.tipodocumento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodocumentoAnterior!=null) {
						this.tipodocumento=this.tipodocumentoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentoReturnGeneral=tipodocumentoLogic.procesarEventosTipoDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentoLogic.getTipoDocumentos(),this.tipodocumento,this.tipodocumentoParameterGeneral,this.isEsNuevoTipoDocumento,classes);//this.tipodocumentoLogic.getTipoDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodocumentoReturnGeneral.getTipoDocumento(),tipodocumentoLogic.getTipoDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodocumentoReturnGeneral.getTipoDocumento(),this.tipodocumentos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDocumento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDocumento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDocumento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDocumento() throws Exception {
		
		TipoDocumentoModel tipodocumentoModel=(TipoDocumentoModel)this.jTableDatosTipoDocumento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentoModel.tipodocumentos=this.tipodocumentoLogic.getTipoDocumentos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodocumentoModel.tipodocumentos=this.tipodocumentos;
		}
		
		
		((TipoDocumentoModel) this.jTableDatosTipoDocumento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDocumento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodocumentoAnterior(),this.tipodocumentoLogic.getTipoDocumentos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodocumentoAnterior(),this.tipodocumentos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDocumento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDocumento(TipoDocumento tipodocumento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
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
										
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumento,new Object(),generalEntityParameterGeneral,this.tipodocumentoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDocumentoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDocumento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumento,new Object(),generalEntityParameterGeneral,this.tipodocumentoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDocumento(TipoDocumentoBean tipodocumentoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumento(ArrayList<Classe> classes,TipoDocumentoReturnGeneral tipodocumentoReturnGeneral,TipoDocumentoBean tipodocumentoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDocumento(TipoDocumento tipodocumento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodocumento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumento = new TipoDocumentoDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentoSessionBean.getConGuardarRelaciones(),this.tipodocumentoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.setVisible(false);
		this.jInternalFrameDetalleFormTipoDocumento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDocumento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDocumento.tipodocumentoLogic=this.tipodocumentoLogic;
		
		this.cargarCombosFrameForeignKeyTipoDocumento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDocumento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDocumento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumento"));
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarTipoDocumento.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumento"));

		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumento"));
					
		this.jInternalFrameDetalleFormTipoDocumento.jMenuItemModificarTipoDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumento"));
						
		this.jInternalFrameDetalleFormTipoDocumento.jMenuItemActualizarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumento"));
								
		this.jInternalFrameDetalleFormTipoDocumento.jMenuItemEliminarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumento"));
					
		this.jInternalFrameDetalleFormTipoDocumento.jMenuItemCancelarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jMenuItemDetalleCerrarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonidTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtoncodigoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonnombreTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_defectoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_mayorTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_mayorTipoDocumentoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDocumento"));
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumento"));
		}
		
		this.jTableDatosTipoDocumento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDocumento"));
		
		this.jTableDatosTipoDocumento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDocumento"));
		
		this.jButtonNuevoTipoDocumento.addActionListener(new ButtonActionListener(this,"NuevoTipoDocumento"));
		
		this.jButtonDuplicarTipoDocumento.addActionListener(new ButtonActionListener(this,"DuplicarTipoDocumento"));
		
		this.jButtonCopiarTipoDocumento.addActionListener(new ButtonActionListener(this,"CopiarTipoDocumento"));
		
		this.jButtonVerFormTipoDocumento.addActionListener(new ButtonActionListener(this,"VerFormTipoDocumento"));
		
		
		this.jButtonNuevoToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDocumento"));
			
		this.jButtonDuplicarToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDocumento"));
			
		this.jMenuItemNuevoTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDocumento"));
			
		this.jMenuItemDuplicarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDocumento"));		
		
		
		this.jButtonNuevoRelacionesTipoDocumento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDocumento"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDocumento"));
			
		this.jMenuItemNuevoRelacionesTipoDocumento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarTipoDocumento.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonModificarToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumento"));
			
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemModificarTipoDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarTipoDocumento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonActualizarToolBarTipoDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumento"));
				
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemActualizarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarTipoDocumento.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonEliminarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumento"));
						
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemEliminarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarTipoDocumento.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonCancelarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumento"));
			
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemCancelarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDocumento"));		
		
		
		this.jButtonCerrarTipoDocumento.addActionListener (new ButtonActionListener(this,"CerrarTipoDocumento"));
		
		
		this.jButtonCerrarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDocumento"));
			
		this.jMenuItemCerrarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDocumento"));
			
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jMenuItemDetalleCerrarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumento"));
		}
		
		this.jButtonCopiarToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDocumento"));
			
		this.jButtonVerFormToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDocumento"));
		
		this.jMenuItemGuardarCambiosTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDocumento"));
			
		this.jMenuItemCopiarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDocumento"));		
		
		this.jMenuItemVerFormTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDocumento"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDocumento"));
			
		this.jMenuItemGuardarCambiosTablaTipoDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumento"));		
		
		
		
		this.jButtonRecargarInformacionTipoDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDocumento"));
					
		this.jButtonRecargarInformacionToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDocumento"));
		
		this.jMenuItemRecargarInformacionTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDocumento"));		
		
		
		
		this.jButtonAnterioresTipoDocumento.addActionListener (new ButtonActionListener(this,"AnterioresTipoDocumento"));
		
		
		this.jButtonAnterioresToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDocumento"));
		
		this.jMenuItemAnterioresTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDocumento"));		
		
		
		this.jButtonSiguientesTipoDocumento.addActionListener (new ButtonActionListener(this,"SiguientesTipoDocumento"));
		
		
		this.jButtonSiguientesToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDocumento"));
			
		this.jMenuItemSiguientesTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDocumento"));
			
		this.jMenuItemAbrirOrderByTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDocumento"));
			
		this.jMenuItemMostrarOcultarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDocumento"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDocumento"));
			
		this.jMenuItemDetalleMostarOcultarTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDocumento"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDocumento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDocumento"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDocumento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDocumento"));

		this.jCheckBoxSeleccionadosTipoDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDocumento"));
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumento"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDocumento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDocumento"));
			
		this.jComboBoxTiposAccionesTipoDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDocumento"));
					
		this.jComboBoxTiposSeleccionarTipoDocumento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDocumento"));
			
		this.jTextFieldValorCampoGeneralTipoDocumento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonidTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtoncodigoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonnombreTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_defectoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_mayorTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_mayorTipoDocumentoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDocumento"));

			this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

			this.jButtonBusquedaPorNombreTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDocumento"));

			this.jButtonFK_IdModuloTipoDocumento.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoDocumento"));

			this.jButtonFK_IdTipoMovimientoTipoDocumento.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoTipoDocumento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumento"));
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumento"));
				this.jInternalFrameReporteDinamicoTipoDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDocumento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumento"));				
			//this.jButtonGenerarReporteDinamicoTipoDocumento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumento"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDocumento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDocumento!=null) {
				this.jInternalFrameImportacionTipoDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumento"));
				this.jInternalFrameImportacionTipoDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumento"));
				this.jInternalFrameImportacionTipoDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDocumento"));
			
			this.jButtonAbrirOrderByToolBarTipoDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDocumento"));			
			
			if(this.jInternalFrameOrderByTipoDocumento!=null) {
				this.jInternalFrameOrderByTipoDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumento.jTabbedPaneRelacionesTipoDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumento"));
		
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
            		closingInternalFrameTipoDocumento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDocumento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDocumento = (JInternalFrameBase)event.getSource();
	            	
	            TipoDocumentoBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDocumentoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDocumento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDocumento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDocumento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDocumento";
		inputMap = this.jButtonNuevoTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDocumento";
		inputMap = this.jButtonNuevoRelacionesTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDocumento";
		inputMap = this.jButtonModificarTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDocumento";
		inputMap = this.jButtonActualizarTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDocumento";
		inputMap = this.jButtonEliminarTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDocumento";
		inputMap = this.jButtonCancelarTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDocumento";
		inputMap = this.jButtonCerrarTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDocumento";
		inputMap = this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDocumento.jButtonGuardarCambiosTipoDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDocumento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDocumentoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonidTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_empresaTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimientoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtoncodigoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonnombreTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_defectoTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumento.jButtones_mayorTipoDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"es_mayorTipoDocumentoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDocumento"));

		this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento"));

		this.jButtonBusquedaPorNombreTipoDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDocumento"));

		this.jButtonFK_IdModuloTipoDocumento.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoDocumento"));

		this.jButtonFK_IdTipoMovimientoTipoDocumento.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoTipoDocumento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDocumento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDocumento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
					tipodocumentoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumento tipodocumentoAux:tipodocumentos) {
					tipodocumentoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
						tipodocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumento tipodocumentoAux:tipodocumentos) {
						tipodocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
					
						if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipodocumentoAux.setes_defecto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR)) {
							existe=true;
							tipodocumentoAux.setes_mayor(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumento tipodocumentoAux:tipodocumentos) {
						
						if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipodocumentoAux.setes_defecto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR)) {
							existe=true;
							tipodocumentoAux.setes_mayor(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDocumento.getSelectedRows();
			
			TipoDocumento tipodocumentoLocal=new TipoDocumento();
			
			//this.seleccionarTodosTipoDocumento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLocal =(TipoDocumento) this.tipodocumentoLogic.getTipoDocumentos().toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodocumentoLocal =(TipoDocumento) this.tipodocumentos.toArray()[this.jTableDatosTipoDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodocumentoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
						tipodocumentoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumento tipodocumentoAux:tipodocumentos) {
						tipodocumentoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDocumentoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDocumentoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDocumento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumento tipodocumentoAux:this.tipodocumentoLogic.getTipoDocumentos()) {
				
						if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumento tipodocumentoAux:tipodocumentos) {
					
						if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDocumentoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDocumento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDocumento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDocumento) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDocumento(conSplash);
				
					this.generarReporteTipoDocumentosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumento();
				
				this.exportarTipoDocumentosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDocumentos();
				//this.importarTipoDocumentos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDocumento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDocumento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDocumento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDocumentoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDocumento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDocumento(conSplash);
					
						//this.actualizarParametrosGeneralTipoDocumento();
						
						this.generarReporteProcesoAccionTipoDocumentosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDocumentoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo DocumentoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDocumento();
				
						this.actualizarParametrosGeneralTipoDocumento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodocumentoReturnGeneral=tipodocumentoLogic.procesarAccionTipoDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodocumentoLogic.getTipoDocumentos(),this.tipodocumentoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDocumento();
					
					TipoDocumentoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDocumento.jComboBoxTiposAccionesFormularioTipoDocumento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDocumento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDocumentoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDocumento();
			
			if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
			TipoDocumento tipodocumento=new TipoDocumento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDocumento.getSelectedItem();
			
			
			
			
			tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodocumentosSeleccionados.size()==1) {
				for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
					tipodocumento=tipodocumentoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDocumento();
			
      		//this.finishProcessTipoDocumento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDocumentoReturnGeneral() throws Exception {
		if(this.tipodocumentoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodocumentoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodocumentoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodocumentoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDocumento(false);
		}
		
		if(this.tipodocumentoReturnGeneral.getConRetornoLista() || this.tipodocumentoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodocumentoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentoLogic.setTipoDocumentos(this.tipodocumentoReturnGeneral.getTipoDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodocumentoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentoLogic.setTipoDocumento(this.tipodocumentoReturnGeneral.getTipoDocumento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDocumento(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDocumento() throws Exception {
		
		
	}
	
	public ArrayList<TipoDocumento> getTipoDocumentosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDocumento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDocumento tipodocumentoAux:tipodocumentoLogic.getTipoDocumentos()) {
					if(tipodocumentoAux.getIsSelected()) {
						tipodocumentosSeleccionados.add(tipodocumentoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumento tipodocumentoAux:this.tipodocumentos) {
					if(tipodocumentoAux.getIsSelected()) {
						tipodocumentosSeleccionados.add(tipodocumentoAux);				
					}
				}
			}
			
			if(tipodocumentosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodocumentosSeleccionados.addAll(this.tipodocumentoLogic.getTipoDocumentos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodocumentosSeleccionados.addAll(this.tipodocumentos);				
					}
				}
			}
		} else {
			tipodocumentosSeleccionados.add(this.tipodocumento);
		}
		
		return tipodocumentosSeleccionados;
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
	
	public void generarReporteTipoDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDocumentosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDocumento();
		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDocumento();
		
		
		//this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados ,tipodocumentoImplementable,tipodocumentoImplementableHome);
	}
	
	public void mostrarImportacionTipoDocumentos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDocumento();
		
		this.abrirFrameImportacionTipoDocumento();		
		
			
		//this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados ,tipodocumentoImplementable,tipodocumentoImplementableHome);
	}
	
	public void importarTipoDocumentos() throws Exception {		
	
	}
	
	public void exportarTipoDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDocumentosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDocumentosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDocumentosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDocumento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDocumento(tipodocumentoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodocumentoAux.setsDetalleGeneralEntityReporte(tipodocumentoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDocumento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoConstantesFunciones.LABEL_ESMAYOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDocumento(TipoDocumento tipodocumento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodocumento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.gettipomovimientomodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getes_defecto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumento.getes_mayor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDocumento(row);				
				iRow++;
			}				
			
			for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDocumento(tipodocumentoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();		
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodocumentos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodocumento");
			//elementRoot.appendChild(element);
		
			for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
				element = document.createElement("tipodocumento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDocumento(tipodocumentoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDocumento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDocumento(TipoDocumento tipodocumento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.gettipomovimientomodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getes_defecto());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumento.getes_mayor());				
	}
	
	public void setFilaDatosExportarXmlTipoDocumento(TipoDocumento tipodocumento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDocumentoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodocumento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDocumentoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodocumento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDocumentoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodocumento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(TipoDocumentoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(tipodocumento.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(TipoDocumentoConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(tipodocumento.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementcodigo = document.createElement(TipoDocumentoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodocumento.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDocumentoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodocumento.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipomovimientomodulo_descripcion = document.createElement(TipoDocumentoConstantesFunciones.IDTIPOMOVIMIENTOMODULO);
		elementtipomovimientomodulo_descripcion.appendChild(document.createTextNode(tipodocumento.gettipomovimientomodulo_descripcion()));
		element.appendChild(elementtipomovimientomodulo_descripcion);

		Element elementes_defecto = document.createElement(TipoDocumentoConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(tipodocumento.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);

		Element elementes_mayor = document.createElement(TipoDocumentoConstantesFunciones.ESMAYOR);
		elementes_mayor.appendChild(document.createTextNode(tipodocumento.getes_mayor().toString().trim()));
		element.appendChild(elementes_mayor);
	}
	
	public void generarReporteGroupGenericoTipoDocumentosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDocumento> tipodocumentosSeleccionados=new ArrayList<TipoDocumento>();
		
		tipodocumentosSeleccionados=this.getTipoDocumentosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDocumento(tipodocumentosSeleccionados);
		
		this.generarReporteTipoDocumentos("Todos",tipodocumentosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDocumento(ArrayList<TipoDocumento> tipodocumentosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDocumento tipodocumentoAux:tipodocumentosSeleccionados) {
				tipodocumentoAux.setsDetalleGeneralEntityReporte(tipodocumentoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(tipodocumentoAux.gettipomovimientomodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipodocumentoAux.getes_defecto()));
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR)) {
					existe=true;
					tipodocumentoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipodocumentoAux.getes_mayor()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDocumento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDocumento=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDocumento=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDocumento=true;
			this.isVisibilidadCeldaCancelarTipoDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=true;
			this.isVisibilidadCeldaModificarTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
			this.isVisibilidadCeldaModificarTipoDocumento=true;
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=true;
		} else {
			this.actualizarEstadoPanelsTipoDocumento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDocumento=false;
			//this.isVisibilidadCeldaVerFormTipoDocumento=false;
			this.isVisibilidadCeldaDuplicarTipoDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodocumentoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!tipodocumentoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;												
			}
			
			this.jButtonCerrarTipoDocumento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumento=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodocumento)) {
			this.isVisibilidadCeldaActualizarTipoDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDocumento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumento() {
	}
	
	public void actualizarEstadoPanelsTipoDocumento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumento!=null) {
				this.jScrollPanelDatosTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumento!=null) {
				this.jPanelPaginacionTipoDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
					this.jTabbedPaneBusquedasTipoDocumento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDocumento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDocumento!=null) {
				this.jPanelParametrosReportesTipoDocumento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorCodigoTipoDocumento);}

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorNombreTipoDocumento);}

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdModuloTipoDocumento);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdTipoMovimientoTipoDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorCodigoTipoDocumento);}

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);}

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorNombreTipoDocumento);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdModuloTipoDocumento);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdTipoMovimientoTipoDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorCodigoTipoDocumento);}

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorNombreTipoDocumento);}

			this.isVisibilidadFK_IdModulo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdModuloTipoDocumento);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimiento;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdTipoMovimientoTipoDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimientoModulo(Boolean isParaTipoMovimientoModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoModuloNegation=!isParaTipoMovimientoModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoMovimientoModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorCodigoTipoDocumento);}

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo=isParaTipoMovimientoModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoMovimientoModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoMovimientoModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelBusquedaPorNombreTipoDocumento);}

			this.isVisibilidadFK_IdModulo=isParaTipoMovimientoModuloNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdModuloTipoDocumento);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimientoModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasTipoDocumento.remove(jPanelFK_IdTipoMovimientoTipoDocumento);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDocumentoSessionBean tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		
		if(this.tipodocumentoSessionBean==null) {
			this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		}
		
		this.tipodocumentoSessionBean.setsUltimaBusquedaTipoDocumento(this.getsAccionBusqueda());
		this.tipodocumentoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodocumentoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodocumentoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo")) {
			tipodocumentoSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo());	
			tipodocumentoSessionBean.setid_tipo_movimiento_modulo(this.getid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodocumentoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodocumentoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			tipodocumentoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
			tipodocumentoSessionBean.setid_tipo_movimiento(this.getid_tipo_movimientoFK_IdTipoMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDocumentoSessionBean tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		
		if(this.tipodocumentoSessionBean==null) {
			this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		}
		
		if(this.tipodocumentoSessionBean.getsUltimaBusquedaTipoDocumento()!=null&&!this.tipodocumentoSessionBean.getsUltimaBusquedaTipoDocumento().equals("")) {
			this.setsAccionBusqueda(tipodocumentoSessionBean.getsUltimaBusquedaTipoDocumento());
			this.setiNumeroPaginacion(tipodocumentoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodocumentoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodocumentoSessionBean.getcodigo());
				tipodocumentoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo")) {
				this.setid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo(tipodocumentoSessionBean.getid_modulo());
				tipodocumentoSessionBean.setid_modulo(-1L);
				this.setid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModulo(tipodocumentoSessionBean.getid_tipo_movimiento_modulo());
				tipodocumentoSessionBean.setid_tipo_movimiento_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodocumentoSessionBean.getnombre());
				tipodocumentoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodocumentoSessionBean.getid_empresa());
				tipodocumentoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(tipodocumentoSessionBean.getid_modulo());
				tipodocumentoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
				this.setid_tipo_movimientoFK_IdTipoMovimiento(tipodocumentoSessionBean.getid_tipo_movimiento());
				tipodocumentoSessionBean.setid_tipo_movimiento(-1L);
			}
		}
		
		this.tipodocumentoSessionBean.setsUltimaBusquedaTipoDocumento("");
		this.tipodocumentoSessionBean.setiNumeroPaginacion(TipoDocumentoConstantesFunciones.INUMEROPAGINACION);
		this.tipodocumentoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDocumento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDocumento() {
		this.updateBorderResaltarBusquedasFormularioTipoDocumento();
		this.updateVisibilidadBusquedasFormularioTipoDocumento();
		this.updateHabilitarBusquedasFormularioTipoDocumento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDocumento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDocumento.getComponents().length>0) {
	

		if(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumento);
			}
		}

		if(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			}
		}

		if(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDocumento);
			}
		}

		if(this.tipodocumentoConstantesFunciones.resaltarFK_IdModuloTipoDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdModuloTipoDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarFK_IdModuloTipoDocumento);
			}
		}

		if(this.tipodocumentoConstantesFunciones.resaltarFK_IdTipoMovimientoTipoDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdTipoMovimientoTipoDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarFK_IdTipoMovimientoTipoDocumento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDocumento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentoConstantesFunciones.mostrarBusquedaPorCodigoTipoDocumento);
			if(!this.tipodocumentoConstantesFunciones.mostrarBusquedaPorCodigoTipoDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentoConstantesFunciones.mostrarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			if(!this.tipodocumentoConstantesFunciones.mostrarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentoConstantesFunciones.mostrarBusquedaPorNombreTipoDocumento);
			if(!this.tipodocumentoConstantesFunciones.mostrarBusquedaPorNombreTipoDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdModuloTipoDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentoConstantesFunciones.mostrarFK_IdModuloTipoDocumento);
			if(!this.tipodocumentoConstantesFunciones.mostrarFK_IdModuloTipoDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdTipoMovimientoTipoDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentoConstantesFunciones.mostrarFK_IdTipoMovimientoTipoDocumento);
			if(!this.tipodocumentoConstantesFunciones.mostrarFK_IdTipoMovimientoTipoDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDocumento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentoConstantesFunciones.activarBusquedaPorCodigoTipoDocumento);
				this.jTabbedPaneBusquedasTipoDocumento.setEnabledAt(index,this.tipodocumentoConstantesFunciones.activarBusquedaPorCodigoTipoDocumento);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentoConstantesFunciones.activarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
				this.jTabbedPaneBusquedasTipoDocumento.setEnabledAt(index,this.tipodocumentoConstantesFunciones.activarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentoConstantesFunciones.activarBusquedaPorNombreTipoDocumento);
				this.jTabbedPaneBusquedasTipoDocumento.setEnabledAt(index,this.tipodocumentoConstantesFunciones.activarBusquedaPorNombreTipoDocumento);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdModuloTipoDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentoConstantesFunciones.activarFK_IdModuloTipoDocumento);
				this.jTabbedPaneBusquedasTipoDocumento.setEnabledAt(index,this.tipodocumentoConstantesFunciones.activarFK_IdModuloTipoDocumento);
			}

			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdTipoMovimientoTipoDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentoConstantesFunciones.activarFK_IdTipoMovimientoTipoDocumento);
				this.jTabbedPaneBusquedasTipoDocumento.setEnabledAt(index,this.tipodocumentoConstantesFunciones.activarFK_IdTipoMovimientoTipoDocumento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDocumento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumento);

			this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);

			this.tipodocumentoConstantesFunciones.setResaltarBusquedaPorCodigoTipoDocumento(resaltar);

			jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoMovimientoModulo")) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);

			this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);

			this.tipodocumentoConstantesFunciones.setResaltarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento(resaltar);

			jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumento);

			this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);

			this.tipodocumentoConstantesFunciones.setResaltarBusquedaPorNombreTipoDocumento(resaltar);

			jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdModuloTipoDocumento);

			this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);

			this.tipodocumentoConstantesFunciones.setResaltarFK_IdModuloTipoDocumento(resaltar);

			jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarFK_IdModuloTipoDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMovimiento")) {
			index= this.jTabbedPaneBusquedasTipoDocumento.indexOfComponent(this.jPanelFK_IdTipoMovimientoTipoDocumento);

			this.jTabbedPaneBusquedasTipoDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumento.getComponent(index);

			this.tipodocumentoConstantesFunciones.setResaltarFK_IdTipoMovimientoTipoDocumento(resaltar);

			jPanel.setBorder(this.tipodocumentoConstantesFunciones.resaltarFK_IdTipoMovimientoTipoDocumento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDocumento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDocumento() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDocumento();
		this.updateVisibilidadResaltarControlesFormularioTipoDocumento();
		this.updateHabilitarResaltarControlesFormularioTipoDocumento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodocumentoConstantesFunciones.resaltaridTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltaridTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarid_empresaTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarid_empresaTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarid_moduloTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarid_moduloTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimientoTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimientoTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarcodigoTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarcodigoTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarnombreTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarnombreTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimiento_moduloTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltarid_tipo_movimiento_moduloTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltares_defectoTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setBorderPainted(true);this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltares_defectoTipoDocumento);}
		if(this.tipodocumentoConstantesFunciones.resaltares_mayorTipoDocumento!=null && this.jInternalFrameDetalleFormTipoDocumento!=null) {this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setBorderPainted(true);this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setBorder(this.tipodocumentoConstantesFunciones.resaltares_mayorTipoDocumento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDocumento() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
	
		//this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostraridTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelidTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostraridTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_empresaTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelid_empresaTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_empresaTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_moduloTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelid_moduloTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_moduloTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_tipo_movimientoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelid_tipo_movimientoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_tipo_movimientoTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarcodigoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelcodigoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarcodigoTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarnombreTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelnombreTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarnombreTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_tipo_movimiento_moduloTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPanelid_tipo_movimiento_moduloTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrarid_tipo_movimiento_moduloTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrares_defectoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPaneles_defectoTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrares_defectoTipoDocumento);
		//this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrares_mayorTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jPaneles_mayorTipoDocumento.setVisible(this.tipodocumentoConstantesFunciones.mostrares_mayorTipoDocumento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumento!=null) {
	
		this.jInternalFrameDetalleFormTipoDocumento.jLabelidTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activaridTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_empresaTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarid_empresaTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_moduloTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarid_moduloTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimientoTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarid_tipo_movimientoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jTextFieldcodigoTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarcodigoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jTextAreanombreTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarnombreTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jComboBoxid_tipo_movimiento_moduloTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activarid_tipo_movimiento_moduloTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_defectoTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activares_defectoTipoDocumento);
		this.jInternalFrameDetalleFormTipoDocumento.jCheckBoxes_mayorTipoDocumento.setEnabled(this.tipodocumentoConstantesFunciones.activares_mayorTipoDocumento);
		}
	}
	
		
}