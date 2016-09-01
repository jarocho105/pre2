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

import com.bydan.erp.produccion.util.TipoProcesoProduConstantesFunciones;
import com.bydan.erp.produccion.util.TipoProcesoProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoProcesoProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoProcesoProduBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProcesoProduBeanSwingJInternalFrame extends TipoProcesoProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProcesoProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProcesoProdu> tipoprocesoproduValidator = new ClassValidator<TipoProcesoProdu>(TipoProcesoProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProcesoProdu tipoprocesoprodu;	
	public TipoProcesoProdu tipoprocesoproduAux;
	public TipoProcesoProdu tipoprocesoproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProcesoProdu tipoprocesoproduTotales;
	public Long idTipoProcesoProduActual;
	public Long iIdNuevoTipoProcesoProdu=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPedidoDetaProdu=false;

	public Boolean getIsTienePermisosPedidoDetaProdu() {
		return isTienePermisosPedidoDetaProdu;
	}

	public void setIsTienePermisosPedidoDetaProdu(Boolean isTienePermisosPedidoDetaProdu) {
		this.isTienePermisosPedidoDetaProdu= isTienePermisosPedidoDetaProdu;
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
	
	public Boolean isPermisoTodoTipoProcesoProdu;
	public Boolean isPermisoNuevoTipoProcesoProdu;
	public Boolean isPermisoActualizarTipoProcesoProdu;
	public Boolean isPermisoActualizarOriginalTipoProcesoProdu;
	public Boolean isPermisoEliminarTipoProcesoProdu;
	public Boolean isPermisoGuardarCambiosTipoProcesoProdu;
	public Boolean isPermisoConsultaTipoProcesoProdu;
	public Boolean isPermisoBusquedaTipoProcesoProdu;
	public Boolean isPermisoReporteTipoProcesoProdu;
	public Boolean isPermisoPaginacionMedioTipoProcesoProdu;
	public Boolean isPermisoPaginacionAltoTipoProcesoProdu;
	public Boolean isPermisoPaginacionTodoTipoProcesoProdu;
	public Boolean isPermisoCopiarTipoProcesoProdu;
	public Boolean isPermisoVerFormTipoProcesoProdu;
	public Boolean isPermisoDuplicarTipoProcesoProdu;
	public Boolean isPermisoOrdenTipoProcesoProdu;
	
	
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
	
	public TipoProcesoProduParameterReturnGeneral tipoprocesoproduReturnGeneral;
	public TipoProcesoProduParameterReturnGeneral tipoprocesoproduParameterGeneral;
	
	

	public PedidoDetaProduLogic pedidodetaproduLogic=null;

	public PedidoDetaProduLogic getPedidoDetaProduLogic() {
		return pedidodetaproduLogic;
	}

	public void setPedidoDetaProduLogic(PedidoDetaProduLogic pedidodetaproduLogic) {
		this.pedidodetaproduLogic = pedidodetaproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProcesoProdu=false;
	public Boolean esParaAccionDesdeFormularioTipoProcesoProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProcesoProduLogic tipoprocesoproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProcesoProdu tipoprocesoproduBean;
	public TipoProcesoProduConstantesFunciones tipoprocesoproduConstantesFunciones;
	//public TipoProcesoProduParameterReturnGeneral tipoprocesoproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoProcesoProdu> tipoprocesoprodus;	
	//public List<TipoProcesoProdu> tipoprocesoprodusEliminados;
	//public List<TipoProcesoProdu> tipoprocesoprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProcesoProdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoProcesoProdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoProcesoProdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoProcesoProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaModificarTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoProcesoProdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoProcesoProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoProcesoProdu() {
		return this.iIdNuevoTipoProcesoProdu;
	}

	public void setiIdNuevoTipoProcesoProdu(Long iIdNuevoTipoProcesoProdu) {
		this.iIdNuevoTipoProcesoProdu = iIdNuevoTipoProcesoProdu;
	}
	
	public Long getidTipoProcesoProduActual() {
		return this.idTipoProcesoProduActual;
	}

	public void setidTipoProcesoProduActual(Long idTipoProcesoProduActual) {
		this.idTipoProcesoProduActual = idTipoProcesoProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProcesoProdu gettipoprocesoprodu() {
		return this.tipoprocesoprodu;
	}

	public void settipoprocesoprodu(TipoProcesoProdu tipoprocesoprodu) {
		this.tipoprocesoprodu = tipoprocesoprodu;
	}
	
	public TipoProcesoProdu gettipoprocesoproduAux() {
		return this.tipoprocesoproduAux;
	}

	public void settipoprocesoproduAux(TipoProcesoProdu tipoprocesoproduAux) {
		this.tipoprocesoproduAux = tipoprocesoproduAux;
	}				
	
	public TipoProcesoProdu gettipoprocesoproduAnterior() {
		return this.tipoprocesoproduAnterior;
	}

	public void settipoprocesoproduAnterior(TipoProcesoProdu tipoprocesoproduAnterior) {
		this.tipoprocesoproduAnterior = tipoprocesoproduAnterior;
	}	
	
	public TipoProcesoProdu gettipoprocesoproduTotales() {
		return this.tipoprocesoproduTotales;
	}

	public void settipoprocesoproduTotales(TipoProcesoProdu tipoprocesoproduTotales) {
		this.tipoprocesoproduTotales = tipoprocesoproduTotales;
	}	
	
	public TipoProcesoProdu gettipoprocesoproduBean() {
		return this.tipoprocesoproduBean;
	}

	public void settipoprocesoproduBean(TipoProcesoProdu tipoprocesoproduBean) {
		this.tipoprocesoproduBean = tipoprocesoproduBean;
	}	
	
	public TipoProcesoProduParameterReturnGeneral gettipoprocesoproduReturnGeneral() {
		return this.tipoprocesoproduReturnGeneral;
	}

	public void settipoprocesoproduReturnGeneral(TipoProcesoProduParameterReturnGeneral tipoprocesoproduReturnGeneral) {
		this.tipoprocesoproduReturnGeneral = tipoprocesoproduReturnGeneral;
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
	
	
	public TipoProcesoProduLogic getTipoProcesoProduLogic()	{		
		return tipoprocesoproduLogic;
	}

	public void setTipoProcesoProduLogic(TipoProcesoProduLogic tipoprocesoproduLogic) {
		this.tipoprocesoproduLogic = tipoprocesoproduLogic;
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
	
	public Boolean getIsEsNuevoTipoProcesoProdu() {
		return isEsNuevoTipoProcesoProdu;
	}

	public void setIsEsNuevoTipoProcesoProdu(Boolean isEsNuevoTipoProcesoProdu) {
		this.isEsNuevoTipoProcesoProdu = isEsNuevoTipoProcesoProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProcesoProdu() {
		return esParaAccionDesdeFormularioTipoProcesoProdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProcesoProdu(Boolean esParaAccionDesdeFormularioTipoProcesoProdu) {
		this.esParaAccionDesdeFormularioTipoProcesoProdu = esParaAccionDesdeFormularioTipoProcesoProdu;
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

			if(this.tipoprocesoproduSessionBean==null) {
				this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
			}

			if(!this.tipoprocesoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoprocesoproduSessionBean.getlidEmpresaActual());
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

					if(this.tipoprocesoprodu!=null) {
						this.tipoprocesoprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
						this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoProcesoProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
						if(this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoProcesoProduGenerico)throws Exception
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
				jComboBoxid_empresaTipoProcesoProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoProcesoProduGenerico!=null && jComboBoxid_empresaTipoProcesoProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoProcesoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoProcesoProdu tipoprocesoprodu,JComboBox jComboBoxid_empresaTipoProcesoProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoProcesoProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoProcesoProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoprocesoprodu.setid_empresa(empresaAux.getId());
				tipoprocesoprodu.setempresa_descripcion(TipoProcesoProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoprocesoprodu.setEmpresa(empresaAux);			}
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

					if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { 
							this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { 
					}

					if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
							this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
							this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoProcesoProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProcesoProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoProdu(this.tipoprocesoproduLogic.getTipoProcesoProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProcesoProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoProcesoProdu(this.tipoprocesoprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprocesoproduLogic.setTipoProcesoProdus(this.tipoprocesoprodus);
			tipoprocesoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProcesoProduParameterReturnGeneral getTipoProcesoProduParameterGeneral() {
		return this.tipoprocesoproduParameterGeneral;
	}
	
	public void setTipoProcesoProduParameterGeneral(TipoProcesoProduParameterReturnGeneral tipoprocesoproduParameterGeneral) {
		this.tipoprocesoproduParameterGeneral = tipoprocesoproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProcesoProdu() {
		return isPermisoTodoTipoProcesoProdu;
	}

	public void setIsPermisoTodoTipoProcesoProdu(Boolean isPermisoTodoTipoProcesoProdu) {
		this.isPermisoTodoTipoProcesoProdu = isPermisoTodoTipoProcesoProdu;
	}

	public Boolean getIsPermisoNuevoTipoProcesoProdu() {
		return isPermisoNuevoTipoProcesoProdu;
	}

	public void setIsPermisoNuevoTipoProcesoProdu(Boolean isPermisoNuevoTipoProcesoProdu) {
		this.isPermisoNuevoTipoProcesoProdu = isPermisoNuevoTipoProcesoProdu;
	}

	public Boolean getIsPermisoActualizarTipoProcesoProdu() {
		return isPermisoActualizarTipoProcesoProdu;
	}

	public void setIsPermisoActualizarTipoProcesoProdu(Boolean isPermisoActualizarTipoProcesoProdu) {
		this.isPermisoActualizarTipoProcesoProdu = isPermisoActualizarTipoProcesoProdu;
	}

	public Boolean getIsPermisoEliminarTipoProcesoProdu() {
		return isPermisoEliminarTipoProcesoProdu;
	}

	public void setIsPermisoEliminarTipoProcesoProdu(Boolean isPermisoEliminarTipoProcesoProdu) {
		this.isPermisoEliminarTipoProcesoProdu = isPermisoEliminarTipoProcesoProdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProcesoProdu() {
		return isPermisoGuardarCambiosTipoProcesoProdu;
	}

	public void setIsPermisoGuardarCambiosTipoProcesoProdu(Boolean isPermisoGuardarCambiosTipoProcesoProdu) {
		this.isPermisoGuardarCambiosTipoProcesoProdu = isPermisoGuardarCambiosTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoConsultaTipoProcesoProdu() {
		return isPermisoConsultaTipoProcesoProdu;
	}

	public void setIsPermisoConsultaTipoProcesoProdu(Boolean isPermisoConsultaTipoProcesoProdu) {
		this.isPermisoConsultaTipoProcesoProdu = isPermisoConsultaTipoProcesoProdu;
	}

	public Boolean getIsPermisoBusquedaTipoProcesoProdu() {
		return isPermisoBusquedaTipoProcesoProdu;
	}

	public void setIsPermisoBusquedaTipoProcesoProdu(Boolean isPermisoBusquedaTipoProcesoProdu) {
		this.isPermisoBusquedaTipoProcesoProdu = isPermisoBusquedaTipoProcesoProdu;
	}

	public Boolean getIsPermisoReporteTipoProcesoProdu() {
		return isPermisoReporteTipoProcesoProdu;
	}

	public void setIsPermisoReporteTipoProcesoProdu(Boolean isPermisoReporteTipoProcesoProdu) {
		this.isPermisoReporteTipoProcesoProdu = isPermisoReporteTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProcesoProdu() {
		return isPermisoPaginacionMedioTipoProcesoProdu;
	}

	public void setIsPermisoPaginacionMedioTipoProcesoProdu(Boolean isPermisoPaginacionMedioTipoProcesoProdu) {
		this.isPermisoPaginacionMedioTipoProcesoProdu = isPermisoPaginacionMedioTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProcesoProdu() {
		return isPermisoPaginacionTodoTipoProcesoProdu;
	}

	public void setIsPermisoPaginacionTodoTipoProcesoProdu(Boolean isPermisoPaginacionTodoTipoProcesoProdu) {
		this.isPermisoPaginacionTodoTipoProcesoProdu = isPermisoPaginacionTodoTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProcesoProdu() {
		return isPermisoPaginacionAltoTipoProcesoProdu;
	}

	public void setIsPermisoPaginacionAltoTipoProcesoProdu(Boolean isPermisoPaginacionAltoTipoProcesoProdu) {
		this.isPermisoPaginacionAltoTipoProcesoProdu = isPermisoPaginacionAltoTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoCopiarTipoProcesoProdu() {
		return isPermisoCopiarTipoProcesoProdu;
	}

	public void setIsPermisoCopiarTipoProcesoProdu(Boolean isPermisoCopiarTipoProcesoProdu) {
		this.isPermisoCopiarTipoProcesoProdu = isPermisoCopiarTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoVerFormTipoProcesoProdu() {
		return isPermisoVerFormTipoProcesoProdu;
	}

	public void setIsPermisoVerFormTipoProcesoProdu(Boolean isPermisoVerFormTipoProcesoProdu) {
		this.isPermisoVerFormTipoProcesoProdu = isPermisoVerFormTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoProcesoProdu() {
		return isPermisoDuplicarTipoProcesoProdu;
	}

	public void setIsPermisoDuplicarTipoProcesoProdu(Boolean isPermisoDuplicarTipoProcesoProdu) {
		this.isPermisoDuplicarTipoProcesoProdu = isPermisoDuplicarTipoProcesoProdu;
	}
	
	public Boolean getIsPermisoOrdenTipoProcesoProdu() {
		return isPermisoOrdenTipoProcesoProdu;
	}

	public void setIsPermisoOrdenTipoProcesoProdu(Boolean isPermisoOrdenTipoProcesoProdu) {
		this.isPermisoOrdenTipoProcesoProdu = isPermisoOrdenTipoProcesoProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProcesoProdu() {
		return isVisibilidadCeldaNuevoTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoProcesoProdu(Boolean isVisibilidadCeldaNuevoTipoProcesoProdu) {
		this.isVisibilidadCeldaNuevoTipoProcesoProdu = isVisibilidadCeldaNuevoTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProcesoProdu() {
		return isVisibilidadCeldaDuplicarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProcesoProdu(Boolean isVisibilidadCeldaDuplicarTipoProcesoProdu) {
		this.isVisibilidadCeldaDuplicarTipoProcesoProdu = isVisibilidadCeldaDuplicarTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProcesoProdu() {
		return isVisibilidadCeldaCopiarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoProcesoProdu(Boolean isVisibilidadCeldaCopiarTipoProcesoProdu) {
		this.isVisibilidadCeldaCopiarTipoProcesoProdu = isVisibilidadCeldaCopiarTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProcesoProdu() {
		return isVisibilidadCeldaVerFormTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoProcesoProdu(Boolean isVisibilidadCeldaVerFormTipoProcesoProdu) {
		this.isVisibilidadCeldaVerFormTipoProcesoProdu = isVisibilidadCeldaVerFormTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProcesoProdu() {
		return isVisibilidadCeldaOrdenTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoProcesoProdu(Boolean isVisibilidadCeldaOrdenTipoProcesoProdu) {
		this.isVisibilidadCeldaOrdenTipoProcesoProdu = isVisibilidadCeldaOrdenTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProcesoProdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProcesoProdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu = isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProcesoProdu() {
		return isVisibilidadCeldaModificarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaModificarTipoProcesoProdu(Boolean isVisibilidadCeldaModificarTipoProcesoProdu) {
		this.isVisibilidadCeldaModificarTipoProcesoProdu = isVisibilidadCeldaModificarTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProcesoProdu() {
		return isVisibilidadCeldaActualizarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoProcesoProdu(Boolean isVisibilidadCeldaActualizarTipoProcesoProdu) {
		this.isVisibilidadCeldaActualizarTipoProcesoProdu = isVisibilidadCeldaActualizarTipoProcesoProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProcesoProdu() {
		return isVisibilidadCeldaEliminarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoProcesoProdu(Boolean isVisibilidadCeldaEliminarTipoProcesoProdu) {
		this.isVisibilidadCeldaEliminarTipoProcesoProdu = isVisibilidadCeldaEliminarTipoProcesoProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProcesoProdu() {
		return isVisibilidadCeldaCancelarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoProcesoProdu(Boolean isVisibilidadCeldaCancelarTipoProcesoProdu) {
		this.isVisibilidadCeldaCancelarTipoProcesoProdu = isVisibilidadCeldaCancelarTipoProcesoProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProcesoProdu() {
		return isVisibilidadCeldaGuardarTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoProcesoProdu(Boolean isVisibilidadCeldaGuardarTipoProcesoProdu) {
		this.isVisibilidadCeldaGuardarTipoProcesoProdu = isVisibilidadCeldaGuardarTipoProcesoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProcesoProdu() {
		return isVisibilidadCeldaGuardarCambiosTipoProcesoProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProcesoProdu(Boolean isVisibilidadCeldaGuardarCambiosTipoProcesoProdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu = isVisibilidadCeldaGuardarCambiosTipoProcesoProdu;
	}
		
	public TipoProcesoProduSessionBean gettipoprocesoproduSessionBean() {
		return this.tipoprocesoproduSessionBean;
	}
	
	public void settipoprocesoproduSessionBean(TipoProcesoProduSessionBean tipoprocesoproduSessionBean) {
		this.tipoprocesoproduSessionBean=tipoprocesoproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoprocesoprodu,null);
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
	
	public void bugActualizarReferenciaActual(TipoProcesoProdu tipoprocesoprodu,TipoProcesoProdu tipoprocesoproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProcesoProdu(tipoprocesoprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprocesoproduAux.setId(tipoprocesoprodu.getId());
		tipoprocesoproduAux.setVersionRow(tipoprocesoprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProcesoProdu();
		
			int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprocesoproduValidator.getInvalidValues(this.tipoprocesoprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprocesoproduLogic.setDatosCliente(datosCliente);
			tipoprocesoproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprocesoproduAux=new  TipoProcesoProdu();
				
				tipoprocesoproduAux.setIsNew(true);
				tipoprocesoproduAux.setIsChanged(true);
				
				tipoprocesoproduAux.setTipoProcesoProduOriginal(this.tipoprocesoprodu);
				
				tipoprocesoproduAux.setId(this.tipoprocesoprodu.getId());	
				tipoprocesoproduAux.setVersionRow(this.tipoprocesoprodu.getVersionRow());	
				tipoprocesoproduAux.setid_empresa(this.tipoprocesoprodu.getid_empresa());	
				tipoprocesoproduAux.setnombre(this.tipoprocesoprodu.getnombre());	
				tipoprocesoproduAux.setdescripcion(this.tipoprocesoprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprocesoproduAux,tipoprocesoproduLogic.getTipoProcesoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoproduAux,tipoprocesoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduLogic.saveTipoProcesoProdus();//WithConnection
						//tipoprocesoproduLogic.getSetVersionRowTipoProcesoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesoprodu,tipoprocesoproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoProcesoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprocesoproduAux=new  TipoProcesoProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() && this.tipoprocesoprodu.getId()>=0)) {
						
					tipoprocesoproduAux.setIsNew(false);
				}
				
				tipoprocesoproduAux.setIsDeleted(false);
			
				tipoprocesoproduAux.setId(this.tipoprocesoprodu.getId());	
				tipoprocesoproduAux.setVersionRow(this.tipoprocesoprodu.getVersionRow());	
				tipoprocesoproduAux.setid_empresa(this.tipoprocesoprodu.getid_empresa());	
				tipoprocesoproduAux.setnombre(this.tipoprocesoprodu.getnombre());	
				tipoprocesoproduAux.setdescripcion(this.tipoprocesoprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesoproduAux,tipoprocesoproduLogic.getTipoProcesoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoproduAux,tipoprocesoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduLogic.saveTipoProcesoProdus();//WithConnection
						//tipoprocesoproduLogic.getSetVersionRowTipoProcesoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprocesoprodu,tipoprocesoproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoProcesoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprocesoproduAux=new  TipoProcesoProdu();
				
				tipoprocesoproduAux.setIsNew(false);
				tipoprocesoproduAux.setIsChanged(false);
				
				tipoprocesoproduAux.setIsDeleted(true);
				
				tipoprocesoproduAux.setId(this.tipoprocesoprodu.getId());	
				tipoprocesoproduAux.setVersionRow(this.tipoprocesoprodu.getVersionRow());	
				tipoprocesoproduAux.setid_empresa(this.tipoprocesoprodu.getid_empresa());	
				tipoprocesoproduAux.setnombre(this.tipoprocesoprodu.getnombre());	
				tipoprocesoproduAux.setdescripcion(this.tipoprocesoprodu.getdescripcion());	
				
				if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprocesoproduAux.getId()>=0) {	
						this.tipoprocesoprodusEliminados.add(tipoprocesoproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprocesoproduAux,tipoprocesoproduLogic.getTipoProcesoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoproduAux,tipoprocesoprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduLogic.saveTipoProcesoProdus();//WithConnection
						//tipoprocesoproduLogic.getSetVersionRowTipoProcesoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprocesoproduAux.setPedidoDetaProdus(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprocesoproduAux,tipoprocesoproduLogic.getTipoProcesoProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprocesoproduAux,tipoprocesoprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getTipoProcesoProdus().addAll(this.tipoprocesoprodusEliminados);
					
					tipoprocesoproduLogic.saveTipoProcesoProdus();//WithConnection
					//tipoprocesoproduLogic.getSetVersionRowTipoProcesoProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoProcesoProdu();
				
				this.tipoprocesoprodusEliminados= new ArrayList<TipoProcesoProdu>();		
			}
			
			if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Proceso Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprocesoprodu=tipoprocesoproduAux;
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
      		//this.finishProcessTipoProcesoProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProcesoProdu tipoprocesoproduLocal) throws Exception {
		
		if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprocesoproduLocal.setPedidoDetaProdus(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
			
			} else {
			
				tipoprocesoproduLocal.setPedidoDetaProdus(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProcesoProdu tipoprocesoproduLocal) throws Exception {	
		if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoprocesoproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoProcesoProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprocesoproduValidator.getInvalidValues(this.tipoprocesoprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProcesoProdu tipoprocesoprodu,List<TipoProcesoProdu> tipoprocesoprodus) throws Exception {
		try	{		
			TipoProcesoProduConstantesFunciones.actualizarLista(tipoprocesoprodu,tipoprocesoprodus,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProcesoProdu tipoprocesoprodu,List<TipoProcesoProdu> tipoprocesoprodus) throws Exception {
		try	{			
			TipoProcesoProduConstantesFunciones.actualizarSelectedLista(tipoprocesoprodu,tipoprocesoprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProcesoProdu> tipoprocesoprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprocesoprodusLocal=this.tipoprocesoproduLogic.getTipoProcesoProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprocesoprodusLocal=this.tipoprocesoprodus;
			}
			//ARCHITECTURE
		
			for(TipoProcesoProdu tipoprocesoproduLocal:tipoprocesoprodusLocal) {
				if(this.permiteMantenimiento(tipoprocesoproduLocal) && tipoprocesoproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProcesoProduConstantesFunciones.getTipoProcesoProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProcesoProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelid_empresaTipoProcesoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProcesoProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelnombreTipoProcesoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProcesoProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabeldescripcionTipoProcesoProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelid_empresaTipoProcesoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelnombreTipoProcesoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabeldescripcionTipoProcesoProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoDetaProdu")) {
			if(this.tipoprocesoprodu==null) {
				this.tipoprocesoprodu= new TipoProcesoProdu();
			}

			if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProcesoProdu
				this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);

				this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.getpedidodetaprodu().setTipoProcesoProdu(this.tipoprocesoprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProcesoProdu--;	
		
		
		this.tipoprocesoproduAux=new TipoProcesoProdu();
		
		this.tipoprocesoproduAux.setId(this.iIdNuevoTipoProcesoProdu);
		this.tipoprocesoproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprocesoproduLogic.getTipoProcesoProdus().add(this.tipoprocesoproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprocesoprodus.add(this.tipoprocesoproduAux);
		}
		//ARCHITECTURE
		
		this.tipoprocesoprodu=this.tipoprocesoproduAux;
		
		if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoProdu(this.tipoprocesoprodu);
		}
				
		//this.setDefaultControlesTipoProcesoProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProcesoProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoProdu(this.tipoprocesoproduBean,this.tipoprocesoprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProcesoProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
			classes=TipoProcesoProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprocesoproduReturnGeneral=tipoprocesoproduLogic.procesarEventosTipoProcesoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoproduLogic.getTipoProcesoProdus(),this.tipoprocesoprodu,this.tipoprocesoproduParameterGeneral,this.isEsNuevoTipoProcesoProdu,classes);//this.tipoprocesoproduLogic.getTipoProcesoProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoProdu(this.tipoprocesoproduReturnGeneral,this.tipoprocesoproduBean,false);
		
		if(this.tipoprocesoproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu());
		}
		
		if(this.tipoprocesoproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu(),classes);//this.tipoprocesoproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProcesoProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProcesoProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProcesoProdu(false);
						
			if(tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado() && PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoDetaProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoProdu();
			}
			
			this.actualizarVisualTableDatosTipoProcesoProdu();
			
			this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoProdu(), this.getIndiceNuevoTipoProcesoProdu());
			
			this.seleccionarFilaTablaTipoProcesoProduActual();
						
			this.actualizarEstadoCeldasBotonesTipoProcesoProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProcesoProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setEnabled(isHabilitar && this.tipoprocesoproduConstantesFunciones.activarnombreTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setEnabled(isHabilitar && this.tipoprocesoproduConstantesFunciones.activardescripcionTipoProcesoProdu);	
		//
		this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setEnabled(isHabilitar && this.tipoprocesoproduConstantesFunciones.activarid_empresaTipoProcesoProdu);
	};
	
	public void setDefaultControlesTipoProcesoProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProcesoProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprocesoproduSessionBean.setConGuardarRelaciones(true);			
			this.tipoprocesoproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprocesoproduSessionBean.setConGuardarRelaciones(false);			
			this.tipoprocesoproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProcesoProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
				if(tipoprocesoproduAux.getId().equals(this.iIdNuevoTipoProcesoProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoprodus) {
				if(tipoprocesoproduAux.getId().equals(this.iIdNuevoTipoProcesoProdu)) {
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
	
	public int getIndiceActualTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
				if(tipoprocesoproduAux.getId().equals(tipoprocesoprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoprodus) {
				if(tipoprocesoproduAux.getId().equals(tipoprocesoprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProcesoProdu(TipoProcesoProdu tipoprocesoproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
				if(tipoprocesoproduAux.getTipoProcesoProduOriginal().getId().equals(tipoprocesoproduOriginal.getId())) {
					existe=true;
					tipoprocesoproduOriginal.setId(tipoprocesoproduAux.getId());
					tipoprocesoproduOriginal.setVersionRow(tipoprocesoproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoprodus) {
				if(tipoprocesoproduAux.getTipoProcesoProduOriginal().getId().equals(tipoprocesoproduOriginal.getId())) {
					existe=true;
					tipoprocesoproduOriginal.setId(tipoprocesoproduAux.getId());
					tipoprocesoproduOriginal.setVersionRow(tipoprocesoproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProcesoProdu(Boolean esParaCancelar) throws Exception {
		tipoprocesoprodusAux=new ArrayList<TipoProcesoProdu>();
		tipoprocesoproduAux=new TipoProcesoProdu();
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
					if(tipoprocesoproduAux.getId()<0) {
						tipoprocesoprodusAux.add(tipoprocesoproduAux);
					}		
				}
				this.iIdNuevoTipoProcesoProdu=0L;
				this.tipoprocesoproduLogic.getTipoProcesoProdus().removeAll(tipoprocesoprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoprodus) {
					if(tipoprocesoproduAux.getId()<0) {
						tipoprocesoprodusAux.add(tipoprocesoproduAux);
					}		
				}
				this.iIdNuevoTipoProcesoProdu=0L;
				this.tipoprocesoprodus.removeAll(tipoprocesoprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoProdu 
					&& this.tipoprocesoproduLogic.getTipoProcesoProdus().size()>0
					) {
					tipoprocesoproduAux=this.tipoprocesoproduLogic.getTipoProcesoProdus().get(this.tipoprocesoproduLogic.getTipoProcesoProdus().size() - 1);
				
					if(tipoprocesoproduAux.getId()<0) {
						this.tipoprocesoproduLogic.getTipoProcesoProdus().remove(tipoprocesoproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProcesoProdu && this.tipoprocesoprodus.size()>0) {
					tipoprocesoproduAux=this.tipoprocesoprodus.get(this.tipoprocesoprodus.size() - 1);
				
					if(tipoprocesoproduAux.getId()<0) {
						this.tipoprocesoprodus.remove(tipoprocesoproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProcesoProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprocesoprodu.getId()<0) {
				this.tipoprocesoproduLogic.getTipoProcesoProdus().remove(this.tipoprocesoprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprocesoprodu.getId()<0) {
				this.tipoprocesoprodus.remove(this.tipoprocesoprodu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProcesoProdu(List<TipoProcesoProdu> tipoprocesoprodusAux) throws Exception {
		TipoProcesoProduConstantesFunciones.setEstadosInicialesTipoProcesoProdu(tipoprocesoprodusAux);
	}
	
	public void setEstadosInicialesTipoProcesoProdu(TipoProcesoProdu tipoprocesoproduAux) throws Exception {
		TipoProcesoProduConstantesFunciones.setEstadosInicialesTipoProcesoProdu(tipoprocesoproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProcesoProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProcesoProduActual()) {
				if(!this.isEsNuevoTipoProcesoProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProcesoProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProcesoProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Proceso Produccion ?", "MANTENIMIENTO DE Tipo Proceso Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProcesoProdu tipoprocesoprodu) throws Exception {
		TipoProcesoProduConstantesFunciones.seleccionarAsignar(this.tipoprocesoprodu,tipoprocesoprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProcesoProdu=this.isPermisoActualizarOriginalTipoProcesoProdu;
			
			
			this.seleccionarAsignar(tipoprocesoprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProcesoProduConstantesFunciones.quitarEspaciosTipoProcesoProdu(this.tipoprocesoprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProcesoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprocesoproduSessionBean.setsFuncionBusquedaRapida(this.tipoprocesoproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProcesoProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProcesoProdu(esParaCancelar);				
				this.cancelarNuevoTipoProcesoProdu(esParaCancelar);								
			}
			
			this.tipoprocesoprodu=new TipoProcesoProdu();
			
			this.inicializarTipoProcesoProdu();
			
			this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProcesoProdu() throws Exception {
		try {
			TipoProcesoProduConstantesFunciones.inicializarTipoProcesoProdu(this.tipoprocesoprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprocesoproduLogic.getTipoProcesoProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProcesoProdus(String sAccionBusqueda,List<TipoProcesoProdu> tipoprocesoprodusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProcesoProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProcesoProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProcesoProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProcesoProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Proceso Produccions");		
		parameters.put("busquedapor", TipoProcesoProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoDetaProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProcesoProduLogic tipoprocesoproduLogicAuxiliar=new TipoProcesoProduLogic();
					tipoprocesoproduLogicAuxiliar.setDatosCliente(tipoprocesoproduLogic.getDatosCliente());				
					tipoprocesoproduLogicAuxiliar.setTipoProcesoProdus(tipoprocesoprodusParaReportes);
					
					tipoprocesoproduLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProcesoProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprocesoprodusParaReportes=tipoprocesoproduLogicAuxiliar.getTipoProcesoProdus();
					
					//tipoprocesoproduLogic.getNewConnexionToDeep();
					
					//for (TipoProcesoProdu tipoprocesoprodu:tipoprocesoprodusParaReportes) {
					//	tipoprocesoproduLogic.deepLoad(tipoprocesoprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprocesoproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprocesoproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoDetaProdu = AuxiliarReportes.class.getResourceAsStream("PedidoDetaProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidodetaprodu", reportFilePedidoDetaProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProcesoProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProcesoProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProcesoProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProcesoProdu=new JRBeanArrayDataSource(TipoProcesoProduJInternalFrame.TraerTipoProcesoProduBeans(tipoprocesoprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProcesoProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProcesoProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProcesoProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProcesoProduBean.TraerTipoProcesoProduBeans(tipoprocesoprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProcesoProduActionPerformed(null);
					//this.generarExcelReporteTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProcesoProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprocesoprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProcesoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoProdu> tipoprocesoprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProcesoProdu tipoprocesoprodu : tipoprocesoprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProcesoProduConstantesFunciones.generarExcelReporteDataTipoProcesoProdu("NORMAL",row,workbook,tipoprocesoprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProcesoProdu(String sTipo,Row row,Workbook workbook) {
		
		TipoProcesoProduConstantesFunciones.generarExcelReporteHeaderTipoProcesoProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProcesoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoProdu> tipoprocesoprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProcesoProdu tipoprocesoprodu : tipoprocesoprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProcesoProduConstantesFunciones.getTipoProcesoProduDescripcion(tipoprocesoprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoprodu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprocesoprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProcesoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProcesoProdu> tipoprocesoprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProcesoProdu> tipoprocesoprodusRespaldo=null;
		
		classes=TipoProcesoProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprocesoproduLogic.setDatosCliente(this.datosCliente);
		this.tipoprocesoproduLogic.setDatosDeep(this.datosDeep);
		this.tipoprocesoproduLogic.setIsConDeep(true);
		
		tipoprocesoprodusRespaldo=this.tipoprocesoproduLogic.getTipoProcesoProdus();
		
		this.tipoprocesoproduLogic.setTipoProcesoProdus(tipoprocesoprodusParaReportes);	
		this.tipoprocesoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprocesoprodusParaReportes=this.tipoprocesoproduLogic.getTipoProcesoProdus();
		this.tipoprocesoproduLogic.setTipoProcesoProdus(tipoprocesoprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProcesoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProcesoProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProcesoProdu tipoprocesoprodu : tipoprocesoprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProcesoProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProcesoProduConstantesFunciones.generarExcelReporteDataTipoProcesoProdu("NORMAL",row,workbook,tipoprocesoprodu,cellStyleDataAux);
		
			
			


				//PedidoDetaProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprocesoprodu.getPedidoDetaProdus()!=null && tipoprocesoprodu.getPedidoDetaProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoDetaProduConstantesFunciones.generarExcelReporteHeaderPedidoDetaProdu("RELACIONADO",row,workbook);
				}

				if(tipoprocesoprodu.getPedidoDetaProdus()!=null) {
					i2=0;
					for(PedidoDetaProdu pedidodetaprodu : tipoprocesoprodu.getPedidoDetaProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoDetaProduConstantesFunciones.generarExcelReporteDataPedidoDetaProdu("RELACIONADO",row,workbook,pedidodetaprodu,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProcesoProduConstantesFunciones.getTipoProcesoProduDescripcion(tipoprocesoprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProcesoProdu() throws Exception {		
		this.startProcessTipoProcesoProdu(true);
	}
	
	public void startProcessTipoProcesoProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProcesoProdu ,this.jPanelParametrosReportesTipoProcesoProdu, this.jScrollPanelDatosTipoProcesoProdu,this.jPanelPaginacionTipoProcesoProdu, this.jScrollPanelDatosEdicionTipoProcesoProdu, this.jPanelAccionesTipoProcesoProdu,this.jPanelAccionesFormularioTipoProcesoProdu,this.jmenuBarTipoProcesoProdu,this.jmenuBarDetalleTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoProdu=this.jTabbedPaneBusquedasTipoProcesoProdu; 
		
		final JPanel jPanelParametrosReportesTipoProcesoProdu=this.jPanelParametrosReportesTipoProcesoProdu;
		//final JScrollPane jScrollPanelDatosTipoProcesoProdu=this.jScrollPanelDatosTipoProcesoProdu;
		final JTable jTableDatosTipoProcesoProdu=this.jTableDatosTipoProcesoProdu;		
		final JPanel jPanelPaginacionTipoProcesoProdu=this.jPanelPaginacionTipoProcesoProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoProdu=this.jScrollPanelDatosEdicionTipoProcesoProdu;
		final JPanel jPanelAccionesTipoProcesoProdu=this.jPanelAccionesTipoProcesoProdu;
		
		JPanel jPanelCamposAuxiliarTipoProcesoProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			jPanelCamposAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelCamposTipoProcesoProdu;
			jPanelAccionesFormularioAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelAccionesFormularioTipoProcesoProdu;
		}
		
		final JPanel jPanelCamposTipoProcesoProdu=jPanelCamposAuxiliarTipoProcesoProdu;
		final JPanel jPanelAccionesFormularioTipoProcesoProdu=jPanelAccionesFormularioAuxiliarTipoProcesoProdu;
		
		
		final JMenuBar jmenuBarTipoProcesoProdu=this.jmenuBarTipoProcesoProdu;
		final JToolBar jTtoolBarTipoProcesoProdu=this.jTtoolBarTipoProcesoProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jmenuBarDetalleTipoProcesoProdu;
			jTtoolBarDetalleAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jTtoolBarDetalleTipoProcesoProdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoProdu=jmenuBarDetalleAuxiliarTipoProcesoProdu;
		final JToolBar jTtoolBarDetalleTipoProcesoProdu=jTtoolBarDetalleAuxiliarTipoProcesoProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoProdu;
			processRunnable.jTableDatos=jTableDatosTipoProcesoProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProcesoProdu ,jPanelParametrosReportesTipoProcesoProdu,jTableDatosTipoProcesoProdu, /*jScrollPanelDatosTipoProcesoProdu,*/jPanelCamposTipoProcesoProdu,jPanelPaginacionTipoProcesoProdu, /*jScrollPanelDatosEdicionTipoProcesoProdu,*/ jPanelAccionesTipoProcesoProdu,jPanelAccionesFormularioTipoProcesoProdu,jmenuBarTipoProcesoProdu,jmenuBarDetalleTipoProcesoProdu,jTtoolBarTipoProcesoProdu,jTtoolBarDetalleTipoProcesoProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProcesoProdu ,jPanelParametrosReportesTipoProcesoProdu, jScrollPanelDatosTipoProcesoProdu,jPanelPaginacionTipoProcesoProdu, jScrollPanelDatosEdicionTipoProcesoProdu, jPanelAccionesTipoProcesoProdu,jPanelAccionesFormularioTipoProcesoProdu,jmenuBarTipoProcesoProdu,jmenuBarDetalleTipoProcesoProdu,jTtoolBarTipoProcesoProdu,jTtoolBarDetalleTipoProcesoProdu);
						
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
	
	public void finishProcessTipoProcesoProdu() {// throws Exception 
		this.finishProcessTipoProcesoProdu(true);
	}
	
	public void finishProcessTipoProcesoProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProcesoProdu ,this.jPanelParametrosReportesTipoProcesoProdu, this.jScrollPanelDatosTipoProcesoProdu,this.jPanelPaginacionTipoProcesoProdu, this.jScrollPanelDatosEdicionTipoProcesoProdu, this.jPanelAccionesTipoProcesoProdu,this.jPanelAccionesFormularioTipoProcesoProdu,this.jmenuBarTipoProcesoProdu,this.jmenuBarDetalleTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,this.jTtoolBarDetalleTipoProcesoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProcesoProdu=this.jTabbedPaneBusquedasTipoProcesoProdu; 
		
		final JPanel jPanelParametrosReportesTipoProcesoProdu=this.jPanelParametrosReportesTipoProcesoProdu;
		//final JScrollPane jScrollPanelDatosTipoProcesoProdu=this.jScrollPanelDatosTipoProcesoProdu;
		final JTable jTableDatosTipoProcesoProdu=this.jTableDatosTipoProcesoProdu;		
		final JPanel jPanelPaginacionTipoProcesoProdu=this.jPanelPaginacionTipoProcesoProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoProcesoProdu=this.jScrollPanelDatosEdicionTipoProcesoProdu;
		final JPanel jPanelAccionesTipoProcesoProdu=this.jPanelAccionesTipoProcesoProdu;
		
		JPanel jPanelCamposAuxiliarTipoProcesoProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProcesoProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			jPanelCamposAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelCamposTipoProcesoProdu;
			jPanelAccionesFormularioAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelAccionesFormularioTipoProcesoProdu;
		}
		
		final JPanel jPanelCamposTipoProcesoProdu=jPanelCamposAuxiliarTipoProcesoProdu;
		final JPanel jPanelAccionesFormularioTipoProcesoProdu=jPanelAccionesFormularioAuxiliarTipoProcesoProdu;
		
		
		final JMenuBar jmenuBarTipoProcesoProdu=this.jmenuBarTipoProcesoProdu;		
		final JToolBar jTtoolBarTipoProcesoProdu=this.jTtoolBarTipoProcesoProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProcesoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProcesoProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			jmenuBarDetalleAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jmenuBarDetalleTipoProcesoProdu;
			jTtoolBarDetalleAuxiliarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jTtoolBarDetalleTipoProcesoProdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProcesoProdu=jmenuBarDetalleAuxiliarTipoProcesoProdu;
		final JToolBar jTtoolBarDetalleTipoProcesoProdu=jTtoolBarDetalleAuxiliarTipoProcesoProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProcesoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProcesoProdu;
			processRunnable.jTableDatos=jTableDatosTipoProcesoProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoProcesoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProcesoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProcesoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProcesoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProcesoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProcesoProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoProcesoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProcesoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProcesoProdu ,jPanelParametrosReportesTipoProcesoProdu, jTableDatosTipoProcesoProdu,/*jScrollPanelDatosTipoProcesoProdu,*/jPanelCamposTipoProcesoProdu,jPanelPaginacionTipoProcesoProdu, /*jScrollPanelDatosEdicionTipoProcesoProdu,*/ jPanelAccionesTipoProcesoProdu,jPanelAccionesFormularioTipoProcesoProdu,jmenuBarTipoProcesoProdu,jmenuBarDetalleTipoProcesoProdu,jTtoolBarTipoProcesoProdu,jTtoolBarDetalleTipoProcesoProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProcesoProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProcesoProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProcesoProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProcesoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProcesoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProcesoProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProcesoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProcesoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProcesoProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprocesoproduConstantesFunciones.getsFinalQueryTipoProcesoProdu();
		String  finalQueryPaginacionTodos=this.tipoprocesoproduConstantesFunciones.getsFinalQueryTipoProcesoProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProcesoProduConstantesFunciones.getArrayColumnasGlobalesNoTipoProcesoProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProcesoProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProcesoProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprocesoprodusEliminados= new ArrayList<TipoProcesoProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProcesoProdu();
		
				///*TipoProcesoProduSessionBean*/this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
			
			if(this.tipoprocesoproduSessionBean==null) {
				this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
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
					this.iNumeroPaginacion=TipoProcesoProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProcesoProduConstantesFunciones.getClassesForeignKeysOfTipoProcesoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprocesoprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprocesoprodusAux= new ArrayList<TipoProcesoProdu>();
			
				
			tipoprocesoproduLogic.setDatosCliente(this.datosCliente);
			tipoprocesoproduLogic.setDatosDeep(this.datosDeep);
			tipoprocesoproduLogic.setIsConDeep(true);
			
			
			tipoprocesoproduLogic.getTipoProcesoProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprocesoproduLogic.getTodosTipoProcesoProdus(finalQueryGlobal,pagination);
					
					//tipoprocesoproduLogic.getTodosTipoProcesoProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprocesoproduLogic.getTipoProcesoProdus()==null|| tipoprocesoproduLogic.getTipoProcesoProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoprodusAux= new ArrayList<TipoProcesoProdu>();
							tipoprocesoprodusAux.addAll(tipoprocesoproduLogic.getTipoProcesoProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoprodusAux= new ArrayList<TipoProcesoProdu>();
							tipoprocesoprodusAux.addAll(tipoprocesoprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoproduLogic.getTodosTipoProcesoProdus(finalQueryGlobal+"",this.pagination);												
							
							//tipoprocesoproduLogic.getTodosTipoProcesoProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProcesoProdus("Todos",tipoprocesoproduLogic.getTipoProcesoProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprocesoproduLogic.setTipoProcesoProdus(new ArrayList<TipoProcesoProdu>());					
							tipoprocesoproduLogic.getTipoProcesoProdus().addAll(tipoprocesoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoprodus=new ArrayList<TipoProcesoProdu>();
							tipoprocesoprodus.addAll(tipoprocesoprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProcesoProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProcesoProdu=this.idActual;
				
				} else if(this.idTipoProcesoProduActual!=null && this.idTipoProcesoProduActual!=0L) {
					idTipoProcesoProdu=idTipoProcesoProduActual;
				}
				
					
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndicePorId(idTipoProcesoProdu);
				
				this.tipoprocesoprodus=new ArrayList<TipoProcesoProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprocesoproduLogic.getEntity(idTipoProcesoProdu);
					
					//tipoprocesoproduLogic.getEntityWithConnection(idTipoProcesoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoproduLogic.setTipoProcesoProdus(new ArrayList<TipoProcesoProdu>());
					tipoprocesoproduLogic.getTipoProcesoProdus().add(tipoprocesoproduLogic.getTipoProcesoProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoprodus=new ArrayList<TipoProcesoProdu>();
					this.tipoprocesoprodus.add(tipoprocesoprodu);
				}
				
				if(tipoprocesoproduLogic.getTipoProcesoProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprocesoproduLogic.getTipoProcesoProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprocesoproduLogic.getTipoProcesoProdus()==null||tipoprocesoproduLogic.getTipoProcesoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprocesoprodus==null|| tipoprocesoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoprodusAux=new ArrayList<TipoProcesoProdu>();
						tipoprocesoprodusAux.addAll(tipoprocesoproduLogic.getTipoProcesoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoprodusAux=new ArrayList<TipoProcesoProdu>();
							tipoprocesoprodusAux.addAll(tipoprocesoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprocesoproduLogic.getTipoProcesoProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProcesoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProcesoProdus("FK_IdEmpresa",tipoprocesoproduLogic.getTipoProcesoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProcesoProdus("FK_IdEmpresa",tipoprocesoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduLogic.setTipoProcesoProdus(new ArrayList<TipoProcesoProdu>());
						tipoprocesoproduLogic.getTipoProcesoProdus().addAll(tipoprocesoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoprodus=new ArrayList<TipoProcesoProdu>();
							tipoprocesoprodus.addAll(tipoprocesoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProcesoProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProcesoProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesoproduLogic.getTipoProcesoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprocesoproduLogic.getTipoProcesoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProcesoProdu tipoprocesoprodu) {
		Boolean permite=true;
		
		if(this.tipoprocesoprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProcesoProduConstantesFunciones.getOrderByListaTipoProcesoProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProcesoProduConstantesFunciones.getOrderByListaTipoProcesoProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoproduLogic.getTipoProcesoProdus()) {
				if(tipoprocesoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoproduTotales=tipoprocesoprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoProdu tipoprocesoprodu:this.tipoprocesoprodus) {
				if(tipoprocesoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoproduTotales=tipoprocesoprodu;
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
			this.tipoprocesoproduAux=new TipoProcesoProdu();
			this.tipoprocesoproduAux.setsType(Constantes2.S_TOTALES);
			this.tipoprocesoproduAux.setIsNew(false);
			this.tipoprocesoproduAux.setIsChanged(false);
			this.tipoprocesoproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProcesoProduConstantesFunciones.TotalizarValoresFilaTipoProcesoProdu(this.tipoprocesoproduLogic.getTipoProcesoProdus(),this.tipoprocesoproduAux);
				
				this.tipoprocesoproduLogic.getTipoProcesoProdus().add(this.tipoprocesoproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProcesoProduConstantesFunciones.TotalizarValoresFilaTipoProcesoProdu(this.tipoprocesoprodus,this.tipoprocesoproduAux);
				
				this.tipoprocesoprodus.add(this.tipoprocesoproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprocesoproduTotales=new TipoProcesoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesoproduLogic.getTipoProcesoProdus().remove(tipoprocesoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprocesoprodus.remove(tipoprocesoproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprocesoproduTotales=new TipoProcesoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoproduLogic.getTipoProcesoProdus()) {
				if(tipoprocesoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoproduTotales=tipoprocesoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoProduConstantesFunciones.TotalizarValoresFilaTipoProcesoProdu(this.tipoprocesoproduLogic.getTipoProcesoProdus(),tipoprocesoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProcesoProdu tipoprocesoprodu:this.tipoprocesoprodus) {
				if(tipoprocesoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprocesoproduTotales=tipoprocesoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProcesoProduConstantesFunciones.TotalizarValoresFilaTipoProcesoProdu(this.tipoprocesoprodus,tipoprocesoproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProcesoProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoProcesoProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoproduLogic.getTipoProcesoProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoProcesoProdu() {
		this.isPermisoTodoTipoProcesoProdu=false;
		this.isPermisoNuevoTipoProcesoProdu=false;
		this.isPermisoActualizarTipoProcesoProdu=false;
		this.isPermisoActualizarOriginalTipoProcesoProdu=false;
		this.isPermisoEliminarTipoProcesoProdu=false;
		this.isPermisoGuardarCambiosTipoProcesoProdu=false;
		this.isPermisoConsultaTipoProcesoProdu=false;
		this.isPermisoBusquedaTipoProcesoProdu=false;
		this.isPermisoReporteTipoProcesoProdu=false;		
		this.isPermisoOrdenTipoProcesoProdu=false;		
		this.isPermisoPaginacionMedioTipoProcesoProdu=false;		
		this.isPermisoPaginacionAltoTipoProcesoProdu=false;
		this.isPermisoPaginacionTodoTipoProcesoProdu=false;
		this.isPermisoCopiarTipoProcesoProdu=false;		
		this.isPermisoVerFormTipoProcesoProdu=false;		
		this.isPermisoDuplicarTipoProcesoProdu=false;		
		this.isPermisoOrdenTipoProcesoProdu=false;		
	}
	
	public void setPermisosUsuarioTipoProcesoProdu(Boolean isPermiso) {
		this.isPermisoTodoTipoProcesoProdu=isPermiso;
		this.isPermisoNuevoTipoProcesoProdu=isPermiso;
		this.isPermisoActualizarTipoProcesoProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoProdu=isPermiso;
		this.isPermisoEliminarTipoProcesoProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoProdu=isPermiso;
		this.isPermisoConsultaTipoProcesoProdu=isPermiso;
		this.isPermisoBusquedaTipoProcesoProdu=isPermiso;
		this.isPermisoReporteTipoProcesoProdu=isPermiso;
		this.isPermisoOrdenTipoProcesoProdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoProcesoProdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoProcesoProdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoProcesoProdu=isPermiso;		
		this.isPermisoCopiarTipoProcesoProdu=isPermiso;		
		this.isPermisoVerFormTipoProcesoProdu=isPermiso;		
		this.isPermisoDuplicarTipoProcesoProdu=isPermiso;
		this.isPermisoOrdenTipoProcesoProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProcesoProdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoProcesoProdu=isPermiso;
		this.isPermisoNuevoTipoProcesoProdu=isPermiso;
		this.isPermisoActualizarTipoProcesoProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoProcesoProdu=isPermiso;
		this.isPermisoEliminarTipoProcesoProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoProcesoProdu=isPermiso;
		//this.isPermisoConsultaTipoProcesoProdu=isPermiso;
		//this.isPermisoBusquedaTipoProcesoProdu=isPermiso;
		//this.isPermisoReporteTipoProcesoProdu=isPermiso;
		//this.isPermisoOrdenTipoProcesoProdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProcesoProdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProcesoProdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProcesoProdu=isPermiso;		
		//this.isPermisoCopiarTipoProcesoProdu=isPermiso;		
		//this.isPermisoDuplicarTipoProcesoProdu=isPermiso;
		//this.isPermisoOrdenTipoProcesoProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProcesoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoDetaProdu=false;
		this.isTienePermisosPedidoDetaProdu=this.verificarGetPermisosUsuarioOpcionTipoProcesoProduClaseRelacionada(this.opcionsRelacionadas,PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProcesoProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProcesoProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoDetaProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProcesoProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProcesoProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProcesoProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoDetaProdu && this.jInternalFrameDetalleFormTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.remove(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProcesoProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProcesoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProcesoProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProcesoProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProcesoProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProcesoProdu=this.isPermisoActualizarTipoProcesoProdu;
			this.isPermisoEliminarTipoProcesoProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProcesoProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProcesoProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProcesoProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProcesoProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProcesoProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProcesoProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProcesoProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProcesoProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProcesoProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProcesoProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProcesoProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProcesoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProcesoProdu.setToolTipText(this.jTableDatosTipoProcesoProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProcesoProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProcesoProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProcesoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProcesoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProcesoProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoDetaProdu && this.tipoprocesoproduConstantesFunciones.mostrarPedidoDetaProduTipoProcesoProdu && !TipoProcesoProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Detalle Produccion");
			reporte.setsDescripcion("Pedido Detalle Produccion");
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
	public void inicializarCombosForeignKeyTipoProcesoProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProcesoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProcesoProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProcesoProduListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoProcesoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoProcesoProduParameterReturnGeneral tipoprocesoproduReturnGeneral=new TipoProcesoProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoprocesoproduConstantesFunciones.cargarid_empresaTipoProcesoProdu)
					 || (this.esRecargarFks && this.tipoprocesoproduConstantesFunciones.cargarid_empresaTipoProcesoProdu)) {

					if(!this.tipoprocesoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoprocesoproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoprocesoproduReturnGeneral=tipoprocesoproduLogic.cargarCombosLoteForeignKeyTipoProcesoProdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoprocesoproduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProcesoProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoprocesoproduSessionBean==null) {
				this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
			}

			if(!this.tipoprocesoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoProcesoProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProcesoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProcesoProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProcesoProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProcesoProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProcesoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProcesoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProcesoProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProcesoProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProcesoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProcesoProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoProcesoProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProcesoProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProcesoProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean(); 
		this.tipoprocesoproduConstantesFunciones=new TipoProcesoProduConstantesFunciones(); 
		this.tipoprocesoproduBean=new TipoProcesoProdu();//(this.tipoprocesoproduConstantesFunciones); 		
		this.tipoprocesoproduReturnGeneral=new TipoProcesoProduParameterReturnGeneral(); 
		
		this.tipoprocesoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProcesoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProcesoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProcesoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProcesoProdu(true);
			
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
			
			this.tipoprocesoproduConstantesFunciones=new TipoProcesoProduConstantesFunciones(); 
			this.tipoprocesoproduBean=new TipoProcesoProdu();//this.tipoprocesoproduConstantesFunciones); 			
			this.tipoprocesoproduReturnGeneral=new TipoProcesoProduParameterReturnGeneral(); 
		
			TipoProcesoProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprocesoprodu=new TipoProcesoProdu();
			this.tipoprocesoprodus = new ArrayList<TipoProcesoProdu>();
			this.tipoprocesoprodusAux = new ArrayList<TipoProcesoProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic=new TipoProcesoProduLogic();
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprocesoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprocesoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProcesoProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoProdu);	
					}
					
					if(this.jInternalFrameImportacionTipoProcesoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProcesoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProcesoProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoProdu);
				this.jInternalFrameDetalleFormTipoProcesoProdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoProcesoProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoProdu);
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProcesoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoProdu);
					this.jInternalFrameImportacionTipoProcesoProdu.setVisible(false);
					this.jInternalFrameImportacionTipoProcesoProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProcesoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoProdu);
					this.jInternalFrameOrderByTipoProcesoProdu.setVisible(false);
					this.jInternalFrameOrderByTipoProcesoProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProcesoProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProcesoProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprocesoproduReturnGeneral=new TipoProcesoProduParameterReturnGeneral();
			
			this.tipoprocesoproduParameterGeneral=new TipoProcesoProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprocesoproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProcesoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado(),this.tipoprocesoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProcesoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado(),this.tipoprocesoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoProdu=true;
			this.isVisibilidadCeldaCopiarTipoProcesoProdu=true;
			this.isVisibilidadCeldaVerFormTipoProcesoProdu=true;
			this.isVisibilidadCeldaOrdenTipoProcesoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProcesoProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProcesoProdu(false);
			
			this.setPermisosUsuarioTipoProcesoProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprocesoproduSessionBean.getEsGuardarRelacionado() && this.tipoprocesoproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProcesoProduClasesRelacionadas();
			}
			
			if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProcesoProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProcesoProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoProdu();
			}
			
			if(!this.isPermisoBusquedaTipoProcesoProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProcesoProdu,this.isPermisoPaginacionMedioTipoProcesoProdu,this.isPermisoPaginacionTodoTipoProcesoProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProcesoProduConstantesFunciones.getTiposSeleccionarTipoProcesoProdu());
				
				this.tiposColumnasSelect=TipoProcesoProduConstantesFunciones.getTiposSeleccionarTipoProcesoProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProcesoProdu();				
				//this.tiposRelacionesSelect=TipoProcesoProduConstantesFunciones.getTiposRelacionesTipoProcesoProdu(true);
				
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
			//if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProcesoProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoProcesoProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoProcesoProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoProdu() ;
			
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
			
			
			this.pedidodetaproduLogic=new PedidoDetaProduLogic(); 
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
				tipoprocesoproduImplementable= (TipoProcesoProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprocesoproduImplementableHome= (TipoProcesoProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProcesoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprocesoprodus= new ArrayList<TipoProcesoProdu>();
			this.tipoprocesoprodusEliminados= new ArrayList<TipoProcesoProdu>();
						
			this.isEsNuevoTipoProcesoProdu=false;
			this.esParaAccionDesdeFormularioTipoProcesoProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProcesoProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProcesoProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProcesoProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProcesoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProcesoProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProcesoProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProcesoProdu();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProcesoProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProcesoProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProcesoProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProcesoProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProcesoProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProcesoProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProcesoProdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Pedido Detalle Producciones")) {
					if(!PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProcesoProdu();

						this.cargarParteTabPanelRelacionadaPedidoDetaProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProcesoProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPedidoDetaProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProcesoProdu.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(false,true,iIndex);
		this.jButtonPedidoDetaProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoDetaProdu();

		//this.jTabbedPaneRelacionesTipoProcesoProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoProcesoProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProcesoProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoDetaProdu")) {
				int row=this.jTableDatosTipoProcesoProdu.getSelectedRow();
				jButtonPedidoDetaProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Detalle Produccion")) {

					if(this.isTienePermisosPedidoDetaProdu && this.tipoprocesoproduConstantesFunciones.mostrarPedidoDetaProduTipoProcesoProdu && !TipoProcesoProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Detalle Producciones"+"("+PedidoDetaProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Detalle Producciones");

						if(tipoprocesoproduConstantesFunciones.resaltarPedidoDetaProduTipoProcesoProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprocesoproduConstantesFunciones.resaltarPedidoDetaProduTipoProcesoProdu);
						}

						jmenuItem.setEnabled(this.tipoprocesoproduConstantesFunciones.activarPedidoDetaProduTipoProcesoProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoDetaProdu"));

						

						this.jInternalFrameDetalleFormTipoProcesoProdu.jmenuDetalleTipoProcesoProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProcesoProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProcesoProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProcesoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProcesoProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProcesoProdu();
		
		this.cargarCombosFrameForeignKeyTipoProcesoProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProcesoProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProcesoProdu();
		}
	}
	
	
	
	public void jButtonNuevoTipoProcesoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			
			if(jTableDatosTipoProcesoProdu.getRowCount()>=1) {
				jTableDatosTipoProcesoProdu.removeRowSelectionInterval(0, jTableDatosTipoProcesoProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProcesoProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProcesoProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProcesoProdu(true);			
			//this.tipoprocesoprodu=new TipoProcesoProdu();
			//this.tipoprocesoprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu() ;
			
			if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprocesoprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);				
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProcesoProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProcesoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProcesoProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoProdu.getSelectedRows().length;			
			}
			
			tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProcesoProdu--;			
				//TipoProcesoProdu tipoprocesoproduAux= new TipoProcesoProdu();			
				//tipoprocesoproduAux.setId(this.iIdNuevoTipoProcesoProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProcesoProdu tipoprocesoproduOrigen=new TipoProcesoProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProcesoProdu tipoprocesoproduOrigen : tipoprocesoprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprocesoproduOrigen =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprocesoproduOrigen =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProcesoProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprocesoprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProcesoProdu(tipoprocesoproduOrigen,this.tipoprocesoprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesoproduLogic.getTipoProcesoProdus().add(this.tipoprocesoproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodus.add(this.tipoprocesoproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
				
				this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoProdu(), this.getIndiceNuevoTipoProcesoProdu());
				
				int iLastRow =  this.jTableDatosTipoProcesoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();									
		
			TipoProcesoProdu tipoprocesoproduOrigen=new TipoProcesoProdu();
			TipoProcesoProdu tipoprocesoproduDestino=new TipoProcesoProdu();
				
			tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProcesoProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprocesoprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProcesoProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduOrigen =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesoproduOrigen =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprocesoproduDestino =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprocesoproduDestino =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprocesoproduOrigen =tipoprocesoprodusSeleccionados.get(0);
				tipoprocesoproduDestino =tipoprocesoprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProcesoProdu(tipoprocesoproduOrigen,tipoprocesoproduDestino,true,false);
				
				tipoprocesoproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprocesoproduDestino,tipoprocesoproduLogic.getTipoProcesoProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprocesoproduDestino,tipoprocesoprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
				
				//this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoProdu(), this.getIndiceNuevoTipoProcesoProdu());
				
				int iLastRow =  this.jTableDatosTipoProcesoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProcesoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProcesoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProcesoProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProcesoProdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoProcesoProdu.setVisible(!isVisible);
			this.jPanelAccionesTipoProcesoProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProcesoProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProcesoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProcesoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProcesoProdu();
			
			this.abrirFrameOrderByTipoProcesoProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProcesoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProcesoProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProcesoProdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProcesoProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProcesoProdu.setSize(this.jInternalFrameDetalleFormTipoProcesoProdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoProcesoProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProcesoProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProcesoProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProcesoProdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProcesoProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoProdu.jContentPaneDetalleTipoProcesoProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoProdu.jContentPaneDetalleTipoProcesoProdu.getWidth(),TipoProcesoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoProdu.jContentPaneDetalleTipoProcesoProdu.getWidth(),TipoProcesoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProcesoProdu.jContentPaneDetalleTipoProcesoProdu.getWidth(),TipoProcesoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoDetaProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProcesoProdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProcesoProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProcesoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProcesoProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProcesoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoProdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoProcesoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProcesoProdu);
				this.jInternalFrameOrderByTipoProcesoProdu.setVisible(false);
				this.jInternalFrameOrderByTipoProcesoProdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoProcesoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoProdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProcesoProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProcesoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProcesoProdu==null) {
				
				this.jInternalFrameImportacionTipoProcesoProdu=new ImportacionJInternalFrame(TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProcesoProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProcesoProdu);
				this.jInternalFrameImportacionTipoProcesoProdu.setVisible(false);
				this.jInternalFrameImportacionTipoProcesoProdu.setSelected(false);


				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoProdu"));
				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoProdu"));
				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProcesoProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoProdu==null) {
				this.jInternalFrameReporteDinamicoTipoProcesoProdu=new ReporteDinamicoJInternalFrame(TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProcesoProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProcesoProdu);
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPedidoDetaProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProcesoProdu.jContentPaneDetalleTipoProcesoProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProcesoProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProcesoProdu);
			
	       	this.jInternalFrameDetalleFormTipoProcesoProdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProcesoProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProcesoProdu.dispose();
			//this.jInternalFrameDetalleFormTipoProcesoProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProcesoProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProcesoProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProcesoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProcesoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProcesoProdu.setVisible(true);
	        this.jInternalFrameImportacionTipoProcesoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProcesoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProcesoProdu.setVisible(true);
	        this.jInternalFrameOrderByTipoProcesoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProcesoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProcesoProdu.setVisible(false);
	        this.jInternalFrameOrderByTipoProcesoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProcesoProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProcesoProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProcesoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProcesoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProcesoProdu.setVisible(false);
	        this.jInternalFrameImportacionTipoProcesoProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProcesoProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProcesoProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProcesoProdu(true);
			//this.isEsNuevoTipoProcesoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProcesoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoProdu(false) ;
			
			if(tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado() && PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoDetaProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProcesoProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProcesoProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProcesoProdu(true);
			//this.isEsNuevoTipoProcesoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprocesoprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProcesoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProcesoProdu(false) ;
			
			if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProcesoProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoProdu(false);
			
			//if(!this.isEsNuevoTipoProcesoProdu) {								
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprocesoprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProcesoProdu=true;
					this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
					this.isEsNuevoTipoProcesoProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProcesoProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProcesoProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoProdu(false);
			
												
				
				if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProcesoProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProcesoProduActionPerformed(evt,tipoprocesoproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProcesoProdu(this.tipoprocesoprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprocesoproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprocesoprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesoprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprocesoprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprocesoprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProcesoProduModel) this.jTableDatosTipoProcesoProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProcesoProdu=true;
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
				this.isEsNuevoTipoProcesoProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProcesoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(false);
				
				this.habilitarDeshabilitarControlesTipoProcesoProdu(false);
				
				
				
				if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProcesoProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProcesoProdu.getRowCount()>=1) {
				jTableDatosTipoProcesoProdu.removeRowSelectionInterval(0, jTableDatosTipoProcesoProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProcesoProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProcesoProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(false) ;
			
			this.isEsNuevoTipoProcesoProdu=false;
			
			if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProcesoProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProcesoProdu(false);
				
				//SI ES MANUAL
				if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProcesoProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProcesoProdu--;			
			//TipoProcesoProdu tipoprocesoproduAux= new TipoProcesoProdu();			
			//tipoprocesoproduAux.setId(this.iIdNuevoTipoProcesoProdu);
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProcesoProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
			
			this.tipoprocesoprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprocesoproduLogic.getTipoProcesoProdus().add(this.tipoprocesoproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprocesoprodus.add(this.tipoprocesoproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			
			this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(this.getIndiceNuevoTipoProcesoProdu(), this.getIndiceNuevoTipoProcesoProdu());
			
			int iLastRow =  this.jTableDatosTipoProcesoProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProcesoProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProcesoProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoProdu();
			}
			
			//this.abrirFrameTreeTipoProcesoProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Proceso ProduccionS ?", "MANTENIMIENTO DE Tipo Proceso Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProcesoProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProcesoProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprocesoproduReturnGeneral=tipoprocesoproduLogic.procesarImportacionTipoProcesoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprocesoproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProcesoProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProcesoProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProcesoProdu.setFileImportacion(this.jInternalFrameImportacionTipoProcesoProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProcesoProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProcesoProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProcesoProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProcesoProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		

		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProcesoProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProcesoProduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProcesoProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProcesoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoprodu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprocesoprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoProcesoProdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProcesoProdu(tipoprocesoproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProcesoProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProcesoProdu(false);
			
			//SI ES MANUAL
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProcesoProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProcesoProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProcesoProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProcesoProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProcesoProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProcesoProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProcesoProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProcesoProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProcesoProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProcesoProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProcesoProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProcesoProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProcesoProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProcesoProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProcesoProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProcesoProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProcesoProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProcesoProdu();
		
		this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProcesoProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProcesoProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProcesoProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionNuevoTipoProcesoProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionSinCerrarTipoProcesoProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionSinMensajeTipoProcesoProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProcesoProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProcesoProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionNuevoTipoProcesoProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionSinCerrarTipoProcesoProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProcesoProdu.jCheckBoxPostAccionSinMensajeTipoProcesoProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProcesoProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProcesoProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProcesoProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProcesoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProcesoProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProcesoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProcesoProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProcesoProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProcesoProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProcesoProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProcesoProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProcesoProdu() throws Exception {
		try	{
			if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProcesoProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProcesoProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProcesoProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProcesoProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProcesoProdu.addItem(reporte);
			}
			
			
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProcesoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProcesoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProcesoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProcesoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProcesoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProcesoProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProcesoProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProcesoProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProcesoProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProcesoProdu(Boolean esInicializar) throws Exception {				
		if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProcesoProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProcesoProdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProcesoProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProcesoProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProcesoProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprocesoproduLogic.getTipoProcesoProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprocesoprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProcesoProdu.setModel(new TipoProcesoProduModel(this.tipoprocesoproduLogic.getTipoProcesoProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProcesoProdu.setModel(new TipoProcesoProduModel(this.tipoprocesoprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProcesoProdu!=null && this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProcesoProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,tipoprocesoproduConstantesFunciones.resaltarSeleccionarTipoProcesoProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,tipoprocesoproduConstantesFunciones.resaltarSeleccionarTipoProcesoProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,TipoProcesoProduConstantesFunciones.LABEL_ID));

		if(this.tipoprocesoproduConstantesFunciones.mostraridTipoProcesoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprocesoproduConstantesFunciones.resaltaridTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activaridTipoProcesoProdu,this,true,"idTipoProcesoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoproduConstantesFunciones.resaltaridTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activaridTipoProcesoProdu,this,true,"idTipoProcesoProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoprocesoproduConstantesFunciones.mostrarid_empresaTipoProcesoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoprocesoproduConstantesFunciones.resaltarid_empresaTipoProcesoProdu,this,this.tipoprocesoproduConstantesFunciones.activarid_empresaTipoProcesoProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoprocesoproduConstantesFunciones.resaltarid_empresaTipoProcesoProdu,this,this.tipoprocesoproduConstantesFunciones.activarid_empresaTipoProcesoProdu,false,"id_empresaTipoProcesoProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,TipoProcesoProduConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprocesoproduConstantesFunciones.mostrarnombreTipoProcesoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesoproduConstantesFunciones.resaltarnombreTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activarnombreTipoProcesoProdu,this,true,"nombreTipoProcesoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoproduConstantesFunciones.resaltarnombreTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activarnombreTipoProcesoProdu,this,true,"nombreTipoProcesoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoprocesoproduConstantesFunciones.mostrardescripcionTipoProcesoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprocesoproduConstantesFunciones.resaltardescripcionTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activardescripcionTipoProcesoProdu,this,true,"descripcionTipoProcesoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprocesoproduConstantesFunciones.resaltardescripcionTipoProcesoProdu,this.tipoprocesoproduConstantesFunciones.activardescripcionTipoProcesoProdu,this,true,"descripcionTipoProcesoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProcesoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoDetaProdu && this.tipoprocesoproduConstantesFunciones.mostrarPedidoDetaProduTipoProcesoProdu && !TipoProcesoProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Detalle Producciones");
				tableColumn.setHeaderValue("Pedido Detalle Producciones");
				tableColumn.setCellRenderer(new PedidoDetaProduTableCell(tipoprocesoproduConstantesFunciones.resaltarPedidoDetaProduTipoProcesoProdu,this,this.tipoprocesoproduConstantesFunciones.activarPedidoDetaProduTipoProcesoProdu));
				tableColumn.setCellEditor(new PedidoDetaProduTableCell(tipoprocesoproduConstantesFunciones.resaltarPedidoDetaProduTipoProcesoProdu,this,this.tipoprocesoproduConstantesFunciones.activarPedidoDetaProduTipoProcesoProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProcesoProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProcesoProdu.moveColumn(this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProcesoProdu.moveColumn(this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProcesoProdu.moveColumn(this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProcesoProdu.moveColumn(this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProcesoProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProcesoProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProcesoProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProcesoProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProcesoProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProcesoProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprocesoproduLogic.getTipoProcesoProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprocesoprodus.size()-1;
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
		//this.jTableDatosTipoProcesoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProcesoProdu();
			
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
				
				//this.isEsNuevoTipoProcesoProdu=false;
					
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
				if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprocesoprodu.getsType().equals("DUPLICADO")
				   || this.tipoprocesoprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProcesoProdu=true;
				
				} else {
					this.isEsNuevoTipoProcesoProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprocesoprodu.getId()>=0 && !this.tipoprocesoprodu.getIsNew()) {						
						this.isEsNuevoTipoProcesoProdu=false;
						
					} else {
						this.isEsNuevoTipoProcesoProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProcesoProdu(esRelaciones);						
				
				this.seleccionarTipoProcesoProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprocesoprodu.getId()<0) {
					this.isEsNuevoTipoProcesoProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProcesoProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProcesoProdu(evt,rowIndex);
				}	
				
				if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProcesoProdu: " + this.dDif); 
					}
				}								
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProcesoProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprocesoprodu)) {
					if(this.tipoprocesoprodu.getId()>0) {
						this.tipoprocesoprodu.setIsDeleted(true);
						
						this.tipoprocesoprodusEliminados.add(this.tipoprocesoprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprocesoproduLogic.getTipoProcesoProdus().remove(this.tipoprocesoprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodus.remove(this.tipoprocesoprodu);				
					}
					
					
					((TipoProcesoProduModel) this.jTableDatosTipoProcesoProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProcesoProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProcesoProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProcesoProdu) {
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProcesoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProcesoProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoprocesoproduConstantesFunciones.cargarid_empresaTipoProcesoProdu || this.tipoprocesoproduConstantesFunciones.event_dependid_empresaTipoProcesoProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoprocesoprodu.getid_empresa());
									//this.inicializarActualizarBindingTipoProcesoProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoprocesoprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoprocesoprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoprocesoprodu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProcesoProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProcesoProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProcesoProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProcesoProdu(tipoprocesoprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProcesoProdu(tipoprocesoprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProcesoProdu(tipoprocesoprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoProdu(tipoprocesoprodu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setText(tipoprocesoprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setText(tipoprocesoprodu.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setText(tipoprocesoprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProcesoProdu tipoprocesoproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprocesoproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProcesoProdu tipoprocesoproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprocesoproduLocal=this.tipoprocesoprodu;
			} else {
				tipoprocesoproduLocal=this.tipoprocesoproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprocesoproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProcesoProdu(tipoprocesoproduLocal,true);
					
					if(tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprocesoproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprocesoproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoProdu(tipoprocesoprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(tipoprocesoprodu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProcesoProdu(tipoprocesoprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.getText()==null || this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.getText()=="" || this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setText("0");
			}

			if(conColumnasBase) {tipoprocesoprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelIdTipoProcesoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesoprodu.setnombre(this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabelnombreTipoProcesoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprocesoprodu.setdescripcion(this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProcesoProdu.jLabeldescripcionTipoProcesoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProcesoProdu(TipoProcesoProdu tipoprocesoproduBean,TipoProcesoProdu tipoprocesoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProcesoProdu(TipoProcesoProdu tipoprocesoproduOrigen,TipoProcesoProdu tipoprocesoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesoproduOrigen.getId()!=null && !tipoprocesoproduOrigen.getId().equals(0L))) {tipoprocesoprodu.setId(tipoprocesoproduOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprocesoproduOrigen.getnombre()!=null && !tipoprocesoproduOrigen.getnombre().equals(""))) {tipoprocesoprodu.setnombre(tipoprocesoproduOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoprocesoproduOrigen.getdescripcion()!=null && !tipoprocesoproduOrigen.getdescripcion().equals(""))) {tipoprocesoprodu.setdescripcion(tipoprocesoproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setText(tipoprocesoprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setText(tipoprocesoprodu.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setText(tipoprocesoprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProcesoProdu(TipoProcesoProduBean tipoprocesoproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setText(tipoprocesoproduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setText(tipoprocesoproduBean.getnombre());
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setText(tipoprocesoproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProcesoProdu(TipoProcesoProduParameterReturnGeneral tipoprocesoproduReturnGeneral,TipoProcesoProduBean tipoprocesoproduBean,Boolean conDefault) throws Exception { 
		try {
			TipoProcesoProdu tipoprocesoproduLocal=new TipoProcesoProdu();
			
			tipoprocesoproduLocal=tipoprocesoproduReturnGeneral.getTipoProcesoProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprocesoproduLocal.getId()!=null && !tipoprocesoproduLocal.getId().equals(0L))) {tipoprocesoproduBean.setId(tipoprocesoproduLocal.getId());}}
			if(conDefault || (!conDefault && tipoprocesoproduLocal.getnombre()!=null && !tipoprocesoproduLocal.getnombre().equals(""))) {tipoprocesoproduBean.setnombre(tipoprocesoproduLocal.getnombre());}
			if(conDefault || (!conDefault && tipoprocesoproduLocal.getdescripcion()!=null && !tipoprocesoproduLocal.getdescripcion().equals(""))) {tipoprocesoproduBean.setdescripcion(tipoprocesoproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProcesoProduGenerico(Long idTipoProcesoProduSeleccionado,JComboBox jComboBoxTipoProcesoProdu,List<TipoProcesoProdu> tipoprocesoprodusLocal)throws Exception {
		try {
			TipoProcesoProdu  tipoprocesoproduTemp=null;

			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusLocal) {
				if(tipoprocesoproduAux.getId()!=null && tipoprocesoproduAux.getId().equals(idTipoProcesoProduSeleccionado)) {
					tipoprocesoproduTemp=tipoprocesoproduAux;
					break;
				}
			}

			jComboBoxTipoProcesoProdu.setSelectedItem(tipoprocesoproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProcesoProduGenerico(JComboBox jComboBoxTipoProcesoProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProcesoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProcesoProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProcesoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProcesoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProcesoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoDetaProdu")) {
			jButtonPedidoDetaProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoprodu=(TipoProcesoProdu) tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesoprodu =(TipoProcesoProdu) tipoprocesoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoprocesoprodu.getIsNew() && !tipoprocesoprodu.getIsChanged() && !tipoprocesoprodu.getIsDeleted()) {
				sDescripcion=tipoprocesoprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprocesoprodu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProcesoProdu tipoprocesoproduRow=new TipoProcesoProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoproduRow=(TipoProcesoProdu) tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprocesoproduRow=(TipoProcesoProdu) tipoprocesoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoDetaProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProcesoProdu tipoprocesoprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoprodu = (TipoProcesoProdu)this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprocesoprodu = (TipoProcesoProdu)this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprocesoprodu!=null) {
						this.tipoprocesoprodu = tipoprocesoprodu;
					} else {
						this.tipoprocesoprodu = new TipoProcesoProdu();
					}
				}

				if(this.isTienePermisosPedidoDetaProdu && this.permiteMantenimiento(this.tipoprocesoprodu)) {
					PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup=new PedidoDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidodetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup;
					} else {
						pedidodetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame;
					}

					List<TipoProcesoProdu> tipoprocesoprodus=new ArrayList<TipoProcesoProdu>();
					tipoprocesoprodus.add(this.tipoprocesoprodu);
					if(!esRelacionado) {
						//pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setConGuardarRelaciones(false);
						//pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidodetaproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProcesoProdu.cargarPedidoDetaProduBeanSwingJInternalFrame(tipoprocesoprodus,this.tipoprocesoprodu,pedidodetaproduBeanSwingJInternalFrame,/*conInicializar,*/pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getConGuardarRelaciones(),pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado());
					pedidodetaproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("no_relacionado");

						pedidodetaproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoDetaProduConstantesFunciones.ITAMANIOFILATABLA + (PedidoDetaProduConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidodetaproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProcesoProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoProdu.getBorder();
						TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.getBorder();

						titledBorderPedidoDetaProdu.setTitle(titledBorderTipoProcesoProdu.getTitle() + " -> Pedido Detalle Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidodetaproduBeanSwingJInternalFrame);
						}

						pedidodetaproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidodetaproduBeanSwingJInternalFrame);

						pedidodetaproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Detalle Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProcesoProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));			
			this.jButtonDuplicarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoProdu && this.isPermisoDuplicarTipoProcesoProdu));			
			this.jButtonCopiarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoProdu && this.isPermisoCopiarTipoProcesoProdu));
			this.jButtonVerFormTipoProcesoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoProdu && this.isPermisoVerFormTipoProcesoProdu));
			
			this.jButtonAbrirOrderByTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));			
			
			this.jButtonNuevoRelacionesTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));			
			this.jButtonNuevoGuardarCambiosTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoProdu && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoProdu && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoProdu && this.isPermisoEliminarTipoProcesoProdu));
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoProdu);							
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));						
			this.jButtonDuplicarToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoProdu && this.isPermisoDuplicarTipoProcesoProdu));						
			this.jButtonCopiarToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoProdu && this.isPermisoCopiarTipoProcesoProdu));			
			this.jButtonVerFormToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoProdu && this.isPermisoVerFormTipoProcesoProdu));			
			this.jButtonAbrirOrderByToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));
			this.jButtonNuevoRelacionesToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));			
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoProdu && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoProdu  && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoProdu && this.isPermisoEliminarTipoProcesoProdu));
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarToolBarTipoProcesoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoProdu);				
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));			
			this.jMenuItemDuplicarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoProcesoProdu && this.isPermisoDuplicarTipoProcesoProdu));			
			this.jMenuItemCopiarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaCopiarTipoProcesoProdu && this.isPermisoCopiarTipoProcesoProdu));			
			this.jMenuItemVerFormTipoProcesoProdu.setVisible((this.isVisibilidadCeldaVerFormTipoProcesoProdu && this.isPermisoVerFormTipoProcesoProdu));			
			this.jMenuItemAbrirOrderByTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));			
			//this.jMenuItemMostrarOcultarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));
			this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaOrdenTipoProcesoProdu && this.isPermisoOrdenTipoProcesoProdu));			
			this.jMenuItemNuevoRelacionesTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu));			
			this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu.setVisible((this.isVisibilidadCeldaNuevoTipoProcesoProdu && this.isPermisoNuevoTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));									
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemModificarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaModificarTipoProcesoProdu && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemActualizarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaActualizarTipoProcesoProdu && this.isPermisoActualizarTipoProcesoProdu));	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemEliminarTipoProcesoProdu.setVisible((this.isVisibilidadCeldaEliminarTipoProcesoProdu && this.isPermisoEliminarTipoProcesoProdu));
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemCancelarTipoProcesoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoProdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));						
			this.jMenuItemGuardarCambiosTablaTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=this.jButtonNuevoTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProcesoProdu=this.jButtonDuplicarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoProcesoProdu=this.jButtonCopiarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoProcesoProdu=this.jButtonVerFormTipoProcesoProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProcesoProdu=this.jButtonAbrirOrderByTipoProcesoProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=this.jButtonNuevoRelacionesTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaModificarTipoProcesoProdu=this.jButtonModificarTipoProcesoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=this.jButtonGuardarCambiosTablaTipoProcesoProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=this.jButtonNuevoToolBarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=this.jButtonNuevoRelacionesToolBarTipoProcesoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarToolBarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarToolBarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarToolBarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarToolBarTipoProcesoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoProdu=this.jButtonGuardarCambiosToolBarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=this.jMenuItemNuevoTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=this.jMenuItemNuevoRelacionesTipoProcesoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.isVisibilidadCeldaModificarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemModificarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemActualizarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemEliminarTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemCancelarTipoProcesoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProcesoProdu=this.jMenuItemGuardarCambiosTipoProcesoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=this.jMenuItemGuardarCambiosTablaTipoProcesoProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProcesoProdu(Boolean esInicializar) {
		if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProcesoProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProcesoProdu() {
		this.jButtonNuevoTipoProcesoProdu.setVisible(this.isPermisoNuevoTipoProcesoProdu);			
		this.jButtonDuplicarTipoProcesoProdu.setVisible(this.isPermisoDuplicarTipoProcesoProdu);			
		this.jButtonCopiarTipoProcesoProdu.setVisible(this.isPermisoCopiarTipoProcesoProdu);			
		this.jButtonVerFormTipoProcesoProdu.setVisible(this.isPermisoVerFormTipoProcesoProdu);			
		
		this.jButtonAbrirOrderByTipoProcesoProdu.setVisible(this.isPermisoOrdenTipoProcesoProdu);					
		
		this.jButtonNuevoRelacionesTipoProcesoProdu.setVisible(this.isPermisoNuevoTipoProcesoProdu);			
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarTipoProcesoProdu.setVisible(this.isPermisoActualizarTipoProcesoProdu);	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.setVisible(this.isPermisoActualizarTipoProcesoProdu);	
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.setVisible(this.isPermisoEliminarTipoProcesoProdu);
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoProdu);						
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.setVisible(this.isPermisoGuardarCambiosTipoProcesoProdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.setVisible(this.isPermisoActualizarTipoProcesoProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoProdu() {
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarTipoProcesoProdu.setVisible(this.isPermisoActualizarTipoProcesoProdu);	
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.setVisible(this.isPermisoActualizarTipoProcesoProdu);	
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.setVisible(this.isPermisoEliminarTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.setVisible(this.isVisibilidadCeldaCancelarTipoProcesoProdu);							
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.setVisible((this.isVisibilidadCeldaGuardarTipoProcesoProdu && this.isPermisoGuardarCambiosTipoProcesoProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProcesoProdu() {
		if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProcesoProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProcesoProdu() {
	}
	
	public void jTableDatosTipoProcesoProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProcesoProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProcesoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.gettipoprocesoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoprodu==null) {
						this.tipoprocesoprodu = new TipoProcesoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				}

				if(this.tipoprocesoprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprocesoprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoProcesoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoProcesoProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoProcesoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoProcesoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.gettipoprocesoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoprocesoproduLogic.getConnexion());

				if(this.tipoprocesoprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoprocesoprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoProcesoProdu=(TitledBorder)this.jScrollPanelDatosTipoProcesoProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoProcesoProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoProcesoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.gettipoprocesoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoprodu==null) {
						this.tipoprocesoprodu = new TipoProcesoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				}

				if(this.tipoprocesoprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoprocesoprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProcesoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.gettipoprocesoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoprodu==null) {
						this.tipoprocesoprodu = new TipoProcesoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				}

				if(this.tipoprocesoprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprocesoprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoProcesoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.gettipoprocesoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprocesoprodu==null) {
						this.tipoprocesoprodu = new TipoProcesoProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);
				}

				if(this.tipoprocesoprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoprocesoprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProcesoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoProcesoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);

			this.getTipoProcesoProdusFK_IdEmpresa();

			this.inicializarActualizarBindingTipoProcesoProdu(false);

			//if(TipoProcesoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprocesoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProcesoProdu() {
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProcesoProdu.dispose();
			this.jInternalFrameDetalleFormTipoProcesoProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
			this.jInternalFrameReporteDinamicoTipoProcesoProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProcesoProdu.dispose();
			this.jInternalFrameReporteDinamicoTipoProcesoProdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoProcesoProdu!=null) {
			this.jInternalFrameImportacionTipoProcesoProdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProcesoProdu.dispose();
			this.jInternalFrameImportacionTipoProcesoProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProcesoProdu();
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProcesoProdu")) {
				jButtonDuplicarTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProcesoProdu")) {
				jButtonCopiarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProcesoProdu")) {
				jButtonVerFormTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProcesoProdu")) {
				jButtonDuplicarTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProcesoProdu")) {
				jButtonDuplicarTipoProcesoProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProcesoProdu")) {
				jButtonModificarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProcesoProdu")) {
				jButtonModificarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProcesoProdu")) {
				jButtonModificarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProcesoProdu")) {
				jButtonActualizarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProcesoProdu")) {
				jButtonActualizarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProcesoProdu")) {
				jButtonActualizarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProcesoProdu")) {
				jButtonEliminarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProcesoProdu")) {
				jButtonEliminarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProcesoProdu")) {
				jButtonEliminarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProcesoProdu")) {
				jButtonCancelarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProcesoProdu")) {
				jButtonCancelarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProcesoProdu")) {
				jButtonCancelarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProcesoProdu")) {
				jButtonCerrarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProcesoProdu")) {
				jButtonCerrarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProcesoProdu")) {
				jButtonCerrarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProcesoProdu")) {
				jButtonMostrarOcultarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProcesoProdu")) {
				jButtonCancelarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProcesoProdu")) {
				jButtonCopiarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProcesoProdu")) {
				jButtonVerFormTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProcesoProdu")) {
				jButtonCopiarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProcesoProdu")) {
				jButtonVerFormTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProcesoProdu")) {
				jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProcesoProdu")) {
				jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProcesoProdu")) {
				jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProcesoProdu")) {
				jButtonAnterioresTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProcesoProdu")) {
				jButtonAnterioresTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProcesoProdu")) {
				jButtonAnterioresTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProcesoProdu")) {
				jButtonSiguientesTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProcesoProdu")) {
				jButtonSiguientesTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProcesoProdu")) {
				jButtonSiguientesTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProcesoProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProcesoProdu")) {
				jButtonAbrirOrderByTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProcesoProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProcesoProdu")) {
				jButtonMostrarOcultarTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProcesoProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProcesoProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProcesoProdu")) {
				jButtonCerrarReporteDinamicoTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProcesoProdu")) {
				jButtonGenerarReporteDinamicoTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProcesoProdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProcesoProdu")) {
				jButtonCerrarImportacionTipoProcesoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProcesoProdu")) {
				
				jButtonGenerarImportacionTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProcesoProdu")) {
				
				jButtonAbrirImportacionTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProcesoProdu")) {
				jComboBoxTiposAccionesTipoProcesoProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProcesoProdu")) {
				jComboBoxTiposRelacionesTipoProcesoProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProcesoProdu")) {
				jComboBoxTiposAccionesTipoProcesoProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProcesoProdu")) {
				
				jComboBoxTiposSeleccionarTipoProcesoProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProcesoProdu")) {
				jTextFieldValorCampoGeneralTipoProcesoProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProcesoProdu")) {
				jButtonAbrirOrderByTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProcesoProdu")) {
				jButtonAbrirOrderByTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProcesoProdu")) {
				jButtonCerrarOrderByTipoProcesoProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoProduBusqueda")) {
				this.jButtonidTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoProduUpdate")) {
				this.jButtonid_empresaTipoProcesoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoProduBusqueda")) {
				this.jButtonid_empresaTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoProduBusqueda")) {
				this.jButtonnombreTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProcesoProduBusqueda")) {
				this.jButtondescripcionTipoProcesoProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProcesoProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProcesoProdu tipoprocesoproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprocesoproduLocal=this.tipoprocesoprodu;
			} else {
				tipoprocesoproduLocal=this.tipoprocesoproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
							
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
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
			
			


			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
								
						
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
								
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
							
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
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
			
			


			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
								
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProcesoProdu")) {
					jCheckBoxSeleccionarTodosTipoProcesoProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProcesoProdu")) {
					jCheckBoxSeleccionadosTipoProcesoProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProcesoProdu")) {
					
				}
				
				


				
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
												
				
				


				
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
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
			
			


			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProcesoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprocesoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprocesoprodu);
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
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
				
				


				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProcesoProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProcesoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProcesoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprocesoproduAnterior =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProcesoProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProcesoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProcesoProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprocesoprodu =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprocesoprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProcesoProdu")) {
				
				}
				
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProcesoProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProcesoProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProcesoProdu")) {
			
			}
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProcesoProdu();
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProcesoProdu")) {
				jButtonDuplicarTipoProcesoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProcesoProdu")) {
				jButtonCopiarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProcesoProdu")) {
				jButtonVerFormTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProcesoProdu")) {
				jButtonNuevoTipoProcesoProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProcesoProdu")) {
				jButtonModificarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProcesoProdu")) {
				jButtonActualizarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProcesoProdu")) {
				jButtonEliminarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProcesoProdu")) {
				jButtonCancelarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProcesoProdu")) {
				jButtonCerrarTipoProcesoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProcesoProdu")) {
				jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProcesoProdu")) {
				jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProcesoProdu")) {
				jButtonAbrirOrderByTipoProcesoProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProcesoProdu")) {
				jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProcesoProdu")) {
				jButtonAnterioresTipoProcesoProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProcesoProdu")) {
				jButtonSiguientesTipoProcesoProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProcesoProduBusqueda")) {
				this.jButtonidTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoProduUpdate")) {
				this.jButtonid_empresaTipoProcesoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProcesoProduBusqueda")) {
				this.jButtonid_empresaTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProcesoProduBusqueda")) {
				this.jButtonnombreTipoProcesoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProcesoProduBusqueda")) {
				this.jButtondescripcionTipoProcesoProduBusquedaActionPerformed(evt);
			}
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProcesoProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProcesoProdu")) {
				closingInternalFrameTipoProcesoProdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoProcesoProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProcesoProdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProcesoProduBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProcesoProduActionPerformed(null);
			}
			
			TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprocesoprodu,new Object(),this.tipoprocesoproduParameterGeneral,this.tipoprocesoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProcesoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProcesoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProcesoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprocesoprodu)) {
			if(!esControlTabla) {
				if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);			
				}
				
				if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesoproduReturnGeneral=tipoprocesoproduLogic.procesarEventosTipoProcesoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoproduLogic.getTipoProcesoProdus(),this.tipoprocesoprodu,this.tipoprocesoproduParameterGeneral,this.isEsNuevoTipoProcesoProdu,classes);//this.tipoprocesoproduLogic.getTipoProcesoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProcesoProdu(this.tipoprocesoproduReturnGeneral,this.tipoprocesoproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoProdu(classes,this.tipoprocesoproduReturnGeneral,this.tipoprocesoproduBean,false);
					}
						
					if(this.tipoprocesoproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu());	
					}
						
					if(this.tipoprocesoproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu(),classes);//this.tipoprocesoproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProcesoProdu(this.tipoprocesoprodu,classes);//this.tipoprocesoproduBean);									
				}
			
				if(TipoProcesoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProcesoProdu(this.tipoprocesoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProcesoProdu(this.tipoprocesoprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprocesoproduAnterior!=null) {
						this.tipoprocesoprodu=this.tipoprocesoproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprocesoproduReturnGeneral=tipoprocesoproduLogic.procesarEventosTipoProcesoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoproduLogic.getTipoProcesoProdus(),this.tipoprocesoprodu,this.tipoprocesoproduParameterGeneral,this.isEsNuevoTipoProcesoProdu,classes);//this.tipoprocesoproduLogic.getTipoProcesoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprocesoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprocesoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu(),tipoprocesoproduLogic.getTipoProcesoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu(),this.tipoprocesoprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProcesoProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProcesoProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProcesoProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProcesoProdu() throws Exception {
		
		TipoProcesoProduModel tipoprocesoproduModel=(TipoProcesoProduModel)this.jTableDatosTipoProcesoProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprocesoproduModel.tipoprocesoprodus=this.tipoprocesoproduLogic.getTipoProcesoProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprocesoproduModel.tipoprocesoprodus=this.tipoprocesoprodus;
		}
		
		
		((TipoProcesoProduModel) this.jTableDatosTipoProcesoProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProcesoProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprocesoproduAnterior(),this.tipoprocesoproduLogic.getTipoProcesoProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprocesoproduAnterior(),this.tipoprocesoprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProcesoProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(tipoprocesoprodu.getPedidoDetaProdus());
					this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
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
										
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoprodu,new Object(),generalEntityParameterGeneral,this.tipoprocesoproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProcesoProduConstantesFunciones.getClassesRelationshipsOfTipoProcesoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProcesoProduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProcesoProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProcesoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProcesoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprocesoprodu,new Object(),generalEntityParameterGeneral,this.tipoprocesoproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProcesoProdu(TipoProcesoProduBean tipoprocesoproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(tipoprocesoprodu.getPedidoDetaProdus());
					this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProcesoProdu(ArrayList<Classe> classes,TipoProcesoProduReturnGeneral tipoprocesoproduReturnGeneral,TipoProcesoProduBean tipoprocesoproduBean,Boolean conDefault) throws Exception {
		
			this.tipoprocesoproduBean.setPedidoDetaProdus(tipoprocesoproduReturnGeneral.getTipoProcesoProdu().getPedidoDetaProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					tipoprocesoprodu.setPedidoDetaProdus(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprocesoprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProcesoProdu = new TipoProcesoProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesoproduSessionBean.getConGuardarRelaciones(),this.tipoprocesoproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoProcesoProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.tipoprocesoproduLogic=this.tipoprocesoproduLogic;
		
		this.cargarCombosFrameForeignKeyTipoProcesoProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProcesoProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProcesoProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProcesoProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProcesoProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoProdu"));
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoProdu"));

		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoProdu"));
					
		this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemModificarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoProdu"));
						
		this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemActualizarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoProdu"));
								
		this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemEliminarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoProdu"));
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoProdu"));
					
		this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemCancelarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemDetalleCerrarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonidTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonnombreTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtondescripcionTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProcesoProdu"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProcesoProdu"));
		}
		
		this.jTableDatosTipoProcesoProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProcesoProdu"));
		
		this.jTableDatosTipoProcesoProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProcesoProdu"));
		
		this.jButtonNuevoTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"NuevoTipoProcesoProdu"));
		
		this.jButtonDuplicarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoProcesoProdu"));
		
		this.jButtonCopiarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"CopiarTipoProcesoProdu"));
		
		this.jButtonVerFormTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"VerFormTipoProcesoProdu"));
		
		
		this.jButtonNuevoToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProcesoProdu"));
			
		this.jButtonDuplicarToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProcesoProdu"));
			
		this.jMenuItemNuevoTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProcesoProdu"));
			
		this.jMenuItemDuplicarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProcesoProdu"));		
		
		
		this.jButtonNuevoRelacionesTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProcesoProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProcesoProdu"));
			
		this.jMenuItemNuevoRelacionesTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProcesoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoProcesoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonModificarToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProcesoProdu"));
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemModificarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProcesoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoProcesoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonActualizarToolBarTipoProcesoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProcesoProdu"));
				
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemActualizarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProcesoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoProcesoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonEliminarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProcesoProdu"));
						
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemEliminarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProcesoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoProcesoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonCancelarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProcesoProdu"));
			
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemCancelarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProcesoProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProcesoProdu"));		
		
		
		this.jButtonCerrarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CerrarTipoProcesoProdu"));
		
		
		this.jButtonCerrarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProcesoProdu"));
			
		this.jMenuItemCerrarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProcesoProdu"));
			
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jMenuItemDetalleCerrarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProcesoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProcesoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProcesoProdu"));
		}
		
		this.jButtonCopiarToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProcesoProdu"));
			
		this.jButtonVerFormToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProcesoProdu"));
		
		this.jMenuItemGuardarCambiosTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProcesoProdu"));
			
		this.jMenuItemCopiarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProcesoProdu"));		
		
		this.jMenuItemVerFormTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProcesoProdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProcesoProdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProcesoProdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProcesoProdu"));
					
		this.jButtonRecargarInformacionToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProcesoProdu"));
		
		this.jMenuItemRecargarInformacionTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProcesoProdu"));		
		
		
		
		this.jButtonAnterioresTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoProcesoProdu"));
		
		
		this.jButtonAnterioresToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProcesoProdu"));
		
		this.jMenuItemAnterioresTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProcesoProdu"));		
		
		
		this.jButtonSiguientesTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoProcesoProdu"));
		
		
		this.jButtonSiguientesToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProcesoProdu"));
			
		this.jMenuItemSiguientesTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProcesoProdu"));
			
		this.jMenuItemAbrirOrderByTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProcesoProdu"));
			
		this.jMenuItemMostrarOcultarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProcesoProdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProcesoProdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProcesoProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProcesoProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProcesoProdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProcesoProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProcesoProdu"));

		this.jCheckBoxSeleccionadosTipoProcesoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProcesoProdu"));
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProcesoProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProcesoProdu"));
			
		this.jComboBoxTiposAccionesTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProcesoProdu"));
					
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProcesoProdu"));
			
		this.jTextFieldValorCampoGeneralTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProcesoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonidTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonnombreTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtondescripcionTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProcesoProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoProdu"));
				this.jInternalFrameReporteDinamicoTipoProcesoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProcesoProdu"));				
			//this.jButtonGenerarReporteDinamicoTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProcesoProdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProcesoProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProcesoProdu!=null) {
				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProcesoProdu"));
				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProcesoProdu"));
				this.jInternalFrameImportacionTipoProcesoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProcesoProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProcesoProdu"));
			
			this.jButtonAbrirOrderByToolBarTipoProcesoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProcesoProdu"));			
			
			if(this.jInternalFrameOrderByTipoProcesoProdu!=null) {
				this.jInternalFrameOrderByTipoProcesoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProcesoProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProcesoProdu.jTabbedPaneRelacionesTipoProcesoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProcesoProdu"));
		
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
            		closingInternalFrameTipoProcesoProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProcesoProdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoProcesoProduBeanSwingJInternalFrame jInternalFrameParent=(TipoProcesoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProcesoProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProcesoProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProcesoProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProcesoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProcesoProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProcesoProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProcesoProdu";
		inputMap = this.jButtonNuevoTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProcesoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProcesoProdu";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProcesoProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProcesoProdu";
		inputMap = this.jButtonModificarTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProcesoProdu";
		inputMap = this.jButtonActualizarTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProcesoProdu";
		inputMap = this.jButtonEliminarTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProcesoProdu";
		inputMap = this.jButtonCancelarTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProcesoProdu";
		inputMap = this.jButtonCerrarTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProcesoProdu";
		inputMap = this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonGuardarCambiosTipoProcesoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProcesoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProcesoProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProcesoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProcesoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProcesoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProcesoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProcesoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonidTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProcesoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonid_empresaTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtonnombreTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProcesoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProcesoProdu.jButtondescripcionTipoProcesoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProcesoProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProcesoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProcesoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProcesoProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProcesoProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProcesoProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
					tipoprocesoproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodus) {
					tipoprocesoproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProcesoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
						tipoprocesoproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodus) {
						tipoprocesoproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProcesoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProcesoProdu.getSelectedRows();
			
			TipoProcesoProdu tipoprocesoproduLocal=new TipoProcesoProdu();
			
			//this.seleccionarTodosTipoProcesoProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoproduLocal =(TipoProcesoProdu) this.tipoprocesoproduLogic.getTipoProcesoProdus().toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprocesoproduLocal =(TipoProcesoProdu) this.tipoprocesoprodus.toArray()[this.jTableDatosTipoProcesoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprocesoproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
						tipoprocesoproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodus) {
						tipoprocesoproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProcesoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProcesoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProcesoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProcesoProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProcesoProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProcesoProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProcesoProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoproduLogic.getTipoProcesoProdus()) {
				
						if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesoproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprocesoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodus) {
					
						if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprocesoproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprocesoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProcesoProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProcesoProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProcesoProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProcesoProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProcesoProdu(conSplash);
				
					this.generarReporteTipoProcesoProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProcesoProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProcesoProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoProdu();
				
				this.exportarTipoProcesoProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProcesoProdus();
				//this.importarTipoProcesoProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProcesoProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProcesoProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Proceso Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProcesoProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProcesoProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProcesoProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProcesoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxTiposAccionesFormularioTipoProcesoProdu.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProcesoProdu();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProcesoProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProcesoProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProcesoProdu();
			
			if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
			TipoProcesoProdu tipoprocesoprodu=new TipoProcesoProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProcesoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProcesoProdu.getSelectedItem();
			
			
			
			
			tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprocesoprodusSeleccionados.size()==1) {
				for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
					tipoprocesoprodu=tipoprocesoproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Detalle Produccion")) {
					jButtonPedidoDetaProduActionPerformed(null,rowIndex,true,false,tipoprocesoprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProcesoProdu();
			
      		//this.finishProcessTipoProcesoProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProcesoProduReturnGeneral() throws Exception {
		if(this.tipoprocesoproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesoproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprocesoproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprocesoproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprocesoproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprocesoproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProcesoProdu(false);
		}
		
		if(this.tipoprocesoproduReturnGeneral.getConRetornoLista() || this.tipoprocesoproduReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprocesoproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesoproduLogic.setTipoProcesoProdus(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprocesoproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprocesoproduLogic.setTipoProcesoProdu(this.tipoprocesoproduReturnGeneral.getTipoProcesoProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProcesoProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProcesoProdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoProcesoProdu> getTipoProcesoProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProcesoProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoproduLogic.getTipoProcesoProdus()) {
					if(tipoprocesoproduAux.getIsSelected()) {
						tipoprocesoprodusSeleccionados.add(tipoprocesoproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProcesoProdu tipoprocesoproduAux:this.tipoprocesoprodus) {
					if(tipoprocesoproduAux.getIsSelected()) {
						tipoprocesoprodusSeleccionados.add(tipoprocesoproduAux);				
					}
				}
			}
			
			if(tipoprocesoprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprocesoprodusSeleccionados.addAll(this.tipoprocesoproduLogic.getTipoProcesoProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprocesoprodusSeleccionados.addAll(this.tipoprocesoprodus);				
					}
				}
			}
		} else {
			tipoprocesoprodusSeleccionados.add(this.tipoprocesoprodu);
		}
		
		return tipoprocesoprodusSeleccionados;
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
	
	public void generarReporteTipoProcesoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProcesoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProcesoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProcesoProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProcesoProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Proceso Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProcesoProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProcesoProdu();
		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProcesoProdu();
		
		
		//this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados ,tipoprocesoproduImplementable,tipoprocesoproduImplementableHome);
	}
	
	public void mostrarImportacionTipoProcesoProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProcesoProdu();
		
		this.abrirFrameImportacionTipoProcesoProdu();		
		
			
		//this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados ,tipoprocesoproduImplementable,tipoprocesoproduImplementableHome);
	}
	
	public void importarTipoProcesoProdus() throws Exception {		
	
	}
	
	public void exportarTipoProcesoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProcesoProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProcesoProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProcesoProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Proceso Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProcesoProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProcesoProdu(tipoprocesoproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprocesoproduAux.setsDetalleGeneralEntityReporte(tipoprocesoproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProcesoProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProcesoProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoProduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprocesoprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoprodu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprocesoprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProcesoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProcesoProdu(row);				
				iRow++;
			}				
			
			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProcesoProdu(tipoprocesoproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProcesoProdusSeleccionados() throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();		
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprocesoprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprocesoprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprocesoprodu");
			//elementRoot.appendChild(element);
		
			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
				element = document.createElement("tipoprocesoprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProcesoProdu(tipoprocesoproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proceso Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProcesoProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoprodu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprocesoprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoProcesoProdu(TipoProcesoProdu tipoprocesoprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProcesoProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprocesoprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProcesoProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprocesoprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoProcesoProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoprocesoprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoProcesoProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprocesoprodu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoProcesoProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoprocesoprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoProcesoProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados=new ArrayList<TipoProcesoProdu>();
		
		tipoprocesoprodusSeleccionados=this.getTipoProcesoProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProcesoProdu(tipoprocesoprodusSeleccionados);
		
		this.generarReporteTipoProcesoProdus("Todos",tipoprocesoprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProcesoProdu(ArrayList<TipoProcesoProdu> tipoprocesoprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusSeleccionados) {
				tipoprocesoproduAux.setsDetalleGeneralEntityReporte(tipoprocesoproduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoprocesoproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprocesoproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoproduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoProcesoProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoprocesoproduAux.setsDescripcionGeneralEntityReporte1(tipoprocesoproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProcesoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProcesoProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProcesoProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=true;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=true;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=true;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
			this.isVisibilidadCeldaModificarTipoProcesoProdu=true;
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
			this.isVisibilidadCeldaCancelarTipoProcesoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProcesoProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=true;
		} else {
			this.actualizarEstadoPanelsTipoProcesoProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProcesoProdu=false;
			//this.isVisibilidadCeldaVerFormTipoProcesoProdu=false;
			this.isVisibilidadCeldaDuplicarTipoProcesoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprocesoproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprocesoproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;												
			}
			
			this.jButtonCerrarTipoProcesoProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProcesoProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprocesoprodu)) {
			this.isVisibilidadCeldaActualizarTipoProcesoProdu=false;
			this.isVisibilidadCeldaEliminarTipoProcesoProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProcesoProdu() {
		this.isVisibilidadCeldaNuevoTipoProcesoProdu=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProcesoProdu=false;
	}
	
	public void actualizarEstadoPanelsTipoProcesoProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProcesoProdu!=null) {
				this.jScrollPanelDatosEdicionTipoProcesoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProcesoProdu!=null) {
				this.jScrollPanelDatosTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProcesoProdu!=null) {
				this.jPanelPaginacionTipoProcesoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
					this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProcesoProdu!=null) {
				this.jTabbedPaneBusquedasTipoProcesoProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProcesoProdu!=null) {
				this.jPanelParametrosReportesTipoProcesoProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoProcesoProduParaPedidoDetaProdues() throws Exception {
		Boolean isPaginaPopupPedidoDetaProdu=false;

		try {

			if(this.tipoprocesoproduSessionBean==null) {
				this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setsPathNavegacionActual(tipoprocesoproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoDetaProdu=this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoDetaProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoDetaProdu(TipoProcesoProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoProdu(true);
			this.jInternalFrameDetalleFormTipoProcesoProdu.pedidodetaproduSessionBean.setlidTipoProcesoProduActual(this.idTipoProcesoProduActual);

			tipoprocesoproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProcesoProdu(true);
			tipoprocesoproduSessionBean.setlIdTipoProcesoProduActualForeignKey(this.idTipoProcesoProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProcesoProduSessionBean tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		
		if(this.tipoprocesoproduSessionBean==null) {
			this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		}
		
		this.tipoprocesoproduSessionBean.setsUltimaBusquedaTipoProcesoProdu(this.getsAccionBusqueda());
		this.tipoprocesoproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprocesoproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoprocesoproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProcesoProduSessionBean tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		
		if(this.tipoprocesoproduSessionBean==null) {
			this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		}
		
		if(this.tipoprocesoproduSessionBean.getsUltimaBusquedaTipoProcesoProdu()!=null&&!this.tipoprocesoproduSessionBean.getsUltimaBusquedaTipoProcesoProdu().equals("")) {
			this.setsAccionBusqueda(tipoprocesoproduSessionBean.getsUltimaBusquedaTipoProcesoProdu());
			this.setiNumeroPaginacion(tipoprocesoproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprocesoproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoprocesoproduSessionBean.getid_empresa());
				tipoprocesoproduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoprocesoproduSessionBean.setsUltimaBusquedaTipoProcesoProdu("");
		this.tipoprocesoproduSessionBean.setiNumeroPaginacion(TipoProcesoProduConstantesFunciones.INUMEROPAGINACION);
		this.tipoprocesoproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProcesoProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProcesoProdu() {
		this.updateBorderResaltarBusquedasFormularioTipoProcesoProdu();
		this.updateVisibilidadBusquedasFormularioTipoProcesoProdu();
		this.updateHabilitarBusquedasFormularioTipoProcesoProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProcesoProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProcesoProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProcesoProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProcesoProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProcesoProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProcesoProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProcesoProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoProcesoProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProcesoProdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProcesoProdu();
		this.updateVisibilidadResaltarControlesFormularioTipoProcesoProdu();
		this.updateHabilitarResaltarControlesFormularioTipoProcesoProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProcesoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprocesoproduConstantesFunciones.resaltaridTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setBorder(this.tipoprocesoproduConstantesFunciones.resaltaridTipoProcesoProdu);}
		if(this.tipoprocesoproduConstantesFunciones.resaltarid_empresaTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setBorder(this.tipoprocesoproduConstantesFunciones.resaltarid_empresaTipoProcesoProdu);}
		if(this.tipoprocesoproduConstantesFunciones.resaltarnombreTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setBorder(this.tipoprocesoproduConstantesFunciones.resaltarnombreTipoProcesoProdu);}
		if(this.tipoprocesoproduConstantesFunciones.resaltardescripcionTipoProcesoProdu!=null && this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setBorder(this.tipoprocesoproduConstantesFunciones.resaltardescripcionTipoProcesoProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProcesoProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostraridTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelidTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostraridTipoProcesoProdu);
		//this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrarid_empresaTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelid_empresaTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrarid_empresaTipoProcesoProdu);
		//this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrarnombreTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jPanelnombreTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrarnombreTipoProcesoProdu);
		//this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrardescripcionTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jPaneldescripcionTipoProcesoProdu.setVisible(this.tipoprocesoproduConstantesFunciones.mostrardescripcionTipoProcesoProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProcesoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProcesoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProcesoProdu!=null) {
	
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTextFieldidTipoProcesoProdu.setEnabled(this.tipoprocesoproduConstantesFunciones.activaridTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jComboBoxid_empresaTipoProcesoProdu.setEnabled(this.tipoprocesoproduConstantesFunciones.activarid_empresaTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreanombreTipoProcesoProdu.setEnabled(this.tipoprocesoproduConstantesFunciones.activarnombreTipoProcesoProdu);
		this.jInternalFrameDetalleFormTipoProcesoProdu.jTextAreadescripcionTipoProcesoProdu.setEnabled(this.tipoprocesoproduConstantesFunciones.activardescripcionTipoProcesoProdu);
		}
	}
	
		
}