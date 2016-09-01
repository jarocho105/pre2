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

import com.bydan.erp.produccion.util.TipoAreaEmpresaProduConstantesFunciones;
import com.bydan.erp.produccion.util.TipoAreaEmpresaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoAreaEmpresaProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoAreaEmpresaProduBean;
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
public class TipoAreaEmpresaProduBeanSwingJInternalFrame extends TipoAreaEmpresaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAreaEmpresaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAreaEmpresaProdu> tipoareaempresaproduValidator = new ClassValidator<TipoAreaEmpresaProdu>(TipoAreaEmpresaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAreaEmpresaProdu tipoareaempresaprodu;	
	public TipoAreaEmpresaProdu tipoareaempresaproduAux;
	public TipoAreaEmpresaProdu tipoareaempresaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAreaEmpresaProdu tipoareaempresaproduTotales;
	public Long idTipoAreaEmpresaProduActual;
	public Long iIdNuevoTipoAreaEmpresaProdu=0L;
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
	
	public Boolean isPermisoTodoTipoAreaEmpresaProdu;
	public Boolean isPermisoNuevoTipoAreaEmpresaProdu;
	public Boolean isPermisoActualizarTipoAreaEmpresaProdu;
	public Boolean isPermisoActualizarOriginalTipoAreaEmpresaProdu;
	public Boolean isPermisoEliminarTipoAreaEmpresaProdu;
	public Boolean isPermisoGuardarCambiosTipoAreaEmpresaProdu;
	public Boolean isPermisoConsultaTipoAreaEmpresaProdu;
	public Boolean isPermisoBusquedaTipoAreaEmpresaProdu;
	public Boolean isPermisoReporteTipoAreaEmpresaProdu;
	public Boolean isPermisoPaginacionMedioTipoAreaEmpresaProdu;
	public Boolean isPermisoPaginacionAltoTipoAreaEmpresaProdu;
	public Boolean isPermisoPaginacionTodoTipoAreaEmpresaProdu;
	public Boolean isPermisoCopiarTipoAreaEmpresaProdu;
	public Boolean isPermisoVerFormTipoAreaEmpresaProdu;
	public Boolean isPermisoDuplicarTipoAreaEmpresaProdu;
	public Boolean isPermisoOrdenTipoAreaEmpresaProdu;
	
	
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
	
	public TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduReturnGeneral;
	public TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoTipoAreaEmpresaProdu=false;
	public Boolean esParaAccionDesdeFormularioTipoAreaEmpresaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoAreaEmpresaProduSessionBeanAdditional tipoareaempresaproduSessionBeanAdditional=null;
	
	public TipoAreaEmpresaProduSessionBeanAdditional getTipoAreaEmpresaProduSessionBeanAdditional() {
		return this.tipoareaempresaproduSessionBeanAdditional;
	}
	
	public void setTipoAreaEmpresaProduSessionBeanAdditional(TipoAreaEmpresaProduSessionBeanAdditional tipoareaempresaproduSessionBeanAdditional) {
		try {
			this.tipoareaempresaproduSessionBeanAdditional=tipoareaempresaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional tipoareaempresaproduBeanSwingJInternalFrameAdditional=null;
	//public class TipoAreaEmpresaProduBeanSwingJInternalFrame
	
	public TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional getTipoAreaEmpresaProduBeanSwingJInternalFrameAdditional() {
		return this.tipoareaempresaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoAreaEmpresaProduBeanSwingJInternalFrameAdditional(TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional tipoareaempresaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoareaempresaproduBeanSwingJInternalFrameAdditional=tipoareaempresaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAreaEmpresaProduLogic tipoareaempresaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAreaEmpresaProdu tipoareaempresaproduBean;
	public TipoAreaEmpresaProduConstantesFunciones tipoareaempresaproduConstantesFunciones;
	//public TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoAreaEmpresaProdu> tipoareaempresaprodus;	
	//public List<TipoAreaEmpresaProdu> tipoareaempresaprodusEliminados;
	//public List<TipoAreaEmpresaProdu> tipoareaempresaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoAreaEmpresaProdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoAreaEmpresaProdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoAreaEmpresaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoAreaEmpresaProdu() {
		return this.iIdNuevoTipoAreaEmpresaProdu;
	}

	public void setiIdNuevoTipoAreaEmpresaProdu(Long iIdNuevoTipoAreaEmpresaProdu) {
		this.iIdNuevoTipoAreaEmpresaProdu = iIdNuevoTipoAreaEmpresaProdu;
	}
	
	public Long getidTipoAreaEmpresaProduActual() {
		return this.idTipoAreaEmpresaProduActual;
	}

	public void setidTipoAreaEmpresaProduActual(Long idTipoAreaEmpresaProduActual) {
		this.idTipoAreaEmpresaProduActual = idTipoAreaEmpresaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAreaEmpresaProdu gettipoareaempresaprodu() {
		return this.tipoareaempresaprodu;
	}

	public void settipoareaempresaprodu(TipoAreaEmpresaProdu tipoareaempresaprodu) {
		this.tipoareaempresaprodu = tipoareaempresaprodu;
	}
	
	public TipoAreaEmpresaProdu gettipoareaempresaproduAux() {
		return this.tipoareaempresaproduAux;
	}

	public void settipoareaempresaproduAux(TipoAreaEmpresaProdu tipoareaempresaproduAux) {
		this.tipoareaempresaproduAux = tipoareaempresaproduAux;
	}				
	
	public TipoAreaEmpresaProdu gettipoareaempresaproduAnterior() {
		return this.tipoareaempresaproduAnterior;
	}

	public void settipoareaempresaproduAnterior(TipoAreaEmpresaProdu tipoareaempresaproduAnterior) {
		this.tipoareaempresaproduAnterior = tipoareaempresaproduAnterior;
	}	
	
	public TipoAreaEmpresaProdu gettipoareaempresaproduTotales() {
		return this.tipoareaempresaproduTotales;
	}

	public void settipoareaempresaproduTotales(TipoAreaEmpresaProdu tipoareaempresaproduTotales) {
		this.tipoareaempresaproduTotales = tipoareaempresaproduTotales;
	}	
	
	public TipoAreaEmpresaProdu gettipoareaempresaproduBean() {
		return this.tipoareaempresaproduBean;
	}

	public void settipoareaempresaproduBean(TipoAreaEmpresaProdu tipoareaempresaproduBean) {
		this.tipoareaempresaproduBean = tipoareaempresaproduBean;
	}	
	
	public TipoAreaEmpresaProduParameterReturnGeneral gettipoareaempresaproduReturnGeneral() {
		return this.tipoareaempresaproduReturnGeneral;
	}

	public void settipoareaempresaproduReturnGeneral(TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduReturnGeneral) {
		this.tipoareaempresaproduReturnGeneral = tipoareaempresaproduReturnGeneral;
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
	
	
	public TipoAreaEmpresaProduLogic getTipoAreaEmpresaProduLogic()	{		
		return tipoareaempresaproduLogic;
	}

	public void setTipoAreaEmpresaProduLogic(TipoAreaEmpresaProduLogic tipoareaempresaproduLogic) {
		this.tipoareaempresaproduLogic = tipoareaempresaproduLogic;
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
	
	public Boolean getIsEsNuevoTipoAreaEmpresaProdu() {
		return isEsNuevoTipoAreaEmpresaProdu;
	}

	public void setIsEsNuevoTipoAreaEmpresaProdu(Boolean isEsNuevoTipoAreaEmpresaProdu) {
		this.isEsNuevoTipoAreaEmpresaProdu = isEsNuevoTipoAreaEmpresaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAreaEmpresaProdu() {
		return esParaAccionDesdeFormularioTipoAreaEmpresaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAreaEmpresaProdu(Boolean esParaAccionDesdeFormularioTipoAreaEmpresaProdu) {
		this.esParaAccionDesdeFormularioTipoAreaEmpresaProdu = esParaAccionDesdeFormularioTipoAreaEmpresaProdu;
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

			if(this.tipoareaempresaproduSessionBean==null) {
				this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
			}

			if(!this.tipoareaempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoareaempresaproduSessionBean.getlidEmpresaActual());
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

					if(this.tipoareaempresaprodu!=null) {
						this.tipoareaempresaprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
						if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoAreaEmpresaProduGenerico)throws Exception
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
				jComboBoxid_empresaTipoAreaEmpresaProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoAreaEmpresaProduGenerico!=null && jComboBoxid_empresaTipoAreaEmpresaProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoAreaEmpresaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoAreaEmpresaProdu tipoareaempresaprodu,JComboBox jComboBoxid_empresaTipoAreaEmpresaProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoAreaEmpresaProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoAreaEmpresaProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoareaempresaprodu.setid_empresa(empresaAux.getId());
				tipoareaempresaprodu.setempresa_descripcion(TipoAreaEmpresaProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoareaempresaprodu.setEmpresa(empresaAux);			}
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

					if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { 
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { 
					}

					if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAreaEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAreaEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu(this.tipoareaempresaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(this.tipoareaempresaprodus);
			tipoareaempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAreaEmpresaProduParameterReturnGeneral getTipoAreaEmpresaProduParameterGeneral() {
		return this.tipoareaempresaproduParameterGeneral;
	}
	
	public void setTipoAreaEmpresaProduParameterGeneral(TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduParameterGeneral) {
		this.tipoareaempresaproduParameterGeneral = tipoareaempresaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAreaEmpresaProdu() {
		return isPermisoTodoTipoAreaEmpresaProdu;
	}

	public void setIsPermisoTodoTipoAreaEmpresaProdu(Boolean isPermisoTodoTipoAreaEmpresaProdu) {
		this.isPermisoTodoTipoAreaEmpresaProdu = isPermisoTodoTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoNuevoTipoAreaEmpresaProdu() {
		return isPermisoNuevoTipoAreaEmpresaProdu;
	}

	public void setIsPermisoNuevoTipoAreaEmpresaProdu(Boolean isPermisoNuevoTipoAreaEmpresaProdu) {
		this.isPermisoNuevoTipoAreaEmpresaProdu = isPermisoNuevoTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoActualizarTipoAreaEmpresaProdu() {
		return isPermisoActualizarTipoAreaEmpresaProdu;
	}

	public void setIsPermisoActualizarTipoAreaEmpresaProdu(Boolean isPermisoActualizarTipoAreaEmpresaProdu) {
		this.isPermisoActualizarTipoAreaEmpresaProdu = isPermisoActualizarTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoEliminarTipoAreaEmpresaProdu() {
		return isPermisoEliminarTipoAreaEmpresaProdu;
	}

	public void setIsPermisoEliminarTipoAreaEmpresaProdu(Boolean isPermisoEliminarTipoAreaEmpresaProdu) {
		this.isPermisoEliminarTipoAreaEmpresaProdu = isPermisoEliminarTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAreaEmpresaProdu() {
		return isPermisoGuardarCambiosTipoAreaEmpresaProdu;
	}

	public void setIsPermisoGuardarCambiosTipoAreaEmpresaProdu(Boolean isPermisoGuardarCambiosTipoAreaEmpresaProdu) {
		this.isPermisoGuardarCambiosTipoAreaEmpresaProdu = isPermisoGuardarCambiosTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoConsultaTipoAreaEmpresaProdu() {
		return isPermisoConsultaTipoAreaEmpresaProdu;
	}

	public void setIsPermisoConsultaTipoAreaEmpresaProdu(Boolean isPermisoConsultaTipoAreaEmpresaProdu) {
		this.isPermisoConsultaTipoAreaEmpresaProdu = isPermisoConsultaTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoBusquedaTipoAreaEmpresaProdu() {
		return isPermisoBusquedaTipoAreaEmpresaProdu;
	}

	public void setIsPermisoBusquedaTipoAreaEmpresaProdu(Boolean isPermisoBusquedaTipoAreaEmpresaProdu) {
		this.isPermisoBusquedaTipoAreaEmpresaProdu = isPermisoBusquedaTipoAreaEmpresaProdu;
	}

	public Boolean getIsPermisoReporteTipoAreaEmpresaProdu() {
		return isPermisoReporteTipoAreaEmpresaProdu;
	}

	public void setIsPermisoReporteTipoAreaEmpresaProdu(Boolean isPermisoReporteTipoAreaEmpresaProdu) {
		this.isPermisoReporteTipoAreaEmpresaProdu = isPermisoReporteTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAreaEmpresaProdu() {
		return isPermisoPaginacionMedioTipoAreaEmpresaProdu;
	}

	public void setIsPermisoPaginacionMedioTipoAreaEmpresaProdu(Boolean isPermisoPaginacionMedioTipoAreaEmpresaProdu) {
		this.isPermisoPaginacionMedioTipoAreaEmpresaProdu = isPermisoPaginacionMedioTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAreaEmpresaProdu() {
		return isPermisoPaginacionTodoTipoAreaEmpresaProdu;
	}

	public void setIsPermisoPaginacionTodoTipoAreaEmpresaProdu(Boolean isPermisoPaginacionTodoTipoAreaEmpresaProdu) {
		this.isPermisoPaginacionTodoTipoAreaEmpresaProdu = isPermisoPaginacionTodoTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAreaEmpresaProdu() {
		return isPermisoPaginacionAltoTipoAreaEmpresaProdu;
	}

	public void setIsPermisoPaginacionAltoTipoAreaEmpresaProdu(Boolean isPermisoPaginacionAltoTipoAreaEmpresaProdu) {
		this.isPermisoPaginacionAltoTipoAreaEmpresaProdu = isPermisoPaginacionAltoTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoCopiarTipoAreaEmpresaProdu() {
		return isPermisoCopiarTipoAreaEmpresaProdu;
	}

	public void setIsPermisoCopiarTipoAreaEmpresaProdu(Boolean isPermisoCopiarTipoAreaEmpresaProdu) {
		this.isPermisoCopiarTipoAreaEmpresaProdu = isPermisoCopiarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoVerFormTipoAreaEmpresaProdu() {
		return isPermisoVerFormTipoAreaEmpresaProdu;
	}

	public void setIsPermisoVerFormTipoAreaEmpresaProdu(Boolean isPermisoVerFormTipoAreaEmpresaProdu) {
		this.isPermisoVerFormTipoAreaEmpresaProdu = isPermisoVerFormTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoAreaEmpresaProdu() {
		return isPermisoDuplicarTipoAreaEmpresaProdu;
	}

	public void setIsPermisoDuplicarTipoAreaEmpresaProdu(Boolean isPermisoDuplicarTipoAreaEmpresaProdu) {
		this.isPermisoDuplicarTipoAreaEmpresaProdu = isPermisoDuplicarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsPermisoOrdenTipoAreaEmpresaProdu() {
		return isPermisoOrdenTipoAreaEmpresaProdu;
	}

	public void setIsPermisoOrdenTipoAreaEmpresaProdu(Boolean isPermisoOrdenTipoAreaEmpresaProdu) {
		this.isPermisoOrdenTipoAreaEmpresaProdu = isPermisoOrdenTipoAreaEmpresaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaNuevoTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaNuevoTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu = isVisibilidadCeldaNuevoTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu = isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaCopiarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaCopiarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu = isVisibilidadCeldaCopiarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaVerFormTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaVerFormTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu = isVisibilidadCeldaVerFormTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaOrdenTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaOrdenTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu = isVisibilidadCeldaOrdenTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu = isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaModificarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaModificarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaModificarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu = isVisibilidadCeldaModificarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaActualizarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaActualizarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu = isVisibilidadCeldaActualizarTipoAreaEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaEliminarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaEliminarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu = isVisibilidadCeldaEliminarTipoAreaEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaCancelarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaCancelarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu = isVisibilidadCeldaCancelarTipoAreaEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaGuardarTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaGuardarTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu = isVisibilidadCeldaGuardarTipoAreaEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu() {
		return isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu(Boolean isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu = isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu;
	}
		
	public TipoAreaEmpresaProduSessionBean gettipoareaempresaproduSessionBean() {
		return this.tipoareaempresaproduSessionBean;
	}
	
	public void settipoareaempresaproduSessionBean(TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean) {
		this.tipoareaempresaproduSessionBean=tipoareaempresaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoareaempresaprodu,null);
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
	
	public void bugActualizarReferenciaActual(TipoAreaEmpresaProdu tipoareaempresaprodu,TipoAreaEmpresaProdu tipoareaempresaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAreaEmpresaProdu(tipoareaempresaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoareaempresaproduAux.setId(tipoareaempresaprodu.getId());
		tipoareaempresaproduAux.setVersionRow(tipoareaempresaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAreaEmpresaProdu();
		
			int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoareaempresaproduValidator.getInvalidValues(this.tipoareaempresaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoareaempresaproduLogic.setDatosCliente(datosCliente);
			tipoareaempresaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoareaempresaproduAux=new  TipoAreaEmpresaProdu();
				
				tipoareaempresaproduAux.setIsNew(true);
				tipoareaempresaproduAux.setIsChanged(true);
				
				tipoareaempresaproduAux.setTipoAreaEmpresaProduOriginal(this.tipoareaempresaprodu);
				
				tipoareaempresaproduAux.setId(this.tipoareaempresaprodu.getId());	
				tipoareaempresaproduAux.setVersionRow(this.tipoareaempresaprodu.getVersionRow());	
				tipoareaempresaproduAux.setid_empresa(this.tipoareaempresaprodu.getid_empresa());	
				tipoareaempresaproduAux.setnombre(this.tipoareaempresaprodu.getnombre());	
				tipoareaempresaproduAux.setdescripcion(this.tipoareaempresaprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduLogic.saveTipoAreaEmpresaProdus();//WithConnection
						//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoareaempresaproduLogic.saveTipoAreaEmpresaProduRelaciones(tipoareaempresaproduAux,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoareaempresaproduAux=new  TipoAreaEmpresaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoareaempresaprodu.getId()>=0)) {
						
					tipoareaempresaproduAux.setIsNew(false);
				}
				
				tipoareaempresaproduAux.setIsDeleted(false);
			
				tipoareaempresaproduAux.setId(this.tipoareaempresaprodu.getId());	
				tipoareaempresaproduAux.setVersionRow(this.tipoareaempresaprodu.getVersionRow());	
				tipoareaempresaproduAux.setid_empresa(this.tipoareaempresaprodu.getid_empresa());	
				tipoareaempresaproduAux.setnombre(this.tipoareaempresaprodu.getnombre());	
				tipoareaempresaproduAux.setdescripcion(this.tipoareaempresaprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduLogic.saveTipoAreaEmpresaProdus();//WithConnection
						//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoareaempresaproduLogic.saveTipoAreaEmpresaProduRelaciones(tipoareaempresaproduAux,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoareaempresaprodu,tipoareaempresaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoareaempresaproduAux=new  TipoAreaEmpresaProdu();
				
				tipoareaempresaproduAux.setIsNew(false);
				tipoareaempresaproduAux.setIsChanged(false);
				
				tipoareaempresaproduAux.setIsDeleted(true);
				
				tipoareaempresaproduAux.setId(this.tipoareaempresaprodu.getId());	
				tipoareaempresaproduAux.setVersionRow(this.tipoareaempresaprodu.getVersionRow());	
				tipoareaempresaproduAux.setid_empresa(this.tipoareaempresaprodu.getid_empresa());	
				tipoareaempresaproduAux.setnombre(this.tipoareaempresaprodu.getnombre());	
				tipoareaempresaproduAux.setdescripcion(this.tipoareaempresaprodu.getdescripcion());	
				
				if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoareaempresaproduAux.getId()>=0) {	
						this.tipoareaempresaprodusEliminados.add(tipoareaempresaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduLogic.saveTipoAreaEmpresaProdus();//WithConnection
						//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoareaempresaproduLogic.saveTipoAreaEmpresaProduRelaciones(tipoareaempresaproduAux,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoareaempresaproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoareaempresaproduAux,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoareaempresaproduAux,tipoareaempresaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().addAll(this.tipoareaempresaprodusEliminados);
					
					tipoareaempresaproduLogic.saveTipoAreaEmpresaProdus();//WithConnection
					//tipoareaempresaproduLogic.getSetVersionRowTipoAreaEmpresaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu();
				
				this.tipoareaempresaprodusEliminados= new ArrayList<TipoAreaEmpresaProdu>();		
			}
			
			if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Area Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoareaempresaprodu=tipoareaempresaproduAux;
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
      		//this.finishProcessTipoAreaEmpresaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAreaEmpresaProdu tipoareaempresaproduLocal) throws Exception {
		
		if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoareaempresaproduLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				tipoareaempresaproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
			
			} else {
			
				tipoareaempresaproduLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas);
				tipoareaempresaproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAreaEmpresaProdu tipoareaempresaproduLocal) throws Exception {	
		if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoareaempresaproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoAreaEmpresaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoareaempresaproduValidator.getInvalidValues(this.tipoareaempresaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAreaEmpresaProdu tipoareaempresaprodu,List<TipoAreaEmpresaProdu> tipoareaempresaprodus) throws Exception {
		try	{		
			TipoAreaEmpresaProduConstantesFunciones.actualizarLista(tipoareaempresaprodu,tipoareaempresaprodus,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAreaEmpresaProdu tipoareaempresaprodu,List<TipoAreaEmpresaProdu> tipoareaempresaprodus) throws Exception {
		try	{			
			TipoAreaEmpresaProduConstantesFunciones.actualizarSelectedLista(tipoareaempresaprodu,tipoareaempresaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAreaEmpresaProdu> tipoareaempresaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoareaempresaprodusLocal=this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoareaempresaprodusLocal=this.tipoareaempresaprodus;
			}
			//ARCHITECTURE
		
			for(TipoAreaEmpresaProdu tipoareaempresaproduLocal:tipoareaempresaprodusLocal) {
				if(this.permiteMantenimiento(tipoareaempresaproduLocal) && tipoareaempresaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAreaEmpresaProduConstantesFunciones.getTipoAreaEmpresaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAreaEmpresaProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelid_empresaTipoAreaEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAreaEmpresaProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelnombreTipoAreaEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAreaEmpresaProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabeldescripcionTipoAreaEmpresaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelid_empresaTipoAreaEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelnombreTipoAreaEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabeldescripcionTipoAreaEmpresaProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			if(this.tipoareaempresaprodu==null) {
				this.tipoareaempresaprodu= new TipoAreaEmpresaProdu();
			}

			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoAreaEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);

				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getproductoordendetaprodumaquina().setTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduMaquina")) {
			if(this.tipoareaempresaprodu==null) {
				this.tipoareaempresaprodu= new TipoAreaEmpresaProdu();
			}

			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoAreaEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);

				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getproductoprodumaquina().setTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoAreaEmpresaProdu--;	
		
		
		this.tipoareaempresaproduAux=new TipoAreaEmpresaProdu();
		
		this.tipoareaempresaproduAux.setId(this.iIdNuevoTipoAreaEmpresaProdu);
		this.tipoareaempresaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().add(this.tipoareaempresaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoareaempresaprodus.add(this.tipoareaempresaproduAux);
		}
		//ARCHITECTURE
		
		this.tipoareaempresaprodu=this.tipoareaempresaproduAux;
		
		if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
		}
				
		//this.setDefaultControlesTipoAreaEmpresaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAreaEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaEmpresaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaproduBean,this.tipoareaempresaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
			classes=TipoAreaEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoAreaEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.procesarEventosTipoAreaEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this.tipoareaempresaprodu,this.tipoareaempresaproduParameterGeneral,this.isEsNuevoTipoAreaEmpresaProdu,classes);//this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral,this.tipoareaempresaproduBean,false);
		
		if(this.tipoareaempresaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu());
		}
		
		if(this.tipoareaempresaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu(),classes);//this.tipoareaempresaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAreaEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAreaEmpresaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.RecargarFormTipoAreaEmpresaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
						
			if(tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();
			}
			
			this.actualizarVisualTableDatosTipoAreaEmpresaProdu();
			
			this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoAreaEmpresaProdu(), this.getIndiceNuevoTipoAreaEmpresaProdu());
			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
						
			this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAreaEmpresaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setEnabled(isHabilitar && this.tipoareaempresaproduConstantesFunciones.activarnombreTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setEnabled(isHabilitar && this.tipoareaempresaproduConstantesFunciones.activardescripcionTipoAreaEmpresaProdu);	
		//
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setEnabled(isHabilitar && this.tipoareaempresaproduConstantesFunciones.activarid_empresaTipoAreaEmpresaProdu);
	};
	
	public void setDefaultControlesTipoAreaEmpresaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAreaEmpresaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(true);			
			this.tipoareaempresaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(false);			
			this.tipoareaempresaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoAreaEmpresaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				if(tipoareaempresaproduAux.getId().equals(this.iIdNuevoTipoAreaEmpresaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaprodus) {
				if(tipoareaempresaproduAux.getId().equals(this.iIdNuevoTipoAreaEmpresaProdu)) {
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
	
	public int getIndiceActualTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				if(tipoareaempresaproduAux.getId().equals(tipoareaempresaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaprodus) {
				if(tipoareaempresaproduAux.getId().equals(tipoareaempresaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				if(tipoareaempresaproduAux.getTipoAreaEmpresaProduOriginal().getId().equals(tipoareaempresaproduOriginal.getId())) {
					existe=true;
					tipoareaempresaproduOriginal.setId(tipoareaempresaproduAux.getId());
					tipoareaempresaproduOriginal.setVersionRow(tipoareaempresaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaprodus) {
				if(tipoareaempresaproduAux.getTipoAreaEmpresaProduOriginal().getId().equals(tipoareaempresaproduOriginal.getId())) {
					existe=true;
					tipoareaempresaproduOriginal.setId(tipoareaempresaproduAux.getId());
					tipoareaempresaproduOriginal.setVersionRow(tipoareaempresaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAreaEmpresaProdu(Boolean esParaCancelar) throws Exception {
		tipoareaempresaprodusAux=new ArrayList<TipoAreaEmpresaProdu>();
		tipoareaempresaproduAux=new TipoAreaEmpresaProdu();
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
					if(tipoareaempresaproduAux.getId()<0) {
						tipoareaempresaprodusAux.add(tipoareaempresaproduAux);
					}		
				}
				this.iIdNuevoTipoAreaEmpresaProdu=0L;
				this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().removeAll(tipoareaempresaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaprodus) {
					if(tipoareaempresaproduAux.getId()<0) {
						tipoareaempresaprodusAux.add(tipoareaempresaproduAux);
					}		
				}
				this.iIdNuevoTipoAreaEmpresaProdu=0L;
				this.tipoareaempresaprodus.removeAll(tipoareaempresaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAreaEmpresaProdu 
					&& this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()>0
					) {
					tipoareaempresaproduAux=this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().get(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size() - 1);
				
					if(tipoareaempresaproduAux.getId()<0) {
						this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().remove(tipoareaempresaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAreaEmpresaProdu && this.tipoareaempresaprodus.size()>0) {
					tipoareaempresaproduAux=this.tipoareaempresaprodus.get(this.tipoareaempresaprodus.size() - 1);
				
					if(tipoareaempresaproduAux.getId()<0) {
						this.tipoareaempresaprodus.remove(tipoareaempresaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAreaEmpresaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoareaempresaprodu.getId()<0) {
				this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().remove(this.tipoareaempresaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoareaempresaprodu.getId()<0) {
				this.tipoareaempresaprodus.remove(this.tipoareaempresaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAreaEmpresaProdu(List<TipoAreaEmpresaProdu> tipoareaempresaprodusAux) throws Exception {
		TipoAreaEmpresaProduConstantesFunciones.setEstadosInicialesTipoAreaEmpresaProdu(tipoareaempresaprodusAux);
	}
	
	public void setEstadosInicialesTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaproduAux) throws Exception {
		TipoAreaEmpresaProduConstantesFunciones.setEstadosInicialesTipoAreaEmpresaProdu(tipoareaempresaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAreaEmpresaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAreaEmpresaProduActual()) {
				if(!this.isEsNuevoTipoAreaEmpresaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAreaEmpresaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAreaEmpresaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Area Empresa ?", "MANTENIMIENTO DE Tipo Area Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception {
		TipoAreaEmpresaProduConstantesFunciones.seleccionarAsignar(this.tipoareaempresaprodu,tipoareaempresaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAreaEmpresaProdu=this.isPermisoActualizarOriginalTipoAreaEmpresaProdu;
			
			
			this.seleccionarAsignar(tipoareaempresaprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAreaEmpresaProduConstantesFunciones.quitarEspaciosTipoAreaEmpresaProdu(this.tipoareaempresaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoareaempresaproduSessionBean.setsFuncionBusquedaRapida(this.tipoareaempresaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAreaEmpresaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAreaEmpresaProdu(esParaCancelar);				
				this.cancelarNuevoTipoAreaEmpresaProdu(esParaCancelar);								
			}
			
			this.tipoareaempresaprodu=new TipoAreaEmpresaProdu();
			
			this.inicializarTipoAreaEmpresaProdu();
			
			this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAreaEmpresaProdu() throws Exception {
		try {
			TipoAreaEmpresaProduConstantesFunciones.inicializarTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAreaEmpresaProdus(String sAccionBusqueda,List<TipoAreaEmpresaProdu> tipoareaempresaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAreaEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAreaEmpresaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAreaEmpresaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAreaEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Area Empresas");		
		parameters.put("busquedapor", TipoAreaEmpresaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoOrdenDetaProduMaquina.class));
			classes.add(new Classe(ProductoProduMaquina.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoAreaEmpresaProduLogic tipoareaempresaproduLogicAuxiliar=new TipoAreaEmpresaProduLogic();
					tipoareaempresaproduLogicAuxiliar.setDatosCliente(tipoareaempresaproduLogic.getDatosCliente());				
					tipoareaempresaproduLogicAuxiliar.setTipoAreaEmpresaProdus(tipoareaempresaprodusParaReportes);
					
					tipoareaempresaproduLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoAreaEmpresaProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoareaempresaprodusParaReportes=tipoareaempresaproduLogicAuxiliar.getTipoAreaEmpresaProdus();
					
					//tipoareaempresaproduLogic.getNewConnexionToDeep();
					
					//for (TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaprodusParaReportes) {
					//	tipoareaempresaproduLogic.deepLoad(tipoareaempresaprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoareaempresaproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAreaEmpresaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAreaEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAreaEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAreaEmpresaProdu=new JRBeanArrayDataSource(TipoAreaEmpresaProduJInternalFrame.TraerTipoAreaEmpresaProduBeans(tipoareaempresaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAreaEmpresaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAreaEmpresaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAreaEmpresaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAreaEmpresaProduBean.TraerTipoAreaEmpresaProduBeans(tipoareaempresaprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProduActionPerformed(null);
					//this.generarExcelReporteTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAreaEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoareaempresaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAreaEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaEmpresaProdu> tipoareaempresaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaEmpresaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAreaEmpresaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAreaEmpresaProdu tipoareaempresaprodu : tipoareaempresaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAreaEmpresaProduConstantesFunciones.generarExcelReporteDataTipoAreaEmpresaProdu("NORMAL",row,workbook,tipoareaempresaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAreaEmpresaProdu(String sTipo,Row row,Workbook workbook) {
		
		TipoAreaEmpresaProduConstantesFunciones.generarExcelReporteHeaderTipoAreaEmpresaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAreaEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaEmpresaProdu> tipoareaempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAreaEmpresaProdu tipoareaempresaprodu : tipoareaempresaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoareaempresaprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoareaempresaprodu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoareaempresaprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAreaEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaEmpresaProdu> tipoareaempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAreaEmpresaProdu> tipoareaempresaprodusRespaldo=null;
		
		classes=TipoAreaEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoAreaEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoareaempresaproduLogic.setDatosCliente(this.datosCliente);
		this.tipoareaempresaproduLogic.setDatosDeep(this.datosDeep);
		this.tipoareaempresaproduLogic.setIsConDeep(true);
		
		tipoareaempresaprodusRespaldo=this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus();
		
		this.tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(tipoareaempresaprodusParaReportes);	
		this.tipoareaempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoareaempresaprodusParaReportes=this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus();
		this.tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(tipoareaempresaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAreaEmpresaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAreaEmpresaProdu tipoareaempresaprodu : tipoareaempresaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAreaEmpresaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAreaEmpresaProduConstantesFunciones.generarExcelReporteDataTipoAreaEmpresaProdu("NORMAL",row,workbook,tipoareaempresaprodu,cellStyleDataAux);
		
			
			


				//ProductoOrdenDetaProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas()!=null && tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas()!=null) {
					i2=0;
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas()) {
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

				if(tipoareaempresaprodu.getProductoProduMaquinas()!=null && tipoareaempresaprodu.getProductoProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipoareaempresaprodu.getProductoProduMaquinas()!=null) {
					i2=0;
					for(ProductoProduMaquina productoprodumaquina : tipoareaempresaprodu.getProductoProduMaquinas()) {
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
		cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAreaEmpresaProdu() throws Exception {		
		this.startProcessTipoAreaEmpresaProdu(true);
	}
	
	public void startProcessTipoAreaEmpresaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAreaEmpresaProdu ,this.jPanelParametrosReportesTipoAreaEmpresaProdu, this.jScrollPanelDatosTipoAreaEmpresaProdu,this.jPanelPaginacionTipoAreaEmpresaProdu, this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu, this.jPanelAccionesTipoAreaEmpresaProdu,this.jPanelAccionesFormularioTipoAreaEmpresaProdu,this.jmenuBarTipoAreaEmpresaProdu,this.jmenuBarDetalleTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAreaEmpresaProdu=this.jTabbedPaneBusquedasTipoAreaEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoAreaEmpresaProdu=this.jPanelParametrosReportesTipoAreaEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoAreaEmpresaProdu=this.jScrollPanelDatosTipoAreaEmpresaProdu;
		final JTable jTableDatosTipoAreaEmpresaProdu=this.jTableDatosTipoAreaEmpresaProdu;		
		final JPanel jPanelPaginacionTipoAreaEmpresaProdu=this.jPanelPaginacionTipoAreaEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoAreaEmpresaProdu=this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu;
		final JPanel jPanelAccionesTipoAreaEmpresaProdu=this.jPanelAccionesTipoAreaEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoAreaEmpresaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelCamposTipoAreaEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelAccionesFormularioTipoAreaEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoAreaEmpresaProdu=jPanelCamposAuxiliarTipoAreaEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoAreaEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoAreaEmpresaProdu=this.jmenuBarTipoAreaEmpresaProdu;
		final JToolBar jTtoolBarTipoAreaEmpresaProdu=this.jTtoolBarTipoAreaEmpresaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jmenuBarDetalleTipoAreaEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTtoolBarDetalleTipoAreaEmpresaProdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoAreaEmpresaProdu=jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoAreaEmpresaProdu=jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAreaEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAreaEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoAreaEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoAreaEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAreaEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAreaEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAreaEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAreaEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAreaEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoAreaEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAreaEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAreaEmpresaProdu ,jPanelParametrosReportesTipoAreaEmpresaProdu,jTableDatosTipoAreaEmpresaProdu, /*jScrollPanelDatosTipoAreaEmpresaProdu,*/jPanelCamposTipoAreaEmpresaProdu,jPanelPaginacionTipoAreaEmpresaProdu, /*jScrollPanelDatosEdicionTipoAreaEmpresaProdu,*/ jPanelAccionesTipoAreaEmpresaProdu,jPanelAccionesFormularioTipoAreaEmpresaProdu,jmenuBarTipoAreaEmpresaProdu,jmenuBarDetalleTipoAreaEmpresaProdu,jTtoolBarTipoAreaEmpresaProdu,jTtoolBarDetalleTipoAreaEmpresaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAreaEmpresaProdu ,jPanelParametrosReportesTipoAreaEmpresaProdu, jScrollPanelDatosTipoAreaEmpresaProdu,jPanelPaginacionTipoAreaEmpresaProdu, jScrollPanelDatosEdicionTipoAreaEmpresaProdu, jPanelAccionesTipoAreaEmpresaProdu,jPanelAccionesFormularioTipoAreaEmpresaProdu,jmenuBarTipoAreaEmpresaProdu,jmenuBarDetalleTipoAreaEmpresaProdu,jTtoolBarTipoAreaEmpresaProdu,jTtoolBarDetalleTipoAreaEmpresaProdu);
						
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
	
	public void finishProcessTipoAreaEmpresaProdu() {// throws Exception 
		this.finishProcessTipoAreaEmpresaProdu(true);
	}
	
	public void finishProcessTipoAreaEmpresaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAreaEmpresaProdu ,this.jPanelParametrosReportesTipoAreaEmpresaProdu, this.jScrollPanelDatosTipoAreaEmpresaProdu,this.jPanelPaginacionTipoAreaEmpresaProdu, this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu, this.jPanelAccionesTipoAreaEmpresaProdu,this.jPanelAccionesFormularioTipoAreaEmpresaProdu,this.jmenuBarTipoAreaEmpresaProdu,this.jmenuBarDetalleTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAreaEmpresaProdu=this.jTabbedPaneBusquedasTipoAreaEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoAreaEmpresaProdu=this.jPanelParametrosReportesTipoAreaEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoAreaEmpresaProdu=this.jScrollPanelDatosTipoAreaEmpresaProdu;
		final JTable jTableDatosTipoAreaEmpresaProdu=this.jTableDatosTipoAreaEmpresaProdu;		
		final JPanel jPanelPaginacionTipoAreaEmpresaProdu=this.jPanelPaginacionTipoAreaEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoAreaEmpresaProdu=this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu;
		final JPanel jPanelAccionesTipoAreaEmpresaProdu=this.jPanelAccionesTipoAreaEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoAreaEmpresaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelCamposTipoAreaEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelAccionesFormularioTipoAreaEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoAreaEmpresaProdu=jPanelCamposAuxiliarTipoAreaEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoAreaEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoAreaEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoAreaEmpresaProdu=this.jmenuBarTipoAreaEmpresaProdu;		
		final JToolBar jTtoolBarTipoAreaEmpresaProdu=this.jTtoolBarTipoAreaEmpresaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jmenuBarDetalleTipoAreaEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTtoolBarDetalleTipoAreaEmpresaProdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAreaEmpresaProdu=jmenuBarDetalleAuxiliarTipoAreaEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoAreaEmpresaProdu=jTtoolBarDetalleAuxiliarTipoAreaEmpresaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAreaEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAreaEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoAreaEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoAreaEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAreaEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAreaEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAreaEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAreaEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAreaEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoAreaEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAreaEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAreaEmpresaProdu ,jPanelParametrosReportesTipoAreaEmpresaProdu, jTableDatosTipoAreaEmpresaProdu,/*jScrollPanelDatosTipoAreaEmpresaProdu,*/jPanelCamposTipoAreaEmpresaProdu,jPanelPaginacionTipoAreaEmpresaProdu, /*jScrollPanelDatosEdicionTipoAreaEmpresaProdu,*/ jPanelAccionesTipoAreaEmpresaProdu,jPanelAccionesFormularioTipoAreaEmpresaProdu,jmenuBarTipoAreaEmpresaProdu,jmenuBarDetalleTipoAreaEmpresaProdu,jTtoolBarTipoAreaEmpresaProdu,jTtoolBarDetalleTipoAreaEmpresaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAreaEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAreaEmpresaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAreaEmpresaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAreaEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAreaEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAreaEmpresaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAreaEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAreaEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAreaEmpresaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoareaempresaproduConstantesFunciones.getsFinalQueryTipoAreaEmpresaProdu();
		String  finalQueryPaginacionTodos=this.tipoareaempresaproduConstantesFunciones.getsFinalQueryTipoAreaEmpresaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAreaEmpresaProduConstantesFunciones.getArrayColumnasGlobalesNoTipoAreaEmpresaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAreaEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoAreaEmpresaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAreaEmpresaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoareaempresaprodusEliminados= new ArrayList<TipoAreaEmpresaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAreaEmpresaProdu();
		
				///*TipoAreaEmpresaProduSessionBean*/this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
			
			if(this.tipoareaempresaproduSessionBean==null) {
				this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
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
					this.iNumeroPaginacion=TipoAreaEmpresaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAreaEmpresaProduConstantesFunciones.getClassesForeignKeysOfTipoAreaEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoareaempresaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoareaempresaprodusAux= new ArrayList<TipoAreaEmpresaProdu>();
			
				
			tipoareaempresaproduLogic.setDatosCliente(this.datosCliente);
			tipoareaempresaproduLogic.setDatosDeep(this.datosDeep);
			tipoareaempresaproduLogic.setIsConDeep(true);
			
			
			tipoareaempresaproduLogic.getTipoAreaEmpresaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoareaempresaproduLogic.getTodosTipoAreaEmpresaProdus(finalQueryGlobal,pagination);
					
					//tipoareaempresaproduLogic.getTodosTipoAreaEmpresaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()==null|| tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoareaempresaprodusAux= new ArrayList<TipoAreaEmpresaProdu>();
							tipoareaempresaprodusAux.addAll(tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoareaempresaprodusAux= new ArrayList<TipoAreaEmpresaProdu>();
							tipoareaempresaprodusAux.addAll(tipoareaempresaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoareaempresaproduLogic.getTodosTipoAreaEmpresaProdus(finalQueryGlobal+"",this.pagination);												
							
							//tipoareaempresaproduLogic.getTodosTipoAreaEmpresaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaproduLogic.getTipoAreaEmpresaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(new ArrayList<TipoAreaEmpresaProdu>());					
							tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().addAll(tipoareaempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
							tipoareaempresaprodus.addAll(tipoareaempresaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAreaEmpresaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAreaEmpresaProdu=this.idActual;
				
				} else if(this.idTipoAreaEmpresaProduActual!=null && this.idTipoAreaEmpresaProduActual!=0L) {
					idTipoAreaEmpresaProdu=idTipoAreaEmpresaProduActual;
				}
				
					
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndicePorId(idTipoAreaEmpresaProdu);
				
				this.tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoareaempresaproduLogic.getEntity(idTipoAreaEmpresaProdu);
					
					//tipoareaempresaproduLogic.getEntityWithConnection(idTipoAreaEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(new ArrayList<TipoAreaEmpresaProdu>());
					tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().add(tipoareaempresaproduLogic.getTipoAreaEmpresaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
					this.tipoareaempresaprodus.add(tipoareaempresaprodu);
				}
				
				if(tipoareaempresaproduLogic.getTipoAreaEmpresaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoareaempresaproduLogic.getTipoAreaEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()==null||tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoareaempresaprodus==null|| tipoareaempresaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaprodusAux=new ArrayList<TipoAreaEmpresaProdu>();
						tipoareaempresaprodusAux.addAll(tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoareaempresaprodusAux=new ArrayList<TipoAreaEmpresaProdu>();
							tipoareaempresaprodusAux.addAll(tipoareaempresaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoareaempresaproduLogic.getTipoAreaEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAreaEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAreaEmpresaProdus("FK_IdEmpresa",tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAreaEmpresaProdus("FK_IdEmpresa",tipoareaempresaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(new ArrayList<TipoAreaEmpresaProdu>());
						tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().addAll(tipoareaempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
							tipoareaempresaprodus.addAll(tipoareaempresaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAreaEmpresaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAreaEmpresaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoareaempresaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoareaempresaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAreaEmpresaProdu tipoareaempresaprodu) {
		Boolean permite=true;
		
		if(this.tipoareaempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAreaEmpresaProduConstantesFunciones.getOrderByListaTipoAreaEmpresaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAreaEmpresaProduConstantesFunciones.getOrderByListaTipoAreaEmpresaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				if(tipoareaempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoareaempresaproduTotales=tipoareaempresaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodus) {
				if(tipoareaempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoareaempresaproduTotales=tipoareaempresaprodu;
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
			this.tipoareaempresaproduAux=new TipoAreaEmpresaProdu();
			this.tipoareaempresaproduAux.setsType(Constantes2.S_TOTALES);
			this.tipoareaempresaproduAux.setIsNew(false);
			this.tipoareaempresaproduAux.setIsChanged(false);
			this.tipoareaempresaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAreaEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoAreaEmpresaProdu(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this.tipoareaempresaproduAux);
				
				this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().add(this.tipoareaempresaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAreaEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoAreaEmpresaProdu(this.tipoareaempresaprodus,this.tipoareaempresaproduAux);
				
				this.tipoareaempresaprodus.add(this.tipoareaempresaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoareaempresaproduTotales=new TipoAreaEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().remove(tipoareaempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoareaempresaprodus.remove(tipoareaempresaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoareaempresaproduTotales=new TipoAreaEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				if(tipoareaempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoareaempresaproduTotales=tipoareaempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAreaEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoAreaEmpresaProdu(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),tipoareaempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodus) {
				if(tipoareaempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoareaempresaproduTotales=tipoareaempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAreaEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoAreaEmpresaProdu(this.tipoareaempresaprodus,tipoareaempresaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAreaEmpresaProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAreaEmpresaProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoareaempresaproduLogic.getTipoAreaEmpresaProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoAreaEmpresaProdu() {
		this.isPermisoTodoTipoAreaEmpresaProdu=false;
		this.isPermisoNuevoTipoAreaEmpresaProdu=false;
		this.isPermisoActualizarTipoAreaEmpresaProdu=false;
		this.isPermisoActualizarOriginalTipoAreaEmpresaProdu=false;
		this.isPermisoEliminarTipoAreaEmpresaProdu=false;
		this.isPermisoGuardarCambiosTipoAreaEmpresaProdu=false;
		this.isPermisoConsultaTipoAreaEmpresaProdu=false;
		this.isPermisoBusquedaTipoAreaEmpresaProdu=false;
		this.isPermisoReporteTipoAreaEmpresaProdu=false;		
		this.isPermisoOrdenTipoAreaEmpresaProdu=false;		
		this.isPermisoPaginacionMedioTipoAreaEmpresaProdu=false;		
		this.isPermisoPaginacionAltoTipoAreaEmpresaProdu=false;
		this.isPermisoPaginacionTodoTipoAreaEmpresaProdu=false;
		this.isPermisoCopiarTipoAreaEmpresaProdu=false;		
		this.isPermisoVerFormTipoAreaEmpresaProdu=false;		
		this.isPermisoDuplicarTipoAreaEmpresaProdu=false;		
		this.isPermisoOrdenTipoAreaEmpresaProdu=false;		
	}
	
	public void setPermisosUsuarioTipoAreaEmpresaProdu(Boolean isPermiso) {
		this.isPermisoTodoTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoConsultaTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoBusquedaTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoReporteTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoCopiarTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoVerFormTipoAreaEmpresaProdu=isPermiso;		
		this.isPermisoDuplicarTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoAreaEmpresaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAreaEmpresaProdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoAreaEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoAreaEmpresaProdu=isPermiso;
		//this.isPermisoConsultaTipoAreaEmpresaProdu=isPermiso;
		//this.isPermisoBusquedaTipoAreaEmpresaProdu=isPermiso;
		//this.isPermisoReporteTipoAreaEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoAreaEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAreaEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAreaEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAreaEmpresaProdu=isPermiso;		
		//this.isPermisoCopiarTipoAreaEmpresaProdu=isPermiso;		
		//this.isPermisoDuplicarTipoAreaEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoAreaEmpresaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAreaEmpresaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoAreaEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoOrdenDetaProduMaquina=false;
		this.isTienePermisosProductoOrdenDetaProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoAreaEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduMaquina=false;
		this.isTienePermisosProductoProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoAreaEmpresaProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAreaEmpresaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAreaEmpresaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoOrdenDetaProduMaquina=conPermiso;
		this.isTienePermisosProductoProduMaquina=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAreaEmpresaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAreaEmpresaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAreaEmpresaProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoOrdenDetaProduMaquina && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduMaquina && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoAreaEmpresaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAreaEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAreaEmpresaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAreaEmpresaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAreaEmpresaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAreaEmpresaProdu=this.isPermisoActualizarTipoAreaEmpresaProdu;
			this.isPermisoEliminarTipoAreaEmpresaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAreaEmpresaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAreaEmpresaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAreaEmpresaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAreaEmpresaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAreaEmpresaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAreaEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAreaEmpresaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAreaEmpresaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAreaEmpresaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAreaEmpresaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAreaEmpresaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAreaEmpresaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAreaEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAreaEmpresaProdu.setToolTipText(this.jTableDatosTipoAreaEmpresaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAreaEmpresaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAreaEmpresaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAreaEmpresaProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden Maquina");
			reporte.setsDescripcion("Orden Maquina");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTipoAreaEmpresaProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAreaEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAreaEmpresaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAreaEmpresaProduListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoAreaEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduReturnGeneral=new TipoAreaEmpresaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoareaempresaproduConstantesFunciones.cargarid_empresaTipoAreaEmpresaProdu)
					 || (this.esRecargarFks && this.tipoareaempresaproduConstantesFunciones.cargarid_empresaTipoAreaEmpresaProdu)) {

					if(!this.tipoareaempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoareaempresaproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.cargarCombosLoteForeignKeyTipoAreaEmpresaProdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoareaempresaproduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoareaempresaproduSessionBean==null) {
				this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
			}

			if(!this.tipoareaempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAreaEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaEmpresaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAreaEmpresaProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAreaEmpresaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAreaEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoAreaEmpresaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAreaEmpresaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAreaEmpresaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean(); 
		this.tipoareaempresaproduConstantesFunciones=new TipoAreaEmpresaProduConstantesFunciones(); 
		this.tipoareaempresaproduBean=new TipoAreaEmpresaProdu();//(this.tipoareaempresaproduConstantesFunciones); 		
		this.tipoareaempresaproduReturnGeneral=new TipoAreaEmpresaProduParameterReturnGeneral(); 
		
		this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoareaempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAreaEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAreaEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAreaEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAreaEmpresaProdu(true);
			
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
			
			this.tipoareaempresaproduConstantesFunciones=new TipoAreaEmpresaProduConstantesFunciones(); 
			this.tipoareaempresaproduBean=new TipoAreaEmpresaProdu();//this.tipoareaempresaproduConstantesFunciones); 			
			this.tipoareaempresaproduReturnGeneral=new TipoAreaEmpresaProduParameterReturnGeneral(); 
		
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Area Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoareaempresaprodu=new TipoAreaEmpresaProdu();
			this.tipoareaempresaprodus = new ArrayList<TipoAreaEmpresaProdu>();
			this.tipoareaempresaprodusAux = new ArrayList<TipoAreaEmpresaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic=new TipoAreaEmpresaProduLogic();
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoareaempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu);	
					}
					
					if(this.jInternalFrameImportacionTipoAreaEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAreaEmpresaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAreaEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAreaEmpresaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu);
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu);
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAreaEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAreaEmpresaProdu);
					this.jInternalFrameImportacionTipoAreaEmpresaProdu.setVisible(false);
					this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAreaEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAreaEmpresaProdu);
					this.jInternalFrameOrderByTipoAreaEmpresaProdu.setVisible(false);
					this.jInternalFrameOrderByTipoAreaEmpresaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAreaEmpresaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAreaEmpresaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoareaempresaproduReturnGeneral=new TipoAreaEmpresaProduParameterReturnGeneral();
			
			this.tipoareaempresaproduParameterGeneral=new TipoAreaEmpresaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoareaempresaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAreaEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoareaempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAreaEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoareaempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAreaEmpresaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAreaEmpresaProdu(false);
			
			this.setPermisosUsuarioTipoAreaEmpresaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoareaempresaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAreaEmpresaProduClasesRelacionadas();
			}
			
			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAreaEmpresaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAreaEmpresaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAreaEmpresaProdu();
			}
			
			if(!this.isPermisoBusquedaTipoAreaEmpresaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAreaEmpresaProdu,this.isPermisoPaginacionMedioTipoAreaEmpresaProdu,this.isPermisoPaginacionTodoTipoAreaEmpresaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAreaEmpresaProduConstantesFunciones.getTiposSeleccionarTipoAreaEmpresaProdu());
				
				this.tiposColumnasSelect=TipoAreaEmpresaProduConstantesFunciones.getTiposSeleccionarTipoAreaEmpresaProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoAreaEmpresaProdu();				
				//this.tiposRelacionesSelect=TipoAreaEmpresaProduConstantesFunciones.getTiposRelacionesTipoAreaEmpresaProdu(true);
				
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
			//if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAreaEmpresaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoAreaEmpresaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoAreaEmpresaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaEmpresaProdu() ;
			
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
				tipoareaempresaproduImplementable= (TipoAreaEmpresaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAreaEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoareaempresaproduImplementableHome= (TipoAreaEmpresaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAreaEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoareaempresaprodus= new ArrayList<TipoAreaEmpresaProdu>();
			this.tipoareaempresaprodusEliminados= new ArrayList<TipoAreaEmpresaProdu>();
						
			this.isEsNuevoTipoAreaEmpresaProdu=false;
			this.esParaAccionDesdeFormularioTipoAreaEmpresaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAreaEmpresaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAreaEmpresaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAreaEmpresaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAreaEmpresaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAreaEmpresaProdu();
			}
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAreaEmpresaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAreaEmpresaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAreaEmpresaProdu() {
		Reporte reporte=new Reporte();
		
	

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
			if(sTipo.equals("RelacionesTipoAreaEmpresaProdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Orden Maquinaes")) {
					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoAreaEmpresaProdu();

						this.cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Maquina Producciones")) {
					if(!ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoAreaEmpresaProdu();

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
				this.finishProcessTipoAreaEmpresaProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(false,true,iIndex);
		this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();

		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(false,true,iIndex);
		this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMaquina();

		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
				int row=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
				jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduMaquina")) {
				int row=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
				jButtonProductoProduMaquinaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Orden Maquina")) {

					if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden Maquinaes"+"("+ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden Maquinaes");

						if(tipoareaempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoareaempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoareaempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoOrdenDetaProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jmenuDetalleTipoAreaEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Maquina Produccion")) {

					if(this.isTienePermisosProductoProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Maquina Producciones"+"("+ProductoProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Maquina Producciones");

						if(tipoareaempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoAreaEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoareaempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoAreaEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoareaempresaproduConstantesFunciones.activarProductoProduMaquinaTipoAreaEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jmenuDetalleTipoAreaEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoAreaEmpresaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAreaEmpresaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAreaEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAreaEmpresaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAreaEmpresaProdu();
		
		this.cargarCombosFrameForeignKeyTipoAreaEmpresaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAreaEmpresaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAreaEmpresaProdu();
		}
	}
	
	
	
	public void jButtonNuevoTipoAreaEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			
			if(jTableDatosTipoAreaEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoAreaEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoAreaEmpresaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAreaEmpresaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAreaEmpresaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(true);			
			//this.tipoareaempresaprodu=new TipoAreaEmpresaProdu();
			//this.tipoareaempresaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu() ;
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaEmpresaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoareaempresaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);				
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAreaEmpresaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAreaEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRows().length;			
			}
			
			tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAreaEmpresaProdu--;			
				//TipoAreaEmpresaProdu tipoareaempresaproduAux= new TipoAreaEmpresaProdu();			
				//tipoareaempresaproduAux.setId(this.iIdNuevoTipoAreaEmpresaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAreaEmpresaProdu tipoareaempresaproduOrigen=new TipoAreaEmpresaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAreaEmpresaProdu tipoareaempresaproduOrigen : tipoareaempresaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoareaempresaproduOrigen =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoareaempresaproduOrigen =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAreaEmpresaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoareaempresaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAreaEmpresaProdu(tipoareaempresaproduOrigen,this.tipoareaempresaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().add(this.tipoareaempresaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodus.add(this.tipoareaempresaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
				
				this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoAreaEmpresaProdu(), this.getIndiceNuevoTipoAreaEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoAreaEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAreaEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAreaEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();									
		
			TipoAreaEmpresaProdu tipoareaempresaproduOrigen=new TipoAreaEmpresaProdu();
			TipoAreaEmpresaProdu tipoareaempresaproduDestino=new TipoAreaEmpresaProdu();
				
			tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoareaempresaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAreaEmpresaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduOrigen =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoareaempresaproduOrigen =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoareaempresaproduDestino =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoareaempresaproduDestino =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoareaempresaproduOrigen =tipoareaempresaprodusSeleccionados.get(0);
				tipoareaempresaproduDestino =tipoareaempresaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAreaEmpresaProdu(tipoareaempresaproduOrigen,tipoareaempresaproduDestino,true,false);
				
				tipoareaempresaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoareaempresaproduDestino,tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoareaempresaproduDestino,tipoareaempresaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
				
				//this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoAreaEmpresaProdu(), this.getIndiceNuevoTipoAreaEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoAreaEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAreaEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAreaEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAreaEmpresaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(!isVisible);
			this.jPanelAccionesTipoAreaEmpresaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAreaEmpresaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAreaEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAreaEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAreaEmpresaProdu();
			
			this.abrirFrameOrderByTipoAreaEmpresaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAreaEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAreaEmpresaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAreaEmpresaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSize(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth(),TipoAreaEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth(),TipoAreaEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth(),TipoAreaEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();
					}

					if(ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMaquina();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAreaEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAreaEmpresaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAreaEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaEmpresaProdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoAreaEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaEmpresaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAreaEmpresaProdu);
				this.jInternalFrameOrderByTipoAreaEmpresaProdu.setVisible(false);
				this.jInternalFrameOrderByTipoAreaEmpresaProdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAreaEmpresaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAreaEmpresaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAreaEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAreaEmpresaProdu==null) {
				
				this.jInternalFrameImportacionTipoAreaEmpresaProdu=new ImportacionJInternalFrame(TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAreaEmpresaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAreaEmpresaProdu);
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.setVisible(false);
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSelected(false);


				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAreaEmpresaProdu"));
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAreaEmpresaProdu"));
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAreaEmpresaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAreaEmpresaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu==null) {
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu);
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaEmpresaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaEmpresaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jContentPaneDetalleTipoAreaEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoAreaEmpresaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAreaEmpresaProdu);
			
	       	this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.dispose();
			//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAreaEmpresaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAreaEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAreaEmpresaProdu.setVisible(true);
	        this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAreaEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setVisible(true);
	        this.jInternalFrameOrderByTipoAreaEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAreaEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setVisible(false);
	        this.jInternalFrameOrderByTipoAreaEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAreaEmpresaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAreaEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAreaEmpresaProdu.setVisible(false);
	        this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAreaEmpresaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAreaEmpresaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(true);
			//this.isEsNuevoTipoAreaEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false) ;
			
			if(tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaEmpresaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAreaEmpresaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAreaEmpresaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(true);
			//this.isEsNuevoTipoAreaEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoareaempresaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false) ;
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaEmpresaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAreaEmpresaProdu(false);
			
			//if(!this.isEsNuevoTipoAreaEmpresaProdu) {								
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.tipoareaempresaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAreaEmpresaProdu=true;
					this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
					this.isEsNuevoTipoAreaEmpresaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAreaEmpresaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAreaEmpresaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(false);
			
												
				
				if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAreaEmpresaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,tipoareaempresaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoareaempresaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoareaempresaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoareaempresaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoareaempresaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoareaempresaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAreaEmpresaProduModel) this.jTableDatosTipoAreaEmpresaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAreaEmpresaProdu=true;
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
				this.isEsNuevoTipoAreaEmpresaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(false);
				
				
				
				if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAreaEmpresaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAreaEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoAreaEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoAreaEmpresaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAreaEmpresaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(false) ;
			
			this.isEsNuevoTipoAreaEmpresaProdu=false;
			
			if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAreaEmpresaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
				
				//SI ES MANUAL
				if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAreaEmpresaProdu--;			
			//TipoAreaEmpresaProdu tipoareaempresaproduAux= new TipoAreaEmpresaProdu();			
			//tipoareaempresaproduAux.setId(this.iIdNuevoTipoAreaEmpresaProdu);
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAreaEmpresaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
			
			this.tipoareaempresaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().add(this.tipoareaempresaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoareaempresaprodus.add(this.tipoareaempresaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			
			this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoAreaEmpresaProdu(), this.getIndiceNuevoTipoAreaEmpresaProdu());
			
			int iLastRow =  this.jTableDatosTipoAreaEmpresaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAreaEmpresaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAreaEmpresaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();
			}
			
			//this.abrirFrameTreeTipoAreaEmpresaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Area EmpresaS ?", "MANTENIMIENTO DE Tipo Area Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAreaEmpresaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAreaEmpresaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.procesarImportacionTipoAreaEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoareaempresaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAreaEmpresaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAreaEmpresaProdu.setFileImportacion(this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAreaEmpresaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAreaEmpresaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		

		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAreaEmpresaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAreaEmpresaProduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAreaEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoareaempresaprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoareaempresaprodu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoareaempresaprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoAreaEmpresaProdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAreaEmpresaProdu(tipoareaempresaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAreaEmpresaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAreaEmpresaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAreaEmpresaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAreaEmpresaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAreaEmpresaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAreaEmpresaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAreaEmpresaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAreaEmpresaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAreaEmpresaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAreaEmpresaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAreaEmpresaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAreaEmpresaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAreaEmpresaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaEmpresaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAreaEmpresaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAreaEmpresaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu();
		
		this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAreaEmpresaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaEmpresaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaEmpresaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaEmpresaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAreaEmpresaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaEmpresaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaEmpresaProdu() throws Exception {
		try	{
			if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAreaEmpresaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAreaEmpresaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAreaEmpresaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaEmpresaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaEmpresaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAreaEmpresaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAreaEmpresaProdu(Boolean esInicializar) throws Exception {				
		if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAreaEmpresaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAreaEmpresaProdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAreaEmpresaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAreaEmpresaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAreaEmpresaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoareaempresaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAreaEmpresaProdu.setModel(new TipoAreaEmpresaProduModel(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAreaEmpresaProdu.setModel(new TipoAreaEmpresaProduModel(this.tipoareaempresaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAreaEmpresaProdu!=null && this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAreaEmpresaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoareaempresaproduConstantesFunciones.resaltarSeleccionarTipoAreaEmpresaProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoareaempresaproduConstantesFunciones.resaltarSeleccionarTipoAreaEmpresaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,TipoAreaEmpresaProduConstantesFunciones.LABEL_ID));

		if(this.tipoareaempresaproduConstantesFunciones.mostraridTipoAreaEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaEmpresaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoareaempresaproduConstantesFunciones.resaltaridTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activaridTipoAreaEmpresaProdu,this,true,"idTipoAreaEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoareaempresaproduConstantesFunciones.resaltaridTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activaridTipoAreaEmpresaProdu,this,true,"idTipoAreaEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoareaempresaproduConstantesFunciones.mostrarid_empresaTipoAreaEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoareaempresaproduConstantesFunciones.resaltarid_empresaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarid_empresaTipoAreaEmpresaProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoareaempresaproduConstantesFunciones.resaltarid_empresaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarid_empresaTipoAreaEmpresaProdu,false,"id_empresaTipoAreaEmpresaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoareaempresaproduConstantesFunciones.mostrarnombreTipoAreaEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoareaempresaproduConstantesFunciones.resaltarnombreTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activarnombreTipoAreaEmpresaProdu,this,true,"nombreTipoAreaEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoareaempresaproduConstantesFunciones.resaltarnombreTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activarnombreTipoAreaEmpresaProdu,this,true,"nombreTipoAreaEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoareaempresaproduConstantesFunciones.mostrardescripcionTipoAreaEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoareaempresaproduConstantesFunciones.resaltardescripcionTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activardescripcionTipoAreaEmpresaProdu,this,true,"descripcionTipoAreaEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoareaempresaproduConstantesFunciones.resaltardescripcionTipoAreaEmpresaProdu,this.tipoareaempresaproduConstantesFunciones.activardescripcionTipoAreaEmpresaProdu,this,true,"descripcionTipoAreaEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden Maquinaes");
				tableColumn.setHeaderValue("Orden Maquinaes");
				tableColumn.setCellRenderer(new ProductoOrdenDetaProduMaquinaTableCell(tipoareaempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu));
				tableColumn.setCellEditor(new ProductoOrdenDetaProduMaquinaTableCell(tipoareaempresaproduConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoAreaEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduMaquina && this.tipoareaempresaproduConstantesFunciones.mostrarProductoProduMaquinaTipoAreaEmpresaProdu && !TipoAreaEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Maquina Producciones");
				tableColumn.setHeaderValue("Producto Maquina Producciones");
				tableColumn.setCellRenderer(new ProductoProduMaquinaTableCell(tipoareaempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarProductoProduMaquinaTipoAreaEmpresaProdu));
				tableColumn.setCellEditor(new ProductoProduMaquinaTableCell(tipoareaempresaproduConstantesFunciones.resaltarProductoProduMaquinaTipoAreaEmpresaProdu,this,this.tipoareaempresaproduConstantesFunciones.activarProductoProduMaquinaTipoAreaEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAreaEmpresaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAreaEmpresaProdu.moveColumn(this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAreaEmpresaProdu.moveColumn(this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoAreaEmpresaProdu.moveColumn(this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAreaEmpresaProdu.moveColumn(this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAreaEmpresaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAreaEmpresaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAreaEmpresaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAreaEmpresaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAreaEmpresaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAreaEmpresaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoareaempresaprodus.size()-1;
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
		//this.jTableDatosTipoAreaEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAreaEmpresaProdu();
			
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
				
				//this.isEsNuevoTipoAreaEmpresaProdu=false;
					
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
				if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAreaEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoareaempresaprodu.getsType().equals("DUPLICADO")
				   || this.tipoareaempresaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAreaEmpresaProdu=true;
				
				} else {
					this.isEsNuevoTipoAreaEmpresaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoareaempresaprodu.getId()>=0 && !this.tipoareaempresaprodu.getIsNew()) {						
						this.isEsNuevoTipoAreaEmpresaProdu=false;
						
					} else {
						this.isEsNuevoTipoAreaEmpresaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAreaEmpresaProdu(esRelaciones);						
				
				this.seleccionarTipoAreaEmpresaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoareaempresaprodu.getId()<0) {
					this.isEsNuevoTipoAreaEmpresaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAreaEmpresaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAreaEmpresaProdu(evt,rowIndex);
				}	
				
				if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAreaEmpresaProdu: " + this.dDif); 
					}
				}								
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAreaEmpresaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoareaempresaprodu)) {
					if(this.tipoareaempresaprodu.getId()>0) {
						this.tipoareaempresaprodu.setIsDeleted(true);
						
						this.tipoareaempresaprodusEliminados.add(this.tipoareaempresaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().remove(this.tipoareaempresaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodus.remove(this.tipoareaempresaprodu);				
					}
					
					
					((TipoAreaEmpresaProduModel) this.jTableDatosTipoAreaEmpresaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAreaEmpresaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAreaEmpresaProdu) {
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAreaEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoareaempresaproduConstantesFunciones.cargarid_empresaTipoAreaEmpresaProdu || this.tipoareaempresaproduConstantesFunciones.event_dependid_empresaTipoAreaEmpresaProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoareaempresaprodu.getid_empresa());
									//this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoareaempresaprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoareaempresaprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoareaempresaprodu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAreaEmpresaProdu(tipoareaempresaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(tipoareaempresaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAreaEmpresaProdu(tipoareaempresaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaEmpresaProdu(tipoareaempresaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAreaEmpresaProdu tipoareaempresaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoareaempresaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAreaEmpresaProdu tipoareaempresaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoareaempresaproduLocal=this.tipoareaempresaprodu;
			} else {
				tipoareaempresaproduLocal=this.tipoareaempresaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoareaempresaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAreaEmpresaProdu(tipoareaempresaproduLocal,true);
					
					if(tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoareaempresaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoareaempresaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(tipoareaempresaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(tipoareaempresaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(tipoareaempresaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.getText()==null || this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.getText()=="" || this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setText("0");
			}

			if(conColumnasBase) {tipoareaempresaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaEmpresaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelIdTipoAreaEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoareaempresaprodu.setnombre(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelnombreTipoAreaEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoareaempresaprodu.setdescripcion(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabeldescripcionTipoAreaEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaproduBean,TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaproduOrigen,TipoAreaEmpresaProdu tipoareaempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoareaempresaproduOrigen.getId()!=null && !tipoareaempresaproduOrigen.getId().equals(0L))) {tipoareaempresaprodu.setId(tipoareaempresaproduOrigen.getId());}}
			if(conDefault || (!conDefault && tipoareaempresaproduOrigen.getnombre()!=null && !tipoareaempresaproduOrigen.getnombre().equals(""))) {tipoareaempresaprodu.setnombre(tipoareaempresaproduOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoareaempresaproduOrigen.getdescripcion()!=null && !tipoareaempresaproduOrigen.getdescripcion().equals(""))) {tipoareaempresaprodu.setdescripcion(tipoareaempresaproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setText(tipoareaempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAreaEmpresaProdu(TipoAreaEmpresaProduBean tipoareaempresaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setText(tipoareaempresaproduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setText(tipoareaempresaproduBean.getnombre());
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setText(tipoareaempresaproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAreaEmpresaProdu(TipoAreaEmpresaProduParameterReturnGeneral tipoareaempresaproduReturnGeneral,TipoAreaEmpresaProduBean tipoareaempresaproduBean,Boolean conDefault) throws Exception { 
		try {
			TipoAreaEmpresaProdu tipoareaempresaproduLocal=new TipoAreaEmpresaProdu();
			
			tipoareaempresaproduLocal=tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoareaempresaproduLocal.getId()!=null && !tipoareaempresaproduLocal.getId().equals(0L))) {tipoareaempresaproduBean.setId(tipoareaempresaproduLocal.getId());}}
			if(conDefault || (!conDefault && tipoareaempresaproduLocal.getnombre()!=null && !tipoareaempresaproduLocal.getnombre().equals(""))) {tipoareaempresaproduBean.setnombre(tipoareaempresaproduLocal.getnombre());}
			if(conDefault || (!conDefault && tipoareaempresaproduLocal.getdescripcion()!=null && !tipoareaempresaproduLocal.getdescripcion().equals(""))) {tipoareaempresaproduBean.setdescripcion(tipoareaempresaproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAreaEmpresaProduGenerico(Long idTipoAreaEmpresaProduSeleccionado,JComboBox jComboBoxTipoAreaEmpresaProdu,List<TipoAreaEmpresaProdu> tipoareaempresaprodusLocal)throws Exception {
		try {
			TipoAreaEmpresaProdu  tipoareaempresaproduTemp=null;

			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusLocal) {
				if(tipoareaempresaproduAux.getId()!=null && tipoareaempresaproduAux.getId().equals(idTipoAreaEmpresaProduSeleccionado)) {
					tipoareaempresaproduTemp=tipoareaempresaproduAux;
					break;
				}
			}

			jComboBoxTipoAreaEmpresaProdu.setSelectedItem(tipoareaempresaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAreaEmpresaProduGenerico(JComboBox jComboBoxTipoAreaEmpresaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAreaEmpresaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAreaEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAreaEmpresaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAreaEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduMaquina")) {
			jButtonProductoProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoareaempresaprodu=(TipoAreaEmpresaProdu) tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoareaempresaprodu =(TipoAreaEmpresaProdu) tipoareaempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoareaempresaprodu.getIsNew() && !tipoareaempresaprodu.getIsChanged() && !tipoareaempresaprodu.getIsDeleted()) {
				sDescripcion=tipoareaempresaprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoareaempresaprodu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAreaEmpresaProdu tipoareaempresaproduRow=new TipoAreaEmpresaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoareaempresaproduRow=(TipoAreaEmpresaProdu) tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoareaempresaproduRow=(TipoAreaEmpresaProdu) tipoareaempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu = (TipoAreaEmpresaProdu)this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoareaempresaprodu = (TipoAreaEmpresaProdu)this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoareaempresaprodu!=null) {
						this.tipoareaempresaprodu = tipoareaempresaprodu;
					} else {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.permiteMantenimiento(this.tipoareaempresaprodu)) {
					ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoAreaEmpresaProdu> tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
					tipoareaempresaprodus.add(this.tipoareaempresaprodu);
					if(!esRelacionado) {
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(tipoareaempresaprodus,this.tipoareaempresaprodu,productoordendetaprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");

						productoordendetaprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoAreaEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoAreaEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();

						titledBorderProductoOrdenDetaProduMaquina.setTitle(titledBorderTipoAreaEmpresaProdu.getTitle() + " -> Orden Maquina");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoordendetaprodumaquinaBeanSwingJInternalFrame);
						}

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoordendetaprodumaquinaBeanSwingJInternalFrame);

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden Maquina",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoAreaEmpresaProdu tipoareaempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu = (TipoAreaEmpresaProdu)this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoareaempresaprodu = (TipoAreaEmpresaProdu)this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoareaempresaprodu!=null) {
						this.tipoareaempresaprodu = tipoareaempresaprodu;
					} else {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}
				}

				if(this.isTienePermisosProductoProduMaquina && this.permiteMantenimiento(this.tipoareaempresaprodu)) {
					ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoAreaEmpresaProdu> tipoareaempresaprodus=new ArrayList<TipoAreaEmpresaProdu>();
					tipoareaempresaprodus.add(this.tipoareaempresaprodu);
					if(!esRelacionado) {
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.cargarProductoProduMaquinaBeanSwingJInternalFrame(tipoareaempresaprodus,this.tipoareaempresaprodu,productoprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getConGuardarRelaciones(),productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");

						productoprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoAreaEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoAreaEmpresaProdu.getBorder();
						TitledBorder titledBorderProductoProduMaquina=(TitledBorder)productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getBorder();

						titledBorderProductoProduMaquina.setTitle(titledBorderTipoAreaEmpresaProdu.getTitle() + " -> Producto Maquina Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumaquinaBeanSwingJInternalFrame);
						}

						productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumaquinaBeanSwingJInternalFrame);

						productoprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Maquina Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));			
			this.jButtonDuplicarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu && this.isPermisoDuplicarTipoAreaEmpresaProdu));			
			this.jButtonCopiarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu && this.isPermisoCopiarTipoAreaEmpresaProdu));
			this.jButtonVerFormTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu && this.isPermisoVerFormTipoAreaEmpresaProdu));
			
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));			
			
			this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu && this.isPermisoEliminarTipoAreaEmpresaProdu));
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu);							
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));						
			this.jButtonDuplicarToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu && this.isPermisoDuplicarTipoAreaEmpresaProdu));						
			this.jButtonCopiarToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu && this.isPermisoCopiarTipoAreaEmpresaProdu));			
			this.jButtonVerFormToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu && this.isPermisoVerFormTipoAreaEmpresaProdu));			
			this.jButtonAbrirOrderByToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));
			this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));			
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu  && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu && this.isPermisoEliminarTipoAreaEmpresaProdu));
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarToolBarTipoAreaEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu);				
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));			
			this.jMenuItemDuplicarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu && this.isPermisoDuplicarTipoAreaEmpresaProdu));			
			this.jMenuItemCopiarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu && this.isPermisoCopiarTipoAreaEmpresaProdu));			
			this.jMenuItemVerFormTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu && this.isPermisoVerFormTipoAreaEmpresaProdu));			
			this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));			
			//this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));
			this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu && this.isPermisoOrdenTipoAreaEmpresaProdu));			
			this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu));			
			this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu && this.isPermisoNuevoTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));									
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemModificarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemActualizarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu && this.isPermisoActualizarTipoAreaEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemEliminarTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu && this.isPermisoEliminarTipoAreaEmpresaProdu));
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemCancelarTipoAreaEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));						
			this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=this.jButtonNuevoTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu=this.jButtonDuplicarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu=this.jButtonCopiarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu=this.jButtonVerFormTipoAreaEmpresaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAreaEmpresaProdu=this.jButtonAbrirOrderByTipoAreaEmpresaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=this.jButtonModificarTipoAreaEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=this.jButtonNuevoToolBarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarToolBarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarToolBarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarToolBarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarToolBarTipoAreaEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=this.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=this.jMenuItemNuevoTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemModificarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemActualizarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemEliminarTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemCancelarTipoAreaEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAreaEmpresaProdu(Boolean esInicializar) {
		if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAreaEmpresaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAreaEmpresaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAreaEmpresaProdu() {
		this.jButtonNuevoTipoAreaEmpresaProdu.setVisible(this.isPermisoNuevoTipoAreaEmpresaProdu);			
		this.jButtonDuplicarTipoAreaEmpresaProdu.setVisible(this.isPermisoDuplicarTipoAreaEmpresaProdu);			
		this.jButtonCopiarTipoAreaEmpresaProdu.setVisible(this.isPermisoCopiarTipoAreaEmpresaProdu);			
		this.jButtonVerFormTipoAreaEmpresaProdu.setVisible(this.isPermisoVerFormTipoAreaEmpresaProdu);			
		
		this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setVisible(this.isPermisoOrdenTipoAreaEmpresaProdu);					
		
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.setVisible(this.isPermisoNuevoTipoAreaEmpresaProdu);			
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarTipoAreaEmpresaProdu.setVisible(this.isPermisoActualizarTipoAreaEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.setVisible(this.isPermisoActualizarTipoAreaEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.setVisible(this.isPermisoEliminarTipoAreaEmpresaProdu);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu);						
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.setVisible(this.isPermisoGuardarCambiosTipoAreaEmpresaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setVisible(this.isPermisoActualizarTipoAreaEmpresaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAreaEmpresaProdu() {
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarTipoAreaEmpresaProdu.setVisible(this.isPermisoActualizarTipoAreaEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.setVisible(this.isPermisoActualizarTipoAreaEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.setVisible(this.isPermisoEliminarTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu);							
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu && this.isPermisoGuardarCambiosTipoAreaEmpresaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAreaEmpresaProdu() {
		if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAreaEmpresaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAreaEmpresaProdu() {
	}
	
	public void jTableDatosTipoAreaEmpresaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAreaEmpresaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAreaEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.gettipoareaempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoareaempresaprodu==null) {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				}

				if(this.tipoareaempresaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoareaempresaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoAreaEmpresaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoAreaEmpresaProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAreaEmpresaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.gettipoareaempresaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoareaempresaproduLogic.getConnexion());

				if(this.tipoareaempresaprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoareaempresaprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAreaEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoAreaEmpresaProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoAreaEmpresaProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoAreaEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.gettipoareaempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoareaempresaprodu==null) {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				}

				if(this.tipoareaempresaprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoareaempresaprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAreaEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.gettipoareaempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoareaempresaprodu==null) {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				}

				if(this.tipoareaempresaprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoareaempresaprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoAreaEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.gettipoareaempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoareaempresaprodu==null) {
						this.tipoareaempresaprodu = new TipoAreaEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);
				}

				if(this.tipoareaempresaprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoareaempresaprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoAreaEmpresaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);

			this.getTipoAreaEmpresaProdusFK_IdEmpresa();

			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);

			//if(TipoAreaEmpresaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoareaempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAreaEmpresaProdu() {
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
		

		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.dispose();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.dispose();
			this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoAreaEmpresaProdu!=null) {
			this.jInternalFrameImportacionTipoAreaEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAreaEmpresaProdu.dispose();
			this.jInternalFrameImportacionTipoAreaEmpresaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAreaEmpresaProdu();
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAreaEmpresaProdu")) {
				jButtonDuplicarTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAreaEmpresaProdu")) {
				jButtonCopiarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAreaEmpresaProdu")) {
				jButtonVerFormTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAreaEmpresaProdu")) {
				jButtonDuplicarTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAreaEmpresaProdu")) {
				jButtonDuplicarTipoAreaEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAreaEmpresaProdu")) {
				jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAreaEmpresaProdu")) {
				jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAreaEmpresaProdu")) {
				jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAreaEmpresaProdu")) {
				jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAreaEmpresaProdu")) {
				jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAreaEmpresaProdu")) {
				jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAreaEmpresaProdu")) {
				jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAreaEmpresaProdu")) {
				jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAreaEmpresaProdu")) {
				jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAreaEmpresaProdu")) {
				jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAreaEmpresaProdu")) {
				jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAreaEmpresaProdu")) {
				jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAreaEmpresaProdu")) {
				jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAreaEmpresaProdu")) {
				jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAreaEmpresaProdu")) {
				jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAreaEmpresaProdu")) {
				jButtonMostrarOcultarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAreaEmpresaProdu")) {
				jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAreaEmpresaProdu")) {
				jButtonCopiarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAreaEmpresaProdu")) {
				jButtonVerFormTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAreaEmpresaProdu")) {
				jButtonCopiarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAreaEmpresaProdu")) {
				jButtonVerFormTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAreaEmpresaProdu")) {
				jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAreaEmpresaProdu")) {
				jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAreaEmpresaProdu")) {
				jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAreaEmpresaProdu")) {
				jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAreaEmpresaProdu")) {
				jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAreaEmpresaProdu")) {
				jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAreaEmpresaProdu")) {
				jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAreaEmpresaProdu")) {
				jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAreaEmpresaProdu")) {
				jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAreaEmpresaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu")) {
				jButtonAbrirOrderByTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAreaEmpresaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAreaEmpresaProdu")) {
				jButtonMostrarOcultarTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAreaEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAreaEmpresaProdu")) {
				jButtonCerrarReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAreaEmpresaProdu")) {
				jButtonGenerarReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAreaEmpresaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAreaEmpresaProdu")) {
				jButtonCerrarImportacionTipoAreaEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAreaEmpresaProdu")) {
				
				jButtonGenerarImportacionTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAreaEmpresaProdu")) {
				
				jButtonAbrirImportacionTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAreaEmpresaProdu")) {
				jComboBoxTiposAccionesTipoAreaEmpresaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAreaEmpresaProdu")) {
				jComboBoxTiposRelacionesTipoAreaEmpresaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAreaEmpresaProdu")) {
				jComboBoxTiposAccionesTipoAreaEmpresaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAreaEmpresaProdu")) {
				
				jComboBoxTiposSeleccionarTipoAreaEmpresaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAreaEmpresaProdu")) {
				jTextFieldValorCampoGeneralTipoAreaEmpresaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAreaEmpresaProdu")) {
				jButtonAbrirOrderByTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAreaEmpresaProdu")) {
				jButtonAbrirOrderByTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAreaEmpresaProdu")) {
				jButtonCerrarOrderByTipoAreaEmpresaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAreaEmpresaProduBusqueda")) {
				this.jButtonidTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAreaEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoAreaEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAreaEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAreaEmpresaProduBusqueda")) {
				this.jButtonnombreTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoAreaEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAreaEmpresaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAreaEmpresaProdu tipoareaempresaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoareaempresaproduLocal=this.tipoareaempresaprodu;
			} else {
				tipoareaempresaproduLocal=this.tipoareaempresaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
							
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
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
			
			


			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
								
						
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
								
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
							
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
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
			
			


			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
								
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAreaEmpresaProdu")) {
					jCheckBoxSeleccionarTodosTipoAreaEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAreaEmpresaProdu")) {
					jCheckBoxSeleccionadosTipoAreaEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAreaEmpresaProdu")) {
					
				}
				
				


				
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
												
				
				


				
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
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
			
			


			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoareaempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoareaempresaprodu);
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
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
				
				


				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaEmpresaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoareaempresaproduAnterior =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAreaEmpresaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAreaEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAreaEmpresaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoareaempresaprodu =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoareaempresaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAreaEmpresaProdu")) {
				
				}
				
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAreaEmpresaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAreaEmpresaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAreaEmpresaProdu")) {
			
			}
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAreaEmpresaProdu();
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAreaEmpresaProdu")) {
				jButtonDuplicarTipoAreaEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAreaEmpresaProdu")) {
				jButtonCopiarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAreaEmpresaProdu")) {
				jButtonVerFormTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAreaEmpresaProdu")) {
				jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAreaEmpresaProdu")) {
				jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAreaEmpresaProdu")) {
				jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAreaEmpresaProdu")) {
				jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAreaEmpresaProdu")) {
				jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAreaEmpresaProdu")) {
				jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAreaEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAreaEmpresaProdu")) {
				jButtonAbrirOrderByTipoAreaEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAreaEmpresaProdu")) {
				jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAreaEmpresaProdu")) {
				jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAreaEmpresaProdu")) {
				jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAreaEmpresaProduBusqueda")) {
				this.jButtonidTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAreaEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoAreaEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAreaEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAreaEmpresaProduBusqueda")) {
				this.jButtonnombreTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoAreaEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoAreaEmpresaProduBusquedaActionPerformed(evt);
			}
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAreaEmpresaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAreaEmpresaProdu")) {
				closingInternalFrameTipoAreaEmpresaProdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoAreaEmpresaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAreaEmpresaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAreaEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoAreaEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAreaEmpresaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAreaEmpresaProduActionPerformed(null);
			}
			
			TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoareaempresaprodu,new Object(),this.tipoareaempresaproduParameterGeneral,this.tipoareaempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAreaEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAreaEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAreaEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoareaempresaprodu)) {
			if(!esControlTabla) {
				if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);			
				}
				
				if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.procesarEventosTipoAreaEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this.tipoareaempresaprodu,this.tipoareaempresaproduParameterGeneral,this.isEsNuevoTipoAreaEmpresaProdu,classes);//this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral,this.tipoareaempresaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAreaEmpresaProdu(classes,this.tipoareaempresaproduReturnGeneral,this.tipoareaempresaproduBean,false);
					}
						
					if(this.tipoareaempresaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu());	
					}
						
					if(this.tipoareaempresaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu(),classes);//this.tipoareaempresaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAreaEmpresaProdu(this.tipoareaempresaprodu,classes);//this.tipoareaempresaproduBean);									
				}
			
				if(TipoAreaEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAreaEmpresaProdu(this.tipoareaempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaEmpresaProdu(this.tipoareaempresaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoareaempresaproduAnterior!=null) {
						this.tipoareaempresaprodu=this.tipoareaempresaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.procesarEventosTipoAreaEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this.tipoareaempresaprodu,this.tipoareaempresaproduParameterGeneral,this.isEsNuevoTipoAreaEmpresaProdu,classes);//this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu(),tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu(),this.tipoareaempresaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAreaEmpresaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAreaEmpresaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAreaEmpresaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAreaEmpresaProdu() throws Exception {
		
		TipoAreaEmpresaProduModel tipoareaempresaproduModel=(TipoAreaEmpresaProduModel)this.jTableDatosTipoAreaEmpresaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoareaempresaproduModel.tipoareaempresaprodus=this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoareaempresaproduModel.tipoareaempresaprodus=this.tipoareaempresaprodus;
		}
		
		
		((TipoAreaEmpresaProduModel) this.jTableDatosTipoAreaEmpresaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAreaEmpresaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoareaempresaproduAnterior(),this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoareaempresaproduAnterior(),this.tipoareaempresaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAreaEmpresaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipoareaempresaprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
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
										
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoareaempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoareaempresaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAreaEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoAreaEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAreaEmpresaProduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAreaEmpresaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAreaEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoareaempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoareaempresaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAreaEmpresaProdu(TipoAreaEmpresaProduBean tipoareaempresaproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipoareaempresaprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAreaEmpresaProdu(ArrayList<Classe> classes,TipoAreaEmpresaProduReturnGeneral tipoareaempresaproduReturnGeneral,TipoAreaEmpresaProduBean tipoareaempresaproduBean,Boolean conDefault) throws Exception {
		
			this.tipoareaempresaproduBean.setProductoOrdenDetaProduMaquinas(tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu().getProductoOrdenDetaProduMaquinas());
			this.tipoareaempresaproduBean.setProductoProduMaquinas(tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu().getProductoProduMaquinas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					tipoareaempresaprodu.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					tipoareaempresaprodu.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoareaempresaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu = new TipoAreaEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoareaempresaproduSessionBean.getConGuardarRelaciones(),this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.tipoareaempresaproduLogic=this.tipoareaempresaproduLogic;
		
		this.cargarCombosFrameForeignKeyTipoAreaEmpresaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAreaEmpresaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAreaEmpresaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAreaEmpresaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAreaEmpresaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAreaEmpresaProdu"));
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoAreaEmpresaProdu"));

		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAreaEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemModificarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAreaEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoAreaEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAreaEmpresaProdu"));
						
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemActualizarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAreaEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoAreaEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAreaEmpresaProdu"));
								
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemEliminarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAreaEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoAreaEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAreaEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemCancelarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAreaEmpresaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemDetalleCerrarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAreaEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAreaEmpresaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonidTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonnombreTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtondescripcionTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAreaEmpresaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAreaEmpresaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAreaEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAreaEmpresaProdu"));
		}
		
		this.jTableDatosTipoAreaEmpresaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAreaEmpresaProdu"));
		
		this.jTableDatosTipoAreaEmpresaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAreaEmpresaProdu"));
		
		this.jButtonNuevoTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoTipoAreaEmpresaProdu"));
		
		this.jButtonDuplicarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoAreaEmpresaProdu"));
		
		this.jButtonCopiarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"CopiarTipoAreaEmpresaProdu"));
		
		this.jButtonVerFormTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"VerFormTipoAreaEmpresaProdu"));
		
		
		this.jButtonNuevoToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAreaEmpresaProdu"));
			
		this.jButtonDuplicarToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemNuevoTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAreaEmpresaProdu"));
			
		this.jMenuItemDuplicarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAreaEmpresaProdu"));		
		
		
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAreaEmpresaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAreaEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoAreaEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonModificarToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAreaEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemModificarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAreaEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoAreaEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonActualizarToolBarTipoAreaEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAreaEmpresaProdu"));
				
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemActualizarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAreaEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoAreaEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonEliminarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAreaEmpresaProdu"));
						
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemEliminarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAreaEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoAreaEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonCancelarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAreaEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemCancelarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAreaEmpresaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAreaEmpresaProdu"));		
		
		
		this.jButtonCerrarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarTipoAreaEmpresaProdu"));
		
		
		this.jButtonCerrarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemCerrarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAreaEmpresaProdu"));
			
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jMenuItemDetalleCerrarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAreaEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAreaEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaEmpresaProdu"));
		}
		
		this.jButtonCopiarToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAreaEmpresaProdu"));
			
		this.jButtonVerFormToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAreaEmpresaProdu"));
		
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAreaEmpresaProdu"));
			
		this.jMenuItemCopiarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAreaEmpresaProdu"));		
		
		this.jMenuItemVerFormTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAreaEmpresaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAreaEmpresaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAreaEmpresaProdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAreaEmpresaProdu"));
					
		this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAreaEmpresaProdu"));
		
		this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAreaEmpresaProdu"));		
		
		
		
		this.jButtonAnterioresTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoAreaEmpresaProdu"));
		
		
		this.jButtonAnterioresToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAreaEmpresaProdu"));
		
		this.jMenuItemAnterioresTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAreaEmpresaProdu"));		
		
		
		this.jButtonSiguientesTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoAreaEmpresaProdu"));
		
		
		this.jButtonSiguientesToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemSiguientesTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAreaEmpresaProdu"));
			
		this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAreaEmpresaProdu"));
			
		this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAreaEmpresaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAreaEmpresaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAreaEmpresaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAreaEmpresaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAreaEmpresaProdu"));

		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAreaEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAreaEmpresaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAreaEmpresaProdu"));
			
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAreaEmpresaProdu"));
					
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAreaEmpresaProdu"));
			
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAreaEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonidTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonnombreTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtondescripcionTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAreaEmpresaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaEmpresaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaEmpresaProdu"));				
			//this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaEmpresaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaEmpresaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAreaEmpresaProdu"));
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAreaEmpresaProdu"));
				this.jInternalFrameImportacionTipoAreaEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAreaEmpresaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAreaEmpresaProdu"));
			
			this.jButtonAbrirOrderByToolBarTipoAreaEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAreaEmpresaProdu"));			
			
			if(this.jInternalFrameOrderByTipoAreaEmpresaProdu!=null) {
				this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAreaEmpresaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTabbedPaneRelacionesTipoAreaEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAreaEmpresaProdu"));
		
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
            		closingInternalFrameTipoAreaEmpresaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAreaEmpresaProdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoAreaEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoAreaEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAreaEmpresaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAreaEmpresaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAreaEmpresaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAreaEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAreaEmpresaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAreaEmpresaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAreaEmpresaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAreaEmpresaProdu";
		inputMap = this.jButtonModificarTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAreaEmpresaProdu";
		inputMap = this.jButtonActualizarTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAreaEmpresaProdu";
		inputMap = this.jButtonEliminarTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCancelarTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCerrarTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAreaEmpresaProdu";
		inputMap = this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonGuardarCambiosTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAreaEmpresaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAreaEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAreaEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAreaEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonidTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonid_empresaTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtonnombreTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jButtondescripcionTipoAreaEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAreaEmpresaProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAreaEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAreaEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAreaEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAreaEmpresaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
					tipoareaempresaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodus) {
					tipoareaempresaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAreaEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
						tipoareaempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodus) {
						tipoareaempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAreaEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAreaEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAreaEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAreaEmpresaProdu.getSelectedRows();
			
			TipoAreaEmpresaProdu tipoareaempresaproduLocal=new TipoAreaEmpresaProdu();
			
			//this.seleccionarTodosTipoAreaEmpresaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoareaempresaproduLocal =(TipoAreaEmpresaProdu) this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoareaempresaproduLocal =(TipoAreaEmpresaProdu) this.tipoareaempresaprodus.toArray()[this.jTableDatosTipoAreaEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoareaempresaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
						tipoareaempresaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodus) {
						tipoareaempresaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAreaEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAreaEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAreaEmpresaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAreaEmpresaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAreaEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
				
						if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoareaempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoareaempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodus) {
					
						if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoareaempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoareaempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAreaEmpresaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAreaEmpresaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAreaEmpresaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAreaEmpresaProdu(conSplash);
				
					this.generarReporteTipoAreaEmpresaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAreaEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAreaEmpresaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAreaEmpresaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAreaEmpresaProdu();
				
				this.exportarTipoAreaEmpresaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAreaEmpresaProdus();
				//this.importarTipoAreaEmpresaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAreaEmpresaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAreaEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Area Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAreaEmpresaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAreaEmpresaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAreaEmpresaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoAreaEmpresaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoAreaEmpresaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoAreaEmpresaProdu(conSplash);
					
						//this.actualizarParametrosGeneralTipoAreaEmpresaProdu();
						
						this.generarReporteProcesoAccionTipoAreaEmpresaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Area EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Area Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoAreaEmpresaProdu();
				
						this.actualizarParametrosGeneralTipoAreaEmpresaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoareaempresaproduReturnGeneral=tipoareaempresaproduLogic.procesarAccionTipoAreaEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus(),this.tipoareaempresaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoAreaEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAreaEmpresaProdu();
					
					TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoAreaEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAreaEmpresaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAreaEmpresaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAreaEmpresaProdu();
			
			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
			TipoAreaEmpresaProdu tipoareaempresaprodu=new TipoAreaEmpresaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.getSelectedItem();
			
			
			
			
			tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoareaempresaprodusSeleccionados.size()==1) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
					tipoareaempresaprodu=tipoareaempresaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Orden Maquina")) {
					jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,rowIndex,true,false,tipoareaempresaprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Maquina Produccion")) {
					jButtonProductoProduMaquinaActionPerformed(null,rowIndex,true,false,tipoareaempresaprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAreaEmpresaProdu();
			
      		//this.finishProcessTipoAreaEmpresaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAreaEmpresaProduReturnGeneral() throws Exception {
		if(this.tipoareaempresaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoareaempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoareaempresaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoareaempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoareaempresaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoareaempresaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
		}
		
		if(this.tipoareaempresaproduReturnGeneral.getConRetornoLista() || this.tipoareaempresaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoareaempresaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoareaempresaproduLogic.setTipoAreaEmpresaProdus(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoareaempresaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoareaempresaproduLogic.setTipoAreaEmpresaProdu(this.tipoareaempresaproduReturnGeneral.getTipoAreaEmpresaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAreaEmpresaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAreaEmpresaProdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoAreaEmpresaProdu> getTipoAreaEmpresaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAreaEmpresaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaproduLogic.getTipoAreaEmpresaProdus()) {
					if(tipoareaempresaproduAux.getIsSelected()) {
						tipoareaempresaprodusSeleccionados.add(tipoareaempresaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaEmpresaProdu tipoareaempresaproduAux:this.tipoareaempresaprodus) {
					if(tipoareaempresaproduAux.getIsSelected()) {
						tipoareaempresaprodusSeleccionados.add(tipoareaempresaproduAux);				
					}
				}
			}
			
			if(tipoareaempresaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoareaempresaprodusSeleccionados.addAll(this.tipoareaempresaproduLogic.getTipoAreaEmpresaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoareaempresaprodusSeleccionados.addAll(this.tipoareaempresaprodus);				
					}
				}
			}
		} else {
			tipoareaempresaprodusSeleccionados.add(this.tipoareaempresaprodu);
		}
		
		return tipoareaempresaprodusSeleccionados;
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
	
	public void generarReporteTipoAreaEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAreaEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAreaEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAreaEmpresaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAreaEmpresaProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoAreaEmpresaProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Area Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAreaEmpresaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAreaEmpresaProdu();
		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAreaEmpresaProdu();
		
		
		//this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados ,tipoareaempresaproduImplementable,tipoareaempresaproduImplementableHome);
	}
	
	public void mostrarImportacionTipoAreaEmpresaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAreaEmpresaProdu();
		
		this.abrirFrameImportacionTipoAreaEmpresaProdu();		
		
			
		//this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados ,tipoareaempresaproduImplementable,tipoareaempresaproduImplementableHome);
	}
	
	public void importarTipoAreaEmpresaProdus() throws Exception {		
	
	}
	
	public void exportarTipoAreaEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAreaEmpresaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAreaEmpresaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAreaEmpresaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Area Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAreaEmpresaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAreaEmpresaProdu(tipoareaempresaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoareaempresaproduAux.setsDetalleGeneralEntityReporte(tipoareaempresaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAreaEmpresaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAreaEmpresaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaEmpresaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoareaempresaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoareaempresaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoareaempresaprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoareaempresaprodu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoareaempresaprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAreaEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAreaEmpresaProdu(row);				
				iRow++;
			}				
			
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAreaEmpresaProdu(tipoareaempresaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAreaEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();		
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoareaempresaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoareaempresaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoareaempresaprodu");
			//elementRoot.appendChild(element);
		
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
				element = document.createElement("tipoareaempresaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAreaEmpresaProdu(tipoareaempresaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAreaEmpresaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoareaempresaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoareaempresaprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoareaempresaprodu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoareaempresaprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoAreaEmpresaProdu(TipoAreaEmpresaProdu tipoareaempresaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAreaEmpresaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoareaempresaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAreaEmpresaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoareaempresaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoAreaEmpresaProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoareaempresaprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoAreaEmpresaProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoareaempresaprodu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoAreaEmpresaProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoareaempresaprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoAreaEmpresaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados=new ArrayList<TipoAreaEmpresaProdu>();
		
		tipoareaempresaprodusSeleccionados=this.getTipoAreaEmpresaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAreaEmpresaProdu(tipoareaempresaprodusSeleccionados);
		
		this.generarReporteTipoAreaEmpresaProdus("Todos",tipoareaempresaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAreaEmpresaProdu(ArrayList<TipoAreaEmpresaProdu> tipoareaempresaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusSeleccionados) {
				tipoareaempresaproduAux.setsDetalleGeneralEntityReporte(tipoareaempresaproduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoareaempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoareaempresaproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoareaempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoareaempresaproduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoareaempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoareaempresaproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAreaEmpresaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoAreaEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaEmpresaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=true;
		} else {
			this.actualizarEstadoPanelsTipoAreaEmpresaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAreaEmpresaProdu=false;
			//this.isVisibilidadCeldaVerFormTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoAreaEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;												
			}
			
			this.jButtonCerrarTipoAreaEmpresaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaEmpresaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoareaempresaprodu)) {
			this.isVisibilidadCeldaActualizarTipoAreaEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoAreaEmpresaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAreaEmpresaProdu() {
		this.isVisibilidadCeldaNuevoTipoAreaEmpresaProdu=false;
		this.isVisibilidadCeldaGuardarCambiosTipoAreaEmpresaProdu=false;
	}
	
	public void actualizarEstadoPanelsTipoAreaEmpresaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaEmpresaProdu!=null) {
				this.jPanelPaginacionTipoAreaEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
					this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAreaEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoAreaEmpresaProduParaProductoOrdenDetaProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoOrdenDetaProduMaquina=false;

		try {

			if(this.tipoareaempresaproduSessionBean==null) {
				this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setsPathNavegacionActual(tipoareaempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(true);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(TipoAreaEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoordendetaprodumaquinaSessionBean.setlidTipoAreaEmpresaProduActual(this.idTipoAreaEmpresaProduActual);

			tipoareaempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoAreaEmpresaProdu(true);
			tipoareaempresaproduSessionBean.setlIdTipoAreaEmpresaProduActualForeignKey(this.idTipoAreaEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoAreaEmpresaProduParaProductoProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoProduMaquina=false;

		try {

			if(this.tipoareaempresaproduSessionBean==null) {
				this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setsPathNavegacionActual(tipoareaempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMaquina=this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMaquina(true);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMaquina(TipoAreaEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.productoprodumaquinaSessionBean.setlidTipoAreaEmpresaProduActual(this.idTipoAreaEmpresaProduActual);

			tipoareaempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoAreaEmpresaProdu(true);
			tipoareaempresaproduSessionBean.setlIdTipoAreaEmpresaProduActualForeignKey(this.idTipoAreaEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		
		if(this.tipoareaempresaproduSessionBean==null) {
			this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		}
		
		this.tipoareaempresaproduSessionBean.setsUltimaBusquedaTipoAreaEmpresaProdu(this.getsAccionBusqueda());
		this.tipoareaempresaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoareaempresaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoareaempresaproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		
		if(this.tipoareaempresaproduSessionBean==null) {
			this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		}
		
		if(this.tipoareaempresaproduSessionBean.getsUltimaBusquedaTipoAreaEmpresaProdu()!=null&&!this.tipoareaempresaproduSessionBean.getsUltimaBusquedaTipoAreaEmpresaProdu().equals("")) {
			this.setsAccionBusqueda(tipoareaempresaproduSessionBean.getsUltimaBusquedaTipoAreaEmpresaProdu());
			this.setiNumeroPaginacion(tipoareaempresaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoareaempresaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoareaempresaproduSessionBean.getid_empresa());
				tipoareaempresaproduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoareaempresaproduSessionBean.setsUltimaBusquedaTipoAreaEmpresaProdu("");
		this.tipoareaempresaproduSessionBean.setiNumeroPaginacion(TipoAreaEmpresaProduConstantesFunciones.INUMEROPAGINACION);
		this.tipoareaempresaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAreaEmpresaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAreaEmpresaProdu() {
		this.updateBorderResaltarBusquedasFormularioTipoAreaEmpresaProdu();
		this.updateVisibilidadBusquedasFormularioTipoAreaEmpresaProdu();
		this.updateHabilitarBusquedasFormularioTipoAreaEmpresaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAreaEmpresaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAreaEmpresaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAreaEmpresaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAreaEmpresaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoAreaEmpresaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAreaEmpresaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAreaEmpresaProdu();
		this.updateVisibilidadResaltarControlesFormularioTipoAreaEmpresaProdu();
		this.updateHabilitarResaltarControlesFormularioTipoAreaEmpresaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAreaEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoareaempresaproduConstantesFunciones.resaltaridTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setBorder(this.tipoareaempresaproduConstantesFunciones.resaltaridTipoAreaEmpresaProdu);}
		if(this.tipoareaempresaproduConstantesFunciones.resaltarid_empresaTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setBorder(this.tipoareaempresaproduConstantesFunciones.resaltarid_empresaTipoAreaEmpresaProdu);}
		if(this.tipoareaempresaproduConstantesFunciones.resaltarnombreTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setBorder(this.tipoareaempresaproduConstantesFunciones.resaltarnombreTipoAreaEmpresaProdu);}
		if(this.tipoareaempresaproduConstantesFunciones.resaltardescripcionTipoAreaEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setBorder(this.tipoareaempresaproduConstantesFunciones.resaltardescripcionTipoAreaEmpresaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAreaEmpresaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostraridTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelidTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostraridTipoAreaEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrarid_empresaTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelid_empresaTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrarid_empresaTipoAreaEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrarnombreTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPanelnombreTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrarnombreTipoAreaEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrardescripcionTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jPaneldescripcionTipoAreaEmpresaProdu.setVisible(this.tipoareaempresaproduConstantesFunciones.mostrardescripcionTipoAreaEmpresaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAreaEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaEmpresaProdu!=null) {
	
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jLabelidTipoAreaEmpresaProdu.setEnabled(this.tipoareaempresaproduConstantesFunciones.activaridTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jComboBoxid_empresaTipoAreaEmpresaProdu.setEnabled(this.tipoareaempresaproduConstantesFunciones.activarid_empresaTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreanombreTipoAreaEmpresaProdu.setEnabled(this.tipoareaempresaproduConstantesFunciones.activarnombreTipoAreaEmpresaProdu);
		this.jInternalFrameDetalleFormTipoAreaEmpresaProdu.jTextAreadescripcionTipoAreaEmpresaProdu.setEnabled(this.tipoareaempresaproduConstantesFunciones.activardescripcionTipoAreaEmpresaProdu);
		}
	}
	
		
}