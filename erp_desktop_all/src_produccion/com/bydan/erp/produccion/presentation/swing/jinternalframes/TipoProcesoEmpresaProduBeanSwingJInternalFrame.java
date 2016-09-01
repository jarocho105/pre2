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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.TipoProcesoEmpresaProduConstantesFunciones;
import com.bydan.erp.produccion.util.TipoProcesoEmpresaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoProcesoEmpresaProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoProcesoEmpresaProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProcesoEmpresaProduBeanSwingJInternalFrame extends TipoProcesoEmpresaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProcesoEmpresaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProcesoEmpresaProdu> tipoprocesoempresaproduValidator = new ClassValidator<TipoProcesoEmpresaProdu>(TipoProcesoEmpresaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProcesoEmpresaProdu tipoprocesoempresaprodu;	
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduAux;
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduTotales;
	public Long idTipoProcesoEmpresaProduActual;
	public Long iIdNuevoTipoProcesoEmpresaProdu=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosProductoProduMano=false;

	public Boolean getIsTienePermisosProductoProduMano() {
		return isTienePermisosProductoProduMano;
	}

	public void setIsTienePermisosProductoProduMano(Boolean isTienePermisosProductoProduMano) {
		this.isTienePermisosProductoProduMano= isTienePermisosProductoProduMano;
	}


	public Boolean isTienePermisosProductoOrdenDetaProduMano=false;

	public Boolean getIsTienePermisosProductoOrdenDetaProduMano() {
		return isTienePermisosProductoOrdenDetaProduMano;
	}

	public void setIsTienePermisosProductoOrdenDetaProduMano(Boolean isTienePermisosProductoOrdenDetaProduMano) {
		this.isTienePermisosProductoOrdenDetaProduMano= isTienePermisosProductoOrdenDetaProduMano;
	}


	public Boolean isTienePermisosProductoOrdenDetaProduMaquina=false;

	public Boolean getIsTienePermisosProductoOrdenDetaProduMaquina() {
		return isTienePermisosProductoOrdenDetaProduMaquina;
	}

	public void setIsTienePermisosProductoOrdenDetaProduMaquina(Boolean isTienePermisosProductoOrdenDetaProduMaquina) {
		this.isTienePermisosProductoOrdenDetaProduMaquina= isTienePermisosProductoOrdenDetaProduMaquina;
	}


	public Boolean isTienePermisosProductoProduMaquina=false;

	public Boolean getIsTienePermisosProductoProduMaquina() {
		return isTienePermisosProductoProduMaquina;
	}

	public void setIsTienePermisosProductoProduMaquina(Boolean isTienePermisosProductoProduMaquina) {
		this.isTienePermisosProductoProduMaquina= isTienePermisosProductoProduMaquina;
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
	
	public Boolean isPermisoTodoTipoProcesoEmpresaProdu;
	public Boolean isPermisoNuevoTipoProcesoEmpresaProdu;
	public Boolean isPermisoActualizarTipoProcesoEmpresaProdu;
	public Boolean isPermisoActualizarOriginalTipoProcesoEmpresaProdu;
	public Boolean isPermisoEliminarTipoProcesoEmpresaProdu;
	public Boolean isPermisoGuardarCambiosTipoProcesoEmpresaProdu;
	public Boolean isPermisoConsultaTipoProcesoEmpresaProdu;
	public Boolean isPermisoBusquedaTipoProcesoEmpresaProdu;
	public Boolean isPermisoReporteTipoProcesoEmpresaProdu;
	public Boolean isPermisoPaginacionMedioTipoProcesoEmpresaProdu;
	public Boolean isPermisoPaginacionAltoTipoProcesoEmpresaProdu;
	public Boolean isPermisoPaginacionTodoTipoProcesoEmpresaProdu;
	public Boolean isPermisoCopiarTipoProcesoEmpresaProdu;
	public Boolean isPermisoVerFormTipoProcesoEmpresaProdu;
	public Boolean isPermisoDuplicarTipoProcesoEmpresaProdu;
	public Boolean isPermisoOrdenTipoProcesoEmpresaProdu;
	
	
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
	
	public TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduReturnGeneral;
	public TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduParameterGeneral;
	
	

	public ProductoProduManoLogic productoprodumanoLogic=null;

	public ProductoProduManoLogic getProductoProduManoLogic() {
		return productoprodumanoLogic;
	}

	public void setProductoProduManoLogic(ProductoProduManoLogic productoprodumanoLogic) {
		this.productoprodumanoLogic = productoprodumanoLogic;
	}


	public ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic=null;

	public ProductoOrdenDetaProduManoLogic getProductoOrdenDetaProduManoLogic() {
		return productoordendetaprodumanoLogic;
	}

	public void setProductoOrdenDetaProduManoLogic(ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic) {
		this.productoordendetaprodumanoLogic = productoordendetaprodumanoLogic;
	}


	public ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic=null;

	public ProductoOrdenDetaProduMaquinaLogic getProductoOrdenDetaProduMaquinaLogic() {
		return productoordendetaprodumaquinaLogic;
	}

	public void setProductoOrdenDetaProduMaquinaLogic(ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic) {
		this.productoordendetaprodumaquinaLogic = productoordendetaprodumaquinaLogic;
	}


	public ProductoProduMaquinaLogic productoprodumaquinaLogic=null;

	public ProductoProduMaquinaLogic getProductoProduMaquinaLogic() {
		return productoprodumaquinaLogic;
	}

	public void setProductoProduMaquinaLogic(ProductoProduMaquinaLogic productoprodumaquinaLogic) {
		this.productoprodumaquinaLogic = productoprodumaquinaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProcesoEmpresaProdu=false;
	public Boolean esParaAccionDesdeFormularioTipoProcesoEmpresaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoProcesoEmpresaProduSessionBeanAdditional tipoprocesoempresaproduSessionBeanAdditional=null;
	
	public TipoProcesoEmpresaProduSessionBeanAdditional getTipoProcesoEmpresaProduSessionBeanAdditional() {
		return this.tipoprocesoempresaproduSessionBeanAdditional;
	}
	
	public void setTipoProcesoEmpresaProduSessionBeanAdditional(TipoProcesoEmpresaProduSessionBeanAdditional tipoprocesoempresaproduSessionBeanAdditional) {
		try {
			this.tipoprocesoempresaproduSessionBeanAdditional=tipoprocesoempresaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional tipoprocesoempresaproduBeanSwingJInternalFrameAdditional=null;
	//public class TipoProcesoEmpresaProduBeanSwingJInternalFrame
	
	public TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional getTipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional() {
		return this.tipoprocesoempresaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional(TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional tipoprocesoempresaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoprocesoempresaproduBeanSwingJInternalFrameAdditional=tipoprocesoempresaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduBean;
	public TipoProcesoEmpresaProduConstantesFunciones tipoprocesoempresaproduConstantesFunciones;
	//public TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus;	
	//public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusEliminados;
	//public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoProcesoEmpresaProdu() {
		return this.iIdNuevoTipoProcesoEmpresaProdu;
	}

	public void setiIdNuevoTipoProcesoEmpresaProdu(Long iIdNuevoTipoProcesoEmpresaProdu) {
		this.iIdNuevoTipoProcesoEmpresaProdu = iIdNuevoTipoProcesoEmpresaProdu;
	}
	
	public Long getidTipoProcesoEmpresaProduActual() {
		return this.idTipoProcesoEmpresaProduActual;
	}

	public void setidTipoProcesoEmpresaProduActual(Long idTipoProcesoEmpresaProduActual) {
		this.idTipoProcesoEmpresaProduActual = idTipoProcesoEmpresaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProcesoEmpresaProdu gettipoprocesoempresaprodu() {
		return this.tipoprocesoempresaprodu;
	}

	public void settipoprocesoempresaprodu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) {
		this.tipoprocesoempresaprodu = tipoprocesoempresaprodu;
	}
	
	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduAux() {
		return this.tipoprocesoempresaproduAux;
	}

	public void settipoprocesoempresaproduAux(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux) {
		this.tipoprocesoempresaproduAux = tipoprocesoempresaproduAux;
	}				
	
	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduAnterior() {
		return this.tipoprocesoempresaproduAnterior;
	}

	public void settipoprocesoempresaproduAnterior(TipoProcesoEmpresaProdu tipoprocesoempresaproduAnterior) {
		this.tipoprocesoempresaproduAnterior = tipoprocesoempresaproduAnterior;
	}	
	
	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduTotales() {
		return this.tipoprocesoempresaproduTotales;
	}

	public void settipoprocesoempresaproduTotales(TipoProcesoEmpresaProdu tipoprocesoempresaproduTotales) {
		this.tipoprocesoempresaproduTotales = tipoprocesoempresaproduTotales;
	}	
	
	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduBean() {
		return this.tipoprocesoempresaproduBean;
	}

	public void settipoprocesoempresaproduBean(TipoProcesoEmpresaProdu tipoprocesoempresaproduBean) {
		this.tipoprocesoempresaproduBean = tipoprocesoempresaproduBean;
	}	
	
	public TipoProcesoEmpresaProduParameterReturnGeneral gettipoprocesoempresaproduReturnGeneral() {
		return this.tipoprocesoempresaproduReturnGeneral;
	}

	public void settipoprocesoempresaproduReturnGeneral(TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduReturnGeneral) {
		this.tipoprocesoempresaproduReturnGeneral = tipoprocesoempresaproduReturnGeneral;
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
	
	
	public TipoProcesoEmpresaProduLogic getTipoProcesoEmpresaProduLogic()	{		
		return tipoprocesoempresaproduLogic;
	}

	public void setTipoProcesoEmpresaProduLogic(TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic) {
		this.tipoprocesoempresaproduLogic = tipoprocesoempresaproduLogic;
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
	
	public Boolean getIsEsNuevoTipoProcesoEmpresaProdu() {
		return isEsNuevoTipoProcesoEmpresaProdu;
	}

	public void setIsEsNuevoTipoProcesoEmpresaProdu(Boolean isEsNuevoTipoProcesoEmpresaProdu) {
		this.isEsNuevoTipoProcesoEmpresaProdu = isEsNuevoTipoProcesoEmpresaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProcesoEmpresaProdu() {
		return esParaAccionDesdeFormularioTipoProcesoEmpresaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProcesoEmpresaProdu(Boolean esParaAccionDesdeFormularioTipoProcesoEmpresaProdu) {
		this.esParaAccionDesdeFormularioTipoProcesoEmpresaProdu = esParaAccionDesdeFormularioTipoProcesoEmpresaProdu;
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

			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(!this.tipoprocesoempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoprocesoempresaproduSessionBean.getlidEmpresaActual());
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

					if(this.tipoprocesoempresaprodu!=null) {
						this.tipoprocesoempresaprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
						if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoProcesoEmpresaProduGenerico)throws Exception
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
				jComboBoxid_empresaTipoProcesoEmpresaProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoProcesoEmpresaProduGenerico!=null && jComboBoxid_empresaTipoProcesoEmpresaProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoProcesoEmpresaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,JComboBox jComboBoxid_empresaTipoProcesoEmpresaProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoProcesoEmpresaProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoProcesoEmpresaProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoprocesoempresaprodu.setid_empresa(empresaAux.getId());
				tipoprocesoempresaprodu.setempresa_descripcion(TipoProcesoEmpresaProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoprocesoempresaprodu.setEmpresa(empresaAux);			}
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

					if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { 
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { 
					}

					if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProcesoEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProcesoEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(this.tipoprocesoempresaprodus);
			tipoprocesoempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProcesoEmpresaProduParameterReturnGeneral getTipoProcesoEmpresaProduParameterGeneral() {
		return this.tipoprocesoempresaproduParameterGeneral;
	}
	
	public void setTipoProcesoEmpresaProduParameterGeneral(TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduParameterGeneral) {
		this.tipoprocesoempresaproduParameterGeneral = tipoprocesoempresaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProcesoEmpresaProdu() {
		return isPermisoTodoTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoTodoTipoProcesoEmpresaProdu(Boolean isPermisoTodoTipoProcesoEmpresaProdu) {
		this.isPermisoTodoTipoProcesoEmpresaProdu = isPermisoTodoTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoNuevoTipoProcesoEmpresaProdu() {
		return isPermisoNuevoTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoNuevoTipoProcesoEmpresaProdu(Boolean isPermisoNuevoTipoProcesoEmpresaProdu) {
		this.isPermisoNuevoTipoProcesoEmpresaProdu = isPermisoNuevoTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoActualizarTipoProcesoEmpresaProdu() {
		return isPermisoActualizarTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoActualizarTipoProcesoEmpresaProdu(Boolean isPermisoActualizarTipoProcesoEmpresaProdu) {
		this.isPermisoActualizarTipoProcesoEmpresaProdu = isPermisoActualizarTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoEliminarTipoProcesoEmpresaProdu() {
		return isPermisoEliminarTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoEliminarTipoProcesoEmpresaProdu(Boolean isPermisoEliminarTipoProcesoEmpresaProdu) {
		this.isPermisoEliminarTipoProcesoEmpresaProdu = isPermisoEliminarTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProcesoEmpresaProdu() {
		return isPermisoGuardarCambiosTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoGuardarCambiosTipoProcesoEmpresaProdu(Boolean isPermisoGuardarCambiosTipoProcesoEmpresaProdu) {
		this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu = isPermisoGuardarCambiosTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoConsultaTipoProcesoEmpresaProdu() {
		return isPermisoConsultaTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoConsultaTipoProcesoEmpresaProdu(Boolean isPermisoConsultaTipoProcesoEmpresaProdu) {
		this.isPermisoConsultaTipoProcesoEmpresaProdu = isPermisoConsultaTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoBusquedaTipoProcesoEmpresaProdu() {
		return isPermisoBusquedaTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoBusquedaTipoProcesoEmpresaProdu(Boolean isPermisoBusquedaTipoProcesoEmpresaProdu) {
		this.isPermisoBusquedaTipoProcesoEmpresaProdu = isPermisoBusquedaTipoProcesoEmpresaProdu;
	}

	public Boolean getIsPermisoReporteTipoProcesoEmpresaProdu() {
		return isPermisoReporteTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoReporteTipoProcesoEmpresaProdu(Boolean isPermisoReporteTipoProcesoEmpresaProdu) {
		this.isPermisoReporteTipoProcesoEmpresaProdu = isPermisoReporteTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProcesoEmpresaProdu() {
		return isPermisoPaginacionMedioTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoPaginacionMedioTipoProcesoEmpresaProdu(Boolean isPermisoPaginacionMedioTipoProcesoEmpresaProdu) {
		this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu = isPermisoPaginacionMedioTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProcesoEmpresaProdu() {
		return isPermisoPaginacionTodoTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoPaginacionTodoTipoProcesoEmpresaProdu(Boolean isPermisoPaginacionTodoTipoProcesoEmpresaProdu) {
		this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu = isPermisoPaginacionTodoTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProcesoEmpresaProdu() {
		return isPermisoPaginacionAltoTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoPaginacionAltoTipoProcesoEmpresaProdu(Boolean isPermisoPaginacionAltoTipoProcesoEmpresaProdu) {
		this.isPermisoPaginacionAltoTipoProcesoEmpresaProdu = isPermisoPaginacionAltoTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoCopiarTipoProcesoEmpresaProdu() {
		return isPermisoCopiarTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoCopiarTipoProcesoEmpresaProdu(Boolean isPermisoCopiarTipoProcesoEmpresaProdu) {
		this.isPermisoCopiarTipoProcesoEmpresaProdu = isPermisoCopiarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoVerFormTipoProcesoEmpresaProdu() {
		return isPermisoVerFormTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoVerFormTipoProcesoEmpresaProdu(Boolean isPermisoVerFormTipoProcesoEmpresaProdu) {
		this.isPermisoVerFormTipoProcesoEmpresaProdu = isPermisoVerFormTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoProcesoEmpresaProdu() {
		return isPermisoDuplicarTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoDuplicarTipoProcesoEmpresaProdu(Boolean isPermisoDuplicarTipoProcesoEmpresaProdu) {
		this.isPermisoDuplicarTipoProcesoEmpresaProdu = isPermisoDuplicarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsPermisoOrdenTipoProcesoEmpresaProdu() {
		return isPermisoOrdenTipoProcesoEmpresaProdu;
	}

	public void setIsPermisoOrdenTipoProcesoEmpresaProdu(Boolean isPermisoOrdenTipoProcesoEmpresaProdu) {
		this.isPermisoOrdenTipoProcesoEmpresaProdu = isPermisoOrdenTipoProcesoEmpresaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu = isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu = isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu = isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu = isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu = isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu = isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaModificarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaModificarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaModificarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu = isVisibilidadCeldaModificarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu = isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu = isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu = isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu = isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu() {
		return isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu(Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu = isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu;
	}
		
	public TipoProcesoEmpresaProduSessionBean gettipoprocesoempresaproduSessionBean() {
		return this.tipoprocesoempresaproduSessionBean;
	}
	
	public void settipoprocesoempresaproduSessionBean(TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean) {
		this.tipoprocesoempresaproduSessionBean=tipoprocesoempresaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoprocesoempresaprodu,null);
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
	
	public void bugActualizarReferenciaActual(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,TipoProcesoEmpresaProdu tipoprocesoempresaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProcesoEmpresaProdu(tipoprocesoempresaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprocesoempresaproduAux.setId(tipoprocesoempresaprodu.getId());
		tipoprocesoempresaproduAux.setVersionRow(tipoprocesoempresaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProcesoEmpresaProdu();
		
			int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprocesoempresaproduValidator.getInvalidValues(this.tipoprocesoempresaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprocesoempresaproduLogic.setDatosCliente(datosCliente);
			tipoprocesoempresaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprocesoempresaproduAux=new  TipoProcesoEmpresaProdu();
				
				tipoprocesoempresaproduAux.setIsNew(true);
				tipoprocesoempresaproduAux.setIsChanged(true);
				
				tipoprocesoempresaproduAux.setTipoProcesoEmpresaProduOriginal(this.tipoprocesoempresaprodu);
				
				tipoprocesoempresaproduAux.setId(this.tipoprocesoempresaprodu.getId());	
				tipoprocesoempresaproduAux.setVersionRow(this.tipoprocesoempresaprodu.getVersionRow());	
				tipoprocesoempresaproduAux.setid_empresa(this.tipoprocesoempresaprodu.getid_empresa());	
				tipoprocesoempresaproduAux.setnombre(this.tipoprocesoempresaprodu.getnombre());	
				tipoprocesoempresaproduAux.setdescripcion(this.tipoprocesoempresaprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProdus();//WithConnection
						//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProduRelaciones(tipoprocesoempresaproduAux,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos= new ArrayList<ProductoOrdenDetaProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprocesoempresaproduAux=new  TipoProcesoEmpresaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoprocesoempresaprodu.getId()>=0)) {
						
					tipoprocesoempresaproduAux.setIsNew(false);
				}
				
				tipoprocesoempresaproduAux.setIsDeleted(false);
			
				tipoprocesoempresaproduAux.setId(this.tipoprocesoempresaprodu.getId());	
				tipoprocesoempresaproduAux.setVersionRow(this.tipoprocesoempresaprodu.getVersionRow());	
				tipoprocesoempresaproduAux.setid_empresa(this.tipoprocesoempresaprodu.getid_empresa());	
				tipoprocesoempresaproduAux.setnombre(this.tipoprocesoempresaprodu.getnombre());	
				tipoprocesoempresaproduAux.setdescripcion(this.tipoprocesoempresaprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProdus();//WithConnection
						//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProduRelaciones(tipoprocesoempresaproduAux,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos= new ArrayList<ProductoOrdenDetaProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprocesoempresaprodu,tipoprocesoempresaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprocesoempresaproduAux=new  TipoProcesoEmpresaProdu();
				
				tipoprocesoempresaproduAux.setIsNew(false);
				tipoprocesoempresaproduAux.setIsChanged(false);
				
				tipoprocesoempresaproduAux.setIsDeleted(true);
				
				tipoprocesoempresaproduAux.setId(this.tipoprocesoempresaprodu.getId());	
				tipoprocesoempresaproduAux.setVersionRow(this.tipoprocesoempresaprodu.getVersionRow());	
				tipoprocesoempresaproduAux.setid_empresa(this.tipoprocesoempresaprodu.getid_empresa());	
				tipoprocesoempresaproduAux.setnombre(this.tipoprocesoempresaprodu.getnombre());	
				tipoprocesoempresaproduAux.setdescripcion(this.tipoprocesoempresaprodu.getdescripcion());	
				
				if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprocesoempresaproduAux.getId()>=0) {	
						this.tipoprocesoempresaprodusEliminados.add(tipoprocesoempresaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProdus();//WithConnection
						//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanosEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProduRelaciones(tipoprocesoempresaproduAux,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos= new ArrayList<ProductoOrdenDetaProduMano>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprocesoempresaproduAux,tipoprocesoempresaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().addAll(this.tipoprocesoempresaprodusEliminados);
					
					tipoprocesoempresaproduLogic.saveTipoProcesoEmpresaProdus();//WithConnection
					//tipoprocesoempresaproduLogic.getSetVersionRowTipoProcesoEmpresaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu();
				
				this.tipoprocesoempresaprodusEliminados= new ArrayList<TipoProcesoEmpresaProdu>();		
			}
			
			if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Proceso Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprocesoempresaprodu=tipoprocesoempresaproduAux;
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
      		//this.finishProcessTipoProcesoEmpresaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal) throws Exception {
		
		if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprocesoempresaproduLocal.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());
				tipoprocesoempresaproduLocal.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				tipoprocesoempresaproduLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				tipoprocesoempresaproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
			
			} else {
			
				tipoprocesoempresaproduLocal.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos);
				tipoprocesoempresaproduLocal.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanos);
				tipoprocesoempresaproduLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas);
				tipoprocesoempresaproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal) throws Exception {	
		if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoprocesoempresaproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoProcesoEmpresaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprocesoempresaproduValidator.getInvalidValues(this.tipoprocesoempresaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus) throws Exception {
		try	{		
			TipoProcesoEmpresaProduConstantesFunciones.actualizarLista(tipoprocesoempresaprodu,tipoprocesoempresaprodus,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus) throws Exception {
		try	{			
			TipoProcesoEmpresaProduConstantesFunciones.actualizarSelectedLista(tipoprocesoempresaprodu,tipoprocesoempresaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprocesoempresaprodusLocal=this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprocesoempresaprodusLocal=this.tipoprocesoempresaprodus;
			}
			//ARCHITECTURE
		
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal:tipoprocesoempresaprodusLocal) {
				if(this.permiteMantenimiento(tipoprocesoempresaproduLocal) && tipoprocesoempresaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProcesoEmpresaProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelid_empresaTipoProcesoEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProcesoEmpresaProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelnombreTipoProcesoEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProcesoEmpresaProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabeldescripcionTipoProcesoEmpresaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelid_empresaTipoProcesoEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelnombreTipoProcesoEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabeldescripcionTipoProcesoEmpresaProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoProduMano")) {
			if(this.tipoprocesoempresaprodu==null) {
				this.tipoprocesoempresaprodu= new TipoProcesoEmpresaProdu();
			}

			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProcesoEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);

				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.getproductoprodumano().setTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoOrdenDetaProduMano")) {
			if(this.tipoprocesoempresaprodu==null) {
				this.tipoprocesoempresaprodu= new TipoProcesoEmpresaProdu();
			}

			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProcesoEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);

				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.getproductoordendetaprodumano().setTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			if(this.tipoprocesoempresaprodu==null) {
				this.tipoprocesoempresaprodu= new TipoProcesoEmpresaProdu();
			}

			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProcesoEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);

				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getproductoordendetaprodumaquina().setTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduMaquina")) {
			if(this.tipoprocesoempresaprodu==null) {
				this.tipoprocesoempresaprodu= new TipoProcesoEmpresaProdu();
			}

			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProcesoEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);

				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getproductoprodumaquina().setTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProcesoEmpresaProdu--;	
		
		
		this.tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();
		
		this.tipoprocesoempresaproduAux.setId(this.iIdNuevoTipoProcesoEmpresaProdu);
		this.tipoprocesoempresaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().add(this.tipoprocesoempresaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprocesoempresaprodus.add(this.tipoprocesoempresaproduAux);
		}
		//ARCHITECTURE
		
		this.tipoprocesoempresaprodu=this.tipoprocesoempresaproduAux;
		
		if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
		}
				
		//this.setDefaultControlesTipoProcesoEmpresaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoEmpresaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduBean,this.tipoprocesoempresaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
			classes=TipoProcesoEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.procesarEventosTipoProcesoEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this.tipoprocesoempresaprodu,this.tipoprocesoempresaproduParameterGeneral,this.isEsNuevoTipoProcesoEmpresaProdu,classes);//this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral,this.tipoprocesoempresaproduBean,false);
		
		if(this.tipoprocesoempresaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu());
		}
		
		if(this.tipoprocesoempresaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu(),classes);//this.tipoprocesoempresaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProcesoEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProcesoEmpresaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.RecargarFormTipoProcesoEmpresaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
						
			if(tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado() && ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduManoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduManoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();
			}
			
			this.actualizarVisualTableDatosTipoProcesoEmpresaProdu();
			
			this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoEmpresaProdu(), this.getIndiceNuevoTipoProcesoEmpresaProdu());
			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
						
			this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setEnabled(isHabilitar && this.tipoprocesoempresaproduConstantesFunciones.activarnombreTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setEnabled(isHabilitar && this.tipoprocesoempresaproduConstantesFunciones.activardescripcionTipoProcesoEmpresaProdu);	
		//
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setEnabled(isHabilitar && this.tipoprocesoempresaproduConstantesFunciones.activarid_empresaTipoProcesoEmpresaProdu);
	};
	
	public void setDefaultControlesTipoProcesoEmpresaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProcesoEmpresaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(true);			
			this.tipoprocesoempresaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(false);			
			this.tipoprocesoempresaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProcesoEmpresaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				if(tipoprocesoempresaproduAux.getId().equals(this.iIdNuevoTipoProcesoEmpresaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaprodus) {
				if(tipoprocesoempresaproduAux.getId().equals(this.iIdNuevoTipoProcesoEmpresaProdu)) {
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
	
	public int getIndiceActualTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				if(tipoprocesoempresaproduAux.getId().equals(tipoprocesoempresaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaprodus) {
				if(tipoprocesoempresaproduAux.getId().equals(tipoprocesoempresaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				if(tipoprocesoempresaproduAux.getTipoProcesoEmpresaProduOriginal().getId().equals(tipoprocesoempresaproduOriginal.getId())) {
					existe=true;
					tipoprocesoempresaproduOriginal.setId(tipoprocesoempresaproduAux.getId());
					tipoprocesoempresaproduOriginal.setVersionRow(tipoprocesoempresaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaprodus) {
				if(tipoprocesoempresaproduAux.getTipoProcesoEmpresaProduOriginal().getId().equals(tipoprocesoempresaproduOriginal.getId())) {
					existe=true;
					tipoprocesoempresaproduOriginal.setId(tipoprocesoempresaproduAux.getId());
					tipoprocesoempresaproduOriginal.setVersionRow(tipoprocesoempresaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProcesoEmpresaProdu(Boolean esParaCancelar) throws Exception {
		tipoprocesoempresaprodusAux=new ArrayList<TipoProcesoEmpresaProdu>();
		tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
					if(tipoprocesoempresaproduAux.getId()<0) {
						tipoprocesoempresaprodusAux.add(tipoprocesoempresaproduAux);
					}		
				}
				this.iIdNuevoTipoProcesoEmpresaProdu=0L;
				this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().removeAll(tipoprocesoempresaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaprodus) {
					if(tipoprocesoempresaproduAux.getId()<0) {
						tipoprocesoempresaprodusAux.add(tipoprocesoempresaproduAux);
					}		
				}
				this.iIdNuevoTipoProcesoEmpresaProdu=0L;
				this.tipoprocesoempresaprodus.removeAll(tipoprocesoempresaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoEmpresaProdu 
					&& this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()>0
					) {
					tipoprocesoempresaproduAux=this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().get(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size() - 1);
				
					if(tipoprocesoempresaproduAux.getId()<0) {
						this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().remove(tipoprocesoempresaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoEmpresaProdu && this.tipoprocesoempresaprodus.size()>0) {
					tipoprocesoempresaproduAux=this.tipoprocesoempresaprodus.get(this.tipoprocesoempresaprodus.size() - 1);
				
					if(tipoprocesoempresaproduAux.getId()<0) {
						this.tipoprocesoempresaprodus.remove(tipoprocesoempresaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProcesoEmpresaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprocesoempresaprodu.getId()<0) {
				this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().remove(this.tipoprocesoempresaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprocesoempresaprodu.getId()<0) {
				this.tipoprocesoempresaprodus.remove(this.tipoprocesoempresaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProcesoEmpresaProdu(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusAux) throws Exception {
		TipoProcesoEmpresaProduConstantesFunciones.setEstadosInicialesTipoProcesoEmpresaProdu(tipoprocesoempresaprodusAux);
	}
	
	public void setEstadosInicialesTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux) throws Exception {
		TipoProcesoEmpresaProduConstantesFunciones.setEstadosInicialesTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProcesoEmpresaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProcesoEmpresaProduActual()) {
				if(!this.isEsNuevoTipoProcesoEmpresaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProcesoEmpresaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProcesoEmpresaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Proceso Empresa ?", "MANTENIMIENTO DE Tipo Proceso Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception {
		TipoProcesoEmpresaProduConstantesFunciones.seleccionarAsignar(this.tipoprocesoempresaprodu,tipoprocesoempresaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProcesoEmpresaProdu=this.isPermisoActualizarOriginalTipoProcesoEmpresaProdu;
			
			
			this.seleccionarAsignar(tipoprocesoempresaprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProcesoEmpresaProduConstantesFunciones.quitarEspaciosTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprocesoempresaproduSessionBean.setsFuncionBusquedaRapida(this.tipoprocesoempresaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProcesoEmpresaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProcesoEmpresaProdu(esParaCancelar);				
				this.cancelarNuevoTipoProcesoEmpresaProdu(esParaCancelar);								
			}
			
			this.tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
			
			this.inicializarTipoProcesoEmpresaProdu();
			
			this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProcesoEmpresaProdu() throws Exception {
		try {
			TipoProcesoEmpresaProduConstantesFunciones.inicializarTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProcesoEmpresaProdus(String sAccionBusqueda,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProcesoEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProcesoEmpresaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProcesoEmpresaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProcesoEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Proceso Empresas");		
		parameters.put("busquedapor", TipoProcesoEmpresaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoProduMano.class));
			classes.add(new Classe(ProductoOrdenDetaProduMano.class));
			classes.add(new Classe(ProductoOrdenDetaProduMaquina.class));
			classes.add(new Classe(ProductoProduMaquina.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogicAuxiliar=new TipoProcesoEmpresaProduLogic();
					tipoprocesoempresaproduLogicAuxiliar.setDatosCliente(tipoprocesoempresaproduLogic.getDatosCliente());				
					tipoprocesoempresaproduLogicAuxiliar.setTipoProcesoEmpresaProdus(tipoprocesoempresaprodusParaReportes);
					
					tipoprocesoempresaproduLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProcesoEmpresaProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprocesoempresaprodusParaReportes=tipoprocesoempresaproduLogicAuxiliar.getTipoProcesoEmpresaProdus();
					
					//tipoprocesoempresaproduLogic.getNewConnexionToDeep();
					
					//for (TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaprodusParaReportes) {
					//	tipoprocesoempresaproduLogic.deepLoad(tipoprocesoempresaprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProductoProduMano = AuxiliarReportes.class.getResourceAsStream("ProductoProduManoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumano", reportFileProductoProduMano);

			InputStream reportFileProductoOrdenDetaProduMano = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduManoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoordendetaprodumano", reportFileProductoOrdenDetaProduMano);

			InputStream reportFileProductoOrdenDetaProduMaquina = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduMaquinaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoordendetaprodumaquina", reportFileProductoOrdenDetaProduMaquina);

			InputStream reportFileProductoProduMaquina = AuxiliarReportes.class.getResourceAsStream("ProductoProduMaquinaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumaquina", reportFileProductoProduMaquina);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProcesoEmpresaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProcesoEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProcesoEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProcesoEmpresaProdu=new JRBeanArrayDataSource(TipoProcesoEmpresaProduJInternalFrame.TraerTipoProcesoEmpresaProduBeans(tipoprocesoempresaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProcesoEmpresaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProcesoEmpresaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProcesoEmpresaProduBean.TraerTipoProcesoEmpresaProduBeans(tipoprocesoempresaprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProduActionPerformed(null);
					//this.generarExcelReporteTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProcesoEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoempresaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProcesoEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoEmpresaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoEmpresaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu : tipoprocesoempresaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProcesoEmpresaProduConstantesFunciones.generarExcelReporteDataTipoProcesoEmpresaProdu("NORMAL",row,workbook,tipoprocesoempresaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProcesoEmpresaProdu(String sTipo,Row row,Workbook workbook) {
		
		TipoProcesoEmpresaProduConstantesFunciones.generarExcelReporteHeaderTipoProcesoEmpresaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProcesoEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu : tipoprocesoempresaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoempresaprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoempresaprodu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoempresaprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProcesoEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusRespaldo=null;
		
		classes=TipoProcesoEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprocesoempresaproduLogic.setDatosCliente(this.datosCliente);
		this.tipoprocesoempresaproduLogic.setDatosDeep(this.datosDeep);
		this.tipoprocesoempresaproduLogic.setIsConDeep(true);
		
		tipoprocesoempresaprodusRespaldo=this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();
		
		this.tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(tipoprocesoempresaprodusParaReportes);	
		this.tipoprocesoempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprocesoempresaprodusParaReportes=this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();
		this.tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(tipoprocesoempresaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoEmpresaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu : tipoprocesoempresaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProcesoEmpresaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProcesoEmpresaProduConstantesFunciones.generarExcelReporteDataTipoProcesoEmpresaProdu("NORMAL",row,workbook,tipoprocesoempresaprodu,cellStyleDataAux);
		
			
			


				//ProductoProduMano
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprocesoempresaprodu.getProductoProduManos()!=null && tipoprocesoempresaprodu.getProductoProduManos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduManoConstantesFunciones.generarExcelReporteHeaderProductoProduMano("RELACIONADO",row,workbook);
				}

				if(tipoprocesoempresaprodu.getProductoProduManos()!=null) {
					i2=0;
					for(ProductoProduMano productoprodumano : tipoprocesoempresaprodu.getProductoProduManos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduManoConstantesFunciones.generarExcelReporteDataProductoProduMano("RELACIONADO",row,workbook,productoprodumano,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoOrdenDetaProduMano
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos()!=null && tipoprocesoempresaprodu.getProductoOrdenDetaProduManos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoOrdenDetaProduManoConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMano("RELACIONADO",row,workbook);
				}

				if(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos()!=null) {
					i2=0;
					for(ProductoOrdenDetaProduMano productoordendetaprodumano : tipoprocesoempresaprodu.getProductoOrdenDetaProduManos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoOrdenDetaProduManoConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMano("RELACIONADO",row,workbook,productoordendetaprodumano,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoOrdenDetaProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas()!=null && tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas()!=null) {
					i2=0;
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMaquina("RELACIONADO",row,workbook,productoordendetaprodumaquina,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprocesoempresaprodu.getProductoProduMaquinas()!=null && tipoprocesoempresaprodu.getProductoProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipoprocesoempresaprodu.getProductoProduMaquinas()!=null) {
					i2=0;
					for(ProductoProduMaquina productoprodumaquina : tipoprocesoempresaprodu.getProductoProduMaquinas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduMaquinaConstantesFunciones.generarExcelReporteDataProductoProduMaquina("RELACIONADO",row,workbook,productoprodumaquina,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProcesoEmpresaProdu() throws Exception {		
		this.startProcessTipoProcesoEmpresaProdu(true);
	}
	
	public void startProcessTipoProcesoEmpresaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu ,this.jPanelParametrosReportesTipoProcesoEmpresaProdu, this.jScrollPanelDatosTipoProcesoEmpresaProdu,this.jPanelPaginacionTipoProcesoEmpresaProdu, this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu, this.jPanelAccionesTipoProcesoEmpresaProdu,this.jPanelAccionesFormularioTipoProcesoEmpresaProdu,this.jmenuBarTipoProcesoEmpresaProdu,this.jmenuBarDetalleTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoEmpresaProdu=this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoProcesoEmpresaProdu=this.jPanelParametrosReportesTipoProcesoEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoProcesoEmpresaProdu=this.jScrollPanelDatosTipoProcesoEmpresaProdu;
		final JTable jTableDatosTipoProcesoEmpresaProdu=this.jTableDatosTipoProcesoEmpresaProdu;		
		final JPanel jPanelPaginacionTipoProcesoEmpresaProdu=this.jPanelPaginacionTipoProcesoEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoEmpresaProdu=this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu;
		final JPanel jPanelAccionesTipoProcesoEmpresaProdu=this.jPanelAccionesTipoProcesoEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoProcesoEmpresaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelCamposTipoProcesoEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelAccionesFormularioTipoProcesoEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoProcesoEmpresaProdu=jPanelCamposAuxiliarTipoProcesoEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoProcesoEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoProcesoEmpresaProdu=this.jmenuBarTipoProcesoEmpresaProdu;
		final JToolBar jTtoolBarTipoProcesoEmpresaProdu=this.jTtoolBarTipoProcesoEmpresaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuBarDetalleTipoProcesoEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTtoolBarDetalleTipoProcesoEmpresaProdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoEmpresaProdu=jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoProcesoEmpresaProdu=jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoProcesoEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProcesoEmpresaProdu ,jPanelParametrosReportesTipoProcesoEmpresaProdu,jTableDatosTipoProcesoEmpresaProdu, /*jScrollPanelDatosTipoProcesoEmpresaProdu,*/jPanelCamposTipoProcesoEmpresaProdu,jPanelPaginacionTipoProcesoEmpresaProdu, /*jScrollPanelDatosEdicionTipoProcesoEmpresaProdu,*/ jPanelAccionesTipoProcesoEmpresaProdu,jPanelAccionesFormularioTipoProcesoEmpresaProdu,jmenuBarTipoProcesoEmpresaProdu,jmenuBarDetalleTipoProcesoEmpresaProdu,jTtoolBarTipoProcesoEmpresaProdu,jTtoolBarDetalleTipoProcesoEmpresaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProcesoEmpresaProdu ,jPanelParametrosReportesTipoProcesoEmpresaProdu, jScrollPanelDatosTipoProcesoEmpresaProdu,jPanelPaginacionTipoProcesoEmpresaProdu, jScrollPanelDatosEdicionTipoProcesoEmpresaProdu, jPanelAccionesTipoProcesoEmpresaProdu,jPanelAccionesFormularioTipoProcesoEmpresaProdu,jmenuBarTipoProcesoEmpresaProdu,jmenuBarDetalleTipoProcesoEmpresaProdu,jTtoolBarTipoProcesoEmpresaProdu,jTtoolBarDetalleTipoProcesoEmpresaProdu);
						
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
	
	public void finishProcessTipoProcesoEmpresaProdu() {// throws Exception 
		this.finishProcessTipoProcesoEmpresaProdu(true);
	}
	
	public void finishProcessTipoProcesoEmpresaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu ,this.jPanelParametrosReportesTipoProcesoEmpresaProdu, this.jScrollPanelDatosTipoProcesoEmpresaProdu,this.jPanelPaginacionTipoProcesoEmpresaProdu, this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu, this.jPanelAccionesTipoProcesoEmpresaProdu,this.jPanelAccionesFormularioTipoProcesoEmpresaProdu,this.jmenuBarTipoProcesoEmpresaProdu,this.jmenuBarDetalleTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoEmpresaProdu=this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoProcesoEmpresaProdu=this.jPanelParametrosReportesTipoProcesoEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoProcesoEmpresaProdu=this.jScrollPanelDatosTipoProcesoEmpresaProdu;
		final JTable jTableDatosTipoProcesoEmpresaProdu=this.jTableDatosTipoProcesoEmpresaProdu;		
		final JPanel jPanelPaginacionTipoProcesoEmpresaProdu=this.jPanelPaginacionTipoProcesoEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoEmpresaProdu=this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu;
		final JPanel jPanelAccionesTipoProcesoEmpresaProdu=this.jPanelAccionesTipoProcesoEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoProcesoEmpresaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelCamposTipoProcesoEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelAccionesFormularioTipoProcesoEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoProcesoEmpresaProdu=jPanelCamposAuxiliarTipoProcesoEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoProcesoEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoProcesoEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoProcesoEmpresaProdu=this.jmenuBarTipoProcesoEmpresaProdu;		
		final JToolBar jTtoolBarTipoProcesoEmpresaProdu=this.jTtoolBarTipoProcesoEmpresaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuBarDetalleTipoProcesoEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTtoolBarDetalleTipoProcesoEmpresaProdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoEmpresaProdu=jmenuBarDetalleAuxiliarTipoProcesoEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoProcesoEmpresaProdu=jTtoolBarDetalleAuxiliarTipoProcesoEmpresaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoProcesoEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProcesoEmpresaProdu ,jPanelParametrosReportesTipoProcesoEmpresaProdu, jTableDatosTipoProcesoEmpresaProdu,/*jScrollPanelDatosTipoProcesoEmpresaProdu,*/jPanelCamposTipoProcesoEmpresaProdu,jPanelPaginacionTipoProcesoEmpresaProdu, /*jScrollPanelDatosEdicionTipoProcesoEmpresaProdu,*/ jPanelAccionesTipoProcesoEmpresaProdu,jPanelAccionesFormularioTipoProcesoEmpresaProdu,jmenuBarTipoProcesoEmpresaProdu,jmenuBarDetalleTipoProcesoEmpresaProdu,jTtoolBarTipoProcesoEmpresaProdu,jTtoolBarDetalleTipoProcesoEmpresaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProcesoEmpresaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProcesoEmpresaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProcesoEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProcesoEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProcesoEmpresaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProcesoEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProcesoEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProcesoEmpresaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprocesoempresaproduConstantesFunciones.getsFinalQueryTipoProcesoEmpresaProdu();
		String  finalQueryPaginacionTodos=this.tipoprocesoempresaproduConstantesFunciones.getsFinalQueryTipoProcesoEmpresaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesNoTipoProcesoEmpresaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprocesoempresaprodusEliminados= new ArrayList<TipoProcesoEmpresaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProcesoEmpresaProdu();
		
				///*TipoProcesoEmpresaProduSessionBean*/this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			
			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
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
					this.iNumeroPaginacion=TipoProcesoEmpresaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProcesoEmpresaProduConstantesFunciones.getClassesForeignKeysOfTipoProcesoEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprocesoempresaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprocesoempresaprodusAux= new ArrayList<TipoProcesoEmpresaProdu>();
			
				
			tipoprocesoempresaproduLogic.setDatosCliente(this.datosCliente);
			tipoprocesoempresaproduLogic.setDatosDeep(this.datosDeep);
			tipoprocesoempresaproduLogic.setIsConDeep(true);
			
			
			tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdus(finalQueryGlobal,pagination);
					
					//tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()==null|| tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoempresaprodusAux= new ArrayList<TipoProcesoEmpresaProdu>();
							tipoprocesoempresaprodusAux.addAll(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoempresaprodusAux= new ArrayList<TipoProcesoEmpresaProdu>();
							tipoprocesoempresaprodusAux.addAll(tipoprocesoempresaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdus(finalQueryGlobal+"",this.pagination);												
							
							//tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(new ArrayList<TipoProcesoEmpresaProdu>());					
							tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().addAll(tipoprocesoempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
							tipoprocesoempresaprodus.addAll(tipoprocesoempresaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProcesoEmpresaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProcesoEmpresaProdu=this.idActual;
				
				} else if(this.idTipoProcesoEmpresaProduActual!=null && this.idTipoProcesoEmpresaProduActual!=0L) {
					idTipoProcesoEmpresaProdu=idTipoProcesoEmpresaProduActual;
				}
				
					
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndicePorId(idTipoProcesoEmpresaProdu);
				
				this.tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprocesoempresaproduLogic.getEntity(idTipoProcesoEmpresaProdu);
					
					//tipoprocesoempresaproduLogic.getEntityWithConnection(idTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(new ArrayList<TipoProcesoEmpresaProdu>());
					tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().add(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
					this.tipoprocesoempresaprodus.add(tipoprocesoempresaprodu);
				}
				
				if(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()==null||tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprocesoempresaprodus==null|| tipoprocesoempresaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaprodusAux=new ArrayList<TipoProcesoEmpresaProdu>();
						tipoprocesoempresaprodusAux.addAll(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoempresaprodusAux=new ArrayList<TipoProcesoEmpresaProdu>();
							tipoprocesoempresaprodusAux.addAll(tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProcesoEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProcesoEmpresaProdus("FK_IdEmpresa",tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProcesoEmpresaProdus("FK_IdEmpresa",tipoprocesoempresaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(new ArrayList<TipoProcesoEmpresaProdu>());
						tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().addAll(tipoprocesoempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
							tipoprocesoempresaprodus.addAll(tipoprocesoempresaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProcesoEmpresaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProcesoEmpresaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoempresaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoempresaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) {
		Boolean permite=true;
		
		if(this.tipoprocesoempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProcesoEmpresaProduConstantesFunciones.getOrderByListaTipoProcesoEmpresaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProcesoEmpresaProduConstantesFunciones.getOrderByListaTipoProcesoEmpresaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				if(tipoprocesoempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoempresaproduTotales=tipoprocesoempresaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodus) {
				if(tipoprocesoempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoempresaproduTotales=tipoprocesoempresaprodu;
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
			this.tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();
			this.tipoprocesoempresaproduAux.setsType(Constantes2.S_TOTALES);
			this.tipoprocesoempresaproduAux.setIsNew(false);
			this.tipoprocesoempresaproduAux.setIsChanged(false);
			this.tipoprocesoempresaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProcesoEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this.tipoprocesoempresaproduAux);
				
				this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().add(this.tipoprocesoempresaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProcesoEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodus,this.tipoprocesoempresaproduAux);
				
				this.tipoprocesoempresaprodus.add(this.tipoprocesoempresaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprocesoempresaproduTotales=new TipoProcesoEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().remove(tipoprocesoempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesoempresaprodus.remove(tipoprocesoempresaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprocesoempresaproduTotales=new TipoProcesoEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				if(tipoprocesoempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoempresaproduTotales=tipoprocesoempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),tipoprocesoempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodus) {
				if(tipoprocesoempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoempresaproduTotales=tipoprocesoempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodus,tipoprocesoempresaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProcesoEmpresaProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoProcesoEmpresaProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoProcesoEmpresaProdu() {
		this.isPermisoTodoTipoProcesoEmpresaProdu=false;
		this.isPermisoNuevoTipoProcesoEmpresaProdu=false;
		this.isPermisoActualizarTipoProcesoEmpresaProdu=false;
		this.isPermisoActualizarOriginalTipoProcesoEmpresaProdu=false;
		this.isPermisoEliminarTipoProcesoEmpresaProdu=false;
		this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu=false;
		this.isPermisoConsultaTipoProcesoEmpresaProdu=false;
		this.isPermisoBusquedaTipoProcesoEmpresaProdu=false;
		this.isPermisoReporteTipoProcesoEmpresaProdu=false;		
		this.isPermisoOrdenTipoProcesoEmpresaProdu=false;		
		this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu=false;		
		this.isPermisoPaginacionAltoTipoProcesoEmpresaProdu=false;
		this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu=false;
		this.isPermisoCopiarTipoProcesoEmpresaProdu=false;		
		this.isPermisoVerFormTipoProcesoEmpresaProdu=false;		
		this.isPermisoDuplicarTipoProcesoEmpresaProdu=false;		
		this.isPermisoOrdenTipoProcesoEmpresaProdu=false;		
	}
	
	public void setPermisosUsuarioTipoProcesoEmpresaProdu(Boolean isPermiso) {
		this.isPermisoTodoTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoConsultaTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoBusquedaTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoReporteTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoCopiarTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoVerFormTipoProcesoEmpresaProdu=isPermiso;		
		this.isPermisoDuplicarTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoProcesoEmpresaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProcesoEmpresaProdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoProcesoEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu=isPermiso;
		//this.isPermisoConsultaTipoProcesoEmpresaProdu=isPermiso;
		//this.isPermisoBusquedaTipoProcesoEmpresaProdu=isPermiso;
		//this.isPermisoReporteTipoProcesoEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoProcesoEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProcesoEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu=isPermiso;		
		//this.isPermisoCopiarTipoProcesoEmpresaProdu=isPermiso;		
		//this.isPermisoDuplicarTipoProcesoEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoProcesoEmpresaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoEmpresaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoProduManoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProcesoEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoProduMano=false;
		this.isTienePermisosProductoProduMano=this.verificarGetPermisosUsuarioOpcionTipoProcesoEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduManoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoOrdenDetaProduMano=false;
		this.isTienePermisosProductoOrdenDetaProduMano=this.verificarGetPermisosUsuarioOpcionTipoProcesoEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoOrdenDetaProduMaquina=false;
		this.isTienePermisosProductoOrdenDetaProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoProcesoEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduMaquina=false;
		this.isTienePermisosProductoProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoProcesoEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProcesoEmpresaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoEmpresaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoProduMano=conPermiso;
		this.isTienePermisosProductoOrdenDetaProduMano=conPermiso;
		this.isTienePermisosProductoOrdenDetaProduMaquina=conPermiso;
		this.isTienePermisosProductoProduMaquina=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProcesoEmpresaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProcesoEmpresaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProcesoEmpresaProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoProduMano && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoOrdenDetaProduMano && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoOrdenDetaProduMaquina && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduMaquina && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProcesoEmpresaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProcesoEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProcesoEmpresaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProcesoEmpresaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProcesoEmpresaProdu=this.isPermisoActualizarTipoProcesoEmpresaProdu;
			this.isPermisoEliminarTipoProcesoEmpresaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProcesoEmpresaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProcesoEmpresaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProcesoEmpresaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProcesoEmpresaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProcesoEmpresaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProcesoEmpresaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProcesoEmpresaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProcesoEmpresaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProcesoEmpresaProdu.setToolTipText(this.jTableDatosTipoProcesoEmpresaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProcesoEmpresaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProcesoEmpresaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProcesoEmpresaProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Mano De Obra Produccion");
			reporte.setsDescripcion("Producto Mano De Obra Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoOrdenDetaProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden  Mano De Obra");
			reporte.setsDescripcion("Orden  Mano De Obra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden Maquina");
			reporte.setsDescripcion("Orden Maquina");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Maquina Produccion");
			reporte.setsDescripcion("Producto Maquina Produccion");
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
	public void inicializarCombosForeignKeyTipoProcesoEmpresaProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProcesoEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProcesoEmpresaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProcesoEmpresaProduListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoProcesoEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduReturnGeneral=new TipoProcesoEmpresaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoprocesoempresaproduConstantesFunciones.cargarid_empresaTipoProcesoEmpresaProdu)
					 || (this.esRecargarFks && this.tipoprocesoempresaproduConstantesFunciones.cargarid_empresaTipoProcesoEmpresaProdu)) {

					if(!this.tipoprocesoempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoprocesoempresaproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.cargarCombosLoteForeignKeyTipoProcesoEmpresaProdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoprocesoempresaproduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(!this.tipoprocesoempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProcesoEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoEmpresaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProcesoEmpresaProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProcesoEmpresaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProcesoEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoProcesoEmpresaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProcesoEmpresaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProcesoEmpresaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean(); 
		this.tipoprocesoempresaproduConstantesFunciones=new TipoProcesoEmpresaProduConstantesFunciones(); 
		this.tipoprocesoempresaproduBean=new TipoProcesoEmpresaProdu();//(this.tipoprocesoempresaproduConstantesFunciones); 		
		this.tipoprocesoempresaproduReturnGeneral=new TipoProcesoEmpresaProduParameterReturnGeneral(); 
		
		this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProcesoEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProcesoEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProcesoEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProcesoEmpresaProdu(true);
			
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
			
			this.tipoprocesoempresaproduConstantesFunciones=new TipoProcesoEmpresaProduConstantesFunciones(); 
			this.tipoprocesoempresaproduBean=new TipoProcesoEmpresaProdu();//this.tipoprocesoempresaproduConstantesFunciones); 			
			this.tipoprocesoempresaproduReturnGeneral=new TipoProcesoEmpresaProduParameterReturnGeneral(); 
		
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
			this.tipoprocesoempresaprodus = new ArrayList<TipoProcesoEmpresaProdu>();
			this.tipoprocesoempresaprodusAux = new ArrayList<TipoProcesoEmpresaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic=new TipoProcesoEmpresaProduLogic();
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprocesoempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu);	
					}
					
					if(this.jInternalFrameImportacionTipoProcesoEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoEmpresaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProcesoEmpresaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu);
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu);
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProcesoEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoEmpresaProdu);
					this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setVisible(false);
					this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoEmpresaProdu);
					this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setVisible(false);
					this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProcesoEmpresaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProcesoEmpresaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprocesoempresaproduReturnGeneral=new TipoProcesoEmpresaProduParameterReturnGeneral();
			
			this.tipoprocesoempresaproduParameterGeneral=new TipoProcesoEmpresaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoProduManoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProcesoEmpresaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProcesoEmpresaProdu(false);
			
			this.setPermisosUsuarioTipoProcesoEmpresaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProcesoEmpresaProduClasesRelacionadas();
			}
			
			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProcesoEmpresaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProcesoEmpresaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoEmpresaProdu();
			}
			
			if(!this.isPermisoBusquedaTipoProcesoEmpresaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu,this.isPermisoPaginacionMedioTipoProcesoEmpresaProdu,this.isPermisoPaginacionTodoTipoProcesoEmpresaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProcesoEmpresaProduConstantesFunciones.getTiposSeleccionarTipoProcesoEmpresaProdu());
				
				this.tiposColumnasSelect=TipoProcesoEmpresaProduConstantesFunciones.getTiposSeleccionarTipoProcesoEmpresaProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProcesoEmpresaProdu();				
				//this.tiposRelacionesSelect=TipoProcesoEmpresaProduConstantesFunciones.getTiposRelacionesTipoProcesoEmpresaProdu(true);
				
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
			//if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProcesoEmpresaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoProcesoEmpresaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoProcesoEmpresaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoEmpresaProdu() ;
			
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
			
			
			this.productoprodumanoLogic=new ProductoProduManoLogic();
			this.productoordendetaprodumanoLogic=new ProductoOrdenDetaProduManoLogic();
			this.productoordendetaprodumaquinaLogic=new ProductoOrdenDetaProduMaquinaLogic();
			this.productoprodumaquinaLogic=new ProductoProduMaquinaLogic(); 
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
				tipoprocesoempresaproduImplementable= (TipoProcesoEmpresaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprocesoempresaproduImplementableHome= (TipoProcesoEmpresaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprocesoempresaprodus= new ArrayList<TipoProcesoEmpresaProdu>();
			this.tipoprocesoempresaprodusEliminados= new ArrayList<TipoProcesoEmpresaProdu>();
						
			this.isEsNuevoTipoProcesoEmpresaProdu=false;
			this.esParaAccionDesdeFormularioTipoProcesoEmpresaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProcesoEmpresaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProcesoEmpresaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProcesoEmpresaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProcesoEmpresaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProcesoEmpresaProdu();
			}
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProcesoEmpresaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProcesoEmpresaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProcesoEmpresaProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProcesoEmpresaProdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Orden  Mano De Obraes")) {
					if(!ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProcesoEmpresaProdu();

						this.cargarParteTabPanelRelacionadaProductoOrdenDetaProduMano(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Orden Maquinaes")) {
					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProcesoEmpresaProdu();

						this.cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Mano De Obra Producciones")) {
					if(!ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProcesoEmpresaProdu();

						this.cargarParteTabPanelRelacionadaProductoProduMano(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Maquina Producciones")) {
					if(!ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProcesoEmpresaProdu();

						this.cargarParteTabPanelRelacionadaProductoProduMaquina(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProcesoEmpresaProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProductoOrdenDetaProduMano(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(false,true,iIndex);
		this.jButtonProductoOrdenDetaProduManoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMano();

		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(false,true,iIndex);
		this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();

		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMano(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMano(false,true,iIndex);
		this.jButtonProductoProduManoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMano();

		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(false,true,iIndex);
		this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMaquina();

		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoProduMano")) {
				int row=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
				jButtonProductoProduManoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoOrdenDetaProduMano")) {
				int row=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
				jButtonProductoOrdenDetaProduManoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
				int row=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
				jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduMaquina")) {
				int row=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
				jButtonProductoProduMaquinaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto Mano De Obra Produccion")) {

					if(this.isTienePermisosProductoProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Mano De Obra Producciones"+"("+ProductoProduManoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Mano De Obra Producciones");

						if(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduManoTipoProcesoEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduManoTipoProcesoEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduManoTipoProcesoEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMano"));

						

						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuDetalleTipoProcesoEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Orden  Mano De Obra")) {

					if(this.isTienePermisosProductoOrdenDetaProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden  Mano De Obraes"+"("+ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden  Mano De Obraes");

						if(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoOrdenDetaProduMano"));

						

						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuDetalleTipoProcesoEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Orden Maquina")) {

					if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden Maquinaes"+"("+ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden Maquinaes");

						if(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoOrdenDetaProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuDetalleTipoProcesoEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Maquina Produccion")) {

					if(this.isTienePermisosProductoProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Maquina Producciones"+"("+ProductoProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Maquina Producciones");

						if(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoProcesoEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoProcesoEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduMaquinaTipoProcesoEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jmenuDetalleTipoProcesoEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProcesoEmpresaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProcesoEmpresaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProcesoEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProcesoEmpresaProdu();
		
		this.cargarCombosFrameForeignKeyTipoProcesoEmpresaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProcesoEmpresaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProcesoEmpresaProdu();
		}
	}
	
	
	
	public void jButtonNuevoTipoProcesoEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			
			if(jTableDatosTipoProcesoEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoProcesoEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoProcesoEmpresaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProcesoEmpresaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProcesoEmpresaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(true);			
			//this.tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
			//this.tipoprocesoempresaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu() ;
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoEmpresaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprocesoempresaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);				
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProcesoEmpresaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRows().length;			
			}
			
			tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProcesoEmpresaProdu--;			
				//TipoProcesoEmpresaProdu tipoprocesoempresaproduAux= new TipoProcesoEmpresaProdu();			
				//tipoprocesoempresaproduAux.setId(this.iIdNuevoTipoProcesoEmpresaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProcesoEmpresaProdu tipoprocesoempresaproduOrigen=new TipoProcesoEmpresaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduOrigen : tipoprocesoempresaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprocesoempresaproduOrigen =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoempresaproduOrigen =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProcesoEmpresaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprocesoempresaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProcesoEmpresaProdu(tipoprocesoempresaproduOrigen,this.tipoprocesoempresaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().add(this.tipoprocesoempresaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodus.add(this.tipoprocesoempresaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
				
				this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoEmpresaProdu(), this.getIndiceNuevoTipoProcesoEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoProcesoEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();									
		
			TipoProcesoEmpresaProdu tipoprocesoempresaproduOrigen=new TipoProcesoEmpresaProdu();
			TipoProcesoEmpresaProdu tipoprocesoempresaproduDestino=new TipoProcesoEmpresaProdu();
				
			tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprocesoempresaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduOrigen =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesoempresaproduOrigen =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoempresaproduDestino =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesoempresaproduDestino =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprocesoempresaproduOrigen =tipoprocesoempresaprodusSeleccionados.get(0);
				tipoprocesoempresaproduDestino =tipoprocesoempresaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProcesoEmpresaProdu(tipoprocesoempresaproduOrigen,tipoprocesoempresaproduDestino,true,false);
				
				tipoprocesoempresaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesoempresaproduDestino,tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoempresaproduDestino,tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
				
				//this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoEmpresaProdu(), this.getIndiceNuevoTipoProcesoEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoProcesoEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProcesoEmpresaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(!isVisible);
			this.jPanelAccionesTipoProcesoEmpresaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProcesoEmpresaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProcesoEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProcesoEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProcesoEmpresaProdu();
			
			this.abrirFrameOrderByTipoProcesoEmpresaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProcesoEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProcesoEmpresaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoEmpresaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSize(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),TipoProcesoEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),TipoProcesoEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),TipoProcesoEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMano();
					}

					if(ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();
					}

					if(ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMano();
					}

					if(ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMaquina();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProcesoEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProcesoEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoProcesoEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoEmpresaProdu);
				this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setVisible(false);
				this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoEmpresaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProcesoEmpresaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProcesoEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProcesoEmpresaProdu==null) {
				
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu=new ImportacionJInternalFrame(TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoEmpresaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoEmpresaProdu);
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setVisible(false);
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSelected(false);


				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoEmpresaProdu"));
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoEmpresaProdu"));
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoEmpresaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProcesoEmpresaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu==null) {
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu);
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoEmpresaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoEmpresaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMano() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMano.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMano.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMano.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMano.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMano() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jContentPaneDetalleTipoProcesoEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProcesoEmpresaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoEmpresaProdu);
			
	       	this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.dispose();
			//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProcesoEmpresaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProcesoEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setVisible(true);
	        this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProcesoEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setVisible(true);
	        this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProcesoEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setVisible(false);
	        this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProcesoEmpresaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProcesoEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setVisible(false);
	        this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProcesoEmpresaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProcesoEmpresaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(true);
			//this.isEsNuevoTipoProcesoEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false) ;
			
			if(tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado() && ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduManoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduManoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoEmpresaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProcesoEmpresaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProcesoEmpresaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(true);
			//this.isEsNuevoTipoProcesoEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprocesoempresaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false) ;
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoEmpresaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoEmpresaProdu(false);
			
			//if(!this.isEsNuevoTipoProcesoEmpresaProdu) {								
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProcesoEmpresaProdu=true;
					this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
					this.isEsNuevoTipoProcesoEmpresaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProcesoEmpresaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProcesoEmpresaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(false);
			
												
				
				if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProcesoEmpresaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,tipoprocesoempresaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprocesoempresaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprocesoempresaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesoempresaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesoempresaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProcesoEmpresaProduModel) this.jTableDatosTipoProcesoEmpresaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProcesoEmpresaProdu=true;
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
				this.isEsNuevoTipoProcesoEmpresaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(false);
				
				
				
				if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProcesoEmpresaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProcesoEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoProcesoEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoProcesoEmpresaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProcesoEmpresaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(false) ;
			
			this.isEsNuevoTipoProcesoEmpresaProdu=false;
			
			if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProcesoEmpresaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
				
				//SI ES MANUAL
				if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProcesoEmpresaProdu--;			
			//TipoProcesoEmpresaProdu tipoprocesoempresaproduAux= new TipoProcesoEmpresaProdu();			
			//tipoprocesoempresaproduAux.setId(this.iIdNuevoTipoProcesoEmpresaProdu);
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProcesoEmpresaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
			
			this.tipoprocesoempresaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().add(this.tipoprocesoempresaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprocesoempresaprodus.add(this.tipoprocesoempresaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			
			this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoEmpresaProdu(), this.getIndiceNuevoTipoProcesoEmpresaProdu());
			
			int iLastRow =  this.jTableDatosTipoProcesoEmpresaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProcesoEmpresaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProcesoEmpresaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();
			}
			
			//this.abrirFrameTreeTipoProcesoEmpresaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Proceso EmpresaS ?", "MANTENIMIENTO DE Tipo Proceso Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProcesoEmpresaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.procesarImportacionTipoProcesoEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprocesoempresaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProcesoEmpresaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setFileImportacion(this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProcesoEmpresaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		

		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProcesoEmpresaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProcesoEmpresaProduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProcesoEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoempresaprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoempresaprodu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoempresaprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoProcesoEmpresaProdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoEmpresaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProcesoEmpresaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProcesoEmpresaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProcesoEmpresaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProcesoEmpresaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProcesoEmpresaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProcesoEmpresaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProcesoEmpresaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProcesoEmpresaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProcesoEmpresaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProcesoEmpresaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProcesoEmpresaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProcesoEmpresaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoEmpresaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoEmpresaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProcesoEmpresaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu();
		
		this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoEmpresaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoEmpresaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoEmpresaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoEmpresaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProcesoEmpresaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoEmpresaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoEmpresaProdu() throws Exception {
		try	{
			if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoEmpresaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoEmpresaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoEmpresaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoEmpresaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoEmpresaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProcesoEmpresaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProcesoEmpresaProdu(Boolean esInicializar) throws Exception {				
		if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoEmpresaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProcesoEmpresaProdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProcesoEmpresaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProcesoEmpresaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprocesoempresaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProcesoEmpresaProdu.setModel(new TipoProcesoEmpresaProduModel(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProcesoEmpresaProdu.setModel(new TipoProcesoEmpresaProduModel(this.tipoprocesoempresaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu!=null && this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProcesoEmpresaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoprocesoempresaproduConstantesFunciones.resaltarSeleccionarTipoProcesoEmpresaProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoprocesoempresaproduConstantesFunciones.resaltarSeleccionarTipoProcesoEmpresaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID));

		if(this.tipoprocesoempresaproduConstantesFunciones.mostraridTipoProcesoEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltaridTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activaridTipoProcesoEmpresaProdu,this,true,"idTipoProcesoEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltaridTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activaridTipoProcesoEmpresaProdu,this,true,"idTipoProcesoEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoprocesoempresaproduConstantesFunciones.mostrarid_empresaTipoProcesoEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoprocesoempresaproduConstantesFunciones.resaltarid_empresaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarid_empresaTipoProcesoEmpresaProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoprocesoempresaproduConstantesFunciones.resaltarid_empresaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarid_empresaTipoProcesoEmpresaProdu,false,"id_empresaTipoProcesoEmpresaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprocesoempresaproduConstantesFunciones.mostrarnombreTipoProcesoEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltarnombreTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activarnombreTipoProcesoEmpresaProdu,this,true,"nombreTipoProcesoEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltarnombreTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activarnombreTipoProcesoEmpresaProdu,this,true,"nombreTipoProcesoEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoprocesoempresaproduConstantesFunciones.mostrardescripcionTipoProcesoEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltardescripcionTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activardescripcionTipoProcesoEmpresaProdu,this,true,"descripcionTipoProcesoEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoempresaproduConstantesFunciones.resaltardescripcionTipoProcesoEmpresaProdu,this.tipoprocesoempresaproduConstantesFunciones.activardescripcionTipoProcesoEmpresaProdu,this,true,"descripcionTipoProcesoEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Mano De Obra Producciones");
				tableColumn.setHeaderValue("Producto Mano De Obra Producciones");
				tableColumn.setCellRenderer(new ProductoProduManoTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduManoTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduManoTipoProcesoEmpresaProdu));
				tableColumn.setCellEditor(new ProductoProduManoTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduManoTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduManoTipoProcesoEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoOrdenDetaProduMano && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden  Mano De Obraes");
				tableColumn.setHeaderValue("Orden  Mano De Obraes");
				tableColumn.setCellRenderer(new ProductoOrdenDetaProduManoTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu));
				tableColumn.setCellEditor(new ProductoOrdenDetaProduManoTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduManoTipoProcesoEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden Maquinaes");
				tableColumn.setHeaderValue("Orden Maquinaes");
				tableColumn.setCellRenderer(new ProductoOrdenDetaProduMaquinaTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu));
				tableColumn.setCellEditor(new ProductoOrdenDetaProduMaquinaTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoProcesoEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduMaquina && this.tipoprocesoempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoProcesoEmpresaProdu && !TipoProcesoEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Maquina Producciones");
				tableColumn.setHeaderValue("Producto Maquina Producciones");
				tableColumn.setCellRenderer(new ProductoProduMaquinaTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduMaquinaTipoProcesoEmpresaProdu));
				tableColumn.setCellEditor(new ProductoProduMaquinaTableCell(tipoprocesoempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoProcesoEmpresaProdu,this,this.tipoprocesoempresaproduConstantesFunciones.activarProductoProduMaquinaTipoProcesoEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProcesoEmpresaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProcesoEmpresaProdu.moveColumn(this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProcesoEmpresaProdu.moveColumn(this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProcesoEmpresaProdu.moveColumn(this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProcesoEmpresaProdu.moveColumn(this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProcesoEmpresaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProcesoEmpresaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProcesoEmpresaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProcesoEmpresaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProcesoEmpresaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProcesoEmpresaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprocesoempresaprodus.size()-1;
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
		//this.jTableDatosTipoProcesoEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProcesoEmpresaProdu();
			
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
				
				//this.isEsNuevoTipoProcesoEmpresaProdu=false;
					
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
				if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprocesoempresaprodu.getsType().equals("DUPLICADO")
				   || this.tipoprocesoempresaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProcesoEmpresaProdu=true;
				
				} else {
					this.isEsNuevoTipoProcesoEmpresaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprocesoempresaprodu.getId()>=0 && !this.tipoprocesoempresaprodu.getIsNew()) {						
						this.isEsNuevoTipoProcesoEmpresaProdu=false;
						
					} else {
						this.isEsNuevoTipoProcesoEmpresaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProcesoEmpresaProdu(esRelaciones);						
				
				this.seleccionarTipoProcesoEmpresaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprocesoempresaprodu.getId()<0) {
					this.isEsNuevoTipoProcesoEmpresaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProcesoEmpresaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProcesoEmpresaProdu(evt,rowIndex);
				}	
				
				if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProcesoEmpresaProdu: " + this.dDif); 
					}
				}								
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProcesoEmpresaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
					if(this.tipoprocesoempresaprodu.getId()>0) {
						this.tipoprocesoempresaprodu.setIsDeleted(true);
						
						this.tipoprocesoempresaprodusEliminados.add(this.tipoprocesoempresaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().remove(this.tipoprocesoempresaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodus.remove(this.tipoprocesoempresaprodu);				
					}
					
					
					((TipoProcesoEmpresaProduModel) this.jTableDatosTipoProcesoEmpresaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProcesoEmpresaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProcesoEmpresaProdu) {
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoprocesoempresaproduConstantesFunciones.cargarid_empresaTipoProcesoEmpresaProdu || this.tipoprocesoempresaproduConstantesFunciones.event_dependid_empresaTipoProcesoEmpresaProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoprocesoempresaprodu.getid_empresa());
									//this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoprocesoempresaprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoprocesoempresaprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoprocesoempresaprodu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProcesoEmpresaProdu(tipoprocesoempresaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(tipoprocesoempresaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProcesoEmpresaProdu(tipoprocesoempresaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoEmpresaProdu(tipoprocesoempresaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprocesoempresaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprocesoempresaproduLocal=this.tipoprocesoempresaprodu;
			} else {
				tipoprocesoempresaproduLocal=this.tipoprocesoempresaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprocesoempresaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(tipoprocesoempresaproduLocal,true);
					
					if(tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprocesoempresaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprocesoempresaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(tipoprocesoempresaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(tipoprocesoempresaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(tipoprocesoempresaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.getText()==null || this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.getText()=="" || this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setText("0");
			}

			if(conColumnasBase) {tipoprocesoempresaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelIdTipoProcesoEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesoempresaprodu.setnombre(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelnombreTipoProcesoEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesoempresaprodu.setdescripcion(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabeldescripcionTipoProcesoEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaproduBean,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaproduOrigen,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesoempresaproduOrigen.getId()!=null && !tipoprocesoempresaproduOrigen.getId().equals(0L))) {tipoprocesoempresaprodu.setId(tipoprocesoempresaproduOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprocesoempresaproduOrigen.getnombre()!=null && !tipoprocesoempresaproduOrigen.getnombre().equals(""))) {tipoprocesoempresaprodu.setnombre(tipoprocesoempresaproduOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoprocesoempresaproduOrigen.getdescripcion()!=null && !tipoprocesoempresaproduOrigen.getdescripcion().equals(""))) {tipoprocesoempresaprodu.setdescripcion(tipoprocesoempresaproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setText(tipoprocesoempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoEmpresaProdu(TipoProcesoEmpresaProduBean tipoprocesoempresaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setText(tipoprocesoempresaproduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setText(tipoprocesoempresaproduBean.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setText(tipoprocesoempresaproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProcesoEmpresaProdu(TipoProcesoEmpresaProduParameterReturnGeneral tipoprocesoempresaproduReturnGeneral,TipoProcesoEmpresaProduBean tipoprocesoempresaproduBean,Boolean conDefault) throws Exception { 
		try {
			TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal=new TipoProcesoEmpresaProdu();
			
			tipoprocesoempresaproduLocal=tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesoempresaproduLocal.getId()!=null && !tipoprocesoempresaproduLocal.getId().equals(0L))) {tipoprocesoempresaproduBean.setId(tipoprocesoempresaproduLocal.getId());}}
			if(conDefault || (!conDefault && tipoprocesoempresaproduLocal.getnombre()!=null && !tipoprocesoempresaproduLocal.getnombre().equals(""))) {tipoprocesoempresaproduBean.setnombre(tipoprocesoempresaproduLocal.getnombre());}
			if(conDefault || (!conDefault && tipoprocesoempresaproduLocal.getdescripcion()!=null && !tipoprocesoempresaproduLocal.getdescripcion().equals(""))) {tipoprocesoempresaproduBean.setdescripcion(tipoprocesoempresaproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProcesoEmpresaProduGenerico(Long idTipoProcesoEmpresaProduSeleccionado,JComboBox jComboBoxTipoProcesoEmpresaProdu,List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusLocal)throws Exception {
		try {
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusLocal) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}

			jComboBoxTipoProcesoEmpresaProdu.setSelectedItem(tipoprocesoempresaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProcesoEmpresaProduGenerico(JComboBox jComboBoxTipoProcesoEmpresaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoEmpresaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProcesoEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoEmpresaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProcesoEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProductoProduMano")) {
			jButtonProductoProduManoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoOrdenDetaProduMano")) {
			jButtonProductoOrdenDetaProduManoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduMaquina")) {
			jButtonProductoProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoempresaprodu=(TipoProcesoEmpresaProdu) tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) tipoprocesoempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoprocesoempresaprodu.getIsNew() && !tipoprocesoempresaprodu.getIsChanged() && !tipoprocesoempresaprodu.getIsDeleted()) {
				sDescripcion=tipoprocesoempresaprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprocesoempresaprodu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProcesoEmpresaProdu tipoprocesoempresaproduRow=new TipoProcesoEmpresaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoempresaproduRow=(TipoProcesoEmpresaProdu) tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesoempresaproduRow=(TipoProcesoEmpresaProdu) tipoprocesoempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoProduManoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprocesoempresaprodu!=null) {
						this.tipoprocesoempresaprodu = tipoprocesoempresaprodu;
					} else {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoProduMano && this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
					ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup=new ProductoProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup;
					} else {
						productoprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame;
					}

					List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
					tipoprocesoempresaprodus.add(this.tipoprocesoempresaprodu);
					if(!esRelacionado) {
						//productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setConGuardarRelaciones(false);
						//productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarProductoProduManoBeanSwingJInternalFrame(tipoprocesoempresaprodus,this.tipoprocesoempresaprodu,productoprodumanoBeanSwingJInternalFrame,/*conInicializar,*/productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getConGuardarRelaciones(),productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado());
					productoprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("no_relacionado");

						productoprodumanoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduManoConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduManoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumanoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProcesoEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoProduMano=(TitledBorder)productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.getBorder();

						titledBorderProductoProduMano.setTitle(titledBorderTipoProcesoEmpresaProdu.getTitle() + " -> Producto Mano De Obra Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumanoBeanSwingJInternalFrame);
						}

						productoprodumanoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumanoBeanSwingJInternalFrame);

						productoprodumanoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Mano De Obra Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoOrdenDetaProduManoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprocesoempresaprodu!=null) {
						this.tipoprocesoempresaprodu = tipoprocesoempresaprodu;
					} else {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoOrdenDetaProduMano && this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
					ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoordendetaprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup;
					} else {
						productoordendetaprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame;
					}

					List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
					tipoprocesoempresaprodus.add(this.tipoprocesoempresaprodu);
					if(!esRelacionado) {
						//productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(false);
						//productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoordendetaprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarProductoOrdenDetaProduManoBeanSwingJInternalFrame(tipoprocesoempresaprodus,this.tipoprocesoempresaprodu,productoordendetaprodumanoBeanSwingJInternalFrame,/*conInicializar,*/productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
					productoordendetaprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMano("no_relacionado");

						productoordendetaprodumanoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoOrdenDetaProduManoConstantesFunciones.ITAMANIOFILATABLA + (ProductoOrdenDetaProduManoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoordendetaprodumanoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProcesoEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoOrdenDetaProduMano=(TitledBorder)productoordendetaprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMano.getBorder();

						titledBorderProductoOrdenDetaProduMano.setTitle(titledBorderTipoProcesoEmpresaProdu.getTitle() + " -> Orden  Mano De Obra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoordendetaprodumanoBeanSwingJInternalFrame);
						}

						productoordendetaprodumanoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoordendetaprodumanoBeanSwingJInternalFrame);

						productoordendetaprodumanoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden  Mano De Obra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprocesoempresaprodu!=null) {
						this.tipoprocesoempresaprodu = tipoprocesoempresaprodu;
					} else {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
					ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
					tipoprocesoempresaprodus.add(this.tipoprocesoempresaprodu);
					if(!esRelacionado) {
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(tipoprocesoempresaprodus,this.tipoprocesoempresaprodu,productoordendetaprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");

						productoordendetaprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProcesoEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();

						titledBorderProductoOrdenDetaProduMaquina.setTitle(titledBorderTipoProcesoEmpresaProdu.getTitle() + " -> Orden Maquina");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoordendetaprodumaquinaBeanSwingJInternalFrame);
						}

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoordendetaprodumaquinaBeanSwingJInternalFrame);

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden Maquina",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProcesoEmpresaProdu tipoprocesoempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprocesoempresaprodu = (TipoProcesoEmpresaProdu)this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprocesoempresaprodu!=null) {
						this.tipoprocesoempresaprodu = tipoprocesoempresaprodu;
					} else {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoProduMaquina && this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
					ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus=new ArrayList<TipoProcesoEmpresaProdu>();
					tipoprocesoempresaprodus.add(this.tipoprocesoempresaprodu);
					if(!esRelacionado) {
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.cargarProductoProduMaquinaBeanSwingJInternalFrame(tipoprocesoempresaprodus,this.tipoprocesoempresaprodu,productoprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getConGuardarRelaciones(),productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");

						productoprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProcesoEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoProduMaquina=(TitledBorder)productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getBorder();

						titledBorderProductoProduMaquina.setTitle(titledBorderTipoProcesoEmpresaProdu.getTitle() + " -> Producto Maquina Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumaquinaBeanSwingJInternalFrame);
						}

						productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumaquinaBeanSwingJInternalFrame);

						productoprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Maquina Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));			
			this.jButtonDuplicarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu && this.isPermisoDuplicarTipoProcesoEmpresaProdu));			
			this.jButtonCopiarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu && this.isPermisoCopiarTipoProcesoEmpresaProdu));
			this.jButtonVerFormTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu && this.isPermisoVerFormTipoProcesoEmpresaProdu));
			
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));			
			
			this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu && this.isPermisoEliminarTipoProcesoEmpresaProdu));
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu);							
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));						
			this.jButtonDuplicarToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu && this.isPermisoDuplicarTipoProcesoEmpresaProdu));						
			this.jButtonCopiarToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu && this.isPermisoCopiarTipoProcesoEmpresaProdu));			
			this.jButtonVerFormToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu && this.isPermisoVerFormTipoProcesoEmpresaProdu));			
			this.jButtonAbrirOrderByToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));
			this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));			
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu  && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu && this.isPermisoEliminarTipoProcesoEmpresaProdu));
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarToolBarTipoProcesoEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu);				
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));			
			this.jMenuItemDuplicarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu && this.isPermisoDuplicarTipoProcesoEmpresaProdu));			
			this.jMenuItemCopiarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu && this.isPermisoCopiarTipoProcesoEmpresaProdu));			
			this.jMenuItemVerFormTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu && this.isPermisoVerFormTipoProcesoEmpresaProdu));			
			this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));			
			//this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));
			this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu && this.isPermisoOrdenTipoProcesoEmpresaProdu));			
			this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu));			
			this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu && this.isPermisoNuevoTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));									
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemModificarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemActualizarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu && this.isPermisoActualizarTipoProcesoEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemEliminarTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu && this.isPermisoEliminarTipoProcesoEmpresaProdu));
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemCancelarTipoProcesoEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));						
			this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=this.jButtonNuevoTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu=this.jButtonDuplicarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu=this.jButtonCopiarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu=this.jButtonVerFormTipoProcesoEmpresaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProcesoEmpresaProdu=this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=this.jButtonModificarTipoProcesoEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=this.jButtonNuevoToolBarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarToolBarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarToolBarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarToolBarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarToolBarTipoProcesoEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=this.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=this.jMenuItemNuevoTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemModificarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemActualizarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemEliminarTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemCancelarTipoProcesoEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProcesoEmpresaProdu(Boolean esInicializar) {
		if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoEmpresaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProcesoEmpresaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProcesoEmpresaProdu() {
		this.jButtonNuevoTipoProcesoEmpresaProdu.setVisible(this.isPermisoNuevoTipoProcesoEmpresaProdu);			
		this.jButtonDuplicarTipoProcesoEmpresaProdu.setVisible(this.isPermisoDuplicarTipoProcesoEmpresaProdu);			
		this.jButtonCopiarTipoProcesoEmpresaProdu.setVisible(this.isPermisoCopiarTipoProcesoEmpresaProdu);			
		this.jButtonVerFormTipoProcesoEmpresaProdu.setVisible(this.isPermisoVerFormTipoProcesoEmpresaProdu);			
		
		this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setVisible(this.isPermisoOrdenTipoProcesoEmpresaProdu);					
		
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.setVisible(this.isPermisoNuevoTipoProcesoEmpresaProdu);			
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarTipoProcesoEmpresaProdu.setVisible(this.isPermisoActualizarTipoProcesoEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.setVisible(this.isPermisoActualizarTipoProcesoEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.setVisible(this.isPermisoEliminarTipoProcesoEmpresaProdu);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu);						
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.setVisible(this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setVisible(this.isPermisoActualizarTipoProcesoEmpresaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoEmpresaProdu() {
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarTipoProcesoEmpresaProdu.setVisible(this.isPermisoActualizarTipoProcesoEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.setVisible(this.isPermisoActualizarTipoProcesoEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.setVisible(this.isPermisoEliminarTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu);							
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu && this.isPermisoGuardarCambiosTipoProcesoEmpresaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProcesoEmpresaProdu() {
		if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoEmpresaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProcesoEmpresaProdu() {
	}
	
	public void jTableDatosTipoProcesoEmpresaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProcesoEmpresaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProcesoEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.gettipoprocesoempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoempresaprodu==null) {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				}

				if(this.tipoprocesoempresaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprocesoempresaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoProcesoEmpresaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoProcesoEmpresaProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoProcesoEmpresaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.gettipoprocesoempresaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());

				if(this.tipoprocesoempresaprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoprocesoempresaprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoProcesoEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoProcesoEmpresaProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoProcesoEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.gettipoprocesoempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoempresaprodu==null) {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				}

				if(this.tipoprocesoempresaprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoprocesoempresaprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProcesoEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.gettipoprocesoempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoempresaprodu==null) {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				}

				if(this.tipoprocesoempresaprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprocesoempresaprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoProcesoEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.gettipoprocesoempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoempresaprodu==null) {
						this.tipoprocesoempresaprodu = new TipoProcesoEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);
				}

				if(this.tipoprocesoempresaprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoprocesoempresaprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoProcesoEmpresaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);

			this.getTipoProcesoEmpresaProdusFK_IdEmpresa();

			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);

			//if(TipoProcesoEmpresaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProcesoEmpresaProdu() {
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.dispose();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.dispose();
			this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoProcesoEmpresaProdu!=null) {
			this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProcesoEmpresaProdu.dispose();
			this.jInternalFrameImportacionTipoProcesoEmpresaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProcesoEmpresaProdu();
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProcesoEmpresaProdu")) {
				jButtonDuplicarTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProcesoEmpresaProdu")) {
				jButtonCopiarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProcesoEmpresaProdu")) {
				jButtonVerFormTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProcesoEmpresaProdu")) {
				jButtonDuplicarTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProcesoEmpresaProdu")) {
				jButtonDuplicarTipoProcesoEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProcesoEmpresaProdu")) {
				jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProcesoEmpresaProdu")) {
				jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProcesoEmpresaProdu")) {
				jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProcesoEmpresaProdu")) {
				jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProcesoEmpresaProdu")) {
				jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProcesoEmpresaProdu")) {
				jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProcesoEmpresaProdu")) {
				jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProcesoEmpresaProdu")) {
				jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProcesoEmpresaProdu")) {
				jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProcesoEmpresaProdu")) {
				jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProcesoEmpresaProdu")) {
				jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProcesoEmpresaProdu")) {
				jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProcesoEmpresaProdu")) {
				jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProcesoEmpresaProdu")) {
				jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProcesoEmpresaProdu")) {
				jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProcesoEmpresaProdu")) {
				jButtonMostrarOcultarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProcesoEmpresaProdu")) {
				jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProcesoEmpresaProdu")) {
				jButtonCopiarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProcesoEmpresaProdu")) {
				jButtonVerFormTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProcesoEmpresaProdu")) {
				jButtonCopiarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProcesoEmpresaProdu")) {
				jButtonVerFormTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProcesoEmpresaProdu")) {
				jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProcesoEmpresaProdu")) {
				jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProcesoEmpresaProdu")) {
				jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProcesoEmpresaProdu")) {
				jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProcesoEmpresaProdu")) {
				jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProcesoEmpresaProdu")) {
				jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProcesoEmpresaProdu")) {
				jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProcesoEmpresaProdu")) {
				jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProcesoEmpresaProdu")) {
				jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProcesoEmpresaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu")) {
				jButtonAbrirOrderByTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProcesoEmpresaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProcesoEmpresaProdu")) {
				jButtonMostrarOcultarTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProcesoEmpresaProdu")) {
				jButtonCerrarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProcesoEmpresaProdu")) {
				jButtonGenerarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProcesoEmpresaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProcesoEmpresaProdu")) {
				jButtonCerrarImportacionTipoProcesoEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProcesoEmpresaProdu")) {
				
				jButtonGenerarImportacionTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProcesoEmpresaProdu")) {
				
				jButtonAbrirImportacionTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProcesoEmpresaProdu")) {
				jComboBoxTiposAccionesTipoProcesoEmpresaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProcesoEmpresaProdu")) {
				jComboBoxTiposRelacionesTipoProcesoEmpresaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProcesoEmpresaProdu")) {
				jComboBoxTiposAccionesTipoProcesoEmpresaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProcesoEmpresaProdu")) {
				
				jComboBoxTiposSeleccionarTipoProcesoEmpresaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProcesoEmpresaProdu")) {
				jTextFieldValorCampoGeneralTipoProcesoEmpresaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProcesoEmpresaProdu")) {
				jButtonAbrirOrderByTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProcesoEmpresaProdu")) {
				jButtonAbrirOrderByTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProcesoEmpresaProdu")) {
				jButtonCerrarOrderByTipoProcesoEmpresaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonidTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoProcesoEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonnombreTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProcesoEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProcesoEmpresaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprocesoempresaproduLocal=this.tipoprocesoempresaprodu;
			} else {
				tipoprocesoempresaproduLocal=this.tipoprocesoempresaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
							
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
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
			
			


			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
								
						
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
								
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
							
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
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
			
			


			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
								
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProcesoEmpresaProdu")) {
					jCheckBoxSeleccionarTodosTipoProcesoEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProcesoEmpresaProdu")) {
					jCheckBoxSeleccionadosTipoProcesoEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProcesoEmpresaProdu")) {
					
				}
				
				


				
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
												
				
				


				
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
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
			
			


			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoempresaprodu);
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
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
				
				


				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoEmpresaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoempresaproduAnterior =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProcesoEmpresaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProcesoEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprocesoempresaprodu =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprocesoempresaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProcesoEmpresaProdu")) {
				
				}
				
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProcesoEmpresaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProcesoEmpresaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProcesoEmpresaProdu")) {
			
			}
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProcesoEmpresaProdu();
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProcesoEmpresaProdu")) {
				jButtonDuplicarTipoProcesoEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProcesoEmpresaProdu")) {
				jButtonCopiarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProcesoEmpresaProdu")) {
				jButtonVerFormTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoEmpresaProdu")) {
				jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProcesoEmpresaProdu")) {
				jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProcesoEmpresaProdu")) {
				jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProcesoEmpresaProdu")) {
				jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProcesoEmpresaProdu")) {
				jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProcesoEmpresaProdu")) {
				jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProcesoEmpresaProdu")) {
				jButtonAbrirOrderByTipoProcesoEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProcesoEmpresaProdu")) {
				jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProcesoEmpresaProdu")) {
				jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProcesoEmpresaProdu")) {
				jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonidTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoProcesoEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoEmpresaProduBusqueda")) {
				this.jButtonnombreTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProcesoEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoProcesoEmpresaProduBusquedaActionPerformed(evt);
			}
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProcesoEmpresaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProcesoEmpresaProdu")) {
				closingInternalFrameTipoProcesoEmpresaProdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoProcesoEmpresaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProcesoEmpresaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProcesoEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoEmpresaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProcesoEmpresaProduActionPerformed(null);
			}
			
			TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesoempresaprodu,new Object(),this.tipoprocesoempresaproduParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProcesoEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProcesoEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProcesoEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
			if(!esControlTabla) {
				if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);			
				}
				
				if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.procesarEventosTipoProcesoEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this.tipoprocesoempresaprodu,this.tipoprocesoempresaproduParameterGeneral,this.isEsNuevoTipoProcesoEmpresaProdu,classes);//this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral,this.tipoprocesoempresaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoEmpresaProdu(classes,this.tipoprocesoempresaproduReturnGeneral,this.tipoprocesoempresaproduBean,false);
					}
						
					if(this.tipoprocesoempresaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu());	
					}
						
					if(this.tipoprocesoempresaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu(),classes);//this.tipoprocesoempresaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,classes);//this.tipoprocesoempresaproduBean);									
				}
			
				if(TipoProcesoEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprocesoempresaproduAnterior!=null) {
						this.tipoprocesoempresaprodu=this.tipoprocesoempresaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.procesarEventosTipoProcesoEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this.tipoprocesoempresaprodu,this.tipoprocesoempresaproduParameterGeneral,this.isEsNuevoTipoProcesoEmpresaProdu,classes);//this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu(),tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu(),this.tipoprocesoempresaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProcesoEmpresaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProcesoEmpresaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProcesoEmpresaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProcesoEmpresaProdu() throws Exception {
		
		TipoProcesoEmpresaProduModel tipoprocesoempresaproduModel=(TipoProcesoEmpresaProduModel)this.jTableDatosTipoProcesoEmpresaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoempresaproduModel.tipoprocesoempresaprodus=this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprocesoempresaproduModel.tipoprocesoempresaprodus=this.tipoprocesoempresaprodus;
		}
		
		
		((TipoProcesoEmpresaProduModel) this.jTableDatosTipoProcesoEmpresaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProcesoEmpresaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprocesoempresaproduAnterior(),this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprocesoempresaproduAnterior(),this.tipoprocesoempresaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProcesoEmpresaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(tipoprocesoempresaprodu.getProductoProduManos());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMano.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipoprocesoempresaprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
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
										
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProcesoEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProcesoEmpresaProduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProcesoEmpresaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProcesoEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoprocesoempresaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProcesoEmpresaProdu(TipoProcesoEmpresaProduBean tipoprocesoempresaproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(tipoprocesoempresaprodu.getProductoProduManos());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMano.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipoprocesoempresaprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoEmpresaProdu(ArrayList<Classe> classes,TipoProcesoEmpresaProduReturnGeneral tipoprocesoempresaproduReturnGeneral,TipoProcesoEmpresaProduBean tipoprocesoempresaproduBean,Boolean conDefault) throws Exception {
		
			this.tipoprocesoempresaproduBean.setProductoProduManos(tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu().getProductoProduManos());
			this.tipoprocesoempresaproduBean.setProductoOrdenDetaProduManos(tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu().getProductoOrdenDetaProduManos());
			this.tipoprocesoempresaproduBean.setProductoOrdenDetaProduMaquinas(tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu().getProductoOrdenDetaProduMaquinas());
			this.tipoprocesoempresaproduBean.setProductoProduMaquinas(tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu().getProductoProduMaquinas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					tipoprocesoempresaprodu.setProductoProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMano.class)) {
					tipoprocesoempresaprodu.setProductoOrdenDetaProduManos(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					tipoprocesoempresaprodu.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					tipoprocesoempresaprodu.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu = new TipoProcesoEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones(),this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.tipoprocesoempresaproduLogic=this.tipoprocesoempresaproduLogic;
		
		this.cargarCombosFrameForeignKeyTipoProcesoEmpresaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoEmpresaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoEmpresaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProcesoEmpresaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoEmpresaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoEmpresaProdu"));
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoEmpresaProdu"));

		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemModificarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoEmpresaProdu"));
						
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemActualizarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoEmpresaProdu"));
								
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemEliminarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemCancelarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoEmpresaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoEmpresaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonidTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonnombreTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtondescripcionTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoEmpresaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoEmpresaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProcesoEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoEmpresaProdu"));
		}
		
		this.jTableDatosTipoProcesoEmpresaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProcesoEmpresaProdu"));
		
		this.jTableDatosTipoProcesoEmpresaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProcesoEmpresaProdu"));
		
		this.jButtonNuevoTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoTipoProcesoEmpresaProdu"));
		
		this.jButtonDuplicarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoProcesoEmpresaProdu"));
		
		this.jButtonCopiarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"CopiarTipoProcesoEmpresaProdu"));
		
		this.jButtonVerFormTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"VerFormTipoProcesoEmpresaProdu"));
		
		
		this.jButtonNuevoToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProcesoEmpresaProdu"));
			
		this.jButtonDuplicarToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemNuevoTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProcesoEmpresaProdu"));
			
		this.jMenuItemDuplicarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProcesoEmpresaProdu"));		
		
		
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProcesoEmpresaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProcesoEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonModificarToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemModificarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonActualizarToolBarTipoProcesoEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoEmpresaProdu"));
				
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemActualizarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonEliminarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoEmpresaProdu"));
						
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemEliminarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonCancelarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemCancelarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoEmpresaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProcesoEmpresaProdu"));		
		
		
		this.jButtonCerrarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarTipoProcesoEmpresaProdu"));
		
		
		this.jButtonCerrarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemCerrarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProcesoEmpresaProdu"));
			
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProcesoEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoEmpresaProdu"));
		}
		
		this.jButtonCopiarToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProcesoEmpresaProdu"));
			
		this.jButtonVerFormToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProcesoEmpresaProdu"));
		
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProcesoEmpresaProdu"));
			
		this.jMenuItemCopiarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProcesoEmpresaProdu"));		
		
		this.jMenuItemVerFormTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProcesoEmpresaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoEmpresaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoEmpresaProdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProcesoEmpresaProdu"));
					
		this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProcesoEmpresaProdu"));
		
		this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProcesoEmpresaProdu"));		
		
		
		
		this.jButtonAnterioresTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoProcesoEmpresaProdu"));
		
		
		this.jButtonAnterioresToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProcesoEmpresaProdu"));
		
		this.jMenuItemAnterioresTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProcesoEmpresaProdu"));		
		
		
		this.jButtonSiguientesTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoProcesoEmpresaProdu"));
		
		
		this.jButtonSiguientesToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemSiguientesTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProcesoEmpresaProdu"));
			
		this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProcesoEmpresaProdu"));
			
		this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProcesoEmpresaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProcesoEmpresaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProcesoEmpresaProdu"));

		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProcesoEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoEmpresaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProcesoEmpresaProdu"));
			
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProcesoEmpresaProdu"));
					
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProcesoEmpresaProdu"));
			
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProcesoEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonidTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonnombreTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtondescripcionTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoEmpresaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoEmpresaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoEmpresaProdu"));				
			//this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoEmpresaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoEmpresaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoEmpresaProdu"));
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoEmpresaProdu"));
				this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoEmpresaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProcesoEmpresaProdu"));
			
			this.jButtonAbrirOrderByToolBarTipoProcesoEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProcesoEmpresaProdu"));			
			
			if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu!=null) {
				this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoEmpresaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoEmpresaProdu"));
		
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
            		closingInternalFrameTipoProcesoEmpresaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProcesoEmpresaProdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoProcesoEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoEmpresaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProcesoEmpresaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProcesoEmpresaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProcesoEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProcesoEmpresaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProcesoEmpresaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoEmpresaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonModificarTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonActualizarTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonEliminarTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCancelarTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCerrarTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProcesoEmpresaProdu";
		inputMap = this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonGuardarCambiosTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProcesoEmpresaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProcesoEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProcesoEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProcesoEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonidTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtonnombreTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jButtondescripcionTipoProcesoEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoEmpresaProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProcesoEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProcesoEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProcesoEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProcesoEmpresaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
					tipoprocesoempresaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodus) {
					tipoprocesoempresaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProcesoEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
						tipoprocesoempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodus) {
						tipoprocesoempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProcesoEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProcesoEmpresaProdu.getSelectedRows();
			
			TipoProcesoEmpresaProdu tipoprocesoempresaproduLocal=new TipoProcesoEmpresaProdu();
			
			//this.seleccionarTodosTipoProcesoEmpresaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLocal =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprocesoempresaproduLocal =(TipoProcesoEmpresaProdu) this.tipoprocesoempresaprodus.toArray()[this.jTableDatosTipoProcesoEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprocesoempresaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
						tipoprocesoempresaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodus) {
						tipoprocesoempresaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProcesoEmpresaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProcesoEmpresaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProcesoEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
				
						if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesoempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprocesoempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodus) {
					
						if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesoempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprocesoempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProcesoEmpresaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProcesoEmpresaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProcesoEmpresaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProcesoEmpresaProdu(conSplash);
				
					this.generarReporteTipoProcesoEmpresaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProcesoEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoEmpresaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoEmpresaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoEmpresaProdu();
				
				this.exportarTipoProcesoEmpresaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProcesoEmpresaProdus();
				//this.importarTipoProcesoEmpresaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoEmpresaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProcesoEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Proceso Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProcesoEmpresaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProcesoEmpresaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProcesoEmpresaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoProcesoEmpresaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoProcesoEmpresaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoProcesoEmpresaProdu(conSplash);
					
						//this.actualizarParametrosGeneralTipoProcesoEmpresaProdu();
						
						this.generarReporteProcesoAccionTipoProcesoEmpresaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Proceso EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Proceso Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoProcesoEmpresaProdu();
				
						this.actualizarParametrosGeneralTipoProcesoEmpresaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoprocesoempresaproduReturnGeneral=tipoprocesoempresaproduLogic.procesarAccionTipoProcesoEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus(),this.tipoprocesoempresaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoProcesoEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProcesoEmpresaProdu();
					
					TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoProcesoEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProcesoEmpresaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProcesoEmpresaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProcesoEmpresaProdu();
			
			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
			TipoProcesoEmpresaProdu tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.getSelectedItem();
			
			
			
			
			tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprocesoempresaprodusSeleccionados.size()==1) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
					tipoprocesoempresaprodu=tipoprocesoempresaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto Mano De Obra Produccion")) {
					jButtonProductoProduManoActionPerformed(null,rowIndex,true,false,tipoprocesoempresaprodu);
				}
				else if(this.sTipoRelacion.equals("Orden  Mano De Obra")) {
					jButtonProductoOrdenDetaProduManoActionPerformed(null,rowIndex,true,false,tipoprocesoempresaprodu);
				}
				else if(this.sTipoRelacion.equals("Orden Maquina")) {
					jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,rowIndex,true,false,tipoprocesoempresaprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Maquina Produccion")) {
					jButtonProductoProduMaquinaActionPerformed(null,rowIndex,true,false,tipoprocesoempresaprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProcesoEmpresaProdu();
			
      		//this.finishProcessTipoProcesoEmpresaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProcesoEmpresaProduReturnGeneral() throws Exception {
		if(this.tipoprocesoempresaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesoempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprocesoempresaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesoempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprocesoempresaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprocesoempresaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
		}
		
		if(this.tipoprocesoempresaproduReturnGeneral.getConRetornoLista() || this.tipoprocesoempresaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprocesoempresaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdus(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprocesoempresaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesoempresaproduLogic.setTipoProcesoEmpresaProdu(this.tipoprocesoempresaproduReturnGeneral.getTipoProcesoEmpresaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProcesoEmpresaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProcesoEmpresaProdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoProcesoEmpresaProdu> getTipoProcesoEmpresaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProcesoEmpresaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus()) {
					if(tipoprocesoempresaproduAux.getIsSelected()) {
						tipoprocesoempresaprodusSeleccionados.add(tipoprocesoempresaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:this.tipoprocesoempresaprodus) {
					if(tipoprocesoempresaproduAux.getIsSelected()) {
						tipoprocesoempresaprodusSeleccionados.add(tipoprocesoempresaproduAux);				
					}
				}
			}
			
			if(tipoprocesoempresaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprocesoempresaprodusSeleccionados.addAll(this.tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprocesoempresaprodusSeleccionados.addAll(this.tipoprocesoempresaprodus);				
					}
				}
			}
		} else {
			tipoprocesoempresaprodusSeleccionados.add(this.tipoprocesoempresaprodu);
		}
		
		return tipoprocesoempresaprodusSeleccionados;
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
	
	public void generarReporteTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProcesoEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProcesoEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoEmpresaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoEmpresaProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProcesoEmpresaProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Proceso Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProcesoEmpresaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProcesoEmpresaProdu();
		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProcesoEmpresaProdu();
		
		
		//this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados ,tipoprocesoempresaproduImplementable,tipoprocesoempresaproduImplementableHome);
	}
	
	public void mostrarImportacionTipoProcesoEmpresaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProcesoEmpresaProdu();
		
		this.abrirFrameImportacionTipoProcesoEmpresaProdu();		
		
			
		//this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados ,tipoprocesoempresaproduImplementable,tipoprocesoempresaproduImplementableHome);
	}
	
	public void importarTipoProcesoEmpresaProdus() throws Exception {		
	
	}
	
	public void exportarTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProcesoEmpresaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProcesoEmpresaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProcesoEmpresaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Proceso Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProcesoEmpresaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprocesoempresaproduAux.setsDetalleGeneralEntityReporte(tipoprocesoempresaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProcesoEmpresaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoEmpresaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprocesoempresaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoempresaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoempresaprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoempresaprodu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoempresaprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProcesoEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProcesoEmpresaProdu(row);				
				iRow++;
			}				
			
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProcesoEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();		
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoempresaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprocesoempresaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprocesoempresaprodu");
			//elementRoot.appendChild(element);
		
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
				element = document.createElement("tipoprocesoempresaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProcesoEmpresaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoempresaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoempresaprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoempresaprodu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoempresaprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoProcesoEmpresaProdu(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProcesoEmpresaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprocesoempresaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProcesoEmpresaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprocesoempresaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoProcesoEmpresaProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoprocesoempresaprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoProcesoEmpresaProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprocesoempresaprodu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoProcesoEmpresaProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoprocesoempresaprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoProcesoEmpresaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados=new ArrayList<TipoProcesoEmpresaProdu>();
		
		tipoprocesoempresaprodusSeleccionados=this.getTipoProcesoEmpresaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProcesoEmpresaProdu(tipoprocesoempresaprodusSeleccionados);
		
		this.generarReporteTipoProcesoEmpresaProdus("Todos",tipoprocesoempresaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProcesoEmpresaProdu(ArrayList<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusSeleccionados) {
				tipoprocesoempresaproduAux.setsDetalleGeneralEntityReporte(tipoprocesoempresaproduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoprocesoempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoempresaproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprocesoempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoempresaproduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoprocesoempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoempresaproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProcesoEmpresaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoEmpresaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=true;
		} else {
			this.actualizarEstadoPanelsTipoProcesoEmpresaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProcesoEmpresaProdu=false;
			//this.isVisibilidadCeldaVerFormTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;												
			}
			
			this.jButtonCerrarTipoProcesoEmpresaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoEmpresaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprocesoempresaprodu)) {
			this.isVisibilidadCeldaActualizarTipoProcesoEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoEmpresaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoEmpresaProdu() {
		this.isVisibilidadCeldaNuevoTipoProcesoEmpresaProdu=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProcesoEmpresaProdu=false;
	}
	
	public void actualizarEstadoPanelsTipoProcesoEmpresaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoEmpresaProdu!=null) {
				this.jPanelPaginacionTipoProcesoEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
					this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProcesoEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoProcesoEmpresaProduParaProductoProduManoes() throws Exception {
		Boolean isPaginaPopupProductoProduMano=false;

		try {

			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setsPathNavegacionActual(tipoprocesoempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMano=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMano(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMano(TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumanoSessionBean.setlidTipoProcesoEmpresaProduActual(this.idTipoProcesoEmpresaProduActual);

			tipoprocesoempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProcesoEmpresaProdu(true);
			tipoprocesoempresaproduSessionBean.setlIdTipoProcesoEmpresaProduActualForeignKey(this.idTipoProcesoEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProcesoEmpresaProduParaProductoOrdenDetaProduManoes() throws Exception {
		Boolean isPaginaPopupProductoOrdenDetaProduMano=false;

		try {

			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setsPathNavegacionActual(tipoprocesoempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMano(TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumanoSessionBean.setlidTipoProcesoEmpresaProduActual(this.idTipoProcesoEmpresaProduActual);

			tipoprocesoempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProcesoEmpresaProdu(true);
			tipoprocesoempresaproduSessionBean.setlIdTipoProcesoEmpresaProduActualForeignKey(this.idTipoProcesoEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProcesoEmpresaProduParaProductoOrdenDetaProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoOrdenDetaProduMaquina=false;

		try {

			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setsPathNavegacionActual(tipoprocesoempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoordendetaprodumaquinaSessionBean.setlidTipoProcesoEmpresaProduActual(this.idTipoProcesoEmpresaProduActual);

			tipoprocesoempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProcesoEmpresaProdu(true);
			tipoprocesoempresaproduSessionBean.setlIdTipoProcesoEmpresaProduActualForeignKey(this.idTipoProcesoEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProcesoEmpresaProduParaProductoProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoProduMaquina=false;

		try {

			if(this.tipoprocesoempresaproduSessionBean==null) {
				this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setsPathNavegacionActual(tipoprocesoempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMaquina=this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMaquina(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMaquina(TipoProcesoEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.productoprodumaquinaSessionBean.setlidTipoProcesoEmpresaProduActual(this.idTipoProcesoEmpresaProduActual);

			tipoprocesoempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProcesoEmpresaProdu(true);
			tipoprocesoempresaproduSessionBean.setlIdTipoProcesoEmpresaProduActualForeignKey(this.idTipoProcesoEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		
		if(this.tipoprocesoempresaproduSessionBean==null) {
			this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		}
		
		this.tipoprocesoempresaproduSessionBean.setsUltimaBusquedaTipoProcesoEmpresaProdu(this.getsAccionBusqueda());
		this.tipoprocesoempresaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprocesoempresaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoprocesoempresaproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		
		if(this.tipoprocesoempresaproduSessionBean==null) {
			this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		}
		
		if(this.tipoprocesoempresaproduSessionBean.getsUltimaBusquedaTipoProcesoEmpresaProdu()!=null&&!this.tipoprocesoempresaproduSessionBean.getsUltimaBusquedaTipoProcesoEmpresaProdu().equals("")) {
			this.setsAccionBusqueda(tipoprocesoempresaproduSessionBean.getsUltimaBusquedaTipoProcesoEmpresaProdu());
			this.setiNumeroPaginacion(tipoprocesoempresaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprocesoempresaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoprocesoempresaproduSessionBean.getid_empresa());
				tipoprocesoempresaproduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoprocesoempresaproduSessionBean.setsUltimaBusquedaTipoProcesoEmpresaProdu("");
		this.tipoprocesoempresaproduSessionBean.setiNumeroPaginacion(TipoProcesoEmpresaProduConstantesFunciones.INUMEROPAGINACION);
		this.tipoprocesoempresaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProcesoEmpresaProdu() {
		this.updateBorderResaltarBusquedasFormularioTipoProcesoEmpresaProdu();
		this.updateVisibilidadBusquedasFormularioTipoProcesoEmpresaProdu();
		this.updateHabilitarBusquedasFormularioTipoProcesoEmpresaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProcesoEmpresaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProcesoEmpresaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProcesoEmpresaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProcesoEmpresaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProcesoEmpresaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProcesoEmpresaProdu();
		this.updateVisibilidadResaltarControlesFormularioTipoProcesoEmpresaProdu();
		this.updateHabilitarResaltarControlesFormularioTipoProcesoEmpresaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProcesoEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprocesoempresaproduConstantesFunciones.resaltaridTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setBorder(this.tipoprocesoempresaproduConstantesFunciones.resaltaridTipoProcesoEmpresaProdu);}
		if(this.tipoprocesoempresaproduConstantesFunciones.resaltarid_empresaTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setBorder(this.tipoprocesoempresaproduConstantesFunciones.resaltarid_empresaTipoProcesoEmpresaProdu);}
		if(this.tipoprocesoempresaproduConstantesFunciones.resaltarnombreTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setBorder(this.tipoprocesoempresaproduConstantesFunciones.resaltarnombreTipoProcesoEmpresaProdu);}
		if(this.tipoprocesoempresaproduConstantesFunciones.resaltardescripcionTipoProcesoEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setBorder(this.tipoprocesoempresaproduConstantesFunciones.resaltardescripcionTipoProcesoEmpresaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProcesoEmpresaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostraridTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelidTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostraridTipoProcesoEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrarid_empresaTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelid_empresaTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrarid_empresaTipoProcesoEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrarnombreTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPanelnombreTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrarnombreTipoProcesoEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrardescripcionTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jPaneldescripcionTipoProcesoEmpresaProdu.setVisible(this.tipoprocesoempresaproduConstantesFunciones.mostrardescripcionTipoProcesoEmpresaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProcesoEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu!=null) {
	
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jLabelidTipoProcesoEmpresaProdu.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activaridTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jComboBoxid_empresaTipoProcesoEmpresaProdu.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarid_empresaTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreanombreTipoProcesoEmpresaProdu.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activarnombreTipoProcesoEmpresaProdu);
		this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu.jTextAreadescripcionTipoProcesoEmpresaProdu.setEnabled(this.tipoprocesoempresaproduConstantesFunciones.activardescripcionTipoProcesoEmpresaProdu);
		}
	}
	
		
}