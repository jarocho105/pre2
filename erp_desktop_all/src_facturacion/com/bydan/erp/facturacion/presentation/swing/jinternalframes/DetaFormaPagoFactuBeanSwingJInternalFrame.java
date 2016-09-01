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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.DetaFormaPagoFactuConstantesFunciones;
import com.bydan.erp.facturacion.util.DetaFormaPagoFactuParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetaFormaPagoFactuParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.DetaFormaPagoFactuBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetaFormaPagoFactuBeanSwingJInternalFrame extends DetaFormaPagoFactuJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetaFormaPagoFactuBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetaFormaPagoFactu> detaformapagofactuValidator = new ClassValidator<DetaFormaPagoFactu>(DetaFormaPagoFactu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetaFormaPagoFactu detaformapagofactu;	
	public DetaFormaPagoFactu detaformapagofactuAux;
	public DetaFormaPagoFactu detaformapagofactuAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetaFormaPagoFactu detaformapagofactuTotales;
	public Long idDetaFormaPagoFactuActual;
	public Long iIdNuevoDetaFormaPagoFactu=0L;
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

	public String sFinalQueryComboTipoFormaPago="";

	public List<TipoFormaPago> tipoformapagosForeignKey;

	public List<TipoFormaPago> gettipoformapagosForeignKey() {
		return tipoformapagosForeignKey;
	}

	public void settipoformapagosForeignKey(List<TipoFormaPago> tipoformapagosForeignKey) {
		this.tipoformapagosForeignKey = tipoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormaPago tipoformapagoForeignKey;

	public TipoFormaPago gettipoformapagoForeignKey() {
		return tipoformapagoForeignKey;
	}

	public void settipoformapagoForeignKey(TipoFormaPago tipoformapagoForeignKey) {
		this.tipoformapagoForeignKey = tipoformapagoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetaFormaPago=false;

	public Boolean getIsTienePermisosDetaFormaPago() {
		return isTienePermisosDetaFormaPago;
	}

	public void setIsTienePermisosDetaFormaPago(Boolean isTienePermisosDetaFormaPago) {
		this.isTienePermisosDetaFormaPago= isTienePermisosDetaFormaPago;
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
	
	public Boolean isPermisoTodoDetaFormaPagoFactu;
	public Boolean isPermisoNuevoDetaFormaPagoFactu;
	public Boolean isPermisoActualizarDetaFormaPagoFactu;
	public Boolean isPermisoActualizarOriginalDetaFormaPagoFactu;
	public Boolean isPermisoEliminarDetaFormaPagoFactu;
	public Boolean isPermisoGuardarCambiosDetaFormaPagoFactu;
	public Boolean isPermisoConsultaDetaFormaPagoFactu;
	public Boolean isPermisoBusquedaDetaFormaPagoFactu;
	public Boolean isPermisoReporteDetaFormaPagoFactu;
	public Boolean isPermisoPaginacionMedioDetaFormaPagoFactu;
	public Boolean isPermisoPaginacionAltoDetaFormaPagoFactu;
	public Boolean isPermisoPaginacionTodoDetaFormaPagoFactu;
	public Boolean isPermisoCopiarDetaFormaPagoFactu;
	public Boolean isPermisoVerFormDetaFormaPagoFactu;
	public Boolean isPermisoDuplicarDetaFormaPagoFactu;
	public Boolean isPermisoOrdenDetaFormaPagoFactu;
	
	
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
	
	public DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuReturnGeneral;
	public DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuParameterGeneral;
	
	

	public DetaFormaPagoLogic detaformapagoLogic=null;

	public DetaFormaPagoLogic getDetaFormaPagoLogic() {
		return detaformapagoLogic;
	}

	public void setDetaFormaPagoLogic(DetaFormaPagoLogic detaformapagoLogic) {
		this.detaformapagoLogic = detaformapagoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetaFormaPagoFactu=false;
	public Boolean esParaAccionDesdeFormularioDetaFormaPagoFactu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetaFormaPagoFactuSessionBeanAdditional detaformapagofactuSessionBeanAdditional=null;
	
	public DetaFormaPagoFactuSessionBeanAdditional getDetaFormaPagoFactuSessionBeanAdditional() {
		return this.detaformapagofactuSessionBeanAdditional;
	}
	
	public void setDetaFormaPagoFactuSessionBeanAdditional(DetaFormaPagoFactuSessionBeanAdditional detaformapagofactuSessionBeanAdditional) {
		try {
			this.detaformapagofactuSessionBeanAdditional=detaformapagofactuSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetaFormaPagoFactuBeanSwingJInternalFrameAdditional detaformapagofactuBeanSwingJInternalFrameAdditional=null;
	//public class DetaFormaPagoFactuBeanSwingJInternalFrame
	
	public DetaFormaPagoFactuBeanSwingJInternalFrameAdditional getDetaFormaPagoFactuBeanSwingJInternalFrameAdditional() {
		return this.detaformapagofactuBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetaFormaPagoFactuBeanSwingJInternalFrameAdditional(DetaFormaPagoFactuBeanSwingJInternalFrameAdditional detaformapagofactuBeanSwingJInternalFrameAdditional) {
		try {
			this.detaformapagofactuBeanSwingJInternalFrameAdditional=detaformapagofactuBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetaFormaPagoFactuLogic detaformapagofactuLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetaFormaPagoFactu detaformapagofactuBean;
	public DetaFormaPagoFactuConstantesFunciones detaformapagofactuConstantesFunciones;
	//public DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	
	//PARAMETROS
	
	
	//public List<DetaFormaPagoFactu> detaformapagofactus;	
	//public List<DetaFormaPagoFactu> detaformapagofactusEliminados;
	//public List<DetaFormaPagoFactu> detaformapagofactusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaDuplicarDetaFormaPagoFactu=true;
	public Boolean isVisibilidadCeldaCopiarDetaFormaPagoFactu=true;
	public Boolean isVisibilidadCeldaVerFormDetaFormaPagoFactu=true;
	public Boolean isVisibilidadCeldaOrdenDetaFormaPagoFactu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaCancelarDetaFormaPagoFactu=false;
	public Boolean isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoDetaFormaPagoFactu() {
		return this.iIdNuevoDetaFormaPagoFactu;
	}

	public void setiIdNuevoDetaFormaPagoFactu(Long iIdNuevoDetaFormaPagoFactu) {
		this.iIdNuevoDetaFormaPagoFactu = iIdNuevoDetaFormaPagoFactu;
	}
	
	public Long getidDetaFormaPagoFactuActual() {
		return this.idDetaFormaPagoFactuActual;
	}

	public void setidDetaFormaPagoFactuActual(Long idDetaFormaPagoFactuActual) {
		this.idDetaFormaPagoFactuActual = idDetaFormaPagoFactuActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetaFormaPagoFactu getdetaformapagofactu() {
		return this.detaformapagofactu;
	}

	public void setdetaformapagofactu(DetaFormaPagoFactu detaformapagofactu) {
		this.detaformapagofactu = detaformapagofactu;
	}
	
	public DetaFormaPagoFactu getdetaformapagofactuAux() {
		return this.detaformapagofactuAux;
	}

	public void setdetaformapagofactuAux(DetaFormaPagoFactu detaformapagofactuAux) {
		this.detaformapagofactuAux = detaformapagofactuAux;
	}				
	
	public DetaFormaPagoFactu getdetaformapagofactuAnterior() {
		return this.detaformapagofactuAnterior;
	}

	public void setdetaformapagofactuAnterior(DetaFormaPagoFactu detaformapagofactuAnterior) {
		this.detaformapagofactuAnterior = detaformapagofactuAnterior;
	}	
	
	public DetaFormaPagoFactu getdetaformapagofactuTotales() {
		return this.detaformapagofactuTotales;
	}

	public void setdetaformapagofactuTotales(DetaFormaPagoFactu detaformapagofactuTotales) {
		this.detaformapagofactuTotales = detaformapagofactuTotales;
	}	
	
	public DetaFormaPagoFactu getdetaformapagofactuBean() {
		return this.detaformapagofactuBean;
	}

	public void setdetaformapagofactuBean(DetaFormaPagoFactu detaformapagofactuBean) {
		this.detaformapagofactuBean = detaformapagofactuBean;
	}	
	
	public DetaFormaPagoFactuParameterReturnGeneral getdetaformapagofactuReturnGeneral() {
		return this.detaformapagofactuReturnGeneral;
	}

	public void setdetaformapagofactuReturnGeneral(DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuReturnGeneral) {
		this.detaformapagofactuReturnGeneral = detaformapagofactuReturnGeneral;
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

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetaFormaPagoFactuLogic getDetaFormaPagoFactuLogic()	{		
		return detaformapagofactuLogic;
	}

	public void setDetaFormaPagoFactuLogic(DetaFormaPagoFactuLogic detaformapagofactuLogic) {
		this.detaformapagofactuLogic = detaformapagofactuLogic;
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
	
	public Boolean getIsEsNuevoDetaFormaPagoFactu() {
		return isEsNuevoDetaFormaPagoFactu;
	}

	public void setIsEsNuevoDetaFormaPagoFactu(Boolean isEsNuevoDetaFormaPagoFactu) {
		this.isEsNuevoDetaFormaPagoFactu = isEsNuevoDetaFormaPagoFactu;
	}

	public Boolean getEsParaAccionDesdeFormularioDetaFormaPagoFactu() {
		return esParaAccionDesdeFormularioDetaFormaPagoFactu;
	}
	
	public void setEsParaAccionDesdeFormularioDetaFormaPagoFactu(Boolean esParaAccionDesdeFormularioDetaFormaPagoFactu) {
		this.esParaAccionDesdeFormularioDetaFormaPagoFactu = esParaAccionDesdeFormularioDetaFormaPagoFactu;
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

			if(this.detaformapagofactuSessionBean==null) {
				this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
			}

			if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detaformapagofactuSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();

			//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.detaformapagofactuSessionBean==null) {
				this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
			}

			if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipoformapagoLogic.getTodosTipoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoformapagosForeignKey=tipoformapagoLogic.getTipoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoLogic.getEntityWithConnection(detaformapagofactuSessionBean.getlidTipoFormaPagoActual());
					this.tipoformapagosForeignKey.add(tipoformapagoLogic.getTipoFormaPago());
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

					if(this.detaformapagofactu!=null) {
						this.detaformapagofactu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetaFormaPagoFactu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetaFormaPagoFactuGenerico)throws Exception
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
				jComboBoxid_empresaDetaFormaPagoFactuGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetaFormaPagoFactuGenerico!=null && jComboBoxid_empresaDetaFormaPagoFactuGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetaFormaPagoFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormaPagoForeignKey(Long idTipoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformapagoTemp!=null) {

					if(this.detaformapagofactu!=null) {
						this.detaformapagofactu.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setSelectedIndex(0);
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

	public String getActualTipoFormaPagoForeignKeyDescripcion(Long idTipoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(tipoformapagoTemp!=null) {
				jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico!=null && jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetaFormaPagoFactu detaformapagofactu,JComboBox jComboBoxid_empresaDetaFormaPagoFactuGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetaFormaPagoFactuGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetaFormaPagoFactuGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detaformapagofactu.setid_empresa(empresaAux.getId());
				detaformapagofactu.setempresa_descripcion(DetaFormaPagoFactuConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detaformapagofactu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(DetaFormaPagoFactu detaformapagofactu,JComboBox jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoDetaFormaPagoFactuGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				detaformapagofactu.setid_tipo_forma_pago(tipoformapagoAux.getId());
				detaformapagofactu.settipoformapago_descripcion(DetaFormaPagoFactuConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				detaformapagofactu.setTipoFormaPago(tipoformapagoAux);			}
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

					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { 
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { 
					}

					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { 
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { 
					}

					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.addItem(tipoformapago);
							}
						}

						if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetaFormaPagoFactu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetaFormaPagoFactuConstantesFunciones.refrescarForeignKeysDescripcionesDetaFormaPagoFactu(this.detaformapagofactuLogic.getDetaFormaPagoFactus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetaFormaPagoFactuConstantesFunciones.refrescarForeignKeysDescripcionesDetaFormaPagoFactu(this.detaformapagofactus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoFormaPago.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detaformapagofactuLogic.setDetaFormaPagoFactus(this.detaformapagofactus);
			detaformapagofactuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetaFormaPagoFactuParameterReturnGeneral getDetaFormaPagoFactuParameterGeneral() {
		return this.detaformapagofactuParameterGeneral;
	}
	
	public void setDetaFormaPagoFactuParameterGeneral(DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuParameterGeneral) {
		this.detaformapagofactuParameterGeneral = detaformapagofactuParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetaFormaPagoFactu() {
		return isPermisoTodoDetaFormaPagoFactu;
	}

	public void setIsPermisoTodoDetaFormaPagoFactu(Boolean isPermisoTodoDetaFormaPagoFactu) {
		this.isPermisoTodoDetaFormaPagoFactu = isPermisoTodoDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoNuevoDetaFormaPagoFactu() {
		return isPermisoNuevoDetaFormaPagoFactu;
	}

	public void setIsPermisoNuevoDetaFormaPagoFactu(Boolean isPermisoNuevoDetaFormaPagoFactu) {
		this.isPermisoNuevoDetaFormaPagoFactu = isPermisoNuevoDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoActualizarDetaFormaPagoFactu() {
		return isPermisoActualizarDetaFormaPagoFactu;
	}

	public void setIsPermisoActualizarDetaFormaPagoFactu(Boolean isPermisoActualizarDetaFormaPagoFactu) {
		this.isPermisoActualizarDetaFormaPagoFactu = isPermisoActualizarDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoEliminarDetaFormaPagoFactu() {
		return isPermisoEliminarDetaFormaPagoFactu;
	}

	public void setIsPermisoEliminarDetaFormaPagoFactu(Boolean isPermisoEliminarDetaFormaPagoFactu) {
		this.isPermisoEliminarDetaFormaPagoFactu = isPermisoEliminarDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoGuardarCambiosDetaFormaPagoFactu() {
		return isPermisoGuardarCambiosDetaFormaPagoFactu;
	}

	public void setIsPermisoGuardarCambiosDetaFormaPagoFactu(Boolean isPermisoGuardarCambiosDetaFormaPagoFactu) {
		this.isPermisoGuardarCambiosDetaFormaPagoFactu = isPermisoGuardarCambiosDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoConsultaDetaFormaPagoFactu() {
		return isPermisoConsultaDetaFormaPagoFactu;
	}

	public void setIsPermisoConsultaDetaFormaPagoFactu(Boolean isPermisoConsultaDetaFormaPagoFactu) {
		this.isPermisoConsultaDetaFormaPagoFactu = isPermisoConsultaDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoBusquedaDetaFormaPagoFactu() {
		return isPermisoBusquedaDetaFormaPagoFactu;
	}

	public void setIsPermisoBusquedaDetaFormaPagoFactu(Boolean isPermisoBusquedaDetaFormaPagoFactu) {
		this.isPermisoBusquedaDetaFormaPagoFactu = isPermisoBusquedaDetaFormaPagoFactu;
	}

	public Boolean getIsPermisoReporteDetaFormaPagoFactu() {
		return isPermisoReporteDetaFormaPagoFactu;
	}

	public void setIsPermisoReporteDetaFormaPagoFactu(Boolean isPermisoReporteDetaFormaPagoFactu) {
		this.isPermisoReporteDetaFormaPagoFactu = isPermisoReporteDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetaFormaPagoFactu() {
		return isPermisoPaginacionMedioDetaFormaPagoFactu;
	}

	public void setIsPermisoPaginacionMedioDetaFormaPagoFactu(Boolean isPermisoPaginacionMedioDetaFormaPagoFactu) {
		this.isPermisoPaginacionMedioDetaFormaPagoFactu = isPermisoPaginacionMedioDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetaFormaPagoFactu() {
		return isPermisoPaginacionTodoDetaFormaPagoFactu;
	}

	public void setIsPermisoPaginacionTodoDetaFormaPagoFactu(Boolean isPermisoPaginacionTodoDetaFormaPagoFactu) {
		this.isPermisoPaginacionTodoDetaFormaPagoFactu = isPermisoPaginacionTodoDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetaFormaPagoFactu() {
		return isPermisoPaginacionAltoDetaFormaPagoFactu;
	}

	public void setIsPermisoPaginacionAltoDetaFormaPagoFactu(Boolean isPermisoPaginacionAltoDetaFormaPagoFactu) {
		this.isPermisoPaginacionAltoDetaFormaPagoFactu = isPermisoPaginacionAltoDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoCopiarDetaFormaPagoFactu() {
		return isPermisoCopiarDetaFormaPagoFactu;
	}

	public void setIsPermisoCopiarDetaFormaPagoFactu(Boolean isPermisoCopiarDetaFormaPagoFactu) {
		this.isPermisoCopiarDetaFormaPagoFactu = isPermisoCopiarDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoVerFormDetaFormaPagoFactu() {
		return isPermisoVerFormDetaFormaPagoFactu;
	}

	public void setIsPermisoVerFormDetaFormaPagoFactu(Boolean isPermisoVerFormDetaFormaPagoFactu) {
		this.isPermisoVerFormDetaFormaPagoFactu = isPermisoVerFormDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoDuplicarDetaFormaPagoFactu() {
		return isPermisoDuplicarDetaFormaPagoFactu;
	}

	public void setIsPermisoDuplicarDetaFormaPagoFactu(Boolean isPermisoDuplicarDetaFormaPagoFactu) {
		this.isPermisoDuplicarDetaFormaPagoFactu = isPermisoDuplicarDetaFormaPagoFactu;
	}
	
	public Boolean getIsPermisoOrdenDetaFormaPagoFactu() {
		return isPermisoOrdenDetaFormaPagoFactu;
	}

	public void setIsPermisoOrdenDetaFormaPagoFactu(Boolean isPermisoOrdenDetaFormaPagoFactu) {
		this.isPermisoOrdenDetaFormaPagoFactu = isPermisoOrdenDetaFormaPagoFactu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetaFormaPagoFactu() {
		return isVisibilidadCeldaNuevoDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaNuevoDetaFormaPagoFactu(Boolean isVisibilidadCeldaNuevoDetaFormaPagoFactu) {
		this.isVisibilidadCeldaNuevoDetaFormaPagoFactu = isVisibilidadCeldaNuevoDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetaFormaPagoFactu() {
		return isVisibilidadCeldaDuplicarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaDuplicarDetaFormaPagoFactu(Boolean isVisibilidadCeldaDuplicarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu = isVisibilidadCeldaDuplicarDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetaFormaPagoFactu() {
		return isVisibilidadCeldaCopiarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaCopiarDetaFormaPagoFactu(Boolean isVisibilidadCeldaCopiarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaCopiarDetaFormaPagoFactu = isVisibilidadCeldaCopiarDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetaFormaPagoFactu() {
		return isVisibilidadCeldaVerFormDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaVerFormDetaFormaPagoFactu(Boolean isVisibilidadCeldaVerFormDetaFormaPagoFactu) {
		this.isVisibilidadCeldaVerFormDetaFormaPagoFactu = isVisibilidadCeldaVerFormDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetaFormaPagoFactu() {
		return isVisibilidadCeldaOrdenDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaOrdenDetaFormaPagoFactu(Boolean isVisibilidadCeldaOrdenDetaFormaPagoFactu) {
		this.isVisibilidadCeldaOrdenDetaFormaPagoFactu = isVisibilidadCeldaOrdenDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu() {
		return isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu(Boolean isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu) {
		this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu = isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetaFormaPagoFactu() {
		return isVisibilidadCeldaModificarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaModificarDetaFormaPagoFactu(Boolean isVisibilidadCeldaModificarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaModificarDetaFormaPagoFactu = isVisibilidadCeldaModificarDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetaFormaPagoFactu() {
		return isVisibilidadCeldaActualizarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaActualizarDetaFormaPagoFactu(Boolean isVisibilidadCeldaActualizarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaActualizarDetaFormaPagoFactu = isVisibilidadCeldaActualizarDetaFormaPagoFactu;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetaFormaPagoFactu() {
		return isVisibilidadCeldaEliminarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaEliminarDetaFormaPagoFactu(Boolean isVisibilidadCeldaEliminarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaEliminarDetaFormaPagoFactu = isVisibilidadCeldaEliminarDetaFormaPagoFactu;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetaFormaPagoFactu() {
		return isVisibilidadCeldaCancelarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaCancelarDetaFormaPagoFactu(Boolean isVisibilidadCeldaCancelarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaCancelarDetaFormaPagoFactu = isVisibilidadCeldaCancelarDetaFormaPagoFactu;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetaFormaPagoFactu() {
		return isVisibilidadCeldaGuardarDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaGuardarDetaFormaPagoFactu(Boolean isVisibilidadCeldaGuardarDetaFormaPagoFactu) {
		this.isVisibilidadCeldaGuardarDetaFormaPagoFactu = isVisibilidadCeldaGuardarDetaFormaPagoFactu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu() {
		return isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu(Boolean isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu) {
		this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu = isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu;
	}
		
	public DetaFormaPagoFactuSessionBean getdetaformapagofactuSessionBean() {
		return this.detaformapagofactuSessionBean;
	}
	
	public void setdetaformapagofactuSessionBean(DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean) {
		this.detaformapagofactuSessionBean=detaformapagofactuSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detaformapagofactu,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(detaformapagofactu,null);
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
	
	public void bugActualizarReferenciaActual(DetaFormaPagoFactu detaformapagofactu,DetaFormaPagoFactu detaformapagofactuAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetaFormaPagoFactu(detaformapagofactu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detaformapagofactuAux.setId(detaformapagofactu.getId());
		detaformapagofactuAux.setVersionRow(detaformapagofactu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetaFormaPagoFactu();
		
			int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detaformapagofactuValidator.getInvalidValues(this.detaformapagofactu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detaformapagofactuLogic.setDatosCliente(datosCliente);
			detaformapagofactuLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detaformapagofactuAux=new  DetaFormaPagoFactu();
				
				detaformapagofactuAux.setIsNew(true);
				detaformapagofactuAux.setIsChanged(true);
				
				detaformapagofactuAux.setDetaFormaPagoFactuOriginal(this.detaformapagofactu);
				
				detaformapagofactuAux.setId(this.detaformapagofactu.getId());	
				detaformapagofactuAux.setVersionRow(this.detaformapagofactu.getVersionRow());	
				detaformapagofactuAux.setid_empresa(this.detaformapagofactu.getid_empresa());	
				detaformapagofactuAux.setid_tipo_forma_pago(this.detaformapagofactu.getid_tipo_forma_pago());	
				detaformapagofactuAux.setnombre(this.detaformapagofactu.getnombre());	
				detaformapagofactuAux.setdescripcion(this.detaformapagofactu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detaformapagofactuAux,detaformapagofactus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.saveDetaFormaPagoFactus();//WithConnection
						//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);
					
					this.refrescarForeignKeysDescripcionesDetaFormaPagoFactu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos().addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos.addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detaformapagofactuLogic.saveDetaFormaPagoFactuRelaciones(detaformapagofactuAux,this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());//WithConnection
								//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.setDetaFormaPagos(new ArrayList<DetaFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos= new ArrayList<DetaFormaPago>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							detaformapagofactuAux.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detaformapagofactuAux,detaformapagofactus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detaformapagofactuAux=new  DetaFormaPagoFactu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado() 
					|| (this.detaformapagofactuSessionBean.getEsGuardarRelacionado() && this.detaformapagofactu.getId()>=0)) {
						
					detaformapagofactuAux.setIsNew(false);
				}
				
				detaformapagofactuAux.setIsDeleted(false);
			
				detaformapagofactuAux.setId(this.detaformapagofactu.getId());	
				detaformapagofactuAux.setVersionRow(this.detaformapagofactu.getVersionRow());	
				detaformapagofactuAux.setid_empresa(this.detaformapagofactu.getid_empresa());	
				detaformapagofactuAux.setid_tipo_forma_pago(this.detaformapagofactu.getid_tipo_forma_pago());	
				detaformapagofactuAux.setnombre(this.detaformapagofactu.getnombre());	
				detaformapagofactuAux.setdescripcion(this.detaformapagofactu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detaformapagofactuAux,detaformapagofactus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.saveDetaFormaPagoFactus();//WithConnection
						//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);
					
					this.refrescarForeignKeysDescripcionesDetaFormaPagoFactu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos().addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos.addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detaformapagofactuLogic.saveDetaFormaPagoFactuRelaciones(detaformapagofactuAux,this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());//WithConnection
								//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.setDetaFormaPagos(new ArrayList<DetaFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos= new ArrayList<DetaFormaPago>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							detaformapagofactuAux.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detaformapagofactuAux,detaformapagofactus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detaformapagofactu,detaformapagofactuAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detaformapagofactuAux=new  DetaFormaPagoFactu();
				
				detaformapagofactuAux.setIsNew(false);
				detaformapagofactuAux.setIsChanged(false);
				
				detaformapagofactuAux.setIsDeleted(true);
				
				detaformapagofactuAux.setId(this.detaformapagofactu.getId());	
				detaformapagofactuAux.setVersionRow(this.detaformapagofactu.getVersionRow());	
				detaformapagofactuAux.setid_empresa(this.detaformapagofactu.getid_empresa());	
				detaformapagofactuAux.setid_tipo_forma_pago(this.detaformapagofactu.getid_tipo_forma_pago());	
				detaformapagofactuAux.setnombre(this.detaformapagofactu.getnombre());	
				detaformapagofactuAux.setdescripcion(this.detaformapagofactu.getdescripcion());	
				
				if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detaformapagofactuAux.getId()>=0) {	
						this.detaformapagofactusEliminados.add(detaformapagofactuAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detaformapagofactuAux,detaformapagofactus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.saveDetaFormaPagoFactus();//WithConnection
						//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos().addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos.addAll(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jInternalFrameDetalleFormDetaFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detaformapagofactuLogic.saveDetaFormaPagoFactuRelaciones(detaformapagofactuAux,this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());//WithConnection
								//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.setDetaFormaPagos(new ArrayList<DetaFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos= new ArrayList<DetaFormaPago>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							detaformapagofactuAux.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detaformapagofactuAux,detaformapagofactuLogic.getDetaFormaPagoFactus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detaformapagofactuAux,detaformapagofactus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getDetaFormaPagoFactus().addAll(this.detaformapagofactusEliminados);
					
					detaformapagofactuLogic.saveDetaFormaPagoFactus();//WithConnection
					//detaformapagofactuLogic.getSetVersionRowDetaFormaPagoFactus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetaFormaPagoFactu();
				
				this.detaformapagofactusEliminados= new ArrayList<DetaFormaPagoFactu>();		
			}
			
			if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Deta Forma Pago Factu GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detaformapagofactu=detaformapagofactuAux;
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
      		//this.finishProcessDetaFormaPagoFactu();
      	}
		
	}	
	
	public void actualizarRelaciones(DetaFormaPagoFactu detaformapagofactuLocal) throws Exception {
		
		if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				detaformapagofactuLocal.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());
			
			} else {
			
				detaformapagofactuLocal.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetaFormaPagoFactu detaformapagofactuLocal) throws Exception {	
		if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detaformapagofactuLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				detaformapagofactuLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetaFormaPagoFactuActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detaformapagofactuValidator.getInvalidValues(this.detaformapagofactu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetaFormaPagoFactu detaformapagofactu,List<DetaFormaPagoFactu> detaformapagofactus) throws Exception {
		try	{		
			DetaFormaPagoFactuConstantesFunciones.actualizarLista(detaformapagofactu,detaformapagofactus,this.detaformapagofactuSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetaFormaPagoFactu detaformapagofactu,List<DetaFormaPagoFactu> detaformapagofactus) throws Exception {
		try	{			
			DetaFormaPagoFactuConstantesFunciones.actualizarSelectedLista(detaformapagofactu,detaformapagofactus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetaFormaPagoFactu> detaformapagofactusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detaformapagofactusLocal=this.detaformapagofactuLogic.getDetaFormaPagoFactus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detaformapagofactusLocal=this.detaformapagofactus;
			}
			//ARCHITECTURE
		
			for(DetaFormaPagoFactu detaformapagofactuLocal:detaformapagofactusLocal) {
				if(this.permiteMantenimiento(detaformapagofactuLocal) && detaformapagofactuLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetaFormaPagoFactuConstantesFunciones.getDetaFormaPagoFactuLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetaFormaPagoFactuConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelid_empresaDetaFormaPagoFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetaFormaPagoFactuConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelid_tipo_forma_pagoDetaFormaPagoFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetaFormaPagoFactuConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelnombreDetaFormaPagoFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetaFormaPagoFactuConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabeldescripcionDetaFormaPagoFactu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelid_empresaDetaFormaPagoFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelid_tipo_forma_pagoDetaFormaPagoFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelnombreDetaFormaPagoFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabeldescripcionDetaFormaPagoFactu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetaFormaPago")) {
			if(this.detaformapagofactu==null) {
				this.detaformapagofactu= new DetaFormaPagoFactu();
			}

			if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDetaFormaPagoFactu
				this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);

				this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.getdetaformapago().setDetaFormaPagoFactu(this.detaformapagofactu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDetaFormaPagoFactu--;	
		
		
		this.detaformapagofactuAux=new DetaFormaPagoFactu();
		
		this.detaformapagofactuAux.setId(this.iIdNuevoDetaFormaPagoFactu);
		this.detaformapagofactuAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detaformapagofactuLogic.getDetaFormaPagoFactus().add(this.detaformapagofactuAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detaformapagofactus.add(this.detaformapagofactuAux);
		}
		//ARCHITECTURE
		
		this.detaformapagofactu=this.detaformapagofactuAux;
		
		if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactu);
			this.setVariablesObjetoActualToFormularioForeignKeyDetaFormaPagoFactu(this.detaformapagofactu);
		}
				
		//this.setDefaultControlesDetaFormaPagoFactu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetaFormaPagoFactu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetaFormaPagoFactu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetaFormaPagoFactu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetaFormaPagoFactu(this.detaformapagofactuBean,this.detaformapagofactu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
			classes=DetaFormaPagoFactuConstantesFunciones.getClassesRelationshipsOfDetaFormaPagoFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detaformapagofactuReturnGeneral=detaformapagofactuLogic.procesarEventosDetaFormaPagoFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this.detaformapagofactu,this.detaformapagofactuParameterGeneral,this.isEsNuevoDetaFormaPagoFactu,classes);//this.detaformapagofactuLogic.getDetaFormaPagoFactu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral,this.detaformapagofactuBean,false);
		
		if(this.detaformapagofactuReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu());
		}
		
		if(this.detaformapagofactuReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu(),classes);//this.detaformapagofactuBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetaFormaPagoFactu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetaFormaPagoFactu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.RecargarFormDetaFormaPagoFactu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
						
			if(detaformapagofactuSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.getEsGuardarRelacionado() && DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaFormaPagoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetaFormaPagoFactu();
			}
			
			this.actualizarVisualTableDatosDetaFormaPagoFactu();
			
			this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(this.getIndiceNuevoDetaFormaPagoFactu(), this.getIndiceNuevoDetaFormaPagoFactu());
			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
						
			this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetaFormaPagoFactu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setEnabled(isHabilitar && this.detaformapagofactuConstantesFunciones.activarnombreDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setEnabled(isHabilitar && this.detaformapagofactuConstantesFunciones.activardescripcionDetaFormaPagoFactu);	
		//
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setEnabled(isHabilitar && this.detaformapagofactuConstantesFunciones.activarid_empresaDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setEnabled(isHabilitar && this.detaformapagofactuConstantesFunciones.activarid_tipo_forma_pagoDetaFormaPagoFactu);
	};
	
	public void setDefaultControlesDetaFormaPagoFactu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetaFormaPagoFactu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detaformapagofactuSessionBean.setConGuardarRelaciones(true);			
			this.detaformapagofactuSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.detaformapagofactuSessionBean.setConGuardarRelaciones(false);			
			this.detaformapagofactuSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoDetaFormaPagoFactu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				if(detaformapagofactuAux.getId().equals(this.iIdNuevoDetaFormaPagoFactu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactus) {
				if(detaformapagofactuAux.getId().equals(this.iIdNuevoDetaFormaPagoFactu)) {
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
	
	public int getIndiceActualDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				if(detaformapagofactuAux.getId().equals(detaformapagofactu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactus) {
				if(detaformapagofactuAux.getId().equals(detaformapagofactu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactuOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				if(detaformapagofactuAux.getDetaFormaPagoFactuOriginal().getId().equals(detaformapagofactuOriginal.getId())) {
					existe=true;
					detaformapagofactuOriginal.setId(detaformapagofactuAux.getId());
					detaformapagofactuOriginal.setVersionRow(detaformapagofactuAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactus) {
				if(detaformapagofactuAux.getDetaFormaPagoFactuOriginal().getId().equals(detaformapagofactuOriginal.getId())) {
					existe=true;
					detaformapagofactuOriginal.setId(detaformapagofactuAux.getId());
					detaformapagofactuOriginal.setVersionRow(detaformapagofactuAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetaFormaPagoFactu(Boolean esParaCancelar) throws Exception {
		detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
		detaformapagofactuAux=new DetaFormaPagoFactu();
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
					if(detaformapagofactuAux.getId()<0) {
						detaformapagofactusAux.add(detaformapagofactuAux);
					}		
				}
				this.iIdNuevoDetaFormaPagoFactu=0L;
				this.detaformapagofactuLogic.getDetaFormaPagoFactus().removeAll(detaformapagofactusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactus) {
					if(detaformapagofactuAux.getId()<0) {
						detaformapagofactusAux.add(detaformapagofactuAux);
					}		
				}
				this.iIdNuevoDetaFormaPagoFactu=0L;
				this.detaformapagofactus.removeAll(detaformapagofactusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetaFormaPagoFactu 
					&& this.detaformapagofactuLogic.getDetaFormaPagoFactus().size()>0
					) {
					detaformapagofactuAux=this.detaformapagofactuLogic.getDetaFormaPagoFactus().get(this.detaformapagofactuLogic.getDetaFormaPagoFactus().size() - 1);
				
					if(detaformapagofactuAux.getId()<0) {
						this.detaformapagofactuLogic.getDetaFormaPagoFactus().remove(detaformapagofactuAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetaFormaPagoFactu && this.detaformapagofactus.size()>0) {
					detaformapagofactuAux=this.detaformapagofactus.get(this.detaformapagofactus.size() - 1);
				
					if(detaformapagofactuAux.getId()<0) {
						this.detaformapagofactus.remove(detaformapagofactuAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetaFormaPagoFactu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detaformapagofactu.getId()<0) {
				this.detaformapagofactuLogic.getDetaFormaPagoFactus().remove(this.detaformapagofactu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detaformapagofactu.getId()<0) {
				this.detaformapagofactus.remove(this.detaformapagofactu);
			}
		}			
	}
	
	public void setEstadosInicialesDetaFormaPagoFactu(List<DetaFormaPagoFactu> detaformapagofactusAux) throws Exception {
		DetaFormaPagoFactuConstantesFunciones.setEstadosInicialesDetaFormaPagoFactu(detaformapagofactusAux);
	}
	
	public void setEstadosInicialesDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactuAux) throws Exception {
		DetaFormaPagoFactuConstantesFunciones.setEstadosInicialesDetaFormaPagoFactu(detaformapagofactuAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetaFormaPagoFactuActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetaFormaPagoFactuActual()) {
				if(!this.isEsNuevoDetaFormaPagoFactu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetaFormaPagoFactu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetaFormaPagoFactuActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Deta Forma Pago Factu ?", "MANTENIMIENTO DE Deta Forma Pago Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetaFormaPagoFactu detaformapagofactu) throws Exception {
		DetaFormaPagoFactuConstantesFunciones.seleccionarAsignar(this.detaformapagofactu,detaformapagofactu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetaFormaPagoFactu=this.isPermisoActualizarOriginalDetaFormaPagoFactu;
			
			
			this.seleccionarAsignar(detaformapagofactu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetaFormaPagoFactuConstantesFunciones.quitarEspaciosDetaFormaPagoFactu(this.detaformapagofactu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detaformapagofactuSessionBean.setsFuncionBusquedaRapida(this.detaformapagofactuSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetaFormaPagoFactu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetaFormaPagoFactu(esParaCancelar);				
				this.cancelarNuevoDetaFormaPagoFactu(esParaCancelar);								
			}
			
			this.detaformapagofactu=new DetaFormaPagoFactu();
			
			this.inicializarDetaFormaPagoFactu();
			
			this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetaFormaPagoFactu() throws Exception {
		try {
			DetaFormaPagoFactuConstantesFunciones.inicializarDetaFormaPagoFactu(this.detaformapagofactu);
			
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
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detaformapagofactuLogic.getDetaFormaPagoFactus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetaFormaPagoFactus(String sAccionBusqueda,List<DetaFormaPagoFactu> detaformapagofactusParaReportes) throws Exception {
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
					sPathReporteFinal="DetaFormaPagoFactu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetaFormaPagoFactuMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetaFormaPagoFactuMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetaFormaPagoFactu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Deta Forma Pago Factus");		
		parameters.put("busquedapor", DetaFormaPagoFactuConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetaFormaPago.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					DetaFormaPagoFactuLogic detaformapagofactuLogicAuxiliar=new DetaFormaPagoFactuLogic();
					detaformapagofactuLogicAuxiliar.setDatosCliente(detaformapagofactuLogic.getDatosCliente());				
					detaformapagofactuLogicAuxiliar.setDetaFormaPagoFactus(detaformapagofactusParaReportes);
					
					detaformapagofactuLogicAuxiliar.cargarRelacionesLoteForeignKeyDetaFormaPagoFactuWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					detaformapagofactusParaReportes=detaformapagofactuLogicAuxiliar.getDetaFormaPagoFactus();
					
					//detaformapagofactuLogic.getNewConnexionToDeep();
					
					//for (DetaFormaPagoFactu detaformapagofactu:detaformapagofactusParaReportes) {
					//	detaformapagofactuLogic.deepLoad(detaformapagofactu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//detaformapagofactuLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//detaformapagofactuLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetaFormaPago = AuxiliarReportes.class.getResourceAsStream("DetaFormaPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detaformapago", reportFileDetaFormaPago);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetaFormaPagoFactu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetaFormaPagoFactuConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetaFormaPagoFactuConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetaFormaPagoFactu=new JRBeanArrayDataSource(DetaFormaPagoFactuJInternalFrame.TraerDetaFormaPagoFactuBeans(detaformapagofactusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetaFormaPagoFactu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetaFormaPagoFactuConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetaFormaPagoFactuConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetaFormaPagoFactuBean.TraerDetaFormaPagoFactuBeans(detaformapagofactusParaReportes).toArray()));
							
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
				this.generarExcelReporteDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactuActionPerformed(null);
					//this.generarExcelReporteDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetaFormaPagoFactus(sAccionBusqueda,sTipoArchivoReporte,detaformapagofactusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetaFormaPagoFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<DetaFormaPagoFactu> detaformapagofactusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetaFormaPagoFactus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetaFormaPagoFactu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetaFormaPagoFactu detaformapagofactu : detaformapagofactusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetaFormaPagoFactuConstantesFunciones.generarExcelReporteDataDetaFormaPagoFactu("NORMAL",row,workbook,detaformapagofactu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetaFormaPagoFactu(String sTipo,Row row,Workbook workbook) {
		
		DetaFormaPagoFactuConstantesFunciones.generarExcelReporteHeaderDetaFormaPagoFactu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetaFormaPagoFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<DetaFormaPagoFactu> detaformapagofactusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetaFormaPagoFactus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetaFormaPagoFactu detaformapagofactu : detaformapagofactusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.getDetaFormaPagoFactuDescripcion(detaformapagofactu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detaformapagofactu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detaformapagofactu.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detaformapagofactu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detaformapagofactu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetaFormaPagoFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<DetaFormaPagoFactu> detaformapagofactusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetaFormaPagoFactu> detaformapagofactusRespaldo=null;
		
		classes=DetaFormaPagoFactuConstantesFunciones.getClassesRelationshipsOfDetaFormaPagoFactu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detaformapagofactuLogic.setDatosCliente(this.datosCliente);
		this.detaformapagofactuLogic.setDatosDeep(this.datosDeep);
		this.detaformapagofactuLogic.setIsConDeep(true);
		
		detaformapagofactusRespaldo=this.detaformapagofactuLogic.getDetaFormaPagoFactus();
		
		this.detaformapagofactuLogic.setDetaFormaPagoFactus(detaformapagofactusParaReportes);	
		this.detaformapagofactuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detaformapagofactusParaReportes=this.detaformapagofactuLogic.getDetaFormaPagoFactus();
		this.detaformapagofactuLogic.setDetaFormaPagoFactus(detaformapagofactusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetaFormaPagoFactus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetaFormaPagoFactu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetaFormaPagoFactu detaformapagofactu : detaformapagofactusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetaFormaPagoFactu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetaFormaPagoFactuConstantesFunciones.generarExcelReporteDataDetaFormaPagoFactu("NORMAL",row,workbook,detaformapagofactu,cellStyleDataAux);
		
			
			


				//DetaFormaPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(detaformapagofactu.getDetaFormaPagos()!=null && detaformapagofactu.getDetaFormaPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetaFormaPagoConstantesFunciones.generarExcelReporteHeaderDetaFormaPago("RELACIONADO",row,workbook);
				}

				if(detaformapagofactu.getDetaFormaPagos()!=null) {
					i2=0;
					for(DetaFormaPago detaformapago : detaformapagofactu.getDetaFormaPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetaFormaPagoConstantesFunciones.generarExcelReporteDataDetaFormaPago("RELACIONADO",row,workbook,detaformapago,cellStyleDataAuxHijo);
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
		cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.getDetaFormaPagoFactuDescripcion(detaformapagofactu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetaFormaPagoFactu() throws Exception {		
		this.startProcessDetaFormaPagoFactu(true);
	}
	
	public void startProcessDetaFormaPagoFactu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetaFormaPagoFactu ,this.jPanelParametrosReportesDetaFormaPagoFactu, this.jScrollPanelDatosDetaFormaPagoFactu,this.jPanelPaginacionDetaFormaPagoFactu, this.jScrollPanelDatosEdicionDetaFormaPagoFactu, this.jPanelAccionesDetaFormaPagoFactu,this.jPanelAccionesFormularioDetaFormaPagoFactu,this.jmenuBarDetaFormaPagoFactu,this.jmenuBarDetalleDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu);		
		
		final JTabbedPane jTabbedPaneBusquedasDetaFormaPagoFactu=this.jTabbedPaneBusquedasDetaFormaPagoFactu; 
		
		final JPanel jPanelParametrosReportesDetaFormaPagoFactu=this.jPanelParametrosReportesDetaFormaPagoFactu;
		//final JScrollPane jScrollPanelDatosDetaFormaPagoFactu=this.jScrollPanelDatosDetaFormaPagoFactu;
		final JTable jTableDatosDetaFormaPagoFactu=this.jTableDatosDetaFormaPagoFactu;		
		final JPanel jPanelPaginacionDetaFormaPagoFactu=this.jPanelPaginacionDetaFormaPagoFactu;
		//final JScrollPane jScrollPanelDatosEdicionDetaFormaPagoFactu=this.jScrollPanelDatosEdicionDetaFormaPagoFactu;
		final JPanel jPanelAccionesDetaFormaPagoFactu=this.jPanelAccionesDetaFormaPagoFactu;
		
		JPanel jPanelCamposAuxiliarDetaFormaPagoFactu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			jPanelCamposAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelCamposDetaFormaPagoFactu;
			jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelAccionesFormularioDetaFormaPagoFactu;
		}
		
		final JPanel jPanelCamposDetaFormaPagoFactu=jPanelCamposAuxiliarDetaFormaPagoFactu;
		final JPanel jPanelAccionesFormularioDetaFormaPagoFactu=jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu;
		
		
		final JMenuBar jmenuBarDetaFormaPagoFactu=this.jmenuBarDetaFormaPagoFactu;
		final JToolBar jTtoolBarDetaFormaPagoFactu=this.jTtoolBarDetaFormaPagoFactu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetaFormaPagoFactu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetaFormaPagoFactu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			jmenuBarDetalleAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jmenuBarDetalleDetaFormaPagoFactu;
			jTtoolBarDetalleAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTtoolBarDetalleDetaFormaPagoFactu;
		}
		
		final JMenuBar jmenuBarDetalleDetaFormaPagoFactu=jmenuBarDetalleAuxiliarDetaFormaPagoFactu;
		final JToolBar jTtoolBarDetalleDetaFormaPagoFactu=jTtoolBarDetalleAuxiliarDetaFormaPagoFactu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetaFormaPagoFactu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetaFormaPagoFactu;
			processRunnable.jTableDatos=jTableDatosDetaFormaPagoFactu;
			processRunnable.jPanelCampos=jPanelCamposDetaFormaPagoFactu;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetaFormaPagoFactu;
			processRunnable.jPanelAcciones=jPanelAccionesDetaFormaPagoFactu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetaFormaPagoFactu;
			
			
			processRunnable.jmenuBar=jmenuBarDetaFormaPagoFactu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetaFormaPagoFactu;
			processRunnable.jTtoolBar=jTtoolBarDetaFormaPagoFactu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetaFormaPagoFactu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetaFormaPagoFactu ,jPanelParametrosReportesDetaFormaPagoFactu,jTableDatosDetaFormaPagoFactu, /*jScrollPanelDatosDetaFormaPagoFactu,*/jPanelCamposDetaFormaPagoFactu,jPanelPaginacionDetaFormaPagoFactu, /*jScrollPanelDatosEdicionDetaFormaPagoFactu,*/ jPanelAccionesDetaFormaPagoFactu,jPanelAccionesFormularioDetaFormaPagoFactu,jmenuBarDetaFormaPagoFactu,jmenuBarDetalleDetaFormaPagoFactu,jTtoolBarDetaFormaPagoFactu,jTtoolBarDetalleDetaFormaPagoFactu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetaFormaPagoFactu ,jPanelParametrosReportesDetaFormaPagoFactu, jScrollPanelDatosDetaFormaPagoFactu,jPanelPaginacionDetaFormaPagoFactu, jScrollPanelDatosEdicionDetaFormaPagoFactu, jPanelAccionesDetaFormaPagoFactu,jPanelAccionesFormularioDetaFormaPagoFactu,jmenuBarDetaFormaPagoFactu,jmenuBarDetalleDetaFormaPagoFactu,jTtoolBarDetaFormaPagoFactu,jTtoolBarDetalleDetaFormaPagoFactu);
						
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
	
	public void finishProcessDetaFormaPagoFactu() {// throws Exception 
		this.finishProcessDetaFormaPagoFactu(true);
	}
	
	public void finishProcessDetaFormaPagoFactu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetaFormaPagoFactu ,this.jPanelParametrosReportesDetaFormaPagoFactu, this.jScrollPanelDatosDetaFormaPagoFactu,this.jPanelPaginacionDetaFormaPagoFactu, this.jScrollPanelDatosEdicionDetaFormaPagoFactu, this.jPanelAccionesDetaFormaPagoFactu,this.jPanelAccionesFormularioDetaFormaPagoFactu,this.jmenuBarDetaFormaPagoFactu,this.jmenuBarDetalleDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,this.jTtoolBarDetalleDetaFormaPagoFactu);		
		
		final JTabbedPane jTabbedPaneBusquedasDetaFormaPagoFactu=this.jTabbedPaneBusquedasDetaFormaPagoFactu; 
		
		final JPanel jPanelParametrosReportesDetaFormaPagoFactu=this.jPanelParametrosReportesDetaFormaPagoFactu;
		//final JScrollPane jScrollPanelDatosDetaFormaPagoFactu=this.jScrollPanelDatosDetaFormaPagoFactu;
		final JTable jTableDatosDetaFormaPagoFactu=this.jTableDatosDetaFormaPagoFactu;		
		final JPanel jPanelPaginacionDetaFormaPagoFactu=this.jPanelPaginacionDetaFormaPagoFactu;
		//final JScrollPane jScrollPanelDatosEdicionDetaFormaPagoFactu=this.jScrollPanelDatosEdicionDetaFormaPagoFactu;
		final JPanel jPanelAccionesDetaFormaPagoFactu=this.jPanelAccionesDetaFormaPagoFactu;
		
		JPanel jPanelCamposAuxiliarDetaFormaPagoFactu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			jPanelCamposAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelCamposDetaFormaPagoFactu;
			jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelAccionesFormularioDetaFormaPagoFactu;
		}
		
		final JPanel jPanelCamposDetaFormaPagoFactu=jPanelCamposAuxiliarDetaFormaPagoFactu;
		final JPanel jPanelAccionesFormularioDetaFormaPagoFactu=jPanelAccionesFormularioAuxiliarDetaFormaPagoFactu;
		
		
		final JMenuBar jmenuBarDetaFormaPagoFactu=this.jmenuBarDetaFormaPagoFactu;		
		final JToolBar jTtoolBarDetaFormaPagoFactu=this.jTtoolBarDetaFormaPagoFactu;
				
		JMenuBar jmenuBarDetalleAuxiliarDetaFormaPagoFactu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetaFormaPagoFactu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			jmenuBarDetalleAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jmenuBarDetalleDetaFormaPagoFactu;
			jTtoolBarDetalleAuxiliarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTtoolBarDetalleDetaFormaPagoFactu;		
		}
		
		final JMenuBar jmenuBarDetalleDetaFormaPagoFactu=jmenuBarDetalleAuxiliarDetaFormaPagoFactu;
		final JToolBar jTtoolBarDetalleDetaFormaPagoFactu=jTtoolBarDetalleAuxiliarDetaFormaPagoFactu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetaFormaPagoFactu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetaFormaPagoFactu;
			processRunnable.jTableDatos=jTableDatosDetaFormaPagoFactu;
			processRunnable.jPanelCampos=jPanelCamposDetaFormaPagoFactu;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetaFormaPagoFactu;
			processRunnable.jPanelAcciones=jPanelAccionesDetaFormaPagoFactu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetaFormaPagoFactu;
			
			
			processRunnable.jmenuBar=jmenuBarDetaFormaPagoFactu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetaFormaPagoFactu;
			processRunnable.jTtoolBar=jTtoolBarDetaFormaPagoFactu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetaFormaPagoFactu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetaFormaPagoFactu ,jPanelParametrosReportesDetaFormaPagoFactu, jTableDatosDetaFormaPagoFactu,/*jScrollPanelDatosDetaFormaPagoFactu,*/jPanelCamposDetaFormaPagoFactu,jPanelPaginacionDetaFormaPagoFactu, /*jScrollPanelDatosEdicionDetaFormaPagoFactu,*/ jPanelAccionesDetaFormaPagoFactu,jPanelAccionesFormularioDetaFormaPagoFactu,jmenuBarDetaFormaPagoFactu,jmenuBarDetalleDetaFormaPagoFactu,jTtoolBarDetaFormaPagoFactu,jTtoolBarDetalleDetaFormaPagoFactu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetaFormaPagoFactu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetaFormaPagoFactu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetaFormaPagoFactu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetaFormaPagoFactu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetaFormaPagoFactu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetaFormaPagoFactu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetaFormaPagoFactu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetaFormaPagoFactu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetaFormaPagoFactu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detaformapagofactuConstantesFunciones.getsFinalQueryDetaFormaPagoFactu();
		String  finalQueryPaginacionTodos=this.detaformapagofactuConstantesFunciones.getsFinalQueryDetaFormaPagoFactu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetaFormaPagoFactuConstantesFunciones.getArrayColumnasGlobalesNoDetaFormaPagoFactu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetaFormaPagoFactuConstantesFunciones.getArrayColumnasGlobalesDetaFormaPagoFactu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetaFormaPagoFactuConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detaformapagofactusEliminados= new ArrayList<DetaFormaPagoFactu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetaFormaPagoFactu();
		
				///*DetaFormaPagoFactuSessionBean*/this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
			
			if(this.detaformapagofactuSessionBean==null) {
				this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
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
					this.iNumeroPaginacion=DetaFormaPagoFactuConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetaFormaPagoFactuConstantesFunciones.getClassesForeignKeysOfDetaFormaPagoFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detaformapagofactu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detaformapagofactusAux= new ArrayList<DetaFormaPagoFactu>();
			
				
			detaformapagofactuLogic.setDatosCliente(this.datosCliente);
			detaformapagofactuLogic.setDatosDeep(this.datosDeep);
			detaformapagofactuLogic.setIsConDeep(true);
			
			
			detaformapagofactuLogic.getDetaFormaPagoFactuDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detaformapagofactuLogic.getTodosDetaFormaPagoFactus(finalQueryGlobal,pagination);
					
					//detaformapagofactuLogic.getTodosDetaFormaPagoFactusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detaformapagofactuLogic.getDetaFormaPagoFactus()==null|| detaformapagofactuLogic.getDetaFormaPagoFactus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detaformapagofactusAux= new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactusAux.addAll(detaformapagofactuLogic.getDetaFormaPagoFactus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactusAux= new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactusAux.addAll(detaformapagofactus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detaformapagofactuLogic.getTodosDetaFormaPagoFactus(finalQueryGlobal+"",this.pagination);												
							
							//detaformapagofactuLogic.getTodosDetaFormaPagoFactusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactuLogic.getDetaFormaPagoFactus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detaformapagofactuLogic.setDetaFormaPagoFactus(new ArrayList<DetaFormaPagoFactu>());					
							detaformapagofactuLogic.getDetaFormaPagoFactus().addAll(detaformapagofactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactus.addAll(detaformapagofactusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetaFormaPagoFactu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetaFormaPagoFactu=this.idActual;
				
				} else if(this.idDetaFormaPagoFactuActual!=null && this.idDetaFormaPagoFactuActual!=0L) {
					idDetaFormaPagoFactu=idDetaFormaPagoFactuActual;
				}
				
					
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndicePorId(idDetaFormaPagoFactu);
				
				this.detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detaformapagofactuLogic.getEntity(idDetaFormaPagoFactu);
					
					//detaformapagofactuLogic.getEntityWithConnection(idDetaFormaPagoFactu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagofactuLogic.setDetaFormaPagoFactus(new ArrayList<DetaFormaPagoFactu>());
					detaformapagofactuLogic.getDetaFormaPagoFactus().add(detaformapagofactuLogic.getDetaFormaPagoFactu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
					this.detaformapagofactus.add(detaformapagofactu);
				}
				
				if(detaformapagofactuLogic.getDetaFormaPagoFactu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detaformapagofactuLogic.getDetaFormaPagoFactusBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detaformapagofactuLogic.getDetaFormaPagoFactus()==null||detaformapagofactuLogic.getDetaFormaPagoFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detaformapagofactus==null|| detaformapagofactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
						detaformapagofactusAux.addAll(detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactusAux.addAll(detaformapagofactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detaformapagofactuLogic.getDetaFormaPagoFactusBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetaFormaPagoFactus("BusquedaPorNombre",detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetaFormaPagoFactus("BusquedaPorNombre",detaformapagofactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.setDetaFormaPagoFactus(new ArrayList<DetaFormaPagoFactu>());
						detaformapagofactuLogic.getDetaFormaPagoFactus().addAll(detaformapagofactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactus.addAll(detaformapagofactusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detaformapagofactuLogic.getDetaFormaPagoFactus()==null||detaformapagofactuLogic.getDetaFormaPagoFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detaformapagofactus==null|| detaformapagofactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
						detaformapagofactusAux.addAll(detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactusAux.addAll(detaformapagofactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetaFormaPagoFactus("FK_IdEmpresa",detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetaFormaPagoFactus("FK_IdEmpresa",detaformapagofactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.setDetaFormaPagoFactus(new ArrayList<DetaFormaPagoFactu>());
						detaformapagofactuLogic.getDetaFormaPagoFactus().addAll(detaformapagofactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactus.addAll(detaformapagofactusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detaformapagofactuLogic.getDetaFormaPagoFactus()==null||detaformapagofactuLogic.getDetaFormaPagoFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detaformapagofactus==null|| detaformapagofactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
						detaformapagofactusAux.addAll(detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactusAux=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactusAux.addAll(detaformapagofactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetaFormaPagoFactuConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetaFormaPagoFactus("FK_IdTipoFormaPago",detaformapagofactuLogic.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetaFormaPagoFactus("FK_IdTipoFormaPago",detaformapagofactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuLogic.setDetaFormaPagoFactus(new ArrayList<DetaFormaPagoFactu>());
						detaformapagofactuLogic.getDetaFormaPagoFactus().addAll(detaformapagofactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
							detaformapagofactus.addAll(detaformapagofactusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetaFormaPagoFactu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetaFormaPagoFactu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detaformapagofactuLogic.getDetaFormaPagoFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detaformapagofactus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detaformapagofactuLogic.getDetaFormaPagoFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detaformapagofactus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetaFormaPagoFactu detaformapagofactu) {
		Boolean permite=true;
		
		if(this.detaformapagofactu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetaFormaPagoFactuConstantesFunciones.getOrderByListaDetaFormaPagoFactu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetaFormaPagoFactuConstantesFunciones.getOrderByListaDetaFormaPagoFactu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				if(detaformapagofactu.getsType().equals(Constantes2.S_TOTALES)) {
					detaformapagofactuTotales=detaformapagofactu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetaFormaPagoFactu detaformapagofactu:this.detaformapagofactus) {
				if(detaformapagofactu.getsType().equals(Constantes2.S_TOTALES)) {
					detaformapagofactuTotales=detaformapagofactu;
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
			this.detaformapagofactuAux=new DetaFormaPagoFactu();
			this.detaformapagofactuAux.setsType(Constantes2.S_TOTALES);
			this.detaformapagofactuAux.setIsNew(false);
			this.detaformapagofactuAux.setIsChanged(false);
			this.detaformapagofactuAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetaFormaPagoFactuConstantesFunciones.TotalizarValoresFilaDetaFormaPagoFactu(this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this.detaformapagofactuAux);
				
				this.detaformapagofactuLogic.getDetaFormaPagoFactus().add(this.detaformapagofactuAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetaFormaPagoFactuConstantesFunciones.TotalizarValoresFilaDetaFormaPagoFactu(this.detaformapagofactus,this.detaformapagofactuAux);
				
				this.detaformapagofactus.add(this.detaformapagofactuAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detaformapagofactuTotales=new DetaFormaPagoFactu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detaformapagofactuLogic.getDetaFormaPagoFactus().remove(detaformapagofactuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detaformapagofactus.remove(detaformapagofactuTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detaformapagofactuTotales=new DetaFormaPagoFactu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				if(detaformapagofactu.getsType().equals(Constantes2.S_TOTALES)) {
					detaformapagofactuTotales=detaformapagofactu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetaFormaPagoFactuConstantesFunciones.TotalizarValoresFilaDetaFormaPagoFactu(this.detaformapagofactuLogic.getDetaFormaPagoFactus(),detaformapagofactuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetaFormaPagoFactu detaformapagofactu:this.detaformapagofactus) {
				if(detaformapagofactu.getsType().equals(Constantes2.S_TOTALES)) {
					detaformapagofactuTotales=detaformapagofactu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetaFormaPagoFactuConstantesFunciones.TotalizarValoresFilaDetaFormaPagoFactu(this.detaformapagofactus,detaformapagofactuTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetaFormaPagoFactusBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetaFormaPagoFactusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetaFormaPagoFactusFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetaFormaPagoFactusBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagofactuLogic.getDetaFormaPagoFactusBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetaFormaPagoFactusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetaFormaPagoFactusFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagofactuLogic.getDetaFormaPagoFactusFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
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
	
	public void inicializarPermisosDetaFormaPagoFactu() {
		this.isPermisoTodoDetaFormaPagoFactu=false;
		this.isPermisoNuevoDetaFormaPagoFactu=false;
		this.isPermisoActualizarDetaFormaPagoFactu=false;
		this.isPermisoActualizarOriginalDetaFormaPagoFactu=false;
		this.isPermisoEliminarDetaFormaPagoFactu=false;
		this.isPermisoGuardarCambiosDetaFormaPagoFactu=false;
		this.isPermisoConsultaDetaFormaPagoFactu=false;
		this.isPermisoBusquedaDetaFormaPagoFactu=false;
		this.isPermisoReporteDetaFormaPagoFactu=false;		
		this.isPermisoOrdenDetaFormaPagoFactu=false;		
		this.isPermisoPaginacionMedioDetaFormaPagoFactu=false;		
		this.isPermisoPaginacionAltoDetaFormaPagoFactu=false;
		this.isPermisoPaginacionTodoDetaFormaPagoFactu=false;
		this.isPermisoCopiarDetaFormaPagoFactu=false;		
		this.isPermisoVerFormDetaFormaPagoFactu=false;		
		this.isPermisoDuplicarDetaFormaPagoFactu=false;		
		this.isPermisoOrdenDetaFormaPagoFactu=false;		
	}
	
	public void setPermisosUsuarioDetaFormaPagoFactu(Boolean isPermiso) {
		this.isPermisoTodoDetaFormaPagoFactu=isPermiso;
		this.isPermisoNuevoDetaFormaPagoFactu=isPermiso;
		this.isPermisoActualizarDetaFormaPagoFactu=isPermiso;
		this.isPermisoActualizarOriginalDetaFormaPagoFactu=isPermiso;
		this.isPermisoEliminarDetaFormaPagoFactu=isPermiso;
		this.isPermisoGuardarCambiosDetaFormaPagoFactu=isPermiso;
		this.isPermisoConsultaDetaFormaPagoFactu=isPermiso;
		this.isPermisoBusquedaDetaFormaPagoFactu=isPermiso;
		this.isPermisoReporteDetaFormaPagoFactu=isPermiso;
		this.isPermisoOrdenDetaFormaPagoFactu=isPermiso;		
		this.isPermisoPaginacionMedioDetaFormaPagoFactu=isPermiso;		
		this.isPermisoPaginacionAltoDetaFormaPagoFactu=isPermiso;		
		this.isPermisoPaginacionTodoDetaFormaPagoFactu=isPermiso;		
		this.isPermisoCopiarDetaFormaPagoFactu=isPermiso;		
		this.isPermisoVerFormDetaFormaPagoFactu=isPermiso;		
		this.isPermisoDuplicarDetaFormaPagoFactu=isPermiso;
		this.isPermisoOrdenDetaFormaPagoFactu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetaFormaPagoFactu(Boolean isPermiso) {
		//this.isPermisoTodoDetaFormaPagoFactu=isPermiso;
		this.isPermisoNuevoDetaFormaPagoFactu=isPermiso;
		this.isPermisoActualizarDetaFormaPagoFactu=isPermiso;
		this.isPermisoActualizarOriginalDetaFormaPagoFactu=isPermiso;
		this.isPermisoEliminarDetaFormaPagoFactu=isPermiso;
		this.isPermisoGuardarCambiosDetaFormaPagoFactu=isPermiso;
		//this.isPermisoConsultaDetaFormaPagoFactu=isPermiso;
		//this.isPermisoBusquedaDetaFormaPagoFactu=isPermiso;
		//this.isPermisoReporteDetaFormaPagoFactu=isPermiso;
		//this.isPermisoOrdenDetaFormaPagoFactu=isPermiso;		
		//this.isPermisoPaginacionMedioDetaFormaPagoFactu=isPermiso;		
		//this.isPermisoPaginacionAltoDetaFormaPagoFactu=isPermiso;		
		//this.isPermisoPaginacionTodoDetaFormaPagoFactu=isPermiso;		
		//this.isPermisoCopiarDetaFormaPagoFactu=isPermiso;		
		//this.isPermisoDuplicarDetaFormaPagoFactu=isPermiso;
		//this.isPermisoOrdenDetaFormaPagoFactu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetaFormaPagoFactuClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetaFormaPagoConstantesFunciones.SNOMBREOPCION);
		
		if(DetaFormaPagoFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetaFormaPago=false;
		this.isTienePermisosDetaFormaPago=this.verificarGetPermisosUsuarioOpcionDetaFormaPagoFactuClaseRelacionada(this.opcionsRelacionadas,DetaFormaPagoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetaFormaPagoFactu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetaFormaPagoFactuClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetaFormaPago=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioDetaFormaPagoFactuClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetaFormaPagoFactuClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetaFormaPagoFactuClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetaFormaPago && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.remove(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioDetaFormaPagoFactu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetaFormaPagoFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetaFormaPagoFactuConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetaFormaPagoFactu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetaFormaPagoFactu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetaFormaPagoFactu=this.isPermisoActualizarDetaFormaPagoFactu;
			this.isPermisoEliminarDetaFormaPagoFactu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetaFormaPagoFactu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetaFormaPagoFactu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetaFormaPagoFactu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetaFormaPagoFactu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetaFormaPagoFactu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetaFormaPagoFactu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetaFormaPagoFactu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetaFormaPagoFactu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetaFormaPagoFactu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetaFormaPagoFactu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetaFormaPagoFactu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetaFormaPagoFactu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetaFormaPagoFactu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetaFormaPagoFactu.setToolTipText(this.jTableDatosDetaFormaPagoFactu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetaFormaPagoFactu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetaFormaPagoFactu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetaFormaPagoFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetaFormaPagoFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetaFormaPagoFactu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetaFormaPago && this.detaformapagofactuConstantesFunciones.mostrarDetaFormaPagoDetaFormaPagoFactu && !DetaFormaPagoFactuConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Deta Forma Pago");
			reporte.setsDescripcion("Deta Forma Pago");
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
	public void inicializarCombosForeignKeyDetaFormaPagoFactuListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetaFormaPagoFactuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetaFormaPagoFactuJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetaFormaPagoFactuListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetaFormaPagoFactuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuReturnGeneral=new DetaFormaPagoFactuParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detaformapagofactuConstantesFunciones.cargarid_empresaDetaFormaPagoFactu)
					 || (this.esRecargarFks && this.detaformapagofactuConstantesFunciones.cargarid_empresaDetaFormaPagoFactu)) {

					if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detaformapagofactuSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.detaformapagofactuConstantesFunciones.cargarid_tipo_forma_pagoDetaFormaPagoFactu)
					 || (this.esRecargarFks && this.detaformapagofactuConstantesFunciones.cargarid_tipo_forma_pagoDetaFormaPagoFactu)) {

					if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+detaformapagofactuSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detaformapagofactuReturnGeneral=detaformapagofactuLogic.cargarCombosLoteForeignKeyDetaFormaPagoFactu(finalQueryGlobalEmpresa,finalQueryGlobalTipoFormaPago);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detaformapagofactuReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=detaformapagofactuReturnGeneral.gettipoformapagosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetaFormaPagoFactu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detaformapagofactuSessionBean==null) {
				this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
			}

			if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.detaformapagofactuSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				TipoFormaPago tipoformapago=new TipoFormaPago();
				TipoFormaPagoConstantesFunciones.setTipoFormaPagoDescripcion(tipoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformapago.setId(null);

				if(!TipoFormaPagoConstantesFunciones.ExisteEnLista(this.tipoformapagosForeignKey,tipoformapago,true)) {

					this.tipoformapagosForeignKey.add(0,tipoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetaFormaPagoFactu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetaFormaPagoFactu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetaFormaPagoFactu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetaFormaPagoFactu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu)throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(detaformapagofactu.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetaFormaPagoFactu()throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(this.detaformapagofactuConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetaFormaPagoFactu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetaFormaPagoFactu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetaFormaPagoFactu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetaFormaPagoFactu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetaFormaPagoFactu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetaFormaPagoFactu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetaFormaPagoFactu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public DetaFormaPagoFactuBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetaFormaPagoFactuBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetaFormaPagoFactuBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean(); 
		this.detaformapagofactuConstantesFunciones=new DetaFormaPagoFactuConstantesFunciones(); 
		this.detaformapagofactuBean=new DetaFormaPagoFactu();//(this.detaformapagofactuConstantesFunciones); 		
		this.detaformapagofactuReturnGeneral=new DetaFormaPagoFactuParameterReturnGeneral(); 
		
		this.detaformapagofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detaformapagofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetaFormaPagoFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetaFormaPagoFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetaFormaPagoFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetaFormaPagoFactu(true);
			
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
			
			this.detaformapagofactuConstantesFunciones=new DetaFormaPagoFactuConstantesFunciones(); 
			this.detaformapagofactuBean=new DetaFormaPagoFactu();//this.detaformapagofactuConstantesFunciones); 			
			this.detaformapagofactuReturnGeneral=new DetaFormaPagoFactuParameterReturnGeneral(); 
		
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deta Forma Pago Factu Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detaformapagofactu=new DetaFormaPagoFactu();
			this.detaformapagofactus = new ArrayList<DetaFormaPagoFactu>();
			this.detaformapagofactusAux = new ArrayList<DetaFormaPagoFactu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic=new DetaFormaPagoFactuLogic();
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			//this.detaformapagofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detaformapagofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetaFormaPagoFactu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetaFormaPagoFactu);	
					}
					
					if(this.jInternalFrameImportacionDetaFormaPagoFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetaFormaPagoFactu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetaFormaPagoFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetaFormaPagoFactu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetaFormaPagoFactu);
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.setVisible(false);
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu);
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setVisible(false);
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetaFormaPagoFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetaFormaPagoFactu);
					this.jInternalFrameImportacionDetaFormaPagoFactu.setVisible(false);
					this.jInternalFrameImportacionDetaFormaPagoFactu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetaFormaPagoFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetaFormaPagoFactu);
					this.jInternalFrameOrderByDetaFormaPagoFactu.setVisible(false);
					this.jInternalFrameOrderByDetaFormaPagoFactu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetaFormaPagoFactuActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetaFormaPagoFactuConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detaformapagofactuReturnGeneral=new DetaFormaPagoFactuParameterReturnGeneral();
			
			this.detaformapagofactuParameterGeneral=new DetaFormaPagoFactuParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detaformapagofactuLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetaFormaPagoFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetaFormaPagoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetaFormaPagoFactuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detaformapagofactuSessionBean.getEsGuardarRelacionado(),this.detaformapagofactuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetaFormaPagoFactuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detaformapagofactuSessionBean.getEsGuardarRelacionado(),this.detaformapagofactuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaCopiarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaVerFormDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaOrdenDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetaFormaPagoFactu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetaFormaPagoFactu(false);
			
			this.setPermisosUsuarioDetaFormaPagoFactu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado() 
				|| (this.detaformapagofactuSessionBean.getEsGuardarRelacionado() && this.detaformapagofactuSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetaFormaPagoFactuClasesRelacionadas();
			}
			
			if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetaFormaPagoFactuClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetaFormaPagoFactu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetaFormaPagoFactu();
			}
			
			if(!this.isPermisoBusquedaDetaFormaPagoFactu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetaFormaPagoFactu,this.isPermisoPaginacionMedioDetaFormaPagoFactu,this.isPermisoPaginacionTodoDetaFormaPagoFactu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetaFormaPagoFactuConstantesFunciones.getTiposSeleccionarDetaFormaPagoFactu());
				
				this.tiposColumnasSelect=DetaFormaPagoFactuConstantesFunciones.getTiposSeleccionarDetaFormaPagoFactu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectDetaFormaPagoFactu();				
				//this.tiposRelacionesSelect=DetaFormaPagoFactuConstantesFunciones.getTiposRelacionesDetaFormaPagoFactu(true);
				
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
			//if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetaFormaPagoFactu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetaFormaPagoFactu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetaFormaPagoFactu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetaFormaPagoFactu() ;
			
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
			
			
			this.detaformapagoLogic=new DetaFormaPagoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detaformapagofactuImplementable= (DetaFormaPagoFactuImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetaFormaPagoFactuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detaformapagofactuImplementableHome= (DetaFormaPagoFactuImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetaFormaPagoFactuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detaformapagofactus= new ArrayList<DetaFormaPagoFactu>();
			this.detaformapagofactusEliminados= new ArrayList<DetaFormaPagoFactu>();
						
			this.isEsNuevoDetaFormaPagoFactu=false;
			this.esParaAccionDesdeFormularioDetaFormaPagoFactu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetaFormaPagoFactu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetaFormaPagoFactu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetaFormaPagoFactuConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetaFormaPagoFactu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetaFormaPagoFactu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetaFormaPagoFactu();
			}
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetaFormaPagoFactu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetaFormaPagoFactu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetaFormaPagoFactu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetaFormaPagoFactu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetaFormaPagoFactu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetaFormaPagoFactu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetaFormaPagoFactu")) {
				iIndex=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	
				
				

				if(sTitle.equals("Deta Forma Pagos")) {
					if(!DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDetaFormaPagoFactu();

						this.cargarParteTabPanelRelacionadaDetaFormaPago(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetaFormaPagoFactu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetaFormaPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(false,true,iIndex);
		this.jButtonDetaFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetaFormaPago();

		//this.jTabbedPaneRelacionesDetaFormaPagoFactu.updateUI();
		//this.jTabbedPaneRelacionesDetaFormaPagoFactu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDetaFormaPagoFactu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetaFormaPago")) {
				int row=this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
				jButtonDetaFormaPagoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Deta Forma Pago")) {

					if(this.isTienePermisosDetaFormaPago && this.detaformapagofactuConstantesFunciones.mostrarDetaFormaPagoDetaFormaPagoFactu && !DetaFormaPagoFactuConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Deta Forma Pagos"+"("+DetaFormaPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Deta Forma Pagos");

						if(detaformapagofactuConstantesFunciones.resaltarDetaFormaPagoDetaFormaPagoFactu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(detaformapagofactuConstantesFunciones.resaltarDetaFormaPagoDetaFormaPagoFactu);
						}

						jmenuItem.setEnabled(this.detaformapagofactuConstantesFunciones.activarDetaFormaPagoDetaFormaPagoFactu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetaFormaPago"));

						

						this.jInternalFrameDetalleFormDetaFormaPagoFactu.jmenuDetalleDetaFormaPagoFactu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyDetaFormaPagoFactu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetaFormaPagoFactu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetaFormaPagoFactu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetaFormaPagoFactuListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetaFormaPagoFactu();
		
		this.cargarCombosFrameForeignKeyDetaFormaPagoFactu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetaFormaPagoFactu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetaFormaPagoFactu();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormaPago(this.tipoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetaFormaPagoFactuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			
			if(jTableDatosDetaFormaPagoFactu.getRowCount()>=1) {
				jTableDatosDetaFormaPagoFactu.removeRowSelectionInterval(0, jTableDatosDetaFormaPagoFactu.getRowCount()-1);						
			}
			
			this.isEsNuevoDetaFormaPagoFactu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetaFormaPagoFactu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetaFormaPagoFactu(true);			
			//this.detaformapagofactu=new DetaFormaPagoFactu();
			//this.detaformapagofactu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu() ;
			
			if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetaFormaPagoFactu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detaformapagofactu);	
			this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);				
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetaFormaPagoFactu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetaFormaPagoFactuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetaFormaPagoFactu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetaFormaPagoFactu.getSelectedRows().length;			
			}
			
			detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetaFormaPagoFactu--;			
				//DetaFormaPagoFactu detaformapagofactuAux= new DetaFormaPagoFactu();			
				//detaformapagofactuAux.setId(this.iIdNuevoDetaFormaPagoFactu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetaFormaPagoFactu detaformapagofactuOrigen=new DetaFormaPagoFactu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetaFormaPagoFactu detaformapagofactuOrigen : detaformapagofactusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detaformapagofactuOrigen =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detaformapagofactuOrigen =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetaFormaPagoFactu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detaformapagofactu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetaFormaPagoFactu(detaformapagofactuOrigen,this.detaformapagofactu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detaformapagofactuLogic.getDetaFormaPagoFactus().add(this.detaformapagofactuAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detaformapagofactus.add(this.detaformapagofactuAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
				
				this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(this.getIndiceNuevoDetaFormaPagoFactu(), this.getIndiceNuevoDetaFormaPagoFactu());
				
				int iLastRow =  this.jTableDatosDetaFormaPagoFactu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetaFormaPagoFactu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetaFormaPagoFactu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();									
		
			DetaFormaPagoFactu detaformapagofactuOrigen=new DetaFormaPagoFactu();
			DetaFormaPagoFactu detaformapagofactuDestino=new DetaFormaPagoFactu();
				
			detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetaFormaPagoFactu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detaformapagofactusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetaFormaPagoFactu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuOrigen =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detaformapagofactuOrigen =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detaformapagofactuDestino =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detaformapagofactuDestino =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detaformapagofactuOrigen =detaformapagofactusSeleccionados.get(0);
				detaformapagofactuDestino =detaformapagofactusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetaFormaPagoFactu(detaformapagofactuOrigen,detaformapagofactuDestino,true,false);
				
				detaformapagofactuDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detaformapagofactuDestino,detaformapagofactuLogic.getDetaFormaPagoFactus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detaformapagofactuDestino,detaformapagofactus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
				
				//this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(this.getIndiceNuevoDetaFormaPagoFactu(), this.getIndiceNuevoDetaFormaPagoFactu());
				
				int iLastRow =  this.jTableDatosDetaFormaPagoFactu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetaFormaPagoFactu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetaFormaPagoFactu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetaFormaPagoFactu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(!isVisible);
			this.jPanelPaginacionDetaFormaPagoFactu.setVisible(!isVisible);
			this.jPanelAccionesDetaFormaPagoFactu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetaFormaPagoFactu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetaFormaPagoFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetaFormaPagoFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetaFormaPagoFactu();
			
			this.abrirFrameOrderByDetaFormaPagoFactu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetaFormaPagoFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetaFormaPagoFactu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetaFormaPagoFactu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.isMaximum()) {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSize(this.jInternalFrameDetalleFormDetaFormaPagoFactu.iWidthFormulario,this.jInternalFrameDetalleFormDetaFormaPagoFactu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetaFormaPagoFactu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetaFormaPagoFactu.isMaximum()) {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jContentPaneDetalleDetaFormaPagoFactu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jContentPaneDetalleDetaFormaPagoFactu.getWidth(),DetaFormaPagoFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jContentPaneDetalleDetaFormaPagoFactu.getWidth(),DetaFormaPagoFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jContentPaneDetalleDetaFormaPagoFactu.getWidth(),DetaFormaPagoFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetaFormaPago();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetaFormaPagoFactu.setVisible(true);
	        this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetaFormaPagoFactu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetaFormaPagoFactu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetaFormaPagoFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPagoFactu,false,this);
				} else {
					this.jInternalFrameOrderByDetaFormaPagoFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPagoFactu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetaFormaPagoFactu);
				this.jInternalFrameOrderByDetaFormaPagoFactu.setVisible(false);
				this.jInternalFrameOrderByDetaFormaPagoFactu.setSelected(false);
				
				this.jInternalFrameOrderByDetaFormaPagoFactu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetaFormaPagoFactu"));
				
				this.inicializarActualizarBindingTablaOrderByDetaFormaPagoFactu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetaFormaPagoFactu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetaFormaPagoFactu==null) {
				
				this.jInternalFrameImportacionDetaFormaPagoFactu=new ImportacionJInternalFrame(DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetaFormaPagoFactu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetaFormaPagoFactu);
				this.jInternalFrameImportacionDetaFormaPagoFactu.setVisible(false);
				this.jInternalFrameImportacionDetaFormaPagoFactu.setSelected(false);


				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetaFormaPagoFactu"));
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetaFormaPagoFactu"));
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetaFormaPagoFactu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetaFormaPagoFactu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu==null) {
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu=new ReporteDinamicoJInternalFrame(DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetaFormaPagoFactu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu);
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setVisible(false);
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetaFormaPagoFactu"));
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetaFormaPagoFactu"));
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetaFormaPagoFactu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetaFormaPagoFactu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetaFormaPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jContentPaneDetalleDetaFormaPagoFactu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleDetaFormaPagoFactu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetaFormaPagoFactu);
			
	       	this.jInternalFrameDetalleFormDetaFormaPagoFactu.setVisible(false);
	        this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetaFormaPagoFactu.dispose();
			//this.jInternalFrameDetalleFormDetaFormaPagoFactu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetaFormaPagoFactu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetaFormaPagoFactu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetaFormaPagoFactu.setVisible(true);
	        this.jInternalFrameImportacionDetaFormaPagoFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetaFormaPagoFactu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetaFormaPagoFactu.setVisible(true);
	        this.jInternalFrameOrderByDetaFormaPagoFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetaFormaPagoFactu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetaFormaPagoFactu.setVisible(false);
	        this.jInternalFrameOrderByDetaFormaPagoFactu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetaFormaPagoFactu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetaFormaPagoFactu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetaFormaPagoFactu.setVisible(false);
	        this.jInternalFrameImportacionDetaFormaPagoFactu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetaFormaPagoFactu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetaFormaPagoFactu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetaFormaPagoFactu(true);
			//this.isEsNuevoDetaFormaPagoFactu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false) ;
			
			if(detaformapagofactuSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.getEsGuardarRelacionado() && DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetaFormaPagoFactu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetaFormaPagoFactuActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetaFormaPagoFactu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetaFormaPagoFactu(true);
			//this.isEsNuevoDetaFormaPagoFactu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detaformapagofactu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false) ;
			
			if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetaFormaPagoFactu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetaFormaPagoFactu(false);
			
			//if(!this.isEsNuevoDetaFormaPagoFactu) {								
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				
			}
			
			if(this.permiteMantenimiento(this.detaformapagofactu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetaFormaPagoFactu=true;
					this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
					this.isEsNuevoDetaFormaPagoFactu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetaFormaPagoFactu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetaFormaPagoFactu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(false);
				
				this.habilitarDeshabilitarControlesDetaFormaPagoFactu(false);
			
												
				
				if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetaFormaPagoFactu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,detaformapagofactuSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetaFormaPagoFactu(this.detaformapagofactu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detaformapagofactuSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detaformapagofactu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				this.detaformapagofactu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				this.detaformapagofactu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detaformapagofactu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetaFormaPagoFactuModel) this.jTableDatosDetaFormaPagoFactu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetaFormaPagoFactu=true;
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
				this.isEsNuevoDetaFormaPagoFactu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(false);
				
				this.habilitarDeshabilitarControlesDetaFormaPagoFactu(false);
				
				
				
				if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetaFormaPagoFactu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetaFormaPagoFactu.getRowCount()>=1) {
				jTableDatosDetaFormaPagoFactu.removeRowSelectionInterval(0, jTableDatosDetaFormaPagoFactu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetaFormaPagoFactu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(false) ;
			
			this.isEsNuevoDetaFormaPagoFactu=false;
			
			if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetaFormaPagoFactu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				
				//SI ES MANUAL
				if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetaFormaPagoFactu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetaFormaPagoFactu--;			
			//DetaFormaPagoFactu detaformapagofactuAux= new DetaFormaPagoFactu();			
			//detaformapagofactuAux.setId(this.iIdNuevoDetaFormaPagoFactu);
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetaFormaPagoFactu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
			
			this.detaformapagofactu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detaformapagofactuLogic.getDetaFormaPagoFactus().add(this.detaformapagofactuAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detaformapagofactus.add(this.detaformapagofactuAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			
			this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(this.getIndiceNuevoDetaFormaPagoFactu(), this.getIndiceNuevoDetaFormaPagoFactu());
			
			int iLastRow =  this.jTableDatosDetaFormaPagoFactu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetaFormaPagoFactu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetaFormaPagoFactu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
			
			//SI ES MANUAL
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetaFormaPagoFactu();
			}
			
			//this.abrirFrameTreeDetaFormaPagoFactu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Deta Forma Pago FactuS ?", "MANTENIMIENTO DE Deta Forma Pago Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetaFormaPagoFactu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetaFormaPagoFactu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detaformapagofactuReturnGeneral=detaformapagofactuLogic.procesarImportacionDetaFormaPagoFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detaformapagofactuParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetaFormaPagoFactuReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetaFormaPagoFactu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetaFormaPagoFactu.setFileImportacion(this.jInternalFrameImportacionDetaFormaPagoFactu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetaFormaPagoFactu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetaFormaPagoFactu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		

		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetaFormaPagoFactuBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetaFormaPagoFactuBaseDesign.jrxml";
			
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
			
			this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetaFormaPagoFactus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detaformapagofactu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detaformapagofactu.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detaformapagofactu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detaformapagofactu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetaFormaPagoFactu(row);				
			//	iRow++;
			//}				
			
			//for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetaFormaPagoFactu(detaformapagofactuAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
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
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
			
			//SI ES MANUAL
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetaFormaPagoFactu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
			
			//SI ES MANUAL
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetaFormaPagoFactu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
			
			//SI ES MANUAL
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetaFormaPagoFactu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetaFormaPagoFactu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetaFormaPagoFactu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetaFormaPagoFactu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetaFormaPagoFactu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetaFormaPagoFactu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetaFormaPagoFactu.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetaFormaPagoFactu.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetaFormaPagoFactu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetaFormaPagoFactu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetaFormaPagoFactu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetaFormaPagoFactu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetaFormaPagoFactu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetaFormaPagoFactu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetaFormaPagoFactu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetaFormaPagoFactu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetaFormaPagoFactu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetaFormaPagoFactu();
		
		this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetaFormaPagoFactu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetaFormaPagoFactu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetaFormaPagoFactu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetaFormaPagoFactu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetaFormaPagoFactu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionNuevoDetaFormaPagoFactu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionNuevoDetaFormaPagoFactu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionSinCerrarDetaFormaPagoFactu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jCheckBoxPostAccionSinMensajeDetaFormaPagoFactu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetaFormaPagoFactu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetaFormaPagoFactu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetaFormaPagoFactu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetaFormaPagoFactu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetaFormaPagoFactu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetaFormaPagoFactu(Boolean esInicializar) throws Exception {
		try	{	
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetaFormaPagoFactu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetaFormaPagoFactu() throws Exception {
		try	{
			if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetaFormaPagoFactu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetaFormaPagoFactu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetaFormaPagoFactu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetaFormaPagoFactu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetaFormaPagoFactu.addItem(reporte);
			}
			
			
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetaFormaPagoFactu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetaFormaPagoFactu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetaFormaPagoFactu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetaFormaPagoFactu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetaFormaPagoFactu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu.getText();
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetaFormaPagoFactu(Boolean esInicializar) throws Exception {				
		if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetaFormaPagoFactu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetaFormaPagoFactu() throws Exception {
		this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetaFormaPagoFactu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetaFormaPagoFactuOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactuOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetaFormaPagoFactu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detaformapagofactuLogic.getDetaFormaPagoFactus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detaformapagofactus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetaFormaPagoFactu.setModel(new DetaFormaPagoFactuModel(this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetaFormaPagoFactu.setModel(new DetaFormaPagoFactuModel(this.detaformapagofactus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetaFormaPagoFactu!=null && this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetaFormaPagoFactu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,detaformapagofactuConstantesFunciones.resaltarSeleccionarDetaFormaPagoFactu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,detaformapagofactuConstantesFunciones.resaltarSeleccionarDetaFormaPagoFactu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_ID));

		if(this.detaformapagofactuConstantesFunciones.mostraridDetaFormaPagoFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetaFormaPagoFactuConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detaformapagofactuConstantesFunciones.resaltaridDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activaridDetaFormaPagoFactu,this,true,"idDetaFormaPagoFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detaformapagofactuConstantesFunciones.resaltaridDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activaridDetaFormaPagoFactu,this,true,"idDetaFormaPagoFactu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detaformapagofactuConstantesFunciones.mostrarid_empresaDetaFormaPagoFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detaformapagofactuConstantesFunciones.resaltarid_empresaDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarid_empresaDetaFormaPagoFactu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detaformapagofactuConstantesFunciones.resaltarid_empresaDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarid_empresaDetaFormaPagoFactu,false,"id_empresaDetaFormaPagoFactu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.detaformapagofactuConstantesFunciones.mostrarid_tipo_forma_pagoDetaFormaPagoFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.detaformapagofactuConstantesFunciones.resaltarid_tipo_forma_pagoDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarid_tipo_forma_pagoDetaFormaPagoFactu));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.detaformapagofactuConstantesFunciones.resaltarid_tipo_forma_pagoDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarid_tipo_forma_pagoDetaFormaPagoFactu,true,"id_tipo_forma_pagoDetaFormaPagoFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE));

		if(this.detaformapagofactuConstantesFunciones.mostrarnombreDetaFormaPagoFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detaformapagofactuConstantesFunciones.resaltarnombreDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activarnombreDetaFormaPagoFactu,this,true,"nombreDetaFormaPagoFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detaformapagofactuConstantesFunciones.resaltarnombreDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activarnombreDetaFormaPagoFactu,this,true,"nombreDetaFormaPagoFactu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detaformapagofactuConstantesFunciones.mostrardescripcionDetaFormaPagoFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detaformapagofactuConstantesFunciones.resaltardescripcionDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activardescripcionDetaFormaPagoFactu,this,true,"descripcionDetaFormaPagoFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detaformapagofactuConstantesFunciones.resaltardescripcionDetaFormaPagoFactu,this.detaformapagofactuConstantesFunciones.activardescripcionDetaFormaPagoFactu,this,true,"descripcionDetaFormaPagoFactu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetaFormaPagoFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetaFormaPago && this.detaformapagofactuConstantesFunciones.mostrarDetaFormaPagoDetaFormaPagoFactu && !DetaFormaPagoFactuConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Deta Forma Pagos");
				tableColumn.setHeaderValue("Deta Forma Pagos");
				tableColumn.setCellRenderer(new DetaFormaPagoTableCell(detaformapagofactuConstantesFunciones.resaltarDetaFormaPagoDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarDetaFormaPagoDetaFormaPagoFactu));
				tableColumn.setCellEditor(new DetaFormaPagoTableCell(detaformapagofactuConstantesFunciones.resaltarDetaFormaPagoDetaFormaPagoFactu,this,this.detaformapagofactuConstantesFunciones.activarDetaFormaPagoDetaFormaPagoFactu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detaformapagofactuSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);
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
			
			this.jTableDatosDetaFormaPagoFactu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetaFormaPagoFactu.moveColumn(this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetaFormaPagoFactu.moveColumn(this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosDetaFormaPagoFactu.moveColumn(this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetaFormaPagoFactu.moveColumn(this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetaFormaPagoFactu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetaFormaPagoFactu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetaFormaPagoFactu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetaFormaPagoFactu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetaFormaPagoFactu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetaFormaPagoFactu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detaformapagofactuLogic.getDetaFormaPagoFactus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detaformapagofactus.size()-1;
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
		//this.jTableDatosDetaFormaPagoFactu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetaFormaPagoFactu();
			
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
				
				//this.isEsNuevoDetaFormaPagoFactu=false;
					
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
				if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetaFormaPagoFactu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detaformapagofactu.getsType().equals("DUPLICADO")
				   || this.detaformapagofactu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetaFormaPagoFactu=true;
				
				} else {
					this.isEsNuevoDetaFormaPagoFactu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					if(this.detaformapagofactu.getId()>=0 && !this.detaformapagofactu.getIsNew()) {						
						this.isEsNuevoDetaFormaPagoFactu=false;
						
					} else {
						this.isEsNuevoDetaFormaPagoFactu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetaFormaPagoFactu(esRelaciones);						
				
				this.seleccionarDetaFormaPagoFactu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detaformapagofactu.getId()<0) {
					this.isEsNuevoDetaFormaPagoFactu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetaFormaPagoFactu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetaFormaPagoFactu(evt,rowIndex);
				}	
				
				if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetaFormaPagoFactu: " + this.dDif); 
					}
				}								
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetaFormaPagoFactu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detaformapagofactu)) {
					if(this.detaformapagofactu.getId()>0) {
						this.detaformapagofactu.setIsDeleted(true);
						
						this.detaformapagofactusEliminados.add(this.detaformapagofactu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detaformapagofactuLogic.getDetaFormaPagoFactus().remove(this.detaformapagofactu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detaformapagofactus.remove(this.detaformapagofactu);				
					}
					
					
					((DetaFormaPagoFactuModel) this.jTableDatosDetaFormaPagoFactu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetaFormaPagoFactu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetaFormaPagoFactu) {
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetaFormaPagoFactu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetaFormaPagoFactu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detaformapagofactuConstantesFunciones.cargarid_empresaDetaFormaPagoFactu || this.detaformapagofactuConstantesFunciones.event_dependid_empresaDetaFormaPagoFactu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detaformapagofactu.getid_empresa());
									//this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detaformapagofactu.getEmpresa()!=null) {
							this.empresasForeignKey.add(detaformapagofactu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detaformapagofactu.getid_empresa(),false,"Formulario");

					//TipoFormaPago
					if(!this.detaformapagofactuConstantesFunciones.cargarid_tipo_forma_pagoDetaFormaPagoFactu || this.detaformapagofactuConstantesFunciones.event_dependid_tipo_forma_pagoDetaFormaPagoFactu) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.detaformapagofactu.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(detaformapagofactu.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(detaformapagofactu.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.detaformapagofactu.getid_tipo_forma_pago(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetaFormaPagoFactu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetaFormaPagoFactu(detaformapagofactu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetaFormaPagoFactu(detaformapagofactu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetaFormaPagoFactu(detaformapagofactu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetaFormaPagoFactu(detaformapagofactu);
	}
	
	public void setVariablesObjetoActualToFormularioDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setText(detaformapagofactu.getId().toString());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setText(detaformapagofactu.getnombre());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setText(detaformapagofactu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetaFormaPagoFactu detaformapagofactuLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detaformapagofactuLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetaFormaPagoFactu detaformapagofactuLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detaformapagofactuLocal=this.detaformapagofactu;
			} else {
				detaformapagofactuLocal=this.detaformapagofactuAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detaformapagofactuLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetaFormaPagoFactu(detaformapagofactuLocal,true);
					
					if(detaformapagofactuSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detaformapagofactuLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detaformapagofactuLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(detaformapagofactu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(detaformapagofactu);
	}
	
	public void setVariablesFormularioToObjetoActualDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(detaformapagofactu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.getText()==null || this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.getText()=="" || this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.getText()=="Id") {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setText("0");
			}

			if(conColumnasBase) {detaformapagofactu.setId(Long.parseLong(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetaFormaPagoFactuConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelIdDetaFormaPagoFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detaformapagofactu.setnombre(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelnombreDetaFormaPagoFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detaformapagofactu.setdescripcion(this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabeldescripcionDetaFormaPagoFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactuBean,DetaFormaPagoFactu detaformapagofactu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detaformapagofactuBean.getid_tipo_forma_pago()!=null && !detaformapagofactuBean.getid_tipo_forma_pago().equals(-1L))) {detaformapagofactu.setid_tipo_forma_pago(detaformapagofactuBean.getid_tipo_forma_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactuOrigen,DetaFormaPagoFactu detaformapagofactu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detaformapagofactuOrigen.getId()!=null && !detaformapagofactuOrigen.getId().equals(0L))) {detaformapagofactu.setId(detaformapagofactuOrigen.getId());}}
			if(conDefault || (!conDefault && detaformapagofactuOrigen.getid_tipo_forma_pago()!=null && !detaformapagofactuOrigen.getid_tipo_forma_pago().equals(-1L))) {detaformapagofactu.setid_tipo_forma_pago(detaformapagofactuOrigen.getid_tipo_forma_pago());}
			if(conDefault || (!conDefault && detaformapagofactuOrigen.getnombre()!=null && !detaformapagofactuOrigen.getnombre().equals(""))) {detaformapagofactu.setnombre(detaformapagofactuOrigen.getnombre());}
			if(conDefault || (!conDefault && detaformapagofactuOrigen.getdescripcion()!=null && !detaformapagofactuOrigen.getdescripcion().equals(""))) {detaformapagofactu.setdescripcion(detaformapagofactuOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setText(detaformapagofactu.getId().toString());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setText(detaformapagofactu.getnombre());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setText(detaformapagofactu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetaFormaPagoFactu(DetaFormaPagoFactuBean detaformapagofactuBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setText(detaformapagofactuBean.getId().toString());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setText(detaformapagofactuBean.getnombre());
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setText(detaformapagofactuBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetaFormaPagoFactu(DetaFormaPagoFactuParameterReturnGeneral detaformapagofactuReturnGeneral,DetaFormaPagoFactuBean detaformapagofactuBean,Boolean conDefault) throws Exception { 
		try {
			DetaFormaPagoFactu detaformapagofactuLocal=new DetaFormaPagoFactu();
			
			detaformapagofactuLocal=detaformapagofactuReturnGeneral.getDetaFormaPagoFactu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detaformapagofactuLocal.getId()!=null && !detaformapagofactuLocal.getId().equals(0L))) {detaformapagofactuBean.setId(detaformapagofactuLocal.getId());}}
			if(conDefault || (!conDefault && detaformapagofactuLocal.getid_tipo_forma_pago()!=null && !detaformapagofactuLocal.getid_tipo_forma_pago().equals(-1L))) {detaformapagofactuBean.setid_tipo_forma_pago(detaformapagofactuLocal.getid_tipo_forma_pago());}
			if(conDefault || (!conDefault && detaformapagofactuLocal.getnombre()!=null && !detaformapagofactuLocal.getnombre().equals(""))) {detaformapagofactuBean.setnombre(detaformapagofactuLocal.getnombre());}
			if(conDefault || (!conDefault && detaformapagofactuLocal.getdescripcion()!=null && !detaformapagofactuLocal.getdescripcion().equals(""))) {detaformapagofactuBean.setdescripcion(detaformapagofactuLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetaFormaPagoFactuGenerico(Long idDetaFormaPagoFactuSeleccionado,JComboBox jComboBoxDetaFormaPagoFactu,List<DetaFormaPagoFactu> detaformapagofactusLocal)throws Exception {
		try {
			DetaFormaPagoFactu  detaformapagofactuTemp=null;

			for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusLocal) {
				if(detaformapagofactuAux.getId()!=null && detaformapagofactuAux.getId().equals(idDetaFormaPagoFactuSeleccionado)) {
					detaformapagofactuTemp=detaformapagofactuAux;
					break;
				}
			}

			jComboBoxDetaFormaPagoFactu.setSelectedItem(detaformapagofactuTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetaFormaPagoFactuGenerico(JComboBox jComboBoxDetaFormaPagoFactu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetaFormaPagoFactu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetaFormaPagoFactu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetaFormaPagoFactu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetaFormaPagoFactu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetaFormaPagoFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetaFormaPagoFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetaFormaPago")) {
			jButtonDetaFormaPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detaformapagofactu=(DetaFormaPagoFactu) detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detaformapagofactu =(DetaFormaPagoFactu) detaformapagofactus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detaformapagofactu.getIsNew() && !detaformapagofactu.getIsChanged() && !detaformapagofactu.getIsDeleted()) {
				sDescripcion=detaformapagofactu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detaformapagofactu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!detaformapagofactu.getIsNew() && !detaformapagofactu.getIsChanged() && !detaformapagofactu.getIsDeleted()) {
				sDescripcion=detaformapagofactu.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=detaformapagofactu.gettipoformapago_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetaFormaPagoFactu detaformapagofactuRow=new DetaFormaPagoFactu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detaformapagofactuRow=(DetaFormaPagoFactu) detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detaformapagofactuRow=(DetaFormaPagoFactu) detaformapagofactus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetaFormaPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DetaFormaPagoFactu detaformapagofactu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu = (DetaFormaPagoFactu)this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.detaformapagofactu = (DetaFormaPagoFactu)this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(detaformapagofactu!=null) {
						this.detaformapagofactu = detaformapagofactu;
					} else {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}
				}

				if(this.isTienePermisosDetaFormaPago && this.permiteMantenimiento(this.detaformapagofactu)) {
					DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup=new DetaFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detaformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup;
					} else {
						detaformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame;
					}

					List<DetaFormaPagoFactu> detaformapagofactus=new ArrayList<DetaFormaPagoFactu>();
					detaformapagofactus.add(this.detaformapagofactu);
					if(!esRelacionado) {
						//detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setConGuardarRelaciones(false);
						//detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detaformapagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.cargarDetaFormaPagoBeanSwingJInternalFrame(detaformapagofactus,this.detaformapagofactu,detaformapagoBeanSwingJInternalFrame,/*conInicializar,*/detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.getConGuardarRelaciones(),detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.getEsGuardarRelacionado());
					detaformapagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("no_relacionado");

						detaformapagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetaFormaPagoConstantesFunciones.ITAMANIOFILATABLA + (DetaFormaPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						detaformapagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDetaFormaPagoFactu=(TitledBorder)this.jScrollPanelDatosDetaFormaPagoFactu.getBorder();
						TitledBorder titledBorderDetaFormaPago=(TitledBorder)detaformapagoBeanSwingJInternalFrame.jScrollPanelDatosDetaFormaPago.getBorder();

						titledBorderDetaFormaPago.setTitle(titledBorderDetaFormaPagoFactu.getTitle() + " -> Deta Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detaformapagoBeanSwingJInternalFrame);
						}

						detaformapagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detaformapagoBeanSwingJInternalFrame);

						detaformapagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Deta Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));			
			this.jButtonDuplicarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu && this.isPermisoDuplicarDetaFormaPagoFactu));			
			this.jButtonCopiarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaCopiarDetaFormaPagoFactu && this.isPermisoCopiarDetaFormaPagoFactu));
			this.jButtonVerFormDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaVerFormDetaFormaPagoFactu && this.isPermisoVerFormDetaFormaPagoFactu));
			
			this.jButtonAbrirOrderByDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));			
			
			this.jButtonNuevoRelacionesDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));			
			this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaModificarDetaFormaPagoFactu && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaActualizarDetaFormaPagoFactu && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaEliminarDetaFormaPagoFactu && this.isPermisoEliminarDetaFormaPagoFactu));
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.setVisible(this.isVisibilidadCeldaCancelarDetaFormaPagoFactu);							
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));						
			this.jButtonDuplicarToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu && this.isPermisoDuplicarDetaFormaPagoFactu));						
			this.jButtonCopiarToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaCopiarDetaFormaPagoFactu && this.isPermisoCopiarDetaFormaPagoFactu));			
			this.jButtonVerFormToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaVerFormDetaFormaPagoFactu && this.isPermisoVerFormDetaFormaPagoFactu));			
			this.jButtonAbrirOrderByToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));
			this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));			
			this.jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));			
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaModificarDetaFormaPagoFactu && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaActualizarDetaFormaPagoFactu  && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaEliminarDetaFormaPagoFactu && this.isPermisoEliminarDetaFormaPagoFactu));
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarToolBarDetaFormaPagoFactu.setVisible(this.isVisibilidadCeldaCancelarDetaFormaPagoFactu);				
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));			
			this.jMenuItemDuplicarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu && this.isPermisoDuplicarDetaFormaPagoFactu));			
			this.jMenuItemCopiarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaCopiarDetaFormaPagoFactu && this.isPermisoCopiarDetaFormaPagoFactu));			
			this.jMenuItemVerFormDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaVerFormDetaFormaPagoFactu && this.isPermisoVerFormDetaFormaPagoFactu));			
			this.jMenuItemAbrirOrderByDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));			
			//this.jMenuItemMostrarOcultarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));
			this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));			
			//this.jMenuItemDetalleMostrarOcultarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaOrdenDetaFormaPagoFactu && this.isPermisoOrdenDetaFormaPagoFactu));			
			this.jMenuItemNuevoRelacionesDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu));			
			this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaNuevoDetaFormaPagoFactu && this.isPermisoNuevoDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));									
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemModificarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaModificarDetaFormaPagoFactu && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemActualizarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaActualizarDetaFormaPagoFactu && this.isPermisoActualizarDetaFormaPagoFactu));	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemEliminarDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaEliminarDetaFormaPagoFactu && this.isPermisoEliminarDetaFormaPagoFactu));
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemCancelarDetaFormaPagoFactu.setVisible(this.isVisibilidadCeldaCancelarDetaFormaPagoFactu);				
			}
			
			this.jMenuItemGuardarCambiosDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));						
			this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=this.jButtonNuevoDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu=this.jButtonDuplicarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaCopiarDetaFormaPagoFactu=this.jButtonCopiarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaVerFormDetaFormaPagoFactu=this.jButtonVerFormDetaFormaPagoFactu.isVisible();
			
			this.isVisibilidadCeldaOrdenDetaFormaPagoFactu=this.jButtonAbrirOrderByDetaFormaPagoFactu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=this.jButtonNuevoRelacionesDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=this.jButtonModificarDetaFormaPagoFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=this.jButtonNuevoToolBarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarToolBarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarToolBarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarToolBarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarToolBarDetaFormaPagoFactu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=this.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=this.jMenuItemNuevoDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=this.jMenuItemNuevoRelacionesDetaFormaPagoFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemModificarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemActualizarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemEliminarDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemCancelarDetaFormaPagoFactu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=this.jMenuItemGuardarCambiosDetaFormaPagoFactu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetaFormaPagoFactu(Boolean esInicializar) {
		if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
				//if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetaFormaPagoFactu();
			}
			
			this.inicializarActualizarBindingBotonesManualDetaFormaPagoFactu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetaFormaPagoFactu() {
		this.jButtonNuevoDetaFormaPagoFactu.setVisible(this.isPermisoNuevoDetaFormaPagoFactu);			
		this.jButtonDuplicarDetaFormaPagoFactu.setVisible(this.isPermisoDuplicarDetaFormaPagoFactu);			
		this.jButtonCopiarDetaFormaPagoFactu.setVisible(this.isPermisoCopiarDetaFormaPagoFactu);			
		this.jButtonVerFormDetaFormaPagoFactu.setVisible(this.isPermisoVerFormDetaFormaPagoFactu);			
		
		this.jButtonAbrirOrderByDetaFormaPagoFactu.setVisible(this.isPermisoOrdenDetaFormaPagoFactu);					
		
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.setVisible(this.isPermisoNuevoDetaFormaPagoFactu);			
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarDetaFormaPagoFactu.setVisible(this.isPermisoActualizarDetaFormaPagoFactu);	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.setVisible(this.isPermisoActualizarDetaFormaPagoFactu);	
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.setVisible(this.isPermisoEliminarDetaFormaPagoFactu);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.setVisible(this.isVisibilidadCeldaCancelarDetaFormaPagoFactu);						
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.setVisible(this.isPermisoGuardarCambiosDetaFormaPagoFactu);							
		}
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setVisible(this.isPermisoActualizarDetaFormaPagoFactu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetaFormaPagoFactu() {
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarDetaFormaPagoFactu.setVisible(this.isPermisoActualizarDetaFormaPagoFactu);	
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.setVisible(this.isPermisoActualizarDetaFormaPagoFactu);	
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.setVisible(this.isPermisoEliminarDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.setVisible(this.isVisibilidadCeldaCancelarDetaFormaPagoFactu);							
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.setVisible((this.isVisibilidadCeldaGuardarDetaFormaPagoFactu && this.isPermisoGuardarCambiosDetaFormaPagoFactu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetaFormaPagoFactu() {
		if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetaFormaPagoFactu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetaFormaPagoFactu() {
	}
	
	public void jTableDatosDetaFormaPagoFactuListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetaFormaPagoFactu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetaFormaPagoFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detaformapagofactu==null) {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}

					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				}

				if(this.detaformapagofactu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detaformapagofactu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetaFormaPagoFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetaFormaPagoFactu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetaFormaPagoFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detaformapagofactuLogic.getConnexion());

				if(this.detaformapagofactu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detaformapagofactu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetaFormaPagoFactu=(TitledBorder)this.jScrollPanelDatosDetaFormaPagoFactu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetaFormaPagoFactu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetaFormaPagoFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detaformapagofactu==null) {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}

					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				}

				if(this.detaformapagofactu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detaformapagofactu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebDetaFormaPagoFactu(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetaFormaPagoFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetaFormaPagoFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.detaformapagofactuLogic.getConnexion());

				if(this.detaformapagofactu.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.detaformapagofactu.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetaFormaPagoFactu=(TitledBorder)this.jScrollPanelDatosDetaFormaPagoFactu.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderDetaFormaPagoFactu.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detaformapagofactu==null) {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}

					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				}

				if(this.detaformapagofactu.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.detaformapagofactu.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetaFormaPagoFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detaformapagofactu==null) {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}

					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				}

				if(this.detaformapagofactu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detaformapagofactu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetaFormaPagoFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.getdetaformapagofactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detaformapagofactu==null) {
						this.detaformapagofactu = new DetaFormaPagoFactu();
					}

					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);
				}

				if(this.detaformapagofactu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detaformapagofactu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetaFormaPagoFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);

			this.getDetaFormaPagoFactusBusquedaPorNombre();

			this.inicializarActualizarBindingDetaFormaPagoFactu(false);

			//if(DetaFormaPagoFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);

			this.getDetaFormaPagoFactusFK_IdEmpresa();

			this.inicializarActualizarBindingDetaFormaPagoFactu(false);

			//if(DetaFormaPagoFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoDetaFormaPagoFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);

			this.getDetaFormaPagoFactusFK_IdTipoFormaPago();

			this.inicializarActualizarBindingDetaFormaPagoFactu(false);

			//if(DetaFormaPagoFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detaformapagofactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetaFormaPagoFactu() {
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
		

		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.dispose();
			this.jInternalFrameDetalleFormDetaFormaPagoFactu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
			this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.dispose();
			this.jInternalFrameReporteDinamicoDetaFormaPagoFactu=null;
		}
		
		if(this.jInternalFrameImportacionDetaFormaPagoFactu!=null) {
			this.jInternalFrameImportacionDetaFormaPagoFactu.setVisible(false);	    			
			this.jInternalFrameImportacionDetaFormaPagoFactu.dispose();
			this.jInternalFrameImportacionDetaFormaPagoFactu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetaFormaPagoFactu();
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetaFormaPagoFactu")) {
				jButtonDuplicarDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetaFormaPagoFactu")) {
				jButtonCopiarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetaFormaPagoFactu")) {
				jButtonVerFormDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetaFormaPagoFactu")) {
				jButtonDuplicarDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetaFormaPagoFactu")) {
				jButtonDuplicarDetaFormaPagoFactuActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetaFormaPagoFactu")) {
				jButtonModificarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetaFormaPagoFactu")) {
				jButtonModificarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetaFormaPagoFactu")) {
				jButtonModificarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetaFormaPagoFactu")) {
				jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetaFormaPagoFactu")) {
				jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetaFormaPagoFactu")) {
				jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetaFormaPagoFactu")) {
				jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetaFormaPagoFactu")) {
				jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetaFormaPagoFactu")) {
				jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetaFormaPagoFactu")) {
				jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetaFormaPagoFactu")) {
				jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetaFormaPagoFactu")) {
				jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetaFormaPagoFactu")) {
				jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetaFormaPagoFactu")) {
				jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetaFormaPagoFactu")) {
				jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetaFormaPagoFactu")) {
				jButtonMostrarOcultarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetaFormaPagoFactu")) {
				jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetaFormaPagoFactu")) {
				jButtonCopiarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetaFormaPagoFactu")) {
				jButtonVerFormDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetaFormaPagoFactu")) {
				jButtonCopiarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetaFormaPagoFactu")) {
				jButtonVerFormDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetaFormaPagoFactu")) {
				jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetaFormaPagoFactu")) {
				jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetaFormaPagoFactu")) {
				jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetaFormaPagoFactu")) {
				jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetaFormaPagoFactu")) {
				jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetaFormaPagoFactu")) {
				jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetaFormaPagoFactu")) {
				jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetaFormaPagoFactu")) {
				jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetaFormaPagoFactu")) {
				jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetaFormaPagoFactu") || sTipo.equals("MenuItemDetalleAbrirOrderByDetaFormaPagoFactu")) {
				jButtonAbrirOrderByDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetaFormaPagoFactu") || sTipo.equals("MenuItemDetalleMostrarOcultarDetaFormaPagoFactu")) {
				jButtonMostrarOcultarDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetaFormaPagoFactu")) {
				jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetaFormaPagoFactu")) {
				jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetaFormaPagoFactu")) {
				jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetaFormaPagoFactu")) {
				jButtonCerrarReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetaFormaPagoFactu")) {
				jButtonGenerarReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetaFormaPagoFactu")) {
				
				jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetaFormaPagoFactu")) {
				jButtonCerrarImportacionDetaFormaPagoFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetaFormaPagoFactu")) {
				
				jButtonGenerarImportacionDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetaFormaPagoFactu")) {
				
				jButtonAbrirImportacionDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetaFormaPagoFactu")) {
				jComboBoxTiposAccionesDetaFormaPagoFactuActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetaFormaPagoFactu")) {
				jComboBoxTiposRelacionesDetaFormaPagoFactuActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetaFormaPagoFactu")) {
				jComboBoxTiposAccionesDetaFormaPagoFactuActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetaFormaPagoFactu")) {
				
				jComboBoxTiposSeleccionarDetaFormaPagoFactuActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetaFormaPagoFactu")) {
				jTextFieldValorCampoGeneralDetaFormaPagoFactuActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetaFormaPagoFactu")) {
				jButtonAbrirOrderByDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetaFormaPagoFactu")) {
				jButtonAbrirOrderByDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetaFormaPagoFactu")) {
				jButtonCerrarOrderByDetaFormaPagoFactuActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetaFormaPagoFactuBusqueda")) {
				this.jButtonidDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetaFormaPagoFactuUpdate")) {
				this.jButtonid_empresaDetaFormaPagoFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetaFormaPagoFactuBusqueda")) {
				this.jButtonid_empresaDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetaFormaPagoFactuUpdate")) {
				this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetaFormaPagoFactuBusqueda")) {
				this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetaFormaPagoFactuBusqueda")) {
				this.jButtonnombreDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetaFormaPagoFactuBusqueda")) {
				this.jButtondescripcionDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreDetaFormaPagoFactu")) {
				this.jButtonBusquedaPorNombreDetaFormaPagoFactuActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormaPagoDetaFormaPagoFactu")) {
				this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactuActionPerformed(evt);
			}
			
			;
			
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetaFormaPagoFactu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetaFormaPagoFactu detaformapagofactuLocal=null;
			
			if(!this.getEsControlTabla()) {
				detaformapagofactuLocal=this.detaformapagofactu;
			} else {
				detaformapagofactuLocal=this.detaformapagofactuAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
							
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
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
			
			


			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
								
						
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
								
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
							
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
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
			
			


			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
								
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetaFormaPagoFactu")) {
					jCheckBoxSeleccionarTodosDetaFormaPagoFactuItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetaFormaPagoFactu")) {
					jCheckBoxSeleccionadosDetaFormaPagoFactuItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetaFormaPagoFactu")) {
					
				}
				
				


				
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
												
				
				


				
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
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
			
			


			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detaformapagofactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detaformapagofactu);
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
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
				
				


				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetaFormaPagoFactu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetaFormaPagoFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetaFormaPagoFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detaformapagofactuAnterior =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetaFormaPagoFactu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetaFormaPagoFactuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetaFormaPagoFactu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detaformapagofactu =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detaformapagofactu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetaFormaPagoFactu")) {
				
				}
				
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetaFormaPagoFactu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetaFormaPagoFactu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetaFormaPagoFactu")) {
			
			}
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetaFormaPagoFactu();
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			if(sTipo.equals("NuevoDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetaFormaPagoFactu")) {
				jButtonDuplicarDetaFormaPagoFactuActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetaFormaPagoFactu")) {
				jButtonCopiarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetaFormaPagoFactu")) {
				jButtonVerFormDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetaFormaPagoFactu")) {
				jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetaFormaPagoFactu")) {
				jButtonModificarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetaFormaPagoFactu")) {
				jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetaFormaPagoFactu")) {
				jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetaFormaPagoFactu")) {
				jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetaFormaPagoFactu")) {
				jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetaFormaPagoFactu")) {
				jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetaFormaPagoFactu")) {
				jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetaFormaPagoFactu")) {
				jButtonAbrirOrderByDetaFormaPagoFactuActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetaFormaPagoFactu")) {
				jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetaFormaPagoFactu")) {
				jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetaFormaPagoFactu")) {
				jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetaFormaPagoFactuBusqueda")) {
				this.jButtonidDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetaFormaPagoFactuUpdate")) {
				this.jButtonid_empresaDetaFormaPagoFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetaFormaPagoFactuBusqueda")) {
				this.jButtonid_empresaDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetaFormaPagoFactuUpdate")) {
				this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetaFormaPagoFactuBusqueda")) {
				this.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetaFormaPagoFactuBusqueda")) {
				this.jButtonnombreDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetaFormaPagoFactuBusqueda")) {
				this.jButtondescripcionDetaFormaPagoFactuBusquedaActionPerformed(evt);
			}
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetaFormaPagoFactu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetaFormaPagoFactu")) {
				closingInternalFrameDetaFormaPagoFactu();
				
			} else if(sTipo.equals("jButtonCancelarDetaFormaPagoFactu")) {
				JInternalFrameBase jInternalFrameDetalleFormDetaFormaPagoFactu = (JInternalFrameBase)evt.getSource();
	            	
	            DetaFormaPagoFactuBeanSwingJInternalFrame jInternalFrameParent=(DetaFormaPagoFactuBeanSwingJInternalFrame)jInternalFrameDetalleFormDetaFormaPagoFactu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetaFormaPagoFactuActionPerformed(null);
			}
			
			DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detaformapagofactu,new Object(),this.detaformapagofactuParameterGeneral,this.detaformapagofactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetaFormaPagoFactu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetaFormaPagoFactu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetaFormaPagoFactu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detaformapagofactu)) {
			if(!esControlTabla) {
				if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);			
				}
				
				if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detaformapagofactuReturnGeneral=detaformapagofactuLogic.procesarEventosDetaFormaPagoFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this.detaformapagofactu,this.detaformapagofactuParameterGeneral,this.isEsNuevoDetaFormaPagoFactu,classes);//this.detaformapagofactuLogic.getDetaFormaPagoFactu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral,this.detaformapagofactuBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetaFormaPagoFactu(classes,this.detaformapagofactuReturnGeneral,this.detaformapagofactuBean,false);
					}
						
					if(this.detaformapagofactuReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu());	
					}
						
					if(this.detaformapagofactuReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu(),classes);//this.detaformapagofactuBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetaFormaPagoFactu(this.detaformapagofactu,classes);//this.detaformapagofactuBean);									
				}
			
				if(DetaFormaPagoFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetaFormaPagoFactu(this.detaformapagofactu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetaFormaPagoFactu(this.detaformapagofactu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detaformapagofactuAnterior!=null) {
						this.detaformapagofactu=this.detaformapagofactuAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detaformapagofactuReturnGeneral=detaformapagofactuLogic.procesarEventosDetaFormaPagoFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this.detaformapagofactu,this.detaformapagofactuParameterGeneral,this.isEsNuevoDetaFormaPagoFactu,classes);//this.detaformapagofactuLogic.getDetaFormaPagoFactu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detaformapagofactuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detaformapagofactuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu(),detaformapagofactuLogic.getDetaFormaPagoFactus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu(),this.detaformapagofactus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetaFormaPagoFactu.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetaFormaPagoFactu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetaFormaPagoFactu();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetaFormaPagoFactu() throws Exception {
		
		DetaFormaPagoFactuModel detaformapagofactuModel=(DetaFormaPagoFactuModel)this.jTableDatosDetaFormaPagoFactu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detaformapagofactuModel.detaformapagofactus=this.detaformapagofactuLogic.getDetaFormaPagoFactus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detaformapagofactuModel.detaformapagofactus=this.detaformapagofactus;
		}
		
		
		((DetaFormaPagoFactuModel) this.jTableDatosDetaFormaPagoFactu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetaFormaPagoFactu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetaformapagofactuAnterior(),this.detaformapagofactuLogic.getDetaFormaPagoFactus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetaformapagofactuAnterior(),this.detaformapagofactus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetaFormaPagoFactu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaFormaPago.class)) {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.setDetaFormaPagos(detaformapagofactu.getDetaFormaPagos());
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
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
										
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detaformapagofactu,new Object(),generalEntityParameterGeneral,this.detaformapagofactuReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detaformapagofactuSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetaFormaPagoFactuConstantesFunciones.getClassesRelationshipsOfDetaFormaPagoFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetaFormaPagoFactuConstantesFunciones.getClassesRelationshipsFromStringsOfDetaFormaPagoFactu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetaFormaPagoFactu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detaformapagofactu,new Object(),generalEntityParameterGeneral,this.detaformapagofactuReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetaFormaPagoFactu(DetaFormaPagoFactuBean detaformapagofactuBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaFormaPago.class)) {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.setDetaFormaPagos(detaformapagofactu.getDetaFormaPagos());
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetaFormaPagoFactu(ArrayList<Classe> classes,DetaFormaPagoFactuReturnGeneral detaformapagofactuReturnGeneral,DetaFormaPagoFactuBean detaformapagofactuBean,Boolean conDefault) throws Exception {
		
			this.detaformapagofactuBean.setDetaFormaPagos(detaformapagofactuReturnGeneral.getDetaFormaPagoFactu().getDetaFormaPagos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaFormaPago.class)) {
					detaformapagofactu.setDetaFormaPagos(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoBeanSwingJInternalFrame.detaformapagoLogic.getDetaFormaPagos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.detaformapagofactu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu = new DetaFormaPagoFactuDetalleFormJInternalFrame(jDesktopPane,this.detaformapagofactuSessionBean.getConGuardarRelaciones(),this.detaformapagofactuSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.setVisible(false);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagofactuLogic=this.detaformapagofactuLogic;
		
		this.cargarCombosFrameForeignKeyDetaFormaPagoFactu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetaFormaPagoFactu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetaFormaPagoFactu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetaFormaPagoFactu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetaFormaPagoFactu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetaFormaPagoFactu"));
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ModificarDetaFormaPagoFactu"));

		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetaFormaPagoFactu"));
					
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemModificarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetaFormaPagoFactu"));		
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"ActualizarDetaFormaPagoFactu"));
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetaFormaPagoFactu"));
						
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemActualizarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetaFormaPagoFactu"));		
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"EliminarDetaFormaPagoFactu"));
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetaFormaPagoFactu"));
								
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemEliminarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetaFormaPagoFactu"));		
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CancelarDetaFormaPagoFactu"));
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetaFormaPagoFactu"));
					
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemCancelarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetaFormaPagoFactu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemDetalleCerrarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetaFormaPagoFactu"));		
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetaFormaPagoFactu"));
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetaFormaPagoFactu"));
		
		
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetaFormaPagoFactu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonidDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"idDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonnombreDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtondescripcionDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetaFormaPagoFactuBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetaFormaPagoFactu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetaFormaPagoFactu"));
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetaFormaPagoFactu"));
		}
		
		this.jTableDatosDetaFormaPagoFactu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetaFormaPagoFactu"));
		
		this.jTableDatosDetaFormaPagoFactu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetaFormaPagoFactu"));
		
		this.jButtonNuevoDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"NuevoDetaFormaPagoFactu"));
		
		this.jButtonDuplicarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"DuplicarDetaFormaPagoFactu"));
		
		this.jButtonCopiarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"CopiarDetaFormaPagoFactu"));
		
		this.jButtonVerFormDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"VerFormDetaFormaPagoFactu"));
		
		
		this.jButtonNuevoToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetaFormaPagoFactu"));
			
		this.jButtonDuplicarToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemNuevoDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetaFormaPagoFactu"));
			
		this.jMenuItemDuplicarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetaFormaPagoFactu"));		
		
		
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetaFormaPagoFactu"));
		
		
		this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemNuevoRelacionesDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetaFormaPagoFactu"));		
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ModificarDetaFormaPagoFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonModificarToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetaFormaPagoFactu"));
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemModificarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetaFormaPagoFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"ActualizarDetaFormaPagoFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonActualizarToolBarDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetaFormaPagoFactu"));
				
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemActualizarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetaFormaPagoFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"EliminarDetaFormaPagoFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonEliminarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetaFormaPagoFactu"));
						
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemEliminarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetaFormaPagoFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CancelarDetaFormaPagoFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonCancelarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetaFormaPagoFactu"));
			
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemCancelarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetaFormaPagoFactu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetaFormaPagoFactu"));		
		
		
		this.jButtonCerrarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CerrarDetaFormaPagoFactu"));
		
		
		this.jButtonCerrarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemCerrarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetaFormaPagoFactu"));
			
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jMenuItemDetalleCerrarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetaFormaPagoFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetaFormaPagoFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetaFormaPagoFactu"));
		}
		
		this.jButtonCopiarToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetaFormaPagoFactu"));
			
		this.jButtonVerFormToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetaFormaPagoFactu"));
		
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetaFormaPagoFactu"));
			
		this.jMenuItemCopiarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetaFormaPagoFactu"));		
		
		this.jMenuItemVerFormDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetaFormaPagoFactu"));		
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetaFormaPagoFactu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetaFormaPagoFactu"));		
		
		
		
		this.jButtonRecargarInformacionDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetaFormaPagoFactu"));
					
		this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetaFormaPagoFactu"));
		
		this.jMenuItemRecargarInformacionDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetaFormaPagoFactu"));		
		
		
		
		this.jButtonAnterioresDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"AnterioresDetaFormaPagoFactu"));
		
		
		this.jButtonAnterioresToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetaFormaPagoFactu"));
		
		this.jMenuItemAnterioresDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetaFormaPagoFactu"));		
		
		
		this.jButtonSiguientesDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"SiguientesDetaFormaPagoFactu"));
		
		
		this.jButtonSiguientesToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemSiguientesDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetaFormaPagoFactu"));
			
		this.jMenuItemAbrirOrderByDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetaFormaPagoFactu"));
			
		this.jMenuItemMostrarOcultarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetaFormaPagoFactu"));
			
		this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetaFormaPagoFactu"));
			
		this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetaFormaPagoFactu"));		
		
		
		this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetaFormaPagoFactu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetaFormaPagoFactu"));
			
		this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetaFormaPagoFactu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetaFormaPagoFactu"));

		this.jCheckBoxSeleccionadosDetaFormaPagoFactu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetaFormaPagoFactu"));
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetaFormaPagoFactu"));
		}
		
		
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetaFormaPagoFactu"));
			
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesDetaFormaPagoFactu"));
					
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetaFormaPagoFactu"));
			
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetaFormaPagoFactu"));		
		
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonidDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"idDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonnombreDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtondescripcionDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetaFormaPagoFactuBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreDetaFormaPagoFactu"));

			this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoDetaFormaPagoFactu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetaFormaPagoFactu!=null) {
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetaFormaPagoFactu"));
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetaFormaPagoFactu"));
				this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetaFormaPagoFactu"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetaFormaPagoFactu"));				
			//this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetaFormaPagoFactu"));
			//this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetaFormaPagoFactu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetaFormaPagoFactu!=null) {
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetaFormaPagoFactu"));
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetaFormaPagoFactu"));
				this.jInternalFrameImportacionDetaFormaPagoFactu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetaFormaPagoFactu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetaFormaPagoFactu"));
			
			this.jButtonAbrirOrderByToolBarDetaFormaPagoFactu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetaFormaPagoFactu"));			
			
			if(this.jInternalFrameOrderByDetaFormaPagoFactu!=null) {
				this.jInternalFrameOrderByDetaFormaPagoFactu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetaFormaPagoFactu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTabbedPaneRelacionesDetaFormaPagoFactu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetaFormaPagoFactu"));
		
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
            		closingInternalFrameDetaFormaPagoFactu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetaFormaPagoFactu = (JInternalFrameBase)event.getSource();
	            	
	            DetaFormaPagoFactuBeanSwingJInternalFrame jInternalFrameParent=(DetaFormaPagoFactuBeanSwingJInternalFrame)jInternalFrameDetalleFormDetaFormaPagoFactu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetaFormaPagoFactuActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetaFormaPagoFactu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetaFormaPagoFactuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetaFormaPagoFactu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetaFormaPagoFactu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoRelacionesDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetaFormaPagoFactuActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetaFormaPagoFactu";
		inputMap = this.jButtonModificarDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetaFormaPagoFactu";
		inputMap = this.jButtonActualizarDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetaFormaPagoFactu";
		inputMap = this.jButtonEliminarDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetaFormaPagoFactu";
		inputMap = this.jButtonCancelarDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetaFormaPagoFactu";
		inputMap = this.jButtonCerrarDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetaFormaPagoFactu";
		inputMap = this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonGuardarCambiosDetaFormaPagoFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetaFormaPagoFactuItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetaFormaPagoFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetaFormaPagoFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetaFormaPagoFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetaFormaPagoFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonidDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"idDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_empresaDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetaFormaPagoFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonid_tipo_forma_pagoDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtonnombreDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetaFormaPagoFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jButtondescripcionDetaFormaPagoFactuBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetaFormaPagoFactuBusqueda"));
		
		
		this.jButtonBusquedaPorNombreDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreDetaFormaPagoFactu"));

		this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoDetaFormaPagoFactu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetaFormaPagoFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetaFormaPagoFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetaFormaPagoFactuActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetaFormaPagoFactu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
					detaformapagofactuAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactus) {
					detaformapagofactuAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetaFormaPagoFactuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
						detaformapagofactuAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactus) {
						detaformapagofactuAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetaFormaPagoFactu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetaFormaPagoFactu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetaFormaPagoFactuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetaFormaPagoFactu.getSelectedRows();
			
			DetaFormaPagoFactu detaformapagofactuLocal=new DetaFormaPagoFactu();
			
			//this.seleccionarTodosDetaFormaPagoFactu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detaformapagofactuLocal =(DetaFormaPagoFactu) this.detaformapagofactuLogic.getDetaFormaPagoFactus().toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detaformapagofactuLocal =(DetaFormaPagoFactu) this.detaformapagofactus.toArray()[this.jTableDatosDetaFormaPagoFactu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detaformapagofactuLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
						detaformapagofactuAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactus) {
						detaformapagofactuAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetaFormaPagoFactu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetaFormaPagoFactu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetaFormaPagoFactu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetaFormaPagoFactuItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetaFormaPagoFactuParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetaFormaPagoFactuActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactuLogic.getDetaFormaPagoFactus()) {
				
						if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detaformapagofactuAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detaformapagofactuAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactus) {
					
						if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detaformapagofactuAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detaformapagofactuAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetaFormaPagoFactuActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetaFormaPagoFactu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetaFormaPagoFactu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetaFormaPagoFactu) {				
					conSplash=true;//false;										
					
					//this.startProcessDetaFormaPagoFactu(conSplash);
				
					this.generarReporteDetaFormaPagoFactusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetaFormaPagoFactusSeleccionados();
				//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetaFormaPagoFactusSeleccionados(false);
				//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetaFormaPagoFactusSeleccionados(true);
				//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetaFormaPagoFactu();
				
				this.exportarDetaFormaPagoFactusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetaFormaPagoFactus();
				//this.importarDetaFormaPagoFactus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetaFormaPagoFactu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetaFormaPagoFactusSeleccionados();
				//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Deta Forma Pago Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetaFormaPagoFactu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetaFormaPagoFactu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetaFormaPagoFactu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
				}	
			} 			
			else if(DetaFormaPagoFactuBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetaFormaPagoFactu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetaFormaPagoFactu(conSplash);
					
						//this.actualizarParametrosGeneralDetaFormaPagoFactu();
						
						this.generarReporteProcesoAccionDetaFormaPagoFactusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Deta Forma Pago FactuS SELECCIONADOS?", "MANTENIMIENTO DE Deta Forma Pago Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetaFormaPagoFactu();
				
						this.actualizarParametrosGeneralDetaFormaPagoFactu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detaformapagofactuReturnGeneral=detaformapagofactuLogic.procesarAccionDetaFormaPagoFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detaformapagofactuLogic.getDetaFormaPagoFactus(),this.detaformapagofactuParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetaFormaPagoFactuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetaFormaPagoFactu();
					
					DetaFormaPagoFactuBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetaFormaPagoFactuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetaFormaPagoFactu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxTiposAccionesFormularioDetaFormaPagoFactu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetaFormaPagoFactu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetaFormaPagoFactuActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetaFormaPagoFactu();
			
			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
			DetaFormaPagoFactu detaformapagofactu=new DetaFormaPagoFactu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetaFormaPagoFactu.getSelectedItem();
			
			
			
			
			detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
			//this.sTipoAccion;
			
			if(detaformapagofactusSeleccionados.size()==1) {
				for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
					detaformapagofactu=detaformapagofactuAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Deta Forma Pago")) {
					jButtonDetaFormaPagoActionPerformed(null,rowIndex,true,false,detaformapagofactu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetaFormaPagoFactu();
			
      		//this.finishProcessDetaFormaPagoFactu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetaFormaPagoFactuReturnGeneral() throws Exception {
		if(this.detaformapagofactuReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detaformapagofactuReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detaformapagofactuReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detaformapagofactuReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detaformapagofactuReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detaformapagofactuReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
		}
		
		if(this.detaformapagofactuReturnGeneral.getConRetornoLista() || this.detaformapagofactuReturnGeneral.getConRetornoObjeto()) {
			if(this.detaformapagofactuReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detaformapagofactuLogic.setDetaFormaPagoFactus(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detaformapagofactuReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detaformapagofactuLogic.setDetaFormaPagoFactu(this.detaformapagofactuReturnGeneral.getDetaFormaPagoFactu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetaFormaPagoFactu(false);
		}
	}
	
	public void actualizarParametrosGeneralDetaFormaPagoFactu() throws Exception {
		
		
	}
	
	public ArrayList<DetaFormaPagoFactu> getDetaFormaPagoFactusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetaFormaPagoFactu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactuLogic.getDetaFormaPagoFactus()) {
					if(detaformapagofactuAux.getIsSelected()) {
						detaformapagofactusSeleccionados.add(detaformapagofactuAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetaFormaPagoFactu detaformapagofactuAux:this.detaformapagofactus) {
					if(detaformapagofactuAux.getIsSelected()) {
						detaformapagofactusSeleccionados.add(detaformapagofactuAux);				
					}
				}
			}
			
			if(detaformapagofactusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detaformapagofactusSeleccionados.addAll(this.detaformapagofactuLogic.getDetaFormaPagoFactus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detaformapagofactusSeleccionados.addAll(this.detaformapagofactus);				
					}
				}
			}
		} else {
			detaformapagofactusSeleccionados.add(this.detaformapagofactu);
		}
		
		return detaformapagofactusSeleccionados;
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
	
	public void generarReporteDetaFormaPagoFactusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetaFormaPagoFactusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetaFormaPagoFactusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetaFormaPagoFactusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetaFormaPagoFactusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesDetaFormaPagoFactusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Deta Forma Pago Factu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados);
		
	}	
	
	public void generarReporteNormalDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetaFormaPagoFactusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetaFormaPagoFactu();
		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetaFormaPagoFactu();
		
		
		//this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados ,detaformapagofactuImplementable,detaformapagofactuImplementableHome);
	}
	
	public void mostrarImportacionDetaFormaPagoFactus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetaFormaPagoFactu();
		
		this.abrirFrameImportacionDetaFormaPagoFactu();		
		
			
		//this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados ,detaformapagofactuImplementable,detaformapagofactuImplementableHome);
	}
	
	public void importarDetaFormaPagoFactus() throws Exception {		
	
	}
	
	public void exportarDetaFormaPagoFactusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetaFormaPagoFactusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetaFormaPagoFactusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetaFormaPagoFactusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Deta Forma Pago Factu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetaFormaPagoFactu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetaFormaPagoFactu(detaformapagofactuAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detaformapagofactuAux.setsDetalleGeneralEntityReporte(detaformapagofactuAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetaFormaPagoFactu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detaformapagofactu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detaformapagofactu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detaformapagofactu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detaformapagofactu.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detaformapagofactu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detaformapagofactu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetaFormaPagoFactus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetaFormaPagoFactu(row);				
				iRow++;
			}				
			
			for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetaFormaPagoFactu(detaformapagofactuAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetaFormaPagoFactusSeleccionados() throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();		
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detaformapagofactu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detaformapagofactus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detaformapagofactu");
			//elementRoot.appendChild(element);
		
			for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
				element = document.createElement("detaformapagofactu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetaFormaPagoFactu(detaformapagofactuAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Deta Forma Pago Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetaFormaPagoFactu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detaformapagofactu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detaformapagofactu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detaformapagofactu.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detaformapagofactu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(detaformapagofactu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetaFormaPagoFactu(DetaFormaPagoFactu detaformapagofactu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetaFormaPagoFactuConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detaformapagofactu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetaFormaPagoFactuConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detaformapagofactu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetaFormaPagoFactuConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detaformapagofactu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(DetaFormaPagoFactuConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(detaformapagofactu.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementnombre = document.createElement(DetaFormaPagoFactuConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detaformapagofactu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(DetaFormaPagoFactuConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detaformapagofactu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetaFormaPagoFactusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados=new ArrayList<DetaFormaPagoFactu>();
		
		detaformapagofactusSeleccionados=this.getDetaFormaPagoFactusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetaFormaPagoFactu(detaformapagofactusSeleccionados);
		
		this.generarReporteDetaFormaPagoFactus("Todos",detaformapagofactusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetaFormaPagoFactu(ArrayList<DetaFormaPagoFactu> detaformapagofactusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetaFormaPagoFactu detaformapagofactuAux:detaformapagofactusSeleccionados) {
				detaformapagofactuAux.setsDetalleGeneralEntityReporte(detaformapagofactuAux.toString());
			
				if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detaformapagofactuAux.setsDescripcionGeneralEntityReporte1(detaformapagofactuAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					detaformapagofactuAux.setsDescripcionGeneralEntityReporte1(detaformapagofactuAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detaformapagofactuAux.setsDescripcionGeneralEntityReporte1(detaformapagofactuAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DetaFormaPagoFactuConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detaformapagofactuAux.setsDescripcionGeneralEntityReporte1(detaformapagofactuAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetaFormaPagoFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetaFormaPagoFactu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=true;
				this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=true;
				this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=true;
			}
			
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaModificarDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaCancelarDetaFormaPagoFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarDetaFormaPagoFactu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=true;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=true;
		} else {
			this.actualizarEstadoPanelsDetaFormaPagoFactu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetaFormaPagoFactu=false;
			//this.isVisibilidadCeldaVerFormDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaDuplicarDetaFormaPagoFactu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detaformapagofactuSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
		} else {
			this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			if(!detaformapagofactuSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;												
			}
			
			this.jButtonCerrarDetaFormaPagoFactu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetaFormaPagoFactu=false;
		}
		
		if(!this.permiteMantenimiento(this.detaformapagofactu)) {
			this.isVisibilidadCeldaActualizarDetaFormaPagoFactu=false;
			this.isVisibilidadCeldaEliminarDetaFormaPagoFactu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetaFormaPagoFactu() {
		this.isVisibilidadCeldaNuevoDetaFormaPagoFactu=false;
		this.isVisibilidadCeldaGuardarCambiosDetaFormaPagoFactu=false;
	}
	
	public void actualizarEstadoPanelsDetaFormaPagoFactu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosEdicionDetaFormaPagoFactu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetaFormaPagoFactu!=null) {
				this.jScrollPanelDatosDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetaFormaPagoFactu!=null) {
				this.jPanelPaginacionDetaFormaPagoFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
					this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetaFormaPagoFactu!=null) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetaFormaPagoFactu!=null) {
				this.jPanelParametrosReportesDetaFormaPagoFactu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(jPanelBusquedaPorNombreDetaFormaPagoFactu);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadBusquedaPorNombre=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(jPanelBusquedaPorNombreDetaFormaPagoFactu);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);}
		}
		
	}
	
	

	public String registrarSesionDetaFormaPagoFactuParaDetaFormaPagos() throws Exception {
		Boolean isPaginaPopupDetaFormaPago=false;

		try {

			if(this.detaformapagofactuSessionBean==null) {
				this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
			}

			if(this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean==null) {
				this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
			}

			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setsPathNavegacionActual(detaformapagofactuSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetaFormaPago=this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetaFormaPago(true);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetaFormaPago(DetaFormaPagoFactuConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setisBusquedaDesdeForeignKeySesionDetaFormaPagoFactu(true);
			this.jInternalFrameDetalleFormDetaFormaPagoFactu.detaformapagoSessionBean.setlidDetaFormaPagoFactuActual(this.idDetaFormaPagoFactuActual);

			detaformapagofactuSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetaFormaPagoFactu(true);
			detaformapagofactuSessionBean.setlIdDetaFormaPagoFactuActualForeignKey(this.idDetaFormaPagoFactuActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		
		if(this.detaformapagofactuSessionBean==null) {
			this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		}
		
		this.detaformapagofactuSessionBean.setsUltimaBusquedaDetaFormaPagoFactu(this.getsAccionBusqueda());
		this.detaformapagofactuSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detaformapagofactuSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			detaformapagofactuSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detaformapagofactuSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			detaformapagofactuSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		
		if(this.detaformapagofactuSessionBean==null) {
			this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		}
		
		if(this.detaformapagofactuSessionBean.getsUltimaBusquedaDetaFormaPagoFactu()!=null&&!this.detaformapagofactuSessionBean.getsUltimaBusquedaDetaFormaPagoFactu().equals("")) {
			this.setsAccionBusqueda(detaformapagofactuSessionBean.getsUltimaBusquedaDetaFormaPagoFactu());
			this.setiNumeroPaginacion(detaformapagofactuSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detaformapagofactuSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(detaformapagofactuSessionBean.getnombre());
				detaformapagofactuSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detaformapagofactuSessionBean.getid_empresa());
				detaformapagofactuSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(detaformapagofactuSessionBean.getid_tipo_forma_pago());
				detaformapagofactuSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.detaformapagofactuSessionBean.setsUltimaBusquedaDetaFormaPagoFactu("");
		this.detaformapagofactuSessionBean.setiNumeroPaginacion(DetaFormaPagoFactuConstantesFunciones.INUMEROPAGINACION);
		this.detaformapagofactuSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetaFormaPagoFactu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetaFormaPagoFactu() {
		this.updateBorderResaltarBusquedasFormularioDetaFormaPagoFactu();
		this.updateVisibilidadBusquedasFormularioDetaFormaPagoFactu();
		this.updateHabilitarBusquedasFormularioDetaFormaPagoFactu();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetaFormaPagoFactu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponents().length>0) {
	

		if(this.detaformapagofactuConstantesFunciones.resaltarBusquedaPorNombreDetaFormaPagoFactu!=null) {
			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelBusquedaPorNombreDetaFormaPagoFactu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
				jPanel.setBorder(this.detaformapagofactuConstantesFunciones.resaltarBusquedaPorNombreDetaFormaPagoFactu);
			}
		}

		if(this.detaformapagofactuConstantesFunciones.resaltarFK_IdTipoFormaPagoDetaFormaPagoFactu!=null) {
			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
				jPanel.setBorder(this.detaformapagofactuConstantesFunciones.resaltarFK_IdTipoFormaPagoDetaFormaPagoFactu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetaFormaPagoFactu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelBusquedaPorNombreDetaFormaPagoFactu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detaformapagofactuConstantesFunciones.mostrarBusquedaPorNombreDetaFormaPagoFactu);
			if(!this.detaformapagofactuConstantesFunciones.mostrarBusquedaPorNombreDetaFormaPagoFactu && index>-1) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detaformapagofactuConstantesFunciones.mostrarFK_IdTipoFormaPagoDetaFormaPagoFactu);
			if(!this.detaformapagofactuConstantesFunciones.mostrarFK_IdTipoFormaPagoDetaFormaPagoFactu && index>-1) {
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetaFormaPagoFactu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelBusquedaPorNombreDetaFormaPagoFactu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detaformapagofactuConstantesFunciones.activarBusquedaPorNombreDetaFormaPagoFactu);
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setEnabledAt(index,this.detaformapagofactuConstantesFunciones.activarBusquedaPorNombreDetaFormaPagoFactu);
			}

			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detaformapagofactuConstantesFunciones.activarFK_IdTipoFormaPagoDetaFormaPagoFactu);
				this.jTabbedPaneBusquedasDetaFormaPagoFactu.setEnabledAt(index,this.detaformapagofactuConstantesFunciones.activarFK_IdTipoFormaPagoDetaFormaPagoFactu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetaFormaPagoFactu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelBusquedaPorNombreDetaFormaPagoFactu);

			this.jTabbedPaneBusquedasDetaFormaPagoFactu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);

			this.detaformapagofactuConstantesFunciones.setResaltarBusquedaPorNombreDetaFormaPagoFactu(resaltar);

			jPanel.setBorder(this.detaformapagofactuConstantesFunciones.resaltarBusquedaPorNombreDetaFormaPagoFactu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasDetaFormaPagoFactu.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);

			this.jTabbedPaneBusquedasDetaFormaPagoFactu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetaFormaPagoFactu.getComponent(index);

			this.detaformapagofactuConstantesFunciones.setResaltarFK_IdTipoFormaPagoDetaFormaPagoFactu(resaltar);

			jPanel.setBorder(this.detaformapagofactuConstantesFunciones.resaltarFK_IdTipoFormaPagoDetaFormaPagoFactu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetaFormaPagoFactu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetaFormaPagoFactu() throws Exception {

		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetaFormaPagoFactu();
		this.updateVisibilidadResaltarControlesFormularioDetaFormaPagoFactu();
		this.updateHabilitarResaltarControlesFormularioDetaFormaPagoFactu();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetaFormaPagoFactu() throws Exception {
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detaformapagofactuConstantesFunciones.resaltaridDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setBorder(this.detaformapagofactuConstantesFunciones.resaltaridDetaFormaPagoFactu);}
		if(this.detaformapagofactuConstantesFunciones.resaltarid_empresaDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setBorder(this.detaformapagofactuConstantesFunciones.resaltarid_empresaDetaFormaPagoFactu);}
		if(this.detaformapagofactuConstantesFunciones.resaltarid_tipo_forma_pagoDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setBorder(this.detaformapagofactuConstantesFunciones.resaltarid_tipo_forma_pagoDetaFormaPagoFactu);}
		if(this.detaformapagofactuConstantesFunciones.resaltarnombreDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setBorder(this.detaformapagofactuConstantesFunciones.resaltarnombreDetaFormaPagoFactu);}
		if(this.detaformapagofactuConstantesFunciones.resaltardescripcionDetaFormaPagoFactu!=null && this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setBorder(this.detaformapagofactuConstantesFunciones.resaltardescripcionDetaFormaPagoFactu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetaFormaPagoFactu() throws Exception {		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
	
		//this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostraridDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelidDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostraridDetaFormaPagoFactu);
		//this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarid_empresaDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelid_empresaDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarid_empresaDetaFormaPagoFactu);
		//this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarid_tipo_forma_pagoDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelid_tipo_forma_pagoDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarid_tipo_forma_pagoDetaFormaPagoFactu);
		//this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarnombreDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPanelnombreDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrarnombreDetaFormaPagoFactu);
		//this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrardescripcionDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jPaneldescripcionDetaFormaPagoFactu.setVisible(this.detaformapagofactuConstantesFunciones.mostrardescripcionDetaFormaPagoFactu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetaFormaPagoFactu() throws Exception {
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetaFormaPagoFactu!=null) {
	
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jLabelidDetaFormaPagoFactu.setEnabled(this.detaformapagofactuConstantesFunciones.activaridDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_empresaDetaFormaPagoFactu.setEnabled(this.detaformapagofactuConstantesFunciones.activarid_empresaDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jComboBoxid_tipo_forma_pagoDetaFormaPagoFactu.setEnabled(this.detaformapagofactuConstantesFunciones.activarid_tipo_forma_pagoDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreanombreDetaFormaPagoFactu.setEnabled(this.detaformapagofactuConstantesFunciones.activarnombreDetaFormaPagoFactu);
		this.jInternalFrameDetalleFormDetaFormaPagoFactu.jTextAreadescripcionDetaFormaPagoFactu.setEnabled(this.detaformapagofactuConstantesFunciones.activardescripcionDetaFormaPagoFactu);
		}
	}
	
		
}