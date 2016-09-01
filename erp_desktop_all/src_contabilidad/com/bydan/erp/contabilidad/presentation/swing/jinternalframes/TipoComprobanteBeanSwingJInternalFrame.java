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

import com.bydan.erp.contabilidad.util.TipoComprobanteConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoComprobanteParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoComprobanteParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoComprobanteBean;
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
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoComprobanteBeanSwingJInternalFrame extends TipoComprobanteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoComprobanteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoComprobante> tipocomprobanteValidator = new ClassValidator<TipoComprobante>(TipoComprobante.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoComprobante tipocomprobante;	
	public TipoComprobante tipocomprobanteAux;
	public TipoComprobante tipocomprobanteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoComprobante tipocomprobanteTotales;
	public Long idTipoComprobanteActual;
	public Long iIdNuevoTipoComprobante=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
	}


	public Boolean isTienePermisosTransaccion=false;

	public Boolean getIsTienePermisosTransaccion() {
		return isTienePermisosTransaccion;
	}

	public void setIsTienePermisosTransaccion(Boolean isTienePermisosTransaccion) {
		this.isTienePermisosTransaccion= isTienePermisosTransaccion;
	}


	public Boolean isTienePermisosDocumentoAnulado=false;

	public Boolean getIsTienePermisosDocumentoAnulado() {
		return isTienePermisosDocumentoAnulado;
	}

	public void setIsTienePermisosDocumentoAnulado(Boolean isTienePermisosDocumentoAnulado) {
		this.isTienePermisosDocumentoAnulado= isTienePermisosDocumentoAnulado;
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
	
	public Boolean isPermisoTodoTipoComprobante;
	public Boolean isPermisoNuevoTipoComprobante;
	public Boolean isPermisoActualizarTipoComprobante;
	public Boolean isPermisoActualizarOriginalTipoComprobante;
	public Boolean isPermisoEliminarTipoComprobante;
	public Boolean isPermisoGuardarCambiosTipoComprobante;
	public Boolean isPermisoConsultaTipoComprobante;
	public Boolean isPermisoBusquedaTipoComprobante;
	public Boolean isPermisoReporteTipoComprobante;
	public Boolean isPermisoPaginacionMedioTipoComprobante;
	public Boolean isPermisoPaginacionAltoTipoComprobante;
	public Boolean isPermisoPaginacionTodoTipoComprobante;
	public Boolean isPermisoCopiarTipoComprobante;
	public Boolean isPermisoVerFormTipoComprobante;
	public Boolean isPermisoDuplicarTipoComprobante;
	public Boolean isPermisoOrdenTipoComprobante;
	
	
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
	
	public TipoComprobanteParameterReturnGeneral tipocomprobanteReturnGeneral;
	public TipoComprobanteParameterReturnGeneral tipocomprobanteParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}


	public TransaccionLogic transaccionLogic=null;

	public TransaccionLogic getTransaccionLogic() {
		return transaccionLogic;
	}

	public void setTransaccionLogic(TransaccionLogic transaccionLogic) {
		this.transaccionLogic = transaccionLogic;
	}


	public DocumentoAnuladoLogic documentoanuladoLogic=null;

	public DocumentoAnuladoLogic getDocumentoAnuladoLogic() {
		return documentoanuladoLogic;
	}

	public void setDocumentoAnuladoLogic(DocumentoAnuladoLogic documentoanuladoLogic) {
		this.documentoanuladoLogic = documentoanuladoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoComprobante=false;
	public Boolean esParaAccionDesdeFormularioTipoComprobante=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoComprobanteLogic tipocomprobanteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoComprobante tipocomprobanteBean;
	public TipoComprobanteConstantesFunciones tipocomprobanteConstantesFunciones;
	//public TipoComprobanteParameterReturnGeneral tipocomprobanteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoComprobante> tipocomprobantes;	
	//public List<TipoComprobante> tipocomprobantesEliminados;
	//public List<TipoComprobante> tipocomprobantesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoComprobante=false;
	public Boolean isVisibilidadCeldaDuplicarTipoComprobante=true;
	public Boolean isVisibilidadCeldaCopiarTipoComprobante=true;
	public Boolean isVisibilidadCeldaVerFormTipoComprobante=true;
	public Boolean isVisibilidadCeldaOrdenTipoComprobante=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
	public Boolean isVisibilidadCeldaModificarTipoComprobante=false;
	public Boolean isVisibilidadCeldaActualizarTipoComprobante=false;
	public Boolean isVisibilidadCeldaEliminarTipoComprobante=false;
	public Boolean isVisibilidadCeldaCancelarTipoComprobante=false;
	public Boolean isVisibilidadCeldaGuardarTipoComprobante=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoComprobante=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoComprobante() {
		return this.iIdNuevoTipoComprobante;
	}

	public void setiIdNuevoTipoComprobante(Long iIdNuevoTipoComprobante) {
		this.iIdNuevoTipoComprobante = iIdNuevoTipoComprobante;
	}
	
	public Long getidTipoComprobanteActual() {
		return this.idTipoComprobanteActual;
	}

	public void setidTipoComprobanteActual(Long idTipoComprobanteActual) {
		this.idTipoComprobanteActual = idTipoComprobanteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoComprobante gettipocomprobante() {
		return this.tipocomprobante;
	}

	public void settipocomprobante(TipoComprobante tipocomprobante) {
		this.tipocomprobante = tipocomprobante;
	}
	
	public TipoComprobante gettipocomprobanteAux() {
		return this.tipocomprobanteAux;
	}

	public void settipocomprobanteAux(TipoComprobante tipocomprobanteAux) {
		this.tipocomprobanteAux = tipocomprobanteAux;
	}				
	
	public TipoComprobante gettipocomprobanteAnterior() {
		return this.tipocomprobanteAnterior;
	}

	public void settipocomprobanteAnterior(TipoComprobante tipocomprobanteAnterior) {
		this.tipocomprobanteAnterior = tipocomprobanteAnterior;
	}	
	
	public TipoComprobante gettipocomprobanteTotales() {
		return this.tipocomprobanteTotales;
	}

	public void settipocomprobanteTotales(TipoComprobante tipocomprobanteTotales) {
		this.tipocomprobanteTotales = tipocomprobanteTotales;
	}	
	
	public TipoComprobante gettipocomprobanteBean() {
		return this.tipocomprobanteBean;
	}

	public void settipocomprobanteBean(TipoComprobante tipocomprobanteBean) {
		this.tipocomprobanteBean = tipocomprobanteBean;
	}	
	
	public TipoComprobanteParameterReturnGeneral gettipocomprobanteReturnGeneral() {
		return this.tipocomprobanteReturnGeneral;
	}

	public void settipocomprobanteReturnGeneral(TipoComprobanteParameterReturnGeneral tipocomprobanteReturnGeneral) {
		this.tipocomprobanteReturnGeneral = tipocomprobanteReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoComprobanteLogic getTipoComprobanteLogic()	{		
		return tipocomprobanteLogic;
	}

	public void setTipoComprobanteLogic(TipoComprobanteLogic tipocomprobanteLogic) {
		this.tipocomprobanteLogic = tipocomprobanteLogic;
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
	
	public Boolean getIsEsNuevoTipoComprobante() {
		return isEsNuevoTipoComprobante;
	}

	public void setIsEsNuevoTipoComprobante(Boolean isEsNuevoTipoComprobante) {
		this.isEsNuevoTipoComprobante = isEsNuevoTipoComprobante;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoComprobante() {
		return esParaAccionDesdeFormularioTipoComprobante;
	}
	
	public void setEsParaAccionDesdeFormularioTipoComprobante(Boolean esParaAccionDesdeFormularioTipoComprobante) {
		this.esParaAccionDesdeFormularioTipoComprobante = esParaAccionDesdeFormularioTipoComprobante;
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

			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			}

			if(!this.tipocomprobanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocomprobanteSessionBean.getlidEmpresaActual());
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

					if(this.tipocomprobante!=null) {
						this.tipocomprobante.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
						this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoComprobante.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
						if(this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoComprobanteGenerico)throws Exception
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
				jComboBoxid_empresaTipoComprobanteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoComprobanteGenerico!=null && jComboBoxid_empresaTipoComprobanteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoComprobanteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoComprobante tipocomprobante,JComboBox jComboBoxid_empresaTipoComprobanteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoComprobanteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoComprobanteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocomprobante.setid_empresa(empresaAux.getId());
				tipocomprobante.setempresa_descripcion(TipoComprobanteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocomprobante.setEmpresa(empresaAux);			}
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

					if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoComprobante!=null) { 
							this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoComprobante!=null) { 
					}

					if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
							this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
							this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoComprobante() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoComprobanteConstantesFunciones.refrescarForeignKeysDescripcionesTipoComprobante(this.tipocomprobanteLogic.getTipoComprobantes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoComprobanteConstantesFunciones.refrescarForeignKeysDescripcionesTipoComprobante(this.tipocomprobantes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocomprobanteLogic.setTipoComprobantes(this.tipocomprobantes);
			tipocomprobanteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoComprobanteParameterReturnGeneral getTipoComprobanteParameterGeneral() {
		return this.tipocomprobanteParameterGeneral;
	}
	
	public void setTipoComprobanteParameterGeneral(TipoComprobanteParameterReturnGeneral tipocomprobanteParameterGeneral) {
		this.tipocomprobanteParameterGeneral = tipocomprobanteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoComprobante() {
		return isPermisoTodoTipoComprobante;
	}

	public void setIsPermisoTodoTipoComprobante(Boolean isPermisoTodoTipoComprobante) {
		this.isPermisoTodoTipoComprobante = isPermisoTodoTipoComprobante;
	}

	public Boolean getIsPermisoNuevoTipoComprobante() {
		return isPermisoNuevoTipoComprobante;
	}

	public void setIsPermisoNuevoTipoComprobante(Boolean isPermisoNuevoTipoComprobante) {
		this.isPermisoNuevoTipoComprobante = isPermisoNuevoTipoComprobante;
	}

	public Boolean getIsPermisoActualizarTipoComprobante() {
		return isPermisoActualizarTipoComprobante;
	}

	public void setIsPermisoActualizarTipoComprobante(Boolean isPermisoActualizarTipoComprobante) {
		this.isPermisoActualizarTipoComprobante = isPermisoActualizarTipoComprobante;
	}

	public Boolean getIsPermisoEliminarTipoComprobante() {
		return isPermisoEliminarTipoComprobante;
	}

	public void setIsPermisoEliminarTipoComprobante(Boolean isPermisoEliminarTipoComprobante) {
		this.isPermisoEliminarTipoComprobante = isPermisoEliminarTipoComprobante;
	}

	public Boolean getIsPermisoGuardarCambiosTipoComprobante() {
		return isPermisoGuardarCambiosTipoComprobante;
	}

	public void setIsPermisoGuardarCambiosTipoComprobante(Boolean isPermisoGuardarCambiosTipoComprobante) {
		this.isPermisoGuardarCambiosTipoComprobante = isPermisoGuardarCambiosTipoComprobante;
	}
	
	public Boolean getIsPermisoConsultaTipoComprobante() {
		return isPermisoConsultaTipoComprobante;
	}

	public void setIsPermisoConsultaTipoComprobante(Boolean isPermisoConsultaTipoComprobante) {
		this.isPermisoConsultaTipoComprobante = isPermisoConsultaTipoComprobante;
	}

	public Boolean getIsPermisoBusquedaTipoComprobante() {
		return isPermisoBusquedaTipoComprobante;
	}

	public void setIsPermisoBusquedaTipoComprobante(Boolean isPermisoBusquedaTipoComprobante) {
		this.isPermisoBusquedaTipoComprobante = isPermisoBusquedaTipoComprobante;
	}

	public Boolean getIsPermisoReporteTipoComprobante() {
		return isPermisoReporteTipoComprobante;
	}

	public void setIsPermisoReporteTipoComprobante(Boolean isPermisoReporteTipoComprobante) {
		this.isPermisoReporteTipoComprobante = isPermisoReporteTipoComprobante;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoComprobante() {
		return isPermisoPaginacionMedioTipoComprobante;
	}

	public void setIsPermisoPaginacionMedioTipoComprobante(Boolean isPermisoPaginacionMedioTipoComprobante) {
		this.isPermisoPaginacionMedioTipoComprobante = isPermisoPaginacionMedioTipoComprobante;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoComprobante() {
		return isPermisoPaginacionTodoTipoComprobante;
	}

	public void setIsPermisoPaginacionTodoTipoComprobante(Boolean isPermisoPaginacionTodoTipoComprobante) {
		this.isPermisoPaginacionTodoTipoComprobante = isPermisoPaginacionTodoTipoComprobante;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoComprobante() {
		return isPermisoPaginacionAltoTipoComprobante;
	}

	public void setIsPermisoPaginacionAltoTipoComprobante(Boolean isPermisoPaginacionAltoTipoComprobante) {
		this.isPermisoPaginacionAltoTipoComprobante = isPermisoPaginacionAltoTipoComprobante;
	}
	
	public Boolean getIsPermisoCopiarTipoComprobante() {
		return isPermisoCopiarTipoComprobante;
	}

	public void setIsPermisoCopiarTipoComprobante(Boolean isPermisoCopiarTipoComprobante) {
		this.isPermisoCopiarTipoComprobante = isPermisoCopiarTipoComprobante;
	}
	
	public Boolean getIsPermisoVerFormTipoComprobante() {
		return isPermisoVerFormTipoComprobante;
	}

	public void setIsPermisoVerFormTipoComprobante(Boolean isPermisoVerFormTipoComprobante) {
		this.isPermisoVerFormTipoComprobante = isPermisoVerFormTipoComprobante;
	}
	
	public Boolean getIsPermisoDuplicarTipoComprobante() {
		return isPermisoDuplicarTipoComprobante;
	}

	public void setIsPermisoDuplicarTipoComprobante(Boolean isPermisoDuplicarTipoComprobante) {
		this.isPermisoDuplicarTipoComprobante = isPermisoDuplicarTipoComprobante;
	}
	
	public Boolean getIsPermisoOrdenTipoComprobante() {
		return isPermisoOrdenTipoComprobante;
	}

	public void setIsPermisoOrdenTipoComprobante(Boolean isPermisoOrdenTipoComprobante) {
		this.isPermisoOrdenTipoComprobante = isPermisoOrdenTipoComprobante;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoComprobante() {
		return isVisibilidadCeldaNuevoTipoComprobante;
	}

	public void setIsVisibilidadCeldaNuevoTipoComprobante(Boolean isVisibilidadCeldaNuevoTipoComprobante) {
		this.isVisibilidadCeldaNuevoTipoComprobante = isVisibilidadCeldaNuevoTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoComprobante() {
		return isVisibilidadCeldaDuplicarTipoComprobante;
	}

	public void setIsVisibilidadCeldaDuplicarTipoComprobante(Boolean isVisibilidadCeldaDuplicarTipoComprobante) {
		this.isVisibilidadCeldaDuplicarTipoComprobante = isVisibilidadCeldaDuplicarTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoComprobante() {
		return isVisibilidadCeldaCopiarTipoComprobante;
	}

	public void setIsVisibilidadCeldaCopiarTipoComprobante(Boolean isVisibilidadCeldaCopiarTipoComprobante) {
		this.isVisibilidadCeldaCopiarTipoComprobante = isVisibilidadCeldaCopiarTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoComprobante() {
		return isVisibilidadCeldaVerFormTipoComprobante;
	}

	public void setIsVisibilidadCeldaVerFormTipoComprobante(Boolean isVisibilidadCeldaVerFormTipoComprobante) {
		this.isVisibilidadCeldaVerFormTipoComprobante = isVisibilidadCeldaVerFormTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoComprobante() {
		return isVisibilidadCeldaOrdenTipoComprobante;
	}

	public void setIsVisibilidadCeldaOrdenTipoComprobante(Boolean isVisibilidadCeldaOrdenTipoComprobante) {
		this.isVisibilidadCeldaOrdenTipoComprobante = isVisibilidadCeldaOrdenTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoComprobante() {
		return isVisibilidadCeldaNuevoRelacionesTipoComprobante;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoComprobante(Boolean isVisibilidadCeldaNuevoRelacionesTipoComprobante) {
		this.isVisibilidadCeldaNuevoRelacionesTipoComprobante = isVisibilidadCeldaNuevoRelacionesTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoComprobante() {
		return isVisibilidadCeldaModificarTipoComprobante;
	}

	public void setIsVisibilidadCeldaModificarTipoComprobante(Boolean isVisibilidadCeldaModificarTipoComprobante) {
		this.isVisibilidadCeldaModificarTipoComprobante = isVisibilidadCeldaModificarTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoComprobante() {
		return isVisibilidadCeldaActualizarTipoComprobante;
	}

	public void setIsVisibilidadCeldaActualizarTipoComprobante(Boolean isVisibilidadCeldaActualizarTipoComprobante) {
		this.isVisibilidadCeldaActualizarTipoComprobante = isVisibilidadCeldaActualizarTipoComprobante;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoComprobante() {
		return isVisibilidadCeldaEliminarTipoComprobante;
	}

	public void setIsVisibilidadCeldaEliminarTipoComprobante(Boolean isVisibilidadCeldaEliminarTipoComprobante) {
		this.isVisibilidadCeldaEliminarTipoComprobante = isVisibilidadCeldaEliminarTipoComprobante;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoComprobante() {
		return isVisibilidadCeldaCancelarTipoComprobante;
	}

	public void setIsVisibilidadCeldaCancelarTipoComprobante(Boolean isVisibilidadCeldaCancelarTipoComprobante) {
		this.isVisibilidadCeldaCancelarTipoComprobante = isVisibilidadCeldaCancelarTipoComprobante;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoComprobante() {
		return isVisibilidadCeldaGuardarTipoComprobante;
	}

	public void setIsVisibilidadCeldaGuardarTipoComprobante(Boolean isVisibilidadCeldaGuardarTipoComprobante) {
		this.isVisibilidadCeldaGuardarTipoComprobante = isVisibilidadCeldaGuardarTipoComprobante;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoComprobante() {
		return isVisibilidadCeldaGuardarCambiosTipoComprobante;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoComprobante(Boolean isVisibilidadCeldaGuardarCambiosTipoComprobante) {
		this.isVisibilidadCeldaGuardarCambiosTipoComprobante = isVisibilidadCeldaGuardarCambiosTipoComprobante;
	}
		
	public TipoComprobanteSessionBean gettipocomprobanteSessionBean() {
		return this.tipocomprobanteSessionBean;
	}
	
	public void settipocomprobanteSessionBean(TipoComprobanteSessionBean tipocomprobanteSessionBean) {
		this.tipocomprobanteSessionBean=tipocomprobanteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(TipoComprobante tipocomprobante)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocomprobante,null);
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
	
	public void bugActualizarReferenciaActual(TipoComprobante tipocomprobante,TipoComprobante tipocomprobanteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoComprobante(tipocomprobante);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocomprobanteAux.setId(tipocomprobante.getId());
		tipocomprobanteAux.setVersionRow(tipocomprobante.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoComprobante();
		
			int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocomprobanteValidator.getInvalidValues(this.tipocomprobante);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocomprobanteLogic.setDatosCliente(datosCliente);
			tipocomprobanteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocomprobanteAux=new  TipoComprobante();
				
				tipocomprobanteAux.setIsNew(true);
				tipocomprobanteAux.setIsChanged(true);
				
				tipocomprobanteAux.setTipoComprobanteOriginal(this.tipocomprobante);
				
				tipocomprobanteAux.setId(this.tipocomprobante.getId());	
				tipocomprobanteAux.setVersionRow(this.tipocomprobante.getVersionRow());	
				tipocomprobanteAux.setid_empresa(this.tipocomprobante.getid_empresa());	
				tipocomprobanteAux.setnombre(this.tipocomprobante.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocomprobanteAux,tipocomprobanteLogic.getTipoComprobantes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomprobanteAux,tipocomprobantes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.saveTipoComprobantes();//WithConnection
						//tipocomprobanteLogic.getSetVersionRowTipoComprobantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocomprobante,tipocomprobanteAux);
					
					this.refrescarForeignKeysDescripcionesTipoComprobante();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocomprobanteAux=new  TipoComprobante();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocomprobanteSessionBean.getEsGuardarRelacionado() && this.tipocomprobante.getId()>=0)) {
						
					tipocomprobanteAux.setIsNew(false);
				}
				
				tipocomprobanteAux.setIsDeleted(false);
			
				tipocomprobanteAux.setId(this.tipocomprobante.getId());	
				tipocomprobanteAux.setVersionRow(this.tipocomprobante.getVersionRow());	
				tipocomprobanteAux.setid_empresa(this.tipocomprobante.getid_empresa());	
				tipocomprobanteAux.setnombre(this.tipocomprobante.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomprobanteAux,tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomprobanteAux,tipocomprobantes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.saveTipoComprobantes();//WithConnection
						//tipocomprobanteLogic.getSetVersionRowTipoComprobantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocomprobante,tipocomprobanteAux);
					
					this.refrescarForeignKeysDescripcionesTipoComprobante();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocomprobanteAux=new  TipoComprobante();
				
				tipocomprobanteAux.setIsNew(false);
				tipocomprobanteAux.setIsChanged(false);
				
				tipocomprobanteAux.setIsDeleted(true);
				
				tipocomprobanteAux.setId(this.tipocomprobante.getId());	
				tipocomprobanteAux.setVersionRow(this.tipocomprobante.getVersionRow());	
				tipocomprobanteAux.setid_empresa(this.tipocomprobante.getid_empresa());	
				tipocomprobanteAux.setnombre(this.tipocomprobante.getnombre());	
				
				if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocomprobanteAux.getId()>=0) {	
						this.tipocomprobantesEliminados.add(tipocomprobanteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocomprobanteAux,tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomprobanteAux,tipocomprobantes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.saveTipoComprobantes();//WithConnection
						//tipocomprobanteLogic.getSetVersionRowTipoComprobantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomprobanteAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomprobanteAux.setTransaccions(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());

							if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomprobanteAux.setDocumentoAnulados(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocomprobanteAux,tipocomprobanteLogic.getTipoComprobantes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocomprobanteAux,tipocomprobantes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getTipoComprobantes().addAll(this.tipocomprobantesEliminados);
					
					tipocomprobanteLogic.saveTipoComprobantes();//WithConnection
					//tipocomprobanteLogic.getSetVersionRowTipoComprobantes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoComprobante();
				
				this.tipocomprobantesEliminados= new ArrayList<TipoComprobante>();		
			}
			
			if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Comprobante GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocomprobante=tipocomprobanteAux;
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
      		//this.finishProcessTipoComprobante();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoComprobante tipocomprobanteLocal) throws Exception {
		
		if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocomprobanteLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
				tipocomprobanteLocal.setTransaccions(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());
				tipocomprobanteLocal.setDocumentoAnulados(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
			
			} else {
			
				tipocomprobanteLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);
				tipocomprobanteLocal.setTransaccions(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccions);
				tipocomprobanteLocal.setDocumentoAnulados(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanulados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoComprobante tipocomprobanteLocal) throws Exception {	
		if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocomprobanteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoComprobanteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocomprobanteValidator.getInvalidValues(this.tipocomprobante);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoComprobante tipocomprobante,List<TipoComprobante> tipocomprobantes) throws Exception {
		try	{		
			TipoComprobanteConstantesFunciones.actualizarLista(tipocomprobante,tipocomprobantes,this.tipocomprobanteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoComprobante tipocomprobante,List<TipoComprobante> tipocomprobantes) throws Exception {
		try	{			
			TipoComprobanteConstantesFunciones.actualizarSelectedLista(tipocomprobante,tipocomprobantes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoComprobante> tipocomprobantesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocomprobantesLocal=this.tipocomprobanteLogic.getTipoComprobantes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocomprobantesLocal=this.tipocomprobantes;
			}
			//ARCHITECTURE
		
			for(TipoComprobante tipocomprobanteLocal:tipocomprobantesLocal) {
				if(this.permiteMantenimiento(tipocomprobanteLocal) && tipocomprobanteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoComprobanteConstantesFunciones.getTipoComprobanteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoComprobanteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComprobante.jLabelid_empresaTipoComprobante,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoComprobanteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComprobante.jLabelnombreTipoComprobante,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoComprobante.jLabelid_empresaTipoComprobante,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoComprobante.jLabelnombreTipoComprobante,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.tipocomprobante==null) {
				this.tipocomprobante= new TipoComprobante();
			}

			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoComprobante
				this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);

				this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setTipoComprobante(this.tipocomprobante);
			}

			return;
		}
		 else  if(sTipo.equals("Transaccion")) {
			if(this.tipocomprobante==null) {
				this.tipocomprobante= new TipoComprobante();
			}

			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoComprobante
				this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);

				this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.gettransaccion().setTipoComprobante(this.tipocomprobante);
			}

			return;
		}
		 else  if(sTipo.equals("DocumentoAnulado")) {
			if(this.tipocomprobante==null) {
				this.tipocomprobante= new TipoComprobante();
			}

			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoComprobante
				this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);

				this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.getdocumentoanulado().setTipoComprobante(this.tipocomprobante);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoComprobante--;	
		
		
		this.tipocomprobanteAux=new TipoComprobante();
		
		this.tipocomprobanteAux.setId(this.iIdNuevoTipoComprobante);
		this.tipocomprobanteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocomprobanteLogic.getTipoComprobantes().add(this.tipocomprobanteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocomprobantes.add(this.tipocomprobanteAux);
		}
		//ARCHITECTURE
		
		this.tipocomprobante=this.tipocomprobanteAux;
		
		if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoComprobante(this.tipocomprobante);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoComprobante(this.tipocomprobante);
		}
				
		//this.setDefaultControlesTipoComprobante();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoComprobante();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoComprobante();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComprobante();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoComprobante(this.tipocomprobanteBean,this.tipocomprobante,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoComprobanteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
			classes=TipoComprobanteConstantesFunciones.getClassesRelationshipsOfTipoComprobante(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocomprobanteReturnGeneral=tipocomprobanteLogic.procesarEventosTipoComprobantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomprobanteLogic.getTipoComprobantes(),this.tipocomprobante,this.tipocomprobanteParameterGeneral,this.isEsNuevoTipoComprobante,classes);//this.tipocomprobanteLogic.getTipoComprobante()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoComprobante(this.tipocomprobanteReturnGeneral,this.tipocomprobanteBean,false);
		
		if(this.tipocomprobanteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante());
		}
		
		if(this.tipocomprobanteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante(),classes);//this.tipocomprobanteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoComprobante();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoComprobante();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoComprobante(false);
						
			if(tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado() && TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado() && DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDocumentoAnuladoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComprobante();
			}
			
			this.actualizarVisualTableDatosTipoComprobante();
			
			this.jTableDatosTipoComprobante.setRowSelectionInterval(this.getIndiceNuevoTipoComprobante(), this.getIndiceNuevoTipoComprobante());
			
			this.seleccionarFilaTablaTipoComprobanteActual();
						
			this.actualizarEstadoCeldasBotonesTipoComprobante("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoComprobante(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setEnabled(isHabilitar && this.tipocomprobanteConstantesFunciones.activarnombreTipoComprobante);	
		//
		this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setEnabled(isHabilitar && this.tipocomprobanteConstantesFunciones.activarid_empresaTipoComprobante);
	};
	
	public void setDefaultControlesTipoComprobante() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoComprobante(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocomprobanteSessionBean.setConGuardarRelaciones(true);			
			this.tipocomprobanteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocomprobanteSessionBean.setConGuardarRelaciones(false);			
			this.tipocomprobanteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoComprobante() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
				if(tipocomprobanteAux.getId().equals(this.iIdNuevoTipoComprobante)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobantes) {
				if(tipocomprobanteAux.getId().equals(this.iIdNuevoTipoComprobante)) {
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
	
	public int getIndiceActualTipoComprobante(TipoComprobante tipocomprobante,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
				if(tipocomprobanteAux.getId().equals(tipocomprobante.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobantes) {
				if(tipocomprobanteAux.getId().equals(tipocomprobante.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoComprobante(TipoComprobante tipocomprobanteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
				if(tipocomprobanteAux.getTipoComprobanteOriginal().getId().equals(tipocomprobanteOriginal.getId())) {
					existe=true;
					tipocomprobanteOriginal.setId(tipocomprobanteAux.getId());
					tipocomprobanteOriginal.setVersionRow(tipocomprobanteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComprobante tipocomprobanteAux:this.tipocomprobantes) {
				if(tipocomprobanteAux.getTipoComprobanteOriginal().getId().equals(tipocomprobanteOriginal.getId())) {
					existe=true;
					tipocomprobanteOriginal.setId(tipocomprobanteAux.getId());
					tipocomprobanteOriginal.setVersionRow(tipocomprobanteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoComprobante(Boolean esParaCancelar) throws Exception {
		tipocomprobantesAux=new ArrayList<TipoComprobante>();
		tipocomprobanteAux=new TipoComprobante();
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
					if(tipocomprobanteAux.getId()<0) {
						tipocomprobantesAux.add(tipocomprobanteAux);
					}		
				}
				this.iIdNuevoTipoComprobante=0L;
				this.tipocomprobanteLogic.getTipoComprobantes().removeAll(tipocomprobantesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComprobante tipocomprobanteAux:this.tipocomprobantes) {
					if(tipocomprobanteAux.getId()<0) {
						tipocomprobantesAux.add(tipocomprobanteAux);
					}		
				}
				this.iIdNuevoTipoComprobante=0L;
				this.tipocomprobantes.removeAll(tipocomprobantesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoComprobante 
					&& this.tipocomprobanteLogic.getTipoComprobantes().size()>0
					) {
					tipocomprobanteAux=this.tipocomprobanteLogic.getTipoComprobantes().get(this.tipocomprobanteLogic.getTipoComprobantes().size() - 1);
				
					if(tipocomprobanteAux.getId()<0) {
						this.tipocomprobanteLogic.getTipoComprobantes().remove(tipocomprobanteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoComprobante && this.tipocomprobantes.size()>0) {
					tipocomprobanteAux=this.tipocomprobantes.get(this.tipocomprobantes.size() - 1);
				
					if(tipocomprobanteAux.getId()<0) {
						this.tipocomprobantes.remove(tipocomprobanteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoComprobante(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocomprobante.getId()<0) {
				this.tipocomprobanteLogic.getTipoComprobantes().remove(this.tipocomprobante);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocomprobante.getId()<0) {
				this.tipocomprobantes.remove(this.tipocomprobante);
			}
		}			
	}
	
	public void setEstadosInicialesTipoComprobante(List<TipoComprobante> tipocomprobantesAux) throws Exception {
		TipoComprobanteConstantesFunciones.setEstadosInicialesTipoComprobante(tipocomprobantesAux);
	}
	
	public void setEstadosInicialesTipoComprobante(TipoComprobante tipocomprobanteAux) throws Exception {
		TipoComprobanteConstantesFunciones.setEstadosInicialesTipoComprobante(tipocomprobanteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoComprobanteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoComprobanteActual()) {
				if(!this.isEsNuevoTipoComprobante) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoComprobante=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoComprobanteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Comprobante ?", "MANTENIMIENTO DE Tipo Comprobante", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoComprobante tipocomprobante) throws Exception {
		TipoComprobanteConstantesFunciones.seleccionarAsignar(this.tipocomprobante,tipocomprobante);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoComprobante=this.isPermisoActualizarOriginalTipoComprobante;
			
			
			this.seleccionarAsignar(tipocomprobante);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoComprobanteConstantesFunciones.quitarEspaciosTipoComprobante(this.tipocomprobante,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoComprobante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocomprobanteSessionBean.setsFuncionBusquedaRapida(this.tipocomprobanteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoComprobante) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoComprobante(esParaCancelar);				
				this.cancelarNuevoTipoComprobante(esParaCancelar);								
			}
			
			this.tipocomprobante=new TipoComprobante();
			
			this.inicializarTipoComprobante();
			
			this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoComprobante() throws Exception {
		try {
			TipoComprobanteConstantesFunciones.inicializarTipoComprobante(this.tipocomprobante);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocomprobanteLogic.getTipoComprobantes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoComprobantes(String sAccionBusqueda,List<TipoComprobante> tipocomprobantesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoComprobante"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoComprobanteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoComprobanteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoComprobante"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Comprobantes");		
		parameters.put("busquedapor", TipoComprobanteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			classes.add(new Classe(Transaccion.class));
			classes.add(new Classe(DocumentoAnulado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoComprobanteLogic tipocomprobanteLogicAuxiliar=new TipoComprobanteLogic();
					tipocomprobanteLogicAuxiliar.setDatosCliente(tipocomprobanteLogic.getDatosCliente());				
					tipocomprobanteLogicAuxiliar.setTipoComprobantes(tipocomprobantesParaReportes);
					
					tipocomprobanteLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoComprobanteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocomprobantesParaReportes=tipocomprobanteLogicAuxiliar.getTipoComprobantes();
					
					//tipocomprobanteLogic.getNewConnexionToDeep();
					
					//for (TipoComprobante tipocomprobante:tipocomprobantesParaReportes) {
					//	tipocomprobanteLogic.deepLoad(tipocomprobante, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocomprobanteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocomprobanteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);

			InputStream reportFileTransaccion = AuxiliarReportes.class.getResourceAsStream("TransaccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccion", reportFileTransaccion);

			InputStream reportFileDocumentoAnulado = AuxiliarReportes.class.getResourceAsStream("DocumentoAnuladoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_documentoanulado", reportFileDocumentoAnulado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoComprobante=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoComprobanteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoComprobanteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoComprobante=new JRBeanArrayDataSource(TipoComprobanteJInternalFrame.TraerTipoComprobanteBeans(tipocomprobantesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoComprobante);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoComprobanteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoComprobanteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoComprobanteBean.TraerTipoComprobanteBeans(tipocomprobantesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoComprobanteActionPerformed(null);
					//this.generarExcelReporteTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoComprobantes(sAccionBusqueda,sTipoArchivoReporte,tipocomprobantesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoComprobantes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComprobante> tipocomprobantesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComprobantes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoComprobante("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoComprobante tipocomprobante : tipocomprobantesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoComprobanteConstantesFunciones.generarExcelReporteDataTipoComprobante("NORMAL",row,workbook,tipocomprobante,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoComprobante(String sTipo,Row row,Workbook workbook) {
		
		TipoComprobanteConstantesFunciones.generarExcelReporteHeaderTipoComprobante(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoComprobantes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComprobante> tipocomprobantesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComprobantes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoComprobante tipocomprobante : tipocomprobantesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobante));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocomprobante.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComprobanteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocomprobante.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoComprobantes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComprobante> tipocomprobantesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoComprobante> tipocomprobantesRespaldo=null;
		
		classes=TipoComprobanteConstantesFunciones.getClassesRelationshipsOfTipoComprobante(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocomprobanteLogic.setDatosCliente(this.datosCliente);
		this.tipocomprobanteLogic.setDatosDeep(this.datosDeep);
		this.tipocomprobanteLogic.setIsConDeep(true);
		
		tipocomprobantesRespaldo=this.tipocomprobanteLogic.getTipoComprobantes();
		
		this.tipocomprobanteLogic.setTipoComprobantes(tipocomprobantesParaReportes);	
		this.tipocomprobanteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocomprobantesParaReportes=this.tipocomprobanteLogic.getTipoComprobantes();
		this.tipocomprobanteLogic.setTipoComprobantes(tipocomprobantesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComprobantes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoComprobante("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoComprobante tipocomprobante : tipocomprobantesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoComprobante("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoComprobanteConstantesFunciones.generarExcelReporteDataTipoComprobante("NORMAL",row,workbook,tipocomprobante,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocomprobante.getTransaccionLocals()!=null && tipocomprobante.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(tipocomprobante.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : tipocomprobante.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Transaccion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocomprobante.getTransaccions()!=null && tipocomprobante.getTransaccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionConstantesFunciones.generarExcelReporteHeaderTransaccion("RELACIONADO",row,workbook);
				}

				if(tipocomprobante.getTransaccions()!=null) {
					i2=0;
					for(Transaccion transaccion : tipocomprobante.getTransaccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionConstantesFunciones.generarExcelReporteDataTransaccion("RELACIONADO",row,workbook,transaccion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DocumentoAnulado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocomprobante.getDocumentoAnulados()!=null && tipocomprobante.getDocumentoAnulados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DocumentoAnuladoConstantesFunciones.generarExcelReporteHeaderDocumentoAnulado("RELACIONADO",row,workbook);
				}

				if(tipocomprobante.getDocumentoAnulados()!=null) {
					i2=0;
					for(DocumentoAnulado documentoanulado : tipocomprobante.getDocumentoAnulados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DocumentoAnuladoConstantesFunciones.generarExcelReporteDataDocumentoAnulado("RELACIONADO",row,workbook,documentoanulado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobante));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComprobante.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoComprobante() throws Exception {		
		this.startProcessTipoComprobante(true);
	}
	
	public void startProcessTipoComprobante(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoComprobante ,this.jPanelParametrosReportesTipoComprobante, this.jScrollPanelDatosTipoComprobante,this.jPanelPaginacionTipoComprobante, this.jScrollPanelDatosEdicionTipoComprobante, this.jPanelAccionesTipoComprobante,this.jPanelAccionesFormularioTipoComprobante,this.jmenuBarTipoComprobante,this.jmenuBarDetalleTipoComprobante,this.jTtoolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoComprobante=this.jTabbedPaneBusquedasTipoComprobante; 
		
		final JPanel jPanelParametrosReportesTipoComprobante=this.jPanelParametrosReportesTipoComprobante;
		//final JScrollPane jScrollPanelDatosTipoComprobante=this.jScrollPanelDatosTipoComprobante;
		final JTable jTableDatosTipoComprobante=this.jTableDatosTipoComprobante;		
		final JPanel jPanelPaginacionTipoComprobante=this.jPanelPaginacionTipoComprobante;
		//final JScrollPane jScrollPanelDatosEdicionTipoComprobante=this.jScrollPanelDatosEdicionTipoComprobante;
		final JPanel jPanelAccionesTipoComprobante=this.jPanelAccionesTipoComprobante;
		
		JPanel jPanelCamposAuxiliarTipoComprobante=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoComprobante=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			jPanelCamposAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jPanelCamposTipoComprobante;
			jPanelAccionesFormularioAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jPanelAccionesFormularioTipoComprobante;
		}
		
		final JPanel jPanelCamposTipoComprobante=jPanelCamposAuxiliarTipoComprobante;
		final JPanel jPanelAccionesFormularioTipoComprobante=jPanelAccionesFormularioAuxiliarTipoComprobante;
		
		
		final JMenuBar jmenuBarTipoComprobante=this.jmenuBarTipoComprobante;
		final JToolBar jTtoolBarTipoComprobante=this.jTtoolBarTipoComprobante;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoComprobante=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoComprobante=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			jmenuBarDetalleAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jmenuBarDetalleTipoComprobante;
			jTtoolBarDetalleAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jTtoolBarDetalleTipoComprobante;
		}
		
		final JMenuBar jmenuBarDetalleTipoComprobante=jmenuBarDetalleAuxiliarTipoComprobante;
		final JToolBar jTtoolBarDetalleTipoComprobante=jTtoolBarDetalleAuxiliarTipoComprobante;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoComprobante;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoComprobante;
			processRunnable.jTableDatos=jTableDatosTipoComprobante;
			processRunnable.jPanelCampos=jPanelCamposTipoComprobante;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoComprobante;
			processRunnable.jPanelAcciones=jPanelAccionesTipoComprobante;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoComprobante;
			
			
			processRunnable.jmenuBar=jmenuBarTipoComprobante;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoComprobante;
			processRunnable.jTtoolBar=jTtoolBarTipoComprobante;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoComprobante;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoComprobante ,jPanelParametrosReportesTipoComprobante,jTableDatosTipoComprobante, /*jScrollPanelDatosTipoComprobante,*/jPanelCamposTipoComprobante,jPanelPaginacionTipoComprobante, /*jScrollPanelDatosEdicionTipoComprobante,*/ jPanelAccionesTipoComprobante,jPanelAccionesFormularioTipoComprobante,jmenuBarTipoComprobante,jmenuBarDetalleTipoComprobante,jTtoolBarTipoComprobante,jTtoolBarDetalleTipoComprobante);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoComprobante ,jPanelParametrosReportesTipoComprobante, jScrollPanelDatosTipoComprobante,jPanelPaginacionTipoComprobante, jScrollPanelDatosEdicionTipoComprobante, jPanelAccionesTipoComprobante,jPanelAccionesFormularioTipoComprobante,jmenuBarTipoComprobante,jmenuBarDetalleTipoComprobante,jTtoolBarTipoComprobante,jTtoolBarDetalleTipoComprobante);
						
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
	
	public void finishProcessTipoComprobante() {// throws Exception 
		this.finishProcessTipoComprobante(true);
	}
	
	public void finishProcessTipoComprobante(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoComprobante ,this.jPanelParametrosReportesTipoComprobante, this.jScrollPanelDatosTipoComprobante,this.jPanelPaginacionTipoComprobante, this.jScrollPanelDatosEdicionTipoComprobante, this.jPanelAccionesTipoComprobante,this.jPanelAccionesFormularioTipoComprobante,this.jmenuBarTipoComprobante,this.jmenuBarDetalleTipoComprobante,this.jTtoolBarTipoComprobante,this.jTtoolBarDetalleTipoComprobante);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoComprobante=this.jTabbedPaneBusquedasTipoComprobante; 
		
		final JPanel jPanelParametrosReportesTipoComprobante=this.jPanelParametrosReportesTipoComprobante;
		//final JScrollPane jScrollPanelDatosTipoComprobante=this.jScrollPanelDatosTipoComprobante;
		final JTable jTableDatosTipoComprobante=this.jTableDatosTipoComprobante;		
		final JPanel jPanelPaginacionTipoComprobante=this.jPanelPaginacionTipoComprobante;
		//final JScrollPane jScrollPanelDatosEdicionTipoComprobante=this.jScrollPanelDatosEdicionTipoComprobante;
		final JPanel jPanelAccionesTipoComprobante=this.jPanelAccionesTipoComprobante;
		
		JPanel jPanelCamposAuxiliarTipoComprobante=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoComprobante=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			jPanelCamposAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jPanelCamposTipoComprobante;
			jPanelAccionesFormularioAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jPanelAccionesFormularioTipoComprobante;
		}
		
		final JPanel jPanelCamposTipoComprobante=jPanelCamposAuxiliarTipoComprobante;
		final JPanel jPanelAccionesFormularioTipoComprobante=jPanelAccionesFormularioAuxiliarTipoComprobante;
		
		
		final JMenuBar jmenuBarTipoComprobante=this.jmenuBarTipoComprobante;		
		final JToolBar jTtoolBarTipoComprobante=this.jTtoolBarTipoComprobante;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoComprobante=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoComprobante=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			jmenuBarDetalleAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jmenuBarDetalleTipoComprobante;
			jTtoolBarDetalleAuxiliarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jTtoolBarDetalleTipoComprobante;		
		}
		
		final JMenuBar jmenuBarDetalleTipoComprobante=jmenuBarDetalleAuxiliarTipoComprobante;
		final JToolBar jTtoolBarDetalleTipoComprobante=jTtoolBarDetalleAuxiliarTipoComprobante;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoComprobante;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoComprobante;
			processRunnable.jTableDatos=jTableDatosTipoComprobante;
			processRunnable.jPanelCampos=jPanelCamposTipoComprobante;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoComprobante;
			processRunnable.jPanelAcciones=jPanelAccionesTipoComprobante;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoComprobante;
			
			
			processRunnable.jmenuBar=jmenuBarTipoComprobante;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoComprobante;
			processRunnable.jTtoolBar=jTtoolBarTipoComprobante;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoComprobante;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoComprobante ,jPanelParametrosReportesTipoComprobante, jTableDatosTipoComprobante,/*jScrollPanelDatosTipoComprobante,*/jPanelCamposTipoComprobante,jPanelPaginacionTipoComprobante, /*jScrollPanelDatosEdicionTipoComprobante,*/ jPanelAccionesTipoComprobante,jPanelAccionesFormularioTipoComprobante,jmenuBarTipoComprobante,jmenuBarDetalleTipoComprobante,jTtoolBarTipoComprobante,jTtoolBarDetalleTipoComprobante));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoComprobante(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoComprobante(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoComprobante(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoComprobante(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoComprobante,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoComprobante,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoComprobante(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoComprobante,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoComprobante,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocomprobanteConstantesFunciones.getsFinalQueryTipoComprobante();
		String  finalQueryPaginacionTodos=this.tipocomprobanteConstantesFunciones.getsFinalQueryTipoComprobante();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesNoTipoComprobante(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocomprobantesEliminados= new ArrayList<TipoComprobante>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoComprobante();
		
				///*TipoComprobanteSessionBean*/this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			
			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
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
					this.iNumeroPaginacion=TipoComprobanteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoComprobanteConstantesFunciones.getClassesForeignKeysOfTipoComprobante(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocomprobante."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocomprobantesAux= new ArrayList<TipoComprobante>();
			
				
			tipocomprobanteLogic.setDatosCliente(this.datosCliente);
			tipocomprobanteLogic.setDatosDeep(this.datosDeep);
			tipocomprobanteLogic.setIsConDeep(true);
			
			
			tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocomprobanteLogic.getTodosTipoComprobantes(finalQueryGlobal,pagination);
					
					//tipocomprobanteLogic.getTodosTipoComprobantesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocomprobanteLogic.getTipoComprobantes()==null|| tipocomprobanteLogic.getTipoComprobantes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomprobantesAux= new ArrayList<TipoComprobante>();
							tipocomprobantesAux.addAll(tipocomprobanteLogic.getTipoComprobantes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantesAux= new ArrayList<TipoComprobante>();
							tipocomprobantesAux.addAll(tipocomprobantes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomprobanteLogic.getTodosTipoComprobantes(finalQueryGlobal+"",this.pagination);												
							
							//tipocomprobanteLogic.getTodosTipoComprobantesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoComprobantes("Todos",tipocomprobanteLogic.getTipoComprobantes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomprobanteLogic.setTipoComprobantes(new ArrayList<TipoComprobante>());					
							tipocomprobanteLogic.getTipoComprobantes().addAll(tipocomprobantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantes=new ArrayList<TipoComprobante>();
							tipocomprobantes.addAll(tipocomprobantesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoComprobante=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoComprobante=this.idActual;
				
				} else if(this.idTipoComprobanteActual!=null && this.idTipoComprobanteActual!=0L) {
					idTipoComprobante=idTipoComprobanteActual;
				}
				
					
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndicePorId(idTipoComprobante);
				
				this.tipocomprobantes=new ArrayList<TipoComprobante>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocomprobanteLogic.getEntity(idTipoComprobante);
					
					//tipocomprobanteLogic.getEntityWithConnection(idTipoComprobante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.setTipoComprobantes(new ArrayList<TipoComprobante>());
					tipocomprobanteLogic.getTipoComprobantes().add(tipocomprobanteLogic.getTipoComprobante());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomprobantes=new ArrayList<TipoComprobante>();
					this.tipocomprobantes.add(tipocomprobante);
				}
				
				if(tipocomprobanteLogic.getTipoComprobante()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomprobanteLogic.getTipoComprobantesBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomprobanteLogic.getTipoComprobantes()==null||tipocomprobanteLogic.getTipoComprobantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocomprobantes==null|| tipocomprobantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobantesAux=new ArrayList<TipoComprobante>();
						tipocomprobantesAux.addAll(tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantesAux=new ArrayList<TipoComprobante>();
							tipocomprobantesAux.addAll(tipocomprobantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomprobanteLogic.getTipoComprobantesBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoComprobantes("BusquedaPorId",tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoComprobantes("BusquedaPorId",tipocomprobantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.setTipoComprobantes(new ArrayList<TipoComprobante>());
						tipocomprobanteLogic.getTipoComprobantes().addAll(tipocomprobantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantes=new ArrayList<TipoComprobante>();
							tipocomprobantes.addAll(tipocomprobantesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomprobanteLogic.getTipoComprobantesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomprobanteLogic.getTipoComprobantes()==null||tipocomprobanteLogic.getTipoComprobantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocomprobantes==null|| tipocomprobantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobantesAux=new ArrayList<TipoComprobante>();
						tipocomprobantesAux.addAll(tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantesAux=new ArrayList<TipoComprobante>();
							tipocomprobantesAux.addAll(tipocomprobantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomprobanteLogic.getTipoComprobantesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoComprobantes("BusquedaPorNombre",tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoComprobantes("BusquedaPorNombre",tipocomprobantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.setTipoComprobantes(new ArrayList<TipoComprobante>());
						tipocomprobanteLogic.getTipoComprobantes().addAll(tipocomprobantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantes=new ArrayList<TipoComprobante>();
							tipocomprobantes.addAll(tipocomprobantesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomprobanteLogic.getTipoComprobantesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomprobanteLogic.getTipoComprobantes()==null||tipocomprobanteLogic.getTipoComprobantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocomprobantes==null|| tipocomprobantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobantesAux=new ArrayList<TipoComprobante>();
						tipocomprobantesAux.addAll(tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantesAux=new ArrayList<TipoComprobante>();
							tipocomprobantesAux.addAll(tipocomprobantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomprobanteLogic.getTipoComprobantesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComprobanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoComprobantes("FK_IdEmpresa",tipocomprobanteLogic.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoComprobantes("FK_IdEmpresa",tipocomprobantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteLogic.setTipoComprobantes(new ArrayList<TipoComprobante>());
						tipocomprobanteLogic.getTipoComprobantes().addAll(tipocomprobantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobantes=new ArrayList<TipoComprobante>();
							tipocomprobantes.addAll(tipocomprobantesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoComprobante();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoComprobante();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomprobanteLogic.getTipoComprobantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomprobantes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomprobanteLogic.getTipoComprobantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomprobantes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoComprobante tipocomprobante) {
		Boolean permite=true;
		
		if(this.tipocomprobante.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoComprobanteConstantesFunciones.getOrderByListaTipoComprobante();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoComprobanteConstantesFunciones.getOrderByListaTipoComprobante();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComprobante tipocomprobante:tipocomprobanteLogic.getTipoComprobantes()) {
				if(tipocomprobante.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomprobanteTotales=tipocomprobante;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComprobante tipocomprobante:this.tipocomprobantes) {
				if(tipocomprobante.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomprobanteTotales=tipocomprobante;
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
			this.tipocomprobanteAux=new TipoComprobante();
			this.tipocomprobanteAux.setsType(Constantes2.S_TOTALES);
			this.tipocomprobanteAux.setIsNew(false);
			this.tipocomprobanteAux.setIsChanged(false);
			this.tipocomprobanteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoComprobanteConstantesFunciones.TotalizarValoresFilaTipoComprobante(this.tipocomprobanteLogic.getTipoComprobantes(),this.tipocomprobanteAux);
				
				this.tipocomprobanteLogic.getTipoComprobantes().add(this.tipocomprobanteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoComprobanteConstantesFunciones.TotalizarValoresFilaTipoComprobante(this.tipocomprobantes,this.tipocomprobanteAux);
				
				this.tipocomprobantes.add(this.tipocomprobanteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocomprobanteTotales=new TipoComprobante();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocomprobanteLogic.getTipoComprobantes().remove(tipocomprobanteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocomprobantes.remove(tipocomprobanteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocomprobanteTotales=new TipoComprobante();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComprobante tipocomprobante:tipocomprobanteLogic.getTipoComprobantes()) {
				if(tipocomprobante.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomprobanteTotales=tipocomprobante;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComprobanteConstantesFunciones.TotalizarValoresFilaTipoComprobante(this.tipocomprobanteLogic.getTipoComprobantes(),tipocomprobanteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComprobante tipocomprobante:this.tipocomprobantes) {
				if(tipocomprobante.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomprobanteTotales=tipocomprobante;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComprobanteConstantesFunciones.TotalizarValoresFilaTipoComprobante(this.tipocomprobantes,tipocomprobanteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoComprobantesBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoComprobantesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoComprobantesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoComprobantesBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getTipoComprobantesBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoComprobantesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getTipoComprobantesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoComprobantesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getTipoComprobantesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoComprobante() {
		this.isPermisoTodoTipoComprobante=false;
		this.isPermisoNuevoTipoComprobante=false;
		this.isPermisoActualizarTipoComprobante=false;
		this.isPermisoActualizarOriginalTipoComprobante=false;
		this.isPermisoEliminarTipoComprobante=false;
		this.isPermisoGuardarCambiosTipoComprobante=false;
		this.isPermisoConsultaTipoComprobante=false;
		this.isPermisoBusquedaTipoComprobante=false;
		this.isPermisoReporteTipoComprobante=false;		
		this.isPermisoOrdenTipoComprobante=false;		
		this.isPermisoPaginacionMedioTipoComprobante=false;		
		this.isPermisoPaginacionAltoTipoComprobante=false;
		this.isPermisoPaginacionTodoTipoComprobante=false;
		this.isPermisoCopiarTipoComprobante=false;		
		this.isPermisoVerFormTipoComprobante=false;		
		this.isPermisoDuplicarTipoComprobante=false;		
		this.isPermisoOrdenTipoComprobante=false;		
	}
	
	public void setPermisosUsuarioTipoComprobante(Boolean isPermiso) {
		this.isPermisoTodoTipoComprobante=isPermiso;
		this.isPermisoNuevoTipoComprobante=isPermiso;
		this.isPermisoActualizarTipoComprobante=isPermiso;
		this.isPermisoActualizarOriginalTipoComprobante=isPermiso;
		this.isPermisoEliminarTipoComprobante=isPermiso;
		this.isPermisoGuardarCambiosTipoComprobante=isPermiso;
		this.isPermisoConsultaTipoComprobante=isPermiso;
		this.isPermisoBusquedaTipoComprobante=isPermiso;
		this.isPermisoReporteTipoComprobante=isPermiso;
		this.isPermisoOrdenTipoComprobante=isPermiso;		
		this.isPermisoPaginacionMedioTipoComprobante=isPermiso;		
		this.isPermisoPaginacionAltoTipoComprobante=isPermiso;		
		this.isPermisoPaginacionTodoTipoComprobante=isPermiso;		
		this.isPermisoCopiarTipoComprobante=isPermiso;		
		this.isPermisoVerFormTipoComprobante=isPermiso;		
		this.isPermisoDuplicarTipoComprobante=isPermiso;
		this.isPermisoOrdenTipoComprobante=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoComprobante(Boolean isPermiso) {
		//this.isPermisoTodoTipoComprobante=isPermiso;
		this.isPermisoNuevoTipoComprobante=isPermiso;
		this.isPermisoActualizarTipoComprobante=isPermiso;
		this.isPermisoActualizarOriginalTipoComprobante=isPermiso;
		this.isPermisoEliminarTipoComprobante=isPermiso;
		this.isPermisoGuardarCambiosTipoComprobante=isPermiso;
		//this.isPermisoConsultaTipoComprobante=isPermiso;
		//this.isPermisoBusquedaTipoComprobante=isPermiso;
		//this.isPermisoReporteTipoComprobante=isPermiso;
		//this.isPermisoOrdenTipoComprobante=isPermiso;		
		//this.isPermisoPaginacionMedioTipoComprobante=isPermiso;		
		//this.isPermisoPaginacionAltoTipoComprobante=isPermiso;		
		//this.isPermisoPaginacionTodoTipoComprobante=isPermiso;		
		//this.isPermisoCopiarTipoComprobante=isPermiso;		
		//this.isPermisoDuplicarTipoComprobante=isPermiso;
		//this.isPermisoOrdenTipoComprobante=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoComprobanteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TransaccionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoComprobanteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionTipoComprobanteClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTransaccion=false;
		this.isTienePermisosTransaccion=this.verificarGetPermisosUsuarioOpcionTipoComprobanteClaseRelacionada(this.opcionsRelacionadas,TransaccionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDocumentoAnulado=false;
		this.isTienePermisosDocumentoAnulado=this.verificarGetPermisosUsuarioOpcionTipoComprobanteClaseRelacionada(this.opcionsRelacionadas,DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoComprobante(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoComprobanteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
		this.isTienePermisosTransaccion=conPermiso;
		this.isTienePermisosDocumentoAnulado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoComprobanteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoComprobanteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoComprobanteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.remove(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTransaccion && this.jInternalFrameDetalleFormTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.remove(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDocumentoAnulado && this.jInternalFrameDetalleFormTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.remove(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoComprobante() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoComprobanteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoComprobanteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoComprobante=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoComprobante=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoComprobante=this.isPermisoActualizarTipoComprobante;
			this.isPermisoEliminarTipoComprobante=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoComprobante=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoComprobante=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoComprobante=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoComprobante=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoComprobante=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoComprobante=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoComprobante=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoComprobante=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoComprobante=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoComprobante=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoComprobante=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoComprobante=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoComprobante=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoComprobante.setToolTipText(this.jTableDatosTipoComprobante.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoComprobante(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoComprobante(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoComprobanteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoComprobanteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoComprobante() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.tipocomprobanteConstantesFunciones.mostrarTransaccionLocalTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTransaccion && this.tipocomprobanteConstantesFunciones.mostrarTransaccionTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion");
			reporte.setsDescripcion("Transaccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDocumentoAnulado && this.tipocomprobanteConstantesFunciones.mostrarDocumentoAnuladoTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Documento Anulado");
			reporte.setsDescripcion("Documento Anulado");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoComprobanteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoComprobanteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoComprobanteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoComprobanteListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoComprobanteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoComprobanteParameterReturnGeneral tipocomprobanteReturnGeneral=new TipoComprobanteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocomprobanteConstantesFunciones.cargarid_empresaTipoComprobante)
					 || (this.esRecargarFks && this.tipocomprobanteConstantesFunciones.cargarid_empresaTipoComprobante)) {

					if(!this.tipocomprobanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocomprobanteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocomprobanteReturnGeneral=tipocomprobanteLogic.cargarCombosLoteForeignKeyTipoComprobante(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocomprobanteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoComprobante()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			}

			if(!this.tipocomprobanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoComprobante()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoComprobante(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoComprobante()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComprobante();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoComprobante(TipoComprobante tipocomprobante)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoComprobante(TipoComprobante tipocomprobante,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoComprobante()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComprobante()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoComprobante()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoComprobante()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoComprobante()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoComprobante()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoComprobante(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoComprobante()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoComprobanteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoComprobanteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoComprobanteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean(); 
		this.tipocomprobanteConstantesFunciones=new TipoComprobanteConstantesFunciones(); 
		this.tipocomprobanteBean=new TipoComprobante();//(this.tipocomprobanteConstantesFunciones); 		
		this.tipocomprobanteReturnGeneral=new TipoComprobanteParameterReturnGeneral(); 
		
		this.tipocomprobanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomprobanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoComprobanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoComprobanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoComprobanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoComprobante(true);
			
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
			
			this.tipocomprobanteConstantesFunciones=new TipoComprobanteConstantesFunciones(); 
			this.tipocomprobanteBean=new TipoComprobante();//this.tipocomprobanteConstantesFunciones); 			
			this.tipocomprobanteReturnGeneral=new TipoComprobanteParameterReturnGeneral(); 
		
			TipoComprobanteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comprobante Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocomprobante=new TipoComprobante();
			this.tipocomprobantes = new ArrayList<TipoComprobante>();
			this.tipocomprobantesAux = new ArrayList<TipoComprobante>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic=new TipoComprobanteLogic();
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocomprobanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocomprobanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoComprobante);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoComprobante);	
					}
					
					if(this.jInternalFrameImportacionTipoComprobante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoComprobante);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoComprobante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoComprobante);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoComprobante);
				this.jInternalFrameDetalleFormTipoComprobante.setVisible(false);
				this.jInternalFrameDetalleFormTipoComprobante.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoComprobante);
					this.jInternalFrameReporteDinamicoTipoComprobante.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoComprobante.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoComprobante!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoComprobante);
					this.jInternalFrameImportacionTipoComprobante.setVisible(false);
					this.jInternalFrameImportacionTipoComprobante.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoComprobante!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoComprobante);
					this.jInternalFrameOrderByTipoComprobante.setVisible(false);
					this.jInternalFrameOrderByTipoComprobante.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoComprobanteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoComprobanteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocomprobanteReturnGeneral=new TipoComprobanteParameterReturnGeneral();
			
			this.tipocomprobanteParameterGeneral=new TipoComprobanteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocomprobanteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoComprobanteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TransaccionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComprobanteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomprobanteSessionBean.getEsGuardarRelacionado(),this.tipocomprobanteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComprobanteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomprobanteSessionBean.getEsGuardarRelacionado(),this.tipocomprobanteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaDuplicarTipoComprobante=true;
			this.isVisibilidadCeldaCopiarTipoComprobante=true;
			this.isVisibilidadCeldaVerFormTipoComprobante=true;
			this.isVisibilidadCeldaOrdenTipoComprobante=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=false;
			this.isVisibilidadCeldaGuardarTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoComprobante();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoComprobante(false);
			
			this.setPermisosUsuarioTipoComprobante();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocomprobanteSessionBean.getEsGuardarRelacionado() && this.tipocomprobanteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoComprobanteClasesRelacionadas();
			}
			
			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoComprobanteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoComprobante();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoComprobante();
			}
			
			if(!this.isPermisoBusquedaTipoComprobante) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoComprobante,this.isPermisoPaginacionMedioTipoComprobante,this.isPermisoPaginacionTodoTipoComprobante);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoComprobanteConstantesFunciones.getTiposSeleccionarTipoComprobante());
				
				this.tiposColumnasSelect=TipoComprobanteConstantesFunciones.getTiposSeleccionarTipoComprobante(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoComprobante();				
				//this.tiposRelacionesSelect=TipoComprobanteConstantesFunciones.getTiposRelacionesTipoComprobante(true);
				
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
			//if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoComprobante();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoComprobante(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoComprobante(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComprobante() ;
			
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
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.documentoanuladoLogic=new DocumentoAnuladoLogic(); 
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
				tipocomprobanteImplementable= (TipoComprobanteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComprobanteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocomprobanteImplementableHome= (TipoComprobanteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComprobanteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocomprobantes= new ArrayList<TipoComprobante>();
			this.tipocomprobantesEliminados= new ArrayList<TipoComprobante>();
						
			this.isEsNuevoTipoComprobante=false;
			this.esParaAccionDesdeFormularioTipoComprobante=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoComprobante(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoComprobante();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoComprobanteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoComprobante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoComprobante(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoComprobante();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoComprobante();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoComprobante.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoComprobante.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoComprobante.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoComprobante(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoComprobante: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoComprobante() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoComprobante")) {
				iIndex=this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();	
				
				

				if(sTitle.equals("Documento Anulados")) {
					if(!DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoComprobante();

						this.cargarParteTabPanelRelacionadaDocumentoAnulado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transacciones")) {
					if(!TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoComprobante();

						this.cargarParteTabPanelRelacionadaTransaccion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoComprobante();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoComprobante();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDocumentoAnulado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoComprobante.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(false,true,iIndex);
		this.jButtonDocumentoAnuladoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDocumentoAnulado();

		//this.jTabbedPaneRelacionesTipoComprobante.updateUI();
		//this.jTabbedPaneRelacionesTipoComprobante.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoComprobante.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoComprobante.cargarSessionConBeanSwingJInternalFrameTransaccion(false,true,iIndex);
		this.jButtonTransaccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccion();

		//this.jTabbedPaneRelacionesTipoComprobante.updateUI();
		//this.jTabbedPaneRelacionesTipoComprobante.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoComprobante.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoComprobante.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesTipoComprobante.updateUI();
		//this.jTabbedPaneRelacionesTipoComprobante.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoComprobante.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosTipoComprobante.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Transaccion")) {
				int row=this.jTableDatosTipoComprobante.getSelectedRow();
				jButtonTransaccionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DocumentoAnulado")) {
				int row=this.jTableDatosTipoComprobante.getSelectedRow();
				jButtonDocumentoAnuladoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.tipocomprobanteConstantesFunciones.mostrarTransaccionLocalTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(tipocomprobanteConstantesFunciones.resaltarTransaccionLocalTipoComprobante!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocomprobanteConstantesFunciones.resaltarTransaccionLocalTipoComprobante);
						}

						jmenuItem.setEnabled(this.tipocomprobanteConstantesFunciones.activarTransaccionLocalTipoComprobante);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormTipoComprobante.jmenuDetalleTipoComprobante.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Transaccion")) {

					if(this.isTienePermisosTransaccion && this.tipocomprobanteConstantesFunciones.mostrarTransaccionTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transacciones"+"("+TransaccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transacciones");

						if(tipocomprobanteConstantesFunciones.resaltarTransaccionTipoComprobante!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocomprobanteConstantesFunciones.resaltarTransaccionTipoComprobante);
						}

						jmenuItem.setEnabled(this.tipocomprobanteConstantesFunciones.activarTransaccionTipoComprobante);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Transaccion"));

						

						this.jInternalFrameDetalleFormTipoComprobante.jmenuDetalleTipoComprobante.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Documento Anulado")) {

					if(this.isTienePermisosDocumentoAnulado && this.tipocomprobanteConstantesFunciones.mostrarDocumentoAnuladoTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Documento Anulados"+"("+DocumentoAnuladoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Documento Anulados");

						if(tipocomprobanteConstantesFunciones.resaltarDocumentoAnuladoTipoComprobante!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocomprobanteConstantesFunciones.resaltarDocumentoAnuladoTipoComprobante);
						}

						jmenuItem.setEnabled(this.tipocomprobanteConstantesFunciones.activarDocumentoAnuladoTipoComprobante);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DocumentoAnulado"));

						

						this.jInternalFrameDetalleFormTipoComprobante.jmenuDetalleTipoComprobante.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoComprobante(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoComprobante(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoComprobante(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoComprobanteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoComprobante();
		
		this.cargarCombosFrameForeignKeyTipoComprobante();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoComprobante();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoComprobante();
		}
	}
	
	
	
	public void jButtonNuevoTipoComprobanteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			
			if(jTableDatosTipoComprobante.getRowCount()>=1) {
				jTableDatosTipoComprobante.removeRowSelectionInterval(0, jTableDatosTipoComprobante.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoComprobante=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoComprobante(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoComprobante(true);			
			//this.tipocomprobante=new TipoComprobante();
			//this.tipocomprobante.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComprobante(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComprobante() ;
			
			if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComprobante(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocomprobante);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);				
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoComprobante: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoComprobanteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoComprobante.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoComprobante.getSelectedRows().length;			
			}
			
			tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoComprobante--;			
				//TipoComprobante tipocomprobanteAux= new TipoComprobante();			
				//tipocomprobanteAux.setId(this.iIdNuevoTipoComprobante);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoComprobante tipocomprobanteOrigen=new TipoComprobante();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoComprobante tipocomprobanteOrigen : tipocomprobantesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocomprobanteOrigen =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprobanteOrigen =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoComprobante();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocomprobante.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoComprobante(tipocomprobanteOrigen,this.tipocomprobante,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomprobanteLogic.getTipoComprobantes().add(this.tipocomprobanteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocomprobantes.add(this.tipocomprobanteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoComprobante(false);
				
				this.jTableDatosTipoComprobante.setRowSelectionInterval(this.getIndiceNuevoTipoComprobante(), this.getIndiceNuevoTipoComprobante());
				
				int iLastRow =  this.jTableDatosTipoComprobante.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoComprobante.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoComprobante.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComprobante(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();									
		
			TipoComprobante tipocomprobanteOrigen=new TipoComprobante();
			TipoComprobante tipocomprobanteDestino=new TipoComprobante();
				
			tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoComprobante.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocomprobantesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoComprobante.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteOrigen =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomprobanteOrigen =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprobanteDestino =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomprobanteDestino =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocomprobanteOrigen =tipocomprobantesSeleccionados.get(0);
				tipocomprobanteDestino =tipocomprobantesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoComprobante(tipocomprobanteOrigen,tipocomprobanteDestino,true,false);
				
				tipocomprobanteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomprobanteDestino,tipocomprobanteLogic.getTipoComprobantes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomprobanteDestino,tipocomprobantes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoComprobante(false);
				
				//this.jTableDatosTipoComprobante.setRowSelectionInterval(this.getIndiceNuevoTipoComprobante(), this.getIndiceNuevoTipoComprobante());
				
				int iLastRow =  this.jTableDatosTipoComprobante.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoComprobante.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoComprobante.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComprobante(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoComprobante.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoComprobante.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoComprobante.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoComprobante.setVisible(!isVisible);
			this.jPanelPaginacionTipoComprobante.setVisible(!isVisible);
			this.jPanelAccionesTipoComprobante.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoComprobante();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoComprobante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoComprobante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoComprobante();
			
			this.abrirFrameOrderByTipoComprobante();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoComprobante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoComprobante(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoComprobante);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoComprobante.isMaximum()) {
					this.jInternalFrameDetalleFormTipoComprobante.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoComprobante.setSize(this.jInternalFrameDetalleFormTipoComprobante.iWidthFormulario,this.jInternalFrameDetalleFormTipoComprobante.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoComprobante.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoComprobante.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoComprobante.isMaximum()) {
						this.jInternalFrameDetalleFormTipoComprobante.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),TipoComprobanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),TipoComprobanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),TipoComprobanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDocumentoAnulado();
					}

					if(TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccion();
					}

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoComprobante.setVisible(true);
	        this.jInternalFrameDetalleFormTipoComprobante.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoComprobante() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoComprobante==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoComprobante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComprobante,false,this);
				} else {
					this.jInternalFrameOrderByTipoComprobante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComprobante,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoComprobante);
				this.jInternalFrameOrderByTipoComprobante.setVisible(false);
				this.jInternalFrameOrderByTipoComprobante.setSelected(false);
				
				this.jInternalFrameOrderByTipoComprobante.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoComprobante"));
				
				this.inicializarActualizarBindingTablaOrderByTipoComprobante();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoComprobante() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoComprobante==null) {
				
				this.jInternalFrameImportacionTipoComprobante=new ImportacionJInternalFrame(TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoComprobante);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoComprobante);
				this.jInternalFrameImportacionTipoComprobante.setVisible(false);
				this.jInternalFrameImportacionTipoComprobante.setSelected(false);


				this.jInternalFrameImportacionTipoComprobante.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoComprobante"));
				this.jInternalFrameImportacionTipoComprobante.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoComprobante"));
				this.jInternalFrameImportacionTipoComprobante.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoComprobante"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoComprobante() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoComprobante==null) {
				this.jInternalFrameReporteDinamicoTipoComprobante=new ReporteDinamicoJInternalFrame(TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoComprobante);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoComprobante);
				this.jInternalFrameReporteDinamicoTipoComprobante.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoComprobante.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComprobante"));
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComprobante"));
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComprobante"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComprobante();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDocumentoAnulado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoComprobante.jContentPaneDetalleTipoComprobante.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoComprobante() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoComprobante);
			
	       	this.jInternalFrameDetalleFormTipoComprobante.setVisible(false);
	        this.jInternalFrameDetalleFormTipoComprobante.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoComprobante.dispose();
			//this.jInternalFrameDetalleFormTipoComprobante=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoComprobante() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoComprobante.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoComprobante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoComprobante() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoComprobante.setVisible(true);
	        this.jInternalFrameImportacionTipoComprobante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoComprobante() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoComprobante.setVisible(true);
	        this.jInternalFrameOrderByTipoComprobante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoComprobante() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoComprobante.setVisible(false);
	        this.jInternalFrameOrderByTipoComprobante.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoComprobante() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoComprobante.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoComprobante.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoComprobante() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoComprobante.setVisible(false);
	        this.jInternalFrameImportacionTipoComprobante.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoComprobante(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoComprobante(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoComprobante(true);
			//this.isEsNuevoTipoComprobante=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoComprobante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComprobante(false) ;
			
			if(tipocomprobanteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado() && TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado() && DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDocumentoAnuladoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComprobante(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComprobante(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoComprobanteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoComprobante(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoComprobante(true);
			//this.isEsNuevoTipoComprobante=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocomprobante.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoComprobante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoComprobante(false) ;
			
			if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComprobante(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComprobante(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoComprobante(false);
			
			//if(!this.isEsNuevoTipoComprobante) {								
				int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
				
			}
			
			if(this.permiteMantenimiento(this.tipocomprobante)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoComprobante=true;
					this.inicializarActualizarBindingTablaTipoComprobante(false);
					this.isEsNuevoTipoComprobante=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoComprobante=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoComprobante=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoComprobante(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComprobante(false);
				
				this.habilitarDeshabilitarControlesTipoComprobante(false);
			
												
				
				if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoComprobante();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoComprobanteActionPerformed(evt,tipocomprobanteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoComprobante(this.tipocomprobante,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoComprobante.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocomprobanteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocomprobante.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				this.tipocomprobante.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				this.tipocomprobante.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocomprobante)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoComprobanteModel) this.jTableDatosTipoComprobante.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoComprobante=true;
				this.inicializarActualizarBindingTablaTipoComprobante(false);
				this.isEsNuevoTipoComprobante=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoComprobante(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComprobante(false);
				
				this.habilitarDeshabilitarControlesTipoComprobante(false);
				
				
				
				if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoComprobante();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoComprobante.getRowCount()>=1) {
				jTableDatosTipoComprobante.removeRowSelectionInterval(0, jTableDatosTipoComprobante.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoComprobante(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoComprobante(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComprobante(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComprobante(false) ;
			
			this.isEsNuevoTipoComprobante=false;
			
			if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoComprobante();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoComprobante(false);
				
				//SI ES MANUAL
				if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoComprobante();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoComprobante--;			
			//TipoComprobante tipocomprobanteAux= new TipoComprobante();			
			//tipocomprobanteAux.setId(this.iIdNuevoTipoComprobante);
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoComprobante();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
			
			this.tipocomprobante.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocomprobanteLogic.getTipoComprobantes().add(this.tipocomprobanteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocomprobantes.add(this.tipocomprobanteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoComprobante(false);
			
			this.jTableDatosTipoComprobante.setRowSelectionInterval(this.getIndiceNuevoTipoComprobante(), this.getIndiceNuevoTipoComprobante());
			
			int iLastRow =  this.jTableDatosTipoComprobante.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoComprobante.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoComprobante.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoComprobante(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComprobante(false);
			
			//SI ES MANUAL
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComprobante();
			}
			
			//this.abrirFrameTreeTipoComprobante();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ComprobanteS ?", "MANTENIMIENTO DE Tipo Comprobante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoComprobante.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoComprobante();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocomprobanteReturnGeneral=tipocomprobanteLogic.procesarImportacionTipoComprobantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocomprobanteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoComprobanteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoComprobante.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoComprobante.setFileImportacion(this.jInternalFrameImportacionTipoComprobante.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoComprobante.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoComprobante.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoComprobante.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoComprobante.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		

		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoComprobanteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoComprobanteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoComprobanteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoComprobante.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoComprobanteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoComprobanteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoComprobanteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoComprobantes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoComprobante tipocomprobante:tipocomprobantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocomprobante.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoComprobanteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoComprobante tipocomprobante:tipocomprobantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocomprobante.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoComprobante(row);				
			//	iRow++;
			//}				
			
			//for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoComprobante(tipocomprobanteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComprobante(false);
			
			//SI ES MANUAL
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComprobante();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComprobante(false);
			
			//SI ES MANUAL
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoComprobante();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComprobante(false);
			
			//SI ES MANUAL
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoComprobante();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoComprobante() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoComprobante.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoComprobante.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoComprobante.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoComprobante.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoComprobante.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoComprobante.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoComprobante.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoComprobante(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoComprobante(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoComprobante(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoComprobante(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoComprobante(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoComprobante(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComprobante(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoComprobante(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoComprobante() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoComprobante();
		
		this.inicializarActualizarBindingBotonesManualTipoComprobante(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoComprobante();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComprobante() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComprobante(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComprobante(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoComprobante.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoComprobante.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoComprobante.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionNuevoTipoComprobante.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionSinCerrarTipoComprobante.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionSinMensajeTipoComprobante.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoComprobante.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoComprobante.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoComprobante.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
				this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionNuevoTipoComprobante.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionSinCerrarTipoComprobante.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoComprobante.jCheckBoxPostAccionSinMensajeTipoComprobante.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoComprobante.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoComprobante.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoComprobante.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoComprobante.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoComprobante.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoComprobante.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoComprobante.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoComprobante.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoComprobante.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoComprobante(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComprobante(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoComprobante() throws Exception {
		try	{
			if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoComprobante();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoComprobante() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoComprobante() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoComprobante.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoComprobante.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoComprobante.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoComprobante.addItem(reporte);
			}
			
			
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoComprobante.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoComprobante.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoComprobante.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoComprobante.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoComprobante.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoComprobante.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoComprobante.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComprobante();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComprobante() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
				this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
				this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoComprobante.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoComprobante.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoComprobante.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoComprobante.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoComprobante.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoComprobante()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoComprobanteBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoComprobante.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoComprobante(Boolean esInicializar) throws Exception {				
		if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoComprobante();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoComprobante() throws Exception {
		this.inicializarActualizarBindingTablaTipoComprobante(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoComprobante() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoComprobanteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobanteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoComprobante(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocomprobanteLogic.getTipoComprobantes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocomprobantes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoComprobante.setModel(new TipoComprobanteModel(this.tipocomprobanteLogic.getTipoComprobantes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoComprobante.setModel(new TipoComprobanteModel(this.tipocomprobantes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoComprobante!=null && this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoComprobante();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoComprobante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,tipocomprobanteConstantesFunciones.resaltarSeleccionarTipoComprobante,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,tipocomprobanteConstantesFunciones.resaltarSeleccionarTipoComprobante,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoComprobante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,TipoComprobanteConstantesFunciones.LABEL_ID));

		if(this.tipocomprobanteConstantesFunciones.mostraridTipoComprobante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComprobanteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocomprobanteConstantesFunciones.resaltaridTipoComprobante,this.tipocomprobanteConstantesFunciones.activaridTipoComprobante,this,true,"idTipoComprobante","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomprobanteConstantesFunciones.resaltaridTipoComprobante,this.tipocomprobanteConstantesFunciones.activaridTipoComprobante,this,true,"idTipoComprobante","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoComprobante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocomprobanteConstantesFunciones.mostrarid_empresaTipoComprobante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocomprobanteConstantesFunciones.resaltarid_empresaTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarid_empresaTipoComprobante));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocomprobanteConstantesFunciones.resaltarid_empresaTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarid_empresaTipoComprobante,false,"id_empresaTipoComprobante","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoComprobante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,TipoComprobanteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocomprobanteConstantesFunciones.mostrarnombreTipoComprobante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComprobanteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocomprobanteConstantesFunciones.resaltarnombreTipoComprobante,this.tipocomprobanteConstantesFunciones.activarnombreTipoComprobante,this,true,"nombreTipoComprobante","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomprobanteConstantesFunciones.resaltarnombreTipoComprobante,this.tipocomprobanteConstantesFunciones.activarnombreTipoComprobante,this,true,"nombreTipoComprobante","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130);
			//tableColumn.addPropertyChangeListener(new TipoComprobantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.tipocomprobanteConstantesFunciones.mostrarTransaccionLocalTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(tipocomprobanteConstantesFunciones.resaltarTransaccionLocalTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarTransaccionLocalTipoComprobante));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(tipocomprobanteConstantesFunciones.resaltarTransaccionLocalTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarTransaccionLocalTipoComprobante));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoComprobante.addColumn(tableColumn);
			}

			if(this.isTienePermisosTransaccion && this.tipocomprobanteConstantesFunciones.mostrarTransaccionTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transacciones");
				tableColumn.setHeaderValue("Transacciones");
				tableColumn.setCellRenderer(new TransaccionTableCell(tipocomprobanteConstantesFunciones.resaltarTransaccionTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarTransaccionTipoComprobante));
				tableColumn.setCellEditor(new TransaccionTableCell(tipocomprobanteConstantesFunciones.resaltarTransaccionTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarTransaccionTipoComprobante));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoComprobante.addColumn(tableColumn);
			}

			if(this.isTienePermisosDocumentoAnulado && this.tipocomprobanteConstantesFunciones.mostrarDocumentoAnuladoTipoComprobante && !TipoComprobanteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Documento Anulados");
				tableColumn.setHeaderValue("Documento Anulados");
				tableColumn.setCellRenderer(new DocumentoAnuladoTableCell(tipocomprobanteConstantesFunciones.resaltarDocumentoAnuladoTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarDocumentoAnuladoTipoComprobante));
				tableColumn.setCellEditor(new DocumentoAnuladoTableCell(tipocomprobanteConstantesFunciones.resaltarDocumentoAnuladoTipoComprobante,this,this.tipocomprobanteConstantesFunciones.activarDocumentoAnuladoTipoComprobante));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoComprobante.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoComprobante.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoComprobante.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocomprobanteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoComprobante.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoComprobante.addColumn(tableColumn);
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
			
			this.jTableDatosTipoComprobante.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoComprobante.moveColumn(this.jTableDatosTipoComprobante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoComprobante.moveColumn(this.jTableDatosTipoComprobante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoComprobante.moveColumn(this.jTableDatosTipoComprobante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoComprobante.moveColumn(this.jTableDatosTipoComprobante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoComprobante.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoComprobante.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoComprobante,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoComprobante.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoComprobante.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoComprobante.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoComprobante.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoComprobante.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocomprobanteLogic.getTipoComprobantes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocomprobantes.size()-1;
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
		//this.jTableDatosTipoComprobante.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoComprobante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoComprobante();
			
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
				
				//this.isEsNuevoTipoComprobante=false;
					
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
				if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoComprobante==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoComprobante.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoComprobante.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocomprobante.getsType().equals("DUPLICADO")
				   || this.tipocomprobante.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoComprobante=true;
				
				} else {
					this.isEsNuevoTipoComprobante=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocomprobante.getId()>=0 && !this.tipocomprobante.getIsNew()) {						
						this.isEsNuevoTipoComprobante=false;
						
					} else {
						this.isEsNuevoTipoComprobante=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoComprobante(esRelaciones);						
				
				this.seleccionarTipoComprobante(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocomprobante.getId()<0) {
					this.isEsNuevoTipoComprobante=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoComprobante(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoComprobante(evt,rowIndex);
				}	
				
				if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoComprobante: " + this.dDif); 
					}
				}								
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoComprobante(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocomprobante)) {
					if(this.tipocomprobante.getId()>0) {
						this.tipocomprobante.setIsDeleted(true);
						
						this.tipocomprobantesEliminados.add(this.tipocomprobante);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomprobanteLogic.getTipoComprobantes().remove(this.tipocomprobante);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocomprobantes.remove(this.tipocomprobante);				
					}
					
					
					((TipoComprobanteModel) this.jTableDatosTipoComprobante.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComprobante(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoComprobante(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoComprobante) {
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoComprobante.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoComprobante.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoComprobante(this.tipocomprobante);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocomprobanteConstantesFunciones.cargarid_empresaTipoComprobante || this.tipocomprobanteConstantesFunciones.event_dependid_empresaTipoComprobante) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocomprobante.getid_empresa());
									//this.inicializarActualizarBindingTipoComprobante(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocomprobante.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocomprobante.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocomprobante.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoComprobante("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoComprobante(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComprobante() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoComprobante(TipoComprobante tipocomprobante) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoComprobante(tipocomprobante,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoComprobante(TipoComprobante tipocomprobante,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoComprobante(tipocomprobante);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoComprobante(tipocomprobante,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoComprobante(tipocomprobante);
	}
	
	public void setVariablesObjetoActualToFormularioTipoComprobante(TipoComprobante tipocomprobante) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setText(tipocomprobante.getId().toString());
			this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setText(tipocomprobante.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoComprobante tipocomprobanteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocomprobanteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoComprobante tipocomprobanteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocomprobanteLocal=this.tipocomprobante;
			} else {
				tipocomprobanteLocal=this.tipocomprobanteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocomprobanteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoComprobante(tipocomprobanteLocal,true);
					
					if(tipocomprobanteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocomprobanteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocomprobanteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoComprobante(TipoComprobante tipocomprobante,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoComprobante(tipocomprobante,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(tipocomprobante);
	}
	
	public void setVariablesFormularioToObjetoActualTipoComprobante(TipoComprobante tipocomprobante,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoComprobante(tipocomprobante,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoComprobante(TipoComprobante tipocomprobante,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.getText()==null || this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.getText()=="" || this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setText("0");
			}

			if(conColumnasBase) {tipocomprobante.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComprobanteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComprobante.jLabelIdTipoComprobante,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocomprobante.setnombre(this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComprobanteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComprobante.jLabelnombreTipoComprobante,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoComprobante(TipoComprobante tipocomprobanteBean,TipoComprobante tipocomprobante,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoComprobante(TipoComprobante tipocomprobanteOrigen,TipoComprobante tipocomprobante,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomprobanteOrigen.getId()!=null && !tipocomprobanteOrigen.getId().equals(0L))) {tipocomprobante.setId(tipocomprobanteOrigen.getId());}}
			if(conDefault || (!conDefault && tipocomprobanteOrigen.getnombre()!=null && !tipocomprobanteOrigen.getnombre().equals(""))) {tipocomprobante.setnombre(tipocomprobanteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoComprobante(TipoComprobante tipocomprobante) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setText(tipocomprobante.getId().toString());
			this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setText(tipocomprobante.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoComprobante(TipoComprobanteBean tipocomprobanteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setText(tipocomprobanteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setText(tipocomprobanteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoComprobante(TipoComprobanteParameterReturnGeneral tipocomprobanteReturnGeneral,TipoComprobanteBean tipocomprobanteBean,Boolean conDefault) throws Exception { 
		try {
			TipoComprobante tipocomprobanteLocal=new TipoComprobante();
			
			tipocomprobanteLocal=tipocomprobanteReturnGeneral.getTipoComprobante();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomprobanteLocal.getId()!=null && !tipocomprobanteLocal.getId().equals(0L))) {tipocomprobanteBean.setId(tipocomprobanteLocal.getId());}}
			if(conDefault || (!conDefault && tipocomprobanteLocal.getnombre()!=null && !tipocomprobanteLocal.getnombre().equals(""))) {tipocomprobanteBean.setnombre(tipocomprobanteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoComprobanteGenerico(Long idTipoComprobanteSeleccionado,JComboBox jComboBoxTipoComprobante,List<TipoComprobante> tipocomprobantesLocal)throws Exception {
		try {
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesLocal) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			jComboBoxTipoComprobante.setSelectedItem(tipocomprobanteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoComprobanteGenerico(JComboBox jComboBoxTipoComprobante,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoComprobante.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoComprobante.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoComprobante.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoComprobante.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoComprobante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoComprobante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Transaccion")) {
			jButtonTransaccionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DocumentoAnulado")) {
			jButtonDocumentoAnuladoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomprobante=(TipoComprobante) tipocomprobanteLogic.getTipoComprobantes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocomprobante =(TipoComprobante) tipocomprobantes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocomprobante.getIsNew() && !tipocomprobante.getIsChanged() && !tipocomprobante.getIsDeleted()) {
				sDescripcion=tipocomprobante.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocomprobante.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoComprobante tipocomprobanteRow=new TipoComprobante();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomprobanteRow=(TipoComprobante) tipocomprobanteLogic.getTipoComprobantes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocomprobanteRow=(TipoComprobante) tipocomprobantes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoComprobante tipocomprobante) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoComprobante==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocomprobante!=null) {
						this.tipocomprobante = tipocomprobante;
					} else {
						this.tipocomprobante = new TipoComprobante();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.tipocomprobante)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame;
					}

					List<TipoComprobante> tipocomprobantes=new ArrayList<TipoComprobante>();
					tipocomprobantes.add(this.tipocomprobante);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoComprobante.cargarTransaccionLocalBeanSwingJInternalFrame(tipocomprobantes,this.tipocomprobante,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoComprobante=(TitledBorder)this.jScrollPanelDatosTipoComprobante.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderTipoComprobante.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTransaccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoComprobante tipocomprobante) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoComprobante==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocomprobante!=null) {
						this.tipocomprobante = tipocomprobante;
					} else {
						this.tipocomprobante = new TipoComprobante();
					}
				}

				if(this.isTienePermisosTransaccion && this.permiteMantenimiento(this.tipocomprobante)) {
					TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup=new TransaccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup;
					} else {
						transaccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame;
					}

					List<TipoComprobante> tipocomprobantes=new ArrayList<TipoComprobante>();
					tipocomprobantes.add(this.tipocomprobante);
					if(!esRelacionado) {
						//transaccionBeanSwingJInternalFrame.transaccionSessionBean.setConGuardarRelaciones(false);
						//transaccionBeanSwingJInternalFrame.transaccionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoComprobante.cargarTransaccionBeanSwingJInternalFrame(tipocomprobantes,this.tipocomprobante,transaccionBeanSwingJInternalFrame,/*conInicializar,*/transaccionBeanSwingJInternalFrame.transaccionSessionBean.getConGuardarRelaciones(),transaccionBeanSwingJInternalFrame.transaccionSessionBean.getEsGuardarRelacionado());
					transaccionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("no_relacionado");

						transaccionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionConstantesFunciones.ITAMANIOFILATABLA + (TransaccionConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoComprobante=(TitledBorder)this.jScrollPanelDatosTipoComprobante.getBorder();
						TitledBorder titledBorderTransaccion=(TitledBorder)transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

						titledBorderTransaccion.setTitle(titledBorderTipoComprobante.getTitle() + " -> Transaccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionBeanSwingJInternalFrame);
						}

						transaccionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionBeanSwingJInternalFrame);

						transaccionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDocumentoAnuladoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoComprobante tipocomprobante) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoComprobante==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocomprobante = (TipoComprobante)this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocomprobante!=null) {
						this.tipocomprobante = tipocomprobante;
					} else {
						this.tipocomprobante = new TipoComprobante();
					}
				}

				if(this.isTienePermisosDocumentoAnulado && this.permiteMantenimiento(this.tipocomprobante)) {
					DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup=new DocumentoAnuladoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						documentoanuladoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup;
					} else {
						documentoanuladoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame;
					}

					List<TipoComprobante> tipocomprobantes=new ArrayList<TipoComprobante>();
					tipocomprobantes.add(this.tipocomprobante);
					if(!esRelacionado) {
						//documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setConGuardarRelaciones(false);
						//documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					documentoanuladoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoComprobante.cargarDocumentoAnuladoBeanSwingJInternalFrame(tipocomprobantes,this.tipocomprobante,documentoanuladoBeanSwingJInternalFrame,/*conInicializar,*/documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getConGuardarRelaciones(),documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado());
					documentoanuladoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("no_relacionado");

						documentoanuladoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DocumentoAnuladoConstantesFunciones.ITAMANIOFILATABLA + (DocumentoAnuladoConstantesFunciones.ITAMANIOFILATABLA/2));

						documentoanuladoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoComprobante=(TitledBorder)this.jScrollPanelDatosTipoComprobante.getBorder();
						TitledBorder titledBorderDocumentoAnulado=(TitledBorder)documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.getBorder();

						titledBorderDocumentoAnulado.setTitle(titledBorderTipoComprobante.getTitle() + " -> Documento Anulado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,documentoanuladoBeanSwingJInternalFrame);
						}

						documentoanuladoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(documentoanuladoBeanSwingJInternalFrame);

						documentoanuladoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Documento Anulado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoComprobante(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante));			
			this.jButtonDuplicarTipoComprobante.setVisible((this.isVisibilidadCeldaDuplicarTipoComprobante && this.isPermisoDuplicarTipoComprobante));			
			this.jButtonCopiarTipoComprobante.setVisible((this.isVisibilidadCeldaCopiarTipoComprobante && this.isPermisoCopiarTipoComprobante));
			this.jButtonVerFormTipoComprobante.setVisible((this.isVisibilidadCeldaVerFormTipoComprobante && this.isPermisoVerFormTipoComprobante));
			
			this.jButtonAbrirOrderByTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));			
			
			this.jButtonNuevoRelacionesTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComprobante && this.isPermisoNuevoTipoComprobante));			
			this.jButtonNuevoGuardarCambiosTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarTipoComprobante.setVisible((this.isVisibilidadCeldaModificarTipoComprobante && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.setVisible((this.isVisibilidadCeldaActualizarTipoComprobante && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.setVisible((this.isVisibilidadCeldaEliminarTipoComprobante && this.isPermisoEliminarTipoComprobante));
			this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.setVisible(this.isVisibilidadCeldaCancelarTipoComprobante);							
			this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante));						
			this.jButtonDuplicarToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaDuplicarTipoComprobante && this.isPermisoDuplicarTipoComprobante));						
			this.jButtonCopiarToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaCopiarTipoComprobante && this.isPermisoCopiarTipoComprobante));			
			this.jButtonVerFormToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaVerFormTipoComprobante && this.isPermisoVerFormTipoComprobante));			
			this.jButtonAbrirOrderByToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));
			this.jButtonNuevoRelacionesToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComprobante && this.isPermisoNuevoTipoComprobante));			
			this.jButtonNuevoGuardarCambiosToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));			
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaModificarTipoComprobante && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaActualizarTipoComprobante  && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaEliminarTipoComprobante && this.isPermisoEliminarTipoComprobante));
			this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarToolBarTipoComprobante.setVisible(this.isVisibilidadCeldaCancelarTipoComprobante);				
			this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante));			
			this.jMenuItemDuplicarTipoComprobante.setVisible((this.isVisibilidadCeldaDuplicarTipoComprobante && this.isPermisoDuplicarTipoComprobante));			
			this.jMenuItemCopiarTipoComprobante.setVisible((this.isVisibilidadCeldaCopiarTipoComprobante && this.isPermisoCopiarTipoComprobante));			
			this.jMenuItemVerFormTipoComprobante.setVisible((this.isVisibilidadCeldaVerFormTipoComprobante && this.isPermisoVerFormTipoComprobante));			
			this.jMenuItemAbrirOrderByTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));			
			//this.jMenuItemMostrarOcultarTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));
			this.jMenuItemDetalleAbrirOrderByTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));			
			//this.jMenuItemDetalleMostrarOcultarTipoComprobante.setVisible((this.isVisibilidadCeldaOrdenTipoComprobante && this.isPermisoOrdenTipoComprobante));			
			this.jMenuItemNuevoRelacionesTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComprobante && this.isPermisoNuevoTipoComprobante));			
			this.jMenuItemNuevoGuardarCambiosTipoComprobante.setVisible((this.isVisibilidadCeldaNuevoTipoComprobante && this.isPermisoNuevoTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));									
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemModificarTipoComprobante.setVisible((this.isVisibilidadCeldaModificarTipoComprobante && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemActualizarTipoComprobante.setVisible((this.isVisibilidadCeldaActualizarTipoComprobante && this.isPermisoActualizarTipoComprobante));	
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemEliminarTipoComprobante.setVisible((this.isVisibilidadCeldaEliminarTipoComprobante && this.isPermisoEliminarTipoComprobante));
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemCancelarTipoComprobante.setVisible(this.isVisibilidadCeldaCancelarTipoComprobante);				
			}
			
			this.jMenuItemGuardarCambiosTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));						
			this.jMenuItemGuardarCambiosTablaTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoComprobante=this.jButtonNuevoTipoComprobante.isVisible();
			this.isVisibilidadCeldaDuplicarTipoComprobante=this.jButtonDuplicarTipoComprobante.isVisible();
			this.isVisibilidadCeldaCopiarTipoComprobante=this.jButtonCopiarTipoComprobante.isVisible();
			this.isVisibilidadCeldaVerFormTipoComprobante=this.jButtonVerFormTipoComprobante.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoComprobante=this.jButtonAbrirOrderByTipoComprobante.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=this.jButtonNuevoRelacionesTipoComprobante.isVisible();
			this.isVisibilidadCeldaModificarTipoComprobante=this.jButtonModificarTipoComprobante.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.isVisibilidadCeldaActualizarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.isVisible();
			this.isVisibilidadCeldaEliminarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.isVisible();
			this.isVisibilidadCeldaCancelarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.isVisible();
			this.isVisibilidadCeldaGuardarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=this.jButtonGuardarCambiosTablaTipoComprobante.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoComprobante=this.jButtonNuevoToolBarTipoComprobante.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=this.jButtonNuevoRelacionesToolBarTipoComprobante.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.isVisibilidadCeldaModificarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarToolBarTipoComprobante.isVisible();
			this.isVisibilidadCeldaActualizarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarToolBarTipoComprobante.isVisible();
			this.isVisibilidadCeldaEliminarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarToolBarTipoComprobante.isVisible();
			this.isVisibilidadCeldaCancelarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarToolBarTipoComprobante.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoComprobante=this.jButtonGuardarCambiosToolBarTipoComprobante.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=this.jButtonGuardarCambiosTablaToolBarTipoComprobante.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoComprobante=this.jMenuItemNuevoTipoComprobante.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=this.jMenuItemNuevoRelacionesTipoComprobante.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.isVisibilidadCeldaModificarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jMenuItemModificarTipoComprobante.isVisible();
			this.isVisibilidadCeldaActualizarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jMenuItemActualizarTipoComprobante.isVisible();
			this.isVisibilidadCeldaEliminarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jMenuItemEliminarTipoComprobante.isVisible();
			this.isVisibilidadCeldaCancelarTipoComprobante=this.jInternalFrameDetalleFormTipoComprobante.jMenuItemCancelarTipoComprobante.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoComprobante=this.jMenuItemGuardarCambiosTipoComprobante.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=this.jMenuItemGuardarCambiosTablaTipoComprobante.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoComprobante(Boolean esInicializar) {
		if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoComprobante();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoComprobante(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoComprobante() {
		this.jButtonNuevoTipoComprobante.setVisible(this.isPermisoNuevoTipoComprobante);			
		this.jButtonDuplicarTipoComprobante.setVisible(this.isPermisoDuplicarTipoComprobante);			
		this.jButtonCopiarTipoComprobante.setVisible(this.isPermisoCopiarTipoComprobante);			
		this.jButtonVerFormTipoComprobante.setVisible(this.isPermisoVerFormTipoComprobante);			
		
		this.jButtonAbrirOrderByTipoComprobante.setVisible(this.isPermisoOrdenTipoComprobante);					
		
		this.jButtonNuevoRelacionesTipoComprobante.setVisible(this.isPermisoNuevoTipoComprobante);			
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarTipoComprobante.setVisible(this.isPermisoActualizarTipoComprobante);	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.setVisible(this.isPermisoActualizarTipoComprobante);	
			this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.setVisible(this.isPermisoEliminarTipoComprobante);
			this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.setVisible(this.isVisibilidadCeldaCancelarTipoComprobante);						
			this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.setVisible(this.isPermisoGuardarCambiosTipoComprobante);							
		}
		
		this.jButtonGuardarCambiosTablaTipoComprobante.setVisible(this.isPermisoActualizarTipoComprobante);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoComprobante() {
		this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarTipoComprobante.setVisible(this.isPermisoActualizarTipoComprobante);	
		this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.setVisible(this.isPermisoActualizarTipoComprobante);	
		this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.setVisible(this.isPermisoEliminarTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.setVisible(this.isVisibilidadCeldaCancelarTipoComprobante);							
		this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.setVisible((this.isVisibilidadCeldaGuardarTipoComprobante && this.isPermisoGuardarCambiosTipoComprobante));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoComprobante() {
		if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoComprobante();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoComprobante() {
	}
	
	public void jTableDatosTipoComprobanteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoComprobante(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoComprobanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComprobante(this.gettipocomprobante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomprobante==null) {
						this.tipocomprobante = new TipoComprobante();
					}

					this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
				}

				if(this.tipocomprobante.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocomprobante.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComprobante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoComprobanteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoComprobante(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoComprobante.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoComprobante.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoComprobante(this.gettipocomprobante(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocomprobanteLogic.getConnexion());

				if(this.tipocomprobante.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocomprobante.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoComprobante=(TitledBorder)this.jScrollPanelDatosTipoComprobante.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoComprobante.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoComprobanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComprobante(this.gettipocomprobante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomprobante==null) {
						this.tipocomprobante = new TipoComprobante();
					}

					this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
				}

				if(this.tipocomprobante.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocomprobante.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComprobante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoComprobanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComprobante(this.gettipocomprobante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomprobante==null) {
						this.tipocomprobante = new TipoComprobante();
					}

					this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);
				}

				if(this.tipocomprobante.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocomprobante.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComprobante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoComprobante(false,false);

			this.getTipoComprobantesBusquedaPorId();

			this.inicializarActualizarBindingTipoComprobante(false);

			//if(TipoComprobanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoComprobante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoComprobante(false,false);

			this.getTipoComprobantesBusquedaPorNombre();

			this.inicializarActualizarBindingTipoComprobante(false);

			//if(TipoComprobanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoComprobante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoComprobanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoComprobante(false,false);

			this.getTipoComprobantesFK_IdEmpresa();

			this.inicializarActualizarBindingTipoComprobante(false);

			//if(TipoComprobanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoComprobante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomprobanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoComprobante() {
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
		

		if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
			this.jInternalFrameDetalleFormTipoComprobante.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoComprobante.dispose();
			this.jInternalFrameDetalleFormTipoComprobante=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
			this.jInternalFrameReporteDinamicoTipoComprobante.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoComprobante.dispose();
			this.jInternalFrameReporteDinamicoTipoComprobante=null;
		}
		
		if(this.jInternalFrameImportacionTipoComprobante!=null) {
			this.jInternalFrameImportacionTipoComprobante.setVisible(false);	    			
			this.jInternalFrameImportacionTipoComprobante.dispose();
			this.jInternalFrameImportacionTipoComprobante=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoComprobante();
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoComprobante")) {
				jButtonDuplicarTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoComprobante")) {
				jButtonCopiarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoComprobante")) {
				jButtonVerFormTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoComprobante")) {
				jButtonDuplicarTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoComprobante")) {
				jButtonDuplicarTipoComprobanteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoComprobante")) {
				jButtonModificarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoComprobante")) {
				jButtonModificarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoComprobante")) {
				jButtonModificarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoComprobante")) {
				jButtonActualizarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoComprobante")) {
				jButtonActualizarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoComprobante")) {
				jButtonActualizarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoComprobante")) {
				jButtonEliminarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoComprobante")) {
				jButtonEliminarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoComprobante")) {
				jButtonEliminarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoComprobante")) {
				jButtonCancelarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoComprobante")) {
				jButtonCancelarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoComprobante")) {
				jButtonCancelarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoComprobante")) {
				jButtonCerrarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoComprobante")) {
				jButtonCerrarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoComprobante")) {
				jButtonCerrarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoComprobante")) {
				jButtonMostrarOcultarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoComprobante")) {
				jButtonCancelarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoComprobante")) {
				jButtonCopiarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoComprobante")) {
				jButtonVerFormTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoComprobante")) {
				jButtonCopiarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoComprobante")) {
				jButtonVerFormTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoComprobante")) {
				jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoComprobante")) {
				jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoComprobante")) {
				jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoComprobante")) {
				jButtonAnterioresTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoComprobante")) {
				jButtonAnterioresTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoComprobante")) {
				jButtonAnterioresTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoComprobante")) {
				jButtonSiguientesTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoComprobante")) {
				jButtonSiguientesTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoComprobante")) {
				jButtonSiguientesTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoComprobante") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoComprobante")) {
				jButtonAbrirOrderByTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoComprobante") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoComprobante")) {
				jButtonMostrarOcultarTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoComprobante")) {
				jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoComprobante")) {
				jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoComprobante")) {
				jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoComprobante")) {
				jButtonCerrarReporteDinamicoTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoComprobante")) {
				jButtonGenerarReporteDinamicoTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoComprobante")) {
				
				jButtonGenerarExcelReporteDinamicoTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoComprobante")) {
				jButtonCerrarImportacionTipoComprobanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoComprobante")) {
				
				jButtonGenerarImportacionTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoComprobante")) {
				
				jButtonAbrirImportacionTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoComprobante")) {
				jComboBoxTiposAccionesTipoComprobanteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoComprobante")) {
				jComboBoxTiposRelacionesTipoComprobanteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoComprobante")) {
				jComboBoxTiposAccionesTipoComprobanteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoComprobante")) {
				
				jComboBoxTiposSeleccionarTipoComprobanteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoComprobante")) {
				jTextFieldValorCampoGeneralTipoComprobanteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoComprobante")) {
				jButtonAbrirOrderByTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoComprobante")) {
				jButtonAbrirOrderByTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoComprobante")) {
				jButtonCerrarOrderByTipoComprobanteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComprobanteBusqueda")) {
				this.jButtonidTipoComprobanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComprobanteUpdate")) {
				this.jButtonid_empresaTipoComprobanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComprobanteBusqueda")) {
				this.jButtonid_empresaTipoComprobanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComprobanteBusqueda")) {
				this.jButtonnombreTipoComprobanteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoComprobante")) {
				this.jButtonBusquedaPorIdTipoComprobanteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoComprobante")) {
				this.jButtonBusquedaPorNombreTipoComprobanteActionPerformed(evt);
			}
			
			;
			
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoComprobante();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoComprobante tipocomprobanteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocomprobanteLocal=this.tipocomprobante;
			} else {
				tipocomprobanteLocal=this.tipocomprobanteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
							
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
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
			
			


			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
								
						
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
								
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
							
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
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
			
			


			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
								
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoComprobante")) {
					jCheckBoxSeleccionarTodosTipoComprobanteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoComprobante")) {
					jCheckBoxSeleccionadosTipoComprobanteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoComprobante")) {
					
				}
				
				


				
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
												
				
				


				
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
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
			
			


			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComprobanteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomprobante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomprobante);
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
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
				
				


				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComprobante.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComprobante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComprobanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomprobanteAnterior =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoComprobante")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoComprobanteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoComprobante.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocomprobante =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocomprobante =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocomprobante);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoComprobante")) {
				
				}
				
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoComprobante")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoComprobante.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoComprobante")) {
			
			}
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoComprobante();
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoComprobante")) {
				jButtonDuplicarTipoComprobanteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoComprobante")) {
				jButtonCopiarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoComprobante")) {
				jButtonVerFormTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoComprobante")) {
				jButtonNuevoTipoComprobanteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoComprobante")) {
				jButtonModificarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoComprobante")) {
				jButtonActualizarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoComprobante")) {
				jButtonEliminarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoComprobante")) {
				jButtonCancelarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoComprobante")) {
				jButtonCerrarTipoComprobanteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoComprobante")) {
				jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoComprobante")) {
				jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoComprobante")) {
				jButtonAbrirOrderByTipoComprobanteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoComprobante")) {
				jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoComprobante")) {
				jButtonAnterioresTipoComprobanteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoComprobante")) {
				jButtonSiguientesTipoComprobanteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComprobanteBusqueda")) {
				this.jButtonidTipoComprobanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComprobanteUpdate")) {
				this.jButtonid_empresaTipoComprobanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComprobanteBusqueda")) {
				this.jButtonid_empresaTipoComprobanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComprobanteBusqueda")) {
				this.jButtonnombreTipoComprobanteBusquedaActionPerformed(evt);
			}
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoComprobante();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoComprobante")) {
				closingInternalFrameTipoComprobante();
				
			} else if(sTipo.equals("jButtonCancelarTipoComprobante")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoComprobante = (JInternalFrameBase)evt.getSource();
	            	
	            TipoComprobanteBeanSwingJInternalFrame jInternalFrameParent=(TipoComprobanteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoComprobante.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoComprobanteActionPerformed(null);
			}
			
			TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocomprobante,new Object(),this.tipocomprobanteParameterGeneral,this.tipocomprobanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoComprobante(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoComprobante(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoComprobante(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocomprobante)) {
			if(!esControlTabla) {
				if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);			
				}
				
				if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoComprobante(this.tipocomprobante,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomprobanteReturnGeneral=tipocomprobanteLogic.procesarEventosTipoComprobantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomprobanteLogic.getTipoComprobantes(),this.tipocomprobante,this.tipocomprobanteParameterGeneral,this.isEsNuevoTipoComprobante,classes);//this.tipocomprobanteLogic.getTipoComprobante()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoComprobante(this.tipocomprobanteReturnGeneral,this.tipocomprobanteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoComprobante(classes,this.tipocomprobanteReturnGeneral,this.tipocomprobanteBean,false);
					}
						
					if(this.tipocomprobanteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante());	
					}
						
					if(this.tipocomprobanteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante(),classes);//this.tipocomprobanteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoComprobante(this.tipocomprobante,classes);//this.tipocomprobanteBean);									
				}
			
				if(TipoComprobanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoComprobante(this.tipocomprobante,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComprobante(this.tipocomprobante);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocomprobanteAnterior!=null) {
						this.tipocomprobante=this.tipocomprobanteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomprobanteReturnGeneral=tipocomprobanteLogic.procesarEventosTipoComprobantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomprobanteLogic.getTipoComprobantes(),this.tipocomprobante,this.tipocomprobanteParameterGeneral,this.isEsNuevoTipoComprobante,classes);//this.tipocomprobanteLogic.getTipoComprobante()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomprobanteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomprobanteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocomprobanteReturnGeneral.getTipoComprobante(),tipocomprobanteLogic.getTipoComprobantes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocomprobanteReturnGeneral.getTipoComprobante(),this.tipocomprobantes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoComprobante.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoComprobante.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoComprobante();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoComprobante() throws Exception {
		
		TipoComprobanteModel tipocomprobanteModel=(TipoComprobanteModel)this.jTableDatosTipoComprobante.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomprobanteModel.tipocomprobantes=this.tipocomprobanteLogic.getTipoComprobantes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocomprobanteModel.tipocomprobantes=this.tipocomprobantes;
		}
		
		
		((TipoComprobanteModel) this.jTableDatosTipoComprobante.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoComprobante() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocomprobanteAnterior(),this.tipocomprobanteLogic.getTipoComprobantes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocomprobanteAnterior(),this.tipocomprobantes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoComprobante();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoComprobante(TipoComprobante tipocomprobante,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipocomprobante.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionLogic.setTransaccions(tipocomprobante.getTransaccions());
					this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(tipocomprobante.getDocumentoAnulados());
					this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
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
										
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomprobante,new Object(),generalEntityParameterGeneral,this.tipocomprobanteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocomprobanteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoComprobanteConstantesFunciones.getClassesRelationshipsOfTipoComprobante(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoComprobanteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoComprobante(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoComprobante(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoComprobanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomprobante,new Object(),generalEntityParameterGeneral,this.tipocomprobanteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoComprobante(TipoComprobanteBean tipocomprobanteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipocomprobante.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionLogic.setTransaccions(tipocomprobante.getTransaccions());
					this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(tipocomprobante.getDocumentoAnulados());
					this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoComprobante(ArrayList<Classe> classes,TipoComprobanteReturnGeneral tipocomprobanteReturnGeneral,TipoComprobanteBean tipocomprobanteBean,Boolean conDefault) throws Exception {
		
			this.tipocomprobanteBean.setTransaccionLocals(tipocomprobanteReturnGeneral.getTipoComprobante().getTransaccionLocals());
			this.tipocomprobanteBean.setTransaccions(tipocomprobanteReturnGeneral.getTipoComprobante().getTransaccions());
			this.tipocomprobanteBean.setDocumentoAnulados(tipocomprobanteReturnGeneral.getTipoComprobante().getDocumentoAnulados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoComprobante(TipoComprobante tipocomprobante,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					tipocomprobante.setTransaccionLocals(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Transaccion.class)) {
					tipocomprobante.setTransaccions(this.jInternalFrameDetalleFormTipoComprobante.transaccionBeanSwingJInternalFrame.transaccionLogic.getTransaccions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					tipocomprobante.setDocumentoAnulados(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocomprobante)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoComprobante = new TipoComprobanteDetalleFormJInternalFrame(jDesktopPane,this.tipocomprobanteSessionBean.getConGuardarRelaciones(),this.tipocomprobanteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.setVisible(false);
		this.jInternalFrameDetalleFormTipoComprobante.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoComprobante.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoComprobante.tipocomprobanteLogic=this.tipocomprobanteLogic;
		
		this.cargarCombosFrameForeignKeyTipoComprobante("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoComprobante();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoComprobante();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoComprobante("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoComprobante();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoComprobante.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoComprobante"));
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarTipoComprobante.addActionListener(new ButtonActionListener(this,"ModificarTipoComprobante"));

		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoComprobante"));
					
		this.jInternalFrameDetalleFormTipoComprobante.jMenuItemModificarTipoComprobante.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoComprobante"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.addActionListener (new ButtonActionListener(this,"ActualizarTipoComprobante"));
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoComprobante"));
						
		this.jInternalFrameDetalleFormTipoComprobante.jMenuItemActualizarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoComprobante"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.addActionListener (new ButtonActionListener(this,"EliminarTipoComprobante"));
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoComprobante"));
								
		this.jInternalFrameDetalleFormTipoComprobante.jMenuItemEliminarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoComprobante"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.addActionListener (new ButtonActionListener(this,"CancelarTipoComprobante"));
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoComprobante"));
					
		this.jInternalFrameDetalleFormTipoComprobante.jMenuItemCancelarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoComprobante"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jMenuItemDetalleCerrarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoComprobante"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComprobante"));
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComprobante"));
		
		
		
		this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoComprobante"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonidTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComprobanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonnombreTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComprobanteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoComprobante"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoComprobante"));
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoComprobante"));
		}
		
		this.jTableDatosTipoComprobante.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoComprobante"));
		
		this.jTableDatosTipoComprobante.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoComprobante"));
		
		this.jButtonNuevoTipoComprobante.addActionListener(new ButtonActionListener(this,"NuevoTipoComprobante"));
		
		this.jButtonDuplicarTipoComprobante.addActionListener(new ButtonActionListener(this,"DuplicarTipoComprobante"));
		
		this.jButtonCopiarTipoComprobante.addActionListener(new ButtonActionListener(this,"CopiarTipoComprobante"));
		
		this.jButtonVerFormTipoComprobante.addActionListener(new ButtonActionListener(this,"VerFormTipoComprobante"));
		
		
		this.jButtonNuevoToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoComprobante"));
			
		this.jButtonDuplicarToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoComprobante"));
			
		this.jMenuItemNuevoTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoComprobante"));
			
		this.jMenuItemDuplicarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoComprobante"));		
		
		
		this.jButtonNuevoRelacionesTipoComprobante.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoComprobante"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoComprobante"));
			
		this.jMenuItemNuevoRelacionesTipoComprobante.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoComprobante"));		
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarTipoComprobante.addActionListener(new ButtonActionListener(this,"ModificarTipoComprobante"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonModificarToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoComprobante"));
			
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemModificarTipoComprobante.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoComprobante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarTipoComprobante.addActionListener (new ButtonActionListener(this,"ActualizarTipoComprobante"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonActualizarToolBarTipoComprobante.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoComprobante"));
				
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemActualizarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoComprobante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarTipoComprobante.addActionListener (new ButtonActionListener(this,"EliminarTipoComprobante"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonEliminarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoComprobante"));
						
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemEliminarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoComprobante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarTipoComprobante.addActionListener (new ButtonActionListener(this,"CancelarTipoComprobante"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonCancelarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoComprobante"));
			
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemCancelarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoComprobante"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoComprobante"));		
		
		
		this.jButtonCerrarTipoComprobante.addActionListener (new ButtonActionListener(this,"CerrarTipoComprobante"));
		
		
		this.jButtonCerrarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoComprobante"));
			
		this.jMenuItemCerrarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoComprobante"));
			
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jMenuItemDetalleCerrarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoComprobante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoComprobante"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComprobante"));
		}
		
		this.jButtonCopiarToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoComprobante"));
			
		this.jButtonVerFormToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoComprobante"));
		
		this.jMenuItemGuardarCambiosTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoComprobante"));
			
		this.jMenuItemCopiarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoComprobante"));		
		
		this.jMenuItemVerFormTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoComprobante"));		
		
		
		this.jButtonGuardarCambiosTablaTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoComprobante"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoComprobante"));
			
		this.jMenuItemGuardarCambiosTablaTipoComprobante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoComprobante"));		
		
		
		
		this.jButtonRecargarInformacionTipoComprobante.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoComprobante"));
					
		this.jButtonRecargarInformacionToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoComprobante"));
		
		this.jMenuItemRecargarInformacionTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoComprobante"));		
		
		
		
		this.jButtonAnterioresTipoComprobante.addActionListener (new ButtonActionListener(this,"AnterioresTipoComprobante"));
		
		
		this.jButtonAnterioresToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoComprobante"));
		
		this.jMenuItemAnterioresTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoComprobante"));		
		
		
		this.jButtonSiguientesTipoComprobante.addActionListener (new ButtonActionListener(this,"SiguientesTipoComprobante"));
		
		
		this.jButtonSiguientesToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoComprobante"));
			
		this.jMenuItemSiguientesTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoComprobante"));
			
		this.jMenuItemAbrirOrderByTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoComprobante"));
			
		this.jMenuItemMostrarOcultarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoComprobante"));
			
		this.jMenuItemDetalleAbrirOrderByTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoComprobante"));
			
		this.jMenuItemDetalleMostarOcultarTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoComprobante"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoComprobante.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoComprobante"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoComprobante"));
			
		this.jMenuItemNuevoGuardarCambiosTipoComprobante.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoComprobante"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoComprobante.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoComprobante"));

		this.jCheckBoxSeleccionadosTipoComprobante.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoComprobante"));
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoComprobante"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoComprobante.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoComprobante"));
			
		this.jComboBoxTiposAccionesTipoComprobante.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoComprobante"));
					
		this.jComboBoxTiposSeleccionarTipoComprobante.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoComprobante"));
			
		this.jTextFieldValorCampoGeneralTipoComprobante.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoComprobante"));		
		
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonidTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComprobanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonnombreTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComprobanteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoComprobante.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoComprobante"));

			this.jButtonBusquedaPorNombreTipoComprobante.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoComprobante"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoComprobante!=null) {
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComprobante"));
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComprobante"));
				this.jInternalFrameReporteDinamicoTipoComprobante.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComprobante"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoComprobante.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComprobante"));				
			//this.jButtonGenerarReporteDinamicoTipoComprobante.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComprobante"));
			//this.jButtonGenerarExcelReporteDinamicoTipoComprobante.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComprobante"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoComprobante!=null) {
				this.jInternalFrameImportacionTipoComprobante.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoComprobante"));
				this.jInternalFrameImportacionTipoComprobante.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoComprobante"));
				this.jInternalFrameImportacionTipoComprobante.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoComprobante"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoComprobante.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoComprobante"));
			
			this.jButtonAbrirOrderByToolBarTipoComprobante.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoComprobante"));			
			
			if(this.jInternalFrameOrderByTipoComprobante!=null) {
				this.jInternalFrameOrderByTipoComprobante.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoComprobante"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComprobante.jTabbedPaneRelacionesTipoComprobante.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoComprobante"));
		
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
            		closingInternalFrameTipoComprobante();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoComprobante.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoComprobante = (JInternalFrameBase)event.getSource();
	            	
	            TipoComprobanteBeanSwingJInternalFrame jInternalFrameParent=(TipoComprobanteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoComprobante.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoComprobanteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoComprobante.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoComprobanteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoComprobante.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoComprobante.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoComprobante";
		inputMap = this.jButtonNuevoTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComprobanteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComprobanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoComprobante";
		inputMap = this.jButtonNuevoRelacionesTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComprobanteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoComprobante";
		inputMap = this.jButtonModificarTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoComprobante";
		inputMap = this.jButtonActualizarTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoComprobante";
		inputMap = this.jButtonEliminarTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoComprobante";
		inputMap = this.jButtonCancelarTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoComprobante";
		inputMap = this.jButtonCerrarTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoComprobante";
		inputMap = this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoComprobante.jButtonGuardarCambiosTipoComprobante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoComprobanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoComprobante.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoComprobanteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoComprobante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoComprobanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoComprobante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoComprobanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoComprobante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoComprobanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonidTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComprobanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonid_empresaTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComprobanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComprobante.jButtonnombreTipoComprobanteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComprobanteBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoComprobante.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoComprobante"));

		this.jButtonBusquedaPorNombreTipoComprobante.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoComprobante"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoComprobante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoComprobanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoComprobanteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoComprobante.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoComprobante(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
					tipocomprobanteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComprobante tipocomprobanteAux:tipocomprobantes) {
					tipocomprobanteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoComprobanteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
						tipocomprobanteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComprobante tipocomprobanteAux:tipocomprobantes) {
						tipocomprobanteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComprobante tipocomprobanteAux:tipocomprobantes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoComprobante(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoComprobante.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoComprobante.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoComprobanteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoComprobante.getSelectedRows();
			
			TipoComprobante tipocomprobanteLocal=new TipoComprobante();
			
			//this.seleccionarTodosTipoComprobante(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLocal =(TipoComprobante) this.tipocomprobanteLogic.getTipoComprobantes().toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocomprobanteLocal =(TipoComprobante) this.tipocomprobantes.toArray()[this.jTableDatosTipoComprobante.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocomprobanteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
						tipocomprobanteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComprobante tipocomprobanteAux:tipocomprobantes) {
						tipocomprobanteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoComprobante(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoComprobante.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoComprobante.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoComprobante,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoComprobanteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoComprobanteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoComprobanteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoComprobante.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoComprobante tipocomprobanteAux:this.tipocomprobanteLogic.getTipoComprobantes()) {
				
						if(sTipoSeleccionar.equals(TipoComprobanteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomprobanteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComprobante tipocomprobanteAux:tipocomprobantes) {
					
						if(sTipoSeleccionar.equals(TipoComprobanteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomprobanteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoComprobante(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoComprobanteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoComprobante=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoComprobante.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoComprobante) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoComprobante(conSplash);
				
					this.generarReporteTipoComprobantesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoComprobantesSeleccionados();
				//this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComprobantesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComprobantesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoComprobante();
				
				this.exportarTipoComprobantesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoComprobantes();
				//this.importarTipoComprobantes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoComprobante();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoComprobantesSeleccionados();
				//this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Comprobante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoComprobante();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoComprobante)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoComprobante(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComprobante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComprobante.jComboBoxTiposAccionesFormularioTipoComprobante.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoComprobante();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoComprobante(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoComprobanteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoComprobante();
			
			if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
			TipoComprobante tipocomprobante=new TipoComprobante();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoComprobante(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoComprobante.getSelectedItem();
			
			
			
			
			tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocomprobantesSeleccionados.size()==1) {
				for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
					tipocomprobante=tipocomprobanteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,tipocomprobante);
				}
				else if(this.sTipoRelacion.equals("Transaccion")) {
					jButtonTransaccionActionPerformed(null,rowIndex,true,false,tipocomprobante);
				}
				else if(this.sTipoRelacion.equals("Documento Anulado")) {
					jButtonDocumentoAnuladoActionPerformed(null,rowIndex,true,false,tipocomprobante);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoComprobante();
			
      		//this.finishProcessTipoComprobante(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoComprobanteReturnGeneral() throws Exception {
		if(this.tipocomprobanteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocomprobanteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocomprobanteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocomprobanteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocomprobanteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocomprobanteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoComprobante(false);
		}
		
		if(this.tipocomprobanteReturnGeneral.getConRetornoLista() || this.tipocomprobanteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocomprobanteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomprobanteLogic.setTipoComprobantes(this.tipocomprobanteReturnGeneral.getTipoComprobantes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocomprobanteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomprobanteLogic.setTipoComprobante(this.tipocomprobanteReturnGeneral.getTipoComprobante());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoComprobante(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoComprobante() throws Exception {
		
		
	}
	
	public ArrayList<TipoComprobante> getTipoComprobantesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoComprobante) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoComprobante tipocomprobanteAux:tipocomprobanteLogic.getTipoComprobantes()) {
					if(tipocomprobanteAux.getIsSelected()) {
						tipocomprobantesSeleccionados.add(tipocomprobanteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComprobante tipocomprobanteAux:this.tipocomprobantes) {
					if(tipocomprobanteAux.getIsSelected()) {
						tipocomprobantesSeleccionados.add(tipocomprobanteAux);				
					}
				}
			}
			
			if(tipocomprobantesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocomprobantesSeleccionados.addAll(this.tipocomprobanteLogic.getTipoComprobantes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocomprobantesSeleccionados.addAll(this.tipocomprobantes);				
					}
				}
			}
		} else {
			tipocomprobantesSeleccionados.add(this.tipocomprobante);
		}
		
		return tipocomprobantesSeleccionados;
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
	
	public void generarReporteTipoComprobantesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoComprobantesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoComprobantesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComprobantesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComprobantesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoComprobantesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Comprobante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoComprobantesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoComprobante();
		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoComprobante();
		
		
		//this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados ,tipocomprobanteImplementable,tipocomprobanteImplementableHome);
	}
	
	public void mostrarImportacionTipoComprobantes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoComprobante();
		
		this.abrirFrameImportacionTipoComprobante();		
		
			
		//this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados ,tipocomprobanteImplementable,tipocomprobanteImplementableHome);
	}
	
	public void importarTipoComprobantes() throws Exception {		
	
	}
	
	public void exportarTipoComprobantesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoComprobantesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoComprobantesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoComprobantesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Comprobante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoComprobante(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoComprobante(tipocomprobanteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocomprobanteAux.setsDetalleGeneralEntityReporte(tipocomprobanteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoComprobante(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoComprobanteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComprobanteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComprobanteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoComprobante(TipoComprobante tipocomprobante,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocomprobante.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomprobante.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomprobante.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomprobante.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoComprobantes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoComprobante(row);				
				iRow++;
			}				
			
			for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoComprobante(tipocomprobanteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoComprobantesSeleccionados() throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();		
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomprobante.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocomprobantes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocomprobante");
			//elementRoot.appendChild(element);
		
			for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
				element = document.createElement("tipocomprobante");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoComprobante(tipocomprobanteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comprobante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoComprobante(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComprobanteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoComprobante(TipoComprobante tipocomprobante,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomprobante.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomprobante.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomprobante.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoComprobante(TipoComprobante tipocomprobante,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoComprobanteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocomprobante.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoComprobanteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocomprobante.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoComprobanteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocomprobante.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoComprobanteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocomprobante.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoComprobantesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoComprobante> tipocomprobantesSeleccionados=new ArrayList<TipoComprobante>();
		
		tipocomprobantesSeleccionados=this.getTipoComprobantesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoComprobante(tipocomprobantesSeleccionados);
		
		this.generarReporteTipoComprobantes("Todos",tipocomprobantesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoComprobante(ArrayList<TipoComprobante> tipocomprobantesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoComprobante tipocomprobanteAux:tipocomprobantesSeleccionados) {
				tipocomprobanteAux.setsDetalleGeneralEntityReporte(tipocomprobanteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoComprobanteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocomprobanteAux.setsDescripcionGeneralEntityReporte1(tipocomprobanteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoComprobanteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocomprobanteAux.setsDescripcionGeneralEntityReporte1(tipocomprobanteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComprobanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoComprobante(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoComprobante=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=true;
				this.isVisibilidadCeldaGuardarCambiosTipoComprobante=true;
			}
			
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=true;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=true;
			this.isVisibilidadCeldaEliminarTipoComprobante=true;
			this.isVisibilidadCeldaCancelarTipoComprobante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=true;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoComprobante=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=true;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=true;
			this.isVisibilidadCeldaModificarTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
			this.isVisibilidadCeldaModificarTipoComprobante=true;
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
			this.isVisibilidadCeldaCancelarTipoComprobante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComprobante=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoComprobante=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=true;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=true;
		} else {
			this.actualizarEstadoPanelsTipoComprobante(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoComprobante=false;
			//this.isVisibilidadCeldaVerFormTipoComprobante=false;
			this.isVisibilidadCeldaDuplicarTipoComprobante=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocomprobanteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoComprobante=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			if(!tipocomprobanteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;												
			}
			
			this.jButtonCerrarTipoComprobante.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoComprobante=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocomprobante)) {
			this.isVisibilidadCeldaActualizarTipoComprobante=false;
			this.isVisibilidadCeldaEliminarTipoComprobante=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoComprobante() {
		this.isVisibilidadCeldaNuevoTipoComprobante=false;
		this.isVisibilidadCeldaGuardarCambiosTipoComprobante=false;
	}
	
	public void actualizarEstadoPanelsTipoComprobante(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoComprobante!=null) {
				this.jScrollPanelDatosEdicionTipoComprobante.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComprobante!=null) {
				this.jScrollPanelDatosTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComprobante!=null) {
				this.jPanelPaginacionTipoComprobante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
					this.jTabbedPaneBusquedasTipoComprobante.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComprobante!=null) {
				this.jTabbedPaneBusquedasTipoComprobante.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoComprobante!=null) {
				this.jPanelParametrosReportesTipoComprobante.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoComprobante.remove(jPanelBusquedaPorIdTipoComprobante);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoComprobante.remove(jPanelBusquedaPorNombreTipoComprobante);}
		}
		
	}
	
	

	public String registrarSesionTipoComprobanteParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setsPathNavegacionActual(tipocomprobanteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(TipoComprobanteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionlocalSessionBean.setlidTipoComprobanteActual(this.idTipoComprobanteActual);

			tipocomprobanteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoComprobante(true);
			tipocomprobanteSessionBean.setlIdTipoComprobanteActualForeignKey(this.idTipoComprobanteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoComprobanteParaTransacciones() throws Exception {
		Boolean isPaginaPopupTransaccion=false;

		try {

			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean=new TransaccionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setsPathNavegacionActual(tipocomprobanteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccion=this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccion(true);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccion(TipoComprobanteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
			this.jInternalFrameDetalleFormTipoComprobante.transaccionSessionBean.setlidTipoComprobanteActual(this.idTipoComprobanteActual);

			tipocomprobanteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoComprobante(true);
			tipocomprobanteSessionBean.setlIdTipoComprobanteActualForeignKey(this.idTipoComprobanteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoComprobanteParaDocumentoAnulados() throws Exception {
		Boolean isPaginaPopupDocumentoAnulado=false;

		try {

			if(this.tipocomprobanteSessionBean==null) {
				this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setsPathNavegacionActual(tipocomprobanteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDocumentoAnulado=this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDocumentoAnulado(true);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDocumentoAnulado(TipoComprobanteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setisBusquedaDesdeForeignKeySesionTipoComprobante(true);
			this.jInternalFrameDetalleFormTipoComprobante.documentoanuladoSessionBean.setlidTipoComprobanteActual(this.idTipoComprobanteActual);

			tipocomprobanteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoComprobante(true);
			tipocomprobanteSessionBean.setlIdTipoComprobanteActualForeignKey(this.idTipoComprobanteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoComprobanteSessionBean tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		
		if(this.tipocomprobanteSessionBean==null) {
			this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		}
		
		this.tipocomprobanteSessionBean.setsUltimaBusquedaTipoComprobante(this.getsAccionBusqueda());
		this.tipocomprobanteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocomprobanteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipocomprobanteSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocomprobanteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocomprobanteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoComprobanteSessionBean tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		
		if(this.tipocomprobanteSessionBean==null) {
			this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		}
		
		if(this.tipocomprobanteSessionBean.getsUltimaBusquedaTipoComprobante()!=null&&!this.tipocomprobanteSessionBean.getsUltimaBusquedaTipoComprobante().equals("")) {
			this.setsAccionBusqueda(tipocomprobanteSessionBean.getsUltimaBusquedaTipoComprobante());
			this.setiNumeroPaginacion(tipocomprobanteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocomprobanteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipocomprobanteSessionBean.getid());
				tipocomprobanteSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocomprobanteSessionBean.getnombre());
				tipocomprobanteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocomprobanteSessionBean.getid_empresa());
				tipocomprobanteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocomprobanteSessionBean.setsUltimaBusquedaTipoComprobante("");
		this.tipocomprobanteSessionBean.setiNumeroPaginacion(TipoComprobanteConstantesFunciones.INUMEROPAGINACION);
		this.tipocomprobanteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoComprobante(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoComprobante() {
		this.updateBorderResaltarBusquedasFormularioTipoComprobante();
		this.updateVisibilidadBusquedasFormularioTipoComprobante();
		this.updateHabilitarBusquedasFormularioTipoComprobante();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoComprobante() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoComprobante.getComponents().length>0) {
	

		if(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorIdTipoComprobante!=null) {
			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorIdTipoComprobante);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
				jPanel.setBorder(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorIdTipoComprobante);
			}
		}

		if(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorNombreTipoComprobante!=null) {
			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorNombreTipoComprobante);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
				jPanel.setBorder(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorNombreTipoComprobante);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoComprobante() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoComprobante.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorIdTipoComprobante);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocomprobanteConstantesFunciones.mostrarBusquedaPorIdTipoComprobante);
			if(!this.tipocomprobanteConstantesFunciones.mostrarBusquedaPorIdTipoComprobante && index>-1) {
				this.jTabbedPaneBusquedasTipoComprobante.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorNombreTipoComprobante);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocomprobanteConstantesFunciones.mostrarBusquedaPorNombreTipoComprobante);
			if(!this.tipocomprobanteConstantesFunciones.mostrarBusquedaPorNombreTipoComprobante && index>-1) {
				this.jTabbedPaneBusquedasTipoComprobante.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoComprobante() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoComprobante.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorIdTipoComprobante);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocomprobanteConstantesFunciones.activarBusquedaPorIdTipoComprobante);
				this.jTabbedPaneBusquedasTipoComprobante.setEnabledAt(index,this.tipocomprobanteConstantesFunciones.activarBusquedaPorIdTipoComprobante);
			}

			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorNombreTipoComprobante);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocomprobanteConstantesFunciones.activarBusquedaPorNombreTipoComprobante);
				this.jTabbedPaneBusquedasTipoComprobante.setEnabledAt(index,this.tipocomprobanteConstantesFunciones.activarBusquedaPorNombreTipoComprobante);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoComprobante(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorIdTipoComprobante);

			this.jTabbedPaneBusquedasTipoComprobante.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);

			this.tipocomprobanteConstantesFunciones.setResaltarBusquedaPorIdTipoComprobante(resaltar);

			jPanel.setBorder(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorIdTipoComprobante);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoComprobante.indexOfComponent(this.jPanelBusquedaPorNombreTipoComprobante);

			this.jTabbedPaneBusquedasTipoComprobante.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoComprobante.getComponent(index);

			this.tipocomprobanteConstantesFunciones.setResaltarBusquedaPorNombreTipoComprobante(resaltar);

			jPanel.setBorder(this.tipocomprobanteConstantesFunciones.resaltarBusquedaPorNombreTipoComprobante);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoComprobante.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoComprobante() throws Exception {

		if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoComprobante();
		this.updateVisibilidadResaltarControlesFormularioTipoComprobante();
		this.updateHabilitarResaltarControlesFormularioTipoComprobante();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoComprobante() throws Exception {
		if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocomprobanteConstantesFunciones.resaltaridTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante!=null) {this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setBorder(this.tipocomprobanteConstantesFunciones.resaltaridTipoComprobante);}
		if(this.tipocomprobanteConstantesFunciones.resaltarid_empresaTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante!=null) {this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setBorder(this.tipocomprobanteConstantesFunciones.resaltarid_empresaTipoComprobante);}
		if(this.tipocomprobanteConstantesFunciones.resaltarnombreTipoComprobante!=null && this.jInternalFrameDetalleFormTipoComprobante!=null) {this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setBorder(this.tipocomprobanteConstantesFunciones.resaltarnombreTipoComprobante);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoComprobante() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
	
		//this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostraridTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jPanelidTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostraridTipoComprobante);
		//this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostrarid_empresaTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jPanelid_empresaTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostrarid_empresaTipoComprobante);
		//this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostrarnombreTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jPanelnombreTipoComprobante.setVisible(this.tipocomprobanteConstantesFunciones.mostrarnombreTipoComprobante);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoComprobante() throws Exception {
		if(this.jInternalFrameDetalleFormTipoComprobante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoComprobante!=null) {
	
		this.jInternalFrameDetalleFormTipoComprobante.jLabelidTipoComprobante.setEnabled(this.tipocomprobanteConstantesFunciones.activaridTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jComboBoxid_empresaTipoComprobante.setEnabled(this.tipocomprobanteConstantesFunciones.activarid_empresaTipoComprobante);
		this.jInternalFrameDetalleFormTipoComprobante.jTextAreanombreTipoComprobante.setEnabled(this.tipocomprobanteConstantesFunciones.activarnombreTipoComprobante);
		}
	}
	
		
}